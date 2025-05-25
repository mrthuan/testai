package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderSearchActivity.java */
/* loaded from: classes3.dex */
public final class w0 implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27081a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0 f27082b;

    public w0(v0 v0Var, PdfPreviewEntity pdfPreviewEntity) {
        this.f27082b = v0Var;
        this.f27081a = pdfPreviewEntity;
    }

    @Override // cg.a
    public final tf.d invoke() {
        v0 v0Var = this.f27082b;
        ReaderSearchActivity readerSearchActivity = v0Var.f27077a;
        String p10 = ea.a.p("VWknZSxtDXJl", "1HKbA25h");
        String p11 = ea.a.p("KWldZRRvRWUFYS5kR2gHbVBfCm8rZQ==", "8LQURgmh");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        sb2.append(v0Var.f27077a.d2());
        sb2.append(ea.a.p("Xw==", "bVlBY6ON"));
        sb2.append(aj.b.t(this.f27081a.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
        return null;
    }
}
