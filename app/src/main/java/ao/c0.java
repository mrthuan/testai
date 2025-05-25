package ao;

import android.view.View;
import android.widget.FrameLayout;
import lib.zj.pdfeditor.PDFReaderView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.GraffitiBottomSheetView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class c0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5022a;

    public c0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5022a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ReaderPreviewActivity readerPreviewActivity = this.f5022a;
        if (readerPreviewActivity.f26282x0 == null) {
            return;
        }
        tn.a.b(readerPreviewActivity, ea.a.p("Um4lbwdhFmU=", "80shc2uP"), ea.a.p("Um4lbyxnEGEUZl10AF8lZTBfUWwvY2s=", "9e8ri8v0"));
        FrameLayout frameLayout = readerPreviewActivity.B0;
        if (frameLayout != null && frameLayout.isSelected()) {
            ReaderPreviewActivity.r2(readerPreviewActivity, false);
            readerPreviewActivity.t2(PDFReaderView.Mode.Drawing);
        }
        if (readerPreviewActivity.f26282x0.H()) {
            readerPreviewActivity.f26282x0.C();
            return;
        }
        readerPreviewActivity.f26293y5 = true;
        GraffitiBottomSheetView graffitiBottomSheetView = readerPreviewActivity.f26282x0;
        zl.b.c.getClass();
        graffitiBottomSheetView.setSelectColor(zl.b.h());
        readerPreviewActivity.f26282x0.setSize(zl.b.i());
        readerPreviewActivity.f26282x0.I();
    }
}
