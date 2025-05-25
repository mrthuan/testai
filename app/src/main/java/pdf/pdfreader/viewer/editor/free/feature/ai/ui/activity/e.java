package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.MotionEvent;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24575a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24576b;

    public /* synthetic */ e(jl.a aVar, int i10) {
        this.f24575a = i10;
        this.f24576b = aVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f24575a;
        jl.a aVar = this.f24576b;
        switch (i10) {
            case 0:
                AIChatActivity aIChatActivity = (AIChatActivity) aVar;
                AIChatActivity.a aVar2 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("O2hYc10w", "nbUhPfmb"));
                if (motionEvent.getAction() == 0) {
                    aIChatActivity.X.removeCallbacks(aIChatActivity.f24367g0);
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("UmkoaBJ0PXQXeEBfCmw_Y2s=", "CJpzYI0E");
                    aIEventCenter.getClass();
                    AIEventCenter.i(p10, null);
                }
                return false;
            default:
                AIExperienceActivity aIExperienceActivity = (AIExperienceActivity) aVar;
                AIExperienceActivity.a aVar3 = AIExperienceActivity.L;
                kotlin.jvm.internal.g.e(aIExperienceActivity, ea.a.p("R2gic1cw", "8H9LI5Jx"));
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        aIExperienceActivity.B = false;
                    }
                } else {
                    aIExperienceActivity.B = true;
                }
                return false;
        }
    }
}
