package a9;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class o extends androidx.appcompat.view.menu.c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f446j = new a();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f447d;

    /* renamed from: e  reason: collision with root package name */
    public final m1.b f448e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearProgressIndicatorSpec f449f;

    /* renamed from: g  reason: collision with root package name */
    public int f450g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f451h;

    /* renamed from: i  reason: collision with root package name */
    public float f452i;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends Property<o, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(o oVar) {
            return Float.valueOf(oVar.f452i);
        }

        @Override // android.util.Property
        public final void set(o oVar, Float f10) {
            o oVar2 = oVar;
            float floatValue = f10.floatValue();
            oVar2.f452i = floatValue;
            float[] fArr = (float[]) oVar2.f2010b;
            fArr[0] = 0.0f;
            float f11 = (((int) (floatValue * 333.0f)) - 0) / 667;
            m1.b bVar = oVar2.f448e;
            float interpolation = bVar.getInterpolation(f11);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = (float[]) oVar2.f2010b;
            float interpolation2 = bVar.getInterpolation(f11 + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = (float[]) oVar2.f2010b;
            fArr3[5] = 1.0f;
            if (oVar2.f451h && fArr3[3] < 1.0f) {
                int[] iArr = (int[]) oVar2.c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = t0.x(oVar2.f449f.c[oVar2.f450g], ((l) oVar2.f2009a).f437j);
                oVar2.f451h = false;
            }
            ((l) oVar2.f2009a).invalidateSelf();
        }
    }

    public o(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f450g = 1;
        this.f449f = linearProgressIndicatorSpec;
        this.f448e = new m1.b();
    }

    @Override // androidx.appcompat.view.menu.c
    public final void c() {
        ObjectAnimator objectAnimator = this.f447d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.view.menu.c
    public final void f() {
        k();
    }

    @Override // androidx.appcompat.view.menu.c
    public final void i() {
        if (this.f447d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f446j, 0.0f, 1.0f);
            this.f447d = ofFloat;
            ofFloat.setDuration(333L);
            this.f447d.setInterpolator(null);
            this.f447d.setRepeatCount(-1);
            this.f447d.addListener(new n(this));
        }
        k();
        this.f447d.start();
    }

    public final void k() {
        this.f451h = true;
        this.f450g = 1;
        Arrays.fill((int[]) this.c, t0.x(this.f449f.c[0], ((l) this.f2009a).f437j));
    }

    @Override // androidx.appcompat.view.menu.c
    public final void h() {
    }

    @Override // androidx.appcompat.view.menu.c
    public final void j() {
    }

    @Override // androidx.appcompat.view.menu.c
    public final void g(BaseProgressIndicator.c cVar) {
    }
}
