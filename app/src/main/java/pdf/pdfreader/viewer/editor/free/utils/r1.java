package pdf.pdfreader.viewer.editor.free.utils;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: ViewShakeUtil.java */
/* loaded from: classes3.dex */
public final class r1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f28754a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f28755b;

    public r1(View view, int i10) {
        this.f28754a = view;
        this.f28755b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            this.f28754a.setTranslationY(((Float) animatedValue).floatValue() * this.f28755b);
        }
    }
}
