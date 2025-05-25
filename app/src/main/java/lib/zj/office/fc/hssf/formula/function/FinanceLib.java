package lib.zj.office.fc.hssf.formula.function;

/* loaded from: classes3.dex */
public final class FinanceLib {
    private FinanceLib() {
    }

    public static double fv(double d10, double d11, double d12, double d13, boolean z10) {
        if (d10 == 0.0d) {
            return ((d11 * d12) + d13) * (-1.0d);
        }
        double d14 = 1.0d;
        double d15 = d10 + 1.0d;
        double pow = 1.0d - Math.pow(d15, d11);
        if (z10) {
            d14 = d15;
        }
        return (((pow * d14) * d12) / d10) - (Math.pow(d15, d11) * d13);
    }

    public static double nper(double d10, double d11, double d12, double d13, boolean z10) {
        double log;
        double log2;
        if (d10 == 0.0d) {
            return ((d13 + d12) * (-1.0d)) / d11;
        }
        double d14 = 1.0d;
        double d15 = d10 + 1.0d;
        if (z10) {
            d14 = d15;
        }
        double d16 = (d14 * d11) / d10;
        double d17 = d16 - d13;
        int i10 = (d17 > 0.0d ? 1 : (d17 == 0.0d ? 0 : -1));
        if (i10 < 0) {
            log = Math.log(d13 - d16);
        } else {
            log = Math.log(d17);
        }
        if (i10 < 0) {
            log2 = Math.log((-d12) - d16);
        } else {
            log2 = Math.log(d12 + d16);
        }
        return (log - log2) / Math.log(d15);
    }

    public static double npv(double d10, double[] dArr) {
        double d11 = d10 + 1.0d;
        double d12 = 0.0d;
        double d13 = d11;
        for (double d14 : dArr) {
            d12 += d14 / d13;
            d13 *= d11;
        }
        return d12;
    }

    public static double pmt(double d10, double d11, double d12, double d13, boolean z10) {
        double d14;
        if (d10 == 0.0d) {
            return ((d13 + d12) * (-1.0d)) / d11;
        }
        double d15 = d10 + 1.0d;
        double pow = ((Math.pow(d15, d11) * d12) + d13) * d10;
        if (z10) {
            d14 = d15;
        } else {
            d14 = 1.0d;
        }
        return pow / ((1.0d - Math.pow(d15, d11)) * d14);
    }

    public static double pv(double d10, double d11, double d12, double d13, boolean z10) {
        if (d10 == 0.0d) {
            return ((d11 * d12) + d13) * (-1.0d);
        }
        double d14 = 1.0d;
        double d15 = d10 + 1.0d;
        double pow = (1.0d - Math.pow(d15, d11)) / d10;
        if (z10) {
            d14 = d15;
        }
        return (((pow * d14) * d12) - d13) / Math.pow(d15, d11);
    }
}
