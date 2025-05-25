package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderSearchActivity.java */
/* loaded from: classes3.dex */
public final class y0 implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f27089b;
    public final /* synthetic */ ReaderSearchActivity c;

    public y0(ReaderSearchActivity readerSearchActivity, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        this.c = readerSearchActivity;
        this.f27088a = pdfPreviewEntity;
        this.f27089b = z10;
    }

    @Override // cg.a
    public final tf.d invoke() {
        String p10 = ea.a.p("HGkAZRZtHXJl", "BwzlIrHu");
        String p11 = ea.a.p("PzJYbR5fW280ZxVjGWkLaw==", "lOoYvJKB");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.c;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "QTQBt5Q6"));
        PdfPreviewEntity pdfPreviewEntity = this.f27088a;
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
        ReaderSearchActivity.a2(readerSearchActivity, pdfPreviewEntity, true, this.f27089b);
        return null;
    }
}
