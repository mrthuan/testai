package lib.zj.office.fc.hssf.formula.function;

import androidx.activity.f;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class StatsLib {
    private StatsLib() {
    }

    public static double avedev(double[] dArr) {
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (double d12 : dArr) {
            d11 += d12;
        }
        double length = d11 / dArr.length;
        for (double d13 : dArr) {
            d10 += Math.abs(d13 - length);
        }
        return d10 / dArr.length;
    }

    public static double devsq(double[] dArr) {
        if (dArr != null && dArr.length >= 1) {
            int length = dArr.length;
            double d10 = 0.0d;
            for (double d11 : dArr) {
                d10 += d11;
            }
            double d12 = d10 / length;
            double d13 = 0.0d;
            for (double d14 : dArr) {
                d13 = f.e(d14, d12, d14 - d12, d13);
            }
            if (length == 1) {
                return 0.0d;
            }
            return d13;
        }
        return Double.NaN;
    }

    public static double kthLargest(double[] dArr, int i10) {
        int i11 = i10 - 1;
        if (dArr != null && dArr.length > i11 && i11 >= 0) {
            Arrays.sort(dArr);
            return dArr[(dArr.length - i11) - 1];
        }
        return Double.NaN;
    }

    public static double kthSmallest(double[] dArr, int i10) {
        int i11 = i10 - 1;
        if (dArr != null && dArr.length > i11 && i11 >= 0) {
            Arrays.sort(dArr);
            return dArr[i11];
        }
        return Double.NaN;
    }

    public static double median(double[] dArr) {
        if (dArr != null && dArr.length >= 1) {
            int length = dArr.length;
            Arrays.sort(dArr);
            if (length % 2 == 0) {
                int i10 = length / 2;
                return (dArr[i10] + dArr[i10 - 1]) / 2.0d;
            }
            return dArr[length / 2];
        }
        return Double.NaN;
    }

    public static double stdev(double[] dArr) {
        if (dArr != null && dArr.length > 1) {
            return Math.sqrt(devsq(dArr) / (dArr.length - 1));
        }
        return Double.NaN;
    }

    public static double var(double[] dArr) {
        if (dArr != null && dArr.length > 1) {
            return devsq(dArr) / (dArr.length - 1);
        }
        return Double.NaN;
    }

    public static double varp(double[] dArr) {
        if (dArr != null && dArr.length > 1) {
            return devsq(dArr) / dArr.length;
        }
        return Double.NaN;
    }
}
