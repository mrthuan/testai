package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.a1;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24783a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24784b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f24783a = i10;
        this.f24784b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        cg.a<tf.d> aVar;
        int[] iArr;
        int i18 = this.f24783a;
        Object obj = this.f24784b;
        switch (i18) {
            case 0:
                TypingTextView typingTextView = (TypingTextView) obj;
                int i19 = TypingTextView.f24762k;
                kotlin.jvm.internal.g.e(typingTextView, ea.a.p("R2gic1cw", "YSBTl6A3"));
                if (i13 - i11 != i17 - i15 && (aVar = typingTextView.f24765j) != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 1:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj;
                int i20 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("O2hYc10w", "PyxCDcde"));
                if (view != null && view.getMeasuredWidth() > 0 && !kotlin.jvm.internal.g.a(view.getTag(), Integer.valueOf(view.getMeasuredWidth()))) {
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("RS4obx10B3h0", "EkA351NB"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        iArr = new int[]{-508717, -93336, -7271};
                    } else {
                        iArr = new int[]{-7271, -93336, -508717};
                    }
                    subscriptionBlackFridayActivity.C2().f1500o.getPaint().setShader(new LinearGradient(0.0f, 0.0f, view.getMeasuredWidth(), 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP));
                    view.invalidate();
                    view.setTag(Integer.valueOf(view.getMeasuredWidth()));
                    return;
                }
                return;
            default:
                SettingFragment settingFragment = (SettingFragment) obj;
                SettingFragment.a aVar2 = SettingFragment.f27957u0;
                kotlin.jvm.internal.g.e(settingFragment, ea.a.p("R2gic1cw", "5VP8Q8pu"));
                if (view.getMeasuredWidth() != settingFragment.y0().f711n.getMeasuredWidth()) {
                    a1 y02 = settingFragment.y0();
                    String p10 = ea.a.p("UWklZBpuBS4BdVZzCnI_YiFMXXQyaWU=", "jkX75A6m");
                    LottieAnimationView lottieAnimationView = y02.f711n;
                    kotlin.jvm.internal.g.d(lottieAnimationView, p10);
                    ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                        ((ViewGroup.MarginLayoutParams) bVar).width = view.getWidth();
                        lottieAnimationView.setLayoutParams(bVar);
                        return;
                    }
                    throw new NullPointerException(ea.a.p("X3UHbE9jFG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBFeRtlT2EbZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsd1hkDGUbLjZvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyUG1z", "d91kougu"));
                }
                return;
        }
    }
}
