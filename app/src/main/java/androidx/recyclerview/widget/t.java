package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.r;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.f f4599a;

    public t(r.f fVar) {
        this.f4599a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4599a.f4596m = valueAnimator.getAnimatedFraction();
    }
}
