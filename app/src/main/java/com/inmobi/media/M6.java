package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class M6 implements r, Application.ActivityLifecycleCallbacks {
    public int A;
    public M6 B;
    public boolean C;
    public W6 D;
    public String E;
    public Intent F;
    public S9 G;
    public S9 H;
    public M6 I;
    public byte J;
    public L6 K;
    public final C1819u L;
    public final I6 M;
    public final F6 N;
    public final J6 O;
    public final E6 P;
    public Map Q;
    public final String R;
    public final H6 S;

    /* renamed from: a  reason: collision with root package name */
    public final byte f14460a;

    /* renamed from: b  reason: collision with root package name */
    public final C1682j7 f14461b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f14462d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14463e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14464f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14465g;

    /* renamed from: h  reason: collision with root package name */
    public final A2 f14466h;

    /* renamed from: i  reason: collision with root package name */
    public final L5 f14467i;

    /* renamed from: j  reason: collision with root package name */
    public final A4 f14468j;

    /* renamed from: k  reason: collision with root package name */
    public final K6 f14469k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14470l;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f14471m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f14472n;

    /* renamed from: o  reason: collision with root package name */
    public AbstractC1701kc f14473o;

    /* renamed from: p  reason: collision with root package name */
    public C1866x7 f14474p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14475q;

    /* renamed from: r  reason: collision with root package name */
    public final AdConfig f14476r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14477s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14478t;

    /* renamed from: u  reason: collision with root package name */
    public M6 f14479u;

    /* renamed from: v  reason: collision with root package name */
    public C1820u0 f14480v;

    /* renamed from: w  reason: collision with root package name */
    public WeakReference f14481w;

    /* renamed from: x  reason: collision with root package name */
    public int f14482x;

    /* renamed from: y  reason: collision with root package name */
    public WeakReference f14483y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14484z;

    public M6(Context context, byte b10, C1682j7 mNativeDataModel, String impressionId, Set set, AdConfig adConfig, long j10, boolean z10, String creativeId, A2 a22, L5 l52, A4 a42) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(mNativeDataModel, "mNativeDataModel");
        kotlin.jvm.internal.g.e(impressionId, "impressionId");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        kotlin.jvm.internal.g.e(creativeId, "creativeId");
        this.f14460a = b10;
        this.f14461b = mNativeDataModel;
        this.c = impressionId;
        this.f14462d = set;
        this.f14463e = j10;
        this.f14464f = z10;
        this.f14465g = creativeId;
        this.f14466h = a22;
        this.f14467i = l52;
        this.f14468j = a42;
        this.f14469k = new K6(this);
        this.f14470l = "M6";
        this.f14471m = new HashSet();
        this.f14472n = new ArrayList();
        this.f14476r = adConfig;
        this.f14479u = this;
        this.f14481w = new WeakReference(null);
        this.f14482x = -1;
        this.M = new I6(this);
        this.N = new F6(this);
        this.O = new J6(this);
        this.P = new E6(this);
        this.f14481w = new WeakReference(context);
        Ha.a(context, this);
        C1570b7 c1570b7 = mNativeDataModel.f15220f;
        if (c1570b7 != null) {
            c1570b7.f14966y = System.currentTimeMillis();
        }
        this.J = (byte) -1;
        this.L = C1819u.f15483a;
        new Handler(Looper.getMainLooper()).post(new androidx.appcompat.widget.z0(this, 7));
        this.R = "native";
        this.S = new H6(this);
    }

    public final W6 a(C1682j7 c1682j7, W6 asset) {
        kotlin.jvm.internal.g.e(asset, "asset");
        if (c1682j7 == null) {
            return null;
        }
        String str = asset.f14792h;
        if (str.length() == 0) {
            asset.f14795k = (byte) 0;
            return asset;
        }
        String[] strArr = (String[]) new Regex("\\|").split(str, 0).toArray(new String[0]);
        if (strArr.length == 1) {
            asset.f14795k = a(strArr[0]);
            return asset;
        }
        W6 m10 = c1682j7.m(strArr[0]);
        if (m10 == null) {
            return a(c1682j7.f15222h, asset);
        }
        if (kotlin.jvm.internal.g.a(m10, asset)) {
            return null;
        }
        m10.f14795k = a(strArr[1]);
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String str2 = this.f14470l;
            ((B4) a42).a(str2, androidx.activity.r.f(A5.a(str2, "TAG", "Referenced asset ("), m10.f14787b, ')'));
        }
        return m10;
    }

    public final W6 b(C1682j7 c1682j7, W6 w62) {
        A4 a42;
        if (c1682j7 == null) {
            return null;
        }
        String str = w62.f14800p;
        String str2 = w62.f14801q;
        W6 a10 = a(w62, c1682j7, str);
        if (a10 == null) {
            a10 = a(w62, c1682j7, str2);
        }
        if (a10 != null && (a42 = this.f14468j) != null) {
            String str3 = this.f14470l;
            ((B4) a42).a(str3, androidx.activity.r.f(A5.a(str3, "TAG", "Referenced asset ("), a10.f14787b, ')'));
        }
        return a10;
    }

    @Override // com.inmobi.media.r
    public final boolean c() {
        return this.f14477s;
    }

    public final Context d() {
        Activity f10 = f();
        return f10 != null ? f10 : (Context) this.f14481w.get();
    }

    @Override // com.inmobi.media.r
    public final void e() {
    }

    public final Activity f() {
        WeakReference weakReference = this.f14483y;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final View g() {
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            return abstractC1701kc.b();
        }
        return null;
    }

    @Override // com.inmobi.media.r
    public final AdConfig getAdConfig() {
        return this.f14476r;
    }

    @Override // com.inmobi.media.r
    public final String getAdType() {
        return this.R;
    }

    @Override // com.inmobi.media.r
    public String getCreativeId() {
        return this.f14465g;
    }

    @Override // com.inmobi.media.r
    public final Object getDataModel() {
        return this.f14461b;
    }

    @Override // com.inmobi.media.r
    public InterfaceC1768q getFullScreenEventsListener() {
        return this.M;
    }

    @Override // com.inmobi.media.r
    public String getImpressionId() {
        return this.c;
    }

    @Override // com.inmobi.media.r
    public final String getMarkupType() {
        return "inmobiJson";
    }

    @Override // com.inmobi.media.r
    public final byte getPlacementType() {
        return this.f14460a;
    }

    @Override // com.inmobi.media.r
    public View getVideoContainerView() {
        return null;
    }

    @Override // com.inmobi.media.r
    public AbstractC1701kc getViewableAd() {
        T8 t82;
        AbstractC1701kc y82;
        Context j10 = j();
        if (this.f14473o == null && j10 != null) {
            A4 a42 = this.f14468j;
            if (a42 != null) {
                String TAG = this.f14470l;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "fireLoadedAndServedBeacons");
            }
            C1570b7 c1570b7 = this.f14461b.f15220f;
            if (c1570b7 != null) {
                HashMap a10 = a(c1570b7);
                a((byte) 1, a10);
                a((byte) 2, a10);
            }
            this.f14473o = new K4(j10, this, new mc(this, this.G, this.f14468j), this.f14468j);
            Set<Fb> set = this.f14462d;
            if (set != null) {
                for (Fb fb2 : set) {
                    try {
                        if (fb2.f14255a == 3) {
                            A4 a43 = this.f14468j;
                            if (a43 != null) {
                                String TAG2 = this.f14470l;
                                kotlin.jvm.internal.g.d(TAG2, "TAG");
                                ((B4) a43).a(TAG2, "OMID tracker");
                            }
                            Object obj = fb2.f14256b.get("omidAdSession");
                            if (obj instanceof T8) {
                                t82 = (T8) obj;
                            } else {
                                t82 = null;
                            }
                            AbstractC1701kc abstractC1701kc = this.f14473o;
                            if (t82 != null && abstractC1701kc != null) {
                                if (this.J == 0) {
                                    y82 = new X8(this, abstractC1701kc, t82, this.f14468j);
                                } else {
                                    y82 = new Y8(this, abstractC1701kc, t82, this.f14468j);
                                }
                                this.f14473o = y82;
                            } else {
                                A4 a44 = this.f14468j;
                                if (a44 != null) {
                                    String TAG3 = this.f14470l;
                                    kotlin.jvm.internal.g.d(TAG3, "TAG");
                                    ((B4) a44).b(TAG3, "Did not find a OMID ad session; the OMID decorator will not be applied.");
                                }
                            }
                        }
                    } catch (Exception e10) {
                        A4 a45 = this.f14468j;
                        if (a45 != null) {
                            String str = this.f14470l;
                            ((B4) a45).b(str, Cc.a(e10, A5.a(str, "TAG", "Exception occurred while creating the Display viewable ad : ")));
                        }
                        Q4 q42 = Q4.f14590a;
                        Q4.c.a(AbstractC1863x4.a(e10, "event"));
                    }
                }
            }
        }
        return this.f14473o;
    }

    public final C1866x7 h() {
        C1788r7 c1788r7;
        AbstractC1701kc abstractC1701kc = this.f14473o;
        C1788r7 c1788r72 = null;
        if (abstractC1701kc != null) {
            c1788r7 = abstractC1701kc.c();
        } else {
            c1788r7 = null;
        }
        if (c1788r7 instanceof C1788r7) {
            c1788r72 = c1788r7;
        }
        if (c1788r72 != null) {
            this.f14474p = c1788r72.f15419e;
        }
        return this.f14474p;
    }

    public pc i() {
        return this.S;
    }

    public final Context j() {
        if (1 != this.f14460a && !k()) {
            return (Context) this.f14481w.get();
        }
        return f();
    }

    public boolean k() {
        if (this.f14460a == 0 && f() != null) {
            return true;
        }
        return false;
    }

    public void l() {
        AbstractC1701kc abstractC1701kc;
        F0 f02;
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onPause");
        }
        this.f14478t = true;
        O7 a10 = a(g());
        if (a10 != null) {
            a10.b();
        }
        C1866x7 h10 = h();
        if (h10 != null && (f02 = h10.f15645l) != null) {
            f02.b();
        }
        Context d10 = d();
        if (d10 != null && (abstractC1701kc = this.f14473o) != null) {
            abstractC1701kc.a(d10, (byte) 1);
        }
    }

    public final void m() {
        JSONArray jSONArray;
        JSONObject e10;
        boolean z10;
        M6 m62;
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "prepareFullscreenContainer");
        }
        C1682j7 c1682j7 = this.f14461b;
        if (!(c1682j7 instanceof C1682j7) || (jSONArray = c1682j7.f15221g) == null || AbstractC1579c2.a(jSONArray) || (e10 = c1682j7.e()) == null) {
            return;
        }
        byte b10 = this.f14460a;
        if (b10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1682j7 c1682j72 = new C1682j7(b10, e10, c1682j7, z10, this.f14476r, this.f14468j);
        c1682j72.f15218d = c1682j7.f15218d;
        c1682j72.f15232r = c1682j7.f15232r;
        Context context = (Context) this.f14481w.get();
        if (c1682j72.f() && context != null) {
            String adImpressionId = getImpressionId();
            Set set = this.f14462d;
            AdConfig adConfig = this.f14476r;
            long j10 = this.f14463e;
            boolean z11 = this.f14464f;
            String creativeId = getCreativeId();
            L5 l52 = this.f14467i;
            A4 a43 = this.f14468j;
            kotlin.jvm.internal.g.e(adImpressionId, "adImpressionId");
            kotlin.jvm.internal.g.e(adConfig, "adConfig");
            kotlin.jvm.internal.g.e(creativeId, "creativeId");
            if (c1682j72.c().contains("VIDEO")) {
                m62 = new U7(context, (byte) 0, c1682j72, adImpressionId, set, adConfig, j10, z11, creativeId, null, l52, a43);
            } else {
                m62 = new M6(context, (byte) 0, c1682j72, adImpressionId, set, adConfig, j10, z11, creativeId, null, l52, a43);
            }
            this.B = m62;
            m62.f14479u = this;
            C1820u0 c1820u0 = this.f14480v;
            if (c1820u0 != null) {
                m62.f14480v = c1820u0;
            }
            if (c1682j7.f15218d) {
                new Handler(Looper.getMainLooper()).post(new androidx.appcompat.widget.y0(this, 10));
            }
        }
    }

    public final void n() {
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "reportFirstPageRendered");
        }
        C1570b7 b10 = this.f14461b.b(0);
        if (!this.f14471m.contains(0) && b10 != null && !this.f14477s) {
            this.f14471m.add(0);
            b10.f14966y = System.currentTimeMillis();
            if (this.f14475q) {
                HashMap a10 = a(b10);
                A4 a43 = this.f14468j;
                if (a43 != null) {
                    String TAG2 = this.f14470l;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).a(TAG2, "Page-view impression record request");
                }
                b10.a("page_view", a10, (F6) null, this.f14468j);
                return;
            }
            this.f14472n.add(b10);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onActivityDestroyed");
        }
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a(activity, (byte) 2);
        }
        A2 a22 = this.f14466h;
        if (a22 != null) {
            a22.b();
        }
        Context context = (Context) this.f14481w.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC1701kc abstractC1701kc;
        kotlin.jvm.internal.g.e(activity, "activity");
        if (kotlin.jvm.internal.g.a(d(), activity)) {
            A4 a42 = this.f14468j;
            if (a42 != null) {
                String TAG = this.f14470l;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "onResume");
            }
            this.f14478t = false;
            O7 a10 = a(g());
            if (a10 != null) {
                a10.c();
            }
            q();
            Context d10 = d();
            if (d10 != null && (abstractC1701kc = this.f14473o) != null) {
                abstractC1701kc.a(d10, (byte) 0);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        if (kotlin.jvm.internal.g.a(d(), activity)) {
            l();
        }
    }

    public final void p() {
        new Handler(Looper.getMainLooper()).post(new b7.g(this, 5));
    }

    public final void q() {
        F0 f02;
        C1866x7 h10 = h();
        if (h10 != null && (f02 = h10.f15645l) != null && !f02.c) {
            f02.c = true;
            f02.a(f02.f14243b);
        }
    }

    public final void r() {
        HashMap hashMap;
        C1820u0 c1820u0;
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "unlockRewards");
        }
        if (o()) {
            this.f14484z = true;
            C1682j7 c1682j7 = this.f14461b;
            if (!(c1682j7 instanceof C1682j7)) {
                c1682j7 = null;
            }
            if (c1682j7 != null && (hashMap = c1682j7.f15223i) != null && (c1820u0 = this.f14480v) != null) {
                A4 a43 = c1820u0.f15485a.f15531j;
                if (a43 != null) {
                    String e10 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
                    ((B4) a43).a(e10, "onAdRewardsUnlocked");
                }
                if (!c1820u0.f15485a.Z()) {
                    AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) c1820u0.f15486b.get();
                    if (abstractC1689k0 != null) {
                        abstractC1689k0.b(new HashMap(hashMap));
                        return;
                    }
                    A4 a44 = c1820u0.f15485a.f15531j;
                    if (a44 != null) {
                        ((B4) a44).b("InMobi", "Listener was garbage collected.Unable to give callback");
                    }
                }
            }
        }
    }

    @Override // com.inmobi.media.r
    public final void setFullScreenActivityContext(Activity activity) {
        this.f14483y = new WeakReference(activity);
    }

    public static final void d(M6 this$0) {
        AbstractC1701kc viewableAd;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        M6 m62 = this$0.B;
        if (m62 == null || (viewableAd = m62.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(null, new RelativeLayout(this$0.j()), false);
    }

    public static final void e(M6 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f14484z = true;
        this$0.b((W6) null);
    }

    public void c(W6 asset) {
        O7 a10;
        kotlin.jvm.internal.g.e(asset, "asset");
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "triggerAssetAction");
        }
        byte b10 = asset.f14795k;
        if (b10 == 0 || b10 == 5) {
            return;
        }
        if (b10 == 2) {
            this.f14484z = true;
            S9 s92 = this.G;
            if (s92 != null) {
                A4 a43 = s92.f14665j;
                if (a43 != null) {
                    String TAG2 = S9.O0;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).a(TAG2, "skipToInterActive");
                }
                s92.b("window.imraid.broadcastEvent('skip');");
            }
            O7 a11 = a(g());
            if (a11 != null) {
                a11.b();
            }
            b(asset);
            A2 a22 = this.f14466h;
            if (a22 == null || a22.f14115g.get()) {
                return;
            }
            a22.f14112d.f14219h = 1;
            kotlin.jvm.internal.g.b(a22.c);
        } else if (b10 == 3) {
            try {
                S9 s93 = this.G;
                if (s93 != null) {
                    A4 a44 = s93.f14665j;
                    if (a44 != null) {
                        String TAG3 = S9.O0;
                        kotlin.jvm.internal.g.d(TAG3, "TAG");
                        ((B4) a44).a(TAG3, "replayToInterActive");
                    }
                    s93.b("window.imraid.broadcastEvent('replay');");
                }
                View g10 = g();
                if (g10 != null) {
                    ViewParent parent = g10.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(g10);
                    }
                }
                M6 m62 = this.f14479u;
                M6 m63 = m62 instanceof M6 ? m62 : null;
                if (m63 != null && (a10 = a(m63.g())) != null) {
                    a10.e();
                }
                if (!kotlin.jvm.internal.g.a("VIDEO", asset.c)) {
                    A4 a45 = this.f14468j;
                    if (a45 != null) {
                        String TAG4 = this.f14470l;
                        kotlin.jvm.internal.g.d(TAG4, "TAG");
                        ((B4) a45).b(TAG4, "Action 3 not valid for asset of type: " + asset.c);
                    }
                } else if (m62 instanceof U7) {
                    View videoContainerView = ((U7) m62).getVideoContainerView();
                    C1641g8 c1641g8 = videoContainerView instanceof C1641g8 ? (C1641g8) videoContainerView : null;
                    if (c1641g8 != null) {
                        C1627f8 videoView = c1641g8.getVideoView();
                        Object tag = videoView.getTag();
                        W7 w7 = tag instanceof W7 ? (W7) tag : null;
                        if (w7 != null) {
                            if (w7.a()) {
                                videoView.k();
                            } else {
                                videoView.c();
                            }
                        } else if (1 == this.f14460a) {
                            videoView.k();
                        } else {
                            videoView.c();
                        }
                        if (w7 != null) {
                            a(w7);
                        }
                        videoView.start();
                    }
                }
            } catch (Exception e10) {
                A4 a46 = this.f14468j;
                if (a46 != null) {
                    String str = this.f14470l;
                    ((B4) a46).b(str, Cc.a(e10, A5.a(str, "TAG", "Encountered unexpected error in handling replay action on video: ")));
                }
                Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        } else if (b10 == 1) {
            try {
                S9 s94 = this.G;
                if (s94 != null) {
                    A4 a47 = s94.f14665j;
                    if (a47 != null) {
                        String TAG5 = S9.O0;
                        kotlin.jvm.internal.g.d(TAG5, "TAG");
                        ((B4) a47).a(TAG5, "closeToInterActive");
                    }
                    s94.b("window.imraid.broadcastEvent('close');");
                }
                a();
            } catch (Exception e11) {
                A4 a48 = this.f14468j;
                if (a48 != null) {
                    String str2 = this.f14470l;
                    ((B4) a48).b(str2, Cc.a(e11, A5.a(str2, "TAG", "Encountered unexpected error in handling exit action on video: ")));
                }
                Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
                Q4 q43 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e11, "event"));
            }
        } else if (b10 == 4) {
            try {
                if (this.f14460a == 0) {
                    A4 a49 = this.f14468j;
                    if (a49 != null) {
                        String TAG6 = this.f14470l;
                        kotlin.jvm.internal.g.d(TAG6, "TAG");
                        ((B4) a49).c(TAG6, "launchFullscreen");
                    }
                    M6 c = c(this);
                    if (c == null) {
                        return;
                    }
                    C1820u0 c1820u0 = c.f14480v;
                    if (c1820u0 != null) {
                        c1820u0.e();
                    }
                    C1819u c1819u = this.L;
                    int hashCode = hashCode();
                    G6 g62 = new G6(this, c);
                    c1819u.getClass();
                    C1819u.a(hashCode, g62);
                }
            } catch (Exception e12) {
                A4 a410 = this.f14468j;
                if (a410 != null) {
                    String str3 = this.f14470l;
                    ((B4) a410).b(str3, Cc.a(e12, A5.a(str3, "TAG", "Encountered unexpected error in handling fullscreen action ")));
                }
                Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in launching fullscreen ad");
                Q4 q44 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e12, "event"));
            }
        } else {
            this.f14484z = true;
            S9 s95 = this.G;
            if (s95 != null) {
                A4 a411 = s95.f14665j;
                if (a411 != null) {
                    String TAG7 = S9.O0;
                    kotlin.jvm.internal.g.d(TAG7, "TAG");
                    ((B4) a411).a(TAG7, "skipToInterActive");
                }
                s95.b("window.imraid.broadcastEvent('skip');");
            }
            O7 a12 = a(g());
            if (a12 != null) {
                a12.b();
            }
            b(asset);
        }
    }

    public void b(View view) {
        C1820u0 c1820u0;
        if (this.f14475q || this.f14477s) {
            return;
        }
        this.f14475q = true;
        A2 a22 = this.f14466h;
        if (a22 != null) {
            a22.a();
        }
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "A viewable impression is reported on ad view.");
        }
        C1570b7 c1570b7 = this.f14461b.f15220f;
        if (c1570b7 != null) {
            c1570b7.a("Impression", a(c1570b7), this.N, this.f14468j);
        }
        n();
        Iterator it = this.f14472n.iterator();
        while (it.hasNext()) {
            W6 w62 = (W6) it.next();
            HashMap a10 = a(w62);
            A4 a43 = this.f14468j;
            if (a43 != null) {
                String TAG2 = this.f14470l;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "Page-view impression record request");
            }
            w62.a("page_view", a10, (F6) null, this.f14468j);
        }
        this.f14472n.clear();
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 0);
        }
        M6 c = c(this);
        if (c == null || (c1820u0 = c.f14480v) == null) {
            return;
        }
        c1820u0.f();
    }

    public final void a(Context context) {
        this.f14481w = new WeakReference(context);
        Ha.a(context, this);
    }

    public static final void a(M6 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        C1819u c1819u = this$0.L;
        int hashCode = this$0.hashCode();
        J6 j62 = this$0.O;
        c1819u.getClass();
        C1819u.a(hashCode, j62);
    }

    @Override // com.inmobi.media.r
    public final void a(byte b10, Map map) {
        C1570b7 c1570b7;
        if (this.f14477s || b10 == 0 || b10 == 3) {
            return;
        }
        if (b10 == 1) {
            C1570b7 c1570b72 = this.f14461b.f15220f;
            if (c1570b72 != null) {
                A4 a42 = this.f14468j;
                if (a42 != null) {
                    String TAG = this.f14470l;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).a(TAG, "reportAdLoad");
                }
                c1570b72.a("load", (HashMap) map, (F6) null, this.f14468j);
            }
        } else if (b10 != 2 || (c1570b7 = this.f14461b.f15220f) == null) {
        } else {
            A4 a43 = this.f14468j;
            if (a43 != null) {
                String TAG2 = this.f14470l;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "reportAdServed");
            }
            c1570b7.a("client_fill", (HashMap) map, (F6) null, this.f14468j);
        }
    }

    public static final void b(M6 it) {
        kotlin.jvm.internal.g.e(it, "$it");
        C1819u c1819u = it.L;
        int hashCode = it.hashCode();
        J6 j62 = it.O;
        c1819u.getClass();
        C1819u.a(hashCode, j62);
    }

    public final void a(View view, W6 asset) {
        String str;
        C1820u0 c1820u0;
        kotlin.jvm.internal.g.e(asset, "asset");
        if (this.f14477s) {
            return;
        }
        n();
        W6 b10 = b(this.f14461b, asset);
        if (b10 != null) {
            HashMap a10 = a(b10);
            a(b10, a10);
            if (!kotlin.jvm.internal.g.a(b10, asset)) {
                a(asset, a10);
            }
        } else {
            A4 a42 = this.f14468j;
            if (a42 != null) {
                String TAG = this.f14470l;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).b(TAG, "Couldn't find an asset reference for this asset click URL");
            }
            a(asset, a(asset));
        }
        M6 c = c(this);
        if (c == null) {
            return;
        }
        String str2 = asset.f14800p;
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.g.f(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            str = C6.a(length, 1, str2, i10);
        } else {
            str = null;
        }
        if (AbstractC1579c2.a(str) && (c1820u0 = c.f14480v) != null) {
            c1820u0.a();
        }
        W6 a11 = a(this.f14461b, asset);
        if (a11 != null) {
            if (view != null && kotlin.jvm.internal.g.a("VIDEO", a11.c) && 5 == a11.f14795k) {
                view.setVisibility(4);
                asset.f14806v = 4;
            }
            c(a11);
            return;
        }
        A4 a43 = this.f14468j;
        if (a43 != null) {
            String TAG2 = this.f14470l;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).b(TAG2, "Couldn't find an asset reference for this asset action! Ignoring the asset action ...");
        }
    }

    public final void b(W6 w62) {
        AbstractC1701kc viewableAd;
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "showEndCard");
        }
        M6 m62 = this.I;
        if (m62 != null && g() != null) {
            try {
                View g10 = g();
                ViewGroup viewGroup = g10 instanceof ViewGroup ? (ViewGroup) g10 : null;
                View a10 = (viewGroup == null || (viewableAd = m62.getViewableAd()) == null) ? null : viewableAd.a(null, viewGroup, false);
                if (a10 != null) {
                    if (viewGroup != null) {
                        viewGroup.addView(a10);
                    }
                    a10.setClickable(true);
                    m62.q();
                    if (w62 instanceof W7) {
                        InterfaceC1673ic b10 = ((W7) w62).b();
                        Yb yb2 = b10 != null ? ((C1659hc) b10).f15150g : null;
                        if (yb2 == null) {
                            return;
                        }
                        yb2.f14898g = true;
                        return;
                    }
                    return;
                }
                A4 a43 = this.f14468j;
                if (a43 != null) {
                    String TAG2 = this.f14470l;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).b(TAG2, "Could not inflate the end card. Closing the ad");
                }
                a();
                return;
            } catch (Exception e10) {
                A4 a44 = this.f14468j;
                if (a44 != null) {
                    String TAG3 = this.f14470l;
                    kotlin.jvm.internal.g.d(TAG3, "TAG");
                    ((B4) a44).a(TAG3, "Failed to show end card Exception", e10);
                }
                a();
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
                return;
            }
        }
        A4 a45 = this.f14468j;
        if (a45 != null) {
            String TAG4 = this.f14470l;
            kotlin.jvm.internal.g.d(TAG4, "TAG");
            ((B4) a45).b(TAG4, "End card container is null; end card will not be shown");
        }
        Z5.a((byte) 2, "InMobi", "Failed to show end card");
        a();
    }

    @Override // com.inmobi.media.r
    public void b() {
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "destroyContainer");
        }
        if (this.f14477s) {
            return;
        }
        this.f14477s = true;
        A2 a22 = this.f14466h;
        if (a22 != null) {
            a22.b();
        }
        this.f14482x = -1;
        M6 m62 = this.B;
        if (m62 != null) {
            m62.a();
        }
        this.f14480v = null;
        C1866x7 h10 = h();
        if (h10 != null) {
            h10.f15645l.a();
            h10.f15647n = true;
            h10.f15642i.clear();
            h10.f15649p = null;
            G7 g72 = h10.f15643j;
            if (g72 != null) {
                g72.destroy();
            }
            h10.f15643j = null;
        }
        this.f14474p = null;
        this.f14472n.clear();
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.e();
        }
        AbstractC1701kc abstractC1701kc2 = this.f14473o;
        if (abstractC1701kc2 != null) {
            abstractC1701kc2.a();
        }
        Context context = (Context) this.f14481w.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
        this.f14481w.clear();
        WeakReference weakReference = this.f14483y;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.G = null;
        M6 m63 = this.I;
        if (m63 != null) {
            m63.b();
        }
        this.I = null;
        C1819u c1819u = this.L;
        int hashCode = hashCode();
        c1819u.getClass();
        SparseArray sparseArray = C1819u.f15484b;
        sparseArray.remove(hashCode);
        sparseArray.size();
    }

    public final W6 a(W6 w62, C1682j7 c1682j7, String str) {
        if (AbstractC1551a2.a((Context) this.f14481w.get(), str) || str == null || str.length() == 0) {
            return w62;
        }
        String[] strArr = (String[]) new Regex("\\|").split(str, 0).toArray(new String[0]);
        W6 m10 = c1682j7.m(strArr[0]);
        if (m10 == null) {
            return b(c1682j7.f15222h, w62);
        }
        if (kotlin.jvm.internal.g.a(m10, w62)) {
            return null;
        }
        if (strArr.length <= 2) {
            m10.f14796l = (byte) 1;
        } else {
            m10.f14796l = AbstractC1640g7.a(strArr[2]);
        }
        return m10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
        if (r7.equals("replay") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r7.equals("reload") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
        return 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte a(java.lang.String r7) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r7 = a0.d.e(r0, r1, r7, r0, r2)
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L13:
            if (r3 > r0) goto L38
            if (r4 != 0) goto L19
            r5 = r3
            goto L1a
        L19:
            r5 = r0
        L1a:
            char r5 = r7.charAt(r5)
            r6 = 32
            int r5 = kotlin.jvm.internal.g.f(r5, r6)
            if (r5 > 0) goto L28
            r5 = r1
            goto L29
        L28:
            r5 = r2
        L29:
            if (r4 != 0) goto L32
            if (r5 != 0) goto L2f
            r4 = r1
            goto L13
        L2f:
            int r3 = r3 + 1
            goto L13
        L32:
            if (r5 != 0) goto L35
            goto L38
        L35:
            int r0 = r0 + (-1)
            goto L13
        L38:
            java.lang.String r7 = com.inmobi.media.C6.a(r0, r1, r7, r3)
            int r0 = r7.hashCode()
            switch(r0) {
                case -934641255: goto L7d;
                case -934524953: goto L74;
                case 0: goto L6e;
                case 3127582: goto L65;
                case 3443508: goto L5a;
                case 3532159: goto L4f;
                case 110066619: goto L44;
                default: goto L43;
            }
        L43:
            goto L88
        L44:
            java.lang.String r0 = "fullscreen"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L4d
            goto L88
        L4d:
            r1 = 4
            goto L89
        L4f:
            java.lang.String r0 = "skip"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L58
            goto L88
        L58:
            r1 = 2
            goto L89
        L5a:
            java.lang.String r0 = "play"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L63
            goto L88
        L63:
            r1 = 5
            goto L89
        L65:
            java.lang.String r0 = "exit"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L89
            goto L88
        L6e:
            java.lang.String r0 = ""
            r7.equals(r0)
            goto L88
        L74:
            java.lang.String r0 = "replay"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L86
            goto L88
        L7d:
            java.lang.String r0 = "reload"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L86
            goto L88
        L86:
            r1 = 3
            goto L89
        L88:
            r1 = r2
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M6.a(java.lang.String):byte");
    }

    public static M6 c(M6 m62) {
        if (m62 == null) {
            return null;
        }
        if (m62.f() != null || kotlin.jvm.internal.g.a(m62, m62.f14479u)) {
            return m62;
        }
        M6 m63 = m62.f14479u;
        return c(m63 instanceof M6 ? m63 : null);
    }

    public final void a(String str, Map map) {
        L5 l52;
        if (kotlin.jvm.internal.g.a(str, "clickStartCalled") && (l52 = this.f14467i) != null) {
            l52.f14431h = System.currentTimeMillis();
        }
        L5 l53 = this.f14467i;
        if (l53 != null) {
            map.put("plType", l53.f14426b);
            map.put("plId", Long.valueOf(this.f14467i.f14425a));
            map.put("adType", this.f14467i.c);
            map.put("markupType", this.f14467i.f14427d);
            map.put("creativeType", this.f14467i.f14428e);
            map.put("metadataBlob", this.f14467i.f14429f);
            map.put("isRewarded", Boolean.valueOf(this.f14467i.f14430g));
            map.put("latency", Long.valueOf(System.currentTimeMillis() - this.f14467i.f14431h));
        }
        Ha.a(new androidx.fragment.app.a1(5, map, str));
    }

    public static final void a(Map keyValueMap, String eventType) {
        kotlin.jvm.internal.g.e(keyValueMap, "$keyValueMap");
        kotlin.jvm.internal.g.e(eventType, "$eventType");
        keyValueMap.put("networkType", C1566b3.q());
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b(eventType, keyValueMap, EnumC1686jb.f15238a);
    }

    public final void a(W6 asset, boolean z10) {
        kotlin.jvm.internal.g.e(asset, "asset");
        C1682j7 c1682j7 = this.f14461b;
        if (!c1682j7.f15232r || this.f14477s) {
            return;
        }
        W6 b10 = b(c1682j7, asset);
        if (b10 != null) {
            HashMap a10 = a(b10);
            String str = asset.f14791g;
            kotlin.jvm.internal.g.e(str, "<set-?>");
            b10.f14791g = str;
            String str2 = null;
            String a11 = B5.a(b10.f14800p, null);
            a("clickStartCalled", kotlin.collections.q.B0(new Pair("trigger", a11)));
            if (kotlin.jvm.internal.g.a("VIDEO", b10.c) || b10.f14790f) {
                A4 a42 = this.f14468j;
                if (a42 != null) {
                    String TAG = this.f14470l;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).a(TAG, "Asset interaction requested");
                }
                String str3 = b10.f14791g;
                AbstractC1701kc abstractC1701kc = this.f14473o;
                if (abstractC1701kc != null) {
                    abstractC1701kc.a((byte) 4);
                }
                if (kotlin.jvm.internal.g.a("NO_ACTION", str3)) {
                    a("landingsStartFailed", kotlin.collections.q.B0(new Pair("trigger", a11), new Pair("errorCode", 10)));
                    return;
                }
                String str4 = b10.f14800p;
                if (2 == b10.f14796l) {
                    InterfaceC1673ic b11 = ((W7) b10).b();
                    Yb yb2 = b11 != null ? ((C1659hc) b11).f15150g : null;
                    String str5 = yb2 != null ? yb2.c : null;
                    if (str5 != null) {
                        int length = str5.length() - 1;
                        int i10 = 0;
                        boolean z11 = false;
                        while (i10 <= length) {
                            boolean z12 = kotlin.jvm.internal.g.f(str5.charAt(!z11 ? i10 : length), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    break;
                                }
                                length--;
                            } else if (z12) {
                                i10++;
                            } else {
                                z11 = true;
                            }
                        }
                        str2 = C6.a(length, 1, str5, i10);
                    }
                    if (AbstractC1579c2.a(str2)) {
                        str4 = str5;
                    }
                }
                if (!AbstractC1551a2.a(d(), str4)) {
                    A4 a43 = this.f14468j;
                    if (a43 != null) {
                        String TAG2 = this.f14470l;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a43).b(TAG2, "Invalid url:" + str4 + " will use fallback");
                    }
                    str4 = b10.f14801q;
                    if (!AbstractC1551a2.a(d(), str4)) {
                        A4 a44 = this.f14468j;
                        if (a44 != null) {
                            String str6 = this.f14470l;
                            ((B4) a44).b(str6, AbstractC1890z5.a(str6, "TAG", "Invalid fallback url:", str4));
                        }
                        a("landingsStartFailed", kotlin.collections.q.B0(new Pair("trigger", a11), new Pair("errorCode", 3)));
                        return;
                    }
                }
                kotlin.jvm.internal.g.b(str4);
                String a12 = K8.a(str4, a10);
                A2 a22 = this.f14466h;
                if (a22 != null && !a22.f14115g.get()) {
                    a22.f14112d.f14218g = 1;
                    kotlin.jvm.internal.g.b(a22.c);
                }
                if (this.C && !z10) {
                    M6 c = c(this);
                    if (c == null) {
                        return;
                    }
                    C1820u0 c1820u0 = c.f14480v;
                    if (c1820u0 != null) {
                        if (kotlin.jvm.internal.g.a("INAPP", str3) && AbstractC1551a2.a(a12)) {
                            c1820u0.e();
                        } else {
                            c1820u0.g();
                        }
                    }
                    this.D = b10;
                    this.E = a12;
                    return;
                }
                a("landingsStartSuccess", kotlin.collections.q.B0(new Pair("trigger", a11)));
                a(b10, str3, a12);
                return;
            }
            return;
        }
        A4 a45 = this.f14468j;
        if (a45 != null) {
            String TAG3 = this.f14470l;
            kotlin.jvm.internal.g.d(TAG3, "TAG");
            ((B4) a45).b(TAG3, "Couldn't find an asset reference for this asset click URL");
        }
    }

    public final void a(W6 w62, HashMap hashMap) {
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "Click impression record requested");
        }
        if (2 == w62.f14796l) {
            W7 w7 = w62 instanceof W7 ? (W7) w62 : null;
            InterfaceC1673ic b10 = w7 != null ? w7.b() : null;
            Yb yb2 = b10 != null ? ((C1659hc) b10).f15150g : null;
            if ((yb2 != null ? yb2.c : null) != null && w62.f14800p != null) {
                if (!yb2.f14897f.isEmpty()) {
                    Iterator it = yb2.a(C1646h.CLICK_BEACON).iterator();
                    while (it.hasNext()) {
                        W6.a((P7) it.next(), hashMap, (F6) null, this.f14468j);
                    }
                    return;
                }
                return;
            }
            A4 a43 = this.f14468j;
            if (a43 != null) {
                String TAG2 = this.f14470l;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "reportAdClick");
            }
            w62.a(C1646h.CLICK_BEACON, hashMap, (F6) null, this.f14468j);
            return;
        }
        A4 a44 = this.f14468j;
        if (a44 != null) {
            String TAG3 = this.f14470l;
            kotlin.jvm.internal.g.d(TAG3, "TAG");
            ((B4) a44).a(TAG3, "reportAdClick");
        }
        w62.a(C1646h.CLICK_BEACON, hashMap, (F6) null, this.f14468j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0036 -> B:15:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap a(com.inmobi.media.W6 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "asset"
            kotlin.jvm.internal.g.e(r9, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 4
            r0.<init>(r1)
            boolean r1 = r8.f14477s
            if (r1 == 0) goto L10
            return r0
        L10:
            com.inmobi.media.j7 r1 = r8.f14461b
            r1.getClass()
            boolean r1 = r9 instanceof com.inmobi.media.C1570b7
            r2 = 1
            java.lang.String r3 = "card_scrollable"
            if (r1 == 0) goto L29
            r1 = r9
            com.inmobi.media.b7 r1 = (com.inmobi.media.C1570b7) r1
            java.lang.String r4 = r1.f14787b
            boolean r4 = kotlin.text.j.G(r3, r4, r2)
            if (r4 == 0) goto L29
            r9 = r8
            goto L4c
        L29:
            com.inmobi.media.W6 r9 = r9.f14802r
            boolean r1 = r9 instanceof com.inmobi.media.C1570b7
            r4 = 0
            if (r1 == 0) goto L35
            com.inmobi.media.b7 r9 = (com.inmobi.media.C1570b7) r9
            r1 = r9
            r9 = r8
            goto L37
        L35:
            r9 = r8
        L36:
            r1 = r4
        L37:
            if (r1 == 0) goto L4b
            java.lang.String r5 = r1.f14787b
            boolean r5 = kotlin.text.j.G(r3, r5, r2)
            if (r5 == 0) goto L42
            goto L4c
        L42:
            com.inmobi.media.W6 r1 = r1.f14802r
            boolean r5 = r1 instanceof com.inmobi.media.C1570b7
            if (r5 == 0) goto L36
            com.inmobi.media.b7 r1 = (com.inmobi.media.C1570b7) r1
            goto L37
        L4b:
            r1 = r4
        L4c:
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 0
            if (r1 == 0) goto L5b
            long r6 = r1.f14966y
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L5b
            r2 = r6
        L5b:
            com.inmobi.media.j7 r1 = r9.f14461b
            com.inmobi.media.b7 r1 = r1.f15220f
            if (r1 == 0) goto L63
            long r4 = r1.f14966y
        L63:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "$LTS"
            r0.put(r4, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "$STS"
            r0.put(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "$TS"
            r0.put(r2, r1)
            com.inmobi.media.j7 r9 = r9.f14461b
            java.util.Map r9 = r9.f15235u
            if (r9 != 0) goto L8d
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L8d:
            r0.putAll(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M6.a(com.inmobi.media.W6):java.util.HashMap");
    }

    public static O7 a(View view) {
        View findViewWithTag = view != null ? view.findViewWithTag("timerView") : null;
        if (findViewWithTag instanceof O7) {
            return (O7) findViewWithTag;
        }
        return null;
    }

    public final void a(W7 w7) {
        InterfaceC1673ic b10 = w7.b();
        Yb yb2 = b10 != null ? ((C1659hc) b10).f15150g : null;
        if (yb2 == null || !yb2.f14898g) {
            return;
        }
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "Invoking close end card trackers.");
        }
        Iterator it = yb2.a("closeEndCard").iterator();
        while (it.hasNext()) {
            W6.a((P7) it.next(), a((W6) w7), (F6) null, this.f14468j);
        }
        yb2.f14898g = false;
    }

    @Override // com.inmobi.media.r
    public final void a() {
        A4 a42 = this.f14468j;
        if (a42 != null) {
            String TAG = this.f14470l;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "dismissCurrentViewContainer");
        }
        if (this.f14477s) {
            return;
        }
        try {
            M6 c = c(this);
            if (c == null) {
                return;
            }
            c.r();
            InMobiAdActivity.f14092j.remove(c.hashCode());
            if (c instanceof U7) {
                View videoContainerView = c.getVideoContainerView();
                C1641g8 c1641g8 = videoContainerView instanceof C1641g8 ? (C1641g8) videoContainerView : null;
                if (c1641g8 != null) {
                    C1627f8 videoView = c1641g8.getVideoView();
                    Object tag = videoView.getTag();
                    if (tag instanceof W7) {
                        HashMap hashMap = ((W7) tag).f14804t;
                        hashMap.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                        hashMap.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                        W6 w62 = ((W7) tag).f14807w;
                        if (w62 instanceof W7) {
                            ((W7) w62).a((W7) tag);
                        }
                        a((W7) tag);
                    }
                }
            }
            WeakReference weakReference = c.f14483y;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f14098e = true;
                ((InMobiAdActivity) activity).finish();
                int i10 = this.f14482x;
                if (i10 != -1) {
                    ((InMobiAdActivity) activity).overridePendingTransition(0, i10);
                }
            }
            M6 m62 = this.f14479u;
            if (!(m62 instanceof M6)) {
                m62 = null;
            }
            if (m62 != null) {
                m62.B = null;
                new Handler(Looper.getMainLooper()).post(new androidx.activity.k(m62, 7));
            }
        } catch (Exception e10) {
            A4 a43 = this.f14468j;
            if (a43 != null) {
                String str = this.f14470l;
                ((B4) a43).b(str, Cc.a(e10, A5.a(str, "TAG", "Encountered unexpected error in handling exit action on video: ")));
            }
            Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.W6 r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M6.a(com.inmobi.media.W6, java.lang.String, java.lang.String):void");
    }

    public final Integer a(String url, W6 asset) {
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(asset, "asset");
        try {
            Context context = (Context) this.f14481w.get();
            if (context == null) {
                return 7;
            }
            if (AbstractC1551a2.a(url)) {
                A4 a42 = this.f14468j;
                if (a42 != null) {
                    String TAG = this.f14470l;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).c(TAG, "openUrlUsingEmbeddedBrowser");
                }
                InMobiAdActivity.f14093k = null;
                L6 l62 = this.K;
                if (l62 == null) {
                    l62 = new L6(this);
                    this.K = l62;
                }
                InMobiAdActivity.f14094l = l62;
                Intent intent = new Intent(context, InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
                intent.putExtra("placementId", this.f14463e);
                intent.putExtra("creativeId", getCreativeId());
                intent.putExtra("impressionId", getImpressionId());
                intent.putExtra("allowAutoRedirection", this.f14464f);
                L5 l52 = this.f14467i;
                intent.putExtra("placementType", l52 != null ? l52.f14426b : null);
                intent.putExtra("adType", this.R);
                intent.putExtra("markupType", "inmobiJson");
                L5 l53 = this.f14467i;
                intent.putExtra("creativeType", l53 != null ? l53.f14428e : null);
                L5 l54 = this.f14467i;
                intent.putExtra("metaDataBlob", l54 != null ? l54.f14429f : null);
                L5 l55 = this.f14467i;
                intent.putExtra("isRewarded", l55 != null ? l55.f14430g : false);
                if (asset.f14793i) {
                    intent.putExtra("supportLockScreen", true);
                }
                Ha.f14324a.a(context, intent);
                return null;
            }
            return 10;
        } catch (Exception e10) {
            A4 a43 = this.f14468j;
            if (a43 != null) {
                String TAG2 = this.f14470l;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "Error while opening Embedded Browser", e10);
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return 9;
        }
    }
}
