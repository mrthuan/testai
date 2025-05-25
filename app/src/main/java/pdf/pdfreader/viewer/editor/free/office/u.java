package pdf.pdfreader.viewer.editor.free.office;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import pdf.pdfreader.viewer.editor.free.ui.widget.PreviewAIGuideView;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26139a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageView f26140b;

    public u(OfficeReaderActivity officeReaderActivity, ImageView imageView) {
        this.f26139a = officeReaderActivity;
        this.f26140b = imageView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        OfficeReaderActivity officeReaderActivity = this.f26139a;
        if (officeReaderActivity.f25944m0 != null) {
            ImageView imageView = this.f26140b;
            if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
                View view = officeReaderActivity.L1;
                if (view != null) {
                    view.setVisibility(0);
                }
                PreviewAIGuideView previewAIGuideView = officeReaderActivity.f25944m0;
                if (previewAIGuideView != null) {
                    previewAIGuideView.r(officeReaderActivity.K1);
                }
                if (imageView.getVisibility() == 0) {
                    PreviewAIGuideView previewAIGuideView2 = officeReaderActivity.f25944m0;
                    if (previewAIGuideView2 != null) {
                        previewAIGuideView2.setVisibility(0);
                    }
                    tn.a.d(officeReaderActivity, ea.a.p("KHVYZGU=", "di3MECTh"), ea.a.p("GWkgdVBkL187aAl3", "9sxG9JAy"), "view_".concat(officeReaderActivity.u2()), false);
                    q0.w(officeReaderActivity, "preview_ai_assistant_guide_show_in_162", false);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            }
        }
        officeReaderActivity.j3();
    }
}
