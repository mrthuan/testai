package b0;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: StepCurve.java */
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d  reason: collision with root package name */
    public final g f5245d;

    public l(String str) {
        this.f5200a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i10 = 0;
        while (indexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i10 + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d10 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < copyOf.length; i11++) {
            double d11 = copyOf[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d11;
            double d12 = i11 * d10;
            dArr3[i12] = d12;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d11 + 1.0d;
                dArr3[i13] = d12 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d11 - 1.0d) - d10;
                dArr3[i14] = (d12 - 1.0d) - d10;
            }
        }
        g gVar = new g(dArr3, dArr2);
        System.out.println(" 0 " + gVar.b(0.0d));
        System.out.println(" 1 " + gVar.b(1.0d));
        this.f5245d = gVar;
    }

    @Override // b0.c
    public final double a(double d10) {
        return this.f5245d.b(d10);
    }

    @Override // b0.c
    public final double b(double d10) {
        return this.f5245d.e(d10);
    }
}
