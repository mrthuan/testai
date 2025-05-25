package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class s1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27749b;

    public s1(e2 e2Var) {
        this.f27749b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27749b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            String p10 = ea.a.p("R2kTdzdtHnJl", "gZ1vhqoh");
            String p11 = ea.a.p("OWlUdxRvRWUFcHhpGGc3Y1lpDWs=", "fRlGKKgB");
            ReaderPreviewActivity readerPreviewActivity = ((ao.n1) aVar).f5112a;
            tn.a.b(readerPreviewActivity, p10, p11);
            String path = pdfPreviewEntity.getPath();
            ExecutorService executorService = ReaderPreviewActivity.U5;
            readerPreviewActivity.getClass();
            ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = new ChooseConvertImageTypeDialog(readerPreviewActivity);
            readerPreviewActivity.t4 = chooseConvertImageTypeDialog;
            chooseConvertImageTypeDialog.f25473y = new ao.p1(readerPreviewActivity, path);
            chooseConvertImageTypeDialog.f25474z = new ao.q1(readerPreviewActivity, path);
            readerPreviewActivity.W1(chooseConvertImageTypeDialog);
            tn.a.b(readerPreviewActivity, ea.a.p("OWlUdyZtWHJl", "pdBJboKT"), ea.a.p("HWlddyVvJmUXcFRpWWcIc1Bvdw==", "sCk8HTC2"));
        }
        View view2 = e2Var.Y;
        if (view2 != null && view2.getVisibility() == 0) {
            e2Var.Y.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.w(e2Var.getContext(), "pdf2img_red_dot_show_in_167", false);
        }
        e2Var.cancel();
    }
}
