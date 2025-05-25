package ao;

import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class l1 implements DecryptAndCopyUIHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n1 f5102a;

    public l1(n1 n1Var) {
        this.f5102a = n1Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
    public final void a(List<DecryptContainer> list) {
        ArrayList arrayList = new ArrayList();
        for (DecryptContainer decryptContainer : list) {
            arrayList.add(pdf.pdfreader.viewer.editor.free.utils.t0.t0(decryptContainer));
        }
        n1 n1Var = this.f5102a;
        tn.a.d(n1Var.f5112a, ea.a.p("XmU5Z2U=", "SqGS4t62"), ea.a.p("LGhebwplUWk2ZRVzHW93", "mdGPAjhi"), ea.a.p("OWlUdw==", "tEzXV1vZ"), false);
        ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
        String p10 = ea.a.p("OWlUdw==", "zmRkgOcU");
        aVar.getClass();
        ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
        ReaderMergeChooserActivity.a.b(readerPreviewActivity, p10, arrayList);
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerPreviewActivity);
    }
}
