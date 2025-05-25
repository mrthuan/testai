package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class z0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27821b;
    public final /* synthetic */ PdfPreviewEntity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27822d;

    public z0(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity) {
        this.f27822d = pdfListMoreMenuDialog;
        this.f27821b = aVar;
        this.c = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        PdfListMoreMenuDialog.a aVar = this.f27821b;
        if (aVar != null) {
            aVar.p(this.c);
        }
        this.f27822d.cancel();
    }
}
