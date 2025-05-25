package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.i2;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: AskQuestionView.kt */
/* loaded from: classes3.dex */
public final class j extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AskQuestionView f24780b;
    public final /* synthetic */ i2 c;

    public j(AskQuestionView askQuestionView, i2 i2Var) {
        this.f24780b = askQuestionView;
        this.c = i2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View v10) {
        kotlin.jvm.internal.g.e(v10, "v");
        AskQuestionView askQuestionView = this.f24780b;
        AskQuestionView.a aVar = askQuestionView.f24749b;
        if (aVar != null) {
            if (askQuestionView.f24750d) {
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("UmkoaBJ0PXMGb0RfCmw_Y2s=", "YovjJ17S");
                aIEventCenter.getClass();
                AIEventCenter.i(p10, null);
                AskQuestionView.a aVar2 = askQuestionView.f24749b;
                if (aVar2 != null) {
                    aVar2.L0();
                    return;
                }
                return;
            }
            i2 i2Var = this.c;
            aVar.r(i2Var.c.getText().toString());
            i2Var.c.setText("");
        }
    }
}
