package xb;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;

/* compiled from: SmartRefreshLayout.java */
/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f31636b;
    public final /* synthetic */ Boolean c;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f31638e;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f31637d = true;

    /* renamed from: a  reason: collision with root package name */
    public int f31635a = 0;

    public c(SmartRefreshLayout smartRefreshLayout, int i10, Boolean bool) {
        this.f31638e = smartRefreshLayout;
        this.f31636b = i10;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f31635a;
        ec.a aVar = null;
        SmartRefreshLayout smartRefreshLayout = this.f31638e;
        if (i10 == 0) {
            RefreshState refreshState = smartRefreshLayout.f15945w0;
            RefreshState refreshState2 = RefreshState.None;
            Boolean bool = this.c;
            if (refreshState == refreshState2 && smartRefreshLayout.f15947x0 == RefreshState.Refreshing) {
                smartRefreshLayout.f15947x0 = refreshState2;
            } else {
                ValueAnimator valueAnimator = smartRefreshLayout.F0;
                if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                    valueAnimator.setDuration(0L);
                    smartRefreshLayout.F0.cancel();
                    smartRefreshLayout.F0 = null;
                    if (smartRefreshLayout.f15943v0.a(0) == null) {
                        smartRefreshLayout.s(refreshState2);
                    } else {
                        smartRefreshLayout.s(RefreshState.PullDownCanceled);
                    }
                } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.f15933q0 != null && smartRefreshLayout.f15937s0 != null) {
                    this.f31635a = i10 + 1;
                    smartRefreshLayout.f15941u0.postDelayed(this, this.f31636b);
                    smartRefreshLayout.s(RefreshState.RefreshFinish);
                    if (bool == Boolean.FALSE) {
                        smartRefreshLayout.u(false);
                    }
                }
            }
            if (bool == Boolean.TRUE) {
                smartRefreshLayout.u(true);
                return;
            }
            return;
        }
        int i11 = smartRefreshLayout.f15933q0.i(smartRefreshLayout, this.f31637d);
        if (i11 < Integer.MAX_VALUE) {
            if (smartRefreshLayout.f15926n || smartRefreshLayout.f15904b0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (smartRefreshLayout.f15926n) {
                    float f10 = smartRefreshLayout.f15920k;
                    smartRefreshLayout.f15916i = f10;
                    smartRefreshLayout.f15906d = 0;
                    smartRefreshLayout.f15926n = false;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, smartRefreshLayout.f15918j, (f10 + smartRefreshLayout.f15903b) - (smartRefreshLayout.f15901a * 2), 0));
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, smartRefreshLayout.f15918j, smartRefreshLayout.f15920k + smartRefreshLayout.f15903b, 0));
                }
                if (smartRefreshLayout.f15904b0) {
                    smartRefreshLayout.f15902a0 = 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, smartRefreshLayout.f15918j, smartRefreshLayout.f15920k, 0));
                    smartRefreshLayout.f15904b0 = false;
                    smartRefreshLayout.f15906d = 0;
                }
            }
            int i12 = smartRefreshLayout.f15903b;
            int i13 = smartRefreshLayout.f15910f;
            dc.b bVar = smartRefreshLayout.f15950z;
            if (i12 > 0) {
                ValueAnimator g10 = smartRefreshLayout.g(0, i11, i13, bVar);
                if (smartRefreshLayout.O) {
                    aVar = smartRefreshLayout.f15937s0.e(smartRefreshLayout.f15903b);
                }
                if (g10 != null && aVar != null) {
                    g10.addUpdateListener(aVar);
                }
            } else if (i12 < 0) {
                smartRefreshLayout.g(0, i11, i13, bVar);
            } else {
                SmartRefreshLayout.h hVar = smartRefreshLayout.f15943v0;
                hVar.b(0, false);
                hVar.d(RefreshState.None);
            }
        }
    }
}
