package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import lm.e;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class r1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27734b;

    public r1(e2 e2Var) {
        this.f27734b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27734b;
        Context context = e2Var.getContext();
        PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
        String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
        pdf.pdfreader.viewer.editor.free.utils.p.b(context, ea.a.p("OWlUdyZtWHJl", "dEBNFAvr"), ea.a.p("RWkudx5vEGUtYV1fCmw_Y2s=", "X5nYmBX9"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
        AIEventCenter.f28648a.getClass();
        AIEventCenter.b();
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            ao.n1 n1Var = (ao.n1) aVar;
            ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
            if (ReaderPreviewActivity.f2(readerPreviewActivity)) {
                ReaderPreviewActivity readerPreviewActivity2 = n1Var.f5112a;
                e.a.b(readerPreviewActivity2, readerPreviewActivity2.f26245r1.getPath(), 701, 601, ea.a.p("RWkudx5vEGU=", "a5hoH2sn"), ea.a.p("T2kpdz1vRmU=", "qd9LP4nT"), false);
            }
            if (pdf.pdfreader.viewer.editor.free.utils.q0.C(readerPreviewActivity)) {
                pdf.pdfreader.viewer.editor.free.utils.q0.v(readerPreviewActivity);
            }
        }
        if (e2Var.V.getVisibility() == 0) {
            e2Var.V.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.v(e2Var.getContext());
        }
        e2Var.cancel();
    }
}
