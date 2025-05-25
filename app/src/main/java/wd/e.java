package wd;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import be.a;
import be.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import ee.b;
import zd.c;

/* compiled from: AdmobInterstitial.java */
/* loaded from: classes.dex */
public final class e extends be.c {

    /* renamed from: b  reason: collision with root package name */
    public InterstitialAd f31098b;
    public a.InterfaceC0036a c;

    /* renamed from: d  reason: collision with root package name */
    public j3.h f31099d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31100e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31101f;

    /* renamed from: g  reason: collision with root package name */
    public String f31102g;

    /* renamed from: h  reason: collision with root package name */
    public String f31103h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f31104i = "";

    /* renamed from: j  reason: collision with root package name */
    public ee.b f31105j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f31106k = false;

    /* compiled from: AdmobInterstitial.java */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31107a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0036a f31108b;

        /* compiled from: AdmobInterstitial.java */
        /* renamed from: wd.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0392a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f31109a;

            public RunnableC0392a(boolean z10) {
                this.f31109a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f31109a;
                a aVar = a.this;
                if (z10) {
                    e eVar = e.this;
                    j3.h hVar = eVar.f31099d;
                    Context applicationContext = aVar.f31107a.getApplicationContext();
                    try {
                        String str = (String) hVar.f19039b;
                        eVar.f31104i = str;
                        AdRequest.Builder builder = new AdRequest.Builder();
                        if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                            eVar.f31106k = false;
                            wd.a.e(eVar.f31106k);
                            InterstitialAd.load(applicationContext.getApplicationContext(), str, new AdRequest(builder), new g(eVar, applicationContext));
                            return;
                        }
                        eVar.f31106k = true;
                        wd.a.e(eVar.f31106k);
                        InterstitialAd.load(applicationContext.getApplicationContext(), str, new AdRequest(builder), new g(eVar, applicationContext));
                        return;
                    } catch (Throwable th2) {
                        a.InterfaceC0036a interfaceC0036a = eVar.c;
                        if (interfaceC0036a != null) {
                            interfaceC0036a.a(applicationContext, new yd.a("AdmobInterstitial:load exception, please check log", 0));
                        }
                        fe.a.a().c(th2);
                        return;
                    }
                }
                a.InterfaceC0036a interfaceC0036a2 = aVar.f31108b;
                if (interfaceC0036a2 != null) {
                    interfaceC0036a2.a(aVar.f31107a, new yd.a("AdmobInterstitial:Admob has not been inited or is initing", 0));
                }
            }
        }

        public a(Activity activity, c.a aVar) {
            this.f31107a = activity;
            this.f31108b = aVar;
        }

        @Override // wd.d
        public final void a(boolean z10) {
            this.f31107a.runOnUiThread(new RunnableC0392a(z10));
        }
    }

    /* compiled from: AdmobInterstitial.java */
    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0211b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31111a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f31112b;

        public b(Activity activity, c.a aVar) {
            this.f31111a = activity;
            this.f31112b = aVar;
        }

        @Override // ee.b.InterfaceC0211b
        public final void a() {
            e.this.n(this.f31111a, this.f31112b);
        }
    }

    /* compiled from: AdmobInterstitial.java */
    /* loaded from: classes.dex */
    public class c extends FullScreenContentCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31113a;

        public c(Context context) {
            this.f31113a = context;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            super.onAdClicked();
            e eVar = e.this;
            a.InterfaceC0036a interfaceC0036a = eVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.b(this.f31113a, new yd.d("A", "I", eVar.f31104i));
            }
            fe.a.a().b("AdmobInterstitial:onAdClicked");
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            e eVar = e.this;
            boolean z10 = eVar.f31106k;
            Context context = this.f31113a;
            if (!z10) {
                ge.i.b().e(context);
            }
            a.InterfaceC0036a interfaceC0036a = eVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.f(context);
            }
            fe.a.a().b("AdmobInterstitial:onAdDismissedFullScreenContent");
            eVar.m();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            e eVar = e.this;
            boolean z10 = eVar.f31106k;
            Context context = this.f31113a;
            if (!z10) {
                ge.i.b().e(context);
            }
            a.InterfaceC0036a interfaceC0036a = eVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.f(context);
            }
            fe.a a10 = fe.a.a();
            a10.b("AdmobInterstitial:onAdFailedToShowFullScreenContent:" + adError.toString());
            eVar.m();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            fe.a.a().b("AdmobInterstitial:onAdImpression");
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            e eVar = e.this;
            a.InterfaceC0036a interfaceC0036a = eVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.g(this.f31113a);
            }
            fe.a.a().b("AdmobInterstitial:onAdShowedFullScreenContent");
            eVar.m();
        }
    }

    @Override // be.a
    public final synchronized void a(Activity activity) {
        try {
            InterstitialAd interstitialAd = this.f31098b;
            if (interstitialAd != null) {
                interstitialAd.setFullScreenContentCallback(null);
                this.f31098b = null;
                this.f31105j = null;
            }
            fe.a.a().b("AdmobInterstitial:destroy");
        } catch (Throwable th2) {
            fe.a.a().c(th2);
        }
    }

    @Override // be.a
    public final String b() {
        return b.a.d(this.f31104i, new StringBuilder("AdmobInterstitial@"));
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a.a().b("AdmobInterstitial:load");
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.c = interfaceC0036a;
            this.f31099d = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.f31100e = bundle.getBoolean("ad_for_child");
                this.f31102g = ((Bundle) this.f31099d.c).getString("common_config", "");
                this.f31103h = ((Bundle) this.f31099d.c).getString("ad_position_key", "");
                this.f31101f = ((Bundle) this.f31099d.c).getBoolean("skip_init");
            }
            if (this.f31100e) {
                wd.a.f();
            }
            wd.a.b(activity, this.f31101f, new a(activity, (c.a) interfaceC0036a));
        } else if (interfaceC0036a != null) {
            ((c.a) interfaceC0036a).a(activity, new yd.a("AdmobInterstitial:Please check params is right.", 0));
        } else {
            throw new IllegalArgumentException("AdmobInterstitial:Please check MediationListener is right.");
        }
    }

    @Override // be.c
    public final synchronized boolean k() {
        if (this.f31098b != null) {
            return true;
        }
        return false;
    }

    @Override // be.c
    public final synchronized void l(Activity activity, c.a aVar) {
        activity.getApplicationContext();
        ee.b j10 = be.c.j(activity, this.f31103h, this.f31102g);
        this.f31105j = j10;
        if (j10 != null) {
            j10.f16564b = new b(activity, aVar);
            j10.show();
        } else {
            n(activity, aVar);
        }
    }

    public final void m() {
        try {
            ee.b bVar = this.f31105j;
            if (bVar != null && bVar.isShowing()) {
                this.f31105j.dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void n(Activity activity, c.a aVar) {
        Context applicationContext = activity.getApplicationContext();
        boolean z10 = false;
        try {
            InterstitialAd interstitialAd = this.f31098b;
            if (interstitialAd != null) {
                interstitialAd.setFullScreenContentCallback(new c(applicationContext));
                if (!this.f31106k) {
                    ge.i.b().d(applicationContext);
                }
                this.f31098b.show(activity);
                z10 = true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            m();
        }
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
