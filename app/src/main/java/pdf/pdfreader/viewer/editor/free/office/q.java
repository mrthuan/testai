package pdf.pdfreader.viewer.editor.free.office;

import android.content.Context;
import bm.c;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class q implements c.InterfaceC0042c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26132b;
    public final /* synthetic */ int c;

    public q(String str, OfficeReaderActivity officeReaderActivity, int i10) {
        this.f26131a = str;
        this.f26132b = officeReaderActivity;
        this.c = i10;
    }

    @Override // bm.c.InterfaceC0042c
    public final void b(ArrayList arrayList) {
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        Context m10 = ReaderPdfApplication.m();
        kotlin.jvm.internal.g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "ytnYuEMn"));
        String str = this.f26131a;
        StorageFileObserver.c(m10, str, true);
        boolean z10 = !arrayList.isEmpty();
        OfficeReaderActivity officeReaderActivity = this.f26132b;
        if (z10) {
            officeReaderActivity.f25991z2 = (PdfPreviewEntity) arrayList.get(0);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
            pdfPreviewEntity.setPage(this.c);
            dp.a a10 = dp.a.a();
            a10.getClass();
            dp.a.c("convert insert database id is:" + pdfPreviewEntity.getId());
            FileRepository.I(pdfPreviewEntity);
        }
        try {
            String str2 = OfficeReaderActivity.D2;
            officeReaderActivity.getClass();
            w0.a().f28790a.execute(new c6.b(6));
            pdf.pdfreader.viewer.editor.free.utils.v.N(officeReaderActivity, str);
        } finally {
            officeReaderActivity.A2 = true;
            officeReaderActivity.w2().post(new o(officeReaderActivity, 4));
        }
    }

    @Override // bm.c.InterfaceC0042c
    public final void a() {
    }
}
