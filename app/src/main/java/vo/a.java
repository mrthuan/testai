package vo;

import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatTextView;
import pdf.pdfreader.viewer.editor.free.ui.widget.guide.BaseGuidePopView;

/* compiled from: BaseGuidePopView.kt */
/* loaded from: classes3.dex */
public final class a implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseGuidePopView<i2.a> f30900a;

    public a(BaseGuidePopView<i2.a> baseGuidePopView) {
        this.f30900a = baseGuidePopView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AppCompatTextView contentTv = this.f30900a.getContentTv();
        if (contentTv != null) {
            contentTv.setAlpha(1.0f);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
