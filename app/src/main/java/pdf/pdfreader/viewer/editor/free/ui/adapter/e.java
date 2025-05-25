package pdf.pdfreader.viewer.editor.free.ui.adapter;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.d;

/* compiled from: FilesAdapter.java */
/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27244a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.c f27245b;

    public e(PdfPreviewEntity pdfPreviewEntity, d.c cVar) {
        this.f27244a = pdfPreviewEntity;
        this.f27245b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27244a.setHighlightOnce(false);
        this.f27245b.f27236n.setVisibility(8);
    }
}
