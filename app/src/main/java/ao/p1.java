package ao;

import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class p1 implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f5120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5121b;

    public p1(ReaderPreviewActivity readerPreviewActivity, String str) {
        this.f5121b = readerPreviewActivity;
        this.f5120a = str;
    }

    @Override // cg.a
    public final tf.d invoke() {
        String p10 = ea.a.p("OWlUdyZtWHJl", "mFtVg3bE");
        String p11 = ea.a.p("OWlUdxRvRWUFcHhpGGc3aVhn", "84i8UJGE");
        ReaderPreviewActivity readerPreviewActivity = this.f5121b;
        tn.a.b(readerPreviewActivity, p10, p11);
        int i10 = Pdf2ImagePicPreviewActivity.I0;
        Pdf2ImagePicPreviewActivity.a.a(readerPreviewActivity, this.f5120a, ea.a.p("dVIETSxQMEUkSXFX", "JEB1NraZ"), readerPreviewActivity.W, false);
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerPreviewActivity);
        return null;
    }
}
