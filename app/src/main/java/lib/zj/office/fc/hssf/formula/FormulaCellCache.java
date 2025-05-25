package lib.zj.office.fc.hssf.formula;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class FormulaCellCache {
    private final Map<Object, FormulaCellCacheEntry> _formulaEntriesByCell = new HashMap();

    /* loaded from: classes3.dex */
    public interface IEntryOperation {
        void processEntry(FormulaCellCacheEntry formulaCellCacheEntry);
    }

    public void applyOperation(IEntryOperation iEntryOperation) {
        for (FormulaCellCacheEntry formulaCellCacheEntry : this._formulaEntriesByCell.values()) {
            iEntryOperation.processEntry(formulaCellCacheEntry);
        }
    }

    public void clear() {
        this._formulaEntriesByCell.clear();
    }

    public FormulaCellCacheEntry get(EvaluationCell evaluationCell) {
        return this._formulaEntriesByCell.get(evaluationCell.getIdentityKey());
    }

    public CellCacheEntry[] getCacheEntries() {
        FormulaCellCacheEntry[] formulaCellCacheEntryArr = new FormulaCellCacheEntry[this._formulaEntriesByCell.size()];
        this._formulaEntriesByCell.values().toArray(formulaCellCacheEntryArr);
        return formulaCellCacheEntryArr;
    }

    public void put(EvaluationCell evaluationCell, FormulaCellCacheEntry formulaCellCacheEntry) {
        this._formulaEntriesByCell.put(evaluationCell.getIdentityKey(), formulaCellCacheEntry);
    }

    public FormulaCellCacheEntry remove(EvaluationCell evaluationCell) {
        return this._formulaEntriesByCell.remove(evaluationCell.getIdentityKey());
    }
}
