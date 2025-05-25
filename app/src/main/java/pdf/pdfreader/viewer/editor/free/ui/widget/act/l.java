package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderEditSearchActivity.java */
/* loaded from: classes3.dex */
public final class l implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f28339b;
    public final /* synthetic */ ReaderEditSearchActivity c;

    public l(ReaderEditSearchActivity readerEditSearchActivity, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        this.c = readerEditSearchActivity;
        this.f28338a = pdfPreviewEntity;
        this.f28339b = z10;
    }

    @Override // cg.a
    public final tf.d invoke() {
        ReaderEditSearchActivity.a2(this.c, this.f28338a, false, this.f28339b);
        return null;
    }
}
