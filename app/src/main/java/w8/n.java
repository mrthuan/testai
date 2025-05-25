package w8;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* compiled from: ReversableAnimatedValueInterpolator.java */
/* loaded from: classes2.dex */
public final class n implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public final TimeInterpolator f31043a;

    public n(Interpolator interpolator) {
        this.f31043a = interpolator;
    }

    public static TimeInterpolator a(boolean z10, Interpolator interpolator) {
        if (z10) {
            return interpolator;
        }
        return new n(interpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return 1.0f - this.f31043a.getInterpolation(f10);
    }
}
