package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Handler;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.List;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26948a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f26949b;
    public final /* synthetic */ OperatePDFWatcherActivity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f26950d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f26951e;

    public /* synthetic */ k0(ReaderMergeChooserActivity readerMergeChooserActivity, ReaderPDFCore readerPDFCore, PdfPreviewEntity pdfPreviewEntity, int i10) {
        this.c = readerMergeChooserActivity;
        this.f26950d = readerPDFCore;
        this.f26951e = pdfPreviewEntity;
        this.f26949b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26948a;
        boolean z10 = false;
        int i11 = this.f26949b;
        Object obj = this.f26951e;
        Object obj2 = this.f26950d;
        OperatePDFWatcherActivity operatePDFWatcherActivity = this.c;
        switch (i10) {
            case 0:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) operatePDFWatcherActivity;
                ReaderPDFCore readerPDFCore = (ReaderPDFCore) obj2;
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj;
                ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("LmgNc3Ew", "EsZdUHtP"));
                kotlin.jvm.internal.g.e(readerPDFCore, ea.a.p("a2NecmU=", "ZtAJ4JtO"));
                kotlin.jvm.internal.g.e(pdfPreviewEntity, ea.a.p("UmUKdD10eQ==", "A2vdTqUo"));
                try {
                    readerMergeChooserActivity.I1();
                    if (readerPDFCore.countPages() > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        readerMergeChooserActivity.q2().f27263h.add(Long.valueOf(pdfPreviewEntity.getId()));
                        readerMergeChooserActivity.q2().getClass();
                        DataBridge.a().add(new MergePdfData(pdfPreviewEntity, readerPDFCore.needsPassword(), null, 0L, 12, null));
                        readerPDFCore.onDestroy();
                        readerMergeChooserActivity.a(readerMergeChooserActivity.q2().f27263h.size());
                        readerMergeChooserActivity.q2().notifyItemChanged(i11, ge.a.H(""));
                        return;
                    }
                    throw new IllegalArgumentException(ea.a.p("dWEibBZkQnIXcUFpG2U7ZSp0Lg==", "UlIhFnV0").toString());
                } catch (Exception e10) {
                    readerPDFCore.onDestroy();
                    j1.e(readerMergeChooserActivity, readerMergeChooserActivity.getString(R.string.arg_res_0x7f130409), true, null, -1);
                    e10.printStackTrace();
                    readerMergeChooserActivity.a(readerMergeChooserActivity.q2().f27263h.size());
                    readerMergeChooserActivity.q2().notifyItemChanged(i11, ge.a.H(""));
                    return;
                }
            default:
                ArrayList<ul.b> arrayList = (ArrayList) obj2;
                List list = (List) obj;
                kotlin.jvm.internal.g.e(operatePDFWatcherActivity, ea.a.p("O2hYc10w", "g3h2TsMr"));
                kotlin.jvm.internal.g.e(arrayList, ea.a.p("TmFVZAByWHABbQdnUXM=", "eXj1C7ds"));
                kotlin.jvm.internal.g.e(list, ea.a.p("Q2kiYS9lcw==", "JcgOHq2I"));
                Handler handler = operatePDFWatcherActivity.f27004w;
                handler.removeCallbacks(operatePDFWatcherActivity.C);
                if (arrayList.size() - i11 != list.size()) {
                    j1.e(operatePDFWatcherActivity, operatePDFWatcherActivity.getResources().getString(R.string.arg_res_0x7f130569), false, null, -1);
                }
                ImageConvertDataRepository.f26536a.getClass();
                ImageConvertDataRepository.f26551q.j(arrayList);
                ImageConvertDataRepository.g();
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l lVar = operatePDFWatcherActivity.f27003v;
                if (lVar != null && lVar.isShowing()) {
                    z10 = true;
                }
                long j10 = 0;
                if (z10 && operatePDFWatcherActivity.B > 0) {
                    long currentTimeMillis = ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM) - (System.currentTimeMillis() - operatePDFWatcherActivity.B);
                    if (currentTimeMillis < 0) {
                        currentTimeMillis = 0;
                    }
                    operatePDFWatcherActivity.B = 0L;
                    j10 = currentTimeMillis;
                }
                handler.postDelayed(operatePDFWatcherActivity.D, j10);
                return;
        }
    }

    public /* synthetic */ k0(OperatePDFWatcherActivity operatePDFWatcherActivity, ArrayList arrayList, int i10, List list) {
        this.c = operatePDFWatcherActivity;
        this.f26950d = arrayList;
        this.f26949b = i10;
        this.f26951e = list;
    }
}
