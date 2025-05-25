package p3;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import androidx.activity.s;
import java.util.Iterator;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public final class d extends a implements Choreographer.FrameCallback {

    /* renamed from: j  reason: collision with root package name */
    public e3.e f23675j;
    public float c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23669d = false;

    /* renamed from: e  reason: collision with root package name */
    public long f23670e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f23671f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public int f23672g = 0;

    /* renamed from: h  reason: collision with root package name */
    public float f23673h = -2.1474836E9f;

    /* renamed from: i  reason: collision with root package name */
    public float f23674i = 2.1474836E9f;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23676k = false;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f23666b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        g(true);
    }

    public final float d() {
        e3.e eVar = this.f23675j;
        if (eVar == null) {
            return 0.0f;
        }
        float f10 = this.f23674i;
        if (f10 == 2.1474836E9f) {
            return eVar.f16351l;
        }
        return f10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        boolean z10;
        float e10;
        float d10;
        if (this.f23676k) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        e3.e eVar = this.f23675j;
        if (eVar != null && this.f23676k) {
            long j11 = this.f23670e;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / eVar.f16352m) / Math.abs(this.c));
            float f10 = this.f23671f;
            if (f()) {
                abs = -abs;
            }
            float f11 = f10 + abs;
            this.f23671f = f11;
            float e11 = e();
            float d11 = d();
            PointF pointF = f.f23678a;
            if (f11 >= e11 && f11 <= d11) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            this.f23671f = f.b(this.f23671f, e(), d());
            this.f23670e = j10;
            c();
            if (z11) {
                if (getRepeatCount() != -1 && this.f23672g >= getRepeatCount()) {
                    if (this.c < 0.0f) {
                        d10 = e();
                    } else {
                        d10 = d();
                    }
                    this.f23671f = d10;
                    g(true);
                    a(f());
                } else {
                    Iterator it = this.f23666b.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f23672g++;
                    if (getRepeatMode() == 2) {
                        this.f23669d = !this.f23669d;
                        this.c = -this.c;
                    } else {
                        if (f()) {
                            e10 = d();
                        } else {
                            e10 = e();
                        }
                        this.f23671f = e10;
                    }
                    this.f23670e = j10;
                }
            }
            if (this.f23675j != null) {
                float f12 = this.f23671f;
                if (f12 < this.f23673h || f12 > this.f23674i) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f23673h), Float.valueOf(this.f23674i), Float.valueOf(this.f23671f)));
                }
            }
            s.y();
        }
    }

    public final float e() {
        e3.e eVar = this.f23675j;
        if (eVar == null) {
            return 0.0f;
        }
        float f10 = this.f23673h;
        if (f10 == -2.1474836E9f) {
            return eVar.f16350k;
        }
        return f10;
    }

    public final boolean f() {
        if (this.c < 0.0f) {
            return true;
        }
        return false;
    }

    public final void g(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f23676k = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float e10;
        float d10;
        float e11;
        if (this.f23675j == null) {
            return 0.0f;
        }
        if (f()) {
            e10 = d() - this.f23671f;
            d10 = d();
            e11 = e();
        } else {
            e10 = this.f23671f - e();
            d10 = d();
            e11 = e();
        }
        return e10 / (d10 - e11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        float f10;
        e3.e eVar = this.f23675j;
        if (eVar == null) {
            f10 = 0.0f;
        } else {
            float f11 = this.f23671f;
            float f12 = eVar.f16350k;
            f10 = (f11 - f12) / (eVar.f16351l - f12);
        }
        return Float.valueOf(f10);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        e3.e eVar = this.f23675j;
        if (eVar == null) {
            return 0L;
        }
        return eVar.b();
    }

    public final void h(float f10) {
        if (this.f23671f == f10) {
            return;
        }
        this.f23671f = f.b(f10, e(), d());
        this.f23670e = 0L;
        c();
    }

    public final void i(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            e3.e eVar = this.f23675j;
            if (eVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = eVar.f16350k;
            }
            if (eVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = eVar.f16351l;
            }
            this.f23673h = f.b(f10, f12, f13);
            this.f23674i = f.b(f11, f12, f13);
            h((int) f.b(this.f23671f, f10, f11));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f23676k;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f23669d) {
            this.f23669d = false;
            this.c = -this.c;
        }
    }
}
