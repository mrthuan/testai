package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24926b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f24925a = i10;
        this.f24926b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        float f10;
        int i18 = this.f24925a;
        Object obj = this.f24926b;
        switch (i18) {
            case 0:
                SubscriptionAIActivity subscriptionAIActivity = (SubscriptionAIActivity) obj;
                int i19 = SubscriptionAIActivity.X;
                kotlin.jvm.internal.g.e(subscriptionAIActivity, ea.a.p("R2gic1cw", "UaWDAg0D"));
                if (view.getMeasuredHeight() != subscriptionAIActivity.W) {
                    subscriptionAIActivity.W = view.getMeasuredHeight();
                    subscriptionAIActivity.M2().f1566n.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, view.getMeasuredHeight(), new int[]{-14747, -207707, -14747}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            case 1:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj;
                int i20 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("O2hYc10w", "vzwChsuw"));
                if (view.getMeasuredWidth() != subscriptionBlackFridayActivity.V) {
                    subscriptionBlackFridayActivity.V = view.getMeasuredWidth();
                    float measureText = subscriptionBlackFridayActivity.C2().f1495j.getPaint().measureText(subscriptionBlackFridayActivity.C2().f1495j.getText().toString());
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("RS4obx10B3h0", "vC9kC05f"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        f10 = view.getMeasuredWidth();
                    } else {
                        f10 = 0.0f;
                    }
                    Context context2 = view.getContext();
                    kotlin.jvm.internal.g.d(context2, ea.a.p("RS4obx10B3h0", "571qH8zP"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context2)) {
                        measureText = view.getMeasuredWidth() - measureText;
                    }
                    subscriptionBlackFridayActivity.C2().f1495j.getPaint().setShader(new LinearGradient(f10, 0.0f, measureText, 0.0f, new int[]{-9583, -21943, -705579}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            case 2:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("P2gvcx0w", "EMKF93QH"));
                imageAdjustActivity.M2();
                return;
            default:
                ap.d dVar = (ap.d) obj;
                int i21 = ap.d.G;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("O2hYc10w", "3uIwLnwL"));
                if (view != null) {
                    int measuredHeight = view.getMeasuredHeight();
                    Context context3 = view.getContext();
                    kotlin.jvm.internal.g.d(context3, ea.a.p("RS4obx10B3h0", "8ProOS5m"));
                    int dimensionPixelSize = context3.getResources().getDimensionPixelSize(R.dimen.dp_50) + measuredHeight;
                    LottieAnimationView lottieAnimationView = dVar.B;
                    if (lottieAnimationView != null) {
                        lottieAnimationView.post(new vl.a(lottieAnimationView, dimensionPixelSize, 3));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
