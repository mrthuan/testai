package ao;

import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPDF2WordStateView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class y0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5151a;

    public y0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5151a = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderPreviewActivity readerPreviewActivity = this.f5151a;
        PreviewPDF2WordStateView previewPDF2WordStateView = readerPreviewActivity.f26170d4;
        if (previewPDF2WordStateView != null) {
            previewPDF2WordStateView.d();
        }
        TextView textView = readerPreviewActivity.G5;
        if (textView != null) {
            textView.setText(R.string.arg_res_0x7f13058e);
        }
        readerPreviewActivity.t4(true);
    }
}
