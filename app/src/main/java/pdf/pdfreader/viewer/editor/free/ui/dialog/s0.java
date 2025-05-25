package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class s0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f27746b;
    public final /* synthetic */ PdfListMoreMenuDialog.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27747d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27748e;

    public s0(PdfListMoreMenuDialog pdfListMoreMenuDialog, View view, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity) {
        this.f27748e = pdfListMoreMenuDialog;
        this.f27746b = view;
        this.c = aVar;
        this.f27747d = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.f27748e;
        View view2 = this.f27746b;
        if (view2 != null && view2.getVisibility() == 0) {
            view2.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.w(pdfListMoreMenuDialog.getContext(), "docx2pdf_red_dot_show_in_159", false);
        }
        PdfListMoreMenuDialog.a aVar = this.c;
        if (aVar != null) {
            aVar.k(this.f27747d);
        }
        pdfListMoreMenuDialog.cancel();
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("ODJBXxxuQ2UoXylsHGNr", "mXepFvMN"));
        AppCoreFilterEvent.f();
    }
}
