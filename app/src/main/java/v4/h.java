package v4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import be.a;
import be.c;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import zd.c;

/* compiled from: PangleInterstitial.kt */
/* loaded from: classes.dex */
public final class h extends be.c {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public int f30567e;

    /* renamed from: f  reason: collision with root package name */
    public a.InterfaceC0036a f30568f;

    /* renamed from: h  reason: collision with root package name */
    public PAGInterstitialAd f30570h;

    /* renamed from: b  reason: collision with root package name */
    public final String f30565b = "PangleInterstitial";

    /* renamed from: d  reason: collision with root package name */
    public String f30566d = "";

    /* renamed from: g  reason: collision with root package name */
    public String f30569g = "";

    /* compiled from: PangleInterstitial.kt */
    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30572b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30573d;

        public a(Activity activity, c.a aVar, Context context) {
            this.f30572b = activity;
            this.c = aVar;
            this.f30573d = context;
        }

        @Override // v4.g
        public final void a(boolean z10) {
            h hVar = h.this;
            if (z10) {
                String str = hVar.f30569g;
                Activity activity = this.f30572b;
                Context applicationContext = activity.getApplicationContext();
                try {
                    PAGInterstitialAd.loadAd(str, new PAGInterstitialRequest(), new k(hVar, applicationContext, activity));
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = hVar.f30568f;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(hVar.f30565b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30573d, new yd.a(androidx.activity.r.g(new StringBuilder(), hVar.f30565b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), hVar.f30565b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        PAGInterstitialAd pAGInterstitialAd = this.f30570h;
        if (pAGInterstitialAd != null) {
            pAGInterstitialAd.setAdInteractionCallback(null);
        }
        PAGInterstitialAd pAGInterstitialAd2 = this.f30570h;
        if (pAGInterstitialAd2 != null) {
            pAGInterstitialAd2.setAdInteractionListener(null);
        }
        this.f30570h = null;
        this.f30568f = null;
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30565b);
        sb2.append('@');
        return b.a.d(this.f30569g, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30565b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30568f = interfaceC0036a;
            try {
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("app_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_APP_ID, \"\")");
                this.f30566d = string;
                this.f30567e = bundle.getInt("app_icon", this.f30567e);
                if (TextUtils.isEmpty(this.f30566d)) {
                    ((c.a) interfaceC0036a).a(applicationContext, new yd.a(str + ":appId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":appId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30569g = str2;
                    String str3 = b.f30540a;
                    b.a(activity, this.f30566d, this.f30567e, new a(activity, (c.a) interfaceC0036a, applicationContext));
                    return;
                }
                kotlin.jvm.internal.g.i("adConfig");
                throw null;
            } catch (Throwable th2) {
                fe.a.a().c(th2);
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                ((c.a) interfaceC0036a).a(applicationContext, new yd.a(g10.toString(), 0));
            }
        } else if (interfaceC0036a != null) {
            ((c.a) interfaceC0036a).a(applicationContext, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.c
    public final boolean k() {
        if (this.f30570h != null) {
            return true;
        }
        return false;
    }

    @Override // be.c
    public final void l(Activity activity, c.a aVar) {
        kotlin.jvm.internal.g.e(activity, "activity");
        try {
            if (k()) {
                PAGInterstitialAd pAGInterstitialAd = this.f30570h;
                if (pAGInterstitialAd != null) {
                    pAGInterstitialAd.show(activity);
                }
                aVar.a(true);
                return;
            }
            aVar.a(false);
        } catch (Throwable th2) {
            aVar.a(false);
            fe.a a10 = fe.a.a();
            activity.getApplicationContext();
            a10.c(th2);
        }
