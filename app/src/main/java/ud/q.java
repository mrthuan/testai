package ud;

import android.app.Activity;
import android.os.Bundle;
import be.a;
import be.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import zd.c;

/* compiled from: AdManagerOpenAd.kt */
/* loaded from: classes2.dex */
public final class q extends be.c {
    public AppOpenAd c;

    /* renamed from: d  reason: collision with root package name */
    public a.InterfaceC0036a f30352d;

    /* renamed from: e  reason: collision with root package name */
    public j3.h f30353e;

    /* renamed from: f  reason: collision with root package name */
    public p f30354f;

    /* renamed from: g  reason: collision with root package name */
    public String f30355g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30356h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f30357i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f30360l;

    /* renamed from: b  reason: collision with root package name */
    public final String f30351b = "AdManagerOpenAd";

    /* renamed from: j  reason: collision with root package name */
    public String f30358j = "";

    /* renamed from: k  reason: collision with root package name */
    public long f30359k = -1;

    /* compiled from: AdManagerOpenAd.kt */
    /* loaded from: classes2.dex */
    public static final class a extends FullScreenContentCallback {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30362b;
        public final /* synthetic */ c.a c;

        public a(Activity activity, c.a aVar) {
            this.f30362b = activity;
            this.c = aVar;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            super.onAdClicked();
            q qVar = q.this;
            a.InterfaceC0036a interfaceC0036a = qVar.f30352d;
            if (interfaceC0036a != null) {
                interfaceC0036a.b(this.f30362b, new yd.d("AM", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, qVar.f30358j));
                a6.h.k(new StringBuilder(), qVar.f30351b, ":onAdClicked", fe.a.a());
                return;
            }
            kotlin.jvm.internal.g.i("listener");
            throw null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            q qVar = q.this;
            boolean z10 = qVar.f30360l;
            Activity activity = this.f30362b;
            if (!z10) {
                ge.i.b().e(activity);
            }
            fe.a.a().b("onAdDismissedFullScreenContent");
            a.InterfaceC0036a interfaceC0036a = qVar.f30352d;
            if (interfaceC0036a != null) {
                interfaceC0036a.f(activity);
                AppOpenAd appOpenAd = qVar.c;
                if (appOpenAd != null) {
                    appOpenAd.setFullScreenContentCallback(null);
                }
                qVar.c = null;
                return;
            }
            kotlin.jvm.internal.g.i("listener");
            throw null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            kotlin.jvm.internal.g.e(adError, "adError");
            Object lock = q.this.f5405a;
            kotlin.jvm.internal.g.d(lock, "lock");
            q qVar = q.this;
            Activity activity = this.f30362b;
            c.a aVar = this.c;
            synchronized (lock) {
                if (!qVar.f30360l) {
                    ge.i.b().e(activity);
                }
                fe.a a10 = fe.a.a();
                a10.b("onAdFailedToShowFullScreenContent:" + adError.f10006b);
                if (aVar != null) {
                    aVar.a(false);
                    tf.d dVar = tf.d.f30009a;
                }
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            a6.h.k(new StringBuilder(), q.this.f30351b, ":onAdImpression", fe.a.a());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            Object lock = q.this.f5405a;
            kotlin.jvm.internal.g.d(lock, "lock");
            q qVar = q.this;
            c.a aVar = this.c;
            synchronized (lock) {
                fe.a a10 = fe.a.a();
                a10.b(qVar.f30351b + " onAdShowedFullScreenContent");
                if (aVar != null) {
                    aVar.a(true);
                    tf.d dVar = tf.d.f30009a;
                }
            }
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        try {
            AppOpenAd appOpenAd = this.c;
            if (appOpenAd != null) {
                appOpenAd.setFullScreenContentCallback(null);
            }
            this.c = null;
            this.f30354f = null;
            fe.a a10 = fe.a.a();
            if (activity != null) {
                activity.getApplicationContext();
            }
            a10.b(this.f30351b + ":destroy");
        } catch (Throwable th2) {
            fe.a a11 = fe.a.a();
            if (activity != null) {
                activity.getApplicationContext();
            }
            a11.c(th2);
        }
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30351b);
        sb2.append('@');
        return b.a.d(this.f30358j, sb2);
    }

    @Override // be.a
    public final void d(final Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30351b;
        a6.h.k(sb2, str, ":load", a10);
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30352d = interfaceC0036a;
            this.f30353e = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.f30356h = bundle.getBoolean("ad_for_child");
                j3.h hVar2 = this.f30353e;
                if (hVar2 != null) {
                    this.f30355g = ((Bundle) hVar2.c).getString("common_config", "");
                    j3.h hVar3 = this.f30353e;
                    if (hVar3 != null) {
                        this.f30357i = ((Bundle) hVar3.c).getBoolean("skip_init");
                    } else {
                        kotlin.jvm.internal.g.i("adConfig");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i("adConfig");
                    throw null;
                }
            }
            if (this.f30356h) {
                ud.a.a();
            }
            final c.a aVar = (c.a) interfaceC0036a;
            wd.a.b(activity, this.f30357i, new wd.d() { // from class: ud.o
                @Override // wd.d
                public final void a(boolean z10) {
                    q this$0 = this;
                    kotlin.jvm.internal.g.e(this$0, "this$0");
                    Activity activity2 = activity;
                    activity2.runOnUiThread(new androidx.fragment.app.e(activity2, this$0, aVar, z10));
                }
            });
        } else if (interfaceC0036a != null) {
            ((c.a) interfaceC0036a).a(activity, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.c
    public final boolean k() {
        if (System.currentTimeMillis() - this.f30359k > 14400000) {
            this.c = null;
            return false;
        } else if (this.c == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override // be.c
    public final void l(Activity activity, c.a aVar) {
        if (activity != null) {
            if (k()) {
                a aVar2 = new a(activity, aVar);
                AppOpenAd appOpenAd = this.c;
                if (appOpenAd != null) {
                    appOpenAd.setFullScreenContentCallback(aVar2);
                }
                if (!this.f30360l) {
                    ge.i.b().d(activity);
                }
                AppOpenAd appOpenAd2 = this.c;
                if (appOpenAd2 != null) {
                    appOpenAd2.show(activity);
                    return;
                }
                return;
            }
            aVar.a(false);
            return;
        }
        throw new IllegalArgumentException("Admob OpenAd need activity context, please set a activity context!");
    }
}
