package lib.zj.office.fc.hssf.formula.eval;

/* loaded from: classes3.dex */
public final class BlankEval implements ValueEval {
    public static final BlankEval INSTANCE;
    public static final BlankEval instance;

    static {
        BlankEval blankEval = new BlankEval();
        instance = blankEval;
        INSTANCE = blankEval;
    }

    private BlankEval() {
    }
}
