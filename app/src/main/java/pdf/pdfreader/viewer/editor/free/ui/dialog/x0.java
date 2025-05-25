package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class x0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27792b;
    public final /* synthetic */ PdfPreviewEntity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f27793d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f27794e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27795f;

    public x0(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity, LinearLayout linearLayout, Context context) {
        this.f27795f = pdfListMoreMenuDialog;
        this.f27792b = aVar;
        this.c = pdfPreviewEntity;
        this.f27793d = linearLayout;
        this.f27794e = context;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.f27795f;
        PdfListMoreMenuDialog.a aVar = this.f27792b;
        if (aVar != null) {
            aVar.q(this.c, pdfListMoreMenuDialog.f27445y);
        }
        LinearLayout linearLayout = this.f27793d;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.w(this.f27794e, "pdf2img_red_dot_show_in_167", false);
        }
        pdfListMoreMenuDialog.cancel();
    }
}
