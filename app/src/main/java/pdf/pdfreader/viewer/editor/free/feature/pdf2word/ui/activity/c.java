package pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity;

import androidx.fragment.app.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.utils.event.PDF2WordEventCenter;

/* compiled from: ReaderConvertPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class c implements PDF2WordHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderConvertPreviewActivity f25598a;

    public c(ReaderConvertPreviewActivity readerConvertPreviewActivity) {
        this.f25598a = readerConvertPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void a(int i10) {
        PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
        pDF2WordEventCenter.getClass();
        PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtmU2ls", "4Lt6uSx9"), "preview_zip_" + i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void b(int i10) {
        ReaderConvertPreviewActivity readerConvertPreviewActivity = this.f25598a;
        ReaderConvertPreviewActivity.P2(readerConvertPreviewActivity);
        readerConvertPreviewActivity.M.post(new a(readerConvertPreviewActivity, 1));
        PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
        pDF2WordEventCenter.getClass();
        PDF2WordEventCenter.a(ea.a.p("P2RXMg5vRWQFYyVuA2UadGpmD2ls", "2TEwfGiA"), "preview_" + i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void c(PdfPreviewEntity pdfPreviewEntity) {
        ReaderConvertPreviewActivity readerConvertPreviewActivity = this.f25598a;
        ReaderRoundProgressBar readerRoundProgressBar = readerConvertPreviewActivity.G1;
        if (readerRoundProgressBar != null) {
            readerRoundProgressBar.setProgress(100);
        }
        readerConvertPreviewActivity.M.postDelayed(new g(20, readerConvertPreviewActivity, pdfPreviewEntity), 100L);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void d(int i10) {
        ReaderRoundProgressBar readerRoundProgressBar = this.f25598a.G1;
        if (readerRoundProgressBar != null) {
            readerRoundProgressBar.setProgress(i10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.b
    public final void e() {
    }
}
