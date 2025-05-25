package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class h2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5063a = 4;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5064b;

    public h2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5064b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderPreviewActivity.b0 b0Var;
        ReaderPreviewActivity readerPreviewActivity = this.f5064b;
        if (readerPreviewActivity.f26277w2) {
            readerPreviewActivity.L4();
            return;
        }
        int i10 = this.f5063a;
        if ((i10 == 2 || i10 == 3) && (b0Var = readerPreviewActivity.f26276w1) != null) {
            readerPreviewActivity.J0((lib.zj.pdfeditor.a0) b0Var.getDisplayedView(), 0.0f, 0.0f, i10);
        }
    }
}
