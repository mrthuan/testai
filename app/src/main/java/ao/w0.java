package ao;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class w0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5144b;

    public w0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5144b = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        String p10 = ea.a.p("EWkvdw==", "CZgJUF7v");
        String p11 = ea.a.p("RWkudyxjDW4EZUZiCG44ZTZfRGkjdw==", "0e0QyyH7");
        String str = ConvertEventCenter.f28654b;
        ReaderPreviewActivity readerPreviewActivity = this.f5144b;
        tn.a.d(readerPreviewActivity, p10, p11, str, false);
        PdfPreviewEntity pdfPreviewEntity = readerPreviewActivity.J5;
        if (pdfPreviewEntity != null) {
            pdfPreviewEntity.setRecent(1);
            readerPreviewActivity.J5.setRecentDate(System.currentTimeMillis());
            FileRepository.I(readerPreviewActivity.J5);
            bm.c.b(readerPreviewActivity).i(readerPreviewActivity.J5);
            pdf.pdfreader.viewer.editor.free.utils.k0.c(readerPreviewActivity, readerPreviewActivity.J5.getPath(), readerPreviewActivity.J5, "", ea.a.p("dVIETSxXLVI2MmRERg==", "W8gv04KG"));
        }
        readerPreviewActivity.t4(false);
    }
}
