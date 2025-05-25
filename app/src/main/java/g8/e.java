package g8;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes2.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f17679a;

    public e(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f17679a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f17679a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
