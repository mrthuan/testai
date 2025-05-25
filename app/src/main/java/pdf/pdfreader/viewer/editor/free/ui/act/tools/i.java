package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.content.Intent;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.i;

/* compiled from: PDFChooseActivity.kt */
/* loaded from: classes3.dex */
public final class i extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ PDFChooseActivity f27066o;

    /* compiled from: PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends ge.a {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ PDFChooseActivity f27067o;

        /* compiled from: PDFChooseActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.act.tools.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0351a extends ge.a {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ PDFChooseActivity f27068o;

            public C0351a(PDFChooseActivity pDFChooseActivity) {
                this.f27068o = pDFChooseActivity;
            }

            @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
            public final void b(List<PdfPreviewEntity> list) {
                p1.a.a(this.f27068o).c(new Intent(ea.a.p("Q2QfLgRkEHItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2UdQTpUPU84XwRPJ0RrRh5MfV8RTwRQekUgRQ==", "u73ytvnw")));
            }
        }

        public a(PDFChooseActivity pDFChooseActivity) {
            this.f27067o = pDFChooseActivity;
        }

        @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
        public final void b(List<PdfPreviewEntity> list) {
            ReaderPdfApplication.k().h(false);
            Intent intent = new Intent(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpGW8QLhxyNGVhQXJUME95XxZPC0QqRiFMcF8tTwhQKUU5RQ==", "Dpv3mbzQ"));
            PDFChooseActivity pDFChooseActivity = this.f27067o;
            p1.a.a(pDFChooseActivity).c(intent);
            pDFChooseActivity.s2().post(new h(pDFChooseActivity, 0));
        }
    }

    public i(PDFChooseActivity pDFChooseActivity) {
        this.f27066o = pDFChooseActivity;
    }

    @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
    public final void b(List<PdfPreviewEntity> list) {
        final PDFChooseActivity pDFChooseActivity = this.f27066o;
        pDFChooseActivity.s2().post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.g
            @Override // java.lang.Runnable
            public final void run() {
                String p10 = ea.a.p("O2hYc10w", "IO2MK2IJ");
                PDFChooseActivity pDFChooseActivity2 = PDFChooseActivity.this;
                kotlin.jvm.internal.g.e(pDFChooseActivity2, p10);
                FileRepository.B(pDFChooseActivity2, new i.a(pDFChooseActivity2));
            }
        });
    }
}
