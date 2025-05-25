package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
interface IEvaluationListener {

    /* loaded from: classes3.dex */
    public interface ICacheEntry {
        ValueEval getValue();
    }

    void onCacheHit(int i10, int i11, int i12, ValueEval valueEval);

    void onChangeFromBlankValue(int i10, int i11, int i12, EvaluationCell evaluationCell, ICacheEntry iCacheEntry);

    void onClearCachedValue(ICacheEntry iCacheEntry);

    void onClearDependentCachedValue(ICacheEntry iCacheEntry, int i10);

    void onClearWholeCache();

    void onEndEvaluate(ICacheEntry iCacheEntry, ValueEval valueEval);

    void onReadPlainValue(int i10, int i11, int i12, ICacheEntry iCacheEntry);

    void onStartEvaluate(EvaluationCell evaluationCell, ICacheEntry iCacheEntry);

    void sortDependentCachedValues(ICacheEntry[] iCacheEntryArr);
}
