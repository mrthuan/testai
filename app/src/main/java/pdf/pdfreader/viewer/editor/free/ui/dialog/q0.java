package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class q0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27727b;
    public final /* synthetic */ PdfPreviewEntity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27728d;

    public q0(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity) {
        this.f27728d = pdfListMoreMenuDialog;
        this.f27727b = aVar;
        this.c = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        this.f27728d.cancel();
        PdfListMoreMenuDialog.a aVar = this.f27727b;
        if (aVar != null) {
            aVar.u(this.c);
        }
    }
}
