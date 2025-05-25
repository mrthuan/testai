package b0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public b f5258a;

    /* renamed from: e  reason: collision with root package name */
    public int f5261e;

    /* renamed from: f  reason: collision with root package name */
    public String f5262f;

    /* renamed from: i  reason: collision with root package name */
    public long f5265i;

    /* renamed from: b  reason: collision with root package name */
    public int f5259b = 0;
    public final int[] c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public final float[][] f5260d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    public final float[] f5263g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f5264h = false;

    /* renamed from: j  reason: collision with root package name */
    public float f5266j = Float.NaN;

    public final float a(float f10) {
        float abs;
        switch (this.f5259b) {
            case 1:
                return Math.signum(f10 * 6.2831855f);
            case 2:
                abs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f10 * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public void b(int i10, int i11, float f10, float f11, float f12) {
        int i12 = this.f5261e;
        this.c[i12] = i10;
        float[] fArr = this.f5260d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f5259b = Math.max(this.f5259b, i11);
        this.f5261e++;
    }

    public void c(int i10) {
        float[][] fArr;
        int i11 = this.f5261e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f5262f);
            return;
        }
        int[] iArr = this.c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (true) {
            fArr = this.f5260d;
            if (i12 <= 0) {
                break;
            }
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            i12 = i13 - 1;
            int i15 = iArr2[i12];
            if (i14 < i15) {
                int i16 = iArr[i15];
                int i17 = i14;
                int i18 = i17;
                while (i17 < i15) {
                    int i19 = iArr[i17];
                    if (i19 <= i16) {
                        int i20 = iArr[i18];
                        iArr[i18] = i19;
                        iArr[i17] = i20;
                        float[] fArr2 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = fArr2;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float[] fArr3 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = fArr3;
                int i22 = i12 + 1;
                iArr2[i12] = i18 - 1;
                int i23 = i22 + 1;
                iArr2[i22] = i14;
                int i24 = i23 + 1;
                iArr2[i23] = i15;
                i12 = i24 + 1;
                iArr2[i24] = i18 + 1;
            }
        }
        int i25 = 0;
        for (int i26 = 1; i26 < iArr.length; i26++) {
            if (iArr[i26] != iArr[i26 - 1]) {
                i25++;
            }
        }
        if (i25 == 0) {
            i25 = 1;
        }
        double[] dArr = new double[i25];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i25, 3);
        int i27 = 0;
        for (int i28 = 0; i28 < this.f5261e; i28++) {
            if (i28 <= 0 || iArr[i28] != iArr[i28 - 1]) {
                dArr[i27] = iArr[i28] * 0.01d;
                double[] dArr3 = dArr2[i27];
                float[] fArr4 = fArr[i28];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i27++;
            }
        }
        this.f5258a = b.a(i10, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f5262f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f5261e; i10++) {
            StringBuilder g10 = a0.d.g(str, "[");
            g10.append(this.c[i10]);
            g10.append(" , ");
            g10.append(decimalFormat.format(this.f5260d[i10]));
            g10.append("] ");
            str = g10.toString();
        }
        return str;
    }
}
