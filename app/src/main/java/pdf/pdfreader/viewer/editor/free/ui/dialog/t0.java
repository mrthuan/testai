package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class t0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27756b;
    public final /* synthetic */ PdfPreviewEntity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f27757d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f27758e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27759f;

    public t0(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity, LinearLayout linearLayout, Context context) {
        this.f27759f = pdfListMoreMenuDialog;
        this.f27756b = aVar;
        this.c = pdfPreviewEntity;
        this.f27757d = linearLayout;
        this.f27758e = context;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.f27759f;
        PdfListMoreMenuDialog.a aVar = this.f27756b;
        if (aVar != null) {
            boolean z10 = pdfListMoreMenuDialog.f27445y;
            aVar.x(this.c);
        }
        LinearLayout linearLayout = this.f27757d;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.w(this.f27758e, "add_to_desktop_red_dot_show_in_167", false);
        }
        pdfListMoreMenuDialog.cancel();
    }
}
