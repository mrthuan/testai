package g2;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: Animatable2Compat.java */
/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f17422a;

    public b(c cVar) {
        this.f17422a = cVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f17422a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f17422a.b(drawable);
    }
}
