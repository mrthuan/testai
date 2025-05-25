package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.x1;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: PreviewPageManageGuideView.kt */
/* loaded from: classes3.dex */
public final class b implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x1 f25613a;

    public b(x1 x1Var) {
        this.f25613a = x1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ((AppCompatTextView) this.f25613a.f1646d).setAlpha(1.0f);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
