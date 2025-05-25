package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.function.XYNumericFunction;

/* loaded from: classes3.dex */
public final class Sumxmy2 extends XYNumericFunction {
    private static final XYNumericFunction.Accumulator XMinusYSquaredAccumulator = new XYNumericFunction.Accumulator() { // from class: lib.zj.office.fc.hssf.formula.function.Sumxmy2.1
        @Override // lib.zj.office.fc.hssf.formula.function.XYNumericFunction.Accumulator
        public double accumulate(double d10, double d11) {
            double d12 = d10 - d11;
            return d12 * d12;
        }
    };

    @Override // lib.zj.office.fc.hssf.formula.function.XYNumericFunction
    public XYNumericFunction.Accumulator createAccumulator() {
        return XMinusYSquaredAccumulator;
    }
}
