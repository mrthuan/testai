package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.function.XYNumericFunction;

/* loaded from: classes3.dex */
public final class Sumx2py2 extends XYNumericFunction {
    private static final XYNumericFunction.Accumulator XSquaredPlusYSquaredAccumulator = new XYNumericFunction.Accumulator() { // from class: lib.zj.office.fc.hssf.formula.function.Sumx2py2.1
        @Override // lib.zj.office.fc.hssf.formula.function.XYNumericFunction.Accumulator
        public double accumulate(double d10, double d11) {
            return (d11 * d11) + (d10 * d10);
        }
    };

    @Override // lib.zj.office.fc.hssf.formula.function.XYNumericFunction
    public XYNumericFunction.Accumulator createAccumulator() {
        return XSquaredPlusYSquaredAccumulator;
    }
}
