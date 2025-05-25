package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.inmobi.media.v1 */
/* loaded from: classes2.dex */
public final class C1834v1 extends Kb {

    /* renamed from: o */
    private final String f15508o = "InMobi";

    /* renamed from: p */
    private final String f15509p = "v1";

    /* renamed from: q */
    private C1770q1 f15510q;

    /* renamed from: r */
    private C1770q1 f15511r;

    /* renamed from: s */
    private C1770q1 f15512s;

    /* renamed from: t */
    private C1770q1 f15513t;

    private final boolean I() {
        Byte b10;
        C1770q1 c1770q1 = this.f15512s;
        if (c1770q1 != null) {
            b10 = Byte.valueOf(c1770q1.Q());
        } else {
            b10 = null;
        }
        A4 p10 = p();
        if (p10 != null) {
            String TAG = this.f15509p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).c(TAG, "shouldUseForegroundUnit " + this + " state - " + b10);
        }
        if ((b10 != null && b10.byteValue() == 4) || ((b10 != null && b10.byteValue() == 7) || (b10 != null && b10.byteValue() == 6))) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void y(C1834v1 c1834v1, AdMetaInfo adMetaInfo) {
        b(c1834v1, adMetaInfo);
    }

    public static /* synthetic */ void z(C1834v1 c1834v1, AdMetaInfo adMetaInfo) {
        a(c1834v1, adMetaInfo);
    }

    public final int A() {
        AdConfig j10;
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "defaultRefreshInterval ", this));
        }
        AbstractC1846w0 j11 = j();
        if (j11 != null && (j10 = j11.j()) != null) {
            return j10.getDefaultRefreshInterval();
        }
        return -1;
    }

    public final boolean B() {
        String TAG = this.f15509p;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        kotlin.jvm.internal.g.a(this.f15512s, this.f15510q);
        String TAG2 = this.f15509p;
        kotlin.jvm.internal.g.d(TAG2, "TAG");
        kotlin.jvm.internal.g.a(this.f15513t, this.f15510q);
        String TAG3 = this.f15509p;
        kotlin.jvm.internal.g.d(TAG3, "TAG");
        kotlin.jvm.internal.g.a(this.f15512s, this.f15511r);
        String TAG4 = this.f15509p;
        kotlin.jvm.internal.g.d(TAG4, "TAG");
        kotlin.jvm.internal.g.a(this.f15513t, this.f15511r);
        String TAG5 = this.f15509p;
        kotlin.jvm.internal.g.d(TAG5, "TAG");
        C1770q1 c1770q1 = this.f15510q;
        if (c1770q1 != null) {
            c1770q1.D0();
        }
        C1770q1 c1770q12 = this.f15510q;
        if (c1770q12 != null) {
            c1770q12.Q();
        }
        Objects.toString(this.f15510q);
        String TAG6 = this.f15509p;
        kotlin.jvm.internal.g.d(TAG6, "TAG");
        C1770q1 c1770q13 = this.f15511r;
        if (c1770q13 != null) {
            c1770q13.D0();
        }
        C1770q1 c1770q14 = this.f15511r;
        if (c1770q14 != null) {
            c1770q14.Q();
        }
        Objects.toString(this.f15511r);
        C1770q1 c1770q15 = this.f15512s;
        if (c1770q15 != null) {
            return c1770q15.D0();
        }
        return false;
    }

    public final boolean C() {
        C1646h m10;
        C1770q1 c1770q1 = this.f15512s;
        if (c1770q1 != null && (m10 = c1770q1.m()) != null) {
            return kotlin.jvm.internal.g.a(m10.p(), "audio");
        }
        return false;
    }

    public boolean D() {
        if (this.f15510q != null && this.f15511r != null) {
            return true;
        }
        return false;
    }

    public final void E() {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).a(str, AbstractC1821u1.a(str, "TAG", "pause ", this));
        }
        C1770q1 c1770q1 = this.f15512s;
        if (c1770q1 != null) {
            c1770q1.E0();
        }
    }

    public final void F() {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        C1770q1 c1770q1 = this.f15510q;
        if (c1770q1 != null) {
            c1770q1.G0();
        }
        C1770q1 c1770q12 = this.f15511r;
        if (c1770q12 != null) {
            c1770q12.G0();
        }
    }

    public final void G() {
        C1770q1 c1770q1;
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).a(str, AbstractC1821u1.a(str, "TAG", "render ", this));
        }
        C1770q1 c1770q12 = this.f15513t;
        if (c1770q12 != null) {
            if (a(this.f15508o, c1770q12.I().toString())) {
                if (v() && (c1770q1 = this.f15513t) != null) {
                    c1770q1.e((byte) 1);
                }
                a((byte) 8);
                c1770q12.j0();
                return;
            }
            return;
        }
        throw new IllegalStateException(Kb.f14407m.toString());
    }

    public final void H() {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).a(str, AbstractC1821u1.a(str, "TAG", "resume ", this));
        }
        C1770q1 c1770q1 = this.f15512s;
        if (c1770q1 != null) {
            c1770q1.F0();
        }
    }

    public final void J() {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "swapAdUnits ", this));
        }
        C1770q1 c1770q1 = this.f15512s;
        if (c1770q1 == null) {
            this.f15512s = this.f15510q;
            this.f15513t = this.f15511r;
        } else if (kotlin.jvm.internal.g.a(c1770q1, this.f15510q)) {
            this.f15512s = this.f15511r;
            this.f15513t = this.f15510q;
        } else if (kotlin.jvm.internal.g.a(c1770q1, this.f15511r)) {
            this.f15512s = this.f15510q;
            this.f15513t = this.f15511r;
        }
    }

    public final void K() {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        C1770q1 c1770q1 = this.f15510q;
        if (c1770q1 != null) {
            c1770q1.I0();
        }
        C1770q1 c1770q12 = this.f15511r;
        if (c1770q12 != null) {
            c1770q12.I0();
        }
    }

    public final void a(Context context, C1803s9 pubSettings, String adSize, String logType) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(pubSettings, "pubSettings");
        kotlin.jvm.internal.g.e(adSize, "adSize");
        kotlin.jvm.internal.g.e(logType, "logType");
        kotlin.jvm.internal.g.d(this.f15509p, "TAG");
        J a10 = new H("banner").d(context instanceof Activity ? "activity" : "others").a(pubSettings.f15448a).c(pubSettings.f15449b).a(pubSettings.c).a(adSize).a(pubSettings.f15450d).e(pubSettings.f15451e).b(pubSettings.f15452f).a();
        String str = pubSettings.f15451e;
        if (str != null) {
            A4 p10 = p();
            if (p10 != null) {
                ((B4) p10).a();
            }
            a(E9.a(logType, str, false));
        }
        C1770q1 c1770q1 = this.f15510q;
        if (c1770q1 != null && this.f15511r != null) {
            c1770q1.a(context, a10, this);
            C1770q1 c1770q12 = this.f15511r;
            if (c1770q12 != null) {
                c1770q12.a(context, a10, this);
            }
        } else {
            this.f15510q = new C1770q1(context, a10, this);
            C1770q1 c1770q13 = new C1770q1(context, a10, this);
            this.f15511r = c1770q13;
            this.f15513t = this.f15510q;
            this.f15512s = c1770q13;
        }
        A4 p11 = p();
        if (p11 != null) {
            C1770q1 c1770q14 = this.f15510q;
            if (c1770q14 != null) {
                c1770q14.a(p11);
            }
            C1770q1 c1770q15 = this.f15511r;
            if (c1770q15 != null) {
                c1770q15.a(p11);
            }
            A4 p12 = p();
            if (p12 != null) {
                String TAG = this.f15509p;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) p12).a(TAG, "adding mBannerAdUnit1 to reference tracker");
            }
            S5 s52 = E9.f14227a;
            C1770q1 c1770q16 = this.f15510q;
            kotlin.jvm.internal.g.b(c1770q16);
            E9.a(c1770q16, p());
            A4 p13 = p();
            if (p13 != null) {
                String TAG2 = this.f15509p;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) p13).a(TAG2, "adding mBannerAdUnit2 to reference tracker");
            }
            C1770q1 c1770q17 = this.f15511r;
            kotlin.jvm.internal.g.b(c1770q17);
            E9.a(c1770q17, p());
        }
        WatermarkData t4 = t();
        if (t4 != null) {
            C1770q1 c1770q18 = this.f15510q;
            if (c1770q18 != null) {
                c1770q18.a(t4);
            }
            C1770q1 c1770q19 = this.f15511r;
            if (c1770q19 != null) {
                c1770q19.a(t4);
            }
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void b(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "onAdFetchSuccess ", this));
        }
        d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C1770q1 c1770q1 = this.f15513t;
        if ((c1770q1 != null ? c1770q1.m() : null) == null) {
            A4 p11 = p();
            if (p11 != null) {
                String TAG = this.f15509p;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) p11).b(TAG, "backgroundAdUnit ad object is null");
            }
            a((AbstractC1846w0) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        A4 p12 = p();
        if (p12 != null) {
            String TAG2 = this.f15509p;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) p12).a(TAG2, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        s().post(new com.facebook.appevents.g(8, this, info));
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "onAdLoadSucceeded ", this));
        }
        super.c(info);
        a((byte) 0);
        A4 p11 = p();
        if (p11 != null) {
            String TAG = this.f15509p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p11).a(TAG, "Ad load successful, providing callback");
        }
        s().post(new f0.s(13, this, info));
    }

    @Override // com.inmobi.media.Kb
    public AbstractC1846w0 j() {
        if (I()) {
            return this.f15512s;
        }
        return this.f15513t;
    }

    public final boolean x() {
        C1770q1 c1770q1;
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "canProceedForSuccess ", this));
        }
        if (this.f15512s != null && (c1770q1 = this.f15513t) != null) {
            c1770q1.Q();
        }
        return true;
    }

    public final boolean y() {
        C1770q1 c1770q1;
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "canScheduleRefresh ", this));
        }
        C1770q1 c1770q12 = this.f15513t;
        if (c1770q12 == null) {
            return false;
        }
        Byte valueOf = Byte.valueOf(c1770q12.Q());
        if ((valueOf == null || valueOf.byteValue() != 4) && ((valueOf == null || valueOf.byteValue() != 1) && ((valueOf == null || valueOf.byteValue() != 2) && ((c1770q1 = this.f15512s) == null || c1770q1.Q() != 7)))) {
            return true;
        }
        A4 p11 = p();
        if (p11 != null) {
            String TAG = this.f15509p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p11).a(TAG, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void z() {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).a(str, AbstractC1821u1.a(str, "TAG", "clear ", this));
        }
        K();
        C1770q1 c1770q1 = this.f15510q;
        if (c1770q1 != null) {
            c1770q1.g();
        }
        this.f15510q = null;
        C1770q1 c1770q12 = this.f15511r;
        if (c1770q12 != null) {
            c1770q12.g();
        }
        this.f15511r = null;
        a((A4) null);
        this.f15512s = null;
        this.f15513t = null;
        a((Boolean) null);
    }

    public static final void b(C1834v1 this$0, AdMetaInfo info) {
        tf.d dVar;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f15509p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdLoadSucceeded(info);
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            this$0.b((short) 2184);
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void b() {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "onAdDismissed ", this));
        }
        a((byte) 0);
        A4 p11 = p();
        if (p11 != null) {
            String TAG = this.f15509p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p11).d(TAG, "AdManager state - CREATED");
        }
        super.b();
    }

    private final void b(RelativeLayout relativeLayout) {
        J I;
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).a(str, AbstractC1821u1.a(str, "TAG", "displayInternal ", this));
        }
        C1770q1 c1770q1 = this.f15512s;
        if (c1770q1 == null) {
            return;
        }
        r k10 = c1770q1.k();
        S9 s92 = k10 instanceof S9 ? (S9) k10 : null;
        if (s92 == null) {
            return;
        }
        AbstractC1701kc viewableAd = s92.getViewableAd();
        C1770q1 c1770q12 = this.f15512s;
        if (c1770q12 != null && (I = c1770q12.I()) != null && I.p()) {
            s92.e();
        }
        View d10 = viewableAd.d();
        viewableAd.a(new HashMap());
        ViewParent parent = s92.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            relativeLayout.addView(d10, layoutParams);
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(d10, layoutParams);
    }

    public static final void a(C1834v1 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String TAG = this$0.f15509p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p10).a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdFetchSuccessful(info);
            return;
        }
        A4 p11 = this$0.p();
        if (p11 != null) {
            String TAG2 = this$0.f15509p;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) p11).b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(int i10, int i11, S9 s92) {
        ViewParent parent;
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "onShowNextPodAd ", this));
        }
        super.a(i10, i11, s92);
        A4 p11 = p();
        if (p11 != null) {
            String TAG = this.f15509p;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) p11).a(TAG, "on Show next pod ad index: " + i10);
        }
        if (s92 != null) {
            try {
                parent = s92.getParent();
            } catch (Exception unused) {
                C1770q1 c1770q1 = this.f15512s;
                if (c1770q1 != null) {
                    c1770q1.f(i11);
                }
                C1770q1 c1770q12 = this.f15512s;
                if (c1770q12 != null) {
                    c1770q12.b(i11, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C1770q1 c1770q13 = this.f15512s;
            if (c1770q13 != null) {
                c1770q13.b(i11, true);
            }
            b(inMobiBanner);
            s().post(new qb.a1(this, i11, 1));
            return;
        }
        C1770q1 c1770q14 = this.f15512s;
        if (c1770q14 != null) {
            c1770q14.f(i11);
        }
        C1770q1 c1770q15 = this.f15512s;
        if (c1770q15 != null) {
            c1770q15.b(i11, false);
        }
    }

    public final void b(short s4) {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "submitAdLoadFailed ", this));
        }
        AbstractC1846w0 j10 = j();
        if (j10 != null) {
            j10.b(s4);
        }
    }

    public static final void a(C1834v1 this$0, int i10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        C1770q1 c1770q1 = this$0.f15512s;
        if (c1770q1 != null) {
            c1770q1.a(i10, false);
        }
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean z10) {
        C1770q1 c1770q1;
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
        kotlin.jvm.internal.g.e(adSize, "adSize");
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "load 1 ", this));
        }
        if (kotlin.jvm.internal.g.a(u(), Boolean.FALSE)) {
            b(this.f15513t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C1770q1 c1770q12 = this.f15513t;
            if (c1770q12 != null) {
                c1770q12.a((short) 2006);
            }
            Z5.a((byte) 1, this.f15508o, "Cannot call load() API after calling load(byte[])");
            A4 p11 = p();
            if (p11 != null) {
                String TAG = this.f15509p;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) p11).b(TAG, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        a(Boolean.TRUE);
        if (l() == null) {
            b(callbacks);
        }
        C1770q1 c1770q13 = this.f15513t;
        if (c1770q13 == null || !a(this.f15508o, String.valueOf(c1770q13.I()), callbacks) || (c1770q1 = this.f15513t) == null || !c1770q1.e(o())) {
            return;
        }
        A4 p12 = p();
        if (p12 != null) {
            String TAG2 = this.f15509p;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) p12).d(TAG2, "AdManager state - LOADING");
        }
        a((byte) 1);
        d(null);
        C1770q1 c1770q14 = this.f15513t;
        kotlin.jvm.internal.g.b(c1770q14);
        c1770q14.e(adSize);
        C1770q1 c1770q15 = this.f15513t;
        kotlin.jvm.internal.g.b(c1770q15);
        c1770q15.d(z10);
    }

    @Override // com.inmobi.media.Kb
    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        C1770q1 c1770q1;
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).a(str, AbstractC1821u1.a(str, "TAG", "load 2 ", this));
        }
        if (kotlin.jvm.internal.g.a(u(), Boolean.TRUE)) {
            Z5.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            A4 p11 = p();
            if (p11 != null) {
                String TAG = this.f15509p;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) p11).b(TAG, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        a(Boolean.FALSE);
        a((byte) 1);
        b(callbacks);
        if (this.f15513t != null) {
            C1770q1 c1770q12 = this.f15512s;
            if ((c1770q12 == null || !c1770q12.Y()) && (c1770q1 = this.f15513t) != null && c1770q1.e((byte) 1)) {
                A4 p12 = p();
                if (p12 != null) {
                    String TAG2 = this.f15509p;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) p12).a(TAG2, "timer started - load banner");
                }
                C1770q1 c1770q13 = this.f15513t;
                if (c1770q13 != null) {
                    c1770q13.e0();
                }
                C1770q1 c1770q14 = this.f15513t;
                if (c1770q14 != null) {
                    c1770q14.a(bArr);
                }
            }
        }
    }

    public final void a(RelativeLayout banner) {
        J I;
        kotlin.jvm.internal.g.e(banner, "banner");
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).a(str, AbstractC1821u1.a(str, "TAG", "displayAd ", this));
        }
        C1770q1 c1770q1 = this.f15512s;
        r k10 = c1770q1 != null ? c1770q1.k() : null;
        S9 s92 = k10 instanceof S9 ? (S9) k10 : null;
        if (s92 == null) {
            return;
        }
        AbstractC1701kc viewableAd = s92.getViewableAd();
        C1770q1 c1770q12 = this.f15512s;
        if (c1770q12 != null && (I = c1770q12.I()) != null && I.p()) {
            s92.e();
        }
        ViewParent parent = s92.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View d10 = viewableAd.d();
        viewableAd.a(new HashMap());
        C1770q1 c1770q13 = this.f15513t;
        if (c1770q13 != null) {
            c1770q13.E0();
        }
        if (viewGroup == null) {
            banner.addView(d10, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(d10, layoutParams);
        }
        C1770q1 c1770q14 = this.f15513t;
        if (c1770q14 != null) {
            c1770q14.g();
        }
    }

    @Override // com.inmobi.media.Kb
    public void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.g.e(watermarkData, "watermarkData");
        super.a(watermarkData);
        C1770q1 c1770q1 = this.f15510q;
        if (c1770q1 != null) {
            c1770q1.a(watermarkData);
        }
        C1770q1 c1770q12 = this.f15511r;
        if (c1770q12 != null) {
            c1770q12.a(watermarkData);
        }
    }

    public final int a(int i10, int i11) {
        AdConfig j10;
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "getRefreshInterval ", this));
        }
        C1770q1 c1770q1 = this.f15513t;
        return (c1770q1 == null || (j10 = c1770q1.j()) == null) ? i11 : i10 < j10.getMinimumRefreshInterval() ? j10.getMinimumRefreshInterval() : i10;
    }

    public final boolean a(long j10) {
        A4 p10 = p();
        if (p10 != null) {
            String str = this.f15509p;
            ((B4) p10).c(str, AbstractC1821u1.a(str, "TAG", "checkForRefreshRate ", this));
        }
        C1770q1 c1770q1 = this.f15513t;
        if (c1770q1 == null) {
            return false;
        }
        AdConfig j11 = c1770q1.j();
        kotlin.jvm.internal.g.b(j11);
        int minimumRefreshInterval = j11.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 < minimumRefreshInterval * 1000) {
            a((short) 2175);
            A4 p11 = p();
            if (p11 != null) {
                String TAG = this.f15509p;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) p11).b(TAG, "Early refresh request");
            }
            C1770q1 c1770q12 = this.f15513t;
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST);
            b(c1770q12, inMobiAdRequestStatus.setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
            String TAG2 = this.f15509p;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
            sb2.append(minimumRefreshInterval);
            sb2.append(" seconds (AdPlacement Id = ");
            C1770q1 c1770q13 = this.f15513t;
            sb2.append(c1770q13 != null ? c1770q13.I() : null);
            sb2.append(')');
            Z5.a((byte) 1, TAG2, sb2.toString());
            A4 p12 = p();
            if (p12 != null) {
                String TAG3 = this.f15509p;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                StringBuilder sb3 = new StringBuilder("Ad cannot be refreshed before ");
                sb3.append(minimumRefreshInterval);
                sb3.append(" seconds (AdPlacement Id = ");
                C1770q1 c1770q14 = this.f15513t;
                sb3.append(c1770q14 != null ? c1770q14.I() : null);
                sb3.append(')');
                ((B4) p12).b(TAG3, sb3.toString());
            }
            return false;
        }
        return true;
    }
}
