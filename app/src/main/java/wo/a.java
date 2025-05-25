package wo;

import android.animation.Animator;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeSizeBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class a implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PreviewSeekBar f31403a;

    public a(PreviewSeekBar previewSeekBar) {
        this.f31403a = previewSeekBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g.e(animator, "animator");
        PreviewSeekBar previewSeekBar = this.f31403a;
        previewSeekBar.f28429t = 0.0f;
        previewSeekBar.setProgress(previewSeekBar.f28427r);
        b bVar = previewSeekBar.f28434y;
        if (bVar != null) {
            ((AddTextChangeSizeBottomSheetView.a) bVar).a(previewSeekBar.f28427r, true);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g.e(animator, "animator");
    }
}
