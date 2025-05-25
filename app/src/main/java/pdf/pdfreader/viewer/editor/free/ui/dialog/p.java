package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.animation.Animation;

/* compiled from: GalleryChooserPopu.kt */
/* loaded from: classes3.dex */
public final class p implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f27722a;

    public p(n nVar) {
        this.f27722a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        this.f27722a.f27697a.setVisibility(0);
    }
}
