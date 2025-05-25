package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.q1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1770q1 extends AbstractC1846w0 implements Application.ActivityLifecycleCallbacks {
    public final String M;
    public final String N;
    public boolean O;
    public int P;
    public final C1782r1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770q1(Context context, J placement, AbstractC1689k0 abstractC1689k0) {
        super(context, placement, abstractC1689k0);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(placement, "placement");
        this.M = "q1";
        this.N = "InMobi";
        this.Q = new C1782r1();
        placement.l();
        a(context, placement, abstractC1689k0);
    }

    public static final void c(C1770q1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 a42 = this$0.f15531j;
        if (a42 != null) {
            String TAG = this$0.M;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "start loading html ad");
        }
        this$0.s0();
    }

    public static final void e(C1770q1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            if (this$0.Q() == 6) {
                this$0.P++;
                this$0.d((byte) 7);
                A4 a42 = this$0.f15531j;
                if (a42 != null) {
                    String TAG = this$0.M;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).d(TAG, "AdUnit " + this$0 + " state - ACTIVE");
                }
                A4 a43 = this$0.f15531j;
                if (a43 != null) {
                    ((B4) a43).c(this$0.N, "Successfully displayed banner ad for placement Id : " + this$0.I());
                }
                AbstractC1689k0 r4 = this$0.r();
                if (r4 != null) {
                    this$0.d(r4);
                }
            } else if (this$0.Q() == 7) {
                this$0.P++;
            }
        } catch (Exception e10) {
            A4 a44 = this$0.f15531j;
            if (a44 != null) {
                String str = this$0.M;
                ((B4) a44).b(str, Cc.a(e10, A5.a(str, "TAG", "BannerAdUnit.onAdScreenDisplayed threw unexpected error: ")));
            }
        }
    }

    public static final void f(C1770q1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            if (this$0.Q() == 4) {
                this$0.d((byte) 6);
                A4 a42 = this$0.f15531j;
                if (a42 != null) {
                    String TAG = this$0.M;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).d(TAG, "AdUnit " + this$0 + " state - RENDERED");
                }
            }
        } catch (Exception e10) {
            A4 a43 = this$0.f15531j;
            if (a43 != null) {
                String str = this$0.M;
                ((B4) a43).b(str, Cc.a(e10, A5.a(str, "TAG", "BannerAdUnit.onRenderViewVisible threw unexpected error: ")));
            }
        }
    }

    public static final void g(C1770q1 this$0) {
        LinkedList<C1646h> f10;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (this$0.b0()) {
            this$0.a(System.currentTimeMillis());
            C1577c0 y10 = this$0.y();
            if (y10 != null && (f10 = y10.f()) != null) {
                int i10 = 0;
                for (Object obj : f10) {
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        C1646h c1646h = (C1646h) obj;
                        this$0.B().add(Integer.valueOf(i10));
                        i10 = i11;
                    } else {
                        ge.a.c0();
                        throw null;
                    }
                }
            }
        }
        this$0.s0();
    }

    public boolean C0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "canProceedToLoad ", this));
        }
        if (f0()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String TAG = this.M;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).b(TAG, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        } else if (1 != Q() && 2 != Q()) {
            if (7 == Q()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    String str2 = this.M;
                    StringBuilder a10 = A5.a(str2, "TAG", Kb.f14404j);
                    a10.append(I().l());
                    ((B4) a44).b(str2, a10.toString());
                }
                return false;
            }
            A4 a45 = this.f15531j;
            if (a45 != null) {
                String str3 = this.N;
                ((B4) a45).c(str3, "Fetching a Banner ad for placement id: " + I());
            }
            e0();
            return true;
        } else {
            Z5.a((byte) 1, this.N, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            A4 a46 = this.f15531j;
            if (a46 != null) {
                String TAG2 = this.M;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a46).b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == Q()) {
                a((short) 2008);
            } else {
                a((short) 2011);
            }
            return false;
        }
    }

    public final boolean D0() {
        if (Q() == 7) {
            return true;
        }
        return false;
    }

    public final void E0() {
        AbstractC1701kc viewableAd;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "onPause ", this));
        }
        byte Q = Q();
        if (Q == 4 || Q == 6 || Q == 7) {
            r k10 = k();
            Context t4 = t();
            if (k10 != null && t4 != null && (viewableAd = k10.getViewableAd()) != null) {
                viewableAd.a(t4, (byte) 1);
            }
        }
    }

    public final void F0() {
        AbstractC1701kc viewableAd;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "onResume ", this));
        }
        byte Q = Q();
        if (Q == 4 || Q == 6 || Q == 7) {
            r k10 = k();
            Context t4 = t();
            if (k10 != null && t4 != null && (viewableAd = k10.getViewableAd()) != null) {
                viewableAd.a(t4, (byte) 0);
            }
        }
    }

    public final void G0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        Context t4 = t();
        if (t4 != null) {
            Ha.a(t4, this);
        }
    }

    public final void H0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String TAG = this.M;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (o0()) {
                return;
            }
            C1872y0 s4 = s();
            s4.getClass();
            s4.f15668g = SystemClock.elapsedRealtime();
            d0();
            Handler D = D();
            if (D != null) {
                D.post(new androidx.activity.i(this, 14));
            }
        } catch (IllegalStateException e10) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String TAG2 = this.M;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void I0() {
        Activity activity;
        Application application;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        Context t4 = t();
        if (t4 instanceof Activity) {
            activity = (Activity) t4;
        } else {
            activity = null;
        }
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final byte J() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void c0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "load ", this));
        }
        if (C0()) {
            super.c0();
        }
    }

    public final void d(boolean z10) {
        A4 a42;
        A4 a43 = this.f15531j;
        if (a43 != null) {
            String str = this.M;
            ((B4) a43).a(str, AbstractC1731n1.a(str, "TAG", "load ", this));
        }
        if (z10 && (a42 = this.f15531j) != null) {
            String str2 = this.N;
            ((B4) a42).c(str2, "Initiating Banner refresh for placement id: " + I());
        }
        this.O = z10;
        c0();
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public boolean f0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "missingPrerequisitesForAd ", this));
            return false;
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.U9
    public void i(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onRenderViewVisible ", this));
        }
        super.i(renderView);
        Handler D = D();
        if (D != null) {
            D.post(new androidx.appcompat.widget.z0(this, 12));
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void j0() {
        if (p0()) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                String TAG = this.M;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).a(TAG, "renderAd without internet check");
            }
            H0();
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            String TAG2 = this.M;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).a(TAG2, "renderAd");
        }
        a(new C1744o1(this), new C1757p1(this));
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void l(S9 s92) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "handleRenderViewSignaledAdReady ", this));
        }
        super.l(s92);
        if (b0() && this.f15528g.indexOf(s92) > 0 && Q() == 6) {
            b((byte) 1);
            S9 s93 = (S9) this.f15528g.get(A());
            if (s93 != null) {
                s93.a(true);
            }
        } else if (Q() == 2) {
            b((byte) 1);
            d((byte) 4);
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String TAG = this.M;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).d(TAG, "AdUnit " + this + " state - READY");
            }
            C1872y0 s4 = s();
            s4.getClass();
            s4.f15670i = SystemClock.elapsedRealtime();
            u0();
            z0();
            A4 a44 = this.f15531j;
            if (a44 != null) {
                String str2 = this.N;
                ((B4) a44).c(str2, "Successfully loaded Banner ad markup in the WebView for placement id: " + I());
            }
            AbstractC1689k0 r4 = r();
            if (r4 != null) {
                f(r4);
            } else {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    String TAG2 = this.M;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a45).b(TAG2, "AdUnit listener is null");
                }
            }
            i();
        } else {
            A4 a46 = this.f15531j;
            if (a46 != null) {
                String str3 = this.M;
                StringBuilder a10 = A5.a(str3, "TAG", "AdUnit is not in available state, ignoring the ad ready signal - ");
                a10.append((int) Q());
                ((B4) a46).a(str3, a10.toString());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final HashMap o() {
        String str;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str2 = this.M;
            ((B4) a42).c(str2, AbstractC1731n1.a(str2, "TAG", "adSpecificRequestParams getter ", this));
        }
        HashMap hashMap = new HashMap();
        if (this.O) {
            str = "1";
        } else {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        hashMap.put("u-rt", str);
        hashMap.put("mk-ad-slot", I().a());
        return hashMap;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onActivityCreated ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onActivityDestroyed ", this));
        }
        Context t4 = t();
        if (kotlin.jvm.internal.g.a(t4, activity)) {
            kotlin.jvm.internal.g.c(t4, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) t4).getApplication().unregisterActivityLifecycleCallbacks(this);
            g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onActivityPaused ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onActivityResumed ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(outState, "outState");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onActivitySaveInstanceState ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onActivityStarted ", this));
        }
        if (kotlin.jvm.internal.g.a(t(), activity)) {
            F0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onActivityStopped ", this));
        }
        if (kotlin.jvm.internal.g.a(t(), activity)) {
            E0();
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public String q() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public S9 w() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "htmlAdContainer getter ", this));
        }
        S9 w7 = super.w();
        if (I().p() && w7 != null) {
            w7.e();
        }
        return w7;
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void a(boolean z10, InMobiAdRequestStatus status) {
        AbstractC1689k0 r4;
        kotlin.jvm.internal.g.e(status, "status");
        super.a(z10, status);
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).c(str, AbstractC1731n1.a(str, "TAG", "onDidParseAfterFetch ", this));
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            String str2 = this.N;
            ((B4) a43).c(str2, "Banner ad fetch successful for placement id: " + I());
        }
        if (Q() != 2 || (r4 = r()) == null) {
            return;
        }
        e(r4);
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public void b() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "closeAll ", this));
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void b(S9 s92, short s4) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "handleRenderViewSignaledAdFailed ", this));
        }
        super.b(s92, s4);
        if (b0()) {
            int indexOf = this.f15528g.indexOf(s92);
            AbstractC1846w0.a(this, indexOf, false, 2, null);
            if (indexOf > 0 && Q() == 6) {
                b((byte) 1);
                S9 s93 = (S9) this.f15528g.get(A());
                if (s93 != null) {
                    s93.a(false);
                }
            }
        }
        if (Q() == 2) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String str2 = this.N;
                ((B4) a43).c(str2, "Failed to load the Banner markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s4);
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void g() {
        this.Q.f15399a = false;
        super.g();
    }

    @Override // com.inmobi.media.U9
    public synchronized void d(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "onAdScreenDismissed ", this));
        }
        super.d(renderView);
        Handler D = D();
        if (D != null) {
            D.post(new androidx.appcompat.widget.y0(this, 12));
        }
    }

    public static final void a(C1770q1 this$0, S9 renderView, int i10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(renderView, "$renderView");
        int indexOf = this$0.f15528g.indexOf(renderView);
        try {
            AbstractC1689k0 r4 = this$0.r();
            A4 a42 = this$0.f15531j;
            if (a42 != null) {
                String TAG = this$0.M;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "callback onShowNextPodAd");
            }
            if (r4 != null) {
                r4.a(i10, indexOf, renderView);
            }
        } catch (Exception unused) {
            this$0.b(indexOf, false);
            this$0.f(indexOf);
        }
    }

    public static final void d(C1770q1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            if (this$0.Q() == 7) {
                int i10 = this$0.P - 1;
                this$0.P = i10;
                if (i10 == 0) {
                    this$0.d((byte) 6);
                    AbstractC1689k0 r4 = this$0.r();
                    if (r4 != null) {
                        r4.b();
                    }
                }
            }
        } catch (Exception e10) {
            A4 a42 = this$0.f15531j;
            if (a42 != null) {
                String str = this$0.M;
                ((B4) a42).b(str, Cc.a(e10, A5.a(str, "TAG", "BannerAdUnit.onAdScreenDismissed threw unexpected error: ")));
            }
        }
    }

    @Override // com.inmobi.media.U9
    public synchronized void e(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "onAdScreenDisplayed ", this));
        }
        super.e(renderView);
        Handler D = D();
        if (D != null) {
            D.post(new b7.g(this, 10));
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public void a(int i10, S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str = this.M;
            ((B4) a42).a(str, AbstractC1731n1.a(str, "TAG", "loadPodAd ", this));
        }
        if (B().contains(Integer.valueOf(i10)) && i10 > this.f15528g.indexOf(renderView)) {
            g(i10);
            Handler D = D();
            if (D != null) {
                D.post(new androidx.activity.b(this, 16));
                return;
            }
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            String TAG = this.M;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).a(TAG, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.f15528g;
        S9 s92 = (S9) arrayList.get(arrayList.indexOf(renderView));
        if (s92 != null) {
            s92.a(false);
        }
    }

    public final void e(String str) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String str2 = this.M;
            ((B4) a42).c(str2, AbstractC1731n1.a(str2, "TAG", "setAdSize ", this));
        }
        J I = I();
        kotlin.jvm.internal.g.b(str);
        I.a(str);
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public void a(int i10, S9 renderView, Context context) {
        S9 s92;
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String TAG = this.M;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "showPodAdAtIndex " + this + " index - " + i10);
        }
        if (!b0()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String TAG2 = this.M;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.f15528g;
            S9 s93 = (S9) arrayList.get(arrayList.indexOf(renderView));
            if (s93 != null) {
                s93.b(false);
                return;
            }
            return;
        }
        A4 a44 = this.f15531j;
        if (a44 != null) {
            String str = this.M;
            ((B4) a44).c(str, AbstractC1731n1.a(str, "TAG", "isInValidShowPodIndex ", this));
        }
        if (B().contains(Integer.valueOf(i10)) && i10 > this.f15528g.indexOf(renderView) && this.f15528g.get(i10) != null && ((s92 = (S9) this.f15528g.get(i10)) == null || s92.f14678p0)) {
            super.a(i10, renderView, context);
            Handler D = D();
            if (D != null) {
                D.post(new qb.f1(this, renderView, i10, 0));
                return;
            }
            return;
        }
        A4 a45 = this.f15531j;
        if (a45 != null) {
            String TAG3 = this.M;
            kotlin.jvm.internal.g.d(TAG3, "TAG");
            ((B4) a45).b(TAG3, "Cannot show an pod ad with invalid index passed");
        }
        ArrayList arrayList2 = this.f15528g;
        S9 s94 = (S9) arrayList2.get(arrayList2.indexOf(renderView));
        if (s94 != null) {
            s94.b(false);
        }
    }

    @Override // com.inmobi.media.U9
    public void a(EnumC1648h1 audioStatusInternal) {
        kotlin.jvm.internal.g.e(audioStatusInternal, "audioStatusInternal");
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.a(audioStatusInternal);
        }
        C1782r1 c1782r1 = this.Q;
        c1782r1.getClass();
        if (!c1782r1.f15399a && audioStatusInternal == EnumC1648h1.f15116e) {
            c1782r1.f15399a = true;
            C1850w4 c1850w4 = C1850w4.c;
            c1850w4.f15548a = System.currentTimeMillis();
            c1850w4.f15549b++;
        }
    }

    @Override // com.inmobi.media.U9
    public void a(boolean z10) {
        C1850w4 c1850w4 = C1850w4.c;
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        C1851w5 a10 = AbstractC1838v5.a(d10, "banner_audio_pref_file");
        int i10 = a10.f15579a.getInt("user_mute_count", 0);
        a10.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1);
    }
}
