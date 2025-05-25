package a9;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class r extends androidx.appcompat.view.menu.c {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f455l = {533, 567, 850, 750};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f456m = {1267, 1000, 333, 0};

    /* renamed from: n  reason: collision with root package name */
    public static final a f457n = new a();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f458d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f459e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator[] f460f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearProgressIndicatorSpec f461g;

    /* renamed from: h  reason: collision with root package name */
    public int f462h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f463i;

    /* renamed from: j  reason: collision with root package name */
    public float f464j;

    /* renamed from: k  reason: collision with root package name */
    public g2.c f465k;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    public class a extends Property<r, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(r rVar) {
            return Float.valueOf(rVar.f464j);
        }

        @Override // android.util.Property
        public final void set(r rVar, Float f10) {
            r rVar2 = rVar;
            float floatValue = f10.floatValue();
            rVar2.f464j = floatValue;
            int i10 = (int) (floatValue * 1800.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                ((float[]) rVar2.f2010b)[i11] = Math.max(0.0f, Math.min(1.0f, rVar2.f460f[i11].getInterpolation((i10 - r.f456m[i11]) / r.f455l[i11])));
            }
            if (rVar2.f463i) {
                Arrays.fill((int[]) rVar2.c, t0.x(rVar2.f461g.c[rVar2.f462h], ((l) rVar2.f2009a).f437j));
                rVar2.f463i = false;
            }
            ((l) rVar2.f2009a).invalidateSelf();
        }
    }

    public r(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f462h = 0;
        this.f465k = null;
        this.f461g = linearProgressIndicatorSpec;
        this.f460f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // androidx.appcompat.view.menu.c
    public final void c() {
        ObjectAnimator objectAnimator = this.f458d;
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
        this.f465k = cVar;
    }

    @Override // androidx.appcompat.view.menu.c
    public final void h() {
        ObjectAnimator objectAnimator = this.f459e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            c();
            if (((l) this.f2009a).isVisible()) {
                this.f459e.setFloatValues(this.f464j, 1.0f);
                this.f459e.setDuration((1.0f - this.f464j) * 1800.0f);
                this.f459e.start();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.c
    public final void i() {
        ObjectAnimator objectAnimator = this.f458d;
        a aVar = f457n;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f458d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f458d.setInterpolator(null);
            this.f458d.setRepeatCount(-1);
            this.f458d.addListener(new p(this));
        }
        if (this.f459e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f);
            this.f459e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f459e.setInterpolator(null);
            this.f459e.addListener(new q(this));
        }
        k();
        this.f458d.start();
    }

    @Override // androidx.appcompat.view.menu.c
    public final void j() {
        this.f465k = null;
    }

    public final void k() {
        this.f462h = 0;
        int x4 = t0.x(this.f461g.c[0], ((l) this.f2009a).f437j);
        int[] iArr = (int[]) this.c;
        iArr[0] = x4;
        iArr[1] = x4;
    }
}
