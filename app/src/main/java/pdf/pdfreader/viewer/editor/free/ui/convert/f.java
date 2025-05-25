package pdf.pdfreader.viewer.editor.free.ui.convert;

import android.animation.Animator;
import androidx.lifecycle.w;
import java.util.ArrayList;
import kotlin.jvm.internal.g;

/* compiled from: ReaderSelectImagePreviewActivity.kt */
/* loaded from: classes3.dex */
public final class f implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderSelectImagePreviewActivity f27420a;

    public f(ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity) {
        this.f27420a = readerSelectImagePreviewActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        g.e(animation, "animation");
        w<ArrayList<ul.b>> wVar = this.f27420a.p2().f30455d;
        ArrayList<ul.b> d10 = wVar.d();
        if (d10 != null) {
            for (ul.b bVar : d10) {
                bVar.b(false);
            }
        }
        wVar.j(new ArrayList<>());
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        g.e(animation, "animation");
    }
}
