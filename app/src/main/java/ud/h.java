package ud;

import android.app.Activity;
import android.os.Bundle;
import be.a;
import be.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import qb.i0;
import zd.c;

/* compiled from: AdManagerInterstitial.kt */
/* loaded from: classes2.dex */
public final class h extends be.c {
    public a.InterfaceC0036a c;

    /* renamed from: d  reason: collision with root package name */
    public j3.h f30306d;

    /* renamed from: e  reason: collision with root package name */
    public InterstitialAd f30307e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30308f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30309g;

    /* renamed from: h  reason: collision with root package name */
    public String f30310h;

    /* renamed from: k  reason: collision with root package name */
    public ee.b f30313k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f30314l;

    /* renamed from: b  reason: collision with root package name */
    public final String f30305b = "AdManagerInterstitial";

    /* renamed from: i  reason: collision with root package name */
    public String f30311i = "";

    /* renamed from: j  reason: collision with root package name */
    public String f30312j = "";

    /* compiled from: AdManagerInterstitial.kt */
    /* loaded from: classes2.dex */
    public static final class a extends FullScreenContentCallback {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30316b;

        public a(Activity activity) {
            this.f30316b = activity;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            super.onAdClicked();
            h hVar = h.this;
            a.InterfaceC0036a interfaceC0036a = hVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.b(this.f30316b, new yd.d("AM", "I", hVar.f30311i));
                a6.h.k(new StringBuilder(), hVar.f30305b, ":onAdClicked", fe.a.a());
                return;
            }
            kotlin.jvm.internal.g.i("listener");
            throw null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h hVar = h.this;
            boolean z10 = hVar.f30314l;
            Activity activity = this.f30316b;
            if (!z10) {
                ge.i.b().e(activity);
            }
            a.InterfaceC0036a interfaceC0036a = hVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.f(activity);
                fe.a a10 = fe.a.a();
                a10.b(hVar.f30305b + ":onAdDismissedFullScreenContent");
                hVar.m();
                return;
            }
            kotlin.jvm.internal.g.i("listener");
            throw null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            kotlin.jvm.internal.g.e(adError, "adError");
            super.onAdFailedToShowFullScreenContent(adError);
            h hVar = h.this;
            boolean z10 = hVar.f30314l;
            Activity activity = this.f30316b;
            if (!z10) {
                ge.i.b().e(activity);
            }
            a.InterfaceC0036a interfaceC0036a = hVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.f(activity);
                fe.a a10 = fe.a.a();
                a10.b(hVar.f30305b + ":onAdFailedToShowFullScreenContent:" + adError);
                hVar.m();
                return;
            }
            kotlin.jvm.internal.g.i("listener");
            throw null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            a6.h.k(new StringBuilder(), h.this.f30305b, ":onAdImpression", fe.a.a());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h hVar = h.this;
            a.InterfaceC0036a interfaceC0036a = hVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.g(this.f30316b);
                fe.a a10 = fe.a.a();
                a10.b(hVar.f30305b + ":onAdShowedFullScreenContent");
                hVar.m();
                return;
            }
            kotlin.jvm.internal.g.i("listener");
            throw null;
        }
    }

    @Override // be.a
    public final synchronized void a(Activity activity) {
        try {
            InterstitialAd interstitialAd = this.f30307e;
            if (interstitialAd != null) {
                interstitialAd.setFullScreenContentCallback(null);
            }
            this.f30307e = null;
            this.f30313k = null;
            fe.a a10 = fe.a.a();
            a10.b(this.f30305b + ":destroy");
        } finally {
        }
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30305b);
        sb2.append('@');
        return b.a.d(this.f30311i, sb2);
    }

    @Override // be.a
    public final void d(final Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30305b;
        a6.h.k(sb2, str, ":load", a10);
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.c = interfaceC0036a;
            this.f30306d = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.f30309g = bundle.getBoolean("ad_for_child");
                j3.h hVar2 = this.f30306d;
                if (hVar2 != null) {
                    this.f30310h = ((Bundle) hVar2.c).getString("common_config", "");
                    j3.h hVar3 = this.f30306d;
                    if (hVar3 != null) {
                        String string = ((Bundle) hVar3.c).getString("ad_position_key", "");
                        kotlin.jvm.internal.g.d(string, "adConfig.params.getString(KEY_AD_POSITION_KEY, \"\")");
                        this.f30312j = string;
                        j3.h hVar4 = this.f30306d;
                        if (hVar4 != null) {
                            this.f30308f = ((Bundle) hVar4.c).getBoolean("skip_init");
                        } else {
                            kotlin.jvm.internal.g.i("adConfig");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i("adConfig");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i("adConfig");
                    throw null;
                }
            }
            if (this.f30309g) {
                ud.a.a();
            }
            final c.a aVar = (c.a) interfaceC0036a;
            wd.a.b(activity, this.f30308f, new wd.d() { // from class: ud.f
                @Override // wd.d
                public final void a(boolean z10) {
                    Activity activity2 = activity;
                    a.InterfaceC0036a interfaceC0036a2 = aVar;
                    h this$0 = this;
                    kotlin.jvm.internal.g.e(this$0, "this$0");
                    activity2.runOnUiThread(new i0(z10, this$0, activity2, interfaceC0036a2, 1));
                }
            });
        } else if (interfaceC0036a != null) {
            ((c.a) interfaceC0036a).a(activity, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.c
    public final synchronized boolean k() {
        boolean z10;
        if (this.f30307e != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // be.c
    public final void l(Activity context, c.a aVar) {
        kotlin.jvm.internal.g.e(context, "context");
        try {
            ee.b j10 = be.c.j(context, this.f30312j, this.f30310h);
            this.f30313k = j10;
            if (j10 != null) {
                j10.f16564b = new c5.f(this, context, aVar);
                kotlin.jvm.internal.g.b(j10);
                j10.show();
            } else {
                n(context, aVar);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            m();
            aVar.a(false);
        }
    }

    public final void m() {
        try {
            ee.b bVar = this.f30313k;
            if (bVar != null) {
                kotlin.jvm.internal.g.b(bVar);
                if (bVar.isShowing()) {
                    ee.b bVar2 = this.f30313k;
                    kotlin.jvm.internal.g.b(bVar2);
                    bVar2.dismiss();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void n(Activity activity, c.a aVar) {
        boolean z10;
        try {
            InterstitialAd interstitialAd = this.f30307e;
            if (interstitialAd != null) {
                interstitialAd.setFullScreenContentCallback(new a(activity));
            }
            if (!this.f30314l) {
                ge.i.b().d(activity);
            }
            InterstitialAd interstitialAd2 = this.f30307e;
            if (interstitialAd2 != null) {
                interstitialAd2.show(activity);
            }
            z10 = true;
        } catch (Exception e10) {
            e10.printStackTrace();
            m();
            z10 = false;
        }
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
