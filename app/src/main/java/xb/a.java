package xb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;

/* compiled from: SmartRefreshLayout.java */
/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f31633a;

    public a(SmartRefreshLayout smartRefreshLayout) {
        this.f31633a = smartRefreshLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RefreshState refreshState;
        RefreshState refreshState2;
        if (animator != null && animator.getDuration() == 0) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f31633a;
        smartRefreshLayout.F0 = null;
        if (smartRefreshLayout.f15903b == 0 && (refreshState = smartRefreshLayout.f15945w0) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
            smartRefreshLayout.s(refreshState2);
            return;
        }
        RefreshState refreshState3 = smartRefreshLayout.f15945w0;
        if (refreshState3 != smartRefreshLayout.f15947x0) {
            smartRefreshLayout.setViceState(refreshState3);
        }
    }
}
