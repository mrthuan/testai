package ao;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class o1 implements xn.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5116a;

    public o1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5116a = readerPreviewActivity;
    }

    @Override // xn.a
    public final void e() {
        ReaderPreviewActivity readerPreviewActivity = this.f5116a;
        PdfPreviewEntity pdfPreviewEntity = readerPreviewActivity.f26245r1;
        if (pdfPreviewEntity == null) {
            return;
        }
        String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
        pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("RWkudyxtDXJl", "lgw5gDAp"), ea.a.p("RWkudx5vEGUtZFF0CGk6XydsW2Nr", "UoNM0CCU"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
        if (readerPreviewActivity.S == null) {
            readerPreviewActivity.S = new pdf.pdfreader.viewer.editor.free.ui.dialog.g0(readerPreviewActivity, readerPreviewActivity.f26245r1);
        }
        readerPreviewActivity.y1(readerPreviewActivity);
        readerPreviewActivity.W1(readerPreviewActivity.S);
    }
}
