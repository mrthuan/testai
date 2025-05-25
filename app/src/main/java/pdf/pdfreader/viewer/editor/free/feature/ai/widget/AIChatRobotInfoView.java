package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.d2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: AIChatRobotInfoView.kt */
/* loaded from: classes3.dex */
public final class AIChatRobotInfoView extends BaseBindingFrameLayout<d2> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AIChatRobotInfoView(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "VNgAZDEO"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final d2 a(LayoutInflater from) {
        kotlin.jvm.internal.g.e(from, "from");
        View inflate = from.inflate(R.layout.layout_ai_chat_robot_info, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i10 = R.id.lottie_robot_info;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.lottie_robot_info);
        if (lottieAnimationView != null) {
            i10 = R.id.tv_ai_info1;
            if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_info1)) != null) {
                i10 = R.id.tv_ai_info2;
                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_info2)) != null) {
                    d2 d2Var = new d2(constraintLayout, lottieAnimationView);
                    ea.a.p("Jm5XbBh0Uig8ciVtWSAcaFxzQiAxchBlKQ==", "rym2krlO");
                    return d2Var;
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpH2hhSQI6IA==", "kAFV9Y5M").concat(inflate.getResources().getResourceName(i10)));
    }

    public final void c(int i10, boolean z10) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        LottieAnimationView lottieAnimationView3;
        LottieAnimationView lottieAnimationView4;
        LottieAnimationView lottieAnimationView5;
        switch (i10) {
            case OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD /* 600 */:
                d2 d2Var = (d2) this.f24761a;
                if (d2Var != null && (lottieAnimationView3 = d2Var.f814b) != null) {
                    lottieAnimationView3.setAnimation(R.raw.robot_smile);
                    break;
                }
                break;
            case 601:
            case 602:
                d2 d2Var2 = (d2) this.f24761a;
                if (d2Var2 != null && (lottieAnimationView4 = d2Var2.f814b) != null) {
                    lottieAnimationView4.setAnimation(R.raw.robot_think);
                    break;
                }
                break;
            case 603:
                d2 d2Var3 = (d2) this.f24761a;
                if (d2Var3 != null && (lottieAnimationView5 = d2Var3.f814b) != null) {
                    lottieAnimationView5.setAnimation(R.raw.robot_happy);
                    break;
                }
                break;
        }
        if (z10) {
            d2 d2Var4 = (d2) this.f24761a;
            if (d2Var4 != null && (lottieAnimationView2 = d2Var4.f814b) != null) {
                lottieAnimationView2.j();
                return;
            }
            return;
        }
        d2 d2Var5 = (d2) this.f24761a;
        if (d2Var5 != null) {
            lottieAnimationView = d2Var5.f814b;
        } else {
            lottieAnimationView = null;
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.setProgress(1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d2 d2Var;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        super.onDetachedFromWindow();
        d2 d2Var2 = (d2) this.f24761a;
        boolean z10 = false;
        if (d2Var2 != null && (lottieAnimationView2 = d2Var2.f814b) != null && lottieAnimationView2.h()) {
            z10 = true;
        }
        if (z10 && (d2Var = (d2) this.f24761a) != null && (lottieAnimationView = d2Var.f814b) != null) {
            lottieAnimationView.d();
        }
    }

    public final void setFrom(int i10) {
        c(i10, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AIChatRobotInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "uUQKFQje"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIChatRobotInfoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "pZ4FJQb1"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(Context context) {
    }
}
