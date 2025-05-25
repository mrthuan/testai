package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
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
import pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: ReaderSearchActivity.java */
/* loaded from: classes3.dex */
public final class v0 implements PdfListMoreMenuDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderSearchActivity f27077a;

    /* compiled from: ReaderSearchActivity.java */
    /* loaded from: classes3.dex */
    public class a extends r.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27078a;

        public a(String str) {
            this.f27078a = str;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.x
        public final void i(String str, boolean z10) {
            ReaderPdfApplication.k().i(new no.d(this.f27078a, str));
        }
    }

    public v0(ReaderSearchActivity readerSearchActivity) {
        this.f27077a = readerSearchActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void a(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 8;
        obtainMessage.obj = pdfPreviewEntity;
        obtainMessage.arg1 = z10 ? 1 : 0;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void h(String str) {
        j1.e(this.f27077a, str, true, null, -1);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void i(PdfPreviewEntity pdfPreviewEntity) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 9;
        obtainMessage.obj = pdfPreviewEntity;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void j(final PdfPreviewEntity pdfPreviewEntity, boolean z10, final int i10) {
        String p10 = ea.a.p("VWknZSxtDXJl", "BowaGPNj");
        String p11 = ea.a.p("VWknZR5vEGUtc0RsAHQJYyhpUWs=", "5NpncXoe");
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        tn.a.d(readerSearchActivity, p10, p11, readerSearchActivity.d2(), false);
        if (z10) {
            readerSearchActivity.i2(pdfPreviewEntity, new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.u0
                @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                public final void a(List list) {
                    v0 v0Var = v0.this;
                    v0Var.getClass();
                    if (list.size() > 0) {
                        String p12 = ea.a.p("QHAnaXQ=", "BmatQrYH");
                        String p13 = ea.a.p("LGhebwplXm09XzloGnc=", "L8kslJFk");
                        String p14 = ea.a.p("CWUNchpo", "rZzly7gE");
                        ReaderSearchActivity readerSearchActivity2 = v0Var.f27077a;
                        tn.a.d(readerSearchActivity2, p12, p13, p14, false);
                        ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
                        PdfPreviewEntity z11 = pdf.pdfreader.viewer.editor.free.utils.t0.z(((DecryptContainer) list.get(0)).getNewPath(), pdfPreviewEntity);
                        String p15 = ea.a.p("QGUqchBo", "FYjzqisS");
                        aVar.getClass();
                        ReaderSplitPdfActivity.a.a(readerSearchActivity2, z11, p15, i10);
                        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity2);
                    }
                }
            });
            return;
        }
        tn.a.d(readerSearchActivity, ea.a.p("IXADaXQ=", "ZVRoYHyf"), ea.a.p("UGgkbwBlC20VX0doBnc=", "TI8FePma"), ea.a.p("PGVQchpo", "ifdlbP8Q"), false);
        ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
        String p12 = ea.a.p("QGUqchBo", "JuehCjad");
        aVar.getClass();
        ReaderSplitPdfActivity.a.a(readerSearchActivity, pdfPreviewEntity, p12, i10);
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void k(PdfPreviewEntity pdfPreviewEntity) {
        String p10 = ea.a.p("VWknZSxtDXJl", "TpIi0xx7");
        String p11 = ea.a.p("IWlbZQlvMWUXd1Rwa2M7aVtr", "vwG7dCKC");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "DSmfwjj5"));
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
        ReaderPdfApplication.k().g(null);
        pdfPreviewEntity.setRecent(1);
        pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
        FileRepository.I(pdfPreviewEntity);
        bm.c.b(readerSearchActivity).i(pdfPreviewEntity);
        Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
        String path = pdfPreviewEntity.getPath();
        String p12 = ea.a.p("CVJ-TSZMflMOXwdPJ0U=", "1PbRRhyU");
        aVar.getClass();
        Word2PDFConvertActivity.a.a(readerSearchActivity, path, pdfPreviewEntity, p12);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void l(PdfPreviewEntity pdfPreviewEntity) {
        String p10 = ea.a.p("C2k9ZSZtBnJl", "MsmQyi7E");
        String p11 = ea.a.p("VWknZR5vEGUtYV1fCmw_Y2s=", "uWTL0ZUx");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "9QYOgUZ3"));
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void m(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 5;
        obtainMessage.obj = pdfPreviewEntity;
        obtainMessage.arg1 = !z10 ? 1 : 0;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void n(PdfPreviewEntity pdfPreviewEntity) {
        String p10 = ea.a.p("VWknZSxtDXJl", "gqRnZ90d");
        String p11 = ea.a.p("A2khZThvO2UXcBRpWnQIY1RpMWs=", "C7eMUIZX");
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        tn.a.d(readerSearchActivity, p10, p11, readerSearchActivity.d2(), false);
        String path = pdfPreviewEntity.getPath();
        if (!TextUtils.isEmpty(path)) {
            new GetPDFPasswordProcess(readerSearchActivity).b(path, new a(path));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void o(PdfPreviewEntity pdfPreviewEntity) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 7;
        obtainMessage.obj = pdfPreviewEntity;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void p(PdfPreviewEntity pdfPreviewEntity) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 4;
        obtainMessage.obj = pdfPreviewEntity;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void q(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String p10 = ea.a.p("KWldZSZtWHJl", "yuDtcQCc");
        String p11 = ea.a.p("KWldZRRvRWUFcHhpGGc3Y1lpDWs=", "T8ZFxCY1");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "fjIBWkvf"));
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
        ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = new ChooseConvertImageTypeDialog(readerSearchActivity);
        readerSearchActivity.Y = chooseConvertImageTypeDialog;
        chooseConvertImageTypeDialog.f25473y = new x0(readerSearchActivity, pdfPreviewEntity, z10);
        chooseConvertImageTypeDialog.f25474z = new y0(readerSearchActivity, pdfPreviewEntity, z10);
        readerSearchActivity.W1(chooseConvertImageTypeDialog);
        String p12 = ea.a.p("MWkdZQdtLXJl", "hMWqXBbG");
        String p13 = ea.a.p("VWknZR5vEGUtcAZpBGcJcyxvdw==", "1b5FUv53");
        tn.a.d(readerSearchActivity, p12, p13, readerSearchActivity.d2() + ea.a.p("Xw==", "FVPsXAEw") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void r(final PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String p10 = ea.a.p("KWldZSZtWHJl", "nfdyKG6Y");
        String p11 = ea.a.p("CmkpZQVvBGUXcFR3a2M7aVtr", "9LlEhvBp");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        final ReaderSearchActivity readerSearchActivity = this.f27077a;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "NwbJHXzB"));
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
        readerSearchActivity.getClass();
        if (z10) {
            readerSearchActivity.i2(pdfPreviewEntity, new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.r0
                @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                public final void a(List list) {
                    String str2 = ReaderSearchActivity.f26794c0;
                    ReaderSearchActivity readerSearchActivity2 = ReaderSearchActivity.this;
                    readerSearchActivity2.getClass();
                    if (!list.isEmpty()) {
                        pdf.pdfreader.viewer.editor.free.utils.k0.k(readerSearchActivity2, pdfPreviewEntity.getPath(), ((DecryptContainer) list.get(0)).getPassword(), ea.a.p("dVIETSxMK1MmX3lPO0U=", "x1aOPMzK"));
                        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity2);
                    }
                }
            });
            return;
        }
        pdf.pdfreader.viewer.editor.free.utils.k0.k(readerSearchActivity, pdfPreviewEntity.getPath(), "", ea.a.p("dVIETSxMK1MmX3lPO0U=", "Q0k05Id2"));
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void s(PdfPreviewEntity pdfPreviewEntity) {
        String p10 = ea.a.p("VWknZSxtDXJl", "okEuM42a");
        String p11 = ea.a.p("VWknZR5vEGUtYVBkW2g5bSFfQWgpdw==", "JLaLtmof");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "CwQPSbDw"));
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void t(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String p10 = ea.a.p("KWldZSZtWHJl", "MhoEwoyF");
        String p11 = ea.a.p("KWldZRRvRWUFbS9yEmU3Y1lpDWs=", "wFQBemw6");
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        tn.a.d(readerSearchActivity, p10, p11, readerSearchActivity.d2(), false);
        if (z10) {
            readerSearchActivity.i2(pdfPreviewEntity, new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.t0
                @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                public final void a(List list) {
                    v0 v0Var = v0.this;
                    v0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pdf.pdfreader.viewer.editor.free.utils.t0.t0((DecryptContainer) it.next()));
                    }
                    String p12 = ea.a.p("ImVDZ2U=", "W4bCFtAT");
                    String p13 = ea.a.p("DWgLbyFlHGkkZTlzXG93", "q1ndRz7z");
                    String p14 = ea.a.p("QGUqchBo", "2WXg0QOQ");
                    ReaderSearchActivity readerSearchActivity2 = v0Var.f27077a;
                    tn.a.d(readerSearchActivity2, p12, p13, p14, false);
                    ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                    String p15 = ea.a.p("PGVQchpo", "JVCisUMO");
                    aVar.getClass();
                    ReaderMergeChooserActivity.a.b(readerSearchActivity2, p15, arrayList);
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity2);
                    readerSearchActivity2.e2();
                    readerSearchActivity2.finish();
                }
            });
            return;
        }
        tn.a.d(readerSearchActivity, ea.a.p("ImVDZ2U=", "GZmn1dmM"), ea.a.p("LGhebwplUWk2ZRVzHW93", "tQcpgAAW"), ea.a.p("I2U4cg5o", "G9PYmYrj"), false);
        ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
        MergePdfData mergePdfData = new MergePdfData(aj.b.l(pdfPreviewEntity), false, "", pdfPreviewEntity.getId());
        String p12 = ea.a.p("JmUuchVo", "R9UOveAg");
        aVar.getClass();
        ReaderMergeChooserActivity.a.c(readerSearchActivity, mergePdfData, p12);
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerSearchActivity);
        readerSearchActivity.e2();
        readerSearchActivity.finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void u(PdfPreviewEntity pdfPreviewEntity) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        ge.a.k(readerSearchActivity, readerSearchActivity.f26804w);
        pdf.pdfreader.viewer.editor.free.ui.dialog.g0 g0Var = new pdf.pdfreader.viewer.editor.free.ui.dialog.g0(readerSearchActivity, pdfPreviewEntity);
        readerSearchActivity.O = g0Var;
        if (!g0Var.isShowing()) {
            readerSearchActivity.y1(readerSearchActivity);
            readerSearchActivity.O.show();
        }
        String p10 = ea.a.p("AmkpZSdtWXJl", "PDdEx6C7");
        String p11 = ea.a.p("IWkpZSpvMWUXZAN0VWk7X1tsO2Nr", "1HGEGCAU");
        tn.a.d(readerSearchActivity, p10, p11, readerSearchActivity.d2() + ea.a.p("Xw==", "8S0pTFOO") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void v(PdfPreviewEntity pdfPreviewEntity) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 6;
        obtainMessage.obj = pdfPreviewEntity;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void w(PdfPreviewEntity pdfPreviewEntity) {
        String p10 = ea.a.p("KWldZSZtWHJl", "YsmWAtXZ");
        String p11 = ea.a.p("VWknZR5vEGUtYV1fGmg5dw==", "9FMGudX0");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "LWbk98B2"));
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void x(PdfPreviewEntity pdfPreviewEntity) {
        String p10 = ea.a.p("KWldZSZtWHJl", "A2wKVhT6");
        String p11 = ea.a.p("VWknZR5vEGUtYVBkW2g5bSFfUWwvY2s=", "R7rISD6I");
        StringBuilder sb2 = new StringBuilder();
        String str = ReaderSearchActivity.f26794c0;
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        sb2.append(readerSearchActivity.d2());
        sb2.append(ea.a.p("Xw==", "a1jaSKpW"));
        sb2.append(aj.b.t(pdfPreviewEntity.getOtherStrOne()));
        tn.a.d(readerSearchActivity, p10, p11, sb2.toString(), false);
        ShortcutHelper.a aVar = ShortcutHelper.f24790a;
        if (ShortcutHelper.Companion.a(readerSearchActivity)) {
            ShortcutHelper.Companion.b(pdfPreviewEntity.getPath(), readerSearchActivity, readerSearchActivity.f26801t, readerSearchActivity.f26802u, new w0(this, pdfPreviewEntity));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void y(PdfPreviewEntity pdfPreviewEntity) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 10;
        obtainMessage.obj = pdfPreviewEntity;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.a
    public final void z(PdfPreviewEntity pdfPreviewEntity) {
        ReaderSearchActivity readerSearchActivity = this.f27077a;
        Message obtainMessage = readerSearchActivity.K.obtainMessage();
        obtainMessage.what = 3;
        obtainMessage.obj = pdfPreviewEntity;
        readerSearchActivity.K.sendMessage(obtainMessage);
    }
}
