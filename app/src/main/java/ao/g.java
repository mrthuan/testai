package ao;

import lib.zj.pdfeditor.ReaderView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5042a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5043b;

    public /* synthetic */ g(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5042a = i10;
        this.f5043b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5042a;
        ReaderPreviewActivity readerPreviewActivity = this.f5043b;
        switch (i10) {
            case 0:
                ReaderPreviewActivity.b0 b0Var = readerPreviewActivity.f26276w1;
                if (b0Var != null) {
                    b0Var.g(new t5.i(10));
                    return;
                }
                return;
            default:
                int displayedViewIndex = readerPreviewActivity.f26276w1.getDisplayedViewIndex();
                if (ReaderView.B0 && displayedViewIndex > 0 && displayedViewIndex < readerPreviewActivity.f26276w1.getPageCount() - 1) {
                    readerPreviewActivity.f26276w1.n0(displayedViewIndex, true);
                } else if (displayedViewIndex >= readerPreviewActivity.f26276w1.getPageCount() - 1) {
                    ReaderPreviewActivity.b0 b0Var2 = readerPreviewActivity.f26276w1;
                    b0Var2.n0(b0Var2.getPageCount(), true);
                } else {
                    readerPreviewActivity.f26276w1.n0(displayedViewIndex, true);
                }
                readerPreviewActivity.f26276w1.requestLayout();
                return;
        }
    }
}
