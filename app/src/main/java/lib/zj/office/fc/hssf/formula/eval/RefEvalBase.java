package lib.zj.office.fc.hssf.formula.eval;

/* loaded from: classes3.dex */
public abstract class RefEvalBase implements RefEval {
    private final int _columnIndex;
    private final int _rowIndex;

    public RefEvalBase(int i10, int i11) {
        this._rowIndex = i10;
        this._columnIndex = i11;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.RefEval
    public final int getColumn() {
        return this._columnIndex;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.RefEval
    public final int getRow() {
        return this._rowIndex;
    }
}
