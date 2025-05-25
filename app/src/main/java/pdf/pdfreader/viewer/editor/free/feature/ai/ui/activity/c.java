package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AIChatActivity f24568b;

    public /* synthetic */ c(AIChatActivity aIChatActivity, int i10) {
        this.f24567a = i10;
        this.f24568b = aIChatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f24567a;
        AIChatActivity aIChatActivity = this.f24568b;
        switch (i10) {
            case 0:
                AIChatActivity.a aVar = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("TWg5cxcw", "Gd9P3Itz"));
                aIChatActivity.y2();
                return;
            default:
                AIChatActivity.a aVar2 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("M2gPc0gw", "HuGflsNI"));
                aIChatActivity.x2();
                return;
        }
    }
}
