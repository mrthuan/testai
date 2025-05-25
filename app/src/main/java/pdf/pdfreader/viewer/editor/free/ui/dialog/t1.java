package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class t1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f27760a;

    public t1(e2 e2Var) {
        this.f27760a = e2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e2 e2Var = this.f27760a;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            boolean z10 = e2Var.f27541b0;
            ao.n1 n1Var = (ao.n1) aVar;
            if (pdfPreviewEntity != null) {
                ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
                pdf.pdfreader.viewer.editor.free.utils.p.c(readerPreviewActivity, readerPreviewActivity.f26245r1, z10);
                pdfPreviewEntity.setFavorite(!z10 ? 1 : 0);
                pdfPreviewEntity.setFavoriteDate(System.currentTimeMillis());
                bm.c.b(readerPreviewActivity).i(pdfPreviewEntity);
                qo.m mVar = new qo.m();
                mVar.f29407d = true;
                mVar.f29410g = pdfPreviewEntity;
                FileRepository.I(pdfPreviewEntity);
                wk.b.b().e(mVar);
                wk.b.b().e(new qo.h());
                pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("HnQgbRJhJm86aRJlOg==", "qqwETPsv") + pdfPreviewEntity.getFavorite());
                if (pdfPreviewEntity.getFavorite() == 1) {
                    pdf.pdfreader.viewer.editor.free.utils.j1.e(readerPreviewActivity, readerPreviewActivity.getString(R.string.arg_res_0x7f130366, readerPreviewActivity.getString(R.string.arg_res_0x7f13036f)), false, androidx.core.content.a.getDrawable(readerPreviewActivity, R.drawable.ic_home_bookmark), readerPreviewActivity.k3());
                } else {
                    pdf.pdfreader.viewer.editor.free.utils.j1.e(readerPreviewActivity, readerPreviewActivity.getString(R.string.arg_res_0x7f1303df, readerPreviewActivity.getString(R.string.arg_res_0x7f13036f)), true, null, readerPreviewActivity.k3());
                }
            }
        }
        boolean z11 = !e2Var.f27541b0;
        e2Var.f27541b0 = z11;
        if (z11) {
            e2Var.H.setImageResource(R.drawable.ic_more_bookmark_selected);
        } else {
            e2Var.H.setImageResource(R.drawable.ic_more_bookmark);
        }
    }
}
