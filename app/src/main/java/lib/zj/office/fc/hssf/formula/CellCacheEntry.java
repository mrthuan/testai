package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.IEvaluationListener;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class CellCacheEntry implements IEvaluationListener.ICacheEntry {
    public static final CellCacheEntry[] EMPTY_ARRAY = new CellCacheEntry[0];
    private final FormulaCellCacheEntrySet _consumingCells = new FormulaCellCacheEntrySet();
    private ValueEval _value;

    private static boolean areValuesEqual(ValueEval valueEval, ValueEval valueEval2) {
        Class<?> cls;
        if (valueEval == null || (cls = valueEval.getClass()) != valueEval2.getClass()) {
            return false;
        }
        if (valueEval == BlankEval.instance) {
            if (valueEval2 != valueEval) {
                return false;
            }
            return true;
        } else if (cls == NumberEval.class) {
            if (((NumberEval) valueEval).getNumberValue() != ((NumberEval) valueEval2).getNumberValue()) {
                return false;
            }
            return true;
        } else if (cls == StringEval.class) {
            return ((StringEval) valueEval).getStringValue().equals(((StringEval) valueEval2).getStringValue());
        } else {
            if (cls == BoolEval.class) {
                if (((BoolEval) valueEval).getBooleanValue() != ((BoolEval) valueEval2).getBooleanValue()) {
                    return false;
                }
                return true;
            } else if (cls == ErrorEval.class) {
                if (((ErrorEval) valueEval).getErrorCode() != ((ErrorEval) valueEval2).getErrorCode()) {
                    return false;
                }
                return true;
            } else {
                throw new IllegalStateException("Unexpected value class (" + cls.getName() + ")");
            }
        }
    }

    public final void addConsumingCell(FormulaCellCacheEntry formulaCellCacheEntry) {
        this._consumingCells.add(formulaCellCacheEntry);
    }

    public final void clearConsumingCell(FormulaCellCacheEntry formulaCellCacheEntry) {
        if (this._consumingCells.remove(formulaCellCacheEntry)) {
            return;
        }
        throw new IllegalStateException("Specified formula cell is not consumed by this cell");
    }

    public final void clearValue() {
        this._value = null;
    }

    public final FormulaCellCacheEntry[] getConsumingCells() {
        return this._consumingCells.toArray();
    }

    @Override // lib.zj.office.fc.hssf.formula.IEvaluationListener.ICacheEntry
    public final ValueEval getValue() {
        return this._value;
    }

    public final void recurseClearCachedFormulaResults(IEvaluationListener iEvaluationListener) {
        if (iEvaluationListener == null) {
            recurseClearCachedFormulaResults();
            return;
        }
        iEvaluationListener.onClearCachedValue(this);
        recurseClearCachedFormulaResults(iEvaluationListener, 1);
    }

    public final boolean updateValue(ValueEval valueEval) {
        if (valueEval != null) {
            boolean z10 = !areValuesEqual(this._value, valueEval);
            this._value = valueEval;
            return z10;
        }
        throw new IllegalArgumentException("Did not expect to update to null");
    }

    public final void recurseClearCachedFormulaResults() {
        FormulaCellCacheEntry[] consumingCells;
        for (FormulaCellCacheEntry formulaCellCacheEntry : getConsumingCells()) {
            formulaCellCacheEntry.clearFormulaEntry();
            formulaCellCacheEntry.recurseClearCachedFormulaResults();
        }
    }

    public final void recurseClearCachedFormulaResults(IEvaluationListener iEvaluationListener, int i10) {
        FormulaCellCacheEntry[] consumingCells = getConsumingCells();
        iEvaluationListener.sortDependentCachedValues(consumingCells);
        for (FormulaCellCacheEntry formulaCellCacheEntry : consumingCells) {
            iEvaluationListener.onClearDependentCachedValue(formulaCellCacheEntry, i10);
            formulaCellCacheEntry.clearFormulaEntry();
            formulaCellCacheEntry.recurseClearCachedFormulaResults(iEvaluationListener, i10 + 1);
        }
    }
}
