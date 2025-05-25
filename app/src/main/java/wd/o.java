package wd;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import be.a;
import be.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import zd.c;

/* compiled from: AdmobOpenAd.java */
/* loaded from: classes.dex */
public final class o extends be.c {
    public a.InterfaceC0036a c;

    /* renamed from: d  reason: collision with root package name */
    public q f31159d;

    /* renamed from: e  reason: collision with root package name */
    public j3.h f31160e;

    /* renamed from: f  reason: collision with root package name */
    public String f31161f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f31162g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f31163h;

    /* renamed from: b  reason: collision with root package name */
    public AppOpenAd f31158b = null;

    /* renamed from: i  reason: collision with root package name */
    public String f31164i = "";

    /* renamed from: j  reason: collision with root package name */
    public long f31165j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f31166k = false;

    /* compiled from: AdmobOpenAd.java */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31167a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0036a f31168b;

        /* compiled from: AdmobOpenAd.java */
        /* renamed from: wd.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0395a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f31169a;

            public RunnableC0395a(boolean z10) {
                this.f31169a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f31169a;
                a aVar = a.this;
                if (z10) {
                    o oVar = o.this;
                    j3.h hVar = oVar.f31160e;
                    Context applicationContext = aVar.f31167a.getApplicationContext();
                    Bundle bundle = (Bundle) hVar.c;
                    if (bundle != null) {
                        oVar.f31162g = bundle.getBoolean("ad_for_child");
                        oVar.f31161f = ((Bundle) hVar.c).getString("common_config", "");
                        oVar.f31163h = ((Bundle) hVar.c).getBoolean("skip_init");
                    }
                    if (oVar.f31162g) {
                        wd.a.f();
                    }
                    try {
                        oVar.f31164i = (String) hVar.f19039b;
                        AdRequest.Builder builder = new AdRequest.Builder();
                        oVar.f31159d = new q(oVar, applicationContext);
                        if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                            oVar.f31166k = false;
                            wd.a.e(oVar.f31166k);
                            AppOpenAd.load(applicationContext, oVar.f31164i, new AdRequest(builder), oVar.f31159d);
                            return;
                        }
                        oVar.f31166k = true;
                        wd.a.e(oVar.f31166k);
                        AppOpenAd.load(applicationContext, oVar.f31164i, new AdRequest(builder), oVar.f31159d);
                        return;
                    } catch (Throwable th2) {
                        a.InterfaceC0036a interfaceC0036a = oVar.c;
                        if (interfaceC0036a != null) {
                            interfaceC0036a.a(applicationContext, new yd.a("AdmobOpenAd:load exception, please check log", 0));
                        }
                        fe.a.a().c(th2);
                        return;
                    }
                }
                a.InterfaceC0036a interfaceC0036a2 = aVar.f31168b;
                if (interfaceC0036a2 != null) {
                    interfaceC0036a2.a(aVar.f31167a, new yd.a("AdmobOpenAd:Admob has not been inited or is initing", 0));
                }
            }
        }

        public a(Activity activity, c.a aVar) {
            this.f31167a = activity;
            this.f31168b = aVar;
        }

        @Override // wd.d
        public final void a(boolean z10) {
            fe.a a10 = fe.a.a();
            a10.b("AdmobOpenAd:Admob init " + z10);
            this.f31167a.runOnUiThread(new RunnableC0395a(z10));
        }
    }

    /* compiled from: AdmobOpenAd.java */
    /* loaded from: classes.dex */
    public class b extends FullScreenContentCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31171a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f31172b;

        public b(Activity activity, c.a aVar) {
            this.f31171a = activity;
            this.f31172b = aVar;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            super.onAdClicked();
            o oVar = o.this;
            a.InterfaceC0036a interfaceC0036a = oVar.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.b(this.f31171a, new yd.d("A", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, oVar.f31164i));
            }
            fe.a.a().b("AdmobOpenAd:onAdClicked");
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            o oVar = o.this;
            Activity activity = this.f31171a;
            if (activity != null) {
                if (!oVar.f31166k) {
                    ge.i.b().e(activity);
                }
                fe.a.a().b("onAdDismissedFullScreenContent");
                a.InterfaceC0036a interfaceC0036a = oVar.c;
                if (interfaceC0036a != null) {
                    interfaceC0036a.f(activity);
                }
            }
            AppOpenAd appOpenAd = oVar.f31158b;
            if (appOpenAd != null) {
                appOpenAd.setFullScreenContentCallback(null);
                oVar.f31158b = null;
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            synchronized (o.this.f5405a) {
                if (this.f31171a != null) {
                    if (!o.this.f31166k) {
                        ge.i.b().e(this.f31171a);
                    }
                    fe.a a10 = fe.a.a();
                    a10.b("onAdFailedToShowFullScreenContent:" + adError.f10006b);
                    c.a aVar = this.f31172b;
                    if (aVar != null) {
                        aVar.a(false);
                    }
                }
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            fe.a.a().b("AdmobOpenAd:onAdImpression");
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            synchronized (o.this.f5405a) {
                if (this.f31171a != null) {
                    fe.a.a().b("AdmobOpenAd onAdShowedFullScreenContent");
                    c.a aVar = this.f31172b;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
            }
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        try {
            AppOpenAd appOpenAd = this.f31158b;
            if (appOpenAd != null) {
                appOpenAd.setFullScreenContentCallback(null);
                this.f31158b = null;
            }
            this.c = null;
            this.f31159d = null;
            fe.a.a().b("AdmobOpenAd:destroy");
        } catch (Throwable th2) {
            fe.a.a().c(th2);
        }
    }

    @Override // be.a
    public final String b() {
        return b.a.d(this.f31164i, new StringBuilder("AdmobOpenAd@"));
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a.a().b("AdmobOpenAd:load");
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.c = interfaceC0036a;
            this.f31160e = hVar;
            wd.a.b(activity, this.f31163h, new a(activity, (c.a) interfaceC0036a));
        } else if (interfaceC0036a != null) {
            ((c.a) interfaceC0036a).a(activity, new yd.a("AdmobOpenAd:Please check params is right.", 0));
        } else {
            throw new IllegalArgumentException("AdmobOpenAd:Please check MediationListener is right.");
        }
    }

    @Override // be.c
    public final boolean k() {
        if (System.currentTimeMillis() - this.f31165j > 14400000) {
            this.f31158b = null;
            return false;
        } else if (this.f31158b == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override // be.c
    public final void l(Activity activity, c.a aVar) {
        if (activity instanceof Activity) {
            if (k()) {
                this.f31158b.setFullScreenContentCallback(new b(activity, aVar));
                if (!this.f31166k) {
                    ge.i.b().d(activity);
                }
                this.f31158b.show(activity);
                return;
            }
            aVar.a(false);
            return;
        }
        throw new IllegalArgumentException("Admob OpenAd need activity context, please set a activity context!");
    }
}
