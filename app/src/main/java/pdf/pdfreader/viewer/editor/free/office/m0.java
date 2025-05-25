package pdf.pdfreader.viewer.editor.free.office;

import android.content.Context;
import bm.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: Word2PDFConvertActivity.kt */
/* loaded from: classes3.dex */
public final class m0 implements c.InterfaceC0042c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26123b;
    public final /* synthetic */ int c;

    public m0(String str, Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26122a = str;
        this.f26123b = word2PDFConvertActivity;
        this.c = i10;
    }

    public static void c(Word2PDFConvertActivity word2PDFConvertActivity, List list) {
        kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "PiNu1zpj"));
        kotlin.jvm.internal.g.e(list, ea.a.p("bGwdczhz", "nhHtLyZM"));
        Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
        OperateExecuteTask v22 = word2PDFConvertActivity.v2();
        long j10 = word2PDFConvertActivity.f26033j1;
        v22.getClass();
        OperateExecuteTask.p(word2PDFConvertActivity, j10);
        word2PDFConvertActivity.f26033j1 = 0L;
        word2PDFConvertActivity.J2(list, true);
    }

    @Override // bm.c.InterfaceC0042c
    public final void b(ArrayList arrayList) {
        String str;
        Word2PDFConvertActivity word2PDFConvertActivity = this.f26123b;
        if (!arrayList.isEmpty()) {
            str = ((PdfPreviewEntity) arrayList.get(0)).getPath();
        } else {
            str = this.f26122a;
        }
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        Context m10 = ReaderPdfApplication.m();
        kotlin.jvm.internal.g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "Ek31mbFI"));
        kotlin.jvm.internal.g.d(str, ea.a.p("Q2E_aDVvEERi", "0mtRuwHp"));
        StorageFileObserver.c(m10, str, true);
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
            Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
            word2PDFConvertActivity.getClass();
            w0.a().f28790a.execute(new u5.a(7));
            pdf.pdfreader.viewer.editor.free.utils.v.N(word2PDFConvertActivity, str);
            word2PDFConvertActivity.f26035k1 = false;
            word2PDFConvertActivity.u2().post(new f0.s(24, word2PDFConvertActivity, arrayList));
        } catch (Throwable th2) {
            word2PDFConvertActivity.f26035k1 = false;
            word2PDFConvertActivity.u2().post(new l0(0, word2PDFConvertActivity, arrayList));
            throw th2;
        }
    }

    @Override // bm.c.InterfaceC0042c
    public final void a() {
    }
}
