package lib.zj.office.java.awt.geom;

/* compiled from: QuadCurve2D.java */
/* loaded from: classes3.dex */
public abstract class q implements lib.zj.office.java.awt.b, Cloneable {
    public static int a(double[] dArr, double[] dArr2) {
        double d10 = dArr[2];
        double d11 = dArr[1];
        double d12 = dArr[0];
        if (d10 == 0.0d) {
            if (d11 == 0.0d) {
                return -1;
            }
            dArr2[0] = (-d12) / d11;
        } else {
            double d13 = (d11 * d11) - ((4.0d * d10) * d12);
            if (d13 < 0.0d) {
                return 0;
            }
            double sqrt = Math.sqrt(d13);
            if (d11 < 0.0d) {
                sqrt = -sqrt;
            }
            double d14 = (d11 + sqrt) / (-2.0d);
            dArr2[0] = d14 / d10;
            if (d14 != 0.0d) {
                dArr2[1] = d12 / d14;
                return 2;
            }
        }
        return 1;
    }
}
