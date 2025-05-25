package pdf.pdfreader.viewer.editor.free.ui.act;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.act.ClearDefaultReaderStep2Activity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26894a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f26895b;

    public /* synthetic */ c(androidx.appcompat.app.c cVar, int i10) {
        this.f26894a = i10;
        this.f26895b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f26894a;
        androidx.appcompat.app.c cVar = this.f26895b;
        switch (i10) {
            case 0:
                ClearDefaultReaderStep2Activity clearDefaultReaderStep2Activity = (ClearDefaultReaderStep2Activity) cVar;
                ClearDefaultReaderStep2Activity.a aVar = ClearDefaultReaderStep2Activity.C;
                kotlin.jvm.internal.g.e(clearDefaultReaderStep2Activity, ea.a.p("PGgQcxUw", "v1Hy1DEb"));
                tn.a.d(view.getContext(), ea.a.p("VHUiZGU=", "FWLpabNy"), ea.a.p("UHUxZAhzOnMXbw1fV2w-Y2s=", "me7XmCM8"), ea.a.p("UGwuYXI=", "a7rUoY3q"), false);
                clearDefaultReaderStep2Activity.finish();
                return;
            case 1:
                PreInstallOpenAdActivity preInstallOpenAdActivity = (PreInstallOpenAdActivity) cVar;
                int i11 = PreInstallOpenAdActivity.f26628u;
                kotlin.jvm.internal.g.e(preInstallOpenAdActivity, ea.a.p("R2gic1cw", "0VksARsB"));
                preInstallOpenAdActivity.finish();
                return;
            case 2:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) cVar;
                RecentAddedActivity.a aVar2 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("O2hYc10w", "dNeceh8N"));
                recentAddedActivity.q2().c1();
                return;
            default:
                TermsUseActivity termsUseActivity = (TermsUseActivity) cVar;
                int i12 = TermsUseActivity.f26884b;
                kotlin.jvm.internal.g.e(termsUseActivity, ea.a.p("R2gic1cw", "raY2PIHg"));
                termsUseActivity.finish();
                return;
        }
    }
}
