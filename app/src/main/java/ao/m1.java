package ao;

import java.util.List;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class m1 implements DecryptAndCopyUIHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f5107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n1 f5108b;

    public m1(n1 n1Var, PdfPreviewEntity pdfPreviewEntity) {
        this.f5108b = n1Var;
        this.f5107a = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
    public final void a(List<DecryptContainer> list) {
        if (list.size() > 0) {
            n1 n1Var = this.f5108b;
            tn.a.d(n1Var.f5112a, ea.a.p("QHAnaXQ=", "BHaPOatF"), ea.a.p("UGgkbwBlC20VX0doBnc=", "56ZYvJUM"), ea.a.p("OWlUdw==", "BPwMLpsn"), false);
            ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
            PdfPreviewEntity z10 = pdf.pdfreader.viewer.editor.free.utils.t0.z(list.get(0).getNewPath(), this.f5107a);
            String p10 = ea.a.p("Lmkhdw==", "wbXDu399");
            ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
            int i10 = readerPreviewActivity.f26251s2;
            aVar.getClass();
            ReaderSplitPdfActivity.a.a(readerPreviewActivity, z10, p10, i10);
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerPreviewActivity);
        }
    }
}
