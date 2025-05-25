package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g0;
import pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ReaderEditSearchActivity.java */
/* loaded from: classes3.dex */
public final class j implements PdfListMoreMenuDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderEditSearchActivity f28336a;

    /* compiled from: ReaderEditSearchActivity.java */
    /* loaded from: classes3.dex */
    public class a extends r.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28337a;

        public a(String str) {
            this.f28337a = str;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.x
        public final void i(String str, boolean z10) {
            ReaderPdfApplication.k().i(new no.d(this.f28337a, str));
        }
    }

    public j(ReaderEditSearchActivity readerEditSearchActivity) {
        this.f28336a = readerEditSearchActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void a(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 8;
        obtainMessage.obj = pdfPreviewEntity;
        obtainMessage.arg1 = z10 ? 1 : 0;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void h(String str) {
        j1.e(this.f28336a, str, true, null, -1);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void i(PdfPreviewEntity pdfPreviewEntity) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 9;
        obtainMessage.obj = pdfPreviewEntity;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void j(final PdfPreviewEntity pdfPreviewEntity, boolean z10, final int i10) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        if (z10) {
            DecryptAndCopyUIHelper.b bVar = new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.i
                @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                public final void a(List list) {
                    j jVar = j.this;
                    jVar.getClass();
                    if (list.size() > 0) {
                        String p10 = ea.a.p("QHAnaXQ=", "J5mmfeSi");
                        String p11 = ea.a.p("LGhebwplXm09XzloGnc=", "Cknjolx6");
                        String p12 = ea.a.p("RGUsclpo", "ne7M9hJM");
                        ReaderEditSearchActivity readerEditSearchActivity2 = jVar.f28336a;
                        tn.a.d(readerEditSearchActivity2, p10, p11, p12, false);
                        ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
                        PdfPreviewEntity z11 = t0.z(((DecryptContainer) list.get(0)).getNewPath(), pdfPreviewEntity);
                        String p13 = ea.a.p("MWUvchZo", "P6BNu9qA");
                        aVar.getClass();
                        ReaderSplitPdfActivity.a.a(readerEditSearchActivity2, z11, p13, i10);
                    }
                }
            };
            String str = ReaderEditSearchActivity.f28303b0;
            readerEditSearchActivity.e2(pdfPreviewEntity, bVar);
            return;
        }
        tn.a.d(readerEditSearchActivity, ea.a.p("QHAnaXQ=", "eOefwSgx"), ea.a.p("NGgVbwZlPm0vXxVoW3c=", "iwWzuWoq"), ea.a.p("K2VYcjVo", "kCX9V923"), false);
        ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
        String p10 = ea.a.p("QGUqchBo", "yfVSRIPI");
        aVar.getClass();
        ReaderSplitPdfActivity.a.a(readerEditSearchActivity, pdfPreviewEntity, p10, i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void k(PdfPreviewEntity pdfPreviewEntity) {
        ReaderPdfApplication.k().g(null);
        pdfPreviewEntity.setRecent(1);
        pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
        FileRepository.I(pdfPreviewEntity);
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        bm.c.b(readerEditSearchActivity).i(pdfPreviewEntity);
        Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
        String path = pdfPreviewEntity.getPath();
        String p10 = ea.a.p("dVIETSxMK1MmX3lPO0U=", "WZDJstYS");
        aVar.getClass();
        Word2PDFConvertActivity.a.a(readerEditSearchActivity, path, pdfPreviewEntity, p10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void m(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 5;
        obtainMessage.obj = pdfPreviewEntity;
        obtainMessage.arg1 = !z10 ? 1 : 0;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void n(PdfPreviewEntity pdfPreviewEntity) {
        String path = pdfPreviewEntity.getPath();
        if (!TextUtils.isEmpty(path)) {
            new GetPDFPasswordProcess(this.f28336a).b(path, new a(path));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void o(PdfPreviewEntity pdfPreviewEntity) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 7;
        obtainMessage.obj = pdfPreviewEntity;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void p(PdfPreviewEntity pdfPreviewEntity) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 4;
        obtainMessage.obj = pdfPreviewEntity;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void q(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String str = ReaderEditSearchActivity.f28303b0;
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        readerEditSearchActivity.getClass();
        ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = new ChooseConvertImageTypeDialog(readerEditSearchActivity);
        readerEditSearchActivity.X = chooseConvertImageTypeDialog;
        chooseConvertImageTypeDialog.f25473y = new l(readerEditSearchActivity, pdfPreviewEntity, z10);
        chooseConvertImageTypeDialog.f25474z = new d(readerEditSearchActivity, pdfPreviewEntity, z10);
        readerEditSearchActivity.W1(chooseConvertImageTypeDialog);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void r(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String str = ReaderEditSearchActivity.f28303b0;
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        readerEditSearchActivity.getClass();
        if (z10) {
            readerEditSearchActivity.e2(pdfPreviewEntity, new pdf.pdfreader.viewer.editor.free.ui.frag.f(readerEditSearchActivity, pdfPreviewEntity, 1));
            return;
        }
        k0.k(readerEditSearchActivity, pdfPreviewEntity.getPath(), "", ea.a.p("N1J5TSpMO1McXytPZkU=", "fuq6urjx"));
        n.f23972a.b(readerEditSearchActivity);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void t(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        if (z10) {
            DecryptAndCopyUIHelper.b bVar = new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.h
                @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                public final void a(List list) {
                    j jVar = j.this;
                    jVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(t0.t0((DecryptContainer) it.next()));
                    }
                    String p10 = ea.a.p("XmU5Z2U=", "7SDWkBHd");
                    String p11 = ea.a.p("KmhYbyFlIGkkZTlzXG93", "ylI7RFPV");
                    String p12 = ea.a.p("QGUqchBo", "Z0gYZvD1");
                    ReaderEditSearchActivity readerEditSearchActivity2 = jVar.f28336a;
                    tn.a.d(readerEditSearchActivity2, p10, p11, p12, false);
                    ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                    String p13 = ea.a.p("QGUqchBo", "7wVRPawI");
                    aVar.getClass();
                    ReaderMergeChooserActivity.a.b(readerEditSearchActivity2, p13, arrayList);
                    readerEditSearchActivity2.c2();
                    readerEditSearchActivity2.finish();
                }
            };
            String str = ReaderEditSearchActivity.f28303b0;
            readerEditSearchActivity.e2(pdfPreviewEntity, bVar);
            return;
        }
        tn.a.d(readerEditSearchActivity, ea.a.p("ImVDZ2U=", "dQYBuf3A"), ea.a.p("LGhebwplUWk2ZRVzHW93", "eKIBdJeX"), ea.a.p("RWUuclto", "Mq6O8QC2"), false);
        ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
        MergePdfData mergePdfData = new MergePdfData(aj.b.l(pdfPreviewEntity), false, "", pdfPreviewEntity.getId());
        String p10 = ea.a.p("HmU2cjVo", "U4mWVfJ7");
        aVar.getClass();
        ReaderMergeChooserActivity.a.c(readerEditSearchActivity, mergePdfData, p10);
        readerEditSearchActivity.c2();
        readerEditSearchActivity.finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void u(PdfPreviewEntity pdfPreviewEntity) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        ge.a.k(readerEditSearchActivity, readerEditSearchActivity.f28308w);
        g0 g0Var = new g0(readerEditSearchActivity, pdfPreviewEntity);
        readerEditSearchActivity.P = g0Var;
        if (!g0Var.isShowing()) {
            readerEditSearchActivity.y1(readerEditSearchActivity);
            readerEditSearchActivity.P.show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void v(PdfPreviewEntity pdfPreviewEntity) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 6;
        obtainMessage.obj = pdfPreviewEntity;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void x(PdfPreviewEntity pdfPreviewEntity) {
        ShortcutHelper.a aVar = ShortcutHelper.f24790a;
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        if (ShortcutHelper.Companion.a(readerEditSearchActivity)) {
            ShortcutHelper.Companion.b(pdfPreviewEntity.getPath(), readerEditSearchActivity, readerEditSearchActivity.f28305t, readerEditSearchActivity.f28306u, new k());
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void y(PdfPreviewEntity pdfPreviewEntity) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 10;
        obtainMessage.obj = pdfPreviewEntity;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void z(PdfPreviewEntity pdfPreviewEntity) {
        ReaderEditSearchActivity readerEditSearchActivity = this.f28336a;
        Message obtainMessage = readerEditSearchActivity.L.obtainMessage();
        obtainMessage.what = 3;
        obtainMessage.obj = pdfPreviewEntity;
        readerEditSearchActivity.L.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void l(PdfPreviewEntity pdfPreviewEntity) {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void s(PdfPreviewEntity pdfPreviewEntity) {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void w(PdfPreviewEntity pdfPreviewEntity) {
    }
}
