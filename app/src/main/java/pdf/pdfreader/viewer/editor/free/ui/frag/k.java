package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public final class k implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f28053b;

    public k(j jVar, PdfPreviewEntity pdfPreviewEntity) {
        this.f28053b = jVar;
        this.f28052a = pdfPreviewEntity;
    }

    @Override // cg.a
    public final tf.d invoke() {
        j jVar = this.f28053b;
        Context r4 = jVar.f28044b.r();
        String p10 = ea.a.p("M2kuZTdtWXJl", "ukUBh69K");
        String p11 = ea.a.p("KWldZRRvRWUFYS5kR2gHbVBfCm8rZQ==", "KCwyyY3u");
        tn.a.d(r4, p10, p11, jVar.f28044b.X0() + ea.a.p("Xw==", "CyUl31K7") + aj.b.t(this.f28052a.getOtherStrOne()), false);
        return null;
    }
}
