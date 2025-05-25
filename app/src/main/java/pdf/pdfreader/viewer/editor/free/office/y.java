package pdf.pdfreader.viewer.editor.free.office;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import pdf.pdfreader.viewer.editor.free.ui.widget.ReflowOpenGuideView;
import pdf.pdfreader.viewer.editor.free.utils.d1;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class y implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26145a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f26146b;

    public y(OfficeReaderActivity officeReaderActivity, View view) {
        this.f26145a = officeReaderActivity;
        this.f26146b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        OfficeReaderActivity officeReaderActivity = this.f26145a;
        if (officeReaderActivity.f25941l0 != null) {
            View view = this.f26146b;
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                ReflowOpenGuideView reflowOpenGuideView = officeReaderActivity.f25941l0;
                if (reflowOpenGuideView != null) {
                    reflowOpenGuideView.r(officeReaderActivity.f25935j0);
                }
                View view2 = officeReaderActivity.f25935j0;
                if (view2 != null && view2.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    tn.a.d(officeReaderActivity, ea.a.p("RWkudw==", "MCSElJo4"), ea.a.p("RWkudyxyB2Yeb0NfDnU_ZGU=", "rvIlJES3"), ea.a.p("OG9DZA==", "KONYFsLC"), false);
                    ReflowOpenGuideView reflowOpenGuideView2 = officeReaderActivity.f25941l0;
                    if (reflowOpenGuideView2 != null) {
                        reflowOpenGuideView2.setVisibility(0);
                    }
                }
                no.f b10 = no.f.b(view.getContext());
                Context context = view.getContext();
                b10.getClass();
                d1.b(context).c(no.f.f22623n, false);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
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
