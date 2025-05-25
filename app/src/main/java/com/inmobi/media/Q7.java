package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Q7 extends Kb {

    /* renamed from: o */
    private final String f14598o;

    /* renamed from: p */
    private final String f14599p;

    /* renamed from: q */
    private V6 f14600q;

    public Q7(PublisherCallbacks callbacks) {
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
        this.f14598o = "InMobi";
        this.f14599p = "Q7";
        b(callbacks);
    }

    public static /* synthetic */ void a(Q7 q72, C1803s9 c1803s9, Context context, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str = "native";
        }
        q72.a(c1803s9, context, z10, str);
    }

    public final String D() {
        r k10;
        C1682j7 c1682j7;
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        V6 v62 = this.f14600q;
        if (v62 == null || (k10 = v62.k()) == null) {
            return null;
        }
        Object dataModel = k10.getDataModel();
        if (dataModel instanceof C1682j7) {
            c1682j7 = (C1682j7) dataModel;
        } else {
            c1682j7 = null;
        }
        if (c1682j7 == null || (c1668i7 = c1682j7.f15231q) == null || (c1654h7 = c1668i7.f15190b) == null) {
            return null;
        }
        return c1654h7.f15127a;
    }

    public final JSONObject E() {
        r k10;
        C1682j7 c1682j7;
        C1668i7 c1668i7;
        V6 v62 = this.f14600q;
        if (v62 == null || (k10 = v62.k()) == null) {
            return null;
        }
        Object dataModel = k10.getDataModel();
        if (dataModel instanceof C1682j7) {
            c1682j7 = (C1682j7) dataModel;
        } else {
            c1682j7 = null;
        }
        if (c1682j7 == null || (c1668i7 = c1682j7.f15231q) == null) {
            return null;
        }
        return c1668i7.f15189a;
    }

    public final boolean F() {
        V6 v62 = this.f14600q;
        if (v62 != null && v62.Q() == 4) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        r k10;
        C1682j7 c1682j7;
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        V6 v62 = this.f14600q;
        if (v62 != null && (k10 = v62.k()) != null) {
            Object dataModel = k10.getDataModel();
            if (dataModel instanceof C1682j7) {
                c1682j7 = (C1682j7) dataModel;
            } else {
                c1682j7 = null;
            }
            if (c1682j7 != null && (c1668i7 = c1682j7.f15231q) != null && (c1654h7 = c1668i7.f15190b) != null) {
                return c1654h7.f15132g;
            }
        }
        return false;
    }

    public boolean H() {
        if (this.f14600q != null) {
            return true;
        }
        return false;
    }

    public final Boolean I() {
        V6 v62 = this.f14600q;
        if (v62 != null) {
            return Boolean.valueOf(v62.k() instanceof U7);
        }
        return null;
    }

    public final void J() {
        V6 v62;
        if (kotlin.jvm.internal.g.a(u(), Boolean.FALSE)) {
            A4 p10 = p();
            if (p10 != null) {
                ((B4) p10).b(this.f14598o, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        a(Boolean.TRUE);
        V6 v63 = this.f14600q;
        if (v63 != null && a(this.f14598o, String.valueOf(v63.I()), l()) && (v62 = this.f14600q) != null && v62.e((byte) 1)) {
            A4 p11 = p();
            if (p11 != null) {
                String TAG = this.f14599p;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) p11).a(TAG, "internal load timer started");
            }
            a((byte) 1);
            V6 v64 = this.f14600q;
            if (v64 != null) {
                v64.c0();
            }
        }
    }

    public final void K() {
        M6 m62;
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "pause called");
        }
        V6 v62 = this.f14600q;
        if (v62 != null) {
            A4 a42 = v62.f15531j;
            if (a42 != null) {
                ((B4) a42).c("V6", "onPause");
            }
            if (v62.Q() == 4 && !(v62.t() instanceof Activity)) {
                r k10 = v62.k();
                if (k10 instanceof M6) {
                    m62 = (M6) k10;
                } else {
                    m62 = null;
                }
                if (m62 != null) {
                    m62.l();
                }
            }
        }
    }

    public final void L() {
        M6 m62;
        C1682j7 c1682j7;
        W6 w62;
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).c(TAG, "reportAdClickAndOpenLandingPage");
        }
        V6 v62 = this.f14600q;
        if (v62 != null) {
            A4 a42 = v62.f15531j;
            if (a42 != null) {
                ((B4) a42).c("V6", "reportAdClickAndOpenLandingPage");
            }
            r k10 = v62.k();
            if (k10 != null) {
                if (k10 instanceof M6) {
                    m62 = (M6) k10;
                } else {
                    m62 = null;
                }
                if (m62 != null) {
                    c1682j7 = m62.f14461b;
                } else {
                    c1682j7 = null;
                }
                if (c1682j7 instanceof C1682j7) {
                    C1668i7 c1668i7 = c1682j7.f15231q;
                    if (c1668i7 != null) {
                        w62 = c1668i7.c;
                    } else {
                        w62 = null;
                    }
                    if (w62 != null) {
                        A4 a43 = v62.f15531j;
                        if (a43 != null) {
                            ((B4) a43).a("V6", "reporting ad click and opening landing page");
                        }
                        m62.a((View) null, w62);
                        m62.a(w62, true);
                        return;
                    }
                    return;
                }
                return;
            }
            A4 a44 = v62.f15531j;
            if (a44 != null) {
                ((B4) a44).b("V6", "container is null. ignoring");
            }
        }
    }

    public final void M() {
        M6 m62;
        AbstractC1701kc abstractC1701kc;
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "resume called");
        }
        V6 v62 = this.f14600q;
        if (v62 != null) {
            A4 a42 = v62.f15531j;
            if (a42 != null) {
                ((B4) a42).c("V6", "onResume");
            }
            if (v62.Q() == 4 && !(v62.t() instanceof Activity)) {
                r k10 = v62.k();
                if (k10 instanceof M6) {
                    m62 = (M6) k10;
                } else {
                    m62 = null;
                }
                if (m62 != null) {
                    A4 a43 = m62.f14468j;
                    if (a43 != null) {
                        String TAG2 = m62.f14470l;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a43).c(TAG2, "onResume");
                    }
                    m62.f14478t = false;
                    O7 a10 = M6.a(m62.g());
                    if (a10 != null) {
                        a10.c();
                    }
                    m62.q();
                    Context d10 = m62.d();
                    if (d10 != null && (abstractC1701kc = m62.f14473o) != null) {
                        abstractC1701kc.a(d10, (byte) 0);
                    }
                }
            }
        }
    }

    public final void N() {
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).c(TAG, "takeAction");
        }
        V6 v62 = this.f14600q;
        if (v62 != null) {
            M6 G = v62.G();
            if (G != null) {
                A4 a42 = G.f14468j;
                if (a42 != null) {
                    String TAG2 = G.f14470l;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a42).c(TAG2, "takeAction");
                }
                W6 w62 = G.D;
                String str = G.E;
                Intent intent = G.F;
                Context context = (Context) G.f14481w.get();
                if (w62 != null && str != null) {
                    G.a(w62, w62.f14791g, str);
                    return;
                } else if (intent != null && context != null) {
                    Ha.f14324a.a(context, intent);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        A4 p11 = p();
        if (p11 != null) {
            String TAG3 = this.f14599p;
            kotlin.jvm.internal.g.d(TAG3, "TAG");
            ((B4) p11).b(TAG3, "InMobiNative is not initialized. Ignoring takeAction");
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void b(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).c(TAG, "onAdFetchSuccess");
        }
        d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        V6 v62 = this.f14600q;
        if (v62 == null) {
            A4 p11 = p();
            if (p11 != null) {
                String TAG2 = this.f14599p;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) p11).b(TAG2, "adunit is null. load failed.");
            }
            a((AbstractC1846w0) null, inMobiAdRequestStatus);
        } else if (v62.m() == null) {
            A4 p12 = p();
            if (p12 != null) {
                String TAG3 = this.f14599p;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) p12).b(TAG3, "adObject is null. load failed");
            }
            a((AbstractC1846w0) null, inMobiAdRequestStatus);
        } else {
            super.b(info);
            s().post(new f0.s(9, this, info));
            if (F()) {
                return;
            }
            A4 p13 = p();
            if (p13 != null) {
                String TAG4 = this.f14599p;
                kotlin.jvm.internal.g.d(TAG4, "TAG");
                ((B4) p13).a(TAG4, "ad is ready. start ad render");
            }
            V6 v63 = this.f14600q;
            if (v63 != null) {
                v63.j0();
            }
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).b(TAG, "onAdLoadSucceeded");
        }
        super.c(info);
        a((byte) 2);
        A4 p11 = p();
        if (p11 != null) {
            String TAG2 = this.f14599p;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) p11).d(TAG2, "AdManager state - LOADED");
        }
        s().post(new n0.g(9, this, info));
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void d() {
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).b(TAG, "onAdShowFailed");
        }
        A4 p11 = p();
        if (p11 != null) {
            ((B4) p11).a();
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void f() {
        s().post(new b1.e(this, 5));
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void i() {
        s().post(new androidx.activity.i(this, 8));
    }

    @Override // com.inmobi.media.Kb
    public AbstractC1846w0 j() {
        return this.f14600q;
    }

    public final String A() {
        r k10;
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        V6 v62 = this.f14600q;
        if (v62 == null || (k10 = v62.k()) == null) {
            return null;
        }
        Object dataModel = k10.getDataModel();
        C1682j7 c1682j7 = dataModel instanceof C1682j7 ? (C1682j7) dataModel : null;
        if (c1682j7 == null || (c1668i7 = c1682j7.f15231q) == null || (c1654h7 = c1668i7.f15190b) == null) {
            return null;
        }
        return c1654h7.c;
    }

    public final String B() {
        r k10;
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        V6 v62 = this.f14600q;
        if (v62 == null || (k10 = v62.k()) == null) {
            return null;
        }
        Object dataModel = k10.getDataModel();
        C1682j7 c1682j7 = dataModel instanceof C1682j7 ? (C1682j7) dataModel : null;
        if (c1682j7 == null || (c1668i7 = c1682j7.f15231q) == null || (c1654h7 = c1668i7.f15190b) == null) {
            return null;
        }
        return c1654h7.f15131f;
    }

    public final float C() {
        r k10;
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        V6 v62 = this.f14600q;
        if (v62 != null && (k10 = v62.k()) != null) {
            Object dataModel = k10.getDataModel();
            C1682j7 c1682j7 = dataModel instanceof C1682j7 ? (C1682j7) dataModel : null;
            if (c1682j7 != null && (c1668i7 = c1682j7.f15231q) != null && (c1654h7 = c1668i7.f15190b) != null) {
                return c1654h7.f15130e;
            }
        }
        return 0.0f;
    }

    public final void a(C1803s9 pubSettings, Context context, boolean z10, String logType) {
        V6 v62;
        kotlin.jvm.internal.g.e(pubSettings, "pubSettings");
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(logType, "logType");
        V6 v63 = this.f14600q;
        if (v63 == null) {
            this.f14600q = new V6(context, new H("native").a(pubSettings.f15448a).d(context instanceof Activity ? "activity" : "others").c(pubSettings.f15449b).a(pubSettings.c).a(pubSettings.f15450d).e(pubSettings.f15451e).b(pubSettings.f15452f).a(), this);
        } else {
            v63.a(context);
            V6 v64 = this.f14600q;
            if (v64 != null) {
                v64.c(context instanceof Activity ? "activity" : "others");
            }
        }
        if (z10) {
            w();
        }
        String str = pubSettings.f15451e;
        if (str != null) {
            A4 p10 = p();
            if (p10 != null) {
                ((B4) p10).a();
            }
            a(E9.a(logType, str, false));
            A4 p11 = p();
            if (p11 != null && (v62 = this.f14600q) != null) {
                v62.a(p11);
            }
            A4 p12 = p();
            if (p12 != null) {
                String TAG = this.f14599p;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) p12).a(TAG, "adding mNativeAdUnit to referenceTracker");
            }
            V6 v65 = this.f14600q;
            kotlin.jvm.internal.g.b(v65);
            E9.a(v65, p());
        }
        A4 p13 = p();
        if (p13 != null) {
            String TAG2 = this.f14599p;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) p13).a(TAG2, "load called");
        }
        V6 v66 = this.f14600q;
        if (v66 != null) {
            v66.a(pubSettings.c);
        }
    }

    public final void x() {
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "destroy called");
        }
        V6 v62 = this.f14600q;
        if (v62 != null) {
            v62.C0();
        }
        this.f14600q = null;
        A4 p11 = p();
        if (p11 != null) {
            ((B4) p11).a();
        }
    }

    public final String y() {
        r k10;
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        V6 v62 = this.f14600q;
        if (v62 == null || (k10 = v62.k()) == null) {
            return null;
        }
        Object dataModel = k10.getDataModel();
        C1682j7 c1682j7 = dataModel instanceof C1682j7 ? (C1682j7) dataModel : null;
        if (c1682j7 == null || (c1668i7 = c1682j7.f15231q) == null || (c1654h7 = c1668i7.f15190b) == null) {
            return null;
        }
        return c1654h7.f15129d;
    }

    public final String z() {
        r k10;
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        V6 v62 = this.f14600q;
        if (v62 == null || (k10 = v62.k()) == null) {
            return null;
        }
        Object dataModel = k10.getDataModel();
        C1682j7 c1682j7 = dataModel instanceof C1682j7 ? (C1682j7) dataModel : null;
        if (c1682j7 == null || (c1668i7 = c1682j7.f15231q) == null || (c1654h7 = c1668i7.f15190b) == null) {
            return null;
        }
        return c1654h7.f15128b;
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void c() {
        s().post(new androidx.activity.k(this, 8));
    }

    public static final void c(Q7 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback - onVideoSkipped");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onVideoSkipped();
        }
    }

    public static final void b(Q7 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdLoadSucceeded(info);
        }
    }

    public static final void b(Q7 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback - onVideoCompleted");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onVideoCompleted();
        }
    }

    public static final void a(Q7 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdFetchSuccessful(info);
        }
    }

    public final void a(C1803s9 pubSettings, Context context) {
        kotlin.jvm.internal.g.e(pubSettings, "pubSettings");
        kotlin.jvm.internal.g.e(context, "context");
        if (this.f14600q == null) {
            a(this, pubSettings, context, false, null, 8, null);
        }
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).c(TAG, "showOnLockScreen");
        }
        V6 v62 = this.f14600q;
        if (v62 != null) {
            v62.N = true;
        }
    }

    public static final void a(Q7 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback - onAdImpressed");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdImpressed();
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(boolean z10) {
        s().post(new qb.l(0, this, z10));
    }

    public static final void a(Q7 this$0, boolean z10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f14599p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback -onAudioStateChanged - " + z10);
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAudioStateChanged(z10);
        }
    }
}
