package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderEditSearchActivity.java */
/* loaded from: classes3.dex */
public final class d implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f28329b;
    public final /* synthetic */ ReaderEditSearchActivity c;

    public d(ReaderEditSearchActivity readerEditSearchActivity, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        this.c = readerEditSearchActivity;
        this.f28328a = pdfPreviewEntity;
        this.f28329b = z10;
    }

    @Override // cg.a
    public final tf.d invoke() {
        ReaderEditSearchActivity.a2(this.c, this.f28328a, true, this.f28329b);
        return null;
    }
}
