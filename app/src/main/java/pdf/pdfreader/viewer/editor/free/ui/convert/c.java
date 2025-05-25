package pdf.pdfreader.viewer.editor.free.ui.convert;

import android.content.Context;
import bm.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: ReaderImg2PDFConvertActivity.kt */
/* loaded from: classes3.dex */
public final class c implements c.InterfaceC0042c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f27415a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderImg2PDFConvertActivity f27416b;
    public final /* synthetic */ int c;

    public c(String str, ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity, int i10) {
        this.f27415a = str;
        this.f27416b = readerImg2PDFConvertActivity;
        this.c = i10;
    }

    public static void c(ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity) {
        g.e(readerImg2PDFConvertActivity, ea.a.p("R2gic1cw", "tqScwSGT"));
        ReaderImg2PDFConvertActivity.a aVar = ReaderImg2PDFConvertActivity.f27381i0;
        OperateExecuteTask o22 = readerImg2PDFConvertActivity.o2();
        long j10 = readerImg2PDFConvertActivity.X;
        o22.getClass();
        OperateExecuteTask.p(readerImg2PDFConvertActivity, j10);
        readerImg2PDFConvertActivity.X = 0L;
        if (readerImg2PDFConvertActivity.O) {
            readerImg2PDFConvertActivity.U = true;
        } else {
            readerImg2PDFConvertActivity.n2().post(new b1.e(readerImg2PDFConvertActivity, 27));
        }
    }

    @Override // bm.c.InterfaceC0042c
    public final void b(ArrayList arrayList) {
        String str;
        ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = this.f27416b;
        if (!arrayList.isEmpty()) {
            str = ((PdfPreviewEntity) arrayList.get(0)).getPath();
        } else {
            str = this.f27415a;
        }
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        Context m10 = ReaderPdfApplication.m();
        g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "f5bgWXy5"));
        g.d(str, ea.a.p("Q2E_aDVvEERi", "PrxT52Bo"));
        StorageFileObserver.c(m10, str, true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
            pdfPreviewEntity.setPage(this.c);
            ImageConvertDataRepository.f26536a.getClass();
            ((List) ImageConvertDataRepository.c.getValue()).add(pdfPreviewEntity);
            dp.a a10 = dp.a.a();
            a10.getClass();
            dp.a.c("convert insert database id is:" + pdfPreviewEntity.getId());
            FileRepository.I(pdfPreviewEntity);
        }
        try {
            ReaderImg2PDFConvertActivity.a aVar2 = ReaderImg2PDFConvertActivity.f27381i0;
            readerImg2PDFConvertActivity.getClass();
            w0.a().f28790a.execute(new c6.b(8));
            v.N(readerImg2PDFConvertActivity, str);
            readerImg2PDFConvertActivity.n2().post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(readerImg2PDFConvertActivity, 7));
        } catch (Throwable th2) {
            ReaderImg2PDFConvertActivity.a aVar3 = ReaderImg2PDFConvertActivity.f27381i0;
            readerImg2PDFConvertActivity.n2().post(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(readerImg2PDFConvertActivity, 9));
            throw th2;
        }
    }

    @Override // bm.c.InterfaceC0042c
    public final void a() {
    }
}
