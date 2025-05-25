package ao;

import android.view.View;
import lib.zj.pdfeditor.PDFReaderView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class g0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5044a;

    public g0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5044a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String p10 = ea.a.p("Um4lbwdhFmU=", "MPYJj5iY");
        String p11 = ea.a.p("Lm5fbyZlRWEpZThfFmwBY2s=", "GJRIidgG");
        ReaderPreviewActivity readerPreviewActivity = this.f5044a;
        tn.a.b(readerPreviewActivity, p10, p11);
        if (readerPreviewActivity.B0.isSelected()) {
            ReaderPreviewActivity.r2(readerPreviewActivity, false);
            readerPreviewActivity.t2(PDFReaderView.Mode.Drawing);
            return;
        }
        ReaderPreviewActivity.r2(readerPreviewActivity, true);
        readerPreviewActivity.t2(PDFReaderView.Mode.ERASE);
    }
}
