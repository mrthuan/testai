package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class b2 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27505b;

    public b2(e2 e2Var) {
        this.f27505b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27505b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            ao.n1 n1Var = (ao.n1) aVar;
            if (pdfPreviewEntity != null) {
                String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                String p10 = ea.a.p("Lmkndw1tKHJl", "GbXBRGHo");
                String p11 = ea.a.p("RWkudx5vEGUtc1xhG2UJYyhpUWs=", "3axS7oxJ");
                String d10 = pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity);
                ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
                pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, p10, p11, d10);
                pdf.pdfreader.viewer.editor.free.utils.e1.e(readerPreviewActivity, pdfPreviewEntity);
            }
        }
        e2Var.cancel();
    }
}
