package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class f1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27564b;
    public final /* synthetic */ PdfListMoreMenuDialog c;

    public f1(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity) {
        this.c = pdfListMoreMenuDialog;
        this.f27563a = aVar;
        this.f27564b = pdfPreviewEntity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pdf.pdfreader.viewer.editor.free.utils.q0.w(view.getContext(), "key_need_show_merge_tip", false);
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.c;
        PdfListMoreMenuDialog.a aVar = this.f27563a;
        if (aVar != null) {
            aVar.t(this.f27564b, pdfListMoreMenuDialog.f27445y);
        }
        pdfListMoreMenuDialog.cancel();
    }
}
