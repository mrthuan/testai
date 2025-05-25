package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderSearchActivity.java */
/* loaded from: classes3.dex */
public final class x0 implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f27085b;
    public final /* synthetic */ ReaderSearchActivity c;

    public x0(ReaderSearchActivity readerSearchActivity, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        this.c = readerSearchActivity;
        this.f27084a = pdfPreviewEntity;
        this.f27085b = z10;
    }

    @Override // cg.a
    public final tf.d invoke() {
        String p10 = ea.a.p("AWkjZRdtK3Jl", "BpgOHDgW");
        String p11 = ea.a.p("QzIibRRfC20VX1dsAGNr", "6FCOGSLn");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.c;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "O5AQLKt2"));
        PdfPreviewEntity pdfPreviewEntity = this.f27084a;
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
        ReaderSearchActivity.a2(readerSearchActivity, pdfPreviewEntity, false, this.f27085b);
        return null;
    }
}
