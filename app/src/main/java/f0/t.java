package f0;

import android.view.animation.Interpolator;

/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public final class t implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0.c f16988a;

    public t(b0.c cVar) {
        this.f16988a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) this.f16988a.a(f10);
    }
}
