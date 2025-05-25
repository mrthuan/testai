package e0;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class d extends b0.j {

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<ConstraintAttribute> f16323f;

        /* renamed from: g  reason: collision with root package name */
        public float[] f16324g;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f16323f = sparseArray;
        }

        @Override // b0.j
        public final void b(float f10, int i10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // b0.j
        public final void c(int i10) {
            float[] fArr;
            SparseArray<ConstraintAttribute> sparseArray = this.f16323f;
            int size = sparseArray.size();
            int c = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.f16324g = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, c);
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = sparseArray.keyAt(i11) * 0.01d;
                sparseArray.valueAt(i11).b(this.f16324g);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f16324g.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f5233a = b0.b.a(i10, dArr, dArr2);
        }

        @Override // e0.d
        public final void d(View view, float f10) {
            this.f5233a.d(f10, this.f16324g);
            e0.a.b(this.f16323f.valueAt(0), view, this.f16324g);
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class c extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class f extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class g extends d {

        /* renamed from: f  reason: collision with root package name */
        public boolean f16325f = false;

        @Override // e0.d
        public final void d(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (this.f16325f) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f16325f = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f10)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class h extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class i extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class j extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class k extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class l extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class m extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class n extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class o extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void d(View view, float f10);

    /* compiled from: ViewSpline.java */
    /* renamed from: e0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0206d extends d {
        @Override // e0.d
        public final void d(View view, float f10) {
        }
    }
}
