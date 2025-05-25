package n8;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22343a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22344b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f22343a = i10;
        this.f22344b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Point point;
        int i10 = this.f22343a;
        boolean z10 = false;
        Object obj = this.f22344b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f22355j.setAlpha((int) (255.0f * floatValue));
                cVar.f22369x = floatValue;
                return;
            case 1:
                AIExperienceActivity aIExperienceActivity = (AIExperienceActivity) obj;
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                g.e(aIExperienceActivity, ea.a.p("O2hYc10w", "KorRPfvl"));
                g.e(valueAnimator, ea.a.p("Um4ibRJ0C29u", "5bsi882o"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity)) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIW5LbjxsGSA7eUFlWWtYdDZpJC4zbAdhdA==", "f8ERNfIu"));
                    if (((Float) animatedValue).floatValue() == 0.0f) {
                        z10 = true;
                    }
                    if (z10 && aIExperienceActivity.d2().f724b.getVisibility() != 8) {
                        aIExperienceActivity.d2().f724b.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                OfficeAIReaderActivity officeAIReaderActivity = (OfficeAIReaderActivity) obj;
                String str = OfficeAIReaderActivity.K0;
                g.e(officeAIReaderActivity, ea.a.p("F2g_c0sw", "yMcVotOq"));
                g.e(valueAnimator, ea.a.p("Jm4ibRJ0UG9u", "8QGKs9Og"));
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                g.c(animatedValue2, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGG5abjlsDyA7eUFlWWtYdDZpJC4zbAdhdA==", "l8h1wwLc"));
                float floatValue2 = ((Float) animatedValue2).floatValue();
                ConstraintLayout constraintLayout = officeAIReaderActivity.f24447p0;
                if (constraintLayout != null) {
                    layoutParams = constraintLayout.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = -((int) (officeAIReaderActivity.F0 * floatValue2));
                }
                ConstraintLayout constraintLayout2 = officeAIReaderActivity.f24447p0;
                if (constraintLayout2 != null) {
                    constraintLayout2.setLayoutParams(marginLayoutParams);
                }
                if (officeAIReaderActivity.H0 != null) {
                    LinearLayout linearLayout = officeAIReaderActivity.D;
                    if (linearLayout != null) {
                        linearLayout.setPadding((int) (point.x * floatValue2), (int) (point.y * floatValue2), 0, 0);
                        return;
                    } else {
                        g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "TZL0vcIy"));
                        throw null;
                    }
                }
                return;
        }
    }
}
