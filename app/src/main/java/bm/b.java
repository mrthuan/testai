package bm;

import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: DbManager.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f5476a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f5477b;

    public b(c cVar, PdfPreviewEntity pdfPreviewEntity) {
        this.f5477b = cVar;
        this.f5476a = pdfPreviewEntity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f5477b;
        cVar.f5479a.getClass();
        PdfPreviewEntity pdfPreviewEntity = this.f5476a;
        z3.c.f(pdfPreviewEntity);
        ((e) cVar.f5480b.k()).b(pdfPreviewEntity);
    }
}
