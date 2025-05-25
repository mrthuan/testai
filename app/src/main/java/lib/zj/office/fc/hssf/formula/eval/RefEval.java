package lib.zj.office.fc.hssf.formula.eval;

/* loaded from: classes3.dex */
public interface RefEval extends ValueEval {
    int getColumn();

    ValueEval getInnerValueEval();

    int getRow();

    AreaEval offset(int i10, int i11, int i12, int i13);
}
