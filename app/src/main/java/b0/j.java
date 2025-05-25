package b0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public b f5233a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5234b = new int[10];
    public float[] c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    public int f5235d;

    /* renamed from: e  reason: collision with root package name */
    public String f5236e;

    public final float a(float f10) {
        return (float) this.f5233a.b(f10);
    }

    public void b(float f10, int i10) {
        int[] iArr = this.f5234b;
        if (iArr.length < this.f5235d + 1) {
            this.f5234b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5234b;
        int i11 = this.f5235d;
        iArr2[i11] = i10;
        this.c[i11] = f10;
        this.f5235d = i11 + 1;
    }

    public void c(int i10) {
        int i11 = this.f5235d;
        if (i11 == 0) {
            return;
        }
        int[] iArr = this.f5234b;
        float[] fArr = this.c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (i12 > 0) {
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
                        float f10 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = f10;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float f11 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = f11;
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
        int i25 = 1;
        for (int i26 = 1; i26 < this.f5235d; i26++) {
            int[] iArr3 = this.f5234b;
            if (iArr3[i26 - 1] != iArr3[i26]) {
                i25++;
            }
        }
        double[] dArr = new double[i25];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i25, 1);
        int i27 = 0;
        for (int i28 = 0; i28 < this.f5235d; i28++) {
            if (i28 > 0) {
                int[] iArr4 = this.f5234b;
                if (iArr4[i28] == iArr4[i28 - 1]) {
                }
            }
            dArr[i27] = this.f5234b[i28] * 0.01d;
            dArr2[i27][0] = this.c[i28];
            i27++;
        }
        this.f5233a = b.a(i10, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f5236e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f5235d; i10++) {
            StringBuilder g10 = a0.d.g(str, "[");
            g10.append(this.f5234b[i10]);
            g10.append(" , ");
            g10.append(decimalFormat.format(this.c[i10]));
            g10.append("] ");
            str = g10.toString();
        }
        return str;
    }
}
