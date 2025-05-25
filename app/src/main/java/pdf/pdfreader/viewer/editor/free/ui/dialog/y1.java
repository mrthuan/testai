package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class y1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27808b;

    public y1(e2 e2Var) {
        this.f27808b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        pdf.pdfreader.viewer.editor.free.utils.q0.w(view.getContext(), "key_need_show_merge_tip", false);
        e2 e2Var = this.f27808b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            boolean z10 = e2Var.Z;
            ao.n1 n1Var = (ao.n1) aVar;
            if (pdfPreviewEntity != null) {
                String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                String p10 = ea.a.p("IWlSdxNtLHJl", "XlW7LCCG");
                String p11 = ea.a.p("RWkudx5vEGUtbVFyDmUJYyhpUWs=", "JctUt0KD");
                String d10 = pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity);
                ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
                pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, p10, p11, d10);
                ReaderPdfApplication.k().g(null);
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new DecryptContainer(pdfPreviewEntity, readerPreviewActivity.W, ""));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(aj.b.l(pdfPreviewEntity));
                    new pdf.pdfreader.viewer.editor.free.decrypt.d(readerPreviewActivity, arrayList2, new ao.l1(n1Var)).a(arrayList);
                } else {
                    tn.a.d(readerPreviewActivity, ea.a.p("XmU5Z2U=", "0buk5HEL"), ea.a.p("LGhebwplUWk2ZRVzHW93", "Tuk4nkst"), ea.a.p("MGlSdw==", "r8F7iGT4"), false);
                    ReaderMergeChooserActivity.a aVar2 = ReaderMergeChooserActivity.f26759n0;
                    MergePdfData mergePdfData = new MergePdfData(aj.b.l(pdfPreviewEntity), false, "", pdfPreviewEntity.getId());
                    String p12 = ea.a.p("RWkudw==", "c0RrMVhh");
                    aVar2.getClass();
                    ReaderMergeChooserActivity.a.c(readerPreviewActivity, mergePdfData, p12);
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerPreviewActivity);
                }
            }
        }
        e2Var.cancel();
    }
}
