package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class u1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27766b;

    public u1(e2 e2Var) {
        this.f27766b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27766b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            ao.n1 n1Var = (ao.n1) aVar;
            if (pdfPreviewEntity != null) {
                String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                String p10 = ea.a.p("OWlUdyZtWHJl", "l426DMY4");
                String p11 = ea.a.p("RWkudx5vEGUtcEZpB3QJYyhpUWs=", "zE5290jH");
                String d10 = pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity);
                ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
                pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, p10, p11, d10);
                String path = pdfPreviewEntity.getPath();
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.getClass();
                androidx.activity.s.A0(readerPreviewActivity);
                ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
                if (readerPDFCore != null && readerPDFCore.fileFormat().startsWith(ea.a.p("H0RG", "uD2vRdZk"))) {
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("fy1vLURyBm48RAljFHMjYUp0", "tGRB4oHR"));
                    Context context = readerPreviewActivity.f19296j;
                    if (context != null) {
                        pdf.pdfreader.viewer.editor.free.utils.v.K(readerPreviewActivity, context, path, readerPreviewActivity.W);
                    }
                } else {
                    readerPreviewActivity.C4(readerPreviewActivity.getString(R.string.arg_res_0x7f13016b));
                }
            }
        }
        e2Var.cancel();
    }
}
