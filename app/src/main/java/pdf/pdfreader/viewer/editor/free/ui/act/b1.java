package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderSearchActivity.java */
/* loaded from: classes3.dex */
public final class b1 extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ReaderSearchActivity f26892o;

    /* compiled from: ReaderSearchActivity.java */
    /* loaded from: classes3.dex */
    public class a extends ge.a {
        public a() {
        }

        @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
        public final void b(List<PdfPreviewEntity> list) {
            ReaderPdfApplication.k().h(false);
            Intent intent = new Intent(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpF28LLgdyC2UdQQhUOk8sXz5PdUQ2Rh9MAV9xTwtQD0U3RQ==", "cyanrXpM"));
            b1 b1Var = b1.this;
            p1.a.a(b1Var.f26892o).c(intent);
            ReaderSearchActivity readerSearchActivity = b1Var.f26892o;
            if (readerSearchActivity.G.isEmpty()) {
                readerSearchActivity.G.addAll(list);
                readerSearchActivity.K.sendEmptyMessage(15);
            }
        }
    }

    public b1(ReaderSearchActivity readerSearchActivity) {
        this.f26892o = readerSearchActivity;
    }

    @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
    public final void b(List<PdfPreviewEntity> list) {
        FileRepository.B(this.f26892o, new a());
    }
}
