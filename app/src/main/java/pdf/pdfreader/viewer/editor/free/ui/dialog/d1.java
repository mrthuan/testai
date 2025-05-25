package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import android.widget.ImageView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class d1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27528b;
    public final /* synthetic */ ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27529d;

    public d1(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity, ImageView imageView) {
        this.f27529d = pdfListMoreMenuDialog;
        this.f27527a = aVar;
        this.f27528b = pdfPreviewEntity;
        this.c = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.f27529d;
        PdfListMoreMenuDialog.a aVar = this.f27527a;
        if (aVar != null) {
            aVar.a(this.f27528b, pdfListMoreMenuDialog.B);
        }
        boolean z10 = !pdfListMoreMenuDialog.B;
        pdfListMoreMenuDialog.B = z10;
        ImageView imageView = this.c;
        if (z10) {
            imageView.setImageResource(R.drawable.ic_more_bookmark_selected);
        } else {
            imageView.setImageResource(R.drawable.ic_more_bookmark);
        }
    }
}
