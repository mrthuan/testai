package e0;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewOscillator.java */
/* loaded from: classes.dex */
public abstract class c extends b0.e {

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: g  reason: collision with root package name */
        public final float[] f16320g = new float[1];

        /* renamed from: h  reason: collision with root package name */
        public ConstraintAttribute f16321h;

        @Override // b0.e
        public final void c(ConstraintAttribute constraintAttribute) {
            this.f16321h = constraintAttribute;
        }

        @Override // e0.c
        public final void e(View view, float f10) {
            float a10 = a(f10);
            float[] fArr = this.f16320g;
            fArr[0] = a10;
            e0.a.b(this.f16321h, view, fArr);
        }
    }

    /* compiled from: ViewOscillator.java */
    /* renamed from: e0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0205c extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class e extends c {

        /* renamed from: g  reason: collision with root package name */
        public boolean f16322g = false;

        @Override // e0.c
        public final void e(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (this.f16322g) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f16322g = true;
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

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class f extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class g extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class h extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class i extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class j extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class k extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class l extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class m extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void e(View view, float f10);

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // e0.c
        public final void e(View view, float f10) {
        }
    }
}
