package lib.zj.office.fc.hssf.formula.function;

/* loaded from: classes3.dex */
public abstract class MinaMaxa extends MultiOperandNumericFunction {
    public static final Function MAXA = new MinaMaxa() { // from class: lib.zj.office.fc.hssf.formula.function.MinaMaxa.1
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length > 0) {
                return MathX.max(dArr);
            }
            return 0.0d;
        }
    };
    public static final Function MINA = new MinaMaxa() { // from class: lib.zj.office.fc.hssf.formula.function.MinaMaxa.2
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length > 0) {
                return MathX.min(dArr);
            }
            return 0.0d;
        }
    };

    public MinaMaxa() {
        super(true, true);
    }
}
