package pdf.pdfreader.viewer.editor.free.office;

import android.net.Uri;
import android.view.View;
import ao.c2;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.split.ReaderSplitPdfManager;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.SearchPDFWhenChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n3;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f26120b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        this.f26119a = i10;
        this.f26120b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26119a;
        Object obj = this.c;
        Object obj2 = this.f26120b;
        switch (i10) {
            case 0:
                m0.c((Word2PDFConvertActivity) obj2, (List) obj);
                return;
            case 1:
                View view = (View) obj;
                ReaderPreviewActivity readerPreviewActivity = ((c2) obj2).f5024b;
                if (readerPreviewActivity.I5) {
                    readerPreviewActivity.h(view.getResources().getString(R.string.arg_res_0x7f1300d4));
                    return;
                }
                readerPreviewActivity.K = 1;
                readerPreviewActivity.f26169d3 = ea.a.p("OWlUdwlvR3Vw", "UGPjg6Oh");
                ReaderPreviewActivity.k2(readerPreviewActivity);
                return;
            case 2:
                ReaderSplitPdfManager.d((ReaderSplitPdfManager) obj2, (String) obj);
                return;
            case 3:
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = (SearchPDFWhenChooseActivity) obj2;
                List list = (List) obj;
                int i11 = SearchPDFWhenChooseActivity.f27034m0;
                kotlin.jvm.internal.g.e(searchPDFWhenChooseActivity, ea.a.p("R2gic1cw", "XcV5wmFf"));
                kotlin.jvm.internal.g.e(list, ea.a.p("a2xYc3Q=", "eYhey1AT"));
                pdf.pdfreader.viewer.editor.free.ui.adapter.u uVar = searchPDFWhenChooseActivity.f27043i0;
                if (uVar != null) {
                    ArrayList arrayList = uVar.f27310e;
                    arrayList.clear();
                    arrayList.addAll(list);
                    uVar.notifyDataSetChanged();
                    return;
                }
                return;
            case 4:
                n3 n3Var = (n3) obj2;
                View view2 = (View) obj;
                int i12 = n3.f27703k;
                kotlin.jvm.internal.g.e(n3Var, ea.a.p("R2gic1cw", "v1goQfK5"));
                kotlin.jvm.internal.g.e(view2, ea.a.p("F2l0", "fcSgKA2j"));
                n3Var.a(view2, view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            case 5:
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj2;
                ReaderEditChooserActivity readerEditChooserActivity = (ReaderEditChooserActivity) obj;
                String str = ReaderEditChooserActivity.B;
                kotlin.jvm.internal.g.e(readerEditChooserActivity, ea.a.p("O2hYc10w", "gfheAUiJ"));
                if (pdfPreviewEntity != null) {
                    ArrayList arrayList2 = readerEditChooserActivity.b2().f28342f;
                    if (!arrayList2.isEmpty()) {
                        int indexOf = arrayList2.indexOf(pdfPreviewEntity);
                        if (indexOf < arrayList2.size() && indexOf >= 0) {
                            PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) arrayList2.get(indexOf);
                            pdfPreviewEntity2.setRecent(1);
                            pdfPreviewEntity2.setRecentDate(System.currentTimeMillis());
                            bm.c.b(readerEditChooserActivity).i(pdfPreviewEntity2);
                            qo.m mVar = new qo.m();
                            mVar.f29408e = true;
                            mVar.f29410g = pdfPreviewEntity2;
                            wk.b.b().e(mVar);
                        }
                        pdf.pdfreader.viewer.editor.free.utils.k0.h(readerEditChooserActivity, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("Q2EsZSx3C2QVZXQ=", "FaxNmtAs"), new pdf.pdfreader.viewer.editor.free.ui.act.tools.h(readerEditChooserActivity, 5));
                        return;
                    }
                    return;
                }
                return;
            default:
                ip.c cVar = (ip.c) obj2;
                Uri uri = (Uri) obj;
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                kotlin.jvm.internal.g.e(cVar, ea.a.p("F2l0", "1QhjBQ0y"));
                bm.c b10 = bm.c.b(ReaderPdfApplication.m());
                PdfPreviewEntity pdfPreviewEntity3 = cVar.c;
                kotlin.jvm.internal.g.b(pdfPreviewEntity3);
                PdfPreviewEntity d10 = b10.d(pdfPreviewEntity3.getPath());
                if (d10 != null) {
                    ThirdOpenParseManager.f28760a.getClass();
                    ThirdOpenParseManager.c(uri, d10);
                    return;
                }
                return;
        }
    }
}
