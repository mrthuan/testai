package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public interface AreaI {

    /* loaded from: classes3.dex */
    public static class OffsetArea implements AreaI {
        private final int _firstColumn;
        private final int _firstRow;
        private final int _lastColumn;
        private final int _lastRow;

        public OffsetArea(int i10, int i11, int i12, int i13, int i14, int i15) {
            this._firstRow = Math.min(i12, i13) + i10;
            this._lastRow = Math.max(i12, i13) + i10;
            this._firstColumn = Math.min(i14, i15) + i11;
            this._lastColumn = Math.max(i14, i15) + i11;
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
        public int getFirstColumn() {
            return this._firstColumn;
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
        public int getFirstRow() {
            return this._firstRow;
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
        public int getLastColumn() {
            return this._lastColumn;
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
        public int getLastRow() {
            return this._lastRow;
        }
    }

    int getFirstColumn();

    int getFirstRow();

    int getLastColumn();

    int getLastRow();
}
