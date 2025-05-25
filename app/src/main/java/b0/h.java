package b0;

import java.util.Arrays;

/* compiled from: Oscillator.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public float[] f5227a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    public double[] f5228b = new double[0];
    public double[] c;

    /* renamed from: d  reason: collision with root package name */
    public g f5229d;

    /* renamed from: e  reason: collision with root package name */
    public int f5230e;

    public final void a(double d10, float f10) {
        int length = this.f5227a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f5228b, d10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f5228b = Arrays.copyOf(this.f5228b, length);
        this.f5227a = Arrays.copyOf(this.f5227a, length);
        this.c = new double[length];
        double[] dArr = this.f5228b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f5228b[binarySearch] = d10;
        this.f5227a[binarySearch] = f10;
    }

    public final double b(double d10) {
        double d11;
        if (d10 < 0.0d) {
            d11 = 0.0d;
        } else if (d10 > 1.0d) {
            d11 = 1.0d;
        } else {
            d11 = d10;
        }
        int binarySearch = Arrays.binarySearch(this.f5228b, d11);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i10 = (-binarySearch) - 1;
        float[] fArr = this.f5227a;
        float f10 = fArr[i10];
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        double d12 = f10 - f11;
        double[] dArr = this.f5228b;
        double d13 = dArr[i10];
        double d14 = dArr[i11];
        double d15 = d12 / (d13 - d14);
        return androidx.activity.f.e(d11, d14, f11 - (d15 * d14), this.c[i11]) + ((((d11 * d11) - (d14 * d14)) * d15) / 2.0d);
    }

    public final double c(double d10, double d11) {
        double abs;
        double b10 = b(d10) + d11;
        switch (this.f5230e) {
            case 1:
                return Math.signum(0.5d - (b10 % 1.0d));
            case 2:
                abs = Math.abs((((b10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((b10 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d11 + b10) * 6.283185307179586d);
            case 6:
                double abs2 = 1.0d - Math.abs(((b10 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f5229d.b(b10 % 1.0d);
            default:
                return Math.sin(b10 * 6.283185307179586d);
        }
        return 1.0d - abs;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f5228b) + " period=" + Arrays.toString(this.f5227a);
    }
}
