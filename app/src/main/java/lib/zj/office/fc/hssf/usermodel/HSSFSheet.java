package lib.zj.office.fc.hssf.usermodel;

import a6.h;
import b.a;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.model.InternalSheet;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.AutoFilterInfoRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.EscherAggregate;
import lib.zj.office.fc.hssf.record.NameRecord;
import lib.zj.office.fc.hssf.record.NoteRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RowRecord;
import lib.zj.office.fc.hssf.record.SCLRecord;
import lib.zj.office.fc.hssf.record.WSBoolRecord;
import lib.zj.office.fc.hssf.record.aggregates.FormulaRecordAggregate;
import lib.zj.office.fc.hssf.record.aggregates.WorksheetProtectionBlock;
import lib.zj.office.fc.hssf.util.ColumnInfo;
import lib.zj.office.fc.hssf.util.HSSFPaneInformation;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.usermodel.CellRange;
import lib.zj.office.fc.ss.usermodel.DataValidation;
import lib.zj.office.fc.ss.usermodel.DataValidationHelper;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.ICellStyle;
import lib.zj.office.fc.ss.usermodel.IRow;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.ss.util.Region;
import lib.zj.office.fc.ss.util.SSCellRange;
import lib.zj.office.fc.ss.util.SheetUtil;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class HSSFSheet implements Sheet {
    public static final int INITIAL_CAPACITY = 20;
    protected final InternalWorkbook _book;
    private int _firstrow;
    private int _lastrow;
    private HSSFPatriarch _patriarch;
    private final TreeMap<Integer, HSSFRow> _rows;
    private final InternalSheet _sheet;
    protected final HSSFWorkbook _workbook;
    private int column_activecell;
    private boolean isInitForDraw;
    HSSFPaneInformation paneInformation;
    private int row_activecell;
    private int scrollX;
    private int scrollY;
    private float zoom;
    private static final POILogger log = POILogFactory.getLogger(HSSFSheet.class);
    private static final int DEBUG = POILogger.DEBUG;

    public HSSFSheet(HSSFWorkbook hSSFWorkbook) {
        this.zoom = 1.0f;
        this.row_activecell = -1;
        this.column_activecell = -1;
        this._sheet = InternalSheet.createSheet();
        this._rows = new TreeMap<>();
        this._workbook = hSSFWorkbook;
        this._book = hSSFWorkbook.getWorkbook();
    }

    private void addRow(HSSFRow hSSFRow, boolean z10) {
        this._rows.put(Integer.valueOf(hSSFRow.getRowNum()), hSSFRow);
        if (z10) {
            this._sheet.addRow(hSSFRow.getRowRecord());
        }
        boolean z11 = true;
        if (this._rows.size() != 1) {
            z11 = false;
        }
        if (hSSFRow.getRowNum() > getLastRowNum() || z11) {
            this._lastrow = hSSFRow.getRowNum();
        }
        if (hSSFRow.getRowNum() < getFirstRowNum() || z11) {
            this._firstrow = hSSFRow.getRowNum();
        }
    }

    private HSSFRow createRowFromRecord(RowRecord rowRecord) {
        HSSFRow hSSFRow = new HSSFRow(this._workbook, this, rowRecord);
        addRow(hSSFRow, false);
        return hSSFRow;
    }

    private int findFirstRow(int i10) {
        int i11 = i10 + 1;
        HSSFRow row = getRow(i11);
        while (row == null && i11 <= getLastRowNum()) {
            i11++;
            row = getRow(i11);
        }
        if (i11 > getLastRowNum()) {
            return 0;
        }
        return i11;
    }

    private int findLastRow(int i10) {
        if (i10 < 1) {
            return 0;
        }
        int i11 = i10 - 1;
        HSSFRow row = getRow(i11);
        while (row == null && i11 > 0) {
            i11--;
            row = getRow(i11);
        }
        if (row == null) {
            return 0;
        }
        return i11;
    }

    private CellRange<HSSFCell> getCellRange(HSSFCellRangeAddress hSSFCellRangeAddress) {
        int firstRow = hSSFCellRangeAddress.getFirstRow();
        int firstColumn = hSSFCellRangeAddress.getFirstColumn();
        int lastRow = hSSFCellRangeAddress.getLastRow();
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        int i10 = (lastRow - firstRow) + 1;
        int i11 = (lastColumn - firstColumn) + 1;
        ArrayList arrayList = new ArrayList(i10 * i11);
        for (int i12 = firstRow; i12 <= lastRow; i12++) {
            for (int i13 = firstColumn; i13 <= lastColumn; i13++) {
                HSSFRow row = getRow(i12);
                if (row == null) {
                    row = createRow(i12);
                }
                HSSFCell cell = row.getCell(i13);
                if (cell == null) {
                    cell = row.createCell(i13);
                }
                arrayList.add(cell);
            }
        }
        return SSCellRange.create(firstRow, firstColumn, i10, i11, arrayList, HSSFCell.class);
    }

    private WorksheetProtectionBlock getProtectionBlock() {
        return this._sheet.getProtectionBlock();
    }

    private void notifyRowShifting(HSSFRow hSSFRow) {
        String str = "Row[rownum=" + hSSFRow.getRowNum() + "] contains cell(s) included in a multi-cell array formula. You cannot change part of an array.";
        Iterator<ICell> it = hSSFRow.iterator();
        while (it.hasNext()) {
            HSSFCell hSSFCell = (HSSFCell) it.next();
            if (hSSFCell.isPartOfArrayFormulaGroup()) {
                hSSFCell.notifyArrayFormulaChanging(str);
            }
        }
    }

    private void setPropertiesFromSheet(InternalSheet internalSheet) {
        boolean z10;
        HSSFRow hSSFRow;
        RowRecord nextRow = internalSheet.getNextRow();
        if (nextRow != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        while (nextRow != null) {
            createRowFromRecord(nextRow);
            nextRow = internalSheet.getNextRow();
        }
        Iterator<CellValueRecordInterface> cellValueIterator = internalSheet.getCellValueIterator();
        long currentTimeMillis = System.currentTimeMillis();
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "Time at start of cell creating in HSSF sheet = ", Long.valueOf(currentTimeMillis));
        }
        HSSFRow hSSFRow2 = null;
        while (cellValueIterator.hasNext()) {
            CellValueRecordInterface next = cellValueIterator.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            if ((hSSFRow2 == null || hSSFRow2.getRowNum() != next.getRow()) && (hSSFRow2 = getRow(next.getRow())) == null) {
                if (!z10) {
                    RowRecord rowRecord = new RowRecord(next.getRow());
                    internalSheet.addRow(rowRecord);
                    HSSFRow createRowFromRecord = createRowFromRecord(rowRecord);
                    hSSFRow = hSSFRow2;
                    hSSFRow2 = createRowFromRecord;
                } else {
                    throw new RuntimeException("Unexpected missing row when some rows already present");
                }
            } else {
                hSSFRow = hSSFRow2;
            }
            POILogger pOILogger2 = log;
            if (pOILogger2.check(POILogger.DEBUG)) {
                int i10 = DEBUG;
                pOILogger2.log(i10, "record id = " + Integer.toHexString(((Record) next).getSid()));
            }
            hSSFRow2.createCellFromRecord(next);
            if (pOILogger2.check(POILogger.DEBUG)) {
                pOILogger2.log(DEBUG, "record took ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
            }
            hSSFRow2 = hSSFRow;
        }
        POILogger pOILogger3 = log;
        if (pOILogger3.check(POILogger.DEBUG)) {
            pOILogger3.log(DEBUG, "total sheet cell creation took ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    private void validateArrayFormulas(HSSFCellRangeAddress hSSFCellRangeAddress) {
        HSSFCell cell;
        int firstColumn = hSSFCellRangeAddress.getFirstColumn();
        int lastRow = hSSFCellRangeAddress.getLastRow();
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        for (int firstRow = hSSFCellRangeAddress.getFirstRow(); firstRow <= lastRow; firstRow++) {
            for (int i10 = firstColumn; i10 <= lastColumn; i10++) {
                HSSFRow row = getRow(firstRow);
                if (row != null && (cell = row.getCell(i10)) != null && cell.isPartOfArrayFormulaGroup()) {
                    HSSFCellRangeAddress arrayFormulaRange = cell.getArrayFormulaRange();
                    if (arrayFormulaRange.getNumberOfCells() > 1 && (arrayFormulaRange.isInRange(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getFirstColumn()) || arrayFormulaRange.isInRange(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getFirstColumn()))) {
                        throw new IllegalStateException("The range " + hSSFCellRangeAddress.formatAsString() + " intersects with a multi-cell array formula. You cannot merge cells of an array.");
                    }
                }
            }
        }
    }

    public int addMergedRegion(Region region) {
        return this._sheet.addMergedRegion(region.getRowFrom(), region.getColumnFrom(), region.getRowTo(), region.getColumnTo());
    }

    public void addValidationData(DataValidation dataValidation) {
        if (dataValidation != null) {
            this._sheet.getOrCreateDataValidityTable().addDataValidation(((HSSFDataValidation) dataValidation).createDVRecord(this));
            return;
        }
        throw new IllegalArgumentException("objValidation must not be null");
    }

    public void autoSizeColumn(int i10) {
        autoSizeColumn(i10, false);
    }

    public HSSFSheet cloneSheet(HSSFWorkbook hSSFWorkbook) {
        return new HSSFSheet(hSSFWorkbook, this._sheet.cloneSheet());
    }

    public HSSFPatriarch createDrawingPatriarch() {
        if (this._patriarch == null) {
            this._workbook.initDrawings();
            if (this._patriarch == null) {
                this._sheet.aggregateDrawingRecords(this._book.getDrawingManager(), true);
                ((EscherAggregate) this._sheet.findFirstRecordBySid(EscherAggregate.sid)).setPatriarch(this._patriarch);
            }
        }
        return this._patriarch;
    }

    public void createFreezePane(int i10, int i11, int i12, int i13) {
        validateColumn(i10);
        validateRow(i11);
        if (i12 < i10) {
            throw new IllegalArgumentException("leftmostColumn parameter must not be less than colSplit parameter");
        }
        if (i13 >= i11) {
            getSheet().createFreezePane(i10, i11, i13, i12);
            return;
        }
        throw new IllegalArgumentException("topRow parameter must not be less than leftmostColumn parameter");
    }

    public HSSFRow createRow(int i10) {
        HSSFRow hSSFRow = new HSSFRow(this._workbook, this, i10);
        addRow(hSSFRow, true);
        return hSSFRow;
    }

    public void createSplitPane(int i10, int i11, int i12, int i13, int i14) {
        getSheet().createSplitPane(i10, i11, i13, i12, i14);
    }

    public void dumpDrawingRecords(boolean z10) {
        this._sheet.aggregateDrawingRecords(this._book.getDrawingManager(), false);
        List<EscherRecord> escherRecords = ((EscherAggregate) getSheet().findFirstRecordBySid(EscherAggregate.sid)).getEscherRecords();
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

    public HSSFCell getActiveCell() {
        if (getRow(this.row_activecell) != null) {
            return getRow(this.row_activecell).getCell(this.column_activecell);
        }
        return null;
    }

    public int getActiveCellColumn() {
        return this.column_activecell;
    }

    public int getActiveCellRow() {
        return this.row_activecell;
    }

    public boolean getAlternateExpression() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getAlternateExpression();
    }

    public boolean getAlternateFormula() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getAlternateFormula();
    }

    public boolean getAutobreaks() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getAutobreaks();
    }

    public HSSFComment getCellComment(int i10, int i11) {
        HSSFRow row = getRow(i10);
        if (row != null) {
            HSSFCell cell = row.getCell(i11);
            if (cell != null) {
                return cell.getCellComment();
            }
            return HSSFCell.findCellComment(this._sheet, i10, i11);
        }
        return null;
    }

    public int[] getColumnBreaks() {
        return this._sheet.getPageSettings().getColumnBreaks();
    }

    public List<ColumnInfo> getColumnInfo() {
        return this._sheet.getColumnInfo();
    }

    public int getColumnPixelWidth(int i10) {
        return this._sheet.getColumnPixelWidth(i10);
    }

    public HSSFCellStyle getColumnStyle(int i10) {
        short xFIndexForColAt = this._sheet.getXFIndexForColAt((short) i10);
        if (xFIndexForColAt == 15) {
            return null;
        }
        return new HSSFCellStyle(xFIndexForColAt, this._book.getExFormatAt(xFIndexForColAt), this._book);
    }

    public short getColumnWidth(short s4) {
        return (short) getColumnWidth(s4 & 65535);
    }

    public DataValidationHelper getDataValidationHelper() {
        return new HSSFDataValidationHelper(this);
    }

    public int getDefaultColumnWidth() {
        return this._sheet.getDefaultColumnWidth();
    }

    public short getDefaultRowHeight() {
        return this._sheet.getDefaultRowHeight();
    }

    public float getDefaultRowHeightInPoints() {
        return this._sheet.getDefaultRowHeight() / 20.0f;
    }

    public boolean getDialog() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getDialog();
    }

    public boolean getDisplayGuts() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getDisplayGuts();
    }

    public EscherAggregate getDrawingEscherAggregate() {
        this._book.findDrawingGroup();
        if (this._book.getDrawingManager() == null || this._sheet.aggregateDrawingRecords(this._book.getDrawingManager(), false) == -1) {
            return null;
        }
        return (EscherAggregate) this._sheet.findFirstRecordBySid(EscherAggregate.sid);
    }

    public HSSFPatriarch getDrawingPatriarch() {
        HSSFPatriarch hSSFPatriarch = this._patriarch;
        if (hSSFPatriarch != null) {
            return hSSFPatriarch;
        }
        EscherAggregate drawingEscherAggregate = getDrawingEscherAggregate();
        if (drawingEscherAggregate == null) {
            return null;
        }
        drawingEscherAggregate.setPatriarch(this._patriarch);
        drawingEscherAggregate.convertRecordsToUserModel(null);
        return this._patriarch;
    }

    public int getFirstRowNum() {
        return this._firstrow;
    }

    public boolean getFitToPage() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getFitToPage();
    }

    public HSSFFooter getFooter() {
        return new HSSFFooter(this._sheet.getPageSettings());
    }

    public boolean getForceFormulaRecalculation() {
        return this._sheet.getUncalced();
    }

    public HSSFHeader getHeader() {
        return new HSSFHeader(this._sheet.getPageSettings());
    }

    public boolean getHorizontallyCenter() {
        return this._sheet.getPageSettings().getHCenter().getHCenter();
    }

    public int getLastRowNum() {
        return this._lastrow;
    }

    public short getLeftCol() {
        return this._sheet.getLeftCol();
    }

    public double getMargin(short s4) {
        return this._sheet.getPageSettings().getMargin(s4);
    }

    public HSSFCellRangeAddress getMergedRegion(int i10) {
        return this._sheet.getMergedRegionAt(i10);
    }

    public lib.zj.office.fc.hssf.util.Region getMergedRegionAt(int i10) {
        HSSFCellRangeAddress mergedRegion = getMergedRegion(i10);
        return new lib.zj.office.fc.hssf.util.Region(mergedRegion.getFirstRow(), (short) mergedRegion.getFirstColumn(), mergedRegion.getLastRow(), (short) mergedRegion.getLastColumn());
    }

    public int getNumMergedRegions() {
        return this._sheet.getNumMergedRegions();
    }

    public boolean getObjectProtect() {
        return getProtectionBlock().isObjectProtected();
    }

    public HSSFPaneInformation getPaneInformation() {
        if (this.paneInformation == null) {
            this.paneInformation = getSheet().getPaneInformation();
        }
        return this.paneInformation;
    }

    public short getPassword() {
        return (short) getProtectionBlock().getPasswordHash();
    }

    public int getPhysicalNumberOfRows() {
        return this._rows.size();
    }

    public HSSFPrintSetup getPrintSetup() {
        return new HSSFPrintSetup(this._sheet.getPageSettings().getPrintSetup());
    }

    public boolean getProtect() {
        return getProtectionBlock().isSheetProtected();
    }

    public HSSFRow getRow(int i10) {
        return this._rows.get(Integer.valueOf(i10));
    }

    public int[] getRowBreaks() {
        return this._sheet.getPageSettings().getRowBreaks();
    }

    public boolean getRowSumsBelow() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getRowSumsBelow();
    }

    public boolean getRowSumsRight() {
        return ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).getRowSumsRight();
    }

    public boolean getScenarioProtect() {
        return getProtectionBlock().isScenarioProtected();
    }

    public int getScrollX() {
        return this.scrollX;
    }

    public int getScrollY() {
        return this.scrollY;
    }

    public InternalSheet getSheet() {
        return this._sheet;
    }

    public HSSFSheetConditionalFormatting getSheetConditionalFormatting() {
        return new HSSFSheetConditionalFormatting(this);
    }

    public String getSheetName() {
        HSSFWorkbook workbook = getWorkbook();
        return workbook.getSheetName(workbook.getSheetIndex(this));
    }

    public short getTopRow() {
        return this._sheet.getTopRow();
    }

    public boolean getVerticallyCenter(boolean z10) {
        return getVerticallyCenter();
    }

    public HSSFWorkbook getWorkbook() {
        return this._workbook;
    }

    public float getZoom() {
        return this.zoom;
    }

    public void groupColumn(short s4, short s10) {
        groupColumn(s4 & 65535, s10 & 65535);
    }

    public void groupRow(int i10, int i11) {
        this._sheet.groupRowRange(i10, i11, true);
    }

    public void insertChartRecords(List<Record> list) {
        this._sheet.getRecords().addAll(this._sheet.findFirstRecordLocBySid((short) 574), list);
    }

    public boolean isActive() {
        return getSheet().getWindowTwo().isActive();
    }

    public boolean isColumnBroken(int i10) {
        return this._sheet.getPageSettings().isColumnBroken(i10);
    }

    public boolean isColumnHidden(short s4) {
        return isColumnHidden(s4 & 65535);
    }

    public boolean isDisplayFormulas() {
        return this._sheet.isDisplayFormulas();
    }

    public boolean isDisplayGridlines() {
        return this._sheet.isDisplayGridlines();
    }

    public boolean isDisplayRowColHeadings() {
        return this._sheet.isDisplayRowColHeadings();
    }

    public boolean isDisplayZeros() {
        return this._sheet.getWindowTwo().getDisplayZeros();
    }

    public boolean isGridsPrinted() {
        return this._sheet.isGridsPrinted();
    }

    public boolean isInitForDraw() {
        return this.isInitForDraw;
    }

    public boolean isPrintGridlines() {
        return getSheet().getPrintGridlines().getPrintGridlines();
    }

    public boolean isRightToLeft() {
        return this._sheet.getWindowTwo().getArabic();
    }

    public boolean isRowBroken(int i10) {
        return this._sheet.getPageSettings().isRowBroken(i10);
    }

    public boolean isSelected() {
        return getSheet().getWindowTwo().getSelected();
    }

    public Iterator<IRow> iterator() {
        return rowIterator();
    }

    public void protectSheet(String str) {
        getProtectionBlock().protectSheet(str, true, true);
    }

    public CellRange<HSSFCell> removeArrayFormula(ICell iCell) {
        if (iCell.getSheet() == this) {
            CellValueRecordInterface cellValueRecord = ((HSSFCell) iCell).getCellValueRecord();
            if (cellValueRecord instanceof FormulaRecordAggregate) {
                CellRange<HSSFCell> cellRange = getCellRange(((FormulaRecordAggregate) cellValueRecord).removeArrayFormula(iCell.getRowIndex(), iCell.getColumnIndex()));
                for (HSSFCell hSSFCell : cellRange) {
                    hSSFCell.setCellType(3);
                }
                return cellRange;
            }
            throw new IllegalArgumentException(h.d("Cell ", new CellReference(iCell).formatAsString(), " is not part of an array formula."));
        }
        throw new IllegalArgumentException("Specified cell does not belong to this sheet.");
    }

    public void removeColumnBreak(int i10) {
        this._sheet.getPageSettings().removeColumnBreak(i10);
    }

    public void removeMergedRegion(int i10) {
        this._sheet.removeMergedRegion(i10);
    }

    public void removeRow(IRow iRow) {
        HSSFRow hSSFRow = (HSSFRow) iRow;
        if (iRow.getSheet() == this) {
            Iterator<ICell> it = iRow.iterator();
            while (it.hasNext()) {
                HSSFCell hSSFCell = (HSSFCell) it.next();
                if (hSSFCell.isPartOfArrayFormulaGroup()) {
                    hSSFCell.notifyArrayFormulaChanging("Row[rownum=" + iRow.getRowNum() + "] contains cell(s) included in a multi-cell array formula. You cannot change part of an array.");
                }
            }
            if (this._rows.size() > 0) {
                if (this._rows.remove(Integer.valueOf(iRow.getRowNum())) == iRow) {
                    if (hSSFRow.getRowNum() == getLastRowNum()) {
                        this._lastrow = findLastRow(this._lastrow);
                    }
                    if (hSSFRow.getRowNum() == getFirstRowNum()) {
                        this._firstrow = findFirstRow(this._firstrow);
                    }
                    this._sheet.removeRow(hSSFRow.getRowRecord());
                    return;
                }
                throw new IllegalArgumentException("Specified row does not belong to this sheet");
            }
            return;
        }
        throw new IllegalArgumentException("Specified row does not belong to this sheet");
    }

    public void removeRowBreak(int i10) {
        this._sheet.getPageSettings().removeRowBreak(i10);
    }

    public Iterator<IRow> rowIterator() {
        return this._rows.values().iterator();
    }

    public void setActive(boolean z10) {
        getSheet().getWindowTwo().setActive(z10);
    }

    public void setActiveCell(int i10, int i11) {
        this.row_activecell = i10;
        this.column_activecell = i11;
    }

    public void setAlternativeExpression(boolean z10) {
        ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).setAlternateExpression(z10);
    }

    public void setAlternativeFormula(boolean z10) {
        ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).setAlternateFormula(z10);
    }

    public CellRange<HSSFCell> setArrayFormula(String str, HSSFCellRangeAddress hSSFCellRangeAddress) {
        return null;
    }

    public HSSFAutoFilter setAutoFilter(HSSFCellRangeAddress hSSFCellRangeAddress) {
        InternalWorkbook workbook = this._workbook.getWorkbook();
        int sheetIndex = this._workbook.getSheetIndex(this);
        int i10 = sheetIndex + 1;
        NameRecord specificBuiltinRecord = workbook.getSpecificBuiltinRecord((byte) 13, i10);
        if (specificBuiltinRecord == null) {
            specificBuiltinRecord = workbook.createBuiltInName((byte) 13, i10);
        }
        specificBuiltinRecord.setNameDefinition(new Ptg[]{new Area3DPtg(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getLastRow(), hSSFCellRangeAddress.getFirstColumn(), hSSFCellRangeAddress.getLastColumn(), false, false, false, false, sheetIndex)});
        AutoFilterInfoRecord autoFilterInfoRecord = new AutoFilterInfoRecord();
        autoFilterInfoRecord.setNumEntries((short) ((hSSFCellRangeAddress.getLastColumn() + 1) - hSSFCellRangeAddress.getFirstColumn()));
        this._sheet.getRecords().add(this._sheet.findFirstRecordLocBySid((short) 512), autoFilterInfoRecord);
        HSSFPatriarch createDrawingPatriarch = createDrawingPatriarch();
        int firstColumn = hSSFCellRangeAddress.getFirstColumn();
        while (firstColumn <= hSSFCellRangeAddress.getLastColumn()) {
            firstColumn++;
            createDrawingPatriarch.createComboBox(new HSSFClientAnchor(0, 0, 0, 0, (short) firstColumn, hSSFCellRangeAddress.getFirstRow(), (short) firstColumn, hSSFCellRangeAddress.getFirstRow() + 1));
        }
        return new HSSFAutoFilter(this);
    }

    public void setAutobreaks(boolean z10) {
        ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).setAutobreaks(z10);
    }

    public void setColumnBreak(int i10) {
        short s4 = (short) i10;
        validateColumn(s4);
        this._sheet.getPageSettings().setColumnBreak(s4, (short) 0, (short) SpreadsheetVersion.EXCEL97.getLastRowIndex());
    }

    public void setColumnGroupCollapsed(short s4, boolean z10) {
        setColumnGroupCollapsed(s4 & 65535, z10);
    }

    public void setColumnHidden(short s4, boolean z10) {
        setColumnHidden(s4 & 65535, z10);
    }

    public void setColumnPixelWidth(int i10, int i11) {
        this._sheet.setColumnPixelWidth(i10, i11);
    }

    public void setColumnWidth(short s4, short s10) {
        setColumnWidth(s4 & 65535, s10 & 65535);
    }

    public void setDefaultColumnStyle(int i10, ICellStyle iCellStyle) {
        this._sheet.setDefaultColumnStyle(i10, ((HSSFCellStyle) iCellStyle).getIndex());
    }

    public void setDefaultColumnWidth(short s4) {
        setDefaultColumnWidth(s4 & 65535);
    }

    public void setDefaultRowHeight(short s4) {
        this._sheet.setDefaultRowHeight(s4);
    }

    public void setDefaultRowHeightInPoints(float f10) {
        this._sheet.setDefaultRowHeight((short) (f10 * 20.0f));
    }

    public void setDialog(boolean z10) {
        ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).setDialog(z10);
    }

    public void setDisplayFormulas(boolean z10) {
        this._sheet.setDisplayFormulas(z10);
    }

    public void setDisplayGridlines(boolean z10) {
        this._sheet.setDisplayGridlines(z10);
    }

    public void setDisplayGuts(boolean z10) {
        ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).setDisplayGuts(z10);
    }

    public void setDisplayRowColHeadings(boolean z10) {
        this._sheet.setDisplayRowColHeadings(z10);
    }

    public void setDisplayZeros(boolean z10) {
        this._sheet.getWindowTwo().setDisplayZeros(z10);
    }

    public void setFitToPage(boolean z10) {
        ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).setFitToPage(z10);
    }

    public void setForceFormulaRecalculation(boolean z10) {
        this._sheet.setUncalced(z10);
    }

    public void setGridsPrinted(boolean z10) {
        this._sheet.setGridsPrinted(z10);
    }

    public void setHorizontallyCenter(boolean z10) {
        this._sheet.getPageSettings().getHCenter().setHCenter(z10);
    }

    public void setInitForDraw(boolean z10) {
        this.isInitForDraw = z10;
    }

    public void setMargin(short s4, double d10) {
        this._sheet.getPageSettings().setMargin(s4, d10);
    }

    public void setPrintGridlines(boolean z10) {
        getSheet().getPrintGridlines().setPrintGridlines(z10);
    }

    public void setRightToLeft(boolean z10) {
        this._sheet.getWindowTwo().setArabic(z10);
    }

    public void setRowBreak(int i10) {
        validateRow(i10);
        this._sheet.getPageSettings().setRowBreak(i10, (short) 0, (short) 255);
    }

    public void setRowGroupCollapsed(int i10, boolean z10) {
        if (z10) {
            this._sheet.getRowsAggregate().collapseRow(i10);
        } else {
            this._sheet.getRowsAggregate().expandRow(i10);
        }
    }

    public void setRowSumsBelow(boolean z10) {
        WSBoolRecord wSBoolRecord = (WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129);
        wSBoolRecord.setRowSumsBelow(z10);
        wSBoolRecord.setAlternateExpression(z10);
    }

    public void setRowSumsRight(boolean z10) {
        ((WSBoolRecord) this._sheet.findFirstRecordBySid((short) 129)).setRowSumsRight(z10);
    }

    public void setScroll(int i10, int i11) {
        this.scrollX = i10;
        this.scrollY = i11;
    }

    public void setSelected(boolean z10) {
        getSheet().getWindowTwo().setSelected(z10);
    }

    public void setVerticallyCenter(boolean z10) {
        this._sheet.getPageSettings().getVCenter().setVCenter(z10);
    }

    public void setZoom(int i10, int i11) {
        if (i10 < 1 || i10 > 65535) {
            throw new IllegalArgumentException("Numerator must be greater than 1 and less than 65536");
        }
        if (i11 >= 1 && i11 <= 65535) {
            SCLRecord sCLRecord = new SCLRecord();
            sCLRecord.setNumerator((short) i10);
            sCLRecord.setDenominator((short) i11);
            getSheet().setSCLRecord(sCLRecord);
            return;
        }
        throw new IllegalArgumentException("Denominator must be greater than 1 and less than 65536");
    }

    public void shiftMerged(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < getNumMergedRegions()) {
            HSSFCellRangeAddress mergedRegion = getMergedRegion(i13);
            if (mergedRegion.getFirstRow() < i10 && mergedRegion.getLastRow() < i10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (mergedRegion.getFirstRow() > i11 && mergedRegion.getLastRow() > i11) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z11 && z12 && !SheetUtil.containsCell(mergedRegion, i10 - 1, 0) && !SheetUtil.containsCell(mergedRegion, i11 + 1, 0)) {
                mergedRegion.setFirstRow(mergedRegion.getFirstRow() + i12);
                mergedRegion.setLastRow(mergedRegion.getLastRow() + i12);
                arrayList.add(mergedRegion);
                removeMergedRegion(i13);
                i13--;
            }
            i13++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addMergedRegion((HSSFCellRangeAddress) it.next());
        }
    }

    public void shiftRows(int i10, int i11, int i12) {
        shiftRows(i10, i11, i12, false, false);
    }

    public void showInPane(short s4, short s10) {
        this._sheet.setTopRow(s4);
        this._sheet.setLeftCol(s10);
    }

    public void ungroupColumn(short s4, short s10) {
        ungroupColumn(s4 & 65535, s10 & 65535);
    }

    public void ungroupRow(int i10, int i11) {
        this._sheet.groupRowRange(i10, i11, false);
    }

    public void validateColumn(int i10) {
        int lastColumnIndex = SpreadsheetVersion.EXCEL97.getLastColumnIndex();
        if (i10 <= lastColumnIndex) {
            if (i10 >= 0) {
                return;
            }
            throw new IllegalArgumentException("Minimum column number is 0");
        }
        throw new IllegalArgumentException(a.c("Maximum column number is ", lastColumnIndex));
    }

    public void validateRow(int i10) {
        int lastRowIndex = SpreadsheetVersion.EXCEL97.getLastRowIndex();
        if (i10 <= lastRowIndex) {
            if (i10 >= 0) {
                return;
            }
            throw new IllegalArgumentException("Minumum row number is 0");
        }
        throw new IllegalArgumentException(a.c("Maximum row number is ", lastRowIndex));
    }

    public void autoSizeColumn(int i10, boolean z10) {
        double columnWidth = SheetUtil.getColumnWidth(this, i10, z10);
        if (columnWidth != -1.0d) {
            double d10 = columnWidth * 256.0d;
            double d11 = 65280;
            if (d10 > d11) {
                d10 = d11;
            }
            setColumnWidth(i10, (int) d10);
        }
    }

    public int getColumnWidth(int i10) {
        return this._sheet.getColumnWidth(i10);
    }

    public boolean getVerticallyCenter() {
        return this._sheet.getPageSettings().getVCenter().getVCenter();
    }

    public void groupColumn(int i10, int i11) {
        this._sheet.groupColumnRange(i10, i11, true);
    }

    public boolean isColumnHidden(int i10) {
        return this._sheet.isColumnHidden(i10);
    }

    public void setColumnGroupCollapsed(int i10, boolean z10) {
        this._sheet.setColumnGroupCollapsed(i10, z10);
    }

    public void setColumnHidden(int i10, boolean z10) {
        this._sheet.setColumnHidden(i10, z10);
    }

    public void setColumnWidth(int i10, int i11) {
        this._sheet.setColumnWidth(i10, i11);
    }

    public void setDefaultColumnWidth(int i10) {
        this._sheet.setDefaultColumnWidth(i10);
    }

    public void shiftRows(int i10, int i11, int i12, boolean z10, boolean z11) {
        shiftRows(i10, i11, i12, z10, z11, true);
    }

    public void ungroupColumn(int i10, int i11) {
        this._sheet.groupColumnRange(i10, i11, false);
    }

    public void shiftRows(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12) {
        int i13;
        int i14;
        NoteRecord[] noteRecordArr;
        HSSFComment cellComment;
        if (i12 < 0) {
            i14 = i10;
            i13 = 1;
        } else if (i12 <= 0) {
            return;
        } else {
            i13 = -1;
            i14 = i11;
        }
        if (z12) {
            noteRecordArr = this._sheet.getNoteRecords();
        } else {
            noteRecordArr = NoteRecord.EMPTY_ARRAY;
        }
        shiftMerged(i10, i11, i12, true);
        this._sheet.getPageSettings().shiftRowBreaks(i10, i11, i12);
        while (i14 >= i10 && i14 <= i11 && i14 >= 0 && i14 < 65536) {
            HSSFRow row = getRow(i14);
            if (row != null) {
                notifyRowShifting(row);
            }
            int i15 = i14 + i12;
            HSSFRow row2 = getRow(i15);
            if (row2 == null) {
                row2 = createRow(i15);
            }
            row2.removeAllCells();
            if (row != null) {
                if (z10) {
                    row2.setHeight(row.getHeight());
                }
                if (z11) {
                    row.setHeight((short) 255);
                }
                Iterator<ICell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    HSSFCell hSSFCell = (HSSFCell) cellIterator.next();
                    row.removeCell(hSSFCell);
                    CellValueRecordInterface cellValueRecord = hSSFCell.getCellValueRecord();
                    cellValueRecord.setRow(i15);
                    row2.createCellFromRecord(cellValueRecord);
                    this._sheet.addValueRecord(i15, cellValueRecord);
                    HSSFHyperlink hyperlink = hSSFCell.getHyperlink();
                    if (hyperlink != null) {
                        hyperlink.setFirstRow(hyperlink.getFirstRow() + i12);
                        hyperlink.setLastRow(hyperlink.getLastRow() + i12);
                    }
                }
                row.removeAllCells();
                if (z12) {
                    for (int length = noteRecordArr.length - 1; length >= 0; length--) {
                        NoteRecord noteRecord = noteRecordArr[length];
                        if (noteRecord.getRow() == i14 && (cellComment = getCellComment(i14, noteRecord.getColumn())) != null) {
                            cellComment.setRow(i15);
                        }
                    }
                }
            }
            i14 += i13;
        }
        if (i12 > 0) {
            if (i10 == this._firstrow) {
                int i16 = i10 + i12;
                this._firstrow = Math.max(i16, 0);
                int i17 = i10 + 1;
                while (true) {
                    if (i17 >= i16) {
                        break;
                    } else if (getRow(i17) != null) {
                        this._firstrow = i17;
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            int i18 = i11 + i12;
            if (i18 > this._lastrow) {
                this._lastrow = Math.min(i18, SpreadsheetVersion.EXCEL97.getLastRowIndex());
            }
        } else {
            int i19 = i10 + i12;
            if (i19 < this._firstrow) {
                this._firstrow = Math.max(i19, 0);
            }
            if (i11 == this._lastrow) {
                int i20 = i11 + i12;
                this._lastrow = Math.min(i20, SpreadsheetVersion.EXCEL97.getLastRowIndex());
                int i21 = i11 - 1;
                while (true) {
                    if (i21 <= i20) {
                        break;
                    } else if (getRow(i21) != null) {
                        this._lastrow = i21;
                        break;
                    } else {
                        i21++;
                    }
                }
            }
        }
        short checkExternSheet = this._book.checkExternSheet(this._workbook.getSheetIndex(this));
        FormulaShifter createForRowShift = FormulaShifter.createForRowShift(checkExternSheet, i10, i11, i12);
        this._sheet.updateFormulasAfterCellShift(createForRowShift, checkExternSheet);
        int numberOfSheets = this._workbook.getNumberOfSheets();
        for (int i22 = 0; i22 < numberOfSheets; i22++) {
            InternalSheet sheet = this._workbook.getSheetAt(i22).getSheet();
            if (sheet != this._sheet) {
                sheet.updateFormulasAfterCellShift(createForRowShift, this._book.checkExternSheet(i22));
            }
        }
        this._workbook.getWorkbook().updateNamesAfterCellShift(createForRowShift);
    }

    public int addMergedRegion(HSSFCellRangeAddress hSSFCellRangeAddress) {
        hSSFCellRangeAddress.validate(SpreadsheetVersion.EXCEL97);
        validateArrayFormulas(hSSFCellRangeAddress);
        return this._sheet.addMergedRegion(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getFirstColumn(), hSSFCellRangeAddress.getLastRow(), hSSFCellRangeAddress.getLastColumn());
    }

    public void createFreezePane(int i10, int i11) {
        createFreezePane(i10, i11, i10, i11);
    }

    public void setZoom(float f10) {
        this.zoom = f10;
    }

    public HSSFSheet(HSSFWorkbook hSSFWorkbook, InternalSheet internalSheet) {
        this.zoom = 1.0f;
        this.row_activecell = -1;
        this.column_activecell = -1;
        this._sheet = internalSheet;
        this._rows = new TreeMap<>();
        this._workbook = hSSFWorkbook;
        this._book = hSSFWorkbook.getWorkbook();
        setPropertiesFromSheet(internalSheet);
    }
}
