package ao;

import android.os.Handler;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.io.File;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5114b;

    public /* synthetic */ o(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5113a = i10;
        this.f5114b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        AppCompatImageView appCompatImageView;
        int i10 = this.f5113a;
        ReaderPreviewActivity readerPreviewActivity = this.f5114b;
        switch (i10) {
            case 0:
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.getClass();
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity) && (appCompatImageView = readerPreviewActivity.f26165c4) != null && appCompatImageView.getVisibility() == 0) {
                    if (readerPreviewActivity.f26216m0 != null && readerPreviewActivity.f26165c4.getWidth() > 0 && readerPreviewActivity.f26165c4.getHeight() > 0) {
                        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity)) {
                            readerPreviewActivity.f26216m0.s(readerPreviewActivity.f26165c4);
                            wm.a.c.getClass();
                            pdf.pdfreader.viewer.editor.free.utils.q0.w(readerPreviewActivity, ea.a.p("HHMGc19vP184cgN2XWUgX0hkNF85YVFlK20QbjBnJ18SdTBkUl8hbhcxUTM=", "1LuY7Heh"), false);
                            PreviewPageManageGuideView previewPageManageGuideView = readerPreviewActivity.f26216m0;
                            am.x1 x1Var = previewPageManageGuideView.f25610r;
                            if (x1Var != null) {
                                previewPageManageGuideView.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(previewPageManageGuideView, 4), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                                boolean f10 = previewPageManageGuideView.f();
                                View view = x1Var.f1647e;
                                if (f10) {
                                    ((LottieAnimationView) view).setRotationY(180.0f);
                                } else {
                                    ((LottieAnimationView) view).setRotationY(0.0f);
                                }
                                String string = previewPageManageGuideView.getContext().getString(R.string.arg_res_0x7f130097);
                                kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpoID-YyhuKG5cdxRtEm4DZxdfRGEOZSVfI3BGKQ==", "BXIwIBa8"));
                                ((AppCompatTextView) x1Var.f1646d).setText(kl.e.b(string, new pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.c(string, x1Var, previewPageManageGuideView)));
                                previewPageManageGuideView.post(new f0.s(23, previewPageManageGuideView, x1Var));
                            }
                            readerPreviewActivity.W4.clear();
                            return;
                        }
                        return;
                    }
                    readerPreviewActivity.K4();
                    return;
                }
                return;
            default:
                File m10 = pdf.pdfreader.viewer.editor.free.utils.v.m(readerPreviewActivity, readerPreviewActivity.Q, readerPreviewActivity.getIntent(), true);
                Handler handler = readerPreviewActivity.D;
                if (m10 != null && m10.exists() && m10.length() > 0) {
                    String path = m10.getPath();
                    PdfPreviewEntity d10 = bm.c.b(readerPreviewActivity).d(path);
                    if (d10 == null) {
                        ea.a.p("1ZX75v6uh7rh5Iytj7L35tiJCCA=", "AaugwNkP");
                        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        d10 = new PdfPreviewEntity();
                        d10.setPath(path);
                        d10.setName(pdf.pdfreader.viewer.editor.free.utils.v.r(path.substring(d10.getPath().lastIndexOf(ea.a.p("Lw==", "0c0To9oE")) + 1)));
                        d10.setSize(m10.length());
                        d10.setDate(m10.lastModified());
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d10.setDeleted(0);
                    d10.setRecent(1);
                    d10.setRecentDate(System.currentTimeMillis());
                    if (z10) {
                        bm.c b10 = bm.c.b(readerPreviewActivity);
                        b10.c.f5473a.execute(new bm.b(b10, d10));
                    } else {
                        ea.a.p("qZWB5vSu0rrJ5PKtk5zhOiA=", "cjLMTQ4V");
                        String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        bm.c.b(readerPreviewActivity).i(d10);
                    }
                    ReaderPdfApplication.f23857i = d10;
                    if (handler != null) {
                        handler.post(new l(readerPreviewActivity, 2));
                        return;
                    }
                    return;
                } else if (handler != null) {
                    handler.post(new n(readerPreviewActivity, 1));
                    return;
                } else {
                    return;
                }
        }
    }
}
