package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.f2;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* loaded from: classes3.dex */
public class AIHistoryGuideView extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final f2 f24740q;

    /* renamed from: r  reason: collision with root package name */
    public l0 f24741r;

    public AIHistoryGuideView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        f2 f2Var = this.f24740q;
        if (f2Var == null) {
            return;
        }
        if (i10 == 0) {
            f2Var.f899f.j();
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
            scaleAnimation.setDuration(300L);
            scaleAnimation.setFillAfter(true);
            f2Var.f901h.startAnimation(scaleAnimation);
            return;
        }
        f2Var.f899f.i();
    }

    public void setOnFakerClickListener(l0 l0Var) {
        this.f24741r = l0Var;
    }

    public AIHistoryGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AIHistoryGuideView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_ai_history_guide, this);
        int i11 = R.id.ai_history_pop_lottie_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_history_pop_lottie_view);
        if (lottieAnimationView != null) {
            i11 = R.id.ai_history_v_faker_click;
            View u7 = com.google.android.play.core.assetpacks.c.u(this, R.id.ai_history_v_faker_click);
            if (u7 != null) {
                i11 = R.id.ai_pop_tv_content;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_pop_tv_content);
                if (textView != null) {
                    i11 = R.id.v_ai_guide_line_bottom;
                    View u10 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_bottom);
                    if (u10 != null) {
                        i11 = R.id.v_ai_guide_line_end;
                        View u11 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_end);
                        if (u11 != null) {
                            i11 = R.id.v_ai_guide_line_start;
                            View u12 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_start);
                            if (u12 != null) {
                                i11 = R.id.v_ai_guide_line_top;
                                View u13 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_top);
                                if (u13 != null) {
                                    this.f24740q = new f2(this, lottieAnimationView, u7, textView, u10, u11, u12, u13);
                                    String content = context.getString(R.string.arg_res_0x7f1300a3, "");
                                    kotlin.jvm.internal.g.e(content, "content");
                                    SpannableString spannableString = new SpannableString(content.concat(" "));
                                    spannableString.setSpan(new so.b(context, R.drawable.ic_emoji_smile), spannableString.length() - 1, spannableString.length(), 33);
                                    textView.setText(spannableString);
                                    if (a0.i(context)) {
                                        lottieAnimationView.setRotationY(180.0f);
                                    } else {
                                        lottieAnimationView.setRotationY(0.0f);
                                    }
                                    u7.setOnClickListener(new e(this));
                                    lottieAnimationView.c(new f(this));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpQWhsSS06IA==", "5Lirvm4H").concat(getResources().getResourceName(i11)));
    }
}
