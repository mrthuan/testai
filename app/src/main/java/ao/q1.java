package ao;

import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class q1 implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f5125a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5126b;

    public q1(ReaderPreviewActivity readerPreviewActivity, String str) {
        this.f5126b = readerPreviewActivity;
        this.f5125a = str;
    }

    @Override // cg.a
    public final tf.d invoke() {
        String p10 = ea.a.p("OWlUdyZtWHJl", "cGER86kG");
        String p11 = ea.a.p("OWlUdxRvRWUFcHhpGGc3bFpuZw==", "EthZGTvT");
        ReaderPreviewActivity readerPreviewActivity = this.f5126b;
        tn.a.b(readerPreviewActivity, p10, p11);
        int i10 = Pdf2ImagePicPreviewActivity.I0;
        Pdf2ImagePicPreviewActivity.a.a(readerPreviewActivity, this.f5125a, ea.a.p("DlI4TS1QFUUeSSNX", "gBHwrGgj"), readerPreviewActivity.W, true);
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerPreviewActivity);
        return null;
    }
}
