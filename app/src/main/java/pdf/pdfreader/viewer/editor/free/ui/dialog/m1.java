package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class m1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27662b;

    public m1(e2 e2Var) {
        this.f27662b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27662b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            ReaderPreviewActivity readerPreviewActivity = ((ao.n1) aVar).f5112a;
            ReaderPreviewActivity.p2(readerPreviewActivity, true);
            PdfPreviewEntity pdfPreviewEntity = readerPreviewActivity.f26245r1;
            String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
            pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("RWkudyxtDXJl", "WyggMmNa"), ea.a.p("OWlUdxRvRWUFcCtnEF8LbFxjaw==", "Q8sBnWzA"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
        }
        e2Var.cancel();
    }
}
