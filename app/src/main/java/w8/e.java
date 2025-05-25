package w8;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: FadeThroughUpdateListener.java */
/* loaded from: classes2.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f31000a;

    /* renamed from: b  reason: collision with root package name */
    public final View f31001b;
    public final float[] c = new float[2];

    public e(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.f31000a = actionMenuView;
        this.f31001b = actionMenuView2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i10 = (floatValue > 0.5f ? 1 : (floatValue == 0.5f ? 0 : -1));
        float[] fArr = this.c;
        if (i10 <= 0) {
            fArr[0] = 1.0f - (floatValue * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (floatValue * 2.0f) - 1.0f;
        }
        View view = this.f31000a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.f31001b;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
