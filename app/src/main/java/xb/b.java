package xb;

import android.animation.ValueAnimator;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* compiled from: SmartRefreshLayout.java */
/* loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f31634a;

    public b(SmartRefreshLayout smartRefreshLayout) {
        this.f31634a = smartRefreshLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f31634a.f15943v0.b(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
    }
}
