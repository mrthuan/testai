package xb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.MotionEvent;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;

/* compiled from: SmartRefreshLayout.java */
/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f31640b;
    public final /* synthetic */ boolean c;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f31642e;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f31641d = true;

    /* renamed from: a  reason: collision with root package name */
    public int f31639a = 0;

    /* compiled from: SmartRefreshLayout.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f31643a;

        /* compiled from: SmartRefreshLayout.java */
        /* renamed from: xb.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0408a extends AnimatorListenerAdapter {
            public C0408a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (animator != null && animator.getDuration() == 0) {
                    return;
                }
                a aVar = a.this;
                d dVar = d.this;
                SmartRefreshLayout smartRefreshLayout = dVar.f31642e;
                smartRefreshLayout.B0 = false;
                if (dVar.c) {
                    smartRefreshLayout.u(true);
                }
                SmartRefreshLayout smartRefreshLayout2 = d.this.f31642e;
                if (smartRefreshLayout2.f15945w0 == RefreshState.LoadFinish) {
                    smartRefreshLayout2.s(RefreshState.None);
                }
            }
        }

        public a(int i10) {
            this.f31643a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ec.a aVar;
            ValueAnimator valueAnimator;
            d dVar = d.this;
            SmartRefreshLayout smartRefreshLayout = dVar.f31642e;
            if (smartRefreshLayout.N && this.f31643a < 0) {
                aVar = smartRefreshLayout.f15937s0.e(smartRefreshLayout.f15903b);
                if (aVar != null) {
                    aVar.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                }
            } else {
                aVar = null;
            }
            C0408a c0408a = new C0408a();
            SmartRefreshLayout smartRefreshLayout2 = dVar.f31642e;
            int i10 = smartRefreshLayout2.f15903b;
            SmartRefreshLayout.h hVar = smartRefreshLayout2.f15943v0;
            if (i10 > 0) {
                valueAnimator = hVar.a(0);
            } else {
                if (aVar == null && i10 != 0) {
                    if (dVar.c && smartRefreshLayout2.H) {
                        int i11 = -smartRefreshLayout2.f15915h0;
                        if (i10 >= i11) {
                            smartRefreshLayout2.s(RefreshState.None);
                        } else {
                            valueAnimator = hVar.a(i11);
                        }
                    } else {
                        valueAnimator = hVar.a(0);
                    }
                } else {
                    ValueAnimator valueAnimator2 = smartRefreshLayout2.F0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setDuration(0L);
                        smartRefreshLayout2.F0.cancel();
                        smartRefreshLayout2.F0 = null;
                    }
                    smartRefreshLayout2.f15943v0.b(0, false);
                    smartRefreshLayout2.f15943v0.d(RefreshState.None);
                }
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                valueAnimator.addListener(c0408a);
            } else {
                c0408a.onAnimationEnd(null);
            }
        }
    }

    public d(SmartRefreshLayout smartRefreshLayout, int i10, boolean z10) {
        this.f31642e = smartRefreshLayout;
        this.f31640b = i10;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12 = this.f31639a;
        long j10 = 0;
        boolean z10 = this.c;
        boolean z11 = true;
        SmartRefreshLayout smartRefreshLayout = this.f31642e;
        if (i12 == 0) {
            RefreshState refreshState = smartRefreshLayout.f15945w0;
            RefreshState refreshState2 = RefreshState.None;
            if (refreshState == refreshState2 && smartRefreshLayout.f15947x0 == RefreshState.Loading) {
                smartRefreshLayout.f15947x0 = refreshState2;
            } else {
                ValueAnimator valueAnimator = smartRefreshLayout.F0;
                if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                    valueAnimator.setDuration(0L);
                    smartRefreshLayout.F0.cancel();
                    smartRefreshLayout.F0 = null;
                    if (smartRefreshLayout.f15943v0.a(0) == null) {
                        smartRefreshLayout.s(refreshState2);
                    } else {
                        smartRefreshLayout.s(RefreshState.PullUpCanceled);
                    }
                } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f15935r0 != null && smartRefreshLayout.f15937s0 != null) {
                    this.f31639a = i12 + 1;
                    smartRefreshLayout.f15941u0.postDelayed(this, this.f31640b);
                    smartRefreshLayout.s(RefreshState.LoadFinish);
                    return;
                }
            }
            if (z10) {
                smartRefreshLayout.u(true);
                return;
            }
            return;
        }
        int i13 = smartRefreshLayout.f15935r0.i(smartRefreshLayout, this.f31641d);
        if (i13 < Integer.MAX_VALUE) {
            if (!z10 || !smartRefreshLayout.H || smartRefreshLayout.f15903b >= 0 || !smartRefreshLayout.f15937s0.a()) {
                z11 = false;
            }
            int i14 = smartRefreshLayout.f15903b;
            if (z11) {
                i10 = Math.max(i14, -smartRefreshLayout.f15915h0);
            } else {
                i10 = 0;
            }
            int i15 = i14 - i10;
            if (smartRefreshLayout.f15926n || smartRefreshLayout.f15904b0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (smartRefreshLayout.f15926n) {
                    float f10 = smartRefreshLayout.f15920k;
                    smartRefreshLayout.f15916i = f10;
                    smartRefreshLayout.f15906d = smartRefreshLayout.f15903b - i15;
                    smartRefreshLayout.f15926n = false;
                    if (smartRefreshLayout.G) {
                        i11 = i15;
                    } else {
                        i11 = 0;
                    }
                    float f11 = i11;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, smartRefreshLayout.f15918j, f10 + f11 + (smartRefreshLayout.f15901a * 2), 0));
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, smartRefreshLayout.f15918j, smartRefreshLayout.f15920k + f11, 0));
                }
                if (smartRefreshLayout.f15904b0) {
                    smartRefreshLayout.f15902a0 = 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, smartRefreshLayout.f15918j, smartRefreshLayout.f15920k, 0));
                    smartRefreshLayout.f15904b0 = false;
                    smartRefreshLayout.f15906d = 0;
                }
            }
            Handler handler = smartRefreshLayout.f15941u0;
            a aVar = new a(i15);
            if (smartRefreshLayout.f15903b < 0) {
                j10 = i13;
            }
            handler.postDelayed(aVar, j10);
        }
    }
}
