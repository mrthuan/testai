package pdf.pdfreader.viewer.editor.free.ui.widget.adapter;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.j;
import pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: EditSearchAdapter.java */
/* loaded from: classes3.dex */
public final class d extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28355b;
    public final /* synthetic */ e c;

    public d(e eVar, PdfPreviewEntity pdfPreviewEntity) {
        this.c = eVar;
        this.f28355b = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e.a aVar = this.c.f28357e;
        if (aVar != null) {
            ReaderEditSearchActivity readerEditSearchActivity = (ReaderEditSearchActivity) aVar;
            PdfListMoreMenuDialog pdfListMoreMenuDialog = new PdfListMoreMenuDialog(readerEditSearchActivity, this.f28355b, new j(readerEditSearchActivity), 9);
            readerEditSearchActivity.O = pdfListMoreMenuDialog;
            if (!pdfListMoreMenuDialog.isShowing()) {
                ge.a.k(readerEditSearchActivity, readerEditSearchActivity.f28308w);
                readerEditSearchActivity.y1(readerEditSearchActivity);
                readerEditSearchActivity.O.show();
            }
        }
    }
}
