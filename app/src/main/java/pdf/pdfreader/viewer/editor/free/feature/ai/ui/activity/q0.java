package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.widget.EditText;
import com.google.android.flexbox.FlexboxLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24642a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24643b;

    public /* synthetic */ q0(jl.a aVar, int i10) {
        this.f24642a = i10;
        this.f24643b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editContentView;
        int i10 = this.f24642a;
        jl.a aVar = this.f24643b;
        switch (i10) {
            case 0:
                ImageMindPreviewActivity imageMindPreviewActivity = (ImageMindPreviewActivity) aVar;
                kotlin.jvm.internal.g.e(imageMindPreviewActivity, ea.a.p("O2hYc10w", "CPYJwMMv"));
                if (!imageMindPreviewActivity.isFinishing() && !imageMindPreviewActivity.isDestroyed()) {
                    pdf.pdfreader.viewer.editor.free.utils.j1.h(imageMindPreviewActivity.getString(R.string.arg_res_0x7f13044c), imageMindPreviewActivity, true, R.drawable.ic_fail_warning);
                    return;
                }
                return;
            case 1:
                AIChatActivity aIChatActivity = (AIChatActivity) aVar;
                AIChatActivity.a aVar2 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("EGgcc2kw", "jDduMXqD"));
                if (!aIChatActivity.isFinishing()) {
                    FlexboxLayout flexboxLayout = aIChatActivity.M;
                    if (flexboxLayout != null) {
                        flexboxLayout.setVisibility(8);
                    }
                    AskQuestionView askQuestionView = aIChatActivity.D;
                    if (askQuestionView != null) {
                        askQuestionView.setVisibility(8);
                    }
                    AskQuestionView askQuestionView2 = aIChatActivity.D;
                    if (askQuestionView2 != null && (editContentView = askQuestionView2.getEditContentView()) != null) {
                        pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editContentView);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AIExperienceActivity aIExperienceActivity = (AIExperienceActivity) aVar;
                AIExperienceActivity.a aVar3 = AIExperienceActivity.L;
                kotlin.jvm.internal.g.e(aIExperienceActivity, ea.a.p("HWgoc0Aw", "H7iAdCfc"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(aIExperienceActivity)) {
                    aIExperienceActivity.d2().f726e.setPivotX(aIExperienceActivity.d2().f726e.getMeasuredWidth());
                    aIExperienceActivity.d2().f726e.setPivotY(0.0f);
                    return;
                }
                aIExperienceActivity.d2().f726e.setPivotX(0.0f);
                aIExperienceActivity.d2().f726e.setPivotY(0.0f);
                return;
            default:
                AIHistoryActivity aIHistoryActivity = (AIHistoryActivity) aVar;
                int i11 = AIHistoryActivity.A;
                kotlin.jvm.internal.g.e(aIHistoryActivity, ea.a.p("R2gic1cw", "9yh07XrQ"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIHistoryActivity)) {
                    aIHistoryActivity.f24400x = System.currentTimeMillis();
                    aIHistoryActivity.c2().f780k.c.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
