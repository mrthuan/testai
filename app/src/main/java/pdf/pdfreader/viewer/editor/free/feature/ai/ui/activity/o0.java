package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryDetailActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24635b;

    public /* synthetic */ o0(Object obj, int i10) {
        this.f24634a = i10;
        this.f24635b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24634a;
        Object obj = this.f24635b;
        switch (i10) {
            case 0:
                ImageMindPreviewActivity imageMindPreviewActivity = (ImageMindPreviewActivity) obj;
                kotlin.jvm.internal.g.e(imageMindPreviewActivity, ea.a.p("R2gic1cw", "SHclV5Fl"));
                pdf.pdfreader.viewer.editor.free.utils.j1.e(imageMindPreviewActivity, imageMindPreviewActivity.getString(R.string.arg_res_0x7f13055f), true, null, -1);
                return;
            case 1:
                AIChatActivity aIChatActivity = (AIChatActivity) obj;
                AIChatActivity.a aVar = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("O2hYc10w", "YfbUcAo4"));
                AIChatRecyclerView aIChatRecyclerView = aIChatActivity.B;
                if (aIChatRecyclerView != null) {
                    aIChatRecyclerView.D0();
                    return;
                }
                return;
            case 2:
                AIExperienceActivity aIExperienceActivity = (AIExperienceActivity) obj;
                AIExperienceActivity.a aVar2 = AIExperienceActivity.L;
                kotlin.jvm.internal.g.e(aIExperienceActivity, ea.a.p("O2hYc10w", "CwIgyyh3"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(aIExperienceActivity)) {
                    aIExperienceActivity.d2().f734m.setPivotX(aIExperienceActivity.d2().f734m.getMeasuredWidth());
                    aIExperienceActivity.d2().f734m.setPivotY(0.0f);
                    return;
                }
                aIExperienceActivity.d2().f734m.setPivotX(0.0f);
                aIExperienceActivity.d2().f734m.setPivotY(0.0f);
                return;
            case 3:
                AIHistoryDetailActivity aIHistoryDetailActivity = (AIHistoryDetailActivity) obj;
                AIHistoryDetailActivity.a aVar3 = AIHistoryDetailActivity.A;
                kotlin.jvm.internal.g.e(aIHistoryDetailActivity, ea.a.p("R2gic1cw", "eI04ZEzn"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIHistoryDetailActivity)) {
                    aIHistoryDetailActivity.a2().f805g.c.setVisibility(8);
                    return;
                }
                return;
            case 4:
                ((ReaderAIPreviewActivity) obj).t2();
                return;
            default:
                ((d1) obj).f24574b.t2();
                return;
        }
    }
}
