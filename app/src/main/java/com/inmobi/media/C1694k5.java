package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import lib.zj.office.fc.hssf.record.TableStylesRecord;
import lib.zj.office.fc.hssf.record.chart.ChartFRTInfoRecord;

/* renamed from: com.inmobi.media.k5 */
/* loaded from: classes2.dex */
public final class C1694k5 extends Kb {

    /* renamed from: o */
    private C1666i5 f15259o;

    /* renamed from: p */
    private boolean f15260p;

    public static /* synthetic */ void A(C1694k5 c1694k5, AdMetaInfo adMetaInfo) {
        b(c1694k5, adMetaInfo);
    }

    public static final void b(C1694k5 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        A4 p10 = this$0.p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdLoadSucceeded(info);
        }
    }

    public static final void c(C1694k5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdDisplayFailed();
        }
        A4 p11 = this$0.p();
        if (p11 != null) {
            ((B4) p11).a();
        }
        this$0.y();
    }

    private final void e(AdMetaInfo adMetaInfo) {
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).c("InterstitialUnifiedAdManager", "onLoadSuccess");
        }
        super.c(adMetaInfo);
        A4 p11 = p();
        if (p11 != null) {
            ((B4) p11).d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        a((byte) 2);
        s().post(new androidx.fragment.app.a1(6, this, adMetaInfo));
    }

    public static /* synthetic */ void z(C1694k5 c1694k5) {
        a(c1694k5);
    }

    public boolean C() {
        if (this.f15259o != null) {
            return true;
        }
        return false;
    }

    public final void D() {
        C1646h c1646h;
        AbstractC1846w0 j10;
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "render");
        }
        C1666i5 c1666i5 = this.f15259o;
        if (c1666i5 != null) {
            if (c1666i5.G0() && n() != null) {
                A4 p11 = p();
                if (p11 != null) {
                    ((B4) p11).c("InterstitialUnifiedAdManager", "already in ready state");
                }
                AdMetaInfo n10 = n();
                kotlin.jvm.internal.g.b(n10);
                e(n10);
                return;
            } else if (this.f15260p) {
                A4 p12 = p();
                if (p12 != null) {
                    ((B4) p12).b("InMobi", Kb.f14405k);
                }
                Z5.a((byte) 1, "InMobi", Kb.f14405k);
                b(this.f15259o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                C1666i5 c1666i52 = this.f15259o;
                if (c1666i52 != null) {
                    c1666i52.b(ChartFRTInfoRecord.sid);
                    return;
                }
                return;
            } else {
                C1666i5 c1666i53 = this.f15259o;
                J j11 = null;
                if (c1666i53 != null) {
                    c1646h = c1666i53.m();
                } else {
                    c1646h = null;
                }
                C1666i5 c1666i54 = this.f15259o;
                if (c1666i54 != null) {
                    j11 = c1666i54.I();
                }
                boolean a10 = a("InMobi", String.valueOf(j11));
                if (c1646h == null) {
                    A4 p13 = p();
                    if (p13 != null) {
                        ((B4) p13).b("InterstitialUnifiedAdManager", "ad is null. failure");
                    }
                    b(this.f15259o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    C1666i5 c1666i55 = this.f15259o;
                    if (c1666i55 != null) {
                        c1666i55.a((short) 2166);
                    }
                }
                if (n() == null) {
                    A4 p14 = p();
                    if (p14 != null) {
                        ((B4) p14).b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
                    }
                    b(this.f15259o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    C1666i5 c1666i56 = this.f15259o;
                    if (c1666i56 != null) {
                        c1666i56.a((short) 2167);
                    }
                }
                if (c1646h != null && a10) {
                    if (v() && (j10 = j()) != null) {
                        j10.e((byte) 1);
                    }
                    A4 p15 = p();
                    if (p15 != null) {
                        ((B4) p15).d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
                    }
                    a((byte) 8);
                    C1666i5 c1666i57 = this.f15259o;
                    if (c1666i57 != null) {
                        c1666i57.j0();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException(Kb.f14407m.toString());
    }

    public final void E() {
        C1666i5 c1666i5;
        C1588cb F0;
        C1666i5 c1666i52 = this.f15259o;
        if ((c1666i52 == null || (F0 = c1666i52.F0()) == null || !F0.f15003b) && (c1666i5 = this.f15259o) != null) {
            c1666i5.J0();
        }
    }

    public final void F() {
        C1588cb c1588cb;
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "show");
        }
        C1666i5 c1666i5 = this.f15259o;
        if (c1666i5 != null) {
            c1588cb = c1666i5.F0();
        } else {
            c1588cb = null;
        }
        if (c1588cb != null) {
            c1588cb.f15003b = true;
        }
        C1666i5 c1666i52 = this.f15259o;
        if (c1666i52 != null) {
            c1666i52.w0();
        }
        if (x()) {
            if (!M3.f14454a.a()) {
                if (this.f15259o != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C1666i5 c1666i53 = this.f15259o;
            if (c1666i53 != null && c1666i53.e((byte) 4)) {
                this.f15260p = true;
                C1666i5 c1666i54 = this.f15259o;
                if (c1666i54 != null) {
                    c1666i54.j(this);
                }
            }
        }
    }

    public final void a(C1666i5 c1666i5) {
        this.f15259o = c1666i5;
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void d() {
        s().post(new androidx.activity.i(this, 12));
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        a((byte) 6);
        C1666i5 c1666i5 = this.f15259o;
        if (c1666i5 != null) {
            c1666i5.g();
        }
        A4 p11 = p();
        if (p11 != null) {
            ((B4) p11).a();
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void g() {
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        AbstractC1846w0 j10 = j();
        if (j10 != null) {
            if (j10.Q() != 6 && j10.Q() != 7) {
                a(true, (short) 2159);
            } else {
                j10.a(this);
            }
        }
    }

    @Override // com.inmobi.media.Kb
    public AbstractC1846w0 j() {
        return this.f15259o;
    }

    public static /* synthetic */ void A() {
    }

    private final void a(boolean z10, short s4) {
        C1666i5 c1666i5;
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s4 != 0 && (c1666i5 = this.f15259o) != null) {
            c1666i5.c(s4);
        }
        s().post(new androidx.activity.k(this, 10));
        if (z10) {
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            a((byte) 6);
            C1666i5 c1666i52 = this.f15259o;
            if (c1666i52 != null) {
                c1666i52.g();
            }
        }
        A4 p12 = p();
        if (p12 != null) {
            ((B4) p12).a();
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private final boolean x() {
        byte q5 = q();
        if (q5 == 1) {
            A4 p10 = p();
            if (p10 != null) {
                ((B4) p10).b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Z5.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        } else if (q5 == 7) {
            Z5.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        } else if (q5 == 5) {
            if (this.f15259o != null) {
                StringBuilder sb2 = new StringBuilder(Kb.f14404j);
                C1666i5 c1666i5 = this.f15259o;
                sb2.append(c1666i5 != null ? c1666i5.I() : null);
                Z5.a((byte) 1, "InMobi", sb2.toString());
                A4 p12 = p();
                if (p12 != null) {
                    StringBuilder sb3 = new StringBuilder(Kb.f14404j);
                    C1666i5 c1666i52 = this.f15259o;
                    sb3.append(c1666i52 != null ? c1666i52.I() : null);
                    ((B4) p12).b("InMobi", sb3.toString());
                }
                a(false, (short) 2148);
                return false;
            }
            return false;
        } else if (this.f15260p) {
            C1666i5 c1666i53 = this.f15259o;
            if (c1666i53 != null) {
                c1666i53.c((short) 2149);
            }
            Z5.a((byte) 1, "InMobi", Kb.f14405k);
            A4 p13 = p();
            if (p13 != null) {
                ((B4) p13).b("InMobi", Kb.f14405k);
            }
            return false;
        } else {
            return true;
        }
    }

    private final void y() {
        C1666i5 c1666i5 = this.f15259o;
        if (c1666i5 != null) {
            c1666i5.b((byte) 4);
        }
    }

    public final boolean B() {
        C1666i5 c1666i5 = this.f15259o;
        if (c1666i5 != null && 2 == q()) {
            return c1666i5.G0();
        }
        return false;
    }

    public final C1666i5 z() {
        return this.f15259o;
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void b(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        d(info);
        if (this.f15259o == null) {
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC1846w0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a(TableStylesRecord.sid);
            return;
        }
        super.b(info);
        s().post(new f0.s(12, this, info));
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.f15259o == null) {
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).b("InterstitialUnifiedAdManager", "adUnit is null");
            }
            c(null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        e(info);
    }

    public static /* synthetic */ void a(C1694k5 c1694k5, C1803s9 c1803s9, Context context, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str = "intHtml";
        }
        c1694k5.a(c1803s9, context, z10, str);
    }

    public final void a(C1803s9 pubSettings, Context context, boolean z10, String logType) {
        C1666i5 c1666i5;
        C1666i5 c1666i52;
        kotlin.jvm.internal.g.e(pubSettings, "pubSettings");
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(logType, "logType");
        if (this.f15259o == null) {
            this.f15259o = new C1666i5(context, new H("int").a(pubSettings.f15448a).c(pubSettings.f15449b).a(pubSettings.c).e(pubSettings.f15451e).b(pubSettings.f15452f).a(), this);
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
            if (p11 != null) {
                ((B4) p11).a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            A4 p12 = p();
            if (p12 != null && (c1666i52 = this.f15259o) != null) {
                c1666i52.a(p12);
            }
            A4 p13 = p();
            if (p13 != null) {
                ((B4) p13).a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C1666i5 c1666i53 = this.f15259o;
            kotlin.jvm.internal.g.b(c1666i53);
            E9.a(c1666i53, p());
        }
        C1666i5 c1666i54 = this.f15259o;
        if (c1666i54 != null) {
            c1666i54.a(context);
        }
        C1666i5 c1666i55 = this.f15259o;
        if (c1666i55 != null) {
            c1666i55.a(pubSettings.c);
        }
        C1666i5 c1666i56 = this.f15259o;
        if (c1666i56 != null) {
            c1666i56.c("activity");
        }
        if (pubSettings.f15450d && (c1666i5 = this.f15259o) != null) {
            c1666i5.E0();
        }
        WatermarkData t4 = t();
        if (t4 != null) {
            C1666i5 c1666i57 = this.f15259o;
            if (c1666i57 != null) {
                c1666i57.a(t4);
            }
            A4 p14 = p();
            if (p14 != null) {
                ((B4) p14).c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    public final void c(PublisherCallbacks callbacks) {
        C1666i5 c1666i5;
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
        if (l() == null) {
            b(callbacks);
        }
        if (kotlin.jvm.internal.g.a(u(), Boolean.FALSE)) {
            C1666i5 c1666i52 = this.f15259o;
            if (c1666i52 != null) {
                c1666i52.a((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            A4 p10 = p();
            if (p10 != null) {
                ((B4) p10).b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Z5.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
        } else if (this.f15260p) {
            C1666i5 c1666i53 = this.f15259o;
            if (c1666i53 != null) {
                c1666i53.a((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).b("InMobi", Kb.f14405k);
            }
            Z5.a((byte) 1, "InMobi", Kb.f14405k);
        } else {
            a(Boolean.TRUE);
            C1666i5 c1666i54 = this.f15259o;
            if (c1666i54 == null || !a("InMobi", String.valueOf(c1666i54.I()), callbacks) || (c1666i5 = this.f15259o) == null || !c1666i5.e(o())) {
                return;
            }
            a((byte) 1);
            A4 p12 = p();
            if (p12 != null) {
                StringBuilder sb2 = new StringBuilder("Fetching an Interstitial ad for placement id: ");
                C1666i5 c1666i55 = this.f15259o;
                sb2.append(c1666i55 != null ? c1666i55.I() : null);
                ((B4) p12).c("InterstitialUnifiedAdManager", sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder("Fetching an Interstitial ad for placement id: ");
            C1666i5 c1666i56 = this.f15259o;
            sb3.append(c1666i56 != null ? c1666i56.I() : null);
            Z5.a((byte) 2, "InterstitialUnifiedAdManager", sb3.toString());
            C1666i5 c1666i57 = this.f15259o;
            if (c1666i57 != null) {
                c1666i57.g(this);
            }
            C1666i5 c1666i58 = this.f15259o;
            if (c1666i58 != null) {
                c1666i58.c0();
            }
        }
    }

    public static final void b(C1694k5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdDisplayFailed();
        }
        this$0.y();
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void b() {
        s().post(new b1.e(this, 8));
        A4 p10 = p();
        if (p10 != null) {
            ((B4) p10).d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        a((byte) 0);
        a((Boolean) null);
        C1666i5 c1666i5 = this.f15259o;
        if (c1666i5 != null) {
            c1666i5.g();
        }
        A4 p11 = p();
        if (p11 != null) {
            ((B4) p11).a();
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private final void c(AbstractC1846w0 abstractC1846w0, InMobiAdRequestStatus inMobiAdRequestStatus) {
        byte q5 = q();
        if (q5 == 8 || q5 == 1) {
            b(abstractC1846w0, inMobiAdRequestStatus);
        } else if (q5 == 2) {
            Z5.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            A4 p10 = p();
            if (p10 != null) {
                ((B4) p10).b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
        } else if (q5 == 5) {
            Z5.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).b("InMobi", "Ad will be dismissed, Internal error");
            }
            y();
            b();
        } else {
            Z5.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            A4 p12 = p();
            if (p12 != null) {
                ((B4) p12).b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
            }
        }
    }

    public static final void a(C1694k5 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        A4 p10 = this$0.p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdFetchSuccessful(info);
        }
    }

    public static final void a(C1694k5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            ((B4) p10).a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdDismissed();
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public void a(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        super.a(info);
        AbstractC1846w0 j10 = j();
        if (j10 != null) {
            j10.x0();
        }
        this.f15260p = false;
    }

    @Override // com.inmobi.media.Kb
    public void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.g.e(watermarkData, "watermarkData");
        super.a(watermarkData);
        C1666i5 c1666i5 = this.f15259o;
        if (c1666i5 != null) {
            c1666i5.a(watermarkData);
        }
    }
}
