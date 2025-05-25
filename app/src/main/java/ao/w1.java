package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class w1 implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f5145a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5146b;

    public w1(ReaderPreviewActivity readerPreviewActivity, boolean z10) {
        this.f5146b = readerPreviewActivity;
        this.f5145a = z10;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
    public final void a(int i10) {
        ReaderPreviewActivity readerPreviewActivity = this.f5146b;
        pdf.pdfreader.viewer.editor.free.utils.p.f(readerPreviewActivity, readerPreviewActivity.f26245r1, this.f5145a);
        ReaderPreviewActivity.b0 b0Var = readerPreviewActivity.f26276w1;
        if (b0Var != null) {
            b0Var.setDisplayedViewIndex(i10 - 1);
        }
        readerPreviewActivity.B1(readerPreviewActivity.W3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
    public final void b() {
        ReaderPreviewActivity readerPreviewActivity = this.f5146b;
        pdf.pdfreader.viewer.editor.free.utils.p.g(readerPreviewActivity, readerPreviewActivity.f26245r1, this.f5145a);
    }
}
