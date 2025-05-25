package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.h1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.w;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Objects;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: PreviewPDF2WordStateView.kt */
/* loaded from: classes3.dex */
public final class PreviewPDF2WordStateView extends BaseBindingFrameLayout<h1> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewPDF2WordStateView(Context context) {
        this(context, null, 6, 0);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "PL8MY0SI"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final h1 a(LayoutInflater from) {
        g.e(from, "from");
        from.inflate(R.layout.include_preview_pdf2word_download_state, this);
        int i10 = R.id.iv_pdf2word_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.iv_pdf2word_icon);
        if (appCompatImageView != null) {
            i10 = R.id.lottie_pdf2word_convert;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.lottie_pdf2word_convert);
            if (lottieAnimationView != null) {
                i10 = R.id.lottie_pdf2word_downloading;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.lottie_pdf2word_downloading);
                if (lottieAnimationView2 != null) {
                    h1 h1Var = new h1(this, appCompatImageView, lottieAnimationView, lottieAnimationView2);
                    ea.a.p("Wm4tbBJ0BygUclttRSAiaC1zKQ==", "4CA5b2jQ");
                    return h1Var;
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpHGhLSS06IA==", "hkihC5Cv").concat(getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(Context context) {
        c();
    }

    public final void c() {
        h1 h1Var = (h1) this.f24761a;
        if (h1Var != null) {
            PDF2WordHelper.f25574a.getClass();
            boolean z10 = PDF2WordHelper.f25580h;
            LottieAnimationView lottieAnimationView = h1Var.c;
            AppCompatImageView appCompatImageView = h1Var.f954b;
            LottieAnimationView lottieAnimationView2 = h1Var.f955d;
            if (z10) {
                ea.a.p("H0R3Mi5vRWQSZSZwEHI=", "AxcpUEGP");
                String str = NativeSoLoaderHelper.f1933a;
                w<Integer> wVar = NativeSoLoaderHelper.f1942k;
                Objects.toString(wVar.d());
                String str2 = n0.f28727a;
                Integer d10 = wVar.d();
                int i10 = NativeSoLoaderHelper.f1935d;
                if (d10 != null && d10.intValue() == i10) {
                    lottieAnimationView2.setAnimation(R.raw.pdf2word_downloading_01);
                    lottieAnimationView2.setVisibility(0);
                    appCompatImageView.setVisibility(8);
                    lottieAnimationView.setVisibility(8);
                    return;
                }
                int i11 = NativeSoLoaderHelper.f1937f;
                if (d10 != null && d10.intValue() == i11) {
                    lottieAnimationView2.setVisibility(8);
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setImageResource(R.drawable.ic_pdf2word_download_failed_01);
                    lottieAnimationView.setVisibility(8);
                    return;
                }
                ea.a.p("H0R3Mi5vRWQSZSZwEHI=", "OIVkweC6");
                ea.a.p("E24-bB8gWCA=", "k6kaGgnQ");
                lottieAnimationView2.setVisibility(8);
                appCompatImageView.setVisibility(8);
                lottieAnimationView.setVisibility(0);
                return;
            }
            lottieAnimationView2.setVisibility(8);
            appCompatImageView.setVisibility(8);
            lottieAnimationView.setVisibility(0);
        }
    }

    public final void d() {
        ea.a.p("AEQfMjtvH2QAZQpwUXI=", "TPPYlmn7");
        Objects.toString(NativeSoLoaderHelper.f1942k.d());
        String str = n0.f28727a;
        h1 h1Var = (h1) this.f24761a;
        if (h1Var != null) {
            h1Var.f955d.setVisibility(8);
            h1Var.f954b.setVisibility(8);
            LottieAnimationView lottieAnimationView = h1Var.c;
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.f6018h.c.removeAllListeners();
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.k(230, UnknownRecord.PHONETICPR_00EF);
            lottieAnimationView.j();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewPDF2WordStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "Kri2deal"));
    }

    public /* synthetic */ PreviewPDF2WordStateView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPDF2WordStateView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("Wm8pdDd4dA==", "RY9GR2Jr"));
    }
}
