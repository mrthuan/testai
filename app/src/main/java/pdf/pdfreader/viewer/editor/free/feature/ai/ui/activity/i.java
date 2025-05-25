package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIHistoryGuideView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24595a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AIChatActivity f24596b;

    public /* synthetic */ i(AIChatActivity aIChatActivity, int i10) {
        this.f24595a = i10;
        this.f24596b = aIChatActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24595a;
        boolean z10 = true;
        AIChatActivity aIChatActivity = this.f24596b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("TWg5cxIw", "gg9P6mVr"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIChatActivity)) {
                    AIChatRecyclerView aIChatRecyclerView = aIChatActivity.B;
                    if (aIChatRecyclerView == null || aIChatRecyclerView.getScrollState() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        aIChatActivity.z2();
                        return;
                    }
                    return;
                }
                return;
            default:
                AIChatActivity.a aVar = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("R2gic1cw", "Ofn0Ak6j"));
                if (!aIChatActivity.isFinishing() && !aIChatActivity.isDestroyed()) {
                    View view = aIChatActivity.J;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    AIHistoryGuideView aIHistoryGuideView = aIChatActivity.P;
                    if (aIHistoryGuideView != null) {
                        aIHistoryGuideView.setVisibility(0);
                    }
                    AIHistoryGuideView aIHistoryGuideView2 = aIChatActivity.P;
                    if (aIHistoryGuideView2 != null) {
                        aIHistoryGuideView2.setOnFakerClickListener(new u(aIChatActivity));
                    }
                    lm.f.c.getClass();
                    lm.f.f21775e.c(lm.f.f21774d[0], Integer.valueOf(lm.f.h() + 1));
                    return;
                }
                return;
        }
    }
}
