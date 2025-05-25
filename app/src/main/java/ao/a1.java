package ao;

import android.widget.FrameLayout;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.Pdf2WordProgress;
import pdf.pdfreader.viewer.editor.free.utils.event.PDF2WordEventCenter;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class a1 implements PDF2WordHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5012a;

    public a1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5012a = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void a(int i10) {
        PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
        pDF2WordEventCenter.getClass();
        PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtmU2ls", "0bX9qanN"), ea.a.p("AHIwdi1lAF8yaRZf", "ZvpUDwPH") + i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void b(int i10) {
        ReaderPreviewActivity.j2(this.f5012a, false, false, i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void c(PdfPreviewEntity pdfPreviewEntity) {
        ReaderPreviewActivity readerPreviewActivity = this.f5012a;
        readerPreviewActivity.J5 = pdfPreviewEntity;
        ReaderPreviewActivity.j2(readerPreviewActivity, true, false, -1);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void d(int i10) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        Pdf2WordProgress pdf2WordProgress = this.f5012a.f26226n4;
        if (pdf2WordProgress != null) {
            pdf2WordProgress.setCurrentProgress(i10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void e() {
        long currentTimeMillis = System.currentTimeMillis();
        ReaderPreviewActivity readerPreviewActivity = this.f5012a;
        readerPreviewActivity.R5 = currentTimeMillis;
        Pdf2WordProgress pdf2WordProgress = readerPreviewActivity.f26226n4;
        if (pdf2WordProgress != null) {
            pdf2WordProgress.setCurrentProgress(0);
        }
        FrameLayout frameLayout = readerPreviewActivity.f26220m4;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
