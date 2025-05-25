package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.ViewTreeObserver;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;

/* compiled from: AIExperienceActivity.kt */
/* loaded from: classes3.dex */
public final class e0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AIExperienceActivity f24577a;

    public e0(AIExperienceActivity aIExperienceActivity) {
        this.f24577a = aIExperienceActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AIExperienceActivity.a aVar = AIExperienceActivity.L;
        AIExperienceActivity aIExperienceActivity = this.f24577a;
        if (aIExperienceActivity.d2().f728g.getWidth() > 0) {
            aIExperienceActivity.d2().f728g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            aIExperienceActivity.getClass();
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(0.1f, 1.0f);
            Keyframe ofFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(aIExperienceActivity.d2().f732k, PropertyValuesHolder.ofKeyframe(ea.a.p("PGNQbBxY", "338ibYCZ"), ofFloat, ofFloat2, ofFloat3), PropertyValuesHolder.ofKeyframe(ea.a.p("O2MKbCdZ", "VZHkBGeE"), ofFloat, ofFloat2, ofFloat3));
            kotlin.jvm.internal.g.d(ofPropertyValuesHolder, ea.a.p("XGYbchxwB3IGeWJhBXUzcwxvXmQjcmtip4D2LEt1RGVBSC5hF2UQUxFhWGUwSDlsIGVAKQ==", "EPk7JVSn"));
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(aIExperienceActivity)) {
                aIExperienceActivity.d2().f728g.setPivotX(0.0f);
                aIExperienceActivity.d2().f728g.setPivotY(0.0f);
            } else {
                aIExperienceActivity.d2().f728g.setPivotX(aIExperienceActivity.d2().f728g.getWidth());
                aIExperienceActivity.d2().f728g.setPivotY(0.0f);
            }
            aIExperienceActivity.d2().f728g.setPivotY(0.0f);
            Keyframe ofFloat4 = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat5 = Keyframe.ofFloat(0.1f, 0.0f);
            Keyframe ofFloat6 = Keyframe.ofFloat(0.3f, 1.05f);
            Keyframe ofFloat7 = Keyframe.ofFloat(0.5f, 0.95f);
            Keyframe ofFloat8 = Keyframe.ofFloat(0.7f, 1.0f);
            Keyframe ofFloat9 = Keyframe.ofFloat(1.0f, 1.0f);
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(aIExperienceActivity.d2().f728g, PropertyValuesHolder.ofKeyframe(ea.a.p("B2MpbABY", "G3tHesvt"), ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9), PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZZ", "Ss3mB1rk"), ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9), PropertyValuesHolder.ofKeyframe(ea.a.p("LWxJaGE=", "TeL9ULUF"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, 0.0f), Keyframe.ofFloat(0.3f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)));
            kotlin.jvm.internal.g.d(ofPropertyValuesHolder2, ea.a.p("XGYbchxwB3IGeWJhBXUzcwxvXmQjcmtipoDxZC1yQCBadC5tNWkOZTNsRGgISDlsIGVAKQ==", "DWHl86sa"));
            ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(aIExperienceActivity.d2().f724b, PropertyValuesHolder.ofKeyframe(ea.a.p("O3JQbgpsVnQzbyRZ", "B3l2fsOh"), Keyframe.ofFloat(0.0f, aIExperienceActivity.d2().f724b.getTranslationY()), Keyframe.ofFloat(0.6f, aIExperienceActivity.d2().f724b.getTranslationY()), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofKeyframe(ea.a.p("LmxBaGE=", "pXXzrYkX"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.7f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f)));
            kotlin.jvm.internal.g.d(ofPropertyValuesHolder3, ea.a.p("IGZhchZwUnIueRxhGXUNc31vAmQgck1ijYDrbANlFyxvdFBnL2lSdxtsOmgUSAdsUWUcKQ==", "ftRAoMge"));
            AnimatorSet animatorSet = new AnimatorSet();
            aIExperienceActivity.F = animatorSet;
            animatorSet.setDuration(2000L);
            AnimatorSet animatorSet2 = aIExperienceActivity.F;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, ofPropertyValuesHolder3);
            }
            AnimatorSet animatorSet3 = aIExperienceActivity.F;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new b0(aIExperienceActivity));
            }
            AnimatorSet animatorSet4 = aIExperienceActivity.F;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
    }
}
