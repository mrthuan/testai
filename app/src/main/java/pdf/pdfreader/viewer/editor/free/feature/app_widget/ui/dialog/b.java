package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.g;

/* compiled from: PdfReaderAppWidgetNewDialog.kt */
/* loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfReaderAppWidgetNewDialog f24840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24841b;

    public b(PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog, int i10) {
        this.f24840a = pdfReaderAppWidgetNewDialog;
        this.f24841b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        g.e(animation, "animation");
        super.onAnimationEnd(animation);
        this.f24840a.J(this.f24841b);
    }
}
