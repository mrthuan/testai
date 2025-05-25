package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import bm.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ReaderSplitPdfActivity.kt */
/* loaded from: classes3.dex */
public final class e1 implements c.InterfaceC0042c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderSplitPdfActivity f26924a;

    public e1(ReaderSplitPdfActivity readerSplitPdfActivity) {
        this.f26924a = readerSplitPdfActivity;
    }

    public static void c(ReaderSplitPdfActivity readerSplitPdfActivity, List list) {
        kotlin.jvm.internal.g.e(readerSplitPdfActivity, ea.a.p("FmgTc3ww", "w9bzXklK"));
        kotlin.jvm.internal.g.e(list, ea.a.p("F2wicwdz", "ykaT32Jn"));
        if (readerSplitPdfActivity.f26834g0 == null) {
            readerSplitPdfActivity.f26834g0 = new OperateExecuteTask();
        }
        if (readerSplitPdfActivity.f26834g0 != null) {
            OperateExecuteTask.p(readerSplitPdfActivity, readerSplitPdfActivity.f26843p0);
        }
        readerSplitPdfActivity.f26843p0 = 0L;
        readerSplitPdfActivity.n2().dismiss();
        readerSplitPdfActivity.t2((ArrayList) list, true);
    }

    @Override // bm.c.InterfaceC0042c
    public final void b(ArrayList arrayList) {
        ReaderSplitPdfActivity readerSplitPdfActivity;
        int size = arrayList.size();
        t1.b("split finish result size is : " + size);
        ToolsType toolsType = DataBridge.f24029a;
        DataBridge.f24029a = ToolsType.SPLIT_PDF;
        DataBridge.c = false;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            readerSplitPdfActivity = this.f26924a;
            if (hasNext) {
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                Context m10 = ReaderPdfApplication.m();
                kotlin.jvm.internal.g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "XSvN0qC7"));
                String path = pdfPreviewEntity.getPath();
                kotlin.jvm.internal.g.d(path, ea.a.p("JnQfcBh0aA==", "FfABAsIj"));
                StorageFileObserver.c(m10, path, true);
                String path2 = pdfPreviewEntity.getPath();
                long size2 = pdfPreviewEntity.getSize();
                long id2 = pdfPreviewEntity.getId();
                t1.b("split finish result is : " + path2 + " , file size is " + size2 + " + id is " + id2);
                String str = readerSplitPdfActivity.I;
                pdfPreviewEntity.getId();
                String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                FileRepository.I(pdfPreviewEntity);
            } else {
                try {
                    break;
                } catch (Throwable th2) {
                    ReaderHomeActivity.f26656t2 = false;
                    t1.b("query onSplitFinish endProgress skipSilentScanWithMergeOrSplit:false");
                    readerSplitPdfActivity.V.post(new androidx.fragment.app.a1(18, readerSplitPdfActivity, arrayList));
                    throw th2;
                }
            }
        }
        pdf.pdfreader.viewer.editor.free.utils.v.b();
        if (arrayList.size() == 1) {
            pdf.pdfreader.viewer.editor.free.utils.v.N(readerSplitPdfActivity, ((PdfPreviewEntity) arrayList.get(0)).getPath());
        }
        ReaderHomeActivity.f26656t2 = false;
        t1.b("query onSplitFinish endProgress skipSilentScanWithMergeOrSplit:false");
        readerSplitPdfActivity.V.post(new com.facebook.appevents.g(22, readerSplitPdfActivity, arrayList));
    }

    @Override // bm.c.InterfaceC0042c
    public final void a() {
    }
}
