package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class g1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27576a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27577b;
    public final /* synthetic */ PdfListMoreMenuDialog c;

    public g1(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity) {
        this.c = pdfListMoreMenuDialog;
        this.f27576a = aVar;
        this.f27577b = pdfPreviewEntity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pdf.pdfreader.viewer.editor.free.utils.q0.w(view.getContext(), "key_need_show_split_tip", false);
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.c;
        PdfListMoreMenuDialog.a aVar = this.f27576a;
        if (aVar != null) {
            aVar.j(this.f27577b, pdfListMoreMenuDialog.f27445y, pdfListMoreMenuDialog.f27446z);
        }
        pdfListMoreMenuDialog.cancel();
    }
}
