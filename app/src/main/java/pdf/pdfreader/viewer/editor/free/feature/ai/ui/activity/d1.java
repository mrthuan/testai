package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.os.Bundle;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class d1 implements oo.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f24573a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderAIPreviewActivity f24574b;

    public d1(ReaderAIPreviewActivity readerAIPreviewActivity, Bundle bundle) {
        this.f24574b = readerAIPreviewActivity;
        this.f24573a = bundle;
    }

    @Override // oo.a
    public final void a() {
        ReaderAIPreviewActivity readerAIPreviewActivity = this.f24574b;
        if (readerAIPreviewActivity.f24479c0.authenticatePassword(readerAIPreviewActivity.K.A())) {
            ea.a.p("N2U8dHQ=", "gWCOHjoP");
            ea.a.p("CWsLIJyvyOfogYCtl-f2rg==", "Hsf1yNx3");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            readerAIPreviewActivity.T = readerAIPreviewActivity.K.A();
            pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar = readerAIPreviewActivity.K;
            vVar.A = 2;
            readerAIPreviewActivity.B1(vVar);
            readerAIPreviewActivity.s2(this.f24573a);
            return;
        }
        readerAIPreviewActivity.K.g();
    }

    @Override // oo.a
    public final void cancel() {
        this.f24574b.M.postDelayed(new o0(this, 5), 150L);
    }
}
