package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.g1;
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

/* compiled from: PDF2WordSoDownLoadStateView.kt */
/* loaded from: classes3.dex */
public final class PDF2WordSoDownLoadStateView extends BaseBindingFrameLayout<g1> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDF2WordSoDownLoadStateView(Context context) {
        super(context);
        g.e(context, ea.a.p("KW8fdAh4dA==", "hMJqmGmy"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final g1 a(LayoutInflater from) {
        g.e(from, "from");
        from.inflate(R.layout.include_pdf2word_download_state, this);
        int i10 = R.id.pdf2word_download_iv_failed;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.pdf2word_download_iv_failed);
        if (appCompatImageView != null) {
            i10 = R.id.pdf2word_lottie_downloading;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.pdf2word_lottie_downloading);
            if (lottieAnimationView != null) {
                g1 g1Var = new g1(this, appCompatImageView, lottieAnimationView);
                ea.a.p("Wm4tbBJ0BygUclttRSAiaC1zKQ==", "saL47ChO");
                return g1Var;
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpLWhMSSM6IA==", "Ylg2UM5u").concat(getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(Context context) {
        c();
    }

    public final void c() {
        g1 g1Var = (g1) this.f24761a;
        if (g1Var != null) {
            PDF2WordHelper.f25574a.getClass();
            if (PDF2WordHelper.f25580h) {
                String str = NativeSoLoaderHelper.f1933a;
                Integer d10 = NativeSoLoaderHelper.f1942k.d();
                int i10 = NativeSoLoaderHelper.f1935d;
                AppCompatImageView appCompatImageView = g1Var.f932b;
                LottieAnimationView lottieAnimationView = g1Var.c;
                if (d10 != null && d10.intValue() == i10) {
                    setVisibility(0);
                    lottieAnimationView.setVisibility(0);
                    appCompatImageView.setVisibility(8);
                    return;
                }
                int i11 = NativeSoLoaderHelper.f1937f;
                if (d10 != null && d10.intValue() == i11) {
                    setVisibility(0);
                    lottieAnimationView.setVisibility(8);
                    appCompatImageView.setVisibility(0);
                    return;
                }
                setVisibility(8);
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDF2WordSoDownLoadStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, ea.a.p("Im8mdCl4dA==", "pTAHLuRV"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDF2WordSoDownLoadStateView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "SAaO2So1"));
    }
}
