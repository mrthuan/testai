package ao;

import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5095a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5096b;

    public /* synthetic */ l(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5095a = i10;
        this.f5096b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5095a;
        ReaderPreviewActivity readerPreviewActivity = this.f5096b;
        switch (i10) {
            case 0:
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.Z2();
                return;
            case 1:
                ExecutorService executorService2 = ReaderPreviewActivity.U5;
                readerPreviewActivity.y2();
                return;
            default:
                ExecutorService executorService3 = ReaderPreviewActivity.U5;
                readerPreviewActivity.x1(readerPreviewActivity.f26284x2);
                if (!readerPreviewActivity.isFinishing() && !readerPreviewActivity.isDestroyed()) {
                    readerPreviewActivity.Z2();
                    return;
                }
                return;
        }
    }
}
