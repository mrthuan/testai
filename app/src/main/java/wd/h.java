package wd;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import be.a;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import pdf.pdfreader.viewer.editor.free.R;
import zd.a;

/* compiled from: AdmobNativeBanner.java */
/* loaded from: classes.dex */
public final class h extends be.b {

    /* renamed from: b  reason: collision with root package name */
    public j3.h f31118b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31119d;

    /* renamed from: f  reason: collision with root package name */
    public NativeAd f31121f;

    /* renamed from: g  reason: collision with root package name */
    public a.InterfaceC0036a f31122g;

    /* renamed from: j  reason: collision with root package name */
    public String f31125j;

    /* renamed from: k  reason: collision with root package name */
    public String f31126k;

    /* renamed from: e  reason: collision with root package name */
    public int f31120e = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f31123h = R.layout.ad_native_banner;

    /* renamed from: i  reason: collision with root package name */
    public int f31124i = R.layout.ad_native_banner_root;

    /* compiled from: AdmobNativeBanner.java */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31127a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0036a f31128b;

        /* compiled from: AdmobNativeBanner.java */
        /* renamed from: wd.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0393a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f31129a;

            public RunnableC0393a(boolean z10) {
                this.f31129a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f31129a;
                a aVar = a.this;
                if (z10) {
                    h hVar = h.this;
                    j3.h hVar2 = hVar.f31118b;
                    Activity activity = aVar.f31127a;
                    Context applicationContext = activity.getApplicationContext();
                    try {
                        String str = (String) hVar2.f19039b;
                        if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                            wd.a.e(false);
                        }
                        hVar.f31126k = str;
                        AdLoader.Builder builder = new AdLoader.Builder(applicationContext.getApplicationContext(), str);
                        builder.b(new j(hVar, activity.getApplicationContext(), activity));
                        builder.c(new i(hVar, applicationContext));
                        NativeAdOptions.Builder builder2 = new NativeAdOptions.Builder();
                        builder2.c = false;
                        builder2.f10607a = false;
                        builder2.f10610e = hVar.f31120e;
                        builder2.f10608b = 2;
                        builder2.f10609d = new VideoOptions(new VideoOptions.Builder());
                        builder.d(new NativeAdOptions(builder2));
                        builder.a().a(new AdRequest(new AdRequest.Builder()));
                        return;
                    } catch (Throwable th2) {
                        a.InterfaceC0036a interfaceC0036a = hVar.f31122g;
                        if (interfaceC0036a != null) {
                            interfaceC0036a.a(applicationContext, new yd.a("AdmobNativeBanner:load exception, please check log", 0));
                        }
                        fe.a.a().c(th2);
                        return;
                    }
                }
                a.InterfaceC0036a interfaceC0036a2 = aVar.f31128b;
                if (interfaceC0036a2 != null) {
                    interfaceC0036a2.a(aVar.f31127a, new yd.a("AdmobNativeBanner:Admob has not been inited or is initing", 0));
                }
            }
        }

        public a(Activity activity, a.C0429a c0429a) {
            this.f31127a = activity;
            this.f31128b = c0429a;
        }

        @Override // wd.d
        public final void a(boolean z10) {
            this.f31127a.runOnUiThread(new RunnableC0393a(z10));
        }
    }

    @Override // be.a
    public final synchronized void a(Activity activity) {
        try {
            NativeAd nativeAd = this.f31121f;
            if (nativeAd != null) {
                nativeAd.destroy();
                this.f31121f = null;
            }
        } finally {
        }
    }

    @Override // be.a
    public final String b() {
        return b.a.d(this.f31126k, new StringBuilder("AdmobNativeBanner@"));
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a.a().b("AdmobNativeBanner:load");
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f31122g = interfaceC0036a;
            this.f31118b = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.c = bundle.getBoolean("ad_for_child");
                this.f31120e = ((Bundle) this.f31118b.c).getInt("ad_choices_position", 1);
                this.f31123h = ((Bundle) this.f31118b.c).getInt("layout_id", R.layout.ad_native_banner);
                this.f31124i = ((Bundle) this.f31118b.c).getInt("root_layout_id", R.layout.ad_native_banner_root);
                this.f31125j = ((Bundle) this.f31118b.c).getString("common_config", "");
                this.f31119d = ((Bundle) this.f31118b.c).getBoolean("skip_init");
            }
            if (this.c) {
                wd.a.f();
            }
            wd.a.b(activity, this.f31119d, new a(activity, (a.C0429a) interfaceC0036a));
        } else if (interfaceC0036a != null) {
            ((a.C0429a) interfaceC0036a).a(activity, new yd.a("AdmobNativeBanner:Please check params is right.", 0));
        } else {
            throw new IllegalArgumentException("AdmobNativeBanner:Please check MediationListener is right.");
        }
    }

    @Override // be.b
    public final void j() {
    }

    @Override // be.b
    public final void k() {
    }
}
