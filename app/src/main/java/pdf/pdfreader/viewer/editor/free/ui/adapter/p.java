package pdf.pdfreader.viewer.editor.free.ui.adapter;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.s;

/* compiled from: SearchAdapter.java */
/* loaded from: classes3.dex */
public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.b f27285b;

    public p(PdfPreviewEntity pdfPreviewEntity, s.b bVar) {
        this.f27284a = pdfPreviewEntity;
        this.f27285b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27284a.setHighlightOnce(false);
        this.f27285b.f27303i.setVisibility(8);
    }
}
