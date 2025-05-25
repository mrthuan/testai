package zm;

import am.x2;
import android.view.animation.Animation;

/* compiled from: PreviewCreateEditGuideView.kt */
/* loaded from: classes3.dex */
public final class a implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x2 f32426a;

    public a(x2 x2Var) {
        this.f32426a = x2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f32426a.f1653b.setAlpha(1.0f);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
