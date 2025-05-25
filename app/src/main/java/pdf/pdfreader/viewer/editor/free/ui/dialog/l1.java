package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class l1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27651b;

    public l1(e2 e2Var) {
        this.f27651b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27651b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ((ao.n1) aVar).f5112a;
            readerPreviewActivity.getClass();
            androidx.activity.s.x0(readerPreviewActivity);
            readerPreviewActivity.y1(readerPreviewActivity);
            o3 o3Var = new o3(readerPreviewActivity);
            readerPreviewActivity.f26287y = o3Var;
            o3Var.C = new ao.v1(readerPreviewActivity);
            readerPreviewActivity.W1(o3Var);
        }
        e2Var.cancel();
    }
}
