package e0;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import b0.o;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import l.t;

/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class e extends o {

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setAlpha(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: k  reason: collision with root package name */
        public final String f16326k;

        /* renamed from: l  reason: collision with root package name */
        public final SparseArray<ConstraintAttribute> f16327l;

        /* renamed from: m  reason: collision with root package name */
        public final SparseArray<float[]> f16328m = new SparseArray<>();

        /* renamed from: n  reason: collision with root package name */
        public float[] f16329n;

        /* renamed from: o  reason: collision with root package name */
        public float[] f16330o;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f16326k = str.split(",")[1];
            this.f16327l = sparseArray;
        }

        @Override // b0.o
        public final void b(int i10, int i11, float f10, float f11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // b0.o
        public final void c(int i10) {
            float[] fArr;
            SparseArray<ConstraintAttribute> sparseArray = this.f16327l;
            int size = sparseArray.size();
            int c = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            int i11 = c + 2;
            this.f16329n = new float[i11];
            this.f16330o = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = sparseArray.keyAt(i12);
                float[] valueAt = this.f16328m.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                sparseArray.valueAt(i12).b(this.f16329n);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f16329n.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[c] = valueAt[0];
                dArr3[c + 1] = valueAt[1];
            }
            this.f5258a = b0.b.a(i10, dArr, dArr2);
        }

        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            boolean z10;
            this.f5258a.d(f10, this.f16329n);
            float[] fArr = this.f16329n;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f5265i;
            if (Float.isNaN(this.f5266j)) {
                float e10 = tVar.e(view, this.f16326k);
                this.f5266j = e10;
                if (Float.isNaN(e10)) {
                    this.f5266j = 0.0f;
                }
            }
            float f13 = (float) ((((j11 * 1.0E-9d) * f11) + this.f5266j) % 1.0d);
            this.f5266j = f13;
            this.f5265i = j10;
            float a10 = a(f13);
            this.f5264h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f16330o;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f5264h;
                float f14 = this.f16329n[i10];
                if (f14 != 0.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f5264h = z11 | z10;
                fArr2[i10] = (f14 * a10) + f12;
                i10++;
            }
            e0.a.b(this.f16327l.valueAt(0), view, this.f16330o);
            if (f11 != 0.0f) {
                this.f5264h = true;
            }
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class c extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setElevation(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* renamed from: e0.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0207e extends e {

        /* renamed from: k  reason: collision with root package name */
        public boolean f16331k = false;

        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(d(f10, j10, view, tVar));
            } else if (this.f16331k) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f16331k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(d(f10, j10, view, tVar)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class f extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setRotation(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class g extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setRotationX(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class h extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setRotationY(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class i extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setScaleX(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class j extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setScaleY(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class k extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setTranslationX(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class l extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setTranslationY(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class m extends e {
        @Override // e0.e
        public final boolean e(float f10, long j10, View view, t tVar) {
            view.setTranslationZ(d(f10, j10, view, tVar));
            return this.f5264h;
        }
    }

    public final float d(float f10, long j10, View view, t tVar) {
        float[] fArr = this.f5263g;
        this.f5258a.d(f10, fArr);
        boolean z10 = true;
        float f11 = fArr[1];
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            this.f5264h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f5266j)) {
            float e10 = tVar.e(view, this.f5262f);
            this.f5266j = e10;
            if (Float.isNaN(e10)) {
                this.f5266j = 0.0f;
            }
        }
        float f12 = (float) (((((j10 - this.f5265i) * 1.0E-9d) * f11) + this.f5266j) % 1.0d);
        this.f5266j = f12;
        String str = this.f5262f;
        HashMap hashMap = (HashMap) tVar.f20374a;
        if (!hashMap.containsKey(view)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, new float[]{f12});
            hashMap.put(view, hashMap2);
        } else {
            HashMap hashMap3 = (HashMap) hashMap.get(view);
            if (hashMap3 == null) {
                hashMap3 = new HashMap();
            }
            if (!hashMap3.containsKey(str)) {
                hashMap3.put(str, new float[]{f12});
                hashMap.put(view, hashMap3);
            } else {
                float[] fArr2 = (float[]) hashMap3.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f12;
                hashMap3.put(str, fArr2);
            }
        }
        this.f5265i = j10;
        float f13 = fArr[0];
        float a10 = (a(this.f5266j) * f13) + fArr[2];
        if (f13 == 0.0f && i10 == 0) {
            z10 = false;
        }
        this.f5264h = z10;
        return a10;
    }

    public abstract boolean e(float f10, long j10, View view, t tVar);
}
