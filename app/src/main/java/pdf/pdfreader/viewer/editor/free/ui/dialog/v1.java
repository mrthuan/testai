package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Intent;
import android.view.View;
import en.a;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class v1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f27781a;

    public v1(e2 e2Var) {
        this.f27781a = e2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e2 e2Var = this.f27781a;
        if (e2Var.f27543d0.getVisibility() == 0) {
            e2Var.f27543d0.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.w(e2Var.getContext(), "ocr_update_red_dot_in_175", false);
        }
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            ao.n1 n1Var = (ao.n1) aVar;
            if (pdfPreviewEntity != null) {
                String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                String p10 = ea.a.p("DGk8d2htG3Jl", "opzY7tqV");
                String p11 = ea.a.p("RWkudx5vEGUtb1dyNmM6aSdr", "Pyhn5LTH");
                ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
                pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, p10, p11, null);
                ReaderPdfApplication.k().f(null);
                OCRSelectPDFPageActivity.a aVar2 = OCRSelectPDFPageActivity.P;
                String pdfPath = pdfPreviewEntity.getPath();
                String pdfPwd = readerPreviewActivity.W;
                int i10 = readerPreviewActivity.B2;
                aVar2.getClass();
                kotlin.jvm.internal.g.e(pdfPath, "pdfPath");
                kotlin.jvm.internal.g.e(pdfPwd, "pdfPwd");
                ReaderPdfApplication.k().g(null);
                androidx.lifecycle.w<ArrayList<bn.a>> wVar = en.a.f16815a;
                a.C0215a.a();
                Intent intent = new Intent(readerPreviewActivity, OCRSelectPDFPageActivity.class);
                intent.putExtra(ea.a.p("P2RXXwlhQ2g=", "zxC3U2bW"), pdfPath);
                intent.putExtra(ea.a.p("Q2QtXwN3ZA==", "45nAgTaY"), pdfPwd);
                intent.putExtra(ea.a.p("WGUyXxxjEF8CZFJfGWExZRtjR3I0ZS10", "YY6xxawg"), i10);
                readerPreviewActivity.startActivity(intent);
            }
        }
        e2Var.cancel();
    }
}
