package pdf.pdfreader.viewer.editor.free.feature.billing.dialog;

import am.m0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.activity.l;
import androidx.appcompat.widget.y0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.inmobi.commons.core.configs.TelemetryConfig;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.extension.i;

/* compiled from: YearPurchaseLoading.kt */
/* loaded from: classes3.dex */
public final class c extends l {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f24875j = 0;

    /* renamed from: d  reason: collision with root package name */
    public final String f24876d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24877e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24878f;

    /* renamed from: g  reason: collision with root package name */
    public final tf.c f24879g;

    /* renamed from: h  reason: collision with root package name */
    public ValueAnimator f24880h;

    /* renamed from: i  reason: collision with root package name */
    public final y0 f24881i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Context context, boolean z10, boolean z11) {
        super(context, R.style.ToolsGuideDialog);
        ea.a.p("UG8ldBZ4dA==", "DQQRS2au");
        g.e(str, ea.a.p("O3JYYRVEVnk=", "Yck2QOsg"));
        this.f24876d = str;
        this.f24877e = z10;
        this.f24878f = z11;
        this.f24879g = kotlin.a.a(new cg.a<m0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.dialog.YearPurchaseLoading$binding$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final m0 invoke() {
                View inflate = c.this.getLayoutInflater().inflate(R.layout.dialog_year_purchase_loading, (ViewGroup) null, false);
                int i10 = R.id.anim_view;
                if (((LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.anim_view)) != null) {
                    i10 = R.id.center_line;
                    if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.center_line)) != null) {
                        i10 = R.id.noPaymentTv;
                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.noPaymentTv);
                        if (textView != null) {
                            i10 = R.id.start_tv;
                            TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.start_tv);
                            if (textView2 != null) {
                                return new m0((ConstraintLayout) inflate, textView, textView2);
                            }
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpHmh2SSs6IA==", "jVokdzSb").concat(inflate.getResources().getResourceName(i10)));
            }
        });
        this.f24881i = new y0(this, 28);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            ValueAnimator valueAnimator = this.f24880h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        long j10;
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = p().f1096a;
        g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "pAnE5yCA"));
        setContentView(constraintLayout);
        Window window = getWindow();
        if (window != null) {
            if (this.f24877e) {
                window.setFlags(8, 8);
            }
            window.setStatusBarColor(0);
            window.setNavigationBarColor(androidx.core.content.a.getColor(window.getContext(), R.color.black_transparent));
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.8f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                ea.a.p("GXQkcj1iDXQtcw==", "jHxPTxx1");
                attributes.width = -1;
                attributes.height = -1;
            }
        }
        boolean z10 = this.f24878f;
        setCancelable(z10);
        setCanceledOnTouchOutside(z10);
        TextView textView = p().c;
        String string = getContext().getString(R.string.arg_res_0x7f13049d, this.f24876d);
        g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpkIDHZQhfR3JaYSdfQl8FcAYsFHQbaTdsAGFLKQ==", "ram3lmLz"));
        TextPaint paint = p().c.getPaint();
        g.d(paint, ea.a.p("LWlfZBBuUC4pdCtyAVQeLkVhB250", "IgEMfxvK"));
        String obj = string.toString();
        if (k.O(obj, ea.a.p("D2I-", "UStq4Gog"), false)) {
            try {
                int V = k.V(obj, ea.a.p("D2I-", "keuhzxI5"), 0, false, 6);
                int V2 = k.V(obj, ea.a.p("Dy8pPg==", "BzoHGa4w"), 0, false, 6) - 3;
                String K = j.K(j.K(obj, ea.a.p("c2I-", "zpTtNeVT"), ""), ea.a.p("Di8kPg==", "w72FQkQH"), "");
                SpannableString spannableString = new SpannableString(K);
                spannableString.setSpan(new so.a(new LinearGradient(0.0f, 0.0f, paint.measureText(K, V, V2), 0.0f, new int[]{-10098, -25776, -571450}, (float[]) null, Shader.TileMode.CLAMP)), V, V2, 18);
                string = spannableString;
            } catch (Throwable unused) {
            }
        }
        textView.setText(string);
        TextView textView2 = p().c;
        if (z10) {
            j10 = TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;
        } else {
            j10 = 850;
        }
        textView2.postDelayed(this.f24881i, j10);
    }

    public final m0 p() {
        return (m0) this.f24879g.getValue();
    }

    @Override // android.app.Dialog
    public final void show() {
        Window window;
        try {
            super.show();
            if (this.f24877e && (window = getWindow()) != null) {
                i.i(window);
                window.clearFlags(8);
            }
        } catch (Exception unused) {
        }
    }
}
