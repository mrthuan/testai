package lib.zj.office.fc.ss.util.cellwalk;

import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.util.DataMarker;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public class CellWalk {
    private HSSFCellRangeAddress range;
    private Sheet sheet;
    private boolean traverseEmptyCells;

    /* loaded from: classes3.dex */
    public class SimpleCellWalkContext implements CellWalkContext {
        public int colNumber;
        public long ordinalNumber;
        public int rowNumber;

        public /* synthetic */ SimpleCellWalkContext(CellWalk cellWalk, int i10) {
            this();
        }

        @Override // lib.zj.office.fc.ss.util.cellwalk.CellWalkContext
        public int getColumnNumber() {
            return this.colNumber;
        }

        @Override // lib.zj.office.fc.ss.util.cellwalk.CellWalkContext
        public long getOrdinalNumber() {
            return this.ordinalNumber;
        }

        @Override // lib.zj.office.fc.ss.util.cellwalk.CellWalkContext
        public int getRowNumber() {
            return this.rowNumber;
        }

        private SimpleCellWalkContext() {
            this.ordinalNumber = 0L;
            this.rowNumber = 0;
            this.colNumber = 0;
        }
    }

    public CellWalk(DataMarker dataMarker) {
        this(dataMarker.getSheet(), dataMarker.getRange());
    }

    private boolean isEmpty(ICell iCell) {
        if (iCell.getCellType() == 3) {
            return true;
        }
        return false;
    }

    public boolean isTraverseEmptyCells() {
        return this.traverseEmptyCells;
    }

    public void setTraverseEmptyCells(boolean z10) {
        this.traverseEmptyCells = z10;
    }

    public void traverse(CellHandler cellHandler) {
        this.range.getFirstRow();
        this.range.getLastRow();
        this.range.getFirstColumn();
        this.range.getLastColumn();
        new SimpleCellWalkContext(this, 0);
    }

    public CellWalk(Sheet sheet, HSSFCellRangeAddress hSSFCellRangeAddress) {
        this.sheet = sheet;
        this.range = hSSFCellRangeAddress;
        this.traverseEmptyCells = false;
    }
}
