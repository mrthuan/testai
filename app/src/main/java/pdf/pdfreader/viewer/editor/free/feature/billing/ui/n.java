package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.t1;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.g0;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24943b;

    public /* synthetic */ n(jl.a aVar, int i10) {
        this.f24942a = i10;
        this.f24943b = aVar;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        int i10 = this.f24942a;
        jl.a aVar = this.f24943b;
        switch (i10) {
            case 0:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) aVar;
                SubscriptionDarkTestJActivity.a aVar2 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("R2gic1cw", "x6zBxlA5"));
                subscriptionDarkTestJActivity.U = true;
                t1 a10 = t1.a(view);
                a10.f1467b.setOnClickListener(new o(0));
                TextView textView = (TextView) a10.f1469e;
                i.a aVar3 = i.f24934a;
                Context context = textView.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("I3RcczdhS3QcdkhjW24jZUB0", "p2JrC9WZ"));
                String string = subscriptionDarkTestJActivity.getString(R.string.arg_res_0x7f13049c, ea.a.p("Mw==", "u2yzJE7Z"));
                kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHMxYRd0GXkMdRVfKHIqZW50C2lWbAUxZiBXM0op", "zLkBFcgN"));
                TextPaint paint = textView.getPaint();
                kotlin.jvm.internal.g.d(paint, ea.a.p("WHRWcyFhFHQcdkhwVWk5dA==", "pe1xUfqk"));
                aVar3.getClass();
                textView.setText(i.a.c(context, string, paint));
                ((LottieAnimationView) a10.c).j();
                subscriptionDarkTestJActivity.T = a10;
                return;
            default:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) aVar;
                ImageAdjustActivity.a aVar4 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "FO5GH4gv"));
                int i11 = R.id.closeIv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.closeIv);
                if (appCompatImageView != null) {
                    i11 = R.id.contentTv;
                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(view, R.id.contentTv);
                    if (textView2 != null) {
                        i11 = R.id.lottieAnimationView;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(view, R.id.lottieAnimationView);
                        if (lottieAnimationView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            t1 t1Var = new t1(constraintLayout, appCompatImageView, textView2, lottieAnimationView, 1);
                            appCompatImageView.setOnClickListener(new f5.d(t1Var, 16));
                            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("KHVYZBxCXm4-aSRnW3IHb3Q=", "sYUs34no"));
                            ea.a.p("VHUiZBZCC24WaVpnR2M6bzdle3Y=", "xCiaHqFq");
                            ea.a.p("KHVYZBxCXm4-aSRnW2MHbkFlAHQRdg==", "jNMBxBjf");
                            ImageAdjustActivity.x2(appCompatImageView, 0.0f);
                            ImageAdjustActivity.x2(textView2, 0.0f);
                            ea.a.p("VHUiZBZCC24WaVpnR2w5dDBpV0EoaS5hA2lfbmJpJnc=", "w04CcDKh");
                            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("KHVYZBxCXm4-aSRnW3IHb3Q=", "YQB8WTGP"));
                            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                            if (layoutParams != null) {
                                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = -imageAdjustActivity.getResources().getDimensionPixelSize(R.dimen.dp_8);
                                bVar.setMarginEnd(-imageAdjustActivity.getResources().getDimensionPixelSize(R.dimen.dp_10));
                                constraintLayout.setLayoutParams(bVar);
                                lottieAnimationView.f6018h.c.addUpdateListener(new g0(imageAdjustActivity, appCompatImageView, textView2, constraintLayout, lottieAnimationView));
                                lottieAnimationView.c(new h0(lottieAnimationView));
                                lottieAnimationView.j();
                                imageAdjustActivity.M = t1Var;
                                return;
                            }
                            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuCm5ubiFsLSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQJYTpvIXRvd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAR5LHUgUCByUm1z", "eCTAUqQa"));
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpQWhGSSc6IA==", "5fcgHsFK").concat(view.getResources().getResourceName(i11)));
        }
    }
}
