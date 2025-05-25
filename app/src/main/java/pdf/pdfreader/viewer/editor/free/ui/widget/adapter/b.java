package pdf.pdfreader.viewer.editor.free.ui.widget.adapter;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e;

/* compiled from: EditSearchAdapter.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28352a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.b f28353b;

    public b(PdfPreviewEntity pdfPreviewEntity, e.b bVar) {
        this.f28352a = pdfPreviewEntity;
        this.f28353b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28352a.setHighlightOnce(false);
        this.f28353b.f28368i.setVisibility(8);
    }
}
