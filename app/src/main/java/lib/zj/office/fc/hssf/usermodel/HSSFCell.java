package lib.zj.office.fc.hssf.usermodel;

import a0.a;
import a6.h;
import androidx.activity.r;
import androidx.appcompat.view.menu.d;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.ptg.ExpPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.model.InternalSheet;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.BlankRecord;
import lib.zj.office.fc.hssf.record.BoolErrRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.CommonObjectDataSubRecord;
import lib.zj.office.fc.hssf.record.DrawingRecord;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import lib.zj.office.fc.hssf.record.FormulaRecord;
import lib.zj.office.fc.hssf.record.HyperlinkRecord;
import lib.zj.office.fc.hssf.record.LabelSSTRecord;
import lib.zj.office.fc.hssf.record.NoteRecord;
import lib.zj.office.fc.hssf.record.NumberRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.SubRecord;
import lib.zj.office.fc.hssf.record.TextObjectRecord;
import lib.zj.office.fc.hssf.record.aggregates.FormulaRecordAggregate;
import lib.zj.office.fc.hssf.record.common.UnicodeString;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.usermodel.Comment;
import lib.zj.office.fc.ss.usermodel.ErrorConstants;
import lib.zj.office.fc.ss.usermodel.FormulaError;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.ICellStyle;
import lib.zj.office.fc.ss.usermodel.IHyperlink;
import lib.zj.office.fc.ss.usermodel.RichTextString;
import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.ss.util.NumberToTextConverter;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public class HSSFCell implements ICell {
    public static final short ENCODING_COMPRESSED_UNICODE = 0;
    public static final short ENCODING_UNCHANGED = -1;
    public static final short ENCODING_UTF_16 = 1;
    private static final String FILE_FORMAT_NAME = "BIFF8";
    private static final String LAST_COLUMN_NAME;
    public static final int LAST_COLUMN_NUMBER;
    private static POILogger log = POILogFactory.getLogger(HSSFCell.class);
    private final HSSFWorkbook _book;
    private int _cellType;
    private HSSFComment _comment;
    private CellValueRecordInterface _record;
    private final HSSFSheet _sheet;
    private HSSFRichTextString _stringValue;
    private int rangeAddressIndex = -1;

    static {
        SpreadsheetVersion spreadsheetVersion = SpreadsheetVersion.EXCEL97;
        LAST_COLUMN_NUMBER = spreadsheetVersion.getLastColumnIndex();
        LAST_COLUMN_NAME = spreadsheetVersion.getLastColumnName();
    }

    public HSSFCell(HSSFWorkbook hSSFWorkbook, HSSFSheet hSSFSheet, int i10, short s4) {
        checkBounds(s4);
        this._stringValue = null;
        this._book = hSSFWorkbook;
        this._sheet = hSSFSheet;
        setCellType(3, false, i10, s4, hSSFSheet.getSheet().getXFIndexForColAt(s4));
    }

    private short applyUserCellStyle(HSSFCellStyle hSSFCellStyle) {
        if (hSSFCellStyle.getUserStyleName() != null) {
            InternalWorkbook workbook = this._book.getWorkbook();
            int numExFormats = workbook.getNumExFormats();
            short s4 = 0;
            while (true) {
                if (s4 < numExFormats) {
                    ExtendedFormatRecord exFormatAt = workbook.getExFormatAt(s4);
                    if (exFormatAt.getXFType() == 0 && exFormatAt.getParentIndex() == hSSFCellStyle.getIndex()) {
                        break;
                    }
                    s4 = (short) (s4 + 1);
                } else {
                    s4 = -1;
                    break;
                }
            }
            if (s4 == -1) {
                ExtendedFormatRecord createCellXF = workbook.createCellXF();
                createCellXF.cloneStyleFrom(workbook.getExFormatAt(hSSFCellStyle.getIndex()));
                createCellXF.setIndentionOptions((short) 0);
                createCellXF.setXFType((short) 0);
                createCellXF.setParentIndex(hSSFCellStyle.getIndex());
                return (short) numExFormats;
            }
            return s4;
        }
        throw new IllegalArgumentException("Expected user-defined style");
    }

    private static void checkBounds(int i10) {
        if (i10 >= 0 && i10 <= LAST_COLUMN_NUMBER) {
            return;
        }
        StringBuilder e10 = d.e("Invalid column index (", i10, ").  Allowable column range for BIFF8 is (0..");
        e10.append(LAST_COLUMN_NUMBER);
        e10.append(") or ('A'..'");
        throw new IllegalArgumentException(r.g(e10, LAST_COLUMN_NAME, "')"));
    }

    private static void checkFormulaCachedValueType(int i10, FormulaRecord formulaRecord) {
        int cachedResultType = formulaRecord.getCachedResultType();
        if (cachedResultType == i10) {
            return;
        }
        throw typeMismatch(i10, cachedResultType, true);
    }

    private boolean convertCellValueToBoolean() {
        int i10 = this._cellType;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new RuntimeException(h.g(new StringBuilder("Unexpected cell type ("), this._cellType, ")"));
                            }
                        } else {
                            return ((BoolErrRecord) this._record).getBooleanValue();
                        }
                    }
                    return false;
                }
                FormulaRecord formulaRecord = ((FormulaRecordAggregate) this._record).getFormulaRecord();
                checkFormulaCachedValueType(4, formulaRecord);
                return formulaRecord.getCachedBooleanValue();
            }
            return Boolean.valueOf(this._book.getWorkbook().getSSTString(((LabelSSTRecord) this._record).getSSTIndex()).getString()).booleanValue();
        } else if (((NumberRecord) this._record).getValue() == 0.0d) {
            return false;
        } else {
            return true;
        }
    }

    private String convertCellValueToString() {
        int i10 = this._cellType;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return ErrorConstants.getText(((BoolErrRecord) this._record).getErrorValue());
                            }
                            throw new IllegalStateException(h.g(new StringBuilder("Unexpected cell type ("), this._cellType, ")"));
                        } else if (((BoolErrRecord) this._record).getBooleanValue()) {
                            return "TRUE";
                        } else {
                            return "FALSE";
                        }
                    }
                    return "";
                }
                FormulaRecordAggregate formulaRecordAggregate = (FormulaRecordAggregate) this._record;
                FormulaRecord formulaRecord = formulaRecordAggregate.getFormulaRecord();
                int cachedResultType = formulaRecord.getCachedResultType();
                if (cachedResultType != 0) {
                    if (cachedResultType != 1) {
                        if (cachedResultType != 4) {
                            if (cachedResultType == 5) {
                                return ErrorConstants.getText(formulaRecord.getCachedErrorValue());
                            }
                            throw new IllegalStateException(h.g(new StringBuilder("Unexpected formula result type ("), this._cellType, ")"));
                        } else if (formulaRecord.getCachedBooleanValue()) {
                            return "TRUE";
                        } else {
                            return "FALSE";
                        }
                    }
                    return formulaRecordAggregate.getStringValue();
                }
                return NumberToTextConverter.toText(formulaRecord.getValue());
            }
            return this._book.getWorkbook().getSSTString(((LabelSSTRecord) this._record).getSSTIndex()).getString();
        }
        return NumberToTextConverter.toText(((NumberRecord) this._record).getValue());
    }

    private static int determineType(CellValueRecordInterface cellValueRecordInterface) {
        if (cellValueRecordInterface instanceof FormulaRecordAggregate) {
            return 2;
        }
        Record record = (Record) cellValueRecordInterface;
        short sid = record.getSid();
        if (sid != 253) {
            if (sid != 513) {
                if (sid != 515) {
                    if (sid == 517) {
                        if (((BoolErrRecord) record).isBoolean()) {
                            return 4;
                        }
                        return 5;
                    }
                    throw new RuntimeException("Bad cell value rec (" + cellValueRecordInterface.getClass().getName() + ")");
                }
                return 0;
            }
            return 3;
        }
        return 1;
    }

    public static HSSFComment findCellComment(InternalSheet internalSheet, int i10, int i11) {
        HSSFComment hSSFComment;
        HashMap hashMap = new HashMap();
        Iterator<RecordBase> it = internalSheet.getRecords().iterator();
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            hSSFComment = null;
            if (!it.hasNext()) {
                break;
            }
            RecordBase next = it.next();
            if (next instanceof NoteRecord) {
                NoteRecord noteRecord = (NoteRecord) next;
                if (noteRecord.getRow() == i10 && noteRecord.getColumn() == i11) {
                    if (i12 < hashMap.size()) {
                        TextObjectRecord textObjectRecord = (TextObjectRecord) hashMap.get(Integer.valueOf(noteRecord.getShapeId()));
                        if (textObjectRecord != null) {
                            hSSFComment = new HSSFComment(noteRecord, textObjectRecord);
                            hSSFComment.setRow(noteRecord.getRow());
                            hSSFComment.setColumn(noteRecord.getColumn());
                            hSSFComment.setAuthor(noteRecord.getAuthor());
                            if (noteRecord.getFlags() == 2) {
                                z10 = true;
                            }
                            hSSFComment.setVisible(z10);
                            hSSFComment.setString(textObjectRecord.getStr());
                        } else {
                            log.log(POILogger.WARN, a0.d.b("Failed to match NoteRecord and TextObjectRecord, row: ", i10, ", column: ", i11));
                        }
                    } else {
                        log.log(POILogger.WARN, a0.d.b("Failed to match NoteRecord and TextObjectRecord, row: ", i10, ", column: ", i11));
                    }
                } else {
                    i12++;
                }
            } else if (next instanceof ObjRecord) {
                SubRecord subRecord = ((ObjRecord) next).getSubRecords().get(0);
                if (subRecord instanceof CommonObjectDataSubRecord) {
                    CommonObjectDataSubRecord commonObjectDataSubRecord = (CommonObjectDataSubRecord) subRecord;
                    if (commonObjectDataSubRecord.getObjectType() == 25) {
                        while (true) {
                            if (it.hasNext()) {
                                RecordBase next2 = it.next();
                                if (next2 instanceof TextObjectRecord) {
                                    hashMap.put(Integer.valueOf(commonObjectDataSubRecord.getObjectId()), (TextObjectRecord) next2);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return hSSFComment;
    }

    private static String getCellTypeName(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return a.g("#unknown cell type (", i10, ")#");
                            }
                            return "error";
                        }
                        return "boolean";
                    }
                    return "blank";
                }
                return "formula";
            }
            return "text";
        }
        return "numeric";
    }

    private void notifyFormulaChanging() {
        CellValueRecordInterface cellValueRecordInterface = this._record;
        if (cellValueRecordInterface instanceof FormulaRecordAggregate) {
            ((FormulaRecordAggregate) cellValueRecordInterface).notifyFormulaChanging();
        }
    }

    private static RuntimeException typeMismatch(int i10, int i11, boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder("Cannot get a ");
        sb2.append(getCellTypeName(i10));
        sb2.append(" value from a ");
        sb2.append(getCellTypeName(i11));
        sb2.append(" ");
        if (z10) {
            str = "formula ";
        } else {
            str = "";
        }
        return new IllegalStateException(r.g(sb2, str, "cell"));
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public HSSFCellRangeAddress getArrayFormulaRange() {
        if (this._cellType == 2) {
            return ((FormulaRecordAggregate) this._record).getArrayFormulaRange();
        }
        throw new IllegalStateException(h.d("Cell ", new CellReference(this).formatAsString(), " is not part of an array formula."));
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public boolean getBooleanCellValue() {
        int i10 = this._cellType;
        if (i10 != 2) {
            if (i10 == 3) {
                return false;
            }
            if (i10 == 4) {
                return ((BoolErrRecord) this._record).getBooleanValue();
            }
            throw typeMismatch(4, i10, false);
        }
        FormulaRecord formulaRecord = ((FormulaRecordAggregate) this._record).getFormulaRecord();
        checkFormulaCachedValueType(4, formulaRecord);
        return formulaRecord.getCachedBooleanValue();
    }

    public InternalWorkbook getBoundWorkbook() {
        return this._book.getWorkbook();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public int getCachedFormulaResultType() {
        if (this._cellType == 2) {
            return ((FormulaRecordAggregate) this._record).getFormulaRecord().getCachedResultType();
        }
        throw new IllegalStateException("Only formula cells have cached results");
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public String getCellFormula() {
        if (this._record instanceof FormulaRecordAggregate) {
            return null;
        }
        throw typeMismatch(2, this._cellType, true);
    }

    public short getCellNum() {
        return (short) getColumnIndex();
    }

    public int getCellStyleIndex() {
        return this._record.getXFIndex();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public int getCellType() {
        return this._cellType;
    }

    public CellValueRecordInterface getCellValueRecord() {
        return this._record;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public int getColumnIndex() {
        return this._record.getColumn() & 65535;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public Date getDateCellValue() {
        if (this._cellType == 3) {
            return null;
        }
        double numericCellValue = getNumericCellValue();
        if (this._book.getWorkbook().isUsing1904DateWindowing()) {
            return DateUtil.getJavaDate(numericCellValue, true);
        }
        return DateUtil.getJavaDate(numericCellValue, false);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public byte getErrorCellValue() {
        int i10 = this._cellType;
        if (i10 != 2) {
            if (i10 == 5) {
                return ((BoolErrRecord) this._record).getErrorValue();
            }
            throw typeMismatch(5, i10, false);
        }
        FormulaRecord formulaRecord = ((FormulaRecordAggregate) this._record).getFormulaRecord();
        checkFormulaCachedValueType(5, formulaRecord);
        return (byte) formulaRecord.getCachedErrorValue();
    }

    public int getFormulaCachedValueType() {
        return ((FormulaRecordAggregate) this._record).getFormulaRecord().getCachedResultType();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public double getNumericCellValue() {
        int i10 = this._cellType;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return 0.0d;
                }
                throw typeMismatch(0, i10, false);
            }
            FormulaRecord formulaRecord = ((FormulaRecordAggregate) this._record).getFormulaRecord();
            checkFormulaCachedValueType(0, formulaRecord);
            return formulaRecord.getValue();
        }
        return ((NumberRecord) this._record).getValue();
    }

    public int getRangeAddressIndex() {
        return this.rangeAddressIndex;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public int getRowIndex() {
        return this._record.getRow();
    }

    public int getSSTStringIndex() {
        return getRichStringCellValue().getSSTIndex();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public String getStringCellValue() {
        return getRichStringCellValue().getString();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public boolean isPartOfArrayFormulaGroup() {
        if (this._cellType != 2) {
            return false;
        }
        return ((FormulaRecordAggregate) this._record).isPartOfArrayFormula();
    }

    public void notifyArrayFormulaChanging(String str) {
        if (getArrayFormulaRange().getNumberOfCells() <= 1) {
            getRow().getSheet().removeArrayFormula(this);
            return;
        }
        throw new IllegalStateException(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void removeCellComment() {
        HSSFComment findCellComment = findCellComment(this._sheet.getSheet(), this._record.getRow(), this._record.getColumn());
        this._comment = null;
        if (findCellComment == null) {
            return;
        }
        List<RecordBase> records = this._sheet.getSheet().getRecords();
        records.remove(findCellComment.getNoteRecord());
        if (findCellComment.getTextObjectRecord() != null) {
            TextObjectRecord textObjectRecord = findCellComment.getTextObjectRecord();
            int indexOf = records.indexOf(textObjectRecord);
            int i10 = indexOf - 3;
            if (records.get(i10) instanceof DrawingRecord) {
                int i11 = indexOf - 2;
                if (records.get(i11) instanceof ObjRecord) {
                    int i12 = indexOf - 1;
                    if (records.get(i12) instanceof DrawingRecord) {
                        records.remove(i12);
                        records.remove(i11);
                        records.remove(i10);
                        records.remove(textObjectRecord);
                        return;
                    }
                }
            }
            throw new IllegalStateException("Found the wrong records before the TextObjectRecord, can't remove comment");
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setAsActiveCell() {
        int row = this._record.getRow();
        short column = this._record.getColumn();
        this._sheet.getSheet().setActiveCellRow(row);
        this._sheet.getSheet().setActiveCellCol(column);
    }

    public void setCellArrayFormula(HSSFCellRangeAddress hSSFCellRangeAddress) {
        setCellType(2, false, this._record.getRow(), this._record.getColumn(), this._record.getXFIndex());
        ((FormulaRecordAggregate) this._record).setParsedExpression(new Ptg[]{new ExpPtg(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getFirstColumn())});
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellComment(Comment comment) {
        if (comment == null) {
            removeCellComment();
            return;
        }
        comment.setRow(this._record.getRow());
        comment.setColumn(this._record.getColumn());
        this._comment = (HSSFComment) comment;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellErrorValue(byte b10) {
        int row = this._record.getRow();
        short column = this._record.getColumn();
        short xFIndex = this._record.getXFIndex();
        int i10 = this._cellType;
        if (i10 != 2) {
            if (i10 != 5) {
                setCellType(5, false, row, column, xFIndex);
            }
            ((BoolErrRecord) this._record).setValue(b10);
            return;
        }
        ((FormulaRecordAggregate) this._record).setCachedErrorResult(b10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellFormula(String str) {
        if (isPartOfArrayFormulaGroup()) {
            notifyArrayFormulaChanging();
        }
        int row = this._record.getRow();
        short column = this._record.getColumn();
        short xFIndex = this._record.getXFIndex();
        if (str == null) {
            notifyFormulaChanging();
            setCellType(3, false, row, column, xFIndex);
            return;
        }
        this._book.getSheetIndex(this._sheet);
    }

    public void setCellNum(short s4) {
        this._record.setColumn(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellStyle(ICellStyle iCellStyle) {
        setCellStyle((HSSFCellStyle) iCellStyle);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellType(int i10) {
        notifyFormulaChanging();
        if (isPartOfArrayFormulaGroup()) {
            notifyArrayFormulaChanging();
        }
        setCellType(i10, true, this._record.getRow(), this._record.getColumn(), this._record.getXFIndex());
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellValue(double d10) {
        if (Double.isInfinite(d10)) {
            setCellErrorValue(FormulaError.DIV0.getCode());
        } else if (Double.isNaN(d10)) {
            setCellErrorValue(FormulaError.NUM.getCode());
        } else {
            int row = this._record.getRow();
            short column = this._record.getColumn();
            short xFIndex = this._record.getXFIndex();
            int i10 = this._cellType;
            if (i10 != 0) {
                if (i10 != 2) {
                    setCellType(0, false, row, column, xFIndex);
                } else {
                    ((FormulaRecordAggregate) this._record).setCachedDoubleResult(d10);
                    return;
                }
            }
            ((NumberRecord) this._record).setValue(d10);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setHyperlink(IHyperlink iHyperlink) {
        HSSFHyperlink hSSFHyperlink = (HSSFHyperlink) iHyperlink;
        hSSFHyperlink.setFirstRow(this._record.getRow());
        hSSFHyperlink.setLastRow(this._record.getRow());
        hSSFHyperlink.setFirstColumn(this._record.getColumn());
        hSSFHyperlink.setLastColumn(this._record.getColumn());
        int type = hSSFHyperlink.getType();
        if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        hSSFHyperlink.setLabel("file");
                    }
                }
            } else {
                hSSFHyperlink.setLabel("place");
            }
            List<RecordBase> records = this._sheet.getSheet().getRecords();
            records.add(records.size() - 1, hSSFHyperlink.record);
        }
        hSSFHyperlink.setLabel(InMobiNetworkValues.URL);
        List<RecordBase> records2 = this._sheet.getSheet().getRecords();
        records2.add(records2.size() - 1, hSSFHyperlink.record);
    }

    public void setRangeAddressIndex(int i10) {
        this.rangeAddressIndex = i10;
    }

    public String toString() {
        int cellType = getCellType();
        if (cellType != 0) {
            if (cellType != 1) {
                if (cellType != 2) {
                    if (cellType != 3) {
                        if (cellType != 4) {
                            if (cellType != 5) {
                                return "Unknown Cell Type: " + getCellType();
                            }
                            return ErrorEval.getText(((BoolErrRecord) this._record).getErrorValue());
                        } else if (getBooleanCellValue()) {
                            return "TRUE";
                        } else {
                            return "FALSE";
                        }
                    }
                    return "";
                }
                return getCellFormula();
            }
            return getStringCellValue();
        }
        return String.valueOf(getNumericCellValue());
    }

    public void updateCellNum(short s4) {
        this._record.setColumn(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public HSSFComment getCellComment() {
        if (this._comment == null) {
            this._comment = findCellComment(this._sheet.getSheet(), this._record.getRow(), this._record.getColumn());
        }
        return this._comment;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public HSSFCellStyle getCellStyle() {
        short xFIndex = this._record.getXFIndex();
        return new HSSFCellStyle(xFIndex, this._book.getWorkbook().getExFormatAt(xFIndex), this._book);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public HSSFHyperlink getHyperlink() {
        for (RecordBase recordBase : this._sheet.getSheet().getRecords()) {
            if (recordBase instanceof HyperlinkRecord) {
                HyperlinkRecord hyperlinkRecord = (HyperlinkRecord) recordBase;
                if (hyperlinkRecord.getFirstColumn() == this._record.getColumn() && hyperlinkRecord.getFirstRow() == this._record.getRow()) {
                    return new HSSFHyperlink(hyperlinkRecord);
                }
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public HSSFRichTextString getRichStringCellValue() {
        int i10 = this._cellType;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new HSSFRichTextString("");
                }
                throw typeMismatch(1, i10, false);
            }
            FormulaRecordAggregate formulaRecordAggregate = (FormulaRecordAggregate) this._record;
            checkFormulaCachedValueType(1, formulaRecordAggregate.getFormulaRecord());
            String stringValue = formulaRecordAggregate.getStringValue();
            return new HSSFRichTextString(stringValue != null ? stringValue : "");
        }
        return this._stringValue;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public HSSFRow getRow() {
        return this._sheet.getRow(getRowIndex());
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public HSSFSheet getSheet() {
        return this._sheet;
    }

    public void setCellStyle(HSSFCellStyle hSSFCellStyle) {
        short index;
        hSSFCellStyle.verifyBelongsToWorkbook(this._book);
        if (hSSFCellStyle.getUserStyleName() != null) {
            index = applyUserCellStyle(hSSFCellStyle);
        } else {
            index = hSSFCellStyle.getIndex();
        }
        this._record.setXFIndex(index);
    }

    public void notifyArrayFormulaChanging() {
        CellReference cellReference = new CellReference(this);
        notifyArrayFormulaChanging("Cell " + cellReference.formatAsString() + " is part of a multi-cell array formula. You cannot change part of an array.");
    }

    public void setCellType(int i10, boolean z10) {
        notifyFormulaChanging();
        if (isPartOfArrayFormulaGroup()) {
            notifyArrayFormulaChanging();
        }
        setCellType(i10, z10, this._record.getRow(), this._record.getColumn(), this._record.getXFIndex());
    }

    public HSSFCell(HSSFWorkbook hSSFWorkbook, HSSFSheet hSSFSheet, int i10, short s4, int i11) {
        checkBounds(s4);
        this._cellType = -1;
        this._stringValue = null;
        this._book = hSSFWorkbook;
        this._sheet = hSSFSheet;
        setCellType(i11, false, i10, s4, hSSFSheet.getSheet().getXFIndexForColAt(s4));
    }

    public void setCellFormula(Ptg[] ptgArr) {
        if (isPartOfArrayFormulaGroup()) {
            notifyArrayFormulaChanging();
        }
        setCellType(2, false, this._record.getRow(), this._record.getColumn(), this._record.getXFIndex());
        FormulaRecordAggregate formulaRecordAggregate = (FormulaRecordAggregate) this._record;
        FormulaRecord formulaRecord = formulaRecordAggregate.getFormulaRecord();
        formulaRecord.setOptions((short) 2);
        formulaRecord.setValue(0.0d);
        if (formulaRecordAggregate.getXFIndex() == 0) {
            formulaRecordAggregate.setXFIndex((short) 15);
        }
        formulaRecordAggregate.setParsedExpression(ptgArr);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellValue(Date date) {
        setCellValue(DateUtil.getExcelDate(date, this._book.getWorkbook().isUsing1904DateWindowing()));
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellValue(Calendar calendar) {
        setCellValue(DateUtil.getExcelDate(calendar, this._book.getWorkbook().isUsing1904DateWindowing()));
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellValue(String str) {
        setCellValue(str == null ? null : new HSSFRichTextString(str));
    }

    private void setCellType(int i10, boolean z10, int i11, short s4, short s10) {
        NumberRecord numberRecord;
        LabelSSTRecord labelSSTRecord;
        FormulaRecordAggregate formulaRecordAggregate;
        BlankRecord blankRecord;
        BoolErrRecord boolErrRecord;
        BoolErrRecord boolErrRecord2;
        if (i10 <= 5) {
            if (i10 == 0) {
                if (i10 != this._cellType) {
                    numberRecord = new NumberRecord();
                } else {
                    numberRecord = (NumberRecord) this._record;
                }
                numberRecord.setColumn(s4);
                if (z10) {
                    numberRecord.setValue(getNumericCellValue());
                }
                numberRecord.setXFIndex(s10);
                numberRecord.setRow(i11);
                this._record = numberRecord;
            } else if (i10 == 1) {
                if (i10 == this._cellType) {
                    labelSSTRecord = (LabelSSTRecord) this._record;
                } else {
                    LabelSSTRecord labelSSTRecord2 = new LabelSSTRecord();
                    labelSSTRecord2.setColumn(s4);
                    labelSSTRecord2.setRow(i11);
                    labelSSTRecord2.setXFIndex(s10);
                    labelSSTRecord = labelSSTRecord2;
                }
                if (z10) {
                    int addSSTString = this._book.getWorkbook().addSSTString(new UnicodeString(convertCellValueToString()));
                    labelSSTRecord.setSSTIndex(addSSTString);
                    UnicodeString sSTString = this._book.getWorkbook().getSSTString(addSSTString);
                    HSSFRichTextString hSSFRichTextString = new HSSFRichTextString();
                    this._stringValue = hSSFRichTextString;
                    hSSFRichTextString.setUnicodeString(sSTString);
                }
                this._record = labelSSTRecord;
            } else if (i10 == 2) {
                if (i10 != this._cellType) {
                    formulaRecordAggregate = this._sheet.getSheet().getRowsAggregate().createFormula(i11, s4);
                } else {
                    FormulaRecordAggregate formulaRecordAggregate2 = (FormulaRecordAggregate) this._record;
                    formulaRecordAggregate2.setRow(i11);
                    formulaRecordAggregate2.setColumn(s4);
                    formulaRecordAggregate = formulaRecordAggregate2;
                }
                if (z10) {
                    formulaRecordAggregate.getFormulaRecord().setValue(getNumericCellValue());
                }
                formulaRecordAggregate.setXFIndex(s10);
                this._record = formulaRecordAggregate;
            } else if (i10 == 3) {
                if (i10 != this._cellType) {
                    blankRecord = new BlankRecord();
                } else {
                    blankRecord = (BlankRecord) this._record;
                }
                blankRecord.setColumn(s4);
                blankRecord.setXFIndex(s10);
                blankRecord.setRow(i11);
                this._record = blankRecord;
            } else if (i10 == 4) {
                if (i10 != this._cellType) {
                    boolErrRecord = new BoolErrRecord();
                } else {
                    boolErrRecord = (BoolErrRecord) this._record;
                }
                boolErrRecord.setColumn(s4);
                if (z10) {
                    boolErrRecord.setValue(convertCellValueToBoolean());
                }
                boolErrRecord.setXFIndex(s10);
                boolErrRecord.setRow(i11);
                this._record = boolErrRecord;
            } else if (i10 == 5) {
                if (i10 != this._cellType) {
                    boolErrRecord2 = new BoolErrRecord();
                } else {
                    boolErrRecord2 = (BoolErrRecord) this._record;
                }
                boolErrRecord2.setColumn(s4);
                if (z10) {
                    boolErrRecord2.setValue((byte) 15);
                }
                boolErrRecord2.setXFIndex(s10);
                boolErrRecord2.setRow(i11);
                this._record = boolErrRecord2;
            }
            int i12 = this._cellType;
            if (i10 != i12 && i12 != -1) {
                this._sheet.getSheet().replaceValueRecord(this._record);
            }
            this._cellType = i10;
            return;
        }
        throw new RuntimeException("I have no idea what type that is!");
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellValue(RichTextString richTextString) {
        HSSFRichTextString hSSFRichTextString = (HSSFRichTextString) richTextString;
        int row = this._record.getRow();
        short column = this._record.getColumn();
        short xFIndex = this._record.getXFIndex();
        if (hSSFRichTextString == null) {
            notifyFormulaChanging();
            setCellType(3, false, row, column, xFIndex);
        } else if (hSSFRichTextString.length() <= SpreadsheetVersion.EXCEL97.getMaxTextLength()) {
            int i10 = this._cellType;
            if (i10 == 2) {
                ((FormulaRecordAggregate) this._record).setCachedStringResult(hSSFRichTextString.getString());
                this._stringValue = new HSSFRichTextString(richTextString.getString());
                return;
            }
            if (i10 != 1) {
                setCellType(1, false, row, column, xFIndex);
            }
            int addSSTString = this._book.getWorkbook().addSSTString(hSSFRichTextString.getUnicodeString());
            ((LabelSSTRecord) this._record).setSSTIndex(addSSTString);
            this._stringValue = hSSFRichTextString;
            hSSFRichTextString.setWorkbookReferences(this._book.getWorkbook(), (LabelSSTRecord) this._record);
            this._stringValue.setUnicodeString(this._book.getWorkbook().getSSTString(addSSTString));
        } else {
            throw new IllegalArgumentException("The maximum length of cell contents (text) is 32,767 characters");
        }
    }

    public HSSFCell(HSSFWorkbook hSSFWorkbook, HSSFSheet hSSFSheet, CellValueRecordInterface cellValueRecordInterface) {
        this._record = cellValueRecordInterface;
        int determineType = determineType(cellValueRecordInterface);
        this._cellType = determineType;
        this._stringValue = null;
        this._book = hSSFWorkbook;
        this._sheet = hSSFSheet;
        if (determineType == 1) {
            this._stringValue = new HSSFRichTextString(hSSFWorkbook.getWorkbook(), (LabelSSTRecord) cellValueRecordInterface);
        } else if (determineType != 2) {
        } else {
            this._stringValue = new HSSFRichTextString(((FormulaRecordAggregate) cellValueRecordInterface).getStringValue());
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICell
    public void setCellValue(boolean z10) {
        int row = this._record.getRow();
        short column = this._record.getColumn();
        short xFIndex = this._record.getXFIndex();
        int i10 = this._cellType;
        if (i10 != 2) {
            if (i10 != 4) {
                setCellType(4, false, row, column, xFIndex);
            }
            ((BoolErrRecord) this._record).setValue(z10);
            return;
        }
        ((FormulaRecordAggregate) this._record).setCachedBooleanResult(z10);
    }
}
