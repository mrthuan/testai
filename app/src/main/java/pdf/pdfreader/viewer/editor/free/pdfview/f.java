package pdf.pdfreader.viewer.editor.free.pdfview;

import am.h1;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import ao.a1;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPDF2WordStateView;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f26427a;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            ReaderPreviewActivity readerPreviewActivity = fVar.f26427a;
            String string = readerPreviewActivity.getString(R.string.arg_res_0x7f1302ad);
            ReaderPreviewActivity readerPreviewActivity2 = fVar.f26427a;
            new x(readerPreviewActivity, string, readerPreviewActivity2.getString(R.string.arg_res_0x7f1304da), readerPreviewActivity2.getString(R.string.arg_res_0x7f130421)).show();
            readerPreviewActivity2.I5 = false;
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            ReaderPreviewActivity readerPreviewActivity = fVar.f26427a;
            readerPreviewActivity.I5 = true;
            PreviewPDF2WordStateView previewPDF2WordStateView = readerPreviewActivity.f26170d4;
            if (previewPDF2WordStateView != null) {
                ea.a.p("PkQqMmRvHmQAZQpwUXI=", "29nl3l9Y");
                Objects.toString(NativeSoLoaderHelper.f1942k.d());
                String str = n0.f28727a;
                h1 h1Var = (h1) previewPDF2WordStateView.f24761a;
                if (h1Var != null) {
                    h1Var.f955d.setVisibility(8);
                    h1Var.f954b.setVisibility(8);
                    LottieAnimationView lottieAnimationView = h1Var.c;
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.k(0, 30);
                    lottieAnimationView.j();
                    lottieAnimationView.c(new pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.a(h1Var));
                }
            }
            ReaderPreviewActivity readerPreviewActivity2 = fVar.f26427a;
            readerPreviewActivity2.getClass();
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxwFm93", "h0kugm9e"));
            PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
            a1 a1Var = new a1(readerPreviewActivity2);
            companion.getClass();
            PDF2WordHelper.c = a1Var;
            PDF2WordHelper.Companion.e(readerPreviewActivity2, readerPreviewActivity2.f26246r2, readerPreviewActivity2.W);
        }
    }

    public f(ReaderPreviewActivity readerPreviewActivity) {
        this.f26427a = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f26427a;
        readerPreviewActivity.getClass();
        float a10 = f0.a();
        t1.b(ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3Q8YwpuR2UZdG9uPGUrU0FhGmUNIH5uL2URUxhhVmVOZjdlAFNYeg46byQ_cipleG4NZUVuO2wZdBpyCWdl", "ynpR1kOY"));
        if (a10 > (((((float) new File(readerPreviewActivity.f26246r2).length()) / 1024.0f) / 1024.0f) + 10.0f) * 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            readerPreviewActivity.runOnUiThread(new a());
            return;
        }
        v.N(readerPreviewActivity, readerPreviewActivity.f26246r2);
        readerPreviewActivity.runOnUiThread(new b());
    }
}
