package u4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.r;
import be.a;
import be.c;
import com.inmobi.ads.InMobiInterstitial;
import zd.c;

/* compiled from: InmobiInterstitial.kt */
/* loaded from: classes.dex */
public final class e extends be.c {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public a.InterfaceC0036a f30178e;

    /* renamed from: g  reason: collision with root package name */
    public InMobiInterstitial f30180g;

    /* renamed from: b  reason: collision with root package name */
    public final String f30176b = "InmobiInterstitial";

    /* renamed from: d  reason: collision with root package name */
    public String f30177d = "";

    /* renamed from: f  reason: collision with root package name */
    public String f30179f = "";

    /* compiled from: InmobiInterstitial.kt */
    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30182b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30183d;

        public a(Activity activity, c.a aVar, Context context) {
            this.f30182b = activity;
            this.c = aVar;
            this.f30183d = context;
        }

        @Override // u4.d
        public final void a(boolean z10) {
            e eVar = e.this;
            if (z10) {
                String str = eVar.f30179f;
                Context applicationContext = this.f30182b.getApplicationContext();
                try {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    kotlin.jvm.internal.g.d(applicationContext2, "context.applicationContext");
                    InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(applicationContext2, Long.parseLong(str), new f(applicationContext, eVar));
                    eVar.f30180g = inMobiInterstitial;
                    inMobiInterstitial.load();
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(eVar.f30176b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30183d, new yd.a(r.g(new StringBuilder(), eVar.f30176b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), eVar.f30176b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        this.f30180g = null;
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30176b);
        sb2.append('@');
        return b.a.d(this.f30179f, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c request, a.InterfaceC0036a listener) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(request, "request");
        kotlin.jvm.internal.g.e(listener, "listener");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30176b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && (hVar = request.f32118b) != null) {
            this.f30178e = listener;
            try {
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("account_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_ACCOUNT_ID, \"\")");
                this.f30177d = string;
                if (TextUtils.isEmpty(string)) {
                    ((c.a) listener).a(applicationContext, new yd.a(str + ": accountId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":accountId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30179f = str2;
                    String str3 = b.f30157a;
                    b.a(activity, this.f30177d, new a(activity, (c.a) listener, applicationContext));
                    return;
                }
                kotlin.jvm.internal.g.i("adConfig");
                throw null;
            } catch (Throwable th2) {
                fe.a.a().c(th2);
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                ((c.a) listener).a(applicationContext, new yd.a(g10.toString(), 0));
                return;
            }
        }
        ((c.a) listener).a(applicationContext, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
    }

    @Override // be.c
    public final boolean k() {
        InMobiInterstitial inMobiInterstitial = this.f30180g;
        if (inMobiInterstitial != null) {
            kotlin.jvm.internal.g.b(inMobiInterstitial);
            return inMobiInterstitial.isReady();
        }
        return false;
    }

    @Override // be.c
    public final void l(Activity activity, c.a aVar) {
        try {
            if (k()) {
                InMobiInterstitial inMobiInterstitial = this.f30180g;
                if (inMobiInterstitial != null) {
                    inMobiInterstitial.show();
                }
                aVar.a(true);
                return;
            }
            aVar.a(false);
        } catch (Throwable th2) {
            aVar.a(false);
            fe.a.a().c(th2);
        }
