package d6;

import d6.a;
import kotlin.jvm.internal.g;

/* compiled from: Operator.kt */
/* loaded from: classes.dex */
public final class c {
    static {
        new c();
    }

    public static final void a(a x4, a b10) {
        if (k6.a.b(c.class)) {
            return;
        }
        try {
            g.e(x4, "x");
            g.e(b10, "b");
            int[] iArr = x4.f16118a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            float[] fArr = x4.c;
            float[] fArr2 = b10.c;
            for (int i13 = 0; i13 < i10; i13++) {
                for (int i14 = 0; i14 < i11; i14++) {
                    for (int i15 = 0; i15 < i12; i15++) {
                        int i16 = (i14 * i12) + (i13 * i11 * i12) + i15;
                        fArr[i16] = fArr[i16] + fArr2[i15];
                    }
                }
            }
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
        }
    }

    public static final a b(a[] aVarArr) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            int i10 = aVarArr[0].f16118a[0];
            int i11 = 0;
            for (a aVar : aVarArr) {
                i11 += aVar.f16118a[1];
            }
            a aVar2 = new a(new int[]{i10, i11});
            float[] fArr = aVar2.c;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 * i11;
                for (a aVar3 : aVarArr) {
                    float[] fArr2 = aVar3.c;
                    int i14 = aVar3.f16118a[1];
                    System.arraycopy(fArr2, i12 * i14, fArr, i13, i14);
                    i13 += i14;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final a c(a x4, a w7) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(x4, "x");
            g.e(w7, "w");
            int[] iArr = x4.f16118a;
            int i10 = 0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int[] iArr2 = w7.f16118a;
            int i14 = iArr2[0];
            int i15 = (i12 - i14) + 1;
            int i16 = iArr2[2];
            a aVar = new a(new int[]{i11, i15, i16});
            float[] fArr = x4.c;
            float[] fArr2 = aVar.c;
            float[] fArr3 = w7.c;
            int i17 = 0;
            while (i17 < i11) {
                int i18 = i10;
                while (i18 < i16) {
                    int i19 = i10;
                    while (i19 < i15) {
                        float f10 = 0.0f;
                        while (i10 < i14) {
                            for (int i20 = 0; i20 < i13; i20++) {
                                f10 = (fArr[((i10 + i19) * i13) + (i12 * i13 * i17) + i20] * fArr3[(((i10 * i13) + i20) * i16) + i18]) + f10;
                            }
                            i10++;
                        }
                        fArr2[(i19 * i16) + (i15 * i16 * i17) + i18] = f10;
                        i19++;
                        i10 = 0;
                    }
                    i18++;
                    i10 = 0;
                }
                i17++;
                i10 = 0;
            }
            return aVar;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final a d(a x4, a w7, a b10) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(x4, "x");
            g.e(w7, "w");
            g.e(b10, "b");
            int i10 = x4.f16118a[0];
            int i11 = b10.f16118a[0];
            a h10 = h(x4, w7);
            float[] fArr = b10.c;
            float[] fArr2 = h10.c;
            for (int i12 = 0; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    int i14 = (i12 * i11) + i13;
                    fArr2[i14] = fArr2[i14] + fArr[i13];
                }
            }
            return h10;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final a e(String[] strArr, a w7) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(w7, "w");
            int length = strArr.length;
            int i10 = w7.f16118a[1];
            a aVar = new a(new int[]{length, 128, i10});
            float[] fArr = aVar.c;
            float[] fArr2 = w7.c;
            for (int i11 = 0; i11 < length; i11++) {
                int[] c = d.f16121a.c(strArr[i11]);
                for (int i12 = 0; i12 < 128; i12++) {
                    System.arraycopy(fArr2, c[i12] * i10, fArr, (i10 * i12) + (i10 * 128 * i11), i10);
                }
            }
            return aVar;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final void f(a x4) {
        if (k6.a.b(c.class)) {
            return;
        }
        try {
            g.e(x4, "x");
            int[] iArr = x4.f16118a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i10 = 1;
            for (int i11 = 1; i11 < length; i11++) {
                i10 *= x4.f16118a[i11];
            }
            int[] iArr2 = {x4.f16118a[0], i10};
            x4.f16118a = iArr2;
            int a10 = a.C0193a.a(iArr2);
            float[] fArr = new float[a10];
            System.arraycopy(x4.c, 0, fArr, 0, Math.min(x4.f16119b, a10));
            x4.c = fArr;
            x4.f16119b = a10;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
        }
    }

    public static final a g(a x4, int i10) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(x4, "x");
            int[] iArr = x4.f16118a;
            int i11 = 0;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = (i13 - i10) + 1;
            a aVar = new a(new int[]{i12, i15, i14});
            float[] fArr = x4.c;
            float[] fArr2 = aVar.c;
            int i16 = 0;
            while (i16 < i12) {
                int i17 = i11;
                while (i17 < i14) {
                    int i18 = i11;
                    while (i18 < i15) {
                        int i19 = i18 * i14;
                        int i20 = (i16 * i15 * i14) + i19 + i17;
                        int i21 = (i16 * i13 * i14) + i19 + i17;
                        fArr2[i20] = Float.MIN_VALUE;
                        for (int i22 = i11; i22 < i10; i22++) {
                            fArr2[i20] = Math.max(fArr2[i20], fArr[(i22 * i14) + i21]);
                        }
                        i18++;
                        i11 = 0;
                    }
                    i17++;
                    i11 = 0;
                }
                i16++;
                i11 = 0;
            }
            return aVar;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final a h(a x4, a w7) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(x4, "x");
            g.e(w7, "w");
            int i10 = x4.f16118a[0];
            int[] iArr = w7.f16118a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            a aVar = new a(new int[]{i10, i12});
            float[] fArr = x4.c;
            float[] fArr2 = w7.c;
            float[] fArr3 = aVar.c;
            for (int i13 = 0; i13 < i10; i13++) {
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = (i13 * i12) + i14;
                    fArr3[i15] = 0.0f;
                    for (int i16 = 0; i16 < i11; i16++) {
                        fArr3[i15] = (fArr[(i13 * i11) + i16] * fArr2[(i16 * i12) + i14]) + fArr3[i15];
                    }
                }
            }
            return aVar;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final void i(a x4) {
        if (k6.a.b(c.class)) {
            return;
        }
        try {
            g.e(x4, "x");
            float[] fArr = x4.c;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (fArr[i10] < 0.0f) {
                    fArr[i10] = 0.0f;
                }
            }
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
        }
    }

    public static final void j(a x4) {
        if (k6.a.b(c.class)) {
            return;
        }
        try {
            g.e(x4, "x");
            int[] iArr = x4.f16118a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr = x4.c;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 * i11;
                int i14 = i13 + i11;
                float f10 = Float.MIN_VALUE;
                for (int i15 = i13; i15 < i14; i15++) {
                    float f11 = fArr[i15];
                    if (f11 > f10) {
                        f10 = f11;
                    }
                }
                float f12 = 0.0f;
                for (int i16 = i13; i16 < i14; i16++) {
                    float exp = (float) Math.exp(fArr[i16] - f10);
                    fArr[i16] = exp;
                    f12 += exp;
                }
                while (i13 < i14) {
                    fArr[i13] = fArr[i13] / f12;
                    i13++;
                }
            }
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
        }
    }

    public static final a k(a aVar) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f16118a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            a aVar2 = new a(new int[]{i11, i10});
            float[] fArr = aVar.c;
            float[] fArr2 = aVar2.c;
            for (int i12 = 0; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    fArr2[(i13 * i10) + i12] = fArr[(i12 * i11) + i13];
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final a l(a aVar) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f16118a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            a aVar2 = new a(new int[]{i12, i11, i10});
            float[] fArr = aVar.c;
            float[] fArr2 = aVar2.c;
            for (int i13 = 0; i13 < i10; i13++) {
                for (int i14 = 0; i14 < i11; i14++) {
                    for (int i15 = 0; i15 < i12; i15++) {
                        fArr2[(i14 * i10) + (i15 * i10 * i11) + i13] = fArr[(i14 * i12) + (i13 * i11 * i12) + i15];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }
}
