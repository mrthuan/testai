package pdf.pdfreader.viewer.editor.free.ui.widget.adapter;

import android.view.View;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.adapter.e;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: EditSearchAdapter.java */
/* loaded from: classes3.dex */
public final class c extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28354b;
    public final /* synthetic */ e c;

    public c(e eVar, PdfPreviewEntity pdfPreviewEntity) {
        this.c = eVar;
        this.f28354b = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        int i10;
        TextView textView;
        boolean z10;
        e eVar = this.c;
        PdfPreviewEntity pdfPreviewEntity = eVar.f28361i;
        PdfPreviewEntity pdfPreviewEntity2 = this.f28354b;
        if (pdfPreviewEntity == pdfPreviewEntity2) {
            eVar.f28361i = null;
            eVar.notifyItemChanged(eVar.f28358f.indexOf(pdfPreviewEntity2));
        } else {
            int indexOf = eVar.f28358f.indexOf(pdfPreviewEntity2);
            PdfPreviewEntity pdfPreviewEntity3 = eVar.f28361i;
            if (pdfPreviewEntity3 != null) {
                i10 = eVar.f28358f.indexOf(pdfPreviewEntity3);
            } else {
                i10 = -1;
            }
            eVar.f28361i = pdfPreviewEntity2;
            if (i10 != -1) {
                eVar.notifyItemChanged(i10);
            }
            eVar.notifyItemChanged(indexOf);
        }
        e.a aVar = eVar.f28357e;
        if (aVar != null) {
            ReaderEditSearchActivity readerEditSearchActivity = (ReaderEditSearchActivity) aVar;
            e eVar2 = readerEditSearchActivity.B;
            if (eVar2 != null && (textView = readerEditSearchActivity.C) != null) {
                if (eVar2.f28361i != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView.setEnabled(z10);
            }
            TextView textView2 = readerEditSearchActivity.C;
            if (textView2 != null) {
                textView2.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(readerEditSearchActivity, 8));
            }
        }
    }
}
