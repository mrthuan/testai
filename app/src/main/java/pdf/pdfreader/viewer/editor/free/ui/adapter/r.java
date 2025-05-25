package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.v0;
import pdf.pdfreader.viewer.editor.free.ui.adapter.s;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: SearchAdapter.java */
/* loaded from: classes3.dex */
public final class r extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27287b;
    public final /* synthetic */ s c;

    public r(s sVar, PdfPreviewEntity pdfPreviewEntity) {
        this.c = sVar;
        this.f27287b = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        s.a aVar = this.c.f27289e;
        if (aVar != null) {
            ReaderSearchActivity readerSearchActivity = (ReaderSearchActivity) aVar;
            v0 v0Var = new v0(readerSearchActivity);
            PdfPreviewEntity pdfPreviewEntity = this.f27287b;
            PdfListMoreMenuDialog pdfListMoreMenuDialog = new PdfListMoreMenuDialog(readerSearchActivity, pdfPreviewEntity, v0Var, 9);
            readerSearchActivity.N = pdfListMoreMenuDialog;
            if (!pdfListMoreMenuDialog.isShowing()) {
                ge.a.k(readerSearchActivity, readerSearchActivity.f26804w);
                readerSearchActivity.y1(readerSearchActivity);
                readerSearchActivity.N.show();
                String p10 = ea.a.p("KWldZSZtWHJl", "oQDdkYFd");
                String p11 = ea.a.p("KWldZRRvRWUFcyJvdw==", "rAPDDKPT");
                tn.a.d(readerSearchActivity, p10, p11, readerSearchActivity.d2() + ea.a.p("Xw==", "L7vVogQn") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
            }
        }
    }
}
