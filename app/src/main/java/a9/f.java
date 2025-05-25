package a9;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class f extends androidx.appcompat.view.menu.c {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f407l = {0, 1350, 2700, 4050};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f408m = {667, 2017, 3367, 4717};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f409n = {1000, 2350, 3700, 5050};

    /* renamed from: o  reason: collision with root package name */
    public static final a f410o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f411p = new b();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f412d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f413e;

    /* renamed from: f  reason: collision with root package name */
    public final m1.b f414f;

    /* renamed from: g  reason: collision with root package name */
    public final CircularProgressIndicatorSpec f415g;

    /* renamed from: h  reason: collision with root package name */
    public int f416h;

    /* renamed from: i  reason: collision with root package name */
    public float f417i;

    /* renamed from: j  reason: collision with root package name */
    public float f418j;

    /* renamed from: k  reason: collision with root package name */
    public g2.c f419k;

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends Property<f, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(f fVar) {
            return Float.valueOf(fVar.f417i);
        }

        @Override // android.util.Property
        public final void set(f fVar, Float f10) {
            m1.b bVar;
            f fVar2 = fVar;
            float floatValue = f10.floatValue();
            fVar2.f417i = floatValue;
            int i10 = (int) (5400.0f * floatValue);
            float[] fArr = (float[]) fVar2.f2010b;
            float f11 = floatValue * 1520.0f;
            fArr[0] = (-20.0f) + f11;
            fArr[1] = f11;
            int i11 = 0;
            while (true) {
                bVar = fVar2.f414f;
                if (i11 >= 4) {
                    break;
                }
                float f12 = 667;
                float[] fArr2 = (float[]) fVar2.f2010b;
                fArr2[1] = (bVar.getInterpolation((i10 - f.f407l[i11]) / f12) * 250.0f) + fArr2[1];
                float f13 = (i10 - f.f408m[i11]) / f12;
                float[] fArr3 = (float[]) fVar2.f2010b;
                fArr3[0] = (bVar.getInterpolation(f13) * 250.0f) + fArr3[0];
                i11++;
            }
            float[] fArr4 = (float[]) fVar2.f2010b;
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = ((f15 - f14) * fVar2.f418j) + f14;
            fArr4[0] = f16;
            fArr4[0] = f16 / 360.0f;
            fArr4[1] = f15 / 360.0f;
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    break;
                }
                float f17 = (i10 - f.f409n[i12]) / 333;
                if (f17 >= 0.0f && f17 <= 1.0f) {
                    int i13 = i12 + fVar2.f416h;
                    CircularProgressIndicatorSpec circularProgressIndicatorSpec = fVar2.f415g;
                    int[] iArr = circularProgressIndicatorSpec.c;
                    int length = i13 % iArr.length;
                    ((int[]) fVar2.c)[0] = f8.c.a(bVar.getInterpolation(f17), Integer.valueOf(t0.x(iArr[length], ((l) fVar2.f2009a).f437j)), Integer.valueOf(t0.x(circularProgressIndicatorSpec.c[(length + 1) % iArr.length], ((l) fVar2.f2009a).f437j))).intValue();
                    break;
                }
                i12++;
            }
            ((l) fVar2.f2009a).invalidateSelf();
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class b extends Property<f, Float> {
        public b() {
            super(Float.class, "completeEndFraction");
        }

        @Override // android.util.Property
        public final Float get(f fVar) {
            return Float.valueOf(fVar.f418j);
        }

        @Override // android.util.Property
        public final void set(f fVar, Float f10) {
            fVar.f418j = f10.floatValue();
        }
    }

    public f(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f416h = 0;
        this.f419k = null;
        this.f415g = circularProgressIndicatorSpec;
        this.f414f = new m1.b();
    }

    @Override // androidx.appcompat.view.menu.c
    public final void c() {
        ObjectAnimator objectAnimator = this.f412d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.view.menu.c
    public final void f() {
        k();
    }

    @Override // androidx.appcompat.view.menu.c
    public final void g(BaseProgressIndicator.c cVar) {
        this.f419k = cVar;
    }

    @Override // androidx.appcompat.view.menu.c
    public final void h() {
        ObjectAnimator objectAnimator = this.f413e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((l) this.f2009a).isVisible()) {
                this.f413e.start();
            } else {
                c();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.c
    public final void i() {
        if (this.f412d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f410o, 0.0f, 1.0f);
            this.f412d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f412d.setInterpolator(null);
            this.f412d.setRepeatCount(-1);
            this.f412d.addListener(new d(this));
        }
        if (this.f413e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f411p, 0.0f, 1.0f);
            this.f413e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f413e.setInterpolator(this.f414f);
            this.f413e.addListener(new e(this));
        }
        k();
        this.f412d.start();
    }

    @Override // androidx.appcompat.view.menu.c
    public final void j() {
        this.f419k = null;
    }

    public final void k() {
        this.f416h = 0;
        ((int[]) this.c)[0] = t0.x(this.f415g.c[0], ((l) this.f2009a).f437j);
        this.f418j = 0.0f;
    }
}
