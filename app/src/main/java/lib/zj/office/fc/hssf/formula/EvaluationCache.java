package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.FormulaCellCache;
import lib.zj.office.fc.hssf.formula.FormulaUsedBlankCellSet;
import lib.zj.office.fc.hssf.formula.PlainCellCache;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class EvaluationCache {
    final IEvaluationListener _evaluationListener;
    private final PlainCellCache _plainCellCache = new PlainCellCache();
    private final FormulaCellCache _formulaCellCache = new FormulaCellCache();

    public EvaluationCache(IEvaluationListener iEvaluationListener) {
        this._evaluationListener = iEvaluationListener;
    }

    private boolean areValuesEqual(ValueEval valueEval, ValueEval valueEval2) {
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

    private void updateAnyBlankReferencingFormulas(int i10, int i11, final int i12, final int i13) {
        final FormulaUsedBlankCellSet.BookSheetKey bookSheetKey = new FormulaUsedBlankCellSet.BookSheetKey(i10, i11);
        this._formulaCellCache.applyOperation(new FormulaCellCache.IEntryOperation() { // from class: lib.zj.office.fc.hssf.formula.EvaluationCache.1
            @Override // lib.zj.office.fc.hssf.formula.FormulaCellCache.IEntryOperation
            public void processEntry(FormulaCellCacheEntry formulaCellCacheEntry) {
                formulaCellCacheEntry.notifyUpdatedBlankCell(bookSheetKey, i12, i13, EvaluationCache.this._evaluationListener);
            }
        });
    }

    public void clear() {
        IEvaluationListener iEvaluationListener = this._evaluationListener;
        if (iEvaluationListener != null) {
            iEvaluationListener.onClearWholeCache();
        }
        this._plainCellCache.clear();
        this._formulaCellCache.clear();
    }

    public FormulaCellCacheEntry getOrCreateFormulaCellEntry(EvaluationCell evaluationCell) {
        FormulaCellCacheEntry formulaCellCacheEntry = this._formulaCellCache.get(evaluationCell);
        if (formulaCellCacheEntry == null) {
            FormulaCellCacheEntry formulaCellCacheEntry2 = new FormulaCellCacheEntry();
            this._formulaCellCache.put(evaluationCell, formulaCellCacheEntry2);
            return formulaCellCacheEntry2;
        }
        return formulaCellCacheEntry;
    }

    public PlainValueCellCacheEntry getPlainValueEntry(int i10, int i11, int i12, int i13, ValueEval valueEval) {
        PlainCellCache.Loc loc = new PlainCellCache.Loc(i10, i11, i12, i13);
        PlainValueCellCacheEntry plainValueCellCacheEntry = this._plainCellCache.get(loc);
        if (plainValueCellCacheEntry == null) {
            plainValueCellCacheEntry = new PlainValueCellCacheEntry(valueEval);
            this._plainCellCache.put(loc, plainValueCellCacheEntry);
            IEvaluationListener iEvaluationListener = this._evaluationListener;
            if (iEvaluationListener != null) {
                iEvaluationListener.onReadPlainValue(i11, i12, i13, plainValueCellCacheEntry);
            }
        } else if (areValuesEqual(plainValueCellCacheEntry.getValue(), valueEval)) {
            IEvaluationListener iEvaluationListener2 = this._evaluationListener;
            if (iEvaluationListener2 != null) {
                iEvaluationListener2.onCacheHit(i11, i12, i13, valueEval);
            }
        } else {
            throw new IllegalStateException("value changed");
        }
        return plainValueCellCacheEntry;
    }

    public void notifyDeleteCell(int i10, int i11, EvaluationCell evaluationCell) {
        if (evaluationCell.getCellType() == 2) {
            FormulaCellCacheEntry remove = this._formulaCellCache.remove(evaluationCell);
            if (remove != null) {
                remove.setSensitiveInputCells(null);
                remove.recurseClearCachedFormulaResults(this._evaluationListener);
                return;
            }
            return;
        }
        PlainValueCellCacheEntry plainValueCellCacheEntry = this._plainCellCache.get(new PlainCellCache.Loc(i10, i11, evaluationCell.getRowIndex(), evaluationCell.getColumnIndex()));
        if (plainValueCellCacheEntry != null) {
            plainValueCellCacheEntry.recurseClearCachedFormulaResults(this._evaluationListener);
        }
    }

    public void notifyUpdateCell(int i10, int i11, EvaluationCell evaluationCell) {
        FormulaCellCacheEntry formulaCellCacheEntry = this._formulaCellCache.get(evaluationCell);
        int rowIndex = evaluationCell.getRowIndex();
        int columnIndex = evaluationCell.getColumnIndex();
        PlainCellCache.Loc loc = new PlainCellCache.Loc(i10, i11, rowIndex, columnIndex);
        PlainValueCellCacheEntry plainValueCellCacheEntry = this._plainCellCache.get(loc);
        if (evaluationCell.getCellType() == 2) {
            if (formulaCellCacheEntry == null) {
                FormulaCellCacheEntry formulaCellCacheEntry2 = new FormulaCellCacheEntry();
                if (plainValueCellCacheEntry == null) {
                    IEvaluationListener iEvaluationListener = this._evaluationListener;
                    if (iEvaluationListener != null) {
                        iEvaluationListener.onChangeFromBlankValue(i11, rowIndex, columnIndex, evaluationCell, formulaCellCacheEntry2);
                    }
                    updateAnyBlankReferencingFormulas(i10, i11, rowIndex, columnIndex);
                }
                this._formulaCellCache.put(evaluationCell, formulaCellCacheEntry2);
            } else {
                formulaCellCacheEntry.recurseClearCachedFormulaResults(this._evaluationListener);
                formulaCellCacheEntry.clearFormulaEntry();
            }
            if (plainValueCellCacheEntry != null) {
                plainValueCellCacheEntry.recurseClearCachedFormulaResults(this._evaluationListener);
                this._plainCellCache.remove(loc);
                return;
            }
            return;
        }
        ValueEval valueFromNonFormulaCell = WorkbookEvaluator.getValueFromNonFormulaCell(evaluationCell);
        if (plainValueCellCacheEntry == null) {
            if (valueFromNonFormulaCell != BlankEval.instance) {
                PlainValueCellCacheEntry plainValueCellCacheEntry2 = new PlainValueCellCacheEntry(valueFromNonFormulaCell);
                if (formulaCellCacheEntry == null) {
                    IEvaluationListener iEvaluationListener2 = this._evaluationListener;
                    if (iEvaluationListener2 != null) {
                        iEvaluationListener2.onChangeFromBlankValue(i11, rowIndex, columnIndex, evaluationCell, plainValueCellCacheEntry2);
                    }
                    updateAnyBlankReferencingFormulas(i10, i11, rowIndex, columnIndex);
                }
                this._plainCellCache.put(loc, plainValueCellCacheEntry2);
            }
        } else {
            if (plainValueCellCacheEntry.updateValue(valueFromNonFormulaCell)) {
                plainValueCellCacheEntry.recurseClearCachedFormulaResults(this._evaluationListener);
            }
            if (valueFromNonFormulaCell == BlankEval.instance) {
                this._plainCellCache.remove(loc);
            }
        }
        if (formulaCellCacheEntry != null) {
            this._formulaCellCache.remove(evaluationCell);
            formulaCellCacheEntry.setSensitiveInputCells(null);
            formulaCellCacheEntry.recurseClearCachedFormulaResults(this._evaluationListener);
        }
    }
}
