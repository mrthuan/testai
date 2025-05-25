package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.animation.Animator;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: SubscriptionDarkTestJActivity.kt */
/* loaded from: classes3.dex */
public final class p implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f24945a;

    public p(ViewPager2 viewPager2) {
        this.f24945a = viewPager2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        this.f24945a.b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        this.f24945a.a();
    }
}
