package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: PDFPageManagerActivity.kt */
/* loaded from: classes3.dex */
public final class a0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFPageManagerActivity f25298a;

    public a0(PDFPageManagerActivity pDFPageManagerActivity) {
        this.f25298a = pDFPageManagerActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
        PDFPageManagerActivity pDFPageManagerActivity = this.f25298a;
        pDFPageManagerActivity.o2().f1277q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        pDFPageManagerActivity.o2().f1277q.setVisibility(0);
        pDFPageManagerActivity.o2().f1277q.setTranslationY(pDFPageManagerActivity.o2().f1277q.getMeasuredHeight());
        pDFPageManagerActivity.o2().f1276p.b(pDFPageManagerActivity.o2().f1286z, new qe.g(pDFPageManagerActivity)).f29293a = 3.52f;
        ConstraintLayout constraintLayout = pDFPageManagerActivity.o2().f1277q;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4CYVNlJGE4YSNlQEMqRTt0C2EXdAd1U2NWczhSHG90", "ytT0Inx7"));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, ea.a.p("I3I1bhFsL3QhbwhZ", "hoWTbNHw"), pDFPageManagerActivity.o2().f1277q.getTranslationY(), 0.0f);
        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("IGZ3bBZhQygsaS93WSBKdEdhAHMpYRFplYDJZUdzGW8gdB90C2FZczZhPmkabjEsFTAIKQ==", "B1uKwo4K"));
        ofFloat.setDuration(350L);
        ofFloat.start();
        pDFPageManagerActivity.D0 = ofFloat;
    }
}
