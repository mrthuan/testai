package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderHomeActivity.java */
/* loaded from: classes3.dex */
public final class d0 extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26899o;

    public d0(ReaderHomeActivity readerHomeActivity) {
        this.f26899o = readerHomeActivity;
    }

    @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
    public final void b(List<PdfPreviewEntity> list) {
        ReaderPdfApplication.k().h(false);
        p1.a.a(this.f26899o).c(new Intent(ea.a.p("QWQrLgFkAnItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2UfQQ5UOE8qXwRPJ0RrRh5MfV8RTwRQekUgRQ==", "sX1MqdpY")));
    }
}
