package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public final class l implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28054a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f28055b;
    public final /* synthetic */ n c;

    public l(n nVar, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        this.c = nVar;
        this.f28054a = pdfPreviewEntity;
        this.f28055b = z10;
    }

    @Override // cg.a
    public final tf.d invoke() {
        n nVar = this.c;
        Context r4 = nVar.r();
        String p10 = ea.a.p("KWldZSZtWHJl", "4WzcoVrA");
        String p11 = ea.a.p("PzJYbR5fXm09XylsHGNr", "A4tQGMl3");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(nVar.X0());
        sb2.append(ea.a.p("Xw==", "oHOEAs7L"));
        PdfPreviewEntity pdfPreviewEntity = this.f28054a;
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(r4, p10, p11, sb2.toString(), false);
        n.S0(nVar, pdfPreviewEntity, false, this.f28055b);
        return null;
    }
}
