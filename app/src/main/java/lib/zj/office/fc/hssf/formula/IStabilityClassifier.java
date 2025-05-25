package lib.zj.office.fc.hssf.formula;

/* loaded from: classes3.dex */
public interface IStabilityClassifier {
    public static final IStabilityClassifier TOTALLY_IMMUTABLE = new IStabilityClassifier() { // from class: lib.zj.office.fc.hssf.formula.IStabilityClassifier.1
        @Override // lib.zj.office.fc.hssf.formula.IStabilityClassifier
        public boolean isCellFinal(int i10, int i11, int i12) {
            return true;
        }
    };

    boolean isCellFinal(int i10, int i11, int i12);
}
