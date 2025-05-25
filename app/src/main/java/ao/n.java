package ao;

import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5110b;

    public /* synthetic */ n(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5109a = i10;
        this.f5110b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5109a;
        ReaderPreviewActivity readerPreviewActivity = this.f5110b;
        switch (i10) {
            case 0:
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.getClass();
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity)) {
                    readerPreviewActivity.B2();
                    return;
                }
                return;
            default:
                ExecutorService executorService2 = ReaderPreviewActivity.U5;
                readerPreviewActivity.x1(readerPreviewActivity.f26284x2);
                return;
        }
    }
}
