package ao;

import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeColorBottomSheetView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class u0 implements AddTextChangeColorBottomSheetView.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5137a;

    public u0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5137a = readerPreviewActivity;
    }

    public final void a(int i10, boolean z10) {
        ReaderPDFCore readerPDFCore;
        if (z10) {
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQvXwdlGnQ=", "2LsB0RsW"), ea.a.p("GGVAdChhPGoXYwlsW3IIYVxqJ3N0", "I9l8wXsN"));
        }
        ReaderPreviewActivity readerPreviewActivity = this.f5137a;
        if (readerPreviewActivity.f26234p0 != i10) {
            readerPreviewActivity.f26234p0 = i10;
            pdf.pdfreader.viewer.editor.free.utils.q0.x(readerPreviewActivity, i10, "add_text_color_in_158");
        }
        if (z10 && (readerPDFCore = readerPreviewActivity.f26256t1) != null && readerPDFCore.getCurEditPDFPageView() != null) {
            readerPreviewActivity.f26256t1.getCurEditPDFPageView().setFreeTextColor(i10);
        }
        readerPreviewActivity.P3(i10);
    }
}
