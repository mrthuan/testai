package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public final class m implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f28057b;
    public final /* synthetic */ n c;

    public m(n nVar, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        this.c = nVar;
        this.f28056a = pdfPreviewEntity;
        this.f28057b = z10;
    }

    @Override // cg.a
    public final tf.d invoke() {
        n nVar = this.c;
        Context r4 = nVar.r();
        String p10 = ea.a.p("VWknZSxtDXJl", "TvSyKoUR");
        String p11 = ea.a.p("QzIibRRfDm8cZ2tjBWk1aw==", "ZMs0p1aB");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(nVar.X0());
        sb2.append(ea.a.p("Xw==", "GoCB8uYk"));
        PdfPreviewEntity pdfPreviewEntity = this.f28056a;
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(r4, p10, p11, sb2.toString(), false);
        n.S0(nVar, pdfPreviewEntity, true, this.f28057b);
        return null;
    }
}
