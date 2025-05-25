package f8;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: MotionTiming.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f17153a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17154b;
    public final TimeInterpolator c;

    /* renamed from: d  reason: collision with root package name */
    public int f17155d;

    /* renamed from: e  reason: collision with root package name */
    public int f17156e;

    public i(long j10) {
        this.f17153a = 0L;
        this.f17154b = 300L;
        this.c = null;
        this.f17155d = 0;
        this.f17156e = 1;
        this.f17153a = j10;
        this.f17154b = 150L;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f17153a);
        animator.setDuration(this.f17154b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f17155d);
            valueAnimator.setRepeatMode(this.f17156e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator == null) {
            return b.f17142b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f17153a != iVar.f17153a || this.f17154b != iVar.f17154b || this.f17155d != iVar.f17155d || this.f17156e != iVar.f17156e) {
            return false;
        }
        return b().getClass().equals(iVar.b().getClass());
    }

    public final int hashCode() {
        long j10 = this.f17153a;
        long j11 = this.f17154b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f17155d) * 31) + this.f17156e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(i.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f17153a);
        sb2.append(" duration: ");
        sb2.append(this.f17154b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f17155d);
        sb2.append(" repeatMode: ");
        return a6.h.g(sb2, this.f17156e, "}\n");
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f17153a = 0L;
        this.f17154b = 300L;
        this.c = null;
        this.f17155d = 0;
        this.f17156e = 1;
        this.f17153a = j10;
        this.f17154b = j11;
        this.c = timeInterpolator;
    }
}
