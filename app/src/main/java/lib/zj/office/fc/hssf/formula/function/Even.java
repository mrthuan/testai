package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.function.NumericFunction;

/* loaded from: classes3.dex */
public final class Even extends NumericFunction.OneArg {
    private static final long PARITY_MASK = -2;

    private static long calcEven(double d10) {
        long j10 = ((long) d10) & PARITY_MASK;
        if (j10 == d10) {
            return j10;
        }
        return j10 + 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
    public double evaluate(double d10) {
        long j10;
        int i10 = (d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1));
        if (i10 == 0) {
            return 0.0d;
        }
        if (i10 > 0) {
            j10 = calcEven(d10);
        } else {
            j10 = -calcEven(-d10);
        }
        return j10;
    }
}
