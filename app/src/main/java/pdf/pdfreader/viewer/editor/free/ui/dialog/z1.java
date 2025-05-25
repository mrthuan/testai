package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class z1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27823b;

    public z1(e2 e2Var) {
        this.f27823b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        pdf.pdfreader.viewer.editor.free.utils.q0.w(view.getContext(), "key_need_show_split_tip", false);
        e2 e2Var = this.f27823b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            boolean z10 = e2Var.Z;
            ao.n1 n1Var = (ao.n1) aVar;
            if (pdfPreviewEntity != null) {
                String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                String p10 = ea.a.p("HWkPdx1tIXJl", "DHkjBNXN");
                String p11 = ea.a.p("OWlUdxRvRWUFczpsHHQ3Y1lpDWs=", "mw1ywNIJ");
                String d10 = pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity);
                ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
                pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, p10, p11, d10);
                ReaderPdfApplication.k().g(null);
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new DecryptContainer(pdfPreviewEntity, readerPreviewActivity.W, ""));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(aj.b.l(pdfPreviewEntity));
                    new pdf.pdfreader.viewer.editor.free.decrypt.d(readerPreviewActivity, arrayList2, new ao.m1(n1Var, pdfPreviewEntity)).a(arrayList);
                } else {
                    tn.a.d(readerPreviewActivity, ea.a.p("PHBdaXQ=", "dDNKybmD"), ea.a.p("GWglbxplUG0vXxVoW3c=", "mCzJi99n"), ea.a.p("RWkudw==", "yC1LaV9e"), false);
                    ReaderSplitPdfActivity.a aVar2 = ReaderSplitPdfActivity.f26822q0;
                    String p12 = ea.a.p("RWkudw==", "0XD52hXc");
                    int i10 = readerPreviewActivity.f26251s2;
                    aVar2.getClass();
                    ReaderSplitPdfActivity.a.a(readerPreviewActivity, pdfPreviewEntity, p12, i10);
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerPreviewActivity);
                }
            }
        }
        e2Var.cancel();
    }
}
