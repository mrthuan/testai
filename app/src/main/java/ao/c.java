package ao;

import android.content.Intent;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5021b;

    public /* synthetic */ c(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5020a = i10;
        this.f5021b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5020a) {
            case 0:
                ExecutorService executorService = ReaderPreviewActivity.U5;
                ReaderPreviewActivity readerPreviewActivity = this.f5021b;
                if (!readerPreviewActivity.B3() && !readerPreviewActivity.C3() && !ea.a.p("DlIpTQ5QM0cNXytBekEQRQ==", "bAHfQrGX").equals(readerPreviewActivity.V)) {
                    if (ReaderPdfApplication.b() == null) {
                        Intent intent = new Intent(readerPreviewActivity, ReaderHomeActivity.class);
                        intent.putExtra(ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "OMSZp1ap"), true);
                        readerPreviewActivity.startActivity(intent);
                    }
                } else if (!readerPreviewActivity.Q4) {
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3Q8IEgtenQxaTdkZC1iIFdpF2lEaHphKXQcdgF0TCxOajBtFSA_bzRl", "ye1CWYEI"));
                    readerPreviewActivity.Q4 = true;
                    Intent intent2 = new Intent(readerPreviewActivity, ReaderHomeActivity.class);
                    intent2.putExtra(ea.a.p("O2hYch1FWXQzdHk=", "rK3bu3Vw"), readerPreviewActivity.f26245r1);
                    readerPreviewActivity.startActivity(intent2);
                    readerPreviewActivity.overridePendingTransition(0, 0);
                }
                readerPreviewActivity.finish();
                return;
            default:
                ReaderPreviewActivity readerPreviewActivity2 = this.f5021b;
                ExecutorService executorService2 = ReaderPreviewActivity.U5;
                if (!readerPreviewActivity2.isFinishing() && !readerPreviewActivity2.isDestroyed() && !readerPreviewActivity2.A4) {
                    readerPreviewActivity2.B4 = System.currentTimeMillis();
                    ProgressView progressView = readerPreviewActivity2.T3;
                    if (progressView != null) {
                        progressView.setVisibility(0);
                        readerPreviewActivity2.t3();
                        readerPreviewActivity2.T3.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
