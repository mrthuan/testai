package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.function.NumericFunction;

/* loaded from: classes3.dex */
public final class Odd extends NumericFunction.OneArg {
    private static final long PARITY_MASK = -2;

    private static long calcOdd(double d10) {
        double d11 = d10 + 1.0d;
        long j10 = ((long) d11) & PARITY_MASK;
        if (j10 == d11) {
            return j10 - 1;
        }
        return j10 + 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
    public double evaluate(double d10) {
        long j10;
        int i10 = (d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1));
        if (i10 == 0) {
            return 1.0d;
        }
        if (i10 > 0) {
            j10 = calcOdd(d10);
        } else {
            j10 = -calcOdd(-d10);
        }
        return j10;
    }
}
