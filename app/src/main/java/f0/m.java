package f0;

import android.view.animation.Interpolator;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public final class m implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0.c f16943a;

    public m(b0.c cVar) {
        this.f16943a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) this.f16943a.a(f10);
    }
}
