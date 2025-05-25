package b0;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public a f5205a;

    /* renamed from: b  reason: collision with root package name */
    public String f5206b;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f5207d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f5208e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<b> f5209f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final h f5210a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f5211b;
        public final double[] c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f5212d;

        /* renamed from: e  reason: collision with root package name */
        public final float[] f5213e;

        /* renamed from: f  reason: collision with root package name */
        public final float[] f5214f;

        /* renamed from: g  reason: collision with root package name */
        public b0.b f5215g;

        /* renamed from: h  reason: collision with root package name */
        public double[] f5216h;

        /* renamed from: i  reason: collision with root package name */
        public double[] f5217i;

        public a(int i10, int i11, String str) {
            long j10;
            char c;
            h hVar = new h();
            this.f5210a = hVar;
            hVar.f5230e = i10;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int indexOf = str.indexOf(40) + 1;
                int indexOf2 = str.indexOf(44, indexOf);
                char c10 = 0;
                int i12 = 0;
                while (indexOf2 != -1) {
                    dArr[i12] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str.indexOf(44, indexOf);
                    i12++;
                }
                dArr[i12] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i12 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d10 = 1.0d / length2;
                double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
                double[] dArr3 = new double[length];
                int i13 = 0;
                while (i13 < copyOf.length) {
                    double d11 = copyOf[i13];
                    int i14 = i13 + length2;
                    dArr2[i14][c10] = d11;
                    double d12 = i13 * d10;
                    dArr3[i14] = d12;
                    if (i13 > 0) {
                        int i15 = (length2 * 2) + i13;
                        j10 = 4607182418800017408L;
                        c = 0;
                        dArr2[i15][0] = d11 + 1.0d;
                        dArr3[i15] = d12 + 1.0d;
                        int i16 = i13 - 1;
                        dArr2[i16][0] = (d11 - 1.0d) - d10;
                        dArr3[i16] = (d12 - 1.0d) - d10;
                    } else {
                        j10 = 4607182418800017408L;
                        c = 0;
                    }
                    i13++;
                    c10 = c;
                }
                hVar.f5229d = new g(dArr3, dArr2);
            }
            this.f5211b = new float[i11];
            this.c = new double[i11];
            this.f5212d = new float[i11];
            this.f5213e = new float[i11];
            this.f5214f = new float[i11];
            float[] fArr = new float[i11];
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5218a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5219b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5220d;

        /* renamed from: e  reason: collision with root package name */
        public final float f5221e;

        public b(float f10, float f11, float f12, float f13, int i10) {
            this.f5218a = i10;
            this.f5219b = f13;
            this.c = f11;
            this.f5220d = f10;
            this.f5221e = f12;
        }
    }

    public final float a(float f10) {
        a aVar = this.f5205a;
        b0.b bVar = aVar.f5215g;
        if (bVar != null) {
            bVar.c(f10, aVar.f5216h);
        } else {
            double[] dArr = aVar.f5216h;
            dArr[0] = aVar.f5213e[0];
            dArr[1] = aVar.f5214f[0];
            dArr[2] = aVar.f5211b[0];
        }
        double[] dArr2 = aVar.f5216h;
        return (float) ((aVar.f5210a.c(f10, dArr2[1]) * aVar.f5216h[2]) + dArr2[0]);
    }

    public final float b(float f10) {
        double d10;
        double d11;
        double d12;
        double signum;
        a aVar = this.f5205a;
        b0.b bVar = aVar.f5215g;
        if (bVar != null) {
            double d13 = f10;
            bVar.f(d13, aVar.f5217i);
            aVar.f5215g.c(d13, aVar.f5216h);
        } else {
            double[] dArr = aVar.f5217i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d14 = f10;
        double d15 = aVar.f5216h[1];
        h hVar = aVar.f5210a;
        double c = hVar.c(d14, d15);
        double d16 = aVar.f5216h[1];
        double d17 = aVar.f5217i[1];
        double b10 = hVar.b(d14) + d16;
        if (d14 <= 0.0d) {
            d14 = 1.0E-5d;
        } else if (d14 >= 1.0d) {
            d14 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(hVar.f5228b, d14);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i10 = (-binarySearch) - 1;
            float[] fArr = hVar.f5227a;
            float f11 = fArr[i10];
            int i11 = i10 - 1;
            float f12 = fArr[i11];
            double[] dArr2 = hVar.f5228b;
            double d18 = dArr2[i10];
            double d19 = dArr2[i11];
            double d20 = (f11 - f12) / (d18 - d19);
            d10 = (f12 - (d20 * d19)) + (d14 * d20);
        } else {
            d10 = 0.0d;
        }
        double d21 = d10 + d17;
        switch (hVar.f5230e) {
            case 1:
                d11 = 0.0d;
                break;
            case 2:
                d12 = d21 * 4.0d;
                signum = Math.signum((((b10 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                d11 = signum * d12;
                break;
            case 3:
                d11 = d21 * 2.0d;
                break;
            case 4:
                d11 = (-d21) * 2.0d;
                break;
            case 5:
                d12 = d21 * (-6.283185307179586d);
                signum = Math.sin(b10 * 6.283185307179586d);
                d11 = signum * d12;
                break;
            case 6:
                d11 = ((((b10 * 4.0d) + 2.0d) % 4.0d) - 2.0d) * d21 * 4.0d;
                break;
            case 7:
                d11 = hVar.f5229d.e(b10 % 1.0d);
                break;
            default:
                d12 = d21 * 6.283185307179586d;
                signum = Math.cos(b10 * 6.283185307179586d);
                d11 = signum * d12;
                break;
        }
        double[] dArr3 = aVar.f5217i;
        return (float) ((d11 * aVar.f5216h[2]) + (c * dArr3[2]) + dArr3[0]);
    }

    public final void d() {
        float[] fArr;
        float[] fArr2;
        int i10;
        ArrayList<b> arrayList = this.f5209f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new d());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.f5205a = new a(this.c, size, this.f5207d);
        Iterator<b> it = arrayList.iterator();
        char c = 0;
        int i11 = 0;
        while (it.hasNext()) {
            b next = it.next();
            float f10 = next.f5220d;
            dArr[i11] = f10 * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f11 = next.f5219b;
            dArr3[c] = f11;
            float f12 = next.c;
            dArr3[1] = f12;
            float f13 = next.f5221e;
            dArr3[2] = f13;
            a aVar = this.f5205a;
            aVar.c[i11] = next.f5218a / 100.0d;
            aVar.f5212d[i11] = f10;
            aVar.f5213e[i11] = f12;
            aVar.f5214f[i11] = f13;
            aVar.f5211b[i11] = f11;
            i11++;
            dArr = dArr;
            c = 0;
        }
        double[] dArr4 = dArr;
        a aVar2 = this.f5205a;
        double[] dArr5 = aVar2.c;
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, dArr5.length, 3);
        float[] fArr3 = aVar2.f5211b;
        aVar2.f5216h = new double[fArr3.length + 2];
        aVar2.f5217i = new double[fArr3.length + 2];
        int i12 = (dArr5[0] > 0.0d ? 1 : (dArr5[0] == 0.0d ? 0 : -1));
        float[] fArr4 = aVar2.f5212d;
        h hVar = aVar2.f5210a;
        if (i12 > 0) {
            hVar.a(0.0d, fArr4[0]);
        }
        int length = dArr5.length - 1;
        if (dArr5[length] < 1.0d) {
            hVar.a(1.0d, fArr4[length]);
        }
        for (int i13 = 0; i13 < dArr6.length; i13++) {
            double[] dArr7 = dArr6[i13];
            dArr7[0] = aVar2.f5213e[i13];
            dArr7[1] = aVar2.f5214f[i13];
            dArr7[2] = fArr3[i13];
            hVar.a(dArr5[i13], fArr4[i13]);
        }
        int i14 = 0;
        double d10 = 0.0d;
        while (true) {
            if (i14 >= hVar.f5227a.length) {
                break;
            }
            d10 += fArr[i14];
            i14++;
        }
        int i15 = 1;
        double d11 = 0.0d;
        while (true) {
            float[] fArr5 = hVar.f5227a;
            if (i15 >= fArr5.length) {
                break;
            }
            int i16 = i15 - 1;
            float f14 = (fArr5[i16] + fArr5[i15]) / 2.0f;
            double[] dArr8 = hVar.f5228b;
            d11 = ((dArr8[i15] - dArr8[i16]) * f14) + d11;
            i15++;
        }
        int i17 = 0;
        while (true) {
            float[] fArr6 = hVar.f5227a;
            if (i17 >= fArr6.length) {
                break;
            }
            fArr6[i17] = (float) (fArr6[i17] * (d10 / d11));
            i17++;
        }
        hVar.c[0] = 0.0d;
        int i18 = 1;
        while (true) {
            if (i18 >= hVar.f5227a.length) {
                break;
            }
            int i19 = i18 - 1;
            double[] dArr9 = hVar.f5228b;
            double d12 = dArr9[i18] - dArr9[i19];
            double[] dArr10 = hVar.c;
            dArr10[i18] = (d12 * ((fArr2[i19] + fArr2[i18]) / 2.0f)) + dArr10[i19];
            i18++;
        }
        if (dArr5.length > 1) {
            i10 = 0;
            aVar2.f5215g = b0.b.a(0, dArr5, dArr6);
        } else {
            i10 = 0;
            aVar2.f5215g = null;
        }
        b0.b.a(i10, dArr4, dArr2);
    }

    public final String toString() {
        String str = this.f5206b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f5209f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            StringBuilder g10 = a0.d.g(str, "[");
            g10.append(next.f5218a);
            g10.append(" , ");
            g10.append(decimalFormat.format(next.f5219b));
            g10.append("] ");
            str = g10.toString();
        }
        return str;
    }

    public void c(ConstraintAttribute constraintAttribute) {
    }
}
