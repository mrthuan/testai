package lib.zj.office.fc.hssf.formula.function;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class MathX {
    private MathX() {
    }

    public static double acosh(double d10) {
        return Math.log(Math.sqrt(Math.pow(d10, 2.0d) - 1.0d) + d10);
    }

    public static double asinh(double d10) {
        return Math.log(Math.sqrt((d10 * d10) + 1.0d) + d10);
    }

    public static double atanh(double d10) {
        return Math.log((d10 + 1.0d) / (1.0d - d10)) / 2.0d;
    }

    public static double average(double[] dArr) {
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        return d10 / dArr.length;
    }

    public static double ceiling(double d10, double d11) {
        int i10;
        double d12 = 0.0d;
        if ((d10 < 0.0d && d11 > 0.0d) || (d10 > 0.0d && d11 < 0.0d)) {
            return Double.NaN;
        }
        if (i10 != 0 && d11 != 0.0d) {
            d12 = Math.ceil(d10 / d11) * d11;
        }
        return d12;
    }

    public static double cosh(double d10) {
        return (Math.pow(2.718281828459045d, -d10) + Math.pow(2.718281828459045d, d10)) / 2.0d;
    }

    public static double factorial(int i10) {
        if (i10 >= 0) {
            if (i10 <= 170) {
                double d10 = 1.0d;
                for (int i11 = 1; i11 <= i10; i11++) {
                    d10 *= i11;
                }
                return d10;
            }
            return Double.POSITIVE_INFINITY;
        }
        return Double.NaN;
    }

    public static double floor(double d10, double d11) {
        int i10;
        int i11;
        double d12 = 0.0d;
        if ((d10 < 0.0d && d11 > 0.0d) || ((d10 > 0.0d && d11 < 0.0d) || (d11 == 0.0d && i10 != 0))) {
            return Double.NaN;
        }
        if (i10 != 0 && i11 != 0) {
            d12 = Math.floor(d10 / d11) * d11;
        }
        return d12;
    }

    public static double max(double[] dArr) {
        double d10 = Double.NEGATIVE_INFINITY;
        for (double d11 : dArr) {
            d10 = Math.max(d10, d11);
        }
        return d10;
    }

    public static double min(double[] dArr) {
        double d10 = Double.POSITIVE_INFINITY;
        for (double d11 : dArr) {
            d10 = Math.min(d10, d11);
        }
        return d10;
    }

    public static double mod(double d10, double d11) {
        if (d11 == 0.0d) {
            return Double.NaN;
        }
        if (sign(d10) != sign(d11)) {
            d10 = (d10 % d11) + d11;
        }
        return d10 % d11;
    }

    public static double nChooseK(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 >= i11) {
            int i12 = i10 - i11;
            int min = Math.min(i12, i11);
            int max = Math.max(i12, i11);
            double d10 = 1.0d;
            while (max < i10) {
                max++;
                d10 *= max;
            }
            return d10 / factorial(min);
        }
        return Double.NaN;
    }

    public static double product(double[] dArr) {
        if (dArr != null && dArr.length > 0) {
            double d10 = 1.0d;
            for (double d11 : dArr) {
                d10 *= d11;
            }
            return d10;
        }
        return 0.0d;
    }

    public static double round(double d10, int i10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return BigDecimal.valueOf(d10).setScale(i10, RoundingMode.HALF_UP).doubleValue();
        }
        return Double.NaN;
    }

    public static double roundDown(double d10, int i10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return BigDecimal.valueOf(d10).setScale(i10, RoundingMode.DOWN).doubleValue();
        }
        return Double.NaN;
    }

    public static double roundUp(double d10, int i10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return BigDecimal.valueOf(d10).setScale(i10, RoundingMode.UP).doubleValue();
        }
        return Double.NaN;
    }

    public static short sign(double d10) {
        int i10;
        if (d10 == 0.0d) {
            i10 = 0;
        } else if (d10 < 0.0d) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return (short) i10;
    }

    public static double sinh(double d10) {
        return (Math.pow(2.718281828459045d, d10) - Math.pow(2.718281828459045d, -d10)) / 2.0d;
    }

    public static double sum(double[] dArr) {
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        return d10;
    }

    public static double sumsq(double[] dArr) {
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11 * d11;
        }
        return d10;
    }

    public static double tanh(double d10) {
        double pow = Math.pow(2.718281828459045d, d10);
        double pow2 = Math.pow(2.718281828459045d, -d10);
        return (pow - pow2) / (pow + pow2);
    }
}
