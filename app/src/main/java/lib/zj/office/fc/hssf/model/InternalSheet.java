package lib.zj.office.fc.hssf.model;

import androidx.activity.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.hssf.record.CalcCountRecord;
import lib.zj.office.fc.hssf.record.CalcModeRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.ColumnInfoRecord;
import lib.zj.office.fc.hssf.record.ContinueRecord;
import lib.zj.office.fc.hssf.record.DefaultColWidthRecord;
import lib.zj.office.fc.hssf.record.DefaultRowHeightRecord;
import lib.zj.office.fc.hssf.record.DeltaRecord;
import lib.zj.office.fc.hssf.record.DimensionsRecord;
import lib.zj.office.fc.hssf.record.DrawingRecord;
import lib.zj.office.fc.hssf.record.EOFRecord;
import lib.zj.office.fc.hssf.record.EscherAggregate;
import lib.zj.office.fc.hssf.record.GridsetRecord;
import lib.zj.office.fc.hssf.record.GutsRecord;
import lib.zj.office.fc.hssf.record.IterationRecord;
import lib.zj.office.fc.hssf.record.NoteRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.record.PaneRecord;
import lib.zj.office.fc.hssf.record.PrintGridlinesRecord;
import lib.zj.office.fc.hssf.record.PrintHeadersRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.RefModeRecord;
import lib.zj.office.fc.hssf.record.RowRecord;
import lib.zj.office.fc.hssf.record.SCLRecord;
import lib.zj.office.fc.hssf.record.SaveRecalcRecord;
import lib.zj.office.fc.hssf.record.SelectionRecord;
import lib.zj.office.fc.hssf.record.TextObjectRecord;
import lib.zj.office.fc.hssf.record.UncalcedRecord;
import lib.zj.office.fc.hssf.record.WSBoolRecord;
import lib.zj.office.fc.hssf.record.WindowTwoRecord;
import lib.zj.office.fc.hssf.record.aggregates.ColumnInfoRecordsAggregate;
import lib.zj.office.fc.hssf.record.aggregates.ConditionalFormattingTable;
import lib.zj.office.fc.hssf.record.aggregates.DataValidityTable;
import lib.zj.office.fc.hssf.record.aggregates.MergedCellsTable;
import lib.zj.office.fc.hssf.record.aggregates.PageSettingsBlock;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;
import lib.zj.office.fc.hssf.record.aggregates.RowRecordsAggregate;
import lib.zj.office.fc.hssf.record.aggregates.WorksheetProtectionBlock;
import lib.zj.office.fc.hssf.record.chart.ChartRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFChart;
import lib.zj.office.fc.hssf.util.ColumnInfo;
import lib.zj.office.fc.hssf.util.HSSFPaneInformation;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.system.b;

@Internal
/* loaded from: classes3.dex */
public final class InternalSheet {
    public static final short BottomMargin = 3;
    public static final short LeftMargin = 0;
    public static final byte PANE_LOWER_LEFT = 2;
    public static final byte PANE_LOWER_RIGHT = 0;
    public static final byte PANE_UPPER_LEFT = 3;
    public static final byte PANE_UPPER_RIGHT = 1;
    public static final short RightMargin = 1;
    public static final short TopMargin = 2;
    private static POILogger log = POILogFactory.getLogger(InternalSheet.class);
    ColumnInfoRecordsAggregate _columnInfos;
    private DataValidityTable _dataValidityTable;
    private DimensionsRecord _dimensions;
    private GutsRecord _gutsRecord;
    protected boolean _isUncalced;
    private final MergedCellsTable _mergedCellsTable;
    private final WorksheetProtectionBlock _protectionBlock;
    private PageSettingsBlock _psBlock;
    private List<RecordBase> _records;
    protected final RowRecordsAggregate _rowsAggregate;
    protected SelectionRecord _selection;
    private ConditionalFormattingTable condFormatting;
    protected DefaultColWidthRecord defaultcolwidth;
    protected DefaultRowHeightRecord defaultrowheight;
    protected GridsetRecord gridset;
    protected PrintGridlinesRecord printGridlines;
    private Iterator<RowRecord> rowRecIterator;
    private int sheetType;
    protected WindowTwoRecord windowTwo;

    /* loaded from: classes3.dex */
    public static final class RecordCloner implements RecordAggregate.RecordVisitor {
        private final List<Record> _destList;

        public RecordCloner(List<Record> list) {
            this._destList = list;
        }

        @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate.RecordVisitor
        public void visitRecord(Record record) {
            this._destList.add((Record) record.clone());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e6, code lost:
        r10._rowsAggregate = r0;
        lib.zj.office.fc.hssf.model.RecordOrderer.addNewSheetRecord(r2, r10._mergedCellsTable);
        lib.zj.office.fc.hssf.model.RecordOrderer.addNewSheetRecord(r2, r10._protectionBlock);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
        if (lib.zj.office.fc.hssf.model.InternalSheet.log.check(lib.zj.office.fc.util.POILogger.DEBUG) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fc, code lost:
        lib.zj.office.fc.hssf.model.InternalSheet.log.log(lib.zj.office.fc.util.POILogger.DEBUG, "sheet createSheet (existing file) exited");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0206, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020e, code lost:
        throw new java.lang.RuntimeException("WINDOW2 was not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b6, code lost:
        if (r10.windowTwo == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ba, code lost:
        if (r10._dimensions != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
        if (r0 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01be, code lost:
        r0 = new lib.zj.office.fc.hssf.record.aggregates.RowRecordsAggregate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c5, code lost:
        lib.zj.office.fc.hssf.model.InternalSheet.log.log(lib.zj.office.fc.util.POILogger.WARN, "DIMENSION record not found even though row/cells present");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ce, code lost:
        r1 = findFirstRecordLocBySid(574);
        r11 = r0.createDimensions();
        r10._dimensions = r11;
        r2.add(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01db, code lost:
        if (r0 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dd, code lost:
        r0 = new lib.zj.office.fc.hssf.record.aggregates.RowRecordsAggregate();
        r2.add(r1 + 1, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private InternalSheet(lib.zj.office.fc.hssf.model.RecordStream r11, lib.zj.office.system.b r12) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.model.InternalSheet.<init>(lib.zj.office.fc.hssf.model.RecordStream, lib.zj.office.system.b):void");
    }

    public static BOFRecord createBOF() {
        BOFRecord bOFRecord = new BOFRecord();
        bOFRecord.setVersion(BOFRecord.VERSION);
        bOFRecord.setType(16);
        bOFRecord.setBuild(3515);
        bOFRecord.setBuildYear(BOFRecord.BUILD_YEAR);
        bOFRecord.setHistoryBitMask(193);
        bOFRecord.setRequiredVersion(6);
        return bOFRecord;
    }

    private static CalcCountRecord createCalcCount() {
        CalcCountRecord calcCountRecord = new CalcCountRecord();
        calcCountRecord.setIterations((short) 100);
        return calcCountRecord;
    }

    private static CalcModeRecord createCalcMode() {
        CalcModeRecord calcModeRecord = new CalcModeRecord();
        calcModeRecord.setCalcMode((short) 1);
        return calcModeRecord;
    }

    private static DefaultColWidthRecord createDefaultColWidth() {
        DefaultColWidthRecord defaultColWidthRecord = new DefaultColWidthRecord();
        defaultColWidthRecord.setColWidth(8);
        return defaultColWidthRecord;
    }

    private static DefaultRowHeightRecord createDefaultRowHeight() {
        DefaultRowHeightRecord defaultRowHeightRecord = new DefaultRowHeightRecord();
        defaultRowHeightRecord.setOptionFlags((short) 0);
        defaultRowHeightRecord.setRowHeight((short) 255);
        return defaultRowHeightRecord;
    }

    private static DeltaRecord createDelta() {
        return new DeltaRecord(0.001d);
    }

    private static DimensionsRecord createDimensions() {
        DimensionsRecord dimensionsRecord = new DimensionsRecord();
        dimensionsRecord.setFirstCol((short) 0);
        dimensionsRecord.setLastRow(1);
        dimensionsRecord.setFirstRow(0);
        dimensionsRecord.setLastCol((short) 1);
        return dimensionsRecord;
    }

    private static GridsetRecord createGridset() {
        GridsetRecord gridsetRecord = new GridsetRecord();
        gridsetRecord.setGridset(true);
        return gridsetRecord;
    }

    private static GutsRecord createGuts() {
        GutsRecord gutsRecord = new GutsRecord();
        gutsRecord.setLeftRowGutter((short) 0);
        gutsRecord.setTopColGutter((short) 0);
        gutsRecord.setRowLevelMax((short) 0);
        gutsRecord.setColLevelMax((short) 0);
        return gutsRecord;
    }

    private static IterationRecord createIteration() {
        return new IterationRecord(false);
    }

    private static PrintGridlinesRecord createPrintGridlines() {
        PrintGridlinesRecord printGridlinesRecord = new PrintGridlinesRecord();
        printGridlinesRecord.setPrintGridlines(false);
        return printGridlinesRecord;
    }

    private static PrintHeadersRecord createPrintHeaders() {
        PrintHeadersRecord printHeadersRecord = new PrintHeadersRecord();
        printHeadersRecord.setPrintHeaders(false);
        return printHeadersRecord;
    }

    private static RefModeRecord createRefMode() {
        RefModeRecord refModeRecord = new RefModeRecord();
        refModeRecord.setMode((short) 1);
        return refModeRecord;
    }

    private static SaveRecalcRecord createSaveRecalc() {
        SaveRecalcRecord saveRecalcRecord = new SaveRecalcRecord();
        saveRecalcRecord.setRecalc(true);
        return saveRecalcRecord;
    }

    private static SelectionRecord createSelection() {
        return new SelectionRecord(0, 0);
    }

    public static InternalSheet createSheet(RecordStream recordStream) {
        return new InternalSheet(recordStream, null);
    }

    private static WSBoolRecord createWSBool() {
        WSBoolRecord wSBoolRecord = new WSBoolRecord();
        wSBoolRecord.setWSBool1((byte) 4);
        wSBoolRecord.setWSBool2((byte) -63);
        return wSBoolRecord;
    }

    private static WindowTwoRecord createWindowTwo() {
        WindowTwoRecord windowTwoRecord = new WindowTwoRecord();
        windowTwoRecord.setOptions((short) 1718);
        windowTwoRecord.setTopRow((short) 0);
        windowTwoRecord.setLeftCol((short) 0);
        windowTwoRecord.setHeaderColor(64);
        windowTwoRecord.setPageBreakZoom((short) 0);
        windowTwoRecord.setNormalZoom((short) 0);
        return windowTwoRecord;
    }

    private GutsRecord getGutsRecord() {
        if (this._gutsRecord == null) {
            GutsRecord createGuts = createGuts();
            RecordOrderer.addNewSheetRecord(this._records, createGuts);
            this._gutsRecord = createGuts;
        }
        return this._gutsRecord;
    }

    private MergedCellsTable getMergedRecords() {
        return this._mergedCellsTable;
    }

    private int getSizeOfInitialSheetRecords(int i10) {
        int i11 = 0;
        for (int i12 = i10 + 1; i12 < this._records.size(); i12++) {
            RecordBase recordBase = this._records.get(i12);
            if (recordBase instanceof RowRecordsAggregate) {
                break;
            }
            i11 += recordBase.getRecordSize();
        }
        if (this._isUncalced) {
            return i11 + UncalcedRecord.getStaticRecordSize();
        }
        return i11;
    }

    private void recalcRowGutter() {
        Iterator<RowRecord> iterator = this._rowsAggregate.getIterator();
        int i10 = 0;
        while (iterator.hasNext()) {
            i10 = Math.max((int) iterator.next().getOutlineLevel(), i10);
        }
        GutsRecord gutsRecord = getGutsRecord();
        gutsRecord.setRowLevelMax((short) (i10 + 1));
        gutsRecord.setLeftRowGutter((short) ((i10 * 12) + 29));
    }

    private void setColumn(int i10, Short sh2, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        this._columnInfos.setColumn(i10, sh2, num, num2, bool, bool2);
    }

    private static void spillAggregate(RecordAggregate recordAggregate, final List<RecordBase> list) {
        recordAggregate.visitContainedRecords(new RecordAggregate.RecordVisitor() { // from class: lib.zj.office.fc.hssf.model.InternalSheet.1
            @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate.RecordVisitor
            public void visitRecord(Record record) {
                list.add(record);
            }
        });
    }

    public int addMergedRegion(int i10, int i11, int i12, int i13) {
        if (i12 >= i10) {
            if (i13 >= i11) {
                MergedCellsTable mergedRecords = getMergedRecords();
                mergedRecords.addArea(i10, i11, i12, i13);
                return mergedRecords.getNumberOfMergedRegions() - 1;
            }
            throw new IllegalArgumentException(f.k("The 'to' col (", i13, ") must not be less than the 'from' col (", i11, ")"));
        }
        throw new IllegalArgumentException(f.k("The 'to' row (", i12, ") must not be less than the 'from' row (", i10, ")"));
    }

    public void addRow(RowRecord rowRecord) {
        if (log.check(POILogger.DEBUG)) {
            log.log(POILogger.DEBUG, "addRow ");
        }
        DimensionsRecord dimensionsRecord = this._dimensions;
        if (rowRecord.getRowNumber() >= dimensionsRecord.getLastRow()) {
            dimensionsRecord.setLastRow(rowRecord.getRowNumber() + 1);
        }
        if (rowRecord.getRowNumber() < dimensionsRecord.getFirstRow()) {
            dimensionsRecord.setFirstRow(rowRecord.getRowNumber());
        }
        RowRecord row = this._rowsAggregate.getRow(rowRecord.getRowNumber());
        if (row != null) {
            this._rowsAggregate.removeRow(row);
        }
        this._rowsAggregate.insertRow(rowRecord);
        if (log.check(POILogger.DEBUG)) {
            log.log(POILogger.DEBUG, "exit addRow");
        }
    }

    public void addValueRecord(int i10, CellValueRecordInterface cellValueRecordInterface) {
        if (log.check(POILogger.DEBUG)) {
            POILogger pOILogger = log;
            int i11 = POILogger.DEBUG;
            pOILogger.log(i11, "add value record  row" + i10);
        }
        DimensionsRecord dimensionsRecord = this._dimensions;
        if (cellValueRecordInterface.getColumn() > dimensionsRecord.getLastCol()) {
            dimensionsRecord.setLastCol((short) (cellValueRecordInterface.getColumn() + 1));
        }
        if (cellValueRecordInterface.getColumn() < dimensionsRecord.getFirstCol()) {
            dimensionsRecord.setFirstCol(cellValueRecordInterface.getColumn());
        }
        this._rowsAggregate.insertCell(cellValueRecordInterface);
    }

    public int aggregateDrawingRecords(DrawingManager2 drawingManager2, boolean z10) {
        boolean z11;
        int findFirstRecordLocBySid = findFirstRecordLocBySid((short) 236);
        if (findFirstRecordLocBySid == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!z10) {
                return -1;
            }
            EscherAggregate escherAggregate = new EscherAggregate(drawingManager2);
            int findFirstRecordLocBySid2 = findFirstRecordLocBySid(EscherAggregate.sid);
            if (findFirstRecordLocBySid2 == -1) {
                findFirstRecordLocBySid2 = findFirstRecordLocBySid((short) 574);
            } else {
                getRecords().remove(findFirstRecordLocBySid2);
            }
            getRecords().add(findFirstRecordLocBySid2, escherAggregate);
            return findFirstRecordLocBySid2;
        }
        List<RecordBase> records = getRecords();
        EscherAggregate createAggregate = EscherAggregate.createAggregate(records, findFirstRecordLocBySid, drawingManager2);
        int i10 = findFirstRecordLocBySid;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= records.size() || !(((records.get(i10) instanceof DrawingRecord) || (records.get(i10) instanceof ContinueRecord)) && ((records.get(i11) instanceof ObjRecord) || (records.get(i11) instanceof TextObjectRecord)))) {
                break;
            }
            i10 += EscherAggregate.shapeContainRecords(records, i10);
        }
        int i12 = i10 - 1;
        for (int i13 = 0; i13 < (i12 - findFirstRecordLocBySid) + 1; i13++) {
            records.remove(findFirstRecordLocBySid);
        }
        records.add(findFirstRecordLocBySid, createAggregate);
        return findFirstRecordLocBySid;
    }

    public InternalSheet cloneSheet() {
        ArrayList arrayList = new ArrayList(this._records.size());
        for (int i10 = 0; i10 < this._records.size(); i10++) {
            RecordBase recordBase = this._records.get(i10);
            if (recordBase instanceof RecordAggregate) {
                ((RecordAggregate) recordBase).visitContainedRecords(new RecordCloner(arrayList));
            } else {
                arrayList.add((Record) ((Record) recordBase).clone());
            }
        }
        return createSheet(new RecordStream(arrayList, 0));
    }

    public void createFreezePane(int i10, int i11, int i12, int i13) {
        int findFirstRecordLocBySid = findFirstRecordLocBySid((short) 65);
        if (findFirstRecordLocBySid != -1) {
            this._records.remove(findFirstRecordLocBySid);
        }
        if (i10 == 0 && i11 == 0) {
            this.windowTwo.setFreezePanes(false);
            this.windowTwo.setFreezePanesNoSplit(false);
            ((SelectionRecord) findFirstRecordBySid((short) 29)).setPane((byte) 3);
            return;
        }
        int findFirstRecordLocBySid2 = findFirstRecordLocBySid((short) 574);
        PaneRecord paneRecord = new PaneRecord();
        paneRecord.setX((short) i10);
        paneRecord.setY((short) i11);
        paneRecord.setTopRow((short) i12);
        paneRecord.setLeftColumn((short) i13);
        if (i11 == 0) {
            paneRecord.setTopRow((short) 0);
            paneRecord.setActivePane((short) 1);
        } else if (i10 == 0) {
            paneRecord.setLeftColumn((short) 0);
            paneRecord.setActivePane((short) 2);
        } else {
            paneRecord.setActivePane((short) 0);
        }
        this._records.add(findFirstRecordLocBySid2 + 1, paneRecord);
        this.windowTwo.setFreezePanes(true);
        this.windowTwo.setFreezePanesNoSplit(true);
        ((SelectionRecord) findFirstRecordBySid((short) 29)).setPane((byte) paneRecord.getActivePane());
    }

    public void createSplitPane(int i10, int i11, int i12, int i13, int i14) {
        int findFirstRecordLocBySid = findFirstRecordLocBySid((short) 65);
        if (findFirstRecordLocBySid != -1) {
            this._records.remove(findFirstRecordLocBySid);
        }
        int findFirstRecordLocBySid2 = findFirstRecordLocBySid((short) 574);
        PaneRecord paneRecord = new PaneRecord();
        paneRecord.setX((short) i10);
        paneRecord.setY((short) i11);
        paneRecord.setTopRow((short) i12);
        paneRecord.setLeftColumn((short) i13);
        paneRecord.setActivePane((short) i14);
        this._records.add(findFirstRecordLocBySid2 + 1, paneRecord);
        this.windowTwo.setFreezePanes(false);
        this.windowTwo.setFreezePanesNoSplit(false);
        ((SelectionRecord) findFirstRecordBySid((short) 29)).setPane((byte) 0);
    }

    public void dispose() {
        this._records.clear();
        this._rowsAggregate.dispose();
    }

    public Record findFirstRecordBySid(short s4) {
        int findFirstRecordLocBySid = findFirstRecordLocBySid(s4);
        if (findFirstRecordLocBySid < 0) {
            return null;
        }
        return (Record) this._records.get(findFirstRecordLocBySid);
    }

    public int findFirstRecordLocBySid(short s4) {
        int size = this._records.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecordBase recordBase = this._records.get(i10);
            if ((recordBase instanceof Record) && ((Record) recordBase).getSid() == s4) {
                return i10;
            }
        }
        return -1;
    }

    public short getActiveCellCol() {
        SelectionRecord selectionRecord = this._selection;
        if (selectionRecord == null) {
            return (short) 0;
        }
        return (short) selectionRecord.getActiveCellCol();
    }

    public int getActiveCellRow() {
        SelectionRecord selectionRecord = this._selection;
        if (selectionRecord == null) {
            return 0;
        }
        return selectionRecord.getActiveCellRow();
    }

    public Iterator<CellValueRecordInterface> getCellValueIterator() {
        return this._rowsAggregate.getCellValueIterator();
    }

    public HSSFChart getChart() {
        int findFirstRecordLocBySid;
        if (this.sheetType != 32 || (findFirstRecordLocBySid = findFirstRecordLocBySid(ChartRecord.sid)) < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        RecordBase recordBase = this._records.get(findFirstRecordLocBySid);
        while (true) {
            RecordBase recordBase2 = recordBase;
            if (!(recordBase2 instanceof WorksheetProtectionBlock)) {
                arrayList.add((Record) recordBase2);
                findFirstRecordLocBySid++;
                recordBase = this._records.get(findFirstRecordLocBySid);
            } else {
                HSSFChart hSSFChart = new HSSFChart(null, null, null, null);
                HSSFChart.convertRecordsToChart(arrayList, hSSFChart);
                return hSSFChart;
            }
        }
    }

    public List<ColumnInfo> getColumnInfo() {
        ColumnInfoRecordsAggregate columnInfoRecordsAggregate = this._columnInfos;
        if (columnInfoRecordsAggregate == null) {
            return null;
        }
        int numColumns = columnInfoRecordsAggregate.getNumColumns();
        ArrayList arrayList = new ArrayList(5);
        for (int i10 = 0; i10 < numColumns; i10++) {
            ColumnInfoRecord colInfo = this._columnInfos.getColInfo(i10);
            arrayList.add(new ColumnInfo(colInfo.getFirstColumn(), colInfo.getLastColumn(), colInfo.getColumnWidth(), colInfo.getXFIndex(), colInfo.getHidden()));
        }
        return arrayList;
    }

    public int getColumnPixelWidth(int i10) {
        ColumnInfoRecord findColumnInfo = this._columnInfos.findColumnInfo(i10);
        if (findColumnInfo != null) {
            return findColumnInfo.getColPixelWidth();
        }
        return 80;
    }

    public int getColumnWidth(int i10) {
        ColumnInfoRecord findColumnInfo = this._columnInfos.findColumnInfo(i10);
        if (findColumnInfo != null) {
            return findColumnInfo.getColumnWidth();
        }
        return this.defaultcolwidth.getColWidth() * 256;
    }

    public ConditionalFormattingTable getConditionalFormattingTable() {
        if (this.condFormatting == null) {
            ConditionalFormattingTable conditionalFormattingTable = new ConditionalFormattingTable();
            this.condFormatting = conditionalFormattingTable;
            RecordOrderer.addNewSheetRecord(this._records, conditionalFormattingTable);
        }
        return this.condFormatting;
    }

    public int getDefaultColumnWidth() {
        return this.defaultcolwidth.getColWidth();
    }

    public short getDefaultRowHeight() {
        return this.defaultrowheight.getRowHeight();
    }

    public GridsetRecord getGridsetRecord() {
        return this.gridset;
    }

    public short getLeftCol() {
        WindowTwoRecord windowTwoRecord = this.windowTwo;
        if (windowTwoRecord == null) {
            return (short) 0;
        }
        return windowTwoRecord.getLeftCol();
    }

    public HSSFCellRangeAddress getMergedRegionAt(int i10) {
        MergedCellsTable mergedRecords = getMergedRecords();
        if (i10 >= mergedRecords.getNumberOfMergedRegions()) {
            return null;
        }
        return mergedRecords.get(i10);
    }

    public RowRecord getNextRow() {
        if (this.rowRecIterator == null) {
            this.rowRecIterator = this._rowsAggregate.getIterator();
        }
        if (!this.rowRecIterator.hasNext()) {
            return null;
        }
        RowRecord next = this.rowRecIterator.next();
        this.rowRecIterator.remove();
        return next;
    }

    public NoteRecord[] getNoteRecords() {
        ArrayList arrayList = new ArrayList();
        for (int size = this._records.size() - 1; size >= 0; size--) {
            RecordBase recordBase = this._records.get(size);
            if (recordBase instanceof NoteRecord) {
                arrayList.add((NoteRecord) recordBase);
            }
        }
        if (arrayList.size() < 1) {
            return NoteRecord.EMPTY_ARRAY;
        }
        NoteRecord[] noteRecordArr = new NoteRecord[arrayList.size()];
        arrayList.toArray(noteRecordArr);
        return noteRecordArr;
    }

    public int getNumMergedRegions() {
        return getMergedRecords().getNumberOfMergedRegions();
    }

    public DataValidityTable getOrCreateDataValidityTable() {
        if (this._dataValidityTable == null) {
            DataValidityTable dataValidityTable = new DataValidityTable();
            RecordOrderer.addNewSheetRecord(this._records, dataValidityTable);
            this._dataValidityTable = dataValidityTable;
        }
        return this._dataValidityTable;
    }

    public PageSettingsBlock getPageSettings() {
        if (this._psBlock == null) {
            PageSettingsBlock pageSettingsBlock = new PageSettingsBlock();
            this._psBlock = pageSettingsBlock;
            RecordOrderer.addNewSheetRecord(this._records, pageSettingsBlock);
        }
        return this._psBlock;
    }

    public HSSFPaneInformation getPaneInformation() {
        PaneRecord paneRecord = (PaneRecord) findFirstRecordBySid((short) 65);
        if (paneRecord == null) {
            return null;
        }
        return new HSSFPaneInformation(paneRecord.getX(), paneRecord.getY(), paneRecord.getTopRow(), paneRecord.getLeftColumn(), (byte) paneRecord.getActivePane(), this.windowTwo.getFreezePanes());
    }

    public PrintGridlinesRecord getPrintGridlines() {
        return this.printGridlines;
    }

    public WorksheetProtectionBlock getProtectionBlock() {
        return this._protectionBlock;
    }

    public List<RecordBase> getRecords() {
        return this._records;
    }

    public RowRecord getRow(int i10) {
        return this._rowsAggregate.getRow(i10);
    }

    public RowRecordsAggregate getRowsAggregate() {
        return this._rowsAggregate;
    }

    public SelectionRecord getSelection() {
        return this._selection;
    }

    public short getTopRow() {
        WindowTwoRecord windowTwoRecord = this.windowTwo;
        if (windowTwoRecord == null) {
            return (short) 0;
        }
        return windowTwoRecord.getTopRow();
    }

    public boolean getUncalced() {
        return this._isUncalced;
    }

    @Deprecated
    public CellValueRecordInterface[] getValueRecords() {
        return this._rowsAggregate.getValueRecords();
    }

    public WindowTwoRecord getWindowTwo() {
        return this.windowTwo;
    }

    public short getXFIndexForColAt(short s4) {
        ColumnInfoRecord findColumnInfo = this._columnInfos.findColumnInfo(s4);
        if (findColumnInfo != null) {
            return (short) findColumnInfo.getXFIndex();
        }
        return (short) 15;
    }

    public void groupColumnRange(int i10, int i11, boolean z10) {
        this._columnInfos.groupColumnRange(i10, i11, z10);
        int maxOutlineLevel = this._columnInfos.getMaxOutlineLevel();
        GutsRecord gutsRecord = getGutsRecord();
        gutsRecord.setColLevelMax((short) (maxOutlineLevel + 1));
        if (maxOutlineLevel == 0) {
            gutsRecord.setTopColGutter((short) 0);
        } else {
            gutsRecord.setTopColGutter((short) (((maxOutlineLevel - 1) * 12) + 29));
        }
    }

    public void groupRowRange(int i10, int i11, boolean z10) {
        int i12;
        while (i10 <= i11) {
            RowRecord row = getRow(i10);
            if (row == null) {
                row = RowRecordsAggregate.createRow(i10);
                addRow(row);
            }
            short outlineLevel = row.getOutlineLevel();
            if (z10) {
                i12 = outlineLevel + 1;
            } else {
                i12 = outlineLevel - 1;
            }
            row.setOutlineLevel((short) Math.min(7, Math.max(0, i12)));
            i10++;
        }
        recalcRowGutter();
    }

    public boolean isChartSheet() {
        if (this.sheetType == 32) {
            return true;
        }
        return false;
    }

    public boolean isColumnHidden(int i10) {
        ColumnInfoRecord findColumnInfo = this._columnInfos.findColumnInfo(i10);
        if (findColumnInfo == null) {
            return false;
        }
        return findColumnInfo.getHidden();
    }

    public boolean isDisplayFormulas() {
        return this.windowTwo.getDisplayFormulas();
    }

    public boolean isDisplayGridlines() {
        return this.windowTwo.getDisplayGridlines();
    }

    public boolean isDisplayRowColHeadings() {
        return this.windowTwo.getDisplayRowColHeadings();
    }

    public boolean isGridsPrinted() {
        if (this.gridset == null) {
            this.gridset = createGridset();
            this._records.add(findFirstRecordLocBySid((short) 10), this.gridset);
        }
        return !this.gridset.getGridset();
    }

    public void preSerialize() {
        for (RecordBase recordBase : getRecords()) {
            if (recordBase instanceof EscherAggregate) {
                recordBase.getRecordSize();
            }
        }
    }

    public void removeMergedRegion(int i10) {
        MergedCellsTable mergedRecords = getMergedRecords();
        if (i10 >= mergedRecords.getNumberOfMergedRegions()) {
            return;
        }
        mergedRecords.remove(i10);
    }

    public void removeRow(RowRecord rowRecord) {
        this._rowsAggregate.removeRow(rowRecord);
    }

    public void removeValueRecord(int i10, CellValueRecordInterface cellValueRecordInterface) {
        log.logFormatted(POILogger.DEBUG, "remove value record row %", new int[]{i10});
        this._rowsAggregate.removeCell(cellValueRecordInterface);
    }

    public void replaceValueRecord(CellValueRecordInterface cellValueRecordInterface) {
        if (log.check(POILogger.DEBUG)) {
            log.log(POILogger.DEBUG, "replaceValueRecord ");
        }
        this._rowsAggregate.removeCell(cellValueRecordInterface);
        this._rowsAggregate.insertCell(cellValueRecordInterface);
    }

    public void setActiveCellCol(short s4) {
        SelectionRecord selectionRecord = this._selection;
        if (selectionRecord != null) {
            selectionRecord.setActiveCellCol(s4);
        }
    }

    public void setActiveCellRow(int i10) {
        SelectionRecord selectionRecord = this._selection;
        if (selectionRecord != null) {
            selectionRecord.setActiveCellRow(i10);
        }
    }

    public void setColumnGroupCollapsed(int i10, boolean z10) {
        if (z10) {
            this._columnInfos.collapseColumn(i10);
        } else {
            this._columnInfos.expandColumn(i10);
        }
    }

    public void setColumnHidden(int i10, boolean z10) {
        setColumn(i10, null, null, null, Boolean.valueOf(z10), null);
    }

    public void setColumnPixelWidth(int i10, int i11) {
        ColumnInfoRecord findColumnInfo = this._columnInfos.findColumnInfo(i10);
        if (findColumnInfo != null) {
            findColumnInfo.setColPixelWidth(i11);
        }
    }

    public void setColumnWidth(int i10, int i11) {
        if (i11 <= 65280) {
            setColumn(i10, null, Integer.valueOf(i11), null, null, null);
            return;
        }
        throw new IllegalArgumentException("The maximum column width for an individual cell is 255 characters.");
    }

    public void setDefaultColumnStyle(int i10, int i11) {
        setColumn(i10, Short.valueOf((short) i11), null, null, null, null);
    }

    public void setDefaultColumnWidth(int i10) {
        this.defaultcolwidth.setColWidth(i10);
    }

    public void setDefaultRowHeight(short s4) {
        this.defaultrowheight.setRowHeight(s4);
    }

    public void setDimensions(int i10, short s4, int i11, short s10) {
        if (log.check(POILogger.DEBUG)) {
            log.log(POILogger.DEBUG, "Sheet.setDimensions");
            POILogger pOILogger = log;
            int i12 = POILogger.DEBUG;
            StringBuffer stringBuffer = new StringBuffer("firstrow");
            stringBuffer.append(i10);
            stringBuffer.append("firstcol");
            stringBuffer.append((int) s4);
            stringBuffer.append("lastrow");
            stringBuffer.append(i11);
            stringBuffer.append("lastcol");
            stringBuffer.append((int) s10);
            pOILogger.log(i12, stringBuffer.toString());
        }
        this._dimensions.setFirstCol(s4);
        this._dimensions.setFirstRow(i10);
        this._dimensions.setLastCol(s10);
        this._dimensions.setLastRow(i11);
        if (log.check(POILogger.DEBUG)) {
            log.log(POILogger.DEBUG, "Sheet.setDimensions exiting");
        }
    }

    public void setDisplayFormulas(boolean z10) {
        this.windowTwo.setDisplayFormulas(z10);
    }

    public void setDisplayGridlines(boolean z10) {
        this.windowTwo.setDisplayGridlines(z10);
    }

    public void setDisplayRowColHeadings(boolean z10) {
        this.windowTwo.setDisplayRowColHeadings(z10);
    }

    public void setGridsPrinted(boolean z10) {
        this.gridset.setGridset(!z10);
    }

    public void setLeftCol(short s4) {
        WindowTwoRecord windowTwoRecord = this.windowTwo;
        if (windowTwoRecord != null) {
            windowTwoRecord.setLeftCol(s4);
        }
    }

    public void setPrintGridlines(PrintGridlinesRecord printGridlinesRecord) {
        this.printGridlines = printGridlinesRecord;
    }

    public void setSCLRecord(SCLRecord sCLRecord) {
        int findFirstRecordLocBySid = findFirstRecordLocBySid(SCLRecord.sid);
        if (findFirstRecordLocBySid == -1) {
            this._records.add(findFirstRecordLocBySid((short) 574) + 1, sCLRecord);
            return;
        }
        this._records.set(findFirstRecordLocBySid, sCLRecord);
    }

    public void setSelected(boolean z10) {
        this.windowTwo.setSelected(z10);
    }

    public void setSelection(SelectionRecord selectionRecord) {
        this._selection = selectionRecord;
    }

    public void setTopRow(short s4) {
        WindowTwoRecord windowTwoRecord = this.windowTwo;
        if (windowTwoRecord != null) {
            windowTwoRecord.setTopRow(s4);
        }
    }

    public void setUncalced(boolean z10) {
        this._isUncalced = z10;
    }

    public void updateFormulasAfterCellShift(FormulaShifter formulaShifter, int i10) {
        getRowsAggregate().updateFormulasAfterRowShift(formulaShifter, i10);
        if (this.condFormatting != null) {
            getConditionalFormattingTable().updateFormulasAfterCellShift(formulaShifter, i10);
        }
    }

    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor, int i10) {
        RecordAggregate.PositionTrackingVisitor positionTrackingVisitor = new RecordAggregate.PositionTrackingVisitor(recordVisitor, i10);
        boolean z10 = false;
        for (int i11 = 0; i11 < this._records.size(); i11++) {
            RecordBase recordBase = this._records.get(i11);
            if (recordBase instanceof RecordAggregate) {
                ((RecordAggregate) recordBase).visitContainedRecords(positionTrackingVisitor);
            } else {
                positionTrackingVisitor.visitRecord((Record) recordBase);
            }
            if ((recordBase instanceof BOFRecord) && !z10) {
                if (this._isUncalced) {
                    positionTrackingVisitor.visitRecord(new UncalcedRecord());
                }
                if (this._rowsAggregate != null) {
                    positionTrackingVisitor.visitRecord(this._rowsAggregate.createIndexRecord(positionTrackingVisitor.getPosition(), getSizeOfInitialSheetRecords(i11)));
                }
                z10 = true;
            }
        }
    }

    public static InternalSheet createSheet(RecordStream recordStream, b bVar) {
        return new InternalSheet(recordStream, bVar);
    }

    public static InternalSheet createSheet() {
        return new InternalSheet();
    }

    private InternalSheet() {
        this.printGridlines = null;
        this.gridset = null;
        this.defaultcolwidth = new DefaultColWidthRecord();
        this.defaultrowheight = new DefaultRowHeightRecord();
        WorksheetProtectionBlock worksheetProtectionBlock = new WorksheetProtectionBlock();
        this._protectionBlock = worksheetProtectionBlock;
        this.windowTwo = null;
        this._selection = null;
        this._dataValidityTable = null;
        this.rowRecIterator = null;
        this._isUncalced = false;
        this.sheetType = 16;
        MergedCellsTable mergedCellsTable = new MergedCellsTable();
        this._mergedCellsTable = mergedCellsTable;
        ArrayList arrayList = new ArrayList(32);
        if (log.check(POILogger.DEBUG)) {
            log.log(POILogger.DEBUG, "Sheet createsheet from scratch called");
        }
        arrayList.add(createBOF());
        arrayList.add(createCalcMode());
        arrayList.add(createCalcCount());
        arrayList.add(createRefMode());
        arrayList.add(createIteration());
        arrayList.add(createDelta());
        arrayList.add(createSaveRecalc());
        arrayList.add(createPrintHeaders());
        PrintGridlinesRecord createPrintGridlines = createPrintGridlines();
        this.printGridlines = createPrintGridlines;
        arrayList.add(createPrintGridlines);
        GridsetRecord createGridset = createGridset();
        this.gridset = createGridset;
        arrayList.add(createGridset);
        GutsRecord createGuts = createGuts();
        this._gutsRecord = createGuts;
        arrayList.add(createGuts);
        DefaultRowHeightRecord createDefaultRowHeight = createDefaultRowHeight();
        this.defaultrowheight = createDefaultRowHeight;
        arrayList.add(createDefaultRowHeight);
        arrayList.add(createWSBool());
        PageSettingsBlock pageSettingsBlock = new PageSettingsBlock();
        this._psBlock = pageSettingsBlock;
        arrayList.add(pageSettingsBlock);
        arrayList.add(worksheetProtectionBlock);
        DefaultColWidthRecord createDefaultColWidth = createDefaultColWidth();
        this.defaultcolwidth = createDefaultColWidth;
        arrayList.add(createDefaultColWidth);
        ColumnInfoRecordsAggregate columnInfoRecordsAggregate = new ColumnInfoRecordsAggregate();
        arrayList.add(columnInfoRecordsAggregate);
        this._columnInfos = columnInfoRecordsAggregate;
        DimensionsRecord createDimensions = createDimensions();
        this._dimensions = createDimensions;
        arrayList.add(createDimensions);
        RowRecordsAggregate rowRecordsAggregate = new RowRecordsAggregate();
        this._rowsAggregate = rowRecordsAggregate;
        arrayList.add(rowRecordsAggregate);
        WindowTwoRecord createWindowTwo = createWindowTwo();
        this.windowTwo = createWindowTwo;
        arrayList.add(createWindowTwo);
        SelectionRecord createSelection = createSelection();
        this._selection = createSelection;
        arrayList.add(createSelection);
        arrayList.add(mergedCellsTable);
        arrayList.add(EOFRecord.instance);
        this._records = arrayList;
        if (log.check(POILogger.DEBUG)) {
            log.log(POILogger.DEBUG, "Sheet createsheet from scratch exit");
        }
    }
}
