package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class V6 extends AbstractC1846w0 {
    public static final /* synthetic */ int P = 0;
    public WeakReference M;
    public boolean N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(Context context, J placement, AbstractC1689k0 abstractC1689k0) {
        super(context, placement, abstractC1689k0);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(placement, "placement");
        placement.l();
        a(context, placement, abstractC1689k0);
    }

    public final void C0() {
        try {
            super.g();
        } catch (Exception e10) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).b("V6", Cc.a(e10, A5.a("V6", "TAG", "SDK encountered unexpected error in destroying native ad unit; ")));
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final void D0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("V6", "renderAdPostInternetCheck");
        }
        k0();
        try {
            if (o0()) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).b("V6", "render ad is blocked");
                    return;
                }
                return;
            }
            C1872y0 s4 = s();
            s4.getClass();
            s4.f15668g = SystemClock.elapsedRealtime();
            d0();
        } catch (IllegalStateException e10) {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).a("V6", "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final byte J() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public final void a(int i10, S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public final void b() {
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void c0() {
        if (Z()) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).b("V6", "Ad unit is already destroyed! Returning ...");
                return;
            }
            return;
        }
        AbstractC1689k0 r4 = r();
        if (f0()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("V6", "Some of the dependency libraries for InMobiNative not found");
            }
            if (r4 != null) {
                r4.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
            }
        } else if (1 != Q() && 2 != Q()) {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                StringBuilder a10 = A5.a("V6", "TAG", "Fetching a Native ad for placement id: ");
                a10.append(I());
                ((B4) a44).a("V6", a10.toString());
            }
            if (4 == Q()) {
                if (!W()) {
                    A4 a45 = this.f15531j;
                    if (a45 != null) {
                        ((B4) a45).a("V6", "An ad is ready with the ad unit. Signaling ad load success ...");
                    }
                    if (r4 != null) {
                        Context t4 = t();
                        A4 a46 = this.f15531j;
                        if (a46 != null) {
                            ((B4) a46).c("V6", "setContainerContext");
                        }
                        r k10 = k();
                        if (k10 instanceof M6) {
                            ((M6) k10).a(t4);
                        }
                        A4 a47 = this.f15531j;
                        if (a47 != null) {
                            ((B4) a47).a("V6", "callback - onFetchSuccess");
                        }
                        A4 a48 = this.f15531j;
                        if (a48 != null) {
                            ((B4) a48).a("V6", "callback - onLoadSuccess");
                        }
                        e(r4);
                        f(r4);
                        return;
                    }
                    return;
                }
                A4 a49 = this.f15531j;
                if (a49 != null) {
                    ((B4) a49).b("V6", "ad is expired - destroy");
                }
                C0();
            }
            e0();
            super.c0();
        } else {
            A4 a410 = this.f15531j;
            if (a410 != null) {
                ((B4) a410).b("V6", "An ad load is already in progress");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void j0() {
        if (p0()) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).a("V6", "renderAd without internet check");
            }
            D0();
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("V6", "renderAd");
        }
        a(new T6(this), new U6(this));
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final HashMap o() {
        HashMap hashMap = new HashMap();
        hashMap.put("a-parentViewWidth", String.valueOf(AbstractC1692k3.d().f15274a));
        hashMap.put("a-productVersion", "NS-1.0.0-20160411");
        hashMap.put("trackerType", "url_ping");
        return hashMap;
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final String q() {
        return "native";
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void r0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "signalSuccess");
        }
        C1819u v10 = v();
        int hashCode = hashCode();
        C1879y7 c1879y7 = new C1879y7(this);
        v10.getClass();
        C1819u.a(hashCode, c1879y7);
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        super.a(context);
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "setContainerContext");
        }
        r k10 = k();
        if (k10 instanceof M6) {
            ((M6) k10).a(context);
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void b(AbstractC1689k0 abstractC1689k0) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "handleAdScreenDisplayed");
        }
        if (Q() == 4) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).d("V6", "AdUnit " + this + " state change - RENDERED");
            }
            d((byte) 6);
        } else if (Q() == 6) {
            this.O++;
        }
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).a("InMobi", "Successfully displayed fullscreen for placement id: " + I());
        }
        if (this.O == 0) {
            if (abstractC1689k0 != null) {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).a("V6", "callback - onAdDisplayed");
                }
                d(abstractC1689k0);
                return;
            }
            A4 a46 = this.f15531j;
            if (a46 != null) {
                ((B4) a46).b("V6", "listener is null. cannot give AdDisplayed callback");
            }
        }
    }

    public final View a(View view, ViewGroup parent, int i10) {
        View view2;
        kotlin.jvm.internal.g.e(parent, "parent");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "getAdView");
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!M3.f14454a.a()) {
                C0();
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).b("V6", "dropping because of GDPR");
                }
                return null;
            } else if (W()) {
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    ((B4) a44).a("V6", "Ad has expired.");
                }
                C0();
                return null;
            } else if (Q() != 4 && Q() != 6) {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).b("V6", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                }
                Z5.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                A4 a46 = this.f15531j;
                if (a46 != null) {
                    ((B4) a46).b("V6", "Ad Load is not complete");
                }
                WeakReference weakReference = this.M;
                if (weakReference == null || (view2 = (View) weakReference.get()) == null) {
                    return null;
                }
                View view3 = new View(Ha.d());
                view3.setLayoutParams(view2.getLayoutParams());
                return view3;
            } else {
                M6 G = G();
                if (G != null) {
                    boolean z10 = this.N;
                    A4 a47 = G.f14468j;
                    if (a47 != null) {
                        String TAG = G.f14470l;
                        kotlin.jvm.internal.g.d(TAG, "TAG");
                        ((B4) a47).c(TAG, "showOnLockScreen - " + z10);
                    }
                    G.C = z10;
                    G.A = i10;
                    AbstractC1701kc viewableAd = G.getViewableAd();
                    r3 = viewableAd != null ? viewableAd.a(view, parent, true) : null;
                    this.M = new WeakReference(r3);
                    Handler D = D();
                    if (D != null) {
                        D.post(new n0.g(11, this, viewableAd));
                    }
                }
                return r3;
            }
        }
        A4 a48 = this.f15531j;
        if (a48 != null) {
            ((B4) a48).b("V6", "getPrimaryView called on background thread");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (short) 2150);
        return null;
    }

    public static final void a(V6 this$0, AbstractC1701kc abstractC1701kc) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 a42 = this$0.f15531j;
        if (a42 != null) {
            ((B4) a42).a("V6", "start tracking for impression");
        }
        if (abstractC1701kc != null) {
            abstractC1701kc.a((HashMap) null);
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void a(C1577c0 adSet) {
        kotlin.jvm.internal.g.e(adSet, "adSet");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "handleAdFetchSuccessful");
        }
        if (Q() == 1) {
            e(adSet);
        }
        if (!kotlin.jvm.internal.g.a("html", E()) && !kotlin.jvm.internal.g.a("htmlUrl", E()) && !kotlin.jvm.internal.g.a("unknown", E())) {
            super.a(adSet);
            return;
        }
        a(I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 57);
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).b("V6", "invalid markup. fetch failed");
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void a(AbstractC1689k0 abstractC1689k0) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "handleAdScreenDismissed");
        }
        if (Q() == 6) {
            int i10 = this.O;
            if (i10 > 0) {
                this.O = i10 - 1;
            } else {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).d("V6", "AdUnit " + this + " state - READY");
                }
                d((byte) 4);
            }
        }
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).a("InMobi", "Successfully dismissed fullscreen for placement id: " + I());
        }
        if (this.O == 0 && Q() == 4) {
            if (abstractC1689k0 != null) {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).a("V6", "callback - onAdDismissed");
                }
                abstractC1689k0.b();
            } else {
                A4 a46 = this.f15531j;
                if (a46 != null) {
                    ((B4) a46).b("V6", "Listener was garbage collected. Unable to give callback");
                }
            }
            A4 a47 = this.f15531j;
            if (a47 != null) {
                ((B4) a47).a();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void a(J placement, boolean z10) {
        kotlin.jvm.internal.g.e(placement, "placement");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "handleAssetAvailabilityChanged");
        }
        super.a(placement, z10);
        if (!z10) {
            if (kotlin.jvm.internal.g.a(I(), placement)) {
                if (2 == Q() || 4 == Q()) {
                    d((byte) 0);
                    A4 a43 = this.f15531j;
                    if (a43 != null) {
                        ((B4) a43).d("V6", "AdUnit " + this + " state - CREATED");
                    }
                    AbstractC1689k0 r4 = r();
                    if (r4 != null) {
                        r4.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                    }
                }
            }
        } else if (!kotlin.jvm.internal.g.a(I(), placement) || 2 != Q() || r() == null || t() == null) {
        } else {
            if (a0()) {
                c(true);
                f();
                return;
            }
            r0();
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final void a(boolean z10, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "onDidParseAfterFetch");
        }
        super.a(z10, status);
        if (Q() == 2) {
            AbstractC1689k0 r4 = r();
            if (r4 != null) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).a("V6", "callback - onFetchSuccess");
                }
                e(r4);
                return;
            }
            return;
        }
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).b("V6", "invalid state - ignore parse callback");
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.InterfaceC1645gc
    public final void a(C1646h ad2, boolean z10, short s4) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("V6", "onVastProcessCompleted");
        }
        try {
            if (!z10) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).b("V6", b.a.c("VAST processing failed - ", s4));
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s4);
                return;
            }
            try {
                super.a(ad2, z10, s4);
            } catch (IllegalStateException e10) {
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    ((B4) a44).b("V6", "Exception while onVastProcessCompleted : " + e10.getMessage());
                }
            }
            C1646h m10 = m();
            if (m10 == null) {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).b("V6", "current ad is null. failing");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
                return;
            }
            if (T() == 0) {
                if (!m10.G()) {
                    A4 a46 = this.f15531j;
                    if (a46 != null) {
                        ((B4) a46).c("V6", "start OMID session for HTML ad");
                    }
                    a(true, (S9) null);
                }
            } else {
                A4 a47 = this.f15531j;
                if (a47 != null) {
                    ((B4) a47).c("V6", "start OMID session for current AD");
                }
                a(m10);
            }
            if (m10.G()) {
                b(true);
                A4 a48 = this.f15531j;
                if (a48 != null) {
                    ((B4) a48).c("V6", "handleInterActive");
                }
                V();
            }
        } catch (Exception e11) {
            A4 a49 = this.f15531j;
            if (a49 != null) {
                ((B4) a49).a("V6", "Exception while loading ad.", e11);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 13);
        }
    }
}
