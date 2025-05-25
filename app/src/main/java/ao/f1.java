package ao;

import android.os.Bundle;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class f1 implements oo.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f5039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5040b;

    public f1(ReaderPreviewActivity readerPreviewActivity, Bundle bundle) {
        this.f5040b = readerPreviewActivity;
        this.f5039a = bundle;
    }

    @Override // oo.a
    public final void a() {
        ReaderPreviewActivity readerPreviewActivity = this.f5040b;
        ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
        if (readerPDFCore != null && readerPDFCore.authenticatePassword(readerPreviewActivity.f26267v.A())) {
            tn.a.b(readerPreviewActivity, ea.a.p("RWkudw==", "S4JoyWnS"), ea.a.p("RWkudyxwEXcWX1BvB2U=", "uj0FmrQy"));
            ea.a.p("R2U4dHQ=", "sV5m9LOw");
            ea.a.p("XGtxIJav5OfSgdKtyuf3rg==", "UXhv5df9");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            readerPreviewActivity.W = readerPreviewActivity.f26267v.A();
            pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar = readerPreviewActivity.f26267v;
            vVar.A = 2;
            readerPreviewActivity.B1(vVar);
            readerPreviewActivity.S2(this.f5039a);
            return;
        }
        readerPreviewActivity.f26267v.g();
    }

    @Override // oo.a
    public final void cancel() {
        this.f5040b.D.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 3), 150L);
    }
}
