package lib.zj.office.fc.hssf.formula.eval;

import a6.h;
import androidx.appcompat.view.menu.d;
import lib.zj.office.fc.hssf.formula.ptg.AreaI;

/* loaded from: classes3.dex */
public abstract class AreaEvalBase implements AreaEval {
    private final int _firstColumn;
    private final int _firstRow;
    private final int _lastColumn;
    private final int _lastRow;
    private final int _nColumns;
    private final int _nRows;

    public AreaEvalBase(int i10, int i11, int i12, int i13) {
        this._firstColumn = i11;
        this._firstRow = i10;
        this._lastColumn = i13;
        this._lastRow = i12;
        this._nColumns = (i13 - i11) + 1;
        this._nRows = (i12 - i10) + 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final boolean contains(int i10, int i11) {
        if (this._firstRow <= i10 && this._lastRow >= i10 && this._firstColumn <= i11 && this._lastColumn >= i11) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final boolean containsColumn(int i10) {
        if (this._firstColumn <= i10 && this._lastColumn >= i10) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final boolean containsRow(int i10) {
        if (this._firstRow <= i10 && this._lastRow >= i10) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final ValueEval getAbsoluteValue(int i10, int i11) {
        int i12 = i10 - this._firstRow;
        int i13 = i11 - this._firstColumn;
        if (i12 >= 0 && i12 < this._nRows) {
            if (i13 >= 0 && i13 < this._nColumns) {
                return getRelativeValue(i12, i13);
            }
            StringBuilder e10 = d.e("Specified column index (", i11, ") is outside the allowed range (");
            e10.append(this._firstColumn);
            e10.append("..");
            e10.append(i11);
            e10.append(")");
            throw new IllegalArgumentException(e10.toString());
        }
        StringBuilder e11 = d.e("Specified row index (", i10, ") is outside the allowed range (");
        e11.append(this._firstRow);
        e11.append("..");
        throw new IllegalArgumentException(h.g(e11, this._lastRow, ")"));
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final int getFirstColumn() {
        return this._firstColumn;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final int getFirstRow() {
        return this._firstRow;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval, lib.zj.office.fc.hssf.formula.TwoDEval
    public int getHeight() {
        return (this._lastRow - this._firstRow) + 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final int getLastColumn() {
        return this._lastColumn;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public final int getLastRow() {
        return this._lastRow;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public abstract ValueEval getRelativeValue(int i10, int i11);

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    public final ValueEval getValue(int i10, int i11) {
        return getRelativeValue(i10, i11);
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval, lib.zj.office.fc.hssf.formula.TwoDEval
    public int getWidth() {
        return (this._lastColumn - this._firstColumn) + 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    public final boolean isColumn() {
        if (this._firstColumn == this._lastColumn) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    public final boolean isRow() {
        if (this._firstRow == this._lastRow) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    public boolean isSubTotal(int i10, int i11) {
        return false;
    }

    public AreaEvalBase(AreaI areaI) {
        int firstRow = areaI.getFirstRow();
        this._firstRow = firstRow;
        int firstColumn = areaI.getFirstColumn();
        this._firstColumn = firstColumn;
        int lastRow = areaI.getLastRow();
        this._lastRow = lastRow;
        int lastColumn = areaI.getLastColumn();
        this._lastColumn = lastColumn;
        this._nColumns = (lastColumn - firstColumn) + 1;
        this._nRows = (lastRow - firstRow) + 1;
    }
}
