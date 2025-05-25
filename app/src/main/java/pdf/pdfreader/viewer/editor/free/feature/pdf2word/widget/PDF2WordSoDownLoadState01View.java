package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.f1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;

/* compiled from: PDF2WordSoDownLoadState01View.kt */
/* loaded from: classes3.dex */
public final class PDF2WordSoDownLoadState01View extends BaseBindingFrameLayout<f1> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PDF2WordSoDownLoadState01View(Context context) {
        this(context, null, 6, 0);
        g.e(context, ea.a.p("LG9fdBx4dA==", "TLL3NYdP"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final f1 a(LayoutInflater from) {
        g.e(from, "from");
        from.inflate(R.layout.include_pdf2word_download_state_01, this);
        int i10 = R.id.iv_pdf2word_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.iv_pdf2word_icon);
        if (appCompatImageView != null) {
            i10 = R.id.lottie_pdf2word_downloading;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.lottie_pdf2word_downloading);
            if (lottieAnimationView != null) {
                f1 f1Var = new f1(this, appCompatImageView, lottieAnimationView);
                ea.a.p("JW4JbAx0CigucgltGCAjaFFzKQ==", "W9LomoJp");
                return f1Var;
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpEmhTSQ06IA==", "ybXDfsIK").concat(getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(Context context) {
        c();
    }

    public final void c() {
        f1 f1Var = (f1) this.f24761a;
        if (f1Var != null) {
            PDF2WordHelper.f25574a.getClass();
            boolean z10 = PDF2WordHelper.f25580h;
            LottieAnimationView lottieAnimationView = f1Var.c;
            AppCompatImageView appCompatImageView = f1Var.f894b;
            if (z10) {
                String str = NativeSoLoaderHelper.f1933a;
                Integer d10 = NativeSoLoaderHelper.f1942k.d();
                int i10 = NativeSoLoaderHelper.f1935d;
                if (d10 != null && d10.intValue() == i10) {
                    lottieAnimationView.setVisibility(0);
                    appCompatImageView.setVisibility(8);
                    return;
                }
                int i11 = NativeSoLoaderHelper.f1937f;
                if (d10 != null && d10.intValue() == i11) {
                    lottieAnimationView.setVisibility(8);
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setImageResource(R.drawable.ic_pdf2word_download_failed_01);
                    return;
                }
                lottieAnimationView.setVisibility(8);
                appCompatImageView.setVisibility(0);
                appCompatImageView.setImageResource(R.drawable.ic_more_pdf_to_word);
                return;
            }
            lottieAnimationView.setVisibility(8);
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageResource(R.drawable.ic_more_pdf_to_word);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PDF2WordSoDownLoadState01View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, ea.a.p("LG9fdBx4dA==", "nZEViBsM"));
    }

    public /* synthetic */ PDF2WordSoDownLoadState01View(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDF2WordSoDownLoadState01View(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("JW8qdFZ4dA==", "qZFD3x3M"));
    }
}
