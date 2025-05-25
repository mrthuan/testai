package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.animation.Animator;
import androidx.viewpager2.widget.ViewPager2;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class d0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f25800a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25801b;

    public d0(ViewPager2 viewPager2, ImageAdjustActivity imageAdjustActivity) {
        this.f25800a = viewPager2;
        this.f25801b = imageAdjustActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        this.f25800a.b();
        ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
        this.f25801b.u2(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }
}
