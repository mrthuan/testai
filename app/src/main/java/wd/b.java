package wd;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import be.a;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import zd.a;

/* compiled from: AdmobBanner.java */
/* loaded from: classes.dex */
public final class b extends be.b {

    /* renamed from: b  reason: collision with root package name */
    public a.InterfaceC0036a f31084b;
    public j3.h c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31085d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31086e;

    /* renamed from: f  reason: collision with root package name */
    public AdView f31087f;

    /* renamed from: g  reason: collision with root package name */
    public String f31088g;

    /* renamed from: h  reason: collision with root package name */
    public String f31089h = "";

    /* renamed from: i  reason: collision with root package name */
    public int f31090i = -1;

    /* compiled from: AdmobBanner.java */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31091a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0036a f31092b;

        /* compiled from: AdmobBanner.java */
        /* renamed from: wd.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0391a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f31093a;

            public RunnableC0391a(boolean z10) {
                this.f31093a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f31093a;
                a aVar = a.this;
                if (z10) {
                    b bVar = b.this;
                    j3.h hVar = bVar.c;
                    Activity activity = aVar.f31091a;
                    Context applicationContext = activity.getApplicationContext();
                    try {
                        if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                            wd.a.e(false);
                        }
                        AdView adView = new AdView(applicationContext.getApplicationContext());
                        bVar.f31087f = adView;
                        String str = (String) hVar.f19039b;
                        bVar.f31089h = str;
                        adView.setAdUnitId(str);
                        bVar.f31087f.setAdSize(bVar.l(activity));
                        bVar.f31087f.b(new AdRequest(new AdRequest.Builder()));
                        bVar.f31087f.setAdListener(new c(bVar, activity, applicationContext));
                        return;
                    } catch (Throwable th2) {
                        a.InterfaceC0036a interfaceC0036a = bVar.f31084b;
                        if (interfaceC0036a != null) {
                            interfaceC0036a.a(applicationContext, new yd.a("AdmobBanner:load exception, please check log", 0));
                        }
                        fe.a.a().c(th2);
                        return;
                    }
                }
                a.InterfaceC0036a interfaceC0036a2 = aVar.f31092b;
                if (interfaceC0036a2 != null) {
                    interfaceC0036a2.a(aVar.f31091a, new yd.a("AdmobBanner:Admob has not been inited or is initing", 0));
                }
            }
        }

        public a(Activity activity, a.C0429a c0429a) {
            this.f31091a = activity;
            this.f31092b = c0429a;
        }

        @Override // wd.d
        public final void a(boolean z10) {
            this.f31091a.runOnUiThread(new RunnableC0391a(z10));
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        AdView adView = this.f31087f;
        if (adView != null) {
            adView.setAdListener(null);
            this.f31087f.a();
            this.f31087f = null;
        }
        fe.a.a().b("AdmobBanner:destroy");
    }

    @Override // be.a
    public final String b() {
        return b.a.d(this.f31089h, new StringBuilder("AdmobBanner@"));
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a.a().b("AdmobBanner:load");
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f31084b = interfaceC0036a;
            this.c = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.f31085d = bundle.getBoolean("ad_for_child");
                this.f31088g = ((Bundle) this.c.c).getString("common_config", "");
                this.f31086e = ((Bundle) this.c.c).getBoolean("skip_init");
                this.f31090i = ((Bundle) this.c.c).getInt("max_height");
            }
            if (this.f31085d) {
                wd.a.f();
            }
            wd.a.b(activity, this.f31086e, new a(activity, (a.C0429a) interfaceC0036a));
        } else if (interfaceC0036a != null) {
            ((a.C0429a) interfaceC0036a).a(activity, new yd.a("AdmobBanner:Please check params is right.", 0));
        } else {
            throw new IllegalArgumentException("AdmobBanner:Please check MediationListener is right.");
        }
    }

    @Override // be.b
    public final void j() {
        AdView adView = this.f31087f;
        if (adView != null) {
            adView.c();
        }
    }

    @Override // be.b
    public final void k() {
        AdView adView = this.f31087f;
        if (adView != null) {
            adView.d();
        }
    }

    public final AdSize l(Activity activity) {
        AdSize c;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i11 = this.f31090i;
        if (i11 <= 0) {
            c = AdSize.a(activity, i10);
        } else {
            c = AdSize.c(i10, i11);
        }
        fe.a a10 = fe.a.a();
        a10.b(c.d(activity) + " # " + c.b(activity));
        fe.a a11 = fe.a.a();
        a11.b(c.f10024a + " # " + c.f10025b);
        return c;
    }
}
