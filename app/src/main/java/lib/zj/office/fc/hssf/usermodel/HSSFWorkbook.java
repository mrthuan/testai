package lib.zj.office.fc.hssf.usermodel;

import androidx.activity.f;
import androidx.appcompat.view.menu.d;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Pattern;
import lib.zj.office.fc.a;
import lib.zj.office.fc.codec.DigestUtils;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherBitmapBlip;
import lib.zj.office.fc.ddf.EscherBlipRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.hssf.OldExcelFormatException;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.formula.SheetNameFormatter;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemFuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.UnionPtg;
import lib.zj.office.fc.hssf.formula.udf.AggregatingUDFFinder;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.hssf.model.InternalSheet;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord;
import lib.zj.office.fc.hssf.record.DrawingGroupRecord;
import lib.zj.office.fc.hssf.record.EmbeddedObjectRefSubRecord;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import lib.zj.office.fc.hssf.record.LabelRecord;
import lib.zj.office.fc.hssf.record.LabelSSTRecord;
import lib.zj.office.fc.hssf.record.NameRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.record.RecalcIdRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.RecordFactory;
import lib.zj.office.fc.hssf.record.SubRecord;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;
import lib.zj.office.fc.hssf.record.common.UnicodeString;
import lib.zj.office.fc.hssf.util.CellReference;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;
import lib.zj.office.fc.ss.usermodel.IRow;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.usermodel.Workbook;
import lib.zj.office.fc.ss.util.WorkbookUtil;

/* loaded from: classes3.dex */
public final class HSSFWorkbook extends a implements Workbook {
    public static final int INITIAL_CAPACITY = 3;
    private static final short MAX_COLUMN = 255;
    private static final int MAX_ROW = 65535;
    private static final int MAX_STYLES = 4030;
    protected List<HSSFSheet> _sheets;
    private UDFFinder _udfFinder;
    private Hashtable fonts;
    private HSSFDataFormat formatter;
    private IRow.MissingCellPolicy missingCellPolicy;
    private ArrayList<HSSFName> names;
    private HSSFPalette palette;
    private boolean preserveNodes;
    private InternalWorkbook workbook;
    private static final Pattern COMMA_PATTERN = Pattern.compile(",");
    private static final String[] WORKBOOK_DIR_ENTRY_NAMES = {"Workbook", "WORKBOOK"};

    /* loaded from: classes3.dex */
    public static final class SheetRecordCollector implements RecordAggregate.RecordVisitor {
        private int _totalSize = 0;
        private List _list = new ArrayList(128);

        public int getTotalSize() {
            return this._totalSize;
        }

        public int serialize(int i10, byte[] bArr) {
            int size = this._list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((Record) this._list.get(i12)).serialize(i10 + i11, bArr);
            }
            return i11;
        }

        @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate.RecordVisitor
        public void visitRecord(Record record) {
            this._list.add(record);
            this._totalSize = record.getRecordSize() + this._totalSize;
        }
    }

    public HSSFWorkbook() {
        this(InternalWorkbook.createWorkbook());
    }

    private void convertLabelRecords(List list, int i10) {
        while (i10 < list.size()) {
            Record record = (Record) list.get(i10);
            if (record.getSid() == 516) {
                LabelRecord labelRecord = (LabelRecord) record;
                list.remove(i10);
                LabelSSTRecord labelSSTRecord = new LabelSSTRecord();
                int addSSTString = this.workbook.addSSTString(new UnicodeString(labelRecord.getValue()));
                labelSSTRecord.setRow(labelRecord.getRow());
                labelSSTRecord.setColumn(labelRecord.getColumn());
                labelSSTRecord.setXFIndex(labelRecord.getXFIndex());
                labelSSTRecord.setSSTIndex(addSSTString);
                list.add(i10, labelSSTRecord);
            }
            i10++;
        }
    }

    public static HSSFWorkbook create(InternalWorkbook internalWorkbook) {
        return new HSSFWorkbook(internalWorkbook);
    }

    private int findExistingBuiltinNameRecordIdx(int i10, byte b10) {
        for (int i11 = 0; i11 < this.names.size(); i11++) {
            NameRecord nameRecord = this.workbook.getNameRecord(i11);
            if (nameRecord != null) {
                if (nameRecord.isBuiltInName() && nameRecord.getBuiltInName() == b10 && nameRecord.getSheetNumber() - 1 == i10) {
                    return i11;
                }
            } else {
                throw new RuntimeException("Unable to find all defined names to iterate over");
            }
        }
        return -1;
    }

    private HSSFSheet[] getSheets() {
        HSSFSheet[] hSSFSheetArr = new HSSFSheet[this._sheets.size()];
        this._sheets.toArray(hSSFSheetArr);
        return hSSFSheetArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[LOOP:0: B:12:0x0032->B:19:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getUniqueSheetName(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 40
            int r0 = r9.lastIndexOf(r0)
            r1 = 0
            java.lang.String r2 = ")"
            r3 = 2
            if (r0 <= 0) goto L31
            boolean r4 = r9.endsWith(r2)
            if (r4 == 0) goto L31
            int r4 = r0 + 1
            int r5 = r9.length()
            int r5 = r5 + (-1)
            java.lang.String r4 = r9.substring(r4, r5)
            java.lang.String r4 = r4.trim()     // Catch: java.lang.NumberFormatException -> L31
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L31
            int r4 = r4 + 1
            java.lang.String r0 = r9.substring(r1, r0)     // Catch: java.lang.NumberFormatException -> L32
            java.lang.String r9 = r0.trim()     // Catch: java.lang.NumberFormatException -> L32
            goto L32
        L31:
            r4 = r3
        L32:
            int r0 = r4 + 1
            java.lang.String r4 = java.lang.Integer.toString(r4)
            int r5 = r9.length()
            int r6 = r4.length()
            int r6 = r6 + r5
            int r6 = r6 + r3
            r5 = 31
            if (r6 >= r5) goto L4d
            java.lang.String r5 = " ("
            java.lang.String r4 = a0.a.j(r9, r5, r4, r2)
            goto L68
        L4d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r4.length()
            int r5 = r5 - r7
            int r5 = r5 - r3
            java.lang.String r5 = r9.substring(r1, r5)
            r6.append(r5)
            java.lang.String r5 = "("
            r6.append(r5)
            java.lang.String r4 = androidx.activity.r.g(r6, r4, r2)
        L68:
            lib.zj.office.fc.hssf.model.InternalWorkbook r5 = r8.workbook
            int r5 = r5.getSheetIndex(r4)
            r6 = -1
            if (r5 != r6) goto L72
            return r4
        L72:
            r4 = r0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.usermodel.HSSFWorkbook.getUniqueSheetName(java.lang.String):java.lang.String");
    }

    private static String getWorkbookDirEntryName(DirectoryNode directoryNode) {
        String[] strArr;
        for (String str : WORKBOOK_DIR_ENTRY_NAMES) {
            try {
                directoryNode.getEntry(str);
                return str;
            } catch (FileNotFoundException unused) {
            }
        }
        try {
            directoryNode.getEntry("Book");
            throw new OldExcelFormatException("The supplied spreadsheet seems to be Excel 5.0/7.0 (BIFF5) format. POI only supports BIFF8 format (from Excel versions 97/2000/XP/2003)");
        } catch (FileNotFoundException unused2) {
            throw new IllegalArgumentException("The supplied POIFSFileSystem does not contain a BIFF8 'Workbook' entry. Is it really an excel file?");
        }
    }

    private void searchForPictures(List<EscherRecord> list, List<HSSFPictureData> list2) {
        EscherBlipRecord blipRecord;
        for (EscherRecord escherRecord : list) {
            if ((escherRecord instanceof EscherBSERecord) && (blipRecord = ((EscherBSERecord) escherRecord).getBlipRecord()) != null) {
                list2.add(new HSSFPictureData(blipRecord));
            }
            searchForPictures(escherRecord.getChildRecords(), list2);
        }
    }

    private void setPropertiesFromWorkbook(InternalWorkbook internalWorkbook) {
        this.workbook = internalWorkbook;
    }

    private void validateSheetIndex(int i10) {
        int size = this._sheets.size() - 1;
        if (i10 >= 0 && i10 <= size) {
            return;
        }
        throw new IllegalArgumentException(f.k("Sheet index (", i10, ") is out of range (0..", size, ")"));
    }

    public int addPicture(byte[] bArr, int i10) {
        initDrawings();
        byte[] md5 = DigestUtils.md5(bArr);
        EscherBitmapBlip escherBitmapBlip = new EscherBitmapBlip();
        escherBitmapBlip.setRecordId((short) (i10 - 4072));
        switch (i10) {
            case 2:
                escherBitmapBlip.setOptions((short) 15680);
                break;
            case 3:
                escherBitmapBlip.setOptions((short) 8544);
                break;
            case 4:
                escherBitmapBlip.setOptions((short) 21536);
                break;
            case 5:
                escherBitmapBlip.setOptions(HSSFPictureData.MSOBI_JPEG);
                break;
            case 6:
                escherBitmapBlip.setOptions(HSSFPictureData.MSOBI_PNG);
                break;
            case 7:
                escherBitmapBlip.setOptions(HSSFPictureData.MSOBI_DIB);
                break;
        }
        escherBitmapBlip.setUID(md5);
        escherBitmapBlip.setMarker((byte) -1);
        escherBitmapBlip.setPictureData(bArr);
        EscherBSERecord escherBSERecord = new EscherBSERecord();
        escherBSERecord.setRecordId(EscherBSERecord.RECORD_ID);
        escherBSERecord.setOptions((short) ((i10 << 4) | 2));
        byte b10 = (byte) i10;
        escherBSERecord.setBlipTypeMacOS(b10);
        escherBSERecord.setBlipTypeWin32(b10);
        escherBSERecord.setUid(md5);
        escherBSERecord.setTag((short) 255);
        escherBSERecord.setSize(bArr.length + 25);
        escherBSERecord.setRef(1);
        escherBSERecord.setOffset(0);
        escherBSERecord.setBlipRecord(escherBitmapBlip);
        return this.workbook.addBSERecord(escherBSERecord);
    }

    public int addSSTString(String str) {
        return this.workbook.addSSTString(new UnicodeString(str));
    }

    public void addToolPack(UDFFinder uDFFinder) {
        ((AggregatingUDFFinder) this._udfFinder).add(uDFFinder);
    }

    public HSSFSheet cloneSheet(int i10) {
        validateSheetIndex(i10);
        String sheetName = this.workbook.getSheetName(i10);
        HSSFSheet cloneSheet = this._sheets.get(i10).cloneSheet(this);
        cloneSheet.setSelected(false);
        cloneSheet.setActive(false);
        String uniqueSheetName = getUniqueSheetName(sheetName);
        int size = this._sheets.size();
        this._sheets.add(cloneSheet);
        this.workbook.setSheetName(size, uniqueSheetName);
        findExistingBuiltinNameRecordIdx(i10, (byte) 13);
        this.workbook.cloneDrawings(cloneSheet.getSheet());
        return cloneSheet;
    }

    public HSSFCellStyle createCellStyle() {
        if (this.workbook.getNumExFormats() != MAX_STYLES) {
            return new HSSFCellStyle((short) (getNumCellStyles() - 1), this.workbook.createCellXF(), this);
        }
        throw new IllegalStateException("The maximum number of cell styles was exceeded. You can define up to 4000 styles in a .xls workbook");
    }

    public HSSFDataFormat createDataFormat() {
        if (this.formatter == null) {
            this.formatter = new HSSFDataFormat(this.workbook);
        }
        return this.formatter;
    }

    public HSSFFont createFont() {
        this.workbook.createNewFont();
        short numberOfFonts = (short) (getNumberOfFonts() - 1);
        if (numberOfFonts > 3) {
            numberOfFonts = (short) (numberOfFonts + 1);
        }
        if (numberOfFonts != Short.MAX_VALUE) {
            return getFontAt(numberOfFonts);
        }
        throw new IllegalArgumentException("Maximum number of fonts was exceeded");
    }

    public HSSFName createName() {
        return null;
    }

    public HSSFSheet createSheet() {
        HSSFSheet hSSFSheet = new HSSFSheet(this);
        this._sheets.add(hSSFSheet);
        this.workbook.setSheetName(this._sheets.size() - 1, "Sheet" + (this._sheets.size() - 1));
        boolean z10 = this._sheets.size() == 1;
        hSSFSheet.setSelected(z10);
        hSSFSheet.setActive(z10);
        return hSSFSheet;
    }

    public void dumpDrawingGroupRecords(boolean z10) {
        DrawingGroupRecord drawingGroupRecord = (DrawingGroupRecord) this.workbook.findFirstRecordBySid(DrawingGroupRecord.sid);
        drawingGroupRecord.decode();
        List<EscherRecord> escherRecords = drawingGroupRecord.getEscherRecords();
        PrintWriter printWriter = new PrintWriter(System.out);
        for (EscherRecord escherRecord : escherRecords) {
            if (z10) {
                System.out.println(escherRecord.toString());
            } else {
                escherRecord.display(printWriter, 0);
            }
        }
        printWriter.flush();
    }

    public HSSFFont findFont(short s4, short s10, short s11, String str, boolean z10, boolean z11, short s12, byte b10) {
        for (short s13 = 0; s13 <= getNumberOfFonts(); s13 = (short) (s13 + 1)) {
            if (s13 != 4) {
                HSSFFont fontAt = getFontAt(s13);
                if (fontAt.getBoldweight() == s4 && fontAt.getColor() == s10 && fontAt.getFontHeight() == s11 && fontAt.getFontName().equals(str) && fontAt.getItalic() == z10 && fontAt.getStrikeout() == z11 && fontAt.getTypeOffset() == s12 && fontAt.getUnderline() == b10) {
                    return fontAt;
                }
            }
        }
        return null;
    }

    public String findSheetNameFromExternSheet(int i10) {
        return this.workbook.findSheetNameFromExternSheet(i10);
    }

    public int getActiveSheetIndex() {
        return this.workbook.getWindowOne().getActiveSheetIndex();
    }

    public List<HSSFObjectData> getAllEmbeddedObjects() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getNumberOfSheets(); i10++) {
            getAllEmbeddedObjects(getSheetAt(i10).getSheet().getRecords(), arrayList);
        }
        return arrayList;
    }

    public List<HSSFPictureData> getAllPictures() {
        ArrayList arrayList = new ArrayList();
        for (Record record : this.workbook.getRecords()) {
            if (record instanceof AbstractEscherHolderRecord) {
                AbstractEscherHolderRecord abstractEscherHolderRecord = (AbstractEscherHolderRecord) record;
                abstractEscherHolderRecord.decode();
                searchForPictures(abstractEscherHolderRecord.getEscherRecords(), arrayList);
            }
        }
        return arrayList;
    }

    public boolean getBackupFlag() {
        if (this.workbook.getBackupRecord().getBackup() == 0) {
            return false;
        }
        return true;
    }

    public byte[] getBytes() {
        HSSFSheet[] sheets = getSheets();
        int length = sheets.length;
        for (HSSFSheet hSSFSheet : sheets) {
            hSSFSheet.getSheet().preSerialize();
        }
        int size = this.workbook.getSize();
        SheetRecordCollector[] sheetRecordCollectorArr = new SheetRecordCollector[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.workbook.setSheetBof(i10, size);
            SheetRecordCollector sheetRecordCollector = new SheetRecordCollector();
            sheets[i10].getSheet().visitContainedRecords(sheetRecordCollector, size);
            size += sheetRecordCollector.getTotalSize();
            sheetRecordCollectorArr[i10] = sheetRecordCollector;
        }
        byte[] bArr = new byte[size];
        int serialize = this.workbook.serialize(0, bArr);
        for (int i11 = 0; i11 < length; i11++) {
            SheetRecordCollector sheetRecordCollector2 = sheetRecordCollectorArr[i11];
            int serialize2 = sheetRecordCollector2.serialize(serialize, bArr);
            if (serialize2 == sheetRecordCollector2.getTotalSize()) {
                serialize += serialize2;
            } else {
                StringBuilder e10 = d.e("Actual serialized sheet size (", serialize2, ") differs from pre-calculated size (");
                e10.append(sheetRecordCollector2.getTotalSize());
                e10.append(") for sheet (");
                e10.append(i11);
                e10.append(")");
                throw new IllegalStateException(e10.toString());
            }
        }
        return bArr;
    }

    public HSSFCellStyle getCellStyleAt(short s4) {
        ExtendedFormatRecord exFormatAt = this.workbook.getExFormatAt(s4);
        if (exFormatAt != null) {
            return new HSSFCellStyle(s4, exFormatAt, this);
        }
        return null;
    }

    public HSSFCreationHelper getCreationHelper() {
        return new HSSFCreationHelper(this);
    }

    public HSSFPalette getCustomPalette() {
        if (this.palette == null) {
            this.palette = new HSSFPalette(this.workbook.getCustomPalette());
        }
        return this.palette;
    }

    public short getDisplayedTab() {
        return (short) getFirstVisibleTab();
    }

    public int getExternalSheetIndex(int i10) {
        return this.workbook.checkExternSheet(i10);
    }

    public int getFirstVisibleTab() {
        return this.workbook.getWindowOne().getFirstVisibleTab();
    }

    public HSSFFont getFontAt(short s4) {
        if (this.fonts == null) {
            this.fonts = new Hashtable();
        }
        Short valueOf = Short.valueOf(s4);
        if (this.fonts.containsKey(valueOf)) {
            return (HSSFFont) this.fonts.get(valueOf);
        }
        HSSFFont hSSFFont = new HSSFFont(s4, this.workbook.getFontRecordAt(s4));
        this.fonts.put(valueOf, hSSFFont);
        return hSSFFont;
    }

    public boolean getForceFormulaRecalculation() {
        RecalcIdRecord recalcIdRecord = (RecalcIdRecord) getWorkbook().findFirstRecordBySid((short) 449);
        if (recalcIdRecord != null && recalcIdRecord.getEngineId() != 0) {
            return true;
        }
        return false;
    }

    public IRow.MissingCellPolicy getMissingCellPolicy() {
        return this.missingCellPolicy;
    }

    public HSSFName getName(String str) {
        int nameIndex = getNameIndex(str);
        if (nameIndex < 0) {
            return null;
        }
        return this.names.get(nameIndex);
    }

    public HSSFName getNameAt(int i10) {
        int size = this.names.size();
        if (size >= 1) {
            if (i10 >= 0 && i10 <= size) {
                return this.names.get(i10);
            }
            StringBuilder e10 = d.e("Specified name index ", i10, " is outside the allowable range (0..");
            e10.append(size - 1);
            e10.append(").");
            throw new IllegalArgumentException(e10.toString());
        }
        throw new IllegalStateException("There are no defined names in this workbook");
    }

    public int getNameIndex(String str) {
        for (int i10 = 0; i10 < this.names.size(); i10++) {
            if (getNameName(i10).equalsIgnoreCase(str)) {
                return i10;
            }
        }
        return -1;
    }

    public String getNameName(int i10) {
        return getNameAt(i10).getNameName();
    }

    public NameRecord getNameRecord(int i10) {
        return getWorkbook().getNameRecord(i10);
    }

    public short getNumCellStyles() {
        return (short) this.workbook.getNumExFormats();
    }

    public short getNumberOfFonts() {
        return (short) this.workbook.getNumberOfFontRecords();
    }

    public int getNumberOfNames() {
        return this.names.size();
    }

    @Override // lib.zj.office.fc.ss.usermodel.Workbook
    public int getNumberOfSheets() {
        return this._sheets.size();
    }

    public String getPrintArea(int i10) {
        this.workbook.getSpecificBuiltinRecord((byte) 6, i10 + 1);
        return null;
    }

    public String getSSTString(int i10) {
        return this.workbook.getSSTString(i10).getString();
    }

    public int getSSTUniqueStringSize() {
        return this.workbook.getSSTUniqueStringSize();
    }

    public short getSelectedTab() {
        return (short) getActiveSheetIndex();
    }

    public HSSFSheet getSheet(String str) {
        HSSFSheet hSSFSheet = null;
        for (int i10 = 0; i10 < this._sheets.size(); i10++) {
            if (this.workbook.getSheetName(i10).equalsIgnoreCase(str)) {
                hSSFSheet = this._sheets.get(i10);
            }
        }
        return hSSFSheet;
    }

    public int getSheetIndex(String str) {
        return this.workbook.getSheetIndex(str);
    }

    public int getSheetIndexFromExternSheetIndex(int i10) {
        return this.workbook.getSheetIndexFromExternSheetIndex(i10);
    }

    public String getSheetName(int i10) {
        validateSheetIndex(i10);
        return this.workbook.getSheetName(i10);
    }

    public UDFFinder getUDFFinder() {
        return this._udfFinder;
    }

    public InternalWorkbook getWorkbook() {
        return this.workbook;
    }

    public void initDrawings() {
        if (this.workbook.findDrawingGroup() != null) {
            for (int i10 = 0; i10 < getNumberOfSheets(); i10++) {
                getSheetAt(i10).getDrawingPatriarch();
            }
            return;
        }
        this.workbook.createDrawingGroup();
    }

    public void insertChartRecord() {
        this.workbook.getRecords().add(this.workbook.findFirstRecordLocBySid((short) 252), new UnknownRecord(235, new byte[]{15, 0, 0, -16, 82, 0, 0, 0, 0, 0, 6, -16, 24, 0, 0, 0, 1, 8, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, Field.MACROBUTTON, 0, 11, -16, 18, 0, 0, 0, -65, 0, 8, 0, 8, 0, -127, 1, 9, 0, 0, 8, -64, 1, 64, 0, 0, 8, 64, 0, 30, -15, 16, 0, 0, 0, 13, 0, 0, 8, 12, 0, 0, 8, 23, 0, 0, 8, -9, 0, 0, 16}));
    }

    public boolean isEmpty() {
        if (this._sheets.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isHidden() {
        return this.workbook.getWindowOne().getHidden();
    }

    public boolean isSheetHidden(int i10) {
        validateSheetIndex(i10);
        return this.workbook.isSheetHidden(i10);
    }

    public boolean isSheetVeryHidden(int i10) {
        validateSheetIndex(i10);
        return this.workbook.isSheetVeryHidden(i10);
    }

    public boolean isUsing1904DateWindowing() {
        return this.workbook.isUsing1904DateWindowing();
    }

    public boolean isWriteProtected() {
        return this.workbook.isWriteProtected();
    }

    public void removeName(int i10) {
        this.names.remove(i10);
        this.workbook.removeName(i10);
    }

    public void removePrintArea(int i10) {
        getWorkbook().removeBuiltinRecord((byte) 6, i10 + 1);
    }

    public void removeSheetAt(int i10) {
        validateSheetIndex(i10);
        boolean isActive = getSheetAt(i10).isActive();
        boolean isSelected = getSheetAt(i10).isSelected();
        this._sheets.remove(i10);
        this.workbook.removeSheet(i10);
        int size = this._sheets.size();
        boolean z10 = true;
        if (size < 1) {
            return;
        }
        if (i10 >= size) {
            i10 = size - 1;
        }
        if (isActive) {
            setActiveSheet(i10);
        }
        if (isSelected) {
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (getSheetAt(i11).isSelected()) {
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                setSelectedTab(i10);
            }
        }
    }

    public void resetFontCache() {
        this.fonts = new Hashtable();
    }

    public String resolveNameXText(int i10, int i11) {
        return this.workbook.resolveNameXText(i10, i11);
    }

    public void setActiveSheet(int i10) {
        boolean z10;
        validateSheetIndex(i10);
        int size = this._sheets.size();
        for (int i11 = 0; i11 < size; i11++) {
            HSSFSheet sheetAt = getSheetAt(i11);
            if (i11 == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            sheetAt.setActive(z10);
        }
        this.workbook.getWindowOne().setActiveSheetIndex(i10);
    }

    public void setBackupFlag(boolean z10) {
        this.workbook.getBackupRecord().setBackup(z10 ? (short) 1 : (short) 0);
    }

    public void setDisplayedTab(short s4) {
        setFirstVisibleTab(s4);
    }

    public void setFirstVisibleTab(int i10) {
        this.workbook.getWindowOne().setFirstVisibleTab(i10);
    }

    public void setForceFormulaRecalculation(boolean z10) {
        getWorkbook().getRecalcId().setEngineId(0);
    }

    public void setHidden(boolean z10) {
        this.workbook.getWindowOne().setHidden(z10);
    }

    public void setMissingCellPolicy(IRow.MissingCellPolicy missingCellPolicy) {
        this.missingCellPolicy = missingCellPolicy;
    }

    public void setPrintArea(int i10, String str) {
        int i11 = i10 + 1;
        if (this.workbook.getSpecificBuiltinRecord((byte) 6, i11) == null) {
            this.workbook.createBuiltInName((byte) 6, i11);
        }
        String[] split = COMMA_PATTERN.split(str);
        StringBuffer stringBuffer = new StringBuffer(32);
        for (int i12 = 0; i12 < split.length; i12++) {
            if (i12 > 0) {
                stringBuffer.append(",");
            }
            SheetNameFormatter.appendFormat(stringBuffer, getSheetName(i10));
            stringBuffer.append("!");
            stringBuffer.append(split[i12]);
        }
    }

    public void setRepeatingRowsAndColumns(int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        NameRecord nameRecord;
        NameRecord nameRecord2;
        boolean z12;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (i11 == -1 && i12 != -1) {
            throw new IllegalArgumentException("Invalid column range specification");
        }
        if (i13 == -1 && i14 != -1) {
            throw new IllegalArgumentException("Invalid row range specification");
        }
        if (i11 >= -1 && i11 < 255) {
            if (i12 >= -1 && i12 < 255) {
                if (i13 >= -1 && i13 <= 65535) {
                    if (i14 >= -1 && i14 <= 65535) {
                        if (i11 <= i12) {
                            if (i13 <= i14) {
                                HSSFSheet sheetAt = getSheetAt(i10);
                                short checkExternSheet = getWorkbook().checkExternSheet(i10);
                                if (i11 != -1 && i12 != -1 && i13 != -1 && i14 != -1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (i11 == -1 && i12 == -1 && i13 == -1 && i14 == -1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                int findExistingBuiltinNameRecordIdx = findExistingBuiltinNameRecordIdx(i10, (byte) 7);
                                if (z11) {
                                    if (findExistingBuiltinNameRecordIdx >= 0) {
                                        this.workbook.removeName(findExistingBuiltinNameRecordIdx);
                                        return;
                                    }
                                    return;
                                }
                                if (findExistingBuiltinNameRecordIdx < 0) {
                                    nameRecord = this.workbook.createBuiltInName((byte) 7, i10 + 1);
                                } else {
                                    nameRecord = this.workbook.getNameRecord(findExistingBuiltinNameRecordIdx);
                                }
                                NameRecord nameRecord3 = nameRecord;
                                ArrayList arrayList3 = new ArrayList();
                                if (z10) {
                                    arrayList3.add(new MemFuncPtg(23));
                                }
                                if (i11 >= 0) {
                                    nameRecord2 = nameRecord3;
                                    z12 = true;
                                    arrayList = arrayList3;
                                    arrayList.add(new Area3DPtg(0, 65535, i11, i12, false, false, false, false, checkExternSheet));
                                } else {
                                    nameRecord2 = nameRecord3;
                                    z12 = true;
                                    arrayList = arrayList3;
                                }
                                if (i13 >= 0) {
                                    arrayList2 = arrayList;
                                    arrayList2.add(new Area3DPtg(i13, i14, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, false, false, false, false, checkExternSheet));
                                } else {
                                    arrayList2 = arrayList;
                                }
                                if (z10) {
                                    arrayList2.add(UnionPtg.instance);
                                }
                                Ptg[] ptgArr = new Ptg[arrayList2.size()];
                                arrayList2.toArray(ptgArr);
                                nameRecord2.setNameDefinition(ptgArr);
                                sheetAt.getPrintSetup().setValidSettings(false);
                                sheetAt.setActive(z12);
                                return;
                            }
                            throw new IllegalArgumentException("Invalid row range specification");
                        }
                        throw new IllegalArgumentException("Invalid column range specification");
                    }
                    throw new IllegalArgumentException("Invalid row range specification");
                }
                throw new IllegalArgumentException("Invalid row range specification");
            }
            throw new IllegalArgumentException("Invalid column range specification");
        }
        throw new IllegalArgumentException("Invalid column range specification");
    }

    public void setSelectedTab(int i10) {
        validateSheetIndex(i10);
        int size = this._sheets.size();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 < size) {
                HSSFSheet sheetAt = getSheetAt(i11);
                if (i11 != i10) {
                    z10 = false;
                }
                sheetAt.setSelected(z10);
                i11++;
            } else {
                this.workbook.getWindowOne().setNumSelectedTabs((short) 1);
                return;
            }
        }
    }

    public void setSelectedTabs(int[] iArr) {
        boolean z10;
        for (int i10 : iArr) {
            validateSheetIndex(i10);
        }
        int size = this._sheets.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 < iArr.length) {
                    if (iArr[i12] == i11) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            getSheetAt(i11).setSelected(z10);
        }
        this.workbook.getWindowOne().setNumSelectedTabs((short) iArr.length);
    }

    public void setSheetHidden(int i10, boolean z10) {
        validateSheetIndex(i10);
        this.workbook.setSheetHidden(i10, z10);
    }

    public void setSheetName(int i10, String str) {
        if (str != null) {
            if (!this.workbook.doesContainsSheetName(str, i10)) {
                validateSheetIndex(i10);
                this.workbook.setSheetName(i10, str);
                return;
            }
            throw new IllegalArgumentException("The workbook already contains a sheet with this name");
        }
        throw new IllegalArgumentException("sheetName must not be null");
    }

    public void setSheetOrder(String str, int i10) {
        int sheetIndex = getSheetIndex(str);
        List<HSSFSheet> list = this._sheets;
        list.add(i10, list.remove(sheetIndex));
        this.workbook.setSheetOrder(str, i10);
        FormulaShifter createForSheetShift = FormulaShifter.createForSheetShift(sheetIndex, i10);
        for (HSSFSheet hSSFSheet : this._sheets) {
            hSSFSheet.getSheet().updateFormulasAfterCellShift(createForSheetShift, -1);
        }
        this.workbook.updateNamesAfterCellShift(createForSheetShift);
    }

    public void unwriteProtectWorkbook() {
        this.workbook.unwriteProtectWorkbook();
    }

    @Override // lib.zj.office.fc.a
    public void write(OutputStream outputStream) {
        byte[] bytes = getBytes();
        POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
        ArrayList arrayList = new ArrayList(1);
        pOIFSFileSystem.createDocument(new ByteArrayInputStream(bytes), "Workbook");
        writeProperties(pOIFSFileSystem, arrayList);
        if (this.preserveNodes) {
            arrayList.add("Workbook");
            arrayList.add("WORKBOOK");
            copyNodes(this.directory, pOIFSFileSystem.getRoot(), arrayList);
            pOIFSFileSystem.getRoot().setStorageClsid(this.directory.getStorageClsid());
        }
        pOIFSFileSystem.writeFilesystem(outputStream);
    }

    public void writeProtectWorkbook(String str, String str2) {
        this.workbook.writeProtectWorkbook(str, str2);
    }

    private HSSFWorkbook(InternalWorkbook internalWorkbook) {
        super((DirectoryNode) null);
        this.missingCellPolicy = IRow.RETURN_NULL_AND_BLANK;
        this._udfFinder = UDFFinder.DEFAULT;
        this.workbook = internalWorkbook;
        this._sheets = new ArrayList(3);
        this.names = new ArrayList<>(3);
    }

    @Override // lib.zj.office.fc.ss.usermodel.Workbook
    public HSSFSheet getSheetAt(int i10) {
        validateSheetIndex(i10);
        return this._sheets.get(i10);
    }

    public int getSheetIndex(Sheet sheet) {
        for (int i10 = 0; i10 < this._sheets.size(); i10++) {
            if (this._sheets.get(i10) == sheet) {
                return i10;
            }
        }
        return -1;
    }

    public void removeName(String str) {
        removeName(getNameIndex(str));
    }

    public void setSheetHidden(int i10, int i11) {
        validateSheetIndex(i10);
        WorkbookUtil.validateSheetState(i11);
        this.workbook.setSheetHidden(i10, i11);
    }

    private void getAllEmbeddedObjects(List<RecordBase> list, List<HSSFObjectData> list2) {
        for (RecordBase recordBase : list) {
            if (recordBase instanceof ObjRecord) {
                ObjRecord objRecord = (ObjRecord) recordBase;
                for (SubRecord subRecord : objRecord.getSubRecords()) {
                    if (subRecord instanceof EmbeddedObjectRefSubRecord) {
                        list2.add(new HSSFObjectData(objRecord, this.directory));
                    }
                }
            }
        }
    }

    public void setSelectedTab(short s4) {
        setSelectedTab((int) s4);
    }

    public HSSFSheet createSheet(String str) {
        if (str != null) {
            if (!this.workbook.doesContainsSheetName(str, this._sheets.size())) {
                HSSFSheet hSSFSheet = new HSSFSheet(this);
                this.workbook.setSheetName(this._sheets.size(), str);
                this._sheets.add(hSSFSheet);
                boolean z10 = this._sheets.size() == 1;
                hSSFSheet.setSelected(z10);
                hSSFSheet.setActive(z10);
                return hSSFSheet;
            }
            throw new IllegalArgumentException("The workbook already contains a sheet of this name");
        }
        throw new IllegalArgumentException("sheetName must not be null");
    }

    public HSSFWorkbook(POIFSFileSystem pOIFSFileSystem) {
        this(pOIFSFileSystem, false);
    }

    public HSSFWorkbook(POIFSFileSystem pOIFSFileSystem, boolean z10) {
        this(pOIFSFileSystem.getRoot(), pOIFSFileSystem, z10);
    }

    public HSSFWorkbook(DirectoryNode directoryNode, POIFSFileSystem pOIFSFileSystem, boolean z10) {
        this(directoryNode, z10);
    }

    public void setPrintArea(int i10, int i11, int i12, int i13, int i14) {
        String formatAsString = new CellReference(i13, i11, true, true).formatAsString();
        CellReference cellReference = new CellReference(i14, i12, true, true);
        StringBuilder g10 = a0.d.g(formatAsString, ":");
        g10.append(cellReference.formatAsString());
        setPrintArea(i10, g10.toString());
    }

    public HSSFWorkbook(DirectoryNode directoryNode, boolean z10) {
        super(directoryNode);
        this.missingCellPolicy = IRow.RETURN_NULL_AND_BLANK;
        this._udfFinder = UDFFinder.DEFAULT;
        String workbookDirEntryName = getWorkbookDirEntryName(directoryNode);
        this.preserveNodes = z10;
        if (!z10) {
            this.directory = null;
        }
        this._sheets = new ArrayList(3);
        this.names = new ArrayList<>(3);
        List<Record> createRecords = RecordFactory.createRecords(directoryNode.createDocumentInputStream(workbookDirEntryName));
        InternalWorkbook createWorkbook = InternalWorkbook.createWorkbook(createRecords);
        this.workbook = createWorkbook;
        setPropertiesFromWorkbook(createWorkbook);
        int numRecords = this.workbook.getNumRecords();
        convertLabelRecords(createRecords, numRecords);
        RecordStream recordStream = new RecordStream(createRecords, numRecords);
        while (recordStream.hasNext()) {
            this._sheets.add(new HSSFSheet(this, InternalSheet.createSheet(recordStream)));
        }
        for (int i10 = 0; i10 < this.workbook.getNumNames(); i10++) {
        }
    }

    public HSSFWorkbook(InputStream inputStream) {
        this(inputStream, true);
    }

    public HSSFWorkbook(InputStream inputStream, boolean z10) {
        this(new POIFSFileSystem(inputStream), z10);
    }
}
