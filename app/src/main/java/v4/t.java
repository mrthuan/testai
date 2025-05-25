package v4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import be.a;
import be.c;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import zd.c;

/* compiled from: PangleOpenAd.kt */
/* loaded from: classes.dex */
public final class t extends be.c {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public int f30625e;

    /* renamed from: g  reason: collision with root package name */
    public a.InterfaceC0036a f30627g;

    /* renamed from: i  reason: collision with root package name */
    public PAGAppOpenAd f30629i;

    /* renamed from: b  reason: collision with root package name */
    public final String f30623b = "PangleOpenAd";

    /* renamed from: d  reason: collision with root package name */
    public String f30624d = "";

    /* renamed from: f  reason: collision with root package name */
    public int f30626f = 30000;

    /* renamed from: h  reason: collision with root package name */
    public String f30628h = "";

    /* compiled from: PangleOpenAd.kt */
    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30631b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30632d;

        public a(Activity activity, c.a aVar, Context context) {
            this.f30631b = activity;
            this.c = aVar;
            this.f30632d = context;
        }

        @Override // v4.g
        public final void a(boolean z10) {
            t tVar = t.this;
            if (z10) {
                String str = tVar.f30628h;
                Activity activity = this.f30631b;
                Context applicationContext = activity.getApplicationContext();
                try {
                    PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
                    pAGAppOpenRequest.setTimeout(tVar.f30626f);
                    PAGAppOpenAd.loadAd(str, pAGAppOpenRequest, new w(tVar, applicationContext, activity));
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = tVar.f30627g;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(tVar.f30623b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30632d, new yd.a(androidx.activity.r.g(new StringBuilder(), tVar.f30623b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), tVar.f30623b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        PAGAppOpenAd pAGAppOpenAd = this.f30629i;
        if (pAGAppOpenAd != null) {
            pAGAppOpenAd.setAdInteractionCallback(null);
        }
        PAGAppOpenAd pAGAppOpenAd2 = this.f30629i;
        if (pAGAppOpenAd2 != null) {
            pAGAppOpenAd2.setAdInteractionListener(null);
        }
        this.f30629i = null;
        this.f30627g = null;
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30623b);
        sb2.append('@');
        return b.a.d(this.f30628h, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30623b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30627g = interfaceC0036a;
            try {
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("app_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_APP_ID, \"\")");
                this.f30624d = string;
                this.f30625e = bundle.getInt("app_icon", this.f30625e);
                this.f30626f = bundle.getInt("time_out", this.f30626f);
                if (TextUtils.isEmpty(this.f30624d)) {
                    ((c.a) interfaceC0036a).a(applicationContext, new yd.a(str + ":appId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":appId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30628h = str2;
                    String str3 = b.f30540a;
                    b.a(activity, this.f30624d, this.f30625e, new a(activity, (c.a) interfaceC0036a, applicationContext));
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
        if (this.f30629i != null) {
            return true;
        }
        return false;
    }

    @Override // be.c
    public final void l(Activity activity, c.a aVar) {
        kotlin.jvm.internal.g.e(activity, "activity");
        try {
            if (k()) {
                PAGAppOpenAd pAGAppOpenAd = this.f30629i;
                if (pAGAppOpenAd != null) {
                    pAGAppOpenAd.show(activity);
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
