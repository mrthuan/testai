package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import am.i2;
import android.widget.EditText;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24639b;

    public /* synthetic */ p0(jl.a aVar, int i10) {
        this.f24638a = i10;
        this.f24639b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AskQuestionView askQuestionView;
        i2 i2Var;
        EditText editText;
        int i10 = this.f24638a;
        jl.a aVar = this.f24639b;
        switch (i10) {
            case 0:
                ImageMindPreviewActivity imageMindPreviewActivity = (ImageMindPreviewActivity) aVar;
                kotlin.jvm.internal.g.e(imageMindPreviewActivity, ea.a.p("R2gic1cw", "midUeMLa"));
                if (!imageMindPreviewActivity.isFinishing() && !imageMindPreviewActivity.isDestroyed()) {
                    pdf.pdfreader.viewer.editor.free.utils.j1.h(imageMindPreviewActivity.getString(R.string.arg_res_0x7f1303e5), imageMindPreviewActivity, false, R.drawable.ic_copy_success);
                    return;
                }
                return;
            default:
                AIChatActivity aIChatActivity = (AIChatActivity) aVar;
                AIChatActivity.a aVar2 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("R2gic1cw", "m0eWe73O"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIChatActivity) && (askQuestionView = aIChatActivity.D) != null && (i2Var = askQuestionView.f24748a) != null && (editText = i2Var.c) != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
                    return;
                }
                return;
        }
    }
}
