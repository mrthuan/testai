package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderMergeChooserActivity.kt */
/* loaded from: classes3.dex */
public final class l0 extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ReaderMergeChooserActivity f26953o;

    /* compiled from: ReaderMergeChooserActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends ge.a {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ ReaderMergeChooserActivity f26954o;

        /* compiled from: ReaderMergeChooserActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.act.l0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0350a extends ge.a {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ ReaderMergeChooserActivity f26955o;

            public C0350a(ReaderMergeChooserActivity readerMergeChooserActivity) {
                this.f26955o = readerMergeChooserActivity;
            }

            @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
            public final void b(List<PdfPreviewEntity> list) {
                p1.a.a(this.f26955o).c(new Intent(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpIG8ZLjByJmVhQXJUME95XxZPC0QqRiFMcF8tTwhQKUUARQ==", "BnlsTkVC")));
            }
        }

        public a(ReaderMergeChooserActivity readerMergeChooserActivity) {
            this.f26954o = readerMergeChooserActivity;
        }

        @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
        public final void b(List<PdfPreviewEntity> list) {
            ReaderPdfApplication.k().h(false);
            Intent intent = new Intent(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpDm8BLhNyMWVhQXJUME95XxZPC0QqRiFMcF8tTwhQKUUuRQ==", "eekXzsuT"));
            ReaderMergeChooserActivity readerMergeChooserActivity = this.f26954o;
            p1.a.a(readerMergeChooserActivity).c(intent);
            FileRepository.C(readerMergeChooserActivity, new C0350a(readerMergeChooserActivity));
        }
    }

    public l0(ReaderMergeChooserActivity readerMergeChooserActivity) {
        this.f26953o = readerMergeChooserActivity;
    }

    @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
    public final void b(List<PdfPreviewEntity> list) {
        ReaderMergeChooserActivity readerMergeChooserActivity = this.f26953o;
        FileRepository.B(readerMergeChooserActivity, new a(readerMergeChooserActivity));
    }
}
