package lib.zj.office.fc.hssf.formula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class EvaluationTracker {
    private final EvaluationCache _cache;
    private final List<CellEvaluationFrame> _evaluationFrames = new ArrayList();
    private final Set<FormulaCellCacheEntry> _currentlyEvaluatingCells = new HashSet();

    public EvaluationTracker(EvaluationCache evaluationCache) {
        this._cache = evaluationCache;
    }

    public void acceptFormulaDependency(CellCacheEntry cellCacheEntry) {
        int size = this._evaluationFrames.size() - 1;
        if (size >= 0) {
            this._evaluationFrames.get(size).addSensitiveInputCell(cellCacheEntry);
        }
    }

    public void acceptPlainValueDependency(int i10, int i11, int i12, int i13, ValueEval valueEval) {
        int size = this._evaluationFrames.size() - 1;
        if (size >= 0) {
            CellEvaluationFrame cellEvaluationFrame = this._evaluationFrames.get(size);
            if (valueEval == BlankEval.instance) {
                cellEvaluationFrame.addUsedBlankCell(i10, i11, i12, i13);
            } else {
                cellEvaluationFrame.addSensitiveInputCell(this._cache.getPlainValueEntry(i10, i11, i12, i13, valueEval));
            }
        }
    }

    public void endEvaluate(CellCacheEntry cellCacheEntry) {
        int size = this._evaluationFrames.size();
        if (size >= 1) {
            int i10 = size - 1;
            if (cellCacheEntry == this._evaluationFrames.get(i10).getCCE()) {
                this._evaluationFrames.remove(i10);
                this._currentlyEvaluatingCells.remove(cellCacheEntry);
                return;
            }
            throw new IllegalStateException("Wrong cell specified. ");
        }
        throw new IllegalStateException("Call to endEvaluate without matching call to startEvaluate");
    }

    public boolean startEvaluate(FormulaCellCacheEntry formulaCellCacheEntry) {
        if (formulaCellCacheEntry != null) {
            if (this._currentlyEvaluatingCells.contains(formulaCellCacheEntry)) {
                return false;
            }
            this._currentlyEvaluatingCells.add(formulaCellCacheEntry);
            this._evaluationFrames.add(new CellEvaluationFrame(formulaCellCacheEntry));
            return true;
        }
        throw new IllegalArgumentException("cellLoc must not be null");
    }

    public void updateCacheResult(ValueEval valueEval) {
        int size = this._evaluationFrames.size();
        if (size >= 1) {
            CellEvaluationFrame cellEvaluationFrame = this._evaluationFrames.get(size - 1);
            if (valueEval == ErrorEval.CIRCULAR_REF_ERROR && size > 1) {
                return;
            }
            cellEvaluationFrame.updateFormulaResult(valueEval);
            return;
        }
        throw new IllegalStateException("Call to endEvaluate without matching call to startEvaluate");
    }
}
