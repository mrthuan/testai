package com.scwang.smart.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.LinkedList;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import x0.f0;
import x0.n0;
import x0.o;
import x0.p;
import x0.s;
import x0.t;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public class SmartRefreshLayout extends ViewGroup implements yb.e, s {
    public static final ViewGroup.MarginLayoutParams G0 = new ViewGroup.MarginLayoutParams(-1, -1);
    public final int[] A;
    public int A0;
    public boolean B;
    public boolean B0;
    public boolean C;
    public boolean C0;
    public final boolean D;
    public MotionEvent D0;
    public final boolean E;
    public Runnable E0;
    public final boolean F;
    public ValueAnimator F0;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public boolean Q;
    public final boolean R;
    public final boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public bc.e W;

    /* renamed from: a  reason: collision with root package name */
    public final int f15901a;

    /* renamed from: a0  reason: collision with root package name */
    public int f15902a0;

    /* renamed from: b  reason: collision with root package name */
    public int f15903b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f15904b0;
    public int c;

    /* renamed from: c0  reason: collision with root package name */
    public final int[] f15905c0;

    /* renamed from: d  reason: collision with root package name */
    public int f15906d;

    /* renamed from: d0  reason: collision with root package name */
    public final p f15907d0;

    /* renamed from: e  reason: collision with root package name */
    public final int f15908e;

    /* renamed from: e0  reason: collision with root package name */
    public final t f15909e0;

    /* renamed from: f  reason: collision with root package name */
    public final int f15910f;

    /* renamed from: f0  reason: collision with root package name */
    public int f15911f0;

    /* renamed from: g  reason: collision with root package name */
    public final int f15912g;

    /* renamed from: g0  reason: collision with root package name */
    public zb.a f15913g0;

    /* renamed from: h  reason: collision with root package name */
    public float f15914h;

    /* renamed from: h0  reason: collision with root package name */
    public int f15915h0;

    /* renamed from: i  reason: collision with root package name */
    public float f15916i;

    /* renamed from: i0  reason: collision with root package name */
    public zb.a f15917i0;

    /* renamed from: j  reason: collision with root package name */
    public float f15918j;

    /* renamed from: j0  reason: collision with root package name */
    public final int f15919j0;

    /* renamed from: k  reason: collision with root package name */
    public float f15920k;

    /* renamed from: k0  reason: collision with root package name */
    public final int f15921k0;

    /* renamed from: l  reason: collision with root package name */
    public final float f15922l;

    /* renamed from: l0  reason: collision with root package name */
    public final float f15923l0;

    /* renamed from: m  reason: collision with root package name */
    public char f15924m;

    /* renamed from: m0  reason: collision with root package name */
    public final float f15925m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15926n;

    /* renamed from: n0  reason: collision with root package name */
    public final float f15927n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15928o;

    /* renamed from: o0  reason: collision with root package name */
    public final float f15929o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15930p;

    /* renamed from: p0  reason: collision with root package name */
    public final float f15931p0;

    /* renamed from: q  reason: collision with root package name */
    public final int f15932q;

    /* renamed from: q0  reason: collision with root package name */
    public yb.c f15933q0;

    /* renamed from: r  reason: collision with root package name */
    public final int f15934r;

    /* renamed from: r0  reason: collision with root package name */
    public yb.b f15935r0;

    /* renamed from: s  reason: collision with root package name */
    public final int f15936s;

    /* renamed from: s0  reason: collision with root package name */
    public ec.a f15937s0;

    /* renamed from: t  reason: collision with root package name */
    public final int f15938t;

    /* renamed from: t0  reason: collision with root package name */
    public Paint f15939t0;

    /* renamed from: u  reason: collision with root package name */
    public final int f15940u;

    /* renamed from: u0  reason: collision with root package name */
    public final Handler f15941u0;

    /* renamed from: v  reason: collision with root package name */
    public final int f15942v;

    /* renamed from: v0  reason: collision with root package name */
    public final h f15943v0;

    /* renamed from: w  reason: collision with root package name */
    public int f15944w;

    /* renamed from: w0  reason: collision with root package name */
    public RefreshState f15945w0;

    /* renamed from: x  reason: collision with root package name */
    public final Scroller f15946x;

    /* renamed from: x0  reason: collision with root package name */
    public RefreshState f15947x0;

    /* renamed from: y  reason: collision with root package name */
    public final VelocityTracker f15948y;

    /* renamed from: y0  reason: collision with root package name */
    public long f15949y0;

    /* renamed from: z  reason: collision with root package name */
    public final dc.b f15950z;

    /* renamed from: z0  reason: collision with root package name */
    public int f15951z0;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15952a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f15952a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15952a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15952a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15952a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15952a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15952a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15952a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15952a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15952a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15952a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15952a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15952a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f15953a;

        public b(boolean z10) {
            this.f15953a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (animator != null && animator.getDuration() == 0) {
                return;
            }
            SmartRefreshLayout.this.setStateDirectLoading(this.f15953a);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f15955a;

        public c(boolean z10) {
            this.f15955a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (animator != null && animator.getDuration() == 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.f15949y0 = currentTimeMillis;
            smartRefreshLayout.s(RefreshState.Refreshing);
            bc.e eVar = smartRefreshLayout.W;
            boolean z10 = false;
            if (eVar != null) {
                if (this.f15955a) {
                    pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.this;
                    if (aVar.f28012r0) {
                        aVar.f28012r0 = false;
                        tn.a.d(aVar.i(), ea.a.p("OW8YZQ==", "f7Quj1UK"), ea.a.p("W28mZSxyB2YAZUdo", "aCD8JtRk"), aj.b.t(aVar.f28014t0), false);
                        wk.b.b().e(new qo.d());
                        u i10 = aVar.i();
                        if (!BillingConfigImpl.c.w() && i10 != null && !dl.a.a(i10)) {
                            u i11 = aVar.i();
                            if ((i11 instanceof ReaderHomeActivity) && ((ReaderHomeActivity) i11).U.size() > 0) {
                                z10 = true;
                            }
                            if (z10) {
                                gl.e.f17918a.getClass();
                                gl.e.d();
                            }
                        }
                    }
                }
            } else {
                smartRefreshLayout.f15941u0.postDelayed(new xb.c(smartRefreshLayout, 0, Boolean.FALSE), 3000);
            }
            yb.c cVar = smartRefreshLayout.f15933q0;
            if (cVar != null) {
                float f10 = smartRefreshLayout.f15923l0;
                if (f10 < 10.0f) {
                    f10 *= smartRefreshLayout.f15911f0;
                }
                cVar.e(smartRefreshLayout, smartRefreshLayout.f15911f0, (int) f10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.getClass();
            smartRefreshLayout.f15941u0.postDelayed(new xb.d(smartRefreshLayout, 0, false), (long) AdError.SERVER_ERROR_CODE);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final int f15959b;

        /* renamed from: e  reason: collision with root package name */
        public float f15961e;

        /* renamed from: a  reason: collision with root package name */
        public int f15958a = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f15960d = 0.0f;
        public long c = AnimationUtils.currentAnimationTimeMillis();

        public e(float f10, int i10) {
            this.f15961e = f10;
            this.f15959b = i10;
            SmartRefreshLayout.this.f15941u0.postDelayed(this, 10);
            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            h hVar = SmartRefreshLayout.this.f15943v0;
            if (i11 > 0) {
                hVar.d(RefreshState.PullDownToRefresh);
            } else {
                hVar.d(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            int i12;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.E0 == this && !smartRefreshLayout.f15945w0.isFinishing) {
                int abs = Math.abs(smartRefreshLayout.f15903b);
                int i13 = this.f15959b;
                if (abs >= Math.abs(i13)) {
                    if (i13 != 0) {
                        double d10 = this.f15961e;
                        this.f15958a = this.f15958a + 1;
                        this.f15961e = (float) (Math.pow(0.44999998807907104d, i12 * 2) * d10);
                    } else {
                        double d11 = this.f15961e;
                        this.f15958a = this.f15958a + 1;
                        this.f15961e = (float) (Math.pow(0.8500000238418579d, i11 * 2) * d11);
                    }
                } else {
                    double d12 = this.f15961e;
                    this.f15958a = this.f15958a + 1;
                    this.f15961e = (float) (Math.pow(0.949999988079071d, i10 * 2) * d12);
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f10 = this.f15961e * ((((float) (currentAnimationTimeMillis - this.c)) * 1.0f) / 1000.0f);
                if (Math.abs(f10) >= 1.0f) {
                    this.c = currentAnimationTimeMillis;
                    float f11 = this.f15960d + f10;
                    this.f15960d = f11;
                    smartRefreshLayout.r(f11);
                    smartRefreshLayout.f15941u0.postDelayed(this, 10);
                    return;
                }
                RefreshState refreshState = smartRefreshLayout.f15947x0;
                boolean z10 = refreshState.isDragging;
                h hVar = smartRefreshLayout.f15943v0;
                if (z10 && refreshState.isHeader) {
                    hVar.d(RefreshState.PullDownCanceled);
                } else if (z10 && refreshState.isFooter) {
                    hVar.d(RefreshState.PullUpCanceled);
                }
                smartRefreshLayout.E0 = null;
                if (Math.abs(smartRefreshLayout.f15903b) >= Math.abs(i13)) {
                    smartRefreshLayout.g(i13, 0, Math.min(Math.max((int) (Math.abs(smartRefreshLayout.f15903b - i13) / dc.b.f16186a), 30), 100) * 10, smartRefreshLayout.f15950z);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f15963a;

        /* renamed from: b  reason: collision with root package name */
        public float f15964b;
        public long c = 0;

        /* renamed from: d  reason: collision with root package name */
        public long f15965d = AnimationUtils.currentAnimationTimeMillis();

        public f(float f10) {
            this.f15964b = f10;
            this.f15963a = SmartRefreshLayout.this.f15903b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.E0 == this && !smartRefreshLayout.f15945w0.isFinishing) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float pow = (float) (Math.pow(0.98f, ((float) (currentAnimationTimeMillis - this.c)) / (1000.0f / 10)) * this.f15964b);
                this.f15964b = pow;
                float b10 = r.b((float) (currentAnimationTimeMillis - this.f15965d), 1.0f, 1000.0f, pow);
                if (Math.abs(b10) > 1.0f) {
                    this.f15965d = currentAnimationTimeMillis;
                    int i10 = (int) (this.f15963a + b10);
                    this.f15963a = i10;
                    int i11 = smartRefreshLayout.f15903b * i10;
                    h hVar = smartRefreshLayout.f15943v0;
                    if (i11 > 0) {
                        hVar.b(i10, true);
                        smartRefreshLayout.f15941u0.postDelayed(this, 10);
                        return;
                    }
                    smartRefreshLayout.E0 = null;
                    hVar.b(0, true);
                    View view = smartRefreshLayout.f15937s0.c;
                    int i12 = (int) (-this.f15964b);
                    float f10 = dc.b.f16186a;
                    if (view instanceof ScrollView) {
                        ((ScrollView) view).fling(i12);
                    } else if (view instanceof AbsListView) {
                        ((AbsListView) view).fling(i12);
                    } else if (view instanceof WebView) {
                        ((WebView) view).flingScroll(0, i12);
                    } else if (view instanceof NestedScrollView) {
                        ((NestedScrollView) view).e(i12);
                    } else if (view instanceof RecyclerView) {
                        ((RecyclerView) view).S(0, i12);
                    }
                    if (smartRefreshLayout.B0 && b10 > 0.0f) {
                        smartRefreshLayout.B0 = false;
                        return;
                    }
                    return;
                }
                smartRefreshLayout.E0 = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements yb.d {
        public h() {
        }

        public final ValueAnimator a(int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.g(i10, 0, smartRefreshLayout.f15910f, smartRefreshLayout.f15950z);
        }

        /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x02e1  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.scwang.smart.refresh.layout.SmartRefreshLayout.h b(int r21, boolean r22) {
            /*
                Method dump skipped, instructions count: 746
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.h.b(int, boolean):com.scwang.smart.refresh.layout.SmartRefreshLayout$h");
        }

        public final h c(yb.a aVar, int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f15939t0 == null && i10 != 0) {
                smartRefreshLayout.f15939t0 = new Paint();
            }
            if (aVar.equals(smartRefreshLayout.f15933q0)) {
                smartRefreshLayout.f15951z0 = i10;
            } else if (aVar.equals(smartRefreshLayout.f15935r0)) {
                smartRefreshLayout.A0 = i10;
            }
            return this;
        }

        public final void d(RefreshState refreshState) {
            int i10 = a.f15952a[refreshState.ordinal()];
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            switch (i10) {
                case 1:
                    RefreshState refreshState2 = smartRefreshLayout.f15945w0;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f15903b == 0) {
                        smartRefreshLayout.s(refreshState3);
                        return;
                    } else if (smartRefreshLayout.f15903b != 0) {
                        a(0);
                        return;
                    } else {
                        return;
                    }
                case 2:
                    if (!smartRefreshLayout.f15945w0.isOpening && smartRefreshLayout.p(smartRefreshLayout.B)) {
                        smartRefreshLayout.s(RefreshState.PullDownToRefresh);
                        return;
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownToRefresh);
                        return;
                    }
                case 3:
                    if (smartRefreshLayout.p(smartRefreshLayout.C)) {
                        RefreshState refreshState4 = smartRefreshLayout.f15945w0;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout.T || !smartRefreshLayout.H || !smartRefreshLayout.U)) {
                            smartRefreshLayout.s(RefreshState.PullUpToLoad);
                            return;
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.PullUpToLoad);
                    return;
                case 4:
                    if (!smartRefreshLayout.f15945w0.isOpening && smartRefreshLayout.p(smartRefreshLayout.B)) {
                        smartRefreshLayout.s(RefreshState.PullDownCanceled);
                        d(RefreshState.None);
                        return;
                    }
                    smartRefreshLayout.setViceState(RefreshState.PullDownCanceled);
                    return;
                case 5:
                    if (smartRefreshLayout.p(smartRefreshLayout.C) && !smartRefreshLayout.f15945w0.isOpening && (!smartRefreshLayout.T || !smartRefreshLayout.H || !smartRefreshLayout.U)) {
                        smartRefreshLayout.s(RefreshState.PullUpCanceled);
                        d(RefreshState.None);
                        return;
                    }
                    smartRefreshLayout.setViceState(RefreshState.PullUpCanceled);
                    return;
                case 6:
                    if (!smartRefreshLayout.f15945w0.isOpening && smartRefreshLayout.p(smartRefreshLayout.B)) {
                        smartRefreshLayout.s(RefreshState.ReleaseToRefresh);
                        return;
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToRefresh);
                        return;
                    }
                case 7:
                    if (smartRefreshLayout.p(smartRefreshLayout.C)) {
                        RefreshState refreshState5 = smartRefreshLayout.f15945w0;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout.T || !smartRefreshLayout.H || !smartRefreshLayout.U)) {
                            smartRefreshLayout.s(RefreshState.ReleaseToLoad);
                            return;
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.ReleaseToLoad);
                    return;
                case 8:
                    if (!smartRefreshLayout.f15945w0.isOpening && smartRefreshLayout.p(smartRefreshLayout.B)) {
                        smartRefreshLayout.s(RefreshState.ReleaseToTwoLevel);
                        return;
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToTwoLevel);
                        return;
                    }
                case 9:
                    if (!smartRefreshLayout.f15945w0.isOpening && smartRefreshLayout.p(smartRefreshLayout.B)) {
                        smartRefreshLayout.s(RefreshState.RefreshReleased);
                        return;
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.RefreshReleased);
                        return;
                    }
                case 10:
                    if (!smartRefreshLayout.f15945w0.isOpening && smartRefreshLayout.p(smartRefreshLayout.C)) {
                        smartRefreshLayout.s(RefreshState.LoadReleased);
                        return;
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.LoadReleased);
                        return;
                    }
                case 11:
                    smartRefreshLayout.setStateRefreshing(true);
                    return;
                case 12:
                    smartRefreshLayout.setStateLoading(true);
                    return;
                default:
                    smartRefreshLayout.s(refreshState);
                    return;
            }
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void computeScroll() {
        float currVelocity;
        RefreshState refreshState;
        Scroller scroller = this.f15946x;
        scroller.getCurrY();
        if (scroller.computeScrollOffset()) {
            int finalY = scroller.getFinalY();
            boolean z10 = this.K;
            if ((finalY < 0 && ((this.B || z10) && this.f15937s0.b())) || (finalY > 0 && ((this.C || z10) && this.f15937s0.a()))) {
                if (this.C0) {
                    if (finalY > 0) {
                        currVelocity = -scroller.getCurrVelocity();
                    } else {
                        currVelocity = scroller.getCurrVelocity();
                    }
                    if (this.F0 == null) {
                        if (currVelocity > 0.0f && ((refreshState = this.f15945w0) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                            this.E0 = new e(currVelocity, this.f15911f0);
                        } else if (currVelocity < 0.0f && (this.f15945w0 == RefreshState.Loading || ((this.H && this.T && this.U && p(this.C)) || (this.L && !this.T && p(this.C) && this.f15945w0 != RefreshState.Refreshing)))) {
                            this.E0 = new e(currVelocity, -this.f15915h0);
                        } else if (this.f15903b == 0 && this.J) {
                            this.E0 = new e(currVelocity, 0);
                        }
                    }
                }
                scroller.forceFinished(true);
                return;
            }
            this.C0 = true;
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e2, code lost:
        if (r6 != 3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        View view2;
        Paint paint;
        Paint paint2;
        ec.a aVar = this.f15937s0;
        if (aVar != null) {
            view2 = aVar.f16551a;
        } else {
            view2 = null;
        }
        View view3 = view2;
        yb.c cVar = this.f15933q0;
        zb.b bVar = zb.b.f32339d;
        zb.b bVar2 = zb.b.f32340e;
        boolean z10 = this.I;
        if (cVar != null && cVar.getView() == view) {
            if (!p(this.B) || (!z10 && isInEditMode())) {
                return true;
            }
            if (view3 != null) {
                int max = Math.max(view3.getPaddingTop() + view3.getTop() + this.f15903b, view.getTop());
                int i10 = this.f15951z0;
                if (i10 != 0 && (paint2 = this.f15939t0) != null) {
                    paint2.setColor(i10);
                    if (this.f15933q0.getSpinnerStyle().c) {
                        max = view.getBottom();
                    } else if (this.f15933q0.getSpinnerStyle() == bVar) {
                        max = view.getBottom() + this.f15903b;
                    }
                    int i11 = max;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i11, this.f15939t0);
                    max = i11;
                }
                if ((this.D && this.f15933q0.getSpinnerStyle() == bVar2) || this.f15933q0.getSpinnerStyle().c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        yb.b bVar3 = this.f15935r0;
        if (bVar3 != null && bVar3.getView() == view) {
            if (!p(this.C) || (!z10 && isInEditMode())) {
                return true;
            }
            if (view3 != null) {
                int min = Math.min((view3.getBottom() - view3.getPaddingBottom()) + this.f15903b, view.getBottom());
                int i12 = this.A0;
                if (i12 != 0 && (paint = this.f15939t0) != null) {
                    paint.setColor(i12);
                    if (this.f15935r0.getSpinnerStyle().c) {
                        min = view.getTop();
                    } else if (this.f15935r0.getSpinnerStyle() == bVar) {
                        min = view.getTop() + this.f15903b;
                    }
                    int i13 = min;
                    canvas.drawRect(0.0f, i13, getWidth(), view.getBottom(), this.f15939t0);
                    min = i13;
                }
                if ((this.E && this.f15935r0.getSpinnerStyle() == bVar2) || this.f15935r0.getSpinnerStyle().c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), min, view.getRight(), view.getBottom());
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final ValueAnimator g(int i10, int i11, int i12, Interpolator interpolator) {
        if (this.f15903b == i10) {
            return null;
        }
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.F0.cancel();
            this.F0 = null;
        }
        this.E0 = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f15903b, i10);
        this.F0 = ofInt;
        ofInt.setDuration(i12);
        this.F0.setInterpolator(interpolator);
        this.F0.addListener(new xb.a(this));
        this.F0.addUpdateListener(new xb.b(this));
        this.F0.setStartDelay(i11);
        this.F0.start();
        return this.F0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t tVar = this.f15909e0;
        return tVar.f31526b | tVar.f31525a;
    }

    public yb.b getRefreshFooter() {
        yb.b bVar = this.f15935r0;
        if (!(bVar instanceof yb.b)) {
            return null;
        }
        return bVar;
    }

    public yb.c getRefreshHeader() {
        yb.c cVar = this.f15933q0;
        if (!(cVar instanceof yb.c)) {
            return null;
        }
        return cVar;
    }

    public RefreshState getState() {
        return this.f15945w0;
    }

    public final void h(int i10, Boolean bool) {
        int i11 = i10 >> 16;
        int i12 = (i10 << 16) >> 16;
        xb.c cVar = new xb.c(this, i11, bool);
        if (i12 > 0) {
            this.f15941u0.postDelayed(cVar, i12);
        } else {
            cVar.run();
        }
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            if (this.F0 != null) {
                RefreshState refreshState = this.f15945w0;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                RefreshState refreshState2 = RefreshState.PullDownCanceled;
                h hVar = this.f15943v0;
                if (refreshState == refreshState2) {
                    hVar.d(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    hVar.d(RefreshState.PullUpToLoad);
                }
                this.F0.setDuration(0L);
                this.F0.cancel();
                this.F0 = null;
            }
            this.E0 = null;
        }
        if (this.F0 != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        if (this.Q && (this.K || this.B || this.C)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        h hVar;
        boolean z10;
        yb.b bVar;
        boolean z11;
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            if (this.f15935r0 != null) {
                if (!this.C && this.V) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.C = z11;
            }
            if (this.f15937s0 == null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    yb.c cVar = this.f15933q0;
                    if ((cVar == null || childAt != cVar.getView()) && ((bVar = this.f15935r0) == null || childAt != bVar.getView())) {
                        this.f15937s0 = new ec.a(childAt);
                    }
                }
            }
            if (this.f15937s0 == null) {
                int c10 = dc.b.c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.arg_res_0x7f130489);
                super.addView(textView, 0, new g(-1, -1));
                ec.a aVar = new ec.a(textView);
                this.f15937s0 = aVar;
                aVar.f16551a.setPadding(c10, c10, c10, c10);
            }
            View findViewById = findViewById(this.f15932q);
            View findViewById2 = findViewById(this.f15934r);
            ec.a aVar2 = this.f15937s0;
            aVar2.getClass();
            ViewGroup viewGroup = null;
            aVar2.f16558i.f5673b = null;
            ec.a aVar3 = this.f15937s0;
            aVar3.f16558i.c = this.P;
            View view = aVar3.f16551a;
            boolean isInEditMode = view.isInEditMode();
            ViewGroup viewGroup2 = null;
            while (true) {
                hVar = this.f15943v0;
                if (viewGroup2 != null && (!(viewGroup2 instanceof s) || (viewGroup2 instanceof o))) {
                    break;
                }
                if (viewGroup2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinkedList linkedList = new LinkedList();
                linkedList.add(view);
                ViewGroup viewGroup3 = viewGroup;
                while (linkedList.size() > 0 && viewGroup3 == null) {
                    View view2 = (View) linkedList.poll();
                    if (view2 != null) {
                        if ((z10 || view2 != view) && dc.b.d(view2)) {
                            viewGroup3 = view2;
                        } else if (view2 instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view2;
                            for (int i11 = 0; i11 < viewGroup4.getChildCount(); i11++) {
                                linkedList.add(viewGroup4.getChildAt(i11));
                            }
                        }
                    }
                }
                if (viewGroup3 == null) {
                    viewGroup3 = view;
                }
                if (viewGroup3 == viewGroup2) {
                    break;
                }
                if (!isInEditMode) {
                    try {
                        if (viewGroup3 instanceof CoordinatorLayout) {
                            SmartRefreshLayout.this.setNestedScrollingEnabled(false);
                            ViewGroup viewGroup5 = viewGroup3;
                            int childCount2 = viewGroup5.getChildCount();
                            while (true) {
                                childCount2--;
                                if (childCount2 >= 0) {
                                    View childAt2 = viewGroup5.getChildAt(childCount2);
                                    if (childAt2 instanceof AppBarLayout) {
                                        ((AppBarLayout) childAt2).a(new dc.a(aVar3));
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                view = viewGroup3;
                viewGroup2 = view;
                viewGroup = null;
            }
            if (viewGroup2 != null) {
                aVar3.c = viewGroup2;
            }
            if (findViewById != null || findViewById2 != null) {
                aVar3.f16553d = findViewById;
                aVar3.f16554e = findViewById2;
                FrameLayout frameLayout = new FrameLayout(aVar3.f16551a.getContext());
                int indexOfChild = SmartRefreshLayout.this.getLayout().indexOfChild(aVar3.f16551a);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.getLayout().removeView(aVar3.f16551a);
                frameLayout.addView(aVar3.f16551a, 0, new ViewGroup.LayoutParams(-1, -1));
                smartRefreshLayout.getLayout().addView(frameLayout, indexOfChild, aVar3.f16551a.getLayoutParams());
                aVar3.f16551a = frameLayout;
                if (findViewById != null) {
                    findViewById.setTag(R.id.srl_tag, "fixed-top");
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    ViewGroup viewGroup6 = (ViewGroup) findViewById.getParent();
                    int indexOfChild2 = viewGroup6.indexOfChild(findViewById);
                    viewGroup6.removeView(findViewById);
                    layoutParams.height = dc.b.f(findViewById);
                    viewGroup6.addView(new Space(aVar3.f16551a.getContext()), indexOfChild2, layoutParams);
                    frameLayout.addView(findViewById, 1, layoutParams);
                }
                if (findViewById2 != null) {
                    findViewById2.setTag(R.id.srl_tag, "fixed-bottom");
                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    ViewGroup viewGroup7 = (ViewGroup) findViewById2.getParent();
                    int indexOfChild3 = viewGroup7.indexOfChild(findViewById2);
                    viewGroup7.removeView(findViewById2);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
                    layoutParams2.height = dc.b.f(findViewById2);
                    viewGroup7.addView(new Space(aVar3.f16551a.getContext()), indexOfChild3, layoutParams2);
                    layoutParams3.gravity = 80;
                    frameLayout.addView(findViewById2, 1, layoutParams3);
                }
            }
            if (this.f15903b != 0) {
                s(RefreshState.None);
                ec.a aVar4 = this.f15937s0;
                this.f15903b = 0;
                aVar4.d(0, this.f15936s, this.f15938t);
            }
        }
        int[] iArr = this.A;
        if (iArr != null) {
            yb.c cVar2 = this.f15933q0;
            if (cVar2 != null) {
                cVar2.setPrimaryColors(iArr);
            }
            yb.b bVar2 = this.f15935r0;
            if (bVar2 != null) {
                bVar2.setPrimaryColors(iArr);
            }
        }
        ec.a aVar5 = this.f15937s0;
        if (aVar5 != null) {
            super.bringChildToFront(aVar5.f16551a);
        }
        yb.c cVar3 = this.f15933q0;
        if (cVar3 != null && cVar3.getSpinnerStyle().f32345b) {
            super.bringChildToFront(this.f15933q0.getView());
        }
        yb.b bVar3 = this.f15935r0;
        if (bVar3 != null && bVar3.getSpinnerStyle().f32345b) {
            super.bringChildToFront(this.f15935r0.getView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V = true;
        this.E0 = null;
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.F0.removeAllUpdateListeners();
            this.F0.setDuration(0L);
            this.F0.cancel();
            this.F0 = null;
        }
        yb.c cVar = this.f15933q0;
        if (cVar != null && this.f15945w0 == RefreshState.Refreshing) {
            cVar.i(this, false);
        }
        yb.b bVar = this.f15935r0;
        if (bVar != null && this.f15945w0 == RefreshState.Loading) {
            bVar.i(this, false);
        }
        if (this.f15903b != 0) {
            this.f15943v0.b(0, true);
        }
        RefreshState refreshState = this.f15945w0;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            s(refreshState2);
        }
        Handler handler = this.f15941u0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.B0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFinishInflate() {
        /*
            r11 = this;
            super.onFinishInflate()
            int r0 = super.getChildCount()
            r1 = 3
            if (r0 > r1) goto L9e
            r2 = -1
            r3 = 0
            r5 = r2
            r4 = r3
            r6 = r4
        Lf:
            r7 = 1
            r8 = 2
            if (r4 >= r0) goto L33
            android.view.View r9 = super.getChildAt(r4)
            boolean r10 = dc.b.d(r9)
            if (r10 == 0) goto L24
            if (r6 < r8) goto L21
            if (r4 != r7) goto L24
        L21:
            r5 = r4
            r6 = r8
            goto L30
        L24:
            boolean r8 = r9 instanceof yb.a
            if (r8 != 0) goto L30
            if (r6 >= r7) goto L30
            if (r4 <= 0) goto L2e
            r6 = r7
            goto L2f
        L2e:
            r6 = r3
        L2f:
            r5 = r4
        L30:
            int r4 = r4 + 1
            goto Lf
        L33:
            if (r5 < 0) goto L4d
            ec.a r4 = new ec.a
            android.view.View r6 = super.getChildAt(r5)
            r4.<init>(r6)
            r11.f15937s0 = r4
            if (r5 != r7) goto L48
            if (r0 != r1) goto L45
            goto L46
        L45:
            r8 = r2
        L46:
            r1 = r3
            goto L4f
        L48:
            if (r0 != r8) goto L4d
            r1 = r2
            r8 = r7
            goto L4f
        L4d:
            r1 = r2
            r8 = r1
        L4f:
            r4 = r3
        L50:
            if (r4 >= r0) goto L9d
            android.view.View r5 = super.getChildAt(r4)
            if (r4 == r1) goto L8b
            if (r4 == r8) goto L65
            if (r1 != r2) goto L65
            yb.c r6 = r11.f15933q0
            if (r6 != 0) goto L65
            boolean r6 = r5 instanceof yb.c
            if (r6 == 0) goto L65
            goto L8b
        L65:
            if (r4 == r8) goto L6d
            if (r8 != r2) goto L9a
            boolean r6 = r5 instanceof yb.b
            if (r6 == 0) goto L9a
        L6d:
            boolean r6 = r11.C
            if (r6 != 0) goto L78
            boolean r6 = r11.V
            if (r6 != 0) goto L76
            goto L78
        L76:
            r6 = r3
            goto L79
        L78:
            r6 = r7
        L79:
            r11.C = r6
            boolean r6 = r5 instanceof yb.b
            if (r6 == 0) goto L82
            yb.b r5 = (yb.b) r5
            goto L88
        L82:
            com.scwang.smart.refresh.layout.wrapper.RefreshFooterWrapper r6 = new com.scwang.smart.refresh.layout.wrapper.RefreshFooterWrapper
            r6.<init>(r5)
            r5 = r6
        L88:
            r11.f15935r0 = r5
            goto L9a
        L8b:
            boolean r6 = r5 instanceof yb.c
            if (r6 == 0) goto L92
            yb.c r5 = (yb.c) r5
            goto L98
        L92:
            com.scwang.smart.refresh.layout.wrapper.RefreshHeaderWrapper r6 = new com.scwang.smart.refresh.layout.wrapper.RefreshHeaderWrapper
            r6.<init>(r5)
            r5 = r6
        L98:
            r11.f15933q0 = r5
        L9a:
            int r4 = r4 + 1
            goto L50
        L9d:
            return
        L9e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "最多只支持3个子View，Most only support three sub view"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onFinishInflate():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        boolean z12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z13;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = super.getChildAt(i17);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R.id.srl_tag))) {
                ec.a aVar = this.f15937s0;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = G0;
                boolean z14 = this.I;
                if (aVar != null && aVar.f16551a == childAt) {
                    if (isInEditMode() && z14 && p(this.B) && this.f15933q0 != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    View view = this.f15937s0.f16551a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams2 = marginLayoutParams3;
                    }
                    int i18 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i19 = marginLayoutParams2.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i18;
                    int measuredHeight = view.getMeasuredHeight() + i19;
                    if (z13 && q(this.F, this.f15933q0)) {
                        int i20 = this.f15911f0;
                        i19 += i20;
                        measuredHeight += i20;
                    }
                    view.layout(i18, i19, measuredWidth, measuredHeight);
                }
                yb.c cVar = this.f15933q0;
                zb.b bVar = zb.b.f32339d;
                if (cVar != null && cVar.getView() == childAt) {
                    if (isInEditMode() && z14 && p(this.B)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    View view2 = this.f15933q0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams = marginLayoutParams3;
                    }
                    int i21 = marginLayoutParams.leftMargin;
                    int i22 = marginLayoutParams.topMargin + this.f15919j0;
                    int measuredWidth2 = view2.getMeasuredWidth() + i21;
                    int measuredHeight2 = view2.getMeasuredHeight() + i22;
                    if (!z12 && this.f15933q0.getSpinnerStyle() == bVar) {
                        int i23 = this.f15911f0;
                        i22 -= i23;
                        measuredHeight2 -= i23;
                    }
                    view2.layout(i21, i22, measuredWidth2, measuredHeight2);
                }
                yb.b bVar2 = this.f15935r0;
                if (bVar2 != null && bVar2.getView() == childAt) {
                    if (isInEditMode() && z14 && p(this.C)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    View view3 = this.f15935r0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    }
                    zb.b spinnerStyle = this.f15935r0.getSpinnerStyle();
                    int i24 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = getMeasuredHeight() + marginLayoutParams3.topMargin;
                    int i25 = this.f15921k0;
                    int i26 = measuredHeight3 - i25;
                    if (this.T && this.U && this.H && this.f15937s0 != null && this.f15935r0.getSpinnerStyle() == bVar && p(this.C)) {
                        View view4 = this.f15937s0.f16551a;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i16 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i16 = 0;
                        }
                        i26 = view4.getMeasuredHeight() + paddingTop + paddingTop + i16;
                    }
                    if (spinnerStyle == zb.b.f32342g) {
                        i26 = marginLayoutParams3.topMargin - i25;
                    } else {
                        if (!z11 && spinnerStyle != zb.b.f32341f && spinnerStyle != zb.b.f32340e) {
                            if (spinnerStyle.c && this.f15903b < 0) {
                                if (p(this.C)) {
                                    i15 = -this.f15903b;
                                } else {
                                    i15 = 0;
                                }
                                i14 = Math.max(i15, 0);
                            }
                        } else {
                            i14 = this.f15915h0;
                        }
                        i26 -= i14;
                    }
                    view3.layout(i24, i26, view3.getMeasuredWidth() + i24, view3.getMeasuredHeight() + i26);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return this.f15907d0.a(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if ((!this.B0 || f11 <= 0.0f) && !v(-f11) && !this.f15907d0.b(f10, f11)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        int i12 = this.f15902a0;
        int i13 = 0;
        if (i11 * i12 > 0) {
            if (Math.abs(i11) > Math.abs(this.f15902a0)) {
                int i14 = this.f15902a0;
                this.f15902a0 = 0;
                i13 = i14;
            } else {
                this.f15902a0 -= i11;
                i13 = i11;
            }
            r(this.f15902a0);
        } else if (i11 > 0 && this.B0) {
            int i15 = i12 - i11;
            this.f15902a0 = i15;
            r(i15);
            i13 = i11;
        }
        this.f15907d0.c(i10, i11 - i13, 0, iArr, null);
        iArr[1] = iArr[1] + i13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        RefreshState refreshState;
        ViewParent parent;
        boolean e10 = this.f15907d0.e(i10, i11, i12, i13, this.f15905c0);
        int i14 = i13 + this.f15905c0[1];
        boolean z10 = this.K;
        if ((i14 < 0 && (this.B || z10)) || (i14 > 0 && (this.C || z10))) {
            RefreshState refreshState2 = this.f15947x0;
            if (refreshState2 == RefreshState.None || refreshState2.isOpening) {
                if (i14 > 0) {
                    refreshState = RefreshState.PullUpToLoad;
                } else {
                    refreshState = RefreshState.PullDownToRefresh;
                }
                this.f15943v0.d(refreshState);
                if (!e10 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i15 = this.f15902a0 - i14;
            this.f15902a0 = i15;
            r(i15);
        }
        if (this.B0 && i11 < 0) {
            this.B0 = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f15909e0.a(i10, 0);
        this.f15907d0.i(i10 & 2, 0);
        this.f15902a0 = this.f15903b;
        this.f15904b0 = true;
        i(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        if (isEnabled() && isNestedScrollingEnabled() && (i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (this.K || this.B || this.C)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f15909e0.f31525a = 0;
        this.f15904b0 = false;
        this.f15902a0 = 0;
        t();
        this.f15907d0.j(0);
    }

    public final boolean p(boolean z10) {
        if (z10 && !this.M) {
            return true;
        }
        return false;
    }

    public final boolean q(boolean z10, yb.a aVar) {
        if (!z10 && !this.M && aVar != null && aVar.getSpinnerStyle() != zb.b.f32340e) {
            return false;
        }
        return true;
    }

    public final void r(float f10) {
        float f11;
        boolean z10;
        double d10;
        double d11;
        RefreshState refreshState;
        if (this.f15904b0 && !this.P && f10 < 0.0f && !this.f15937s0.a()) {
            f11 = 0.0f;
        } else {
            f11 = f10;
        }
        int i10 = this.f15912g;
        if (f11 > i10 * 5 && getTag() == null && getTag(R.id.srl_tag) == null) {
            float f12 = i10;
            if (this.f15920k < f12 / 6.0f && this.f15918j < f12 / 16.0f) {
                Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                setTag(R.id.srl_tag, "你这么死拉，臣妾做不到啊！");
            }
        }
        RefreshState refreshState2 = this.f15945w0;
        RefreshState refreshState3 = RefreshState.TwoLevel;
        boolean z11 = this.L;
        h hVar = this.f15943v0;
        if (refreshState2 == refreshState3 && f11 > 0.0f) {
            hVar.b(Math.min((int) f11, getMeasuredHeight()), true);
        } else {
            RefreshState refreshState4 = RefreshState.Refreshing;
            float f13 = this.f15923l0;
            float f14 = this.f15922l;
            if (refreshState2 == refreshState4 && f11 >= 0.0f) {
                float f15 = this.f15911f0;
                if (f11 < f15) {
                    hVar.b((int) f11, true);
                } else {
                    if (f13 < 10.0f) {
                        f13 *= f15;
                    }
                    double d12 = f13 - f15;
                    int max = Math.max((i10 * 4) / 3, getHeight());
                    int i11 = this.f15911f0;
                    z10 = z11;
                    double d13 = max - i11;
                    double max2 = Math.max(0.0f, (f11 - i11) * f14);
                    double d14 = -max2;
                    if (d13 == 0.0d) {
                        d13 = 1.0d;
                    }
                    hVar.b(((int) Math.min(d12 * (1.0d - Math.pow(100.0d, d14 / d13)), max2)) + this.f15911f0, true);
                }
            } else {
                z10 = z11;
                int i12 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                float f16 = this.f15925m0;
                if (i12 < 0 && (refreshState2 == RefreshState.Loading || ((this.H && this.T && this.U && p(this.C)) || (z10 && !this.T && p(this.C))))) {
                    int i13 = this.f15915h0;
                    if (f11 > (-i13)) {
                        hVar.b((int) f11, true);
                    } else {
                        if (f16 < 10.0f) {
                            f16 *= i13;
                        }
                        double d15 = f16 - i13;
                        int max3 = Math.max((i10 * 4) / 3, getHeight());
                        int i14 = this.f15915h0;
                        double d16 = max3 - i14;
                        double d17 = -Math.min(0.0f, (i14 + f11) * f14);
                        double d18 = -d17;
                        if (d16 == 0.0d) {
                            d16 = 1.0d;
                        }
                        hVar.b(((int) (-Math.min((1.0d - Math.pow(100.0d, d18 / d16)) * d15, d17))) - this.f15915h0, true);
                    }
                } else if (f11 >= 0.0f) {
                    if (f13 < 10.0f) {
                        d11 = this.f15911f0 * f13;
                    } else {
                        d11 = f13;
                    }
                    double max4 = Math.max(i10 / 2, getHeight());
                    double max5 = Math.max(0.0f, f14 * f11);
                    double d19 = -max5;
                    if (max4 == 0.0d) {
                        max4 = 1.0d;
                    }
                    hVar.b((int) Math.min((1.0d - Math.pow(100.0d, d19 / max4)) * d11, max5), true);
                } else {
                    if (f16 < 10.0f) {
                        d10 = this.f15915h0 * f16;
                    } else {
                        d10 = f16;
                    }
                    double max6 = Math.max(i10 / 2, getHeight());
                    double d20 = -Math.min(0.0f, f14 * f11);
                    double d21 = -d20;
                    if (max6 == 0.0d) {
                        max6 = 1.0d;
                    }
                    hVar.b((int) (-Math.min((1.0d - Math.pow(100.0d, d21 / max6)) * d10, d20)), true);
                }
            }
            if (!z10 && !this.T && p(this.C) && f11 < 0.0f && (refreshState = this.f15945w0) != RefreshState.Refreshing && refreshState != RefreshState.Loading && refreshState != RefreshState.LoadFinish) {
                if (this.S) {
                    this.E0 = null;
                    hVar.a(-this.f15915h0);
                }
                setStateDirectLoading(false);
                this.f15941u0.postDelayed(new d(), this.f15910f);
                return;
            }
            return;
        }
        z10 = z11;
        if (!z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f15937s0.c;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.i.p(view)) {
            this.f15930p = z10;
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void s(RefreshState refreshState) {
        RefreshState refreshState2 = this.f15945w0;
        if (refreshState2 != refreshState) {
            this.f15945w0 = refreshState;
            this.f15947x0 = refreshState;
            yb.c cVar = this.f15933q0;
            yb.b bVar = this.f15935r0;
            if (cVar != null) {
                cVar.g(this, refreshState2, refreshState);
            }
            if (bVar != null) {
                bVar.g(this, refreshState2, refreshState);
            }
            if (refreshState == RefreshState.LoadFinish) {
                this.B0 = false;
            }
        } else if (this.f15947x0 != refreshState2) {
            this.f15947x0 = refreshState2;
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.Q = z10;
        this.f15907d0.h(z10);
    }

    public void setStateDirectLoading(boolean z10) {
        RefreshState refreshState = this.f15945w0;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f15949y0 = System.currentTimeMillis();
            this.B0 = true;
            s(refreshState2);
            this.f15941u0.postDelayed(new xb.d(this, 0, false), (long) AdError.SERVER_ERROR_CODE);
            yb.b bVar = this.f15935r0;
            if (bVar != null) {
                float f10 = this.f15925m0;
                if (f10 < 10.0f) {
                    f10 *= this.f15915h0;
                }
                bVar.e(this, this.f15915h0, (int) f10);
            }
        }
    }

    public void setStateLoading(boolean z10) {
        b bVar = new b(z10);
        s(RefreshState.LoadReleased);
        ValueAnimator a10 = this.f15943v0.a(-this.f15915h0);
        if (a10 != null) {
            a10.addListener(bVar);
        }
        yb.b bVar2 = this.f15935r0;
        if (bVar2 != null) {
            float f10 = this.f15925m0;
            if (f10 < 10.0f) {
                f10 *= this.f15915h0;
            }
            bVar2.f(this, this.f15915h0, (int) f10);
        }
        if (a10 == null) {
            bVar.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z10) {
        c cVar = new c(z10);
        s(RefreshState.RefreshReleased);
        ValueAnimator a10 = this.f15943v0.a(this.f15911f0);
        if (a10 != null) {
            a10.addListener(cVar);
        }
        yb.c cVar2 = this.f15933q0;
        if (cVar2 != null) {
            float f10 = this.f15923l0;
            if (f10 < 10.0f) {
                f10 *= this.f15911f0;
            }
            cVar2.f(this, this.f15911f0, (int) f10);
        }
        if (a10 == null) {
            cVar.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f15945w0;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            s(RefreshState.None);
        }
        if (this.f15947x0 != refreshState) {
            this.f15947x0 = refreshState;
        }
    }

    public final void t() {
        RefreshState refreshState = this.f15945w0;
        RefreshState refreshState2 = RefreshState.TwoLevel;
        h hVar = this.f15943v0;
        if (refreshState == refreshState2) {
            if (this.f15944w > -1000 && this.f15903b > getHeight() / 2) {
                ValueAnimator a10 = hVar.a(getHeight());
                if (a10 != null) {
                    a10.setDuration(this.f15908e);
                    return;
                }
                return;
            } else if (this.f15926n) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f15945w0 == refreshState2) {
                    smartRefreshLayout.f15943v0.d(RefreshState.TwoLevelFinish);
                    if (smartRefreshLayout.f15903b == 0) {
                        hVar.b(0, false);
                        smartRefreshLayout.s(RefreshState.None);
                        return;
                    }
                    hVar.a(0).setDuration(smartRefreshLayout.f15908e);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        RefreshState refreshState3 = RefreshState.Loading;
        if (refreshState != refreshState3 && (!this.H || !this.T || !this.U || this.f15903b >= 0 || !p(this.C))) {
            RefreshState refreshState4 = this.f15945w0;
            RefreshState refreshState5 = RefreshState.Refreshing;
            if (refreshState4 == refreshState5) {
                int i10 = this.f15903b;
                int i11 = this.f15911f0;
                if (i10 > i11) {
                    hVar.a(i11);
                    return;
                } else if (i10 < 0) {
                    hVar.a(0);
                    return;
                } else {
                    return;
                }
            } else if (refreshState4 == RefreshState.PullDownToRefresh) {
                hVar.d(RefreshState.PullDownCanceled);
                return;
            } else if (refreshState4 == RefreshState.PullUpToLoad) {
                hVar.d(RefreshState.PullUpCanceled);
                return;
            } else if (refreshState4 == RefreshState.ReleaseToRefresh) {
                hVar.d(refreshState5);
                return;
            } else if (refreshState4 == RefreshState.ReleaseToLoad) {
                hVar.d(refreshState3);
                return;
            } else if (refreshState4 == RefreshState.ReleaseToTwoLevel) {
                hVar.d(RefreshState.TwoLevelReleased);
                return;
            } else if (refreshState4 == RefreshState.RefreshReleased) {
                if (this.F0 == null) {
                    hVar.a(this.f15911f0);
                    return;
                }
                return;
            } else if (refreshState4 == RefreshState.LoadReleased) {
                if (this.F0 == null) {
                    hVar.a(-this.f15915h0);
                    return;
                }
                return;
            } else if (refreshState4 != RefreshState.LoadFinish && this.f15903b != 0) {
                hVar.a(0);
                return;
            } else {
                return;
            }
        }
        int i12 = this.f15903b;
        int i13 = -this.f15915h0;
        if (i12 < i13) {
            hVar.a(i13);
        } else if (i12 > 0) {
            hVar.a(0);
        }
    }

    public final void u(boolean z10) {
        RefreshState refreshState = this.f15945w0;
        if (refreshState == RefreshState.Refreshing && z10) {
            h(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f15949y0))), (int) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT) << 16, Boolean.TRUE);
        } else if (refreshState == RefreshState.Loading && z10) {
            int min = Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f15949y0))), (int) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT) << 16;
            int i10 = min >> 16;
            int i11 = (min << 16) >> 16;
            xb.d dVar = new xb.d(this, i10, true);
            if (i11 > 0) {
                this.f15941u0.postDelayed(dVar, i11);
            } else {
                dVar.run();
            }
        } else if (this.T != z10) {
            this.T = z10;
            yb.b bVar = this.f15935r0;
            if (bVar instanceof yb.b) {
                if (bVar.a(z10)) {
                    this.U = true;
                    if (this.T && this.H && this.f15903b > 0 && this.f15935r0.getSpinnerStyle() == zb.b.f32339d && p(this.C) && q(this.B, this.f15933q0)) {
                        this.f15935r0.getView().setTranslationY(this.f15903b);
                        return;
                    }
                    return;
                }
                this.U = false;
                new RuntimeException("Footer:" + this.f15935r0 + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
        if (r4 <= r13.f15911f0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
        if (r4 >= (-r13.f15915h0)) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(float r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.v(float):boolean");
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15908e = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.f15910f = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.f15922l = 0.5f;
        this.f15924m = 'n';
        this.f15932q = -1;
        this.f15934r = -1;
        this.f15936s = -1;
        this.f15938t = -1;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = true;
        this.J = true;
        this.K = false;
        this.L = true;
        this.M = false;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.f15905c0 = new int[2];
        p pVar = new p(this);
        this.f15907d0 = pVar;
        this.f15909e0 = new t();
        zb.a aVar = zb.a.c;
        this.f15913g0 = aVar;
        this.f15917i0 = aVar;
        this.f15923l0 = 2.5f;
        this.f15925m0 = 2.5f;
        this.f15927n0 = 1.0f;
        this.f15929o0 = 1.0f;
        this.f15931p0 = 0.16666667f;
        this.f15943v0 = new h();
        RefreshState refreshState = RefreshState.None;
        this.f15945w0 = refreshState;
        this.f15947x0 = refreshState;
        this.f15949y0 = 0L;
        this.f15951z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        this.D0 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f15941u0 = new Handler(Looper.getMainLooper());
        this.f15946x = new Scroller(context);
        this.f15948y = VelocityTracker.obtain();
        this.f15912g = context.getResources().getDisplayMetrics().heightPixels;
        this.f15950z = new dc.b();
        this.f15901a = viewConfiguration.getScaledTouchSlop();
        this.f15940u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15942v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f15915h0 = dc.b.c(60.0f);
        this.f15911f0 = dc.b.c(100.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.a.f475a);
        if (!obtainStyledAttributes.hasValue(1)) {
            super.setClipToPadding(false);
        }
        if (!obtainStyledAttributes.hasValue(0)) {
            super.setClipChildren(false);
        }
        this.f15922l = obtainStyledAttributes.getFloat(5, 0.5f);
        this.f15923l0 = obtainStyledAttributes.getFloat(32, 2.5f);
        this.f15925m0 = obtainStyledAttributes.getFloat(27, 2.5f);
        this.f15927n0 = obtainStyledAttributes.getFloat(34, 1.0f);
        this.f15929o0 = obtainStyledAttributes.getFloat(29, 1.0f);
        this.B = obtainStyledAttributes.getBoolean(20, this.B);
        this.f15910f = obtainStyledAttributes.getInt(36, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        this.C = obtainStyledAttributes.getBoolean(13, this.C);
        this.f15911f0 = obtainStyledAttributes.getDimensionPixelOffset(30, this.f15911f0);
        this.f15915h0 = obtainStyledAttributes.getDimensionPixelOffset(25, this.f15915h0);
        this.f15919j0 = obtainStyledAttributes.getDimensionPixelOffset(31, this.f15919j0);
        this.f15921k0 = obtainStyledAttributes.getDimensionPixelOffset(26, this.f15921k0);
        this.R = obtainStyledAttributes.getBoolean(4, false);
        this.S = obtainStyledAttributes.getBoolean(3, false);
        this.F = obtainStyledAttributes.getBoolean(12, true);
        this.G = obtainStyledAttributes.getBoolean(11, true);
        this.I = obtainStyledAttributes.getBoolean(18, true);
        this.L = obtainStyledAttributes.getBoolean(6, true);
        this.J = obtainStyledAttributes.getBoolean(16, true);
        boolean z10 = obtainStyledAttributes.getBoolean(19, false);
        this.M = z10;
        this.N = obtainStyledAttributes.getBoolean(21, true);
        this.O = obtainStyledAttributes.getBoolean(22, true);
        this.P = obtainStyledAttributes.getBoolean(14, true);
        boolean z11 = obtainStyledAttributes.getBoolean(9, false);
        this.H = z11;
        this.H = obtainStyledAttributes.getBoolean(10, z11);
        this.D = obtainStyledAttributes.getBoolean(8, true);
        this.E = obtainStyledAttributes.getBoolean(7, true);
        this.K = obtainStyledAttributes.getBoolean(17, false);
        this.f15932q = obtainStyledAttributes.getResourceId(24, -1);
        this.f15934r = obtainStyledAttributes.getResourceId(23, -1);
        this.f15936s = obtainStyledAttributes.getResourceId(33, -1);
        this.f15938t = obtainStyledAttributes.getResourceId(28, -1);
        boolean z12 = obtainStyledAttributes.getBoolean(15, this.Q);
        this.Q = z12;
        pVar.h(z12);
        this.V = this.V || obtainStyledAttributes.hasValue(13);
        obtainStyledAttributes.hasValue(12);
        obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(30);
        zb.a aVar2 = zb.a.f32334f;
        this.f15913g0 = hasValue ? aVar2 : this.f15913g0;
        this.f15917i0 = obtainStyledAttributes.hasValue(25) ? aVar2 : this.f15917i0;
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(35, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.A = new int[]{color2, color};
            } else {
                this.A = new int[]{color2};
            }
        } else if (color != 0) {
            this.A = new int[]{0, color};
        }
        if (z10 && !this.V && !this.C) {
            this.C = true;
        }
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes2.dex */
    public static class g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f15967a;

        /* renamed from: b  reason: collision with root package name */
        public final zb.b f15968b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15967a = 0;
            this.f15968b = null;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.a.f476b);
            this.f15967a = obtainStyledAttributes.getColor(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f15968b = zb.b.f32343h[obtainStyledAttributes.getInt(1, 0)];
            }
            obtainStyledAttributes.recycle();
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f15967a = 0;
            this.f15968b = null;
        }
    }

    @Override // yb.e
    public ViewGroup getLayout() {
        return this;
    }

    public static void setDefaultRefreshFooterCreator(bc.b bVar) {
    }

    public static void setDefaultRefreshHeaderCreator(bc.c cVar) {
    }

    public static void setDefaultRefreshInitializer(bc.d dVar) {
    }
}
