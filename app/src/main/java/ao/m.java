package ao;

import android.text.TextUtils;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5105b;

    public /* synthetic */ m(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5104a = i10;
        this.f5105b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5104a;
        ReaderPreviewActivity readerPreviewActivity = this.f5105b;
        switch (i10) {
            case 0:
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.y2();
                return;
            case 1:
                ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
                if (readerPDFCore != null) {
                    readerPDFCore.resetData();
                    try {
                        ReaderPDFCore readerPDFCore2 = new ReaderPDFCore(readerPreviewActivity, readerPreviewActivity.f26246r2);
                        if (readerPDFCore2.needsPassword() && !TextUtils.isEmpty(readerPreviewActivity.W)) {
                            readerPDFCore2.authenticatePassword(readerPreviewActivity.W);
                        }
                        readerPDFCore2.countPages();
                        readerPDFCore2.transportData(readerPreviewActivity.f26256t1);
                        readerPreviewActivity.q4(readerPDFCore2);
                        return;
                    } catch (Exception unused) {
                        int i11 = pdf.pdfreader.viewer.editor.free.utils.d0.f28617a;
                        ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
                        return;
                    }
                }
                return;
            default:
                if (readerPreviewActivity.B3.isSelected()) {
                    readerPreviewActivity.E3(readerPreviewActivity.B3);
                    return;
                }
                TextView textView = readerPreviewActivity.A3;
                if (textView != null && textView.isSelected()) {
                    readerPreviewActivity.E3(readerPreviewActivity.A3);
                    return;
                }
                TextView textView2 = readerPreviewActivity.C3;
                if (textView2 != null && textView2.isSelected()) {
                    readerPreviewActivity.E3(readerPreviewActivity.C3);
                    return;
                }
                return;
        }
    }
}
