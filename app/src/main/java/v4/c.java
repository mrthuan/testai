package v4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import be.a;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import zd.a;

/* compiled from: PangleBanner.kt */
/* loaded from: classes.dex */
public final class c extends be.b {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public int f30551e;

    /* renamed from: f  reason: collision with root package name */
    public a.InterfaceC0036a f30552f;

    /* renamed from: h  reason: collision with root package name */
    public PAGBannerAd f30554h;

    /* renamed from: b  reason: collision with root package name */
    public final String f30549b = "PangleBanner";

    /* renamed from: d  reason: collision with root package name */
    public String f30550d = "";

    /* renamed from: g  reason: collision with root package name */
    public String f30553g = "";

    /* compiled from: PangleBanner.kt */
    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30556b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30557d;

        public a(Activity activity, a.C0429a c0429a, Context context) {
            this.f30556b = activity;
            this.c = c0429a;
            this.f30557d = context;
        }

        @Override // v4.g
        public final void a(boolean z10) {
            c cVar = c.this;
            if (z10) {
                String str = cVar.f30553g;
                Activity activity = this.f30556b;
                Context applicationContext = activity.getApplicationContext();
                try {
                    PAGBannerAd.loadAd(str, new PAGBannerRequest(PAGBannerSize.BANNER_W_320_H_50), new f(cVar, activity, applicationContext));
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = cVar.f30552f;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(cVar.f30549b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30557d, new yd.a(androidx.activity.r.g(new StringBuilder(), cVar.f30549b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), cVar.f30549b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        PAGBannerAd pAGBannerAd = this.f30554h;
        if (pAGBannerAd != null) {
            pAGBannerAd.setAdInteractionCallback(null);
        }
        PAGBannerAd pAGBannerAd2 = this.f30554h;
        if (pAGBannerAd2 != null) {
            pAGBannerAd2.setAdInteractionListener(null);
        }
        PAGBannerAd pAGBannerAd3 = this.f30554h;
        if (pAGBannerAd3 != null) {
            pAGBannerAd3.destroy();
        }
        this.f30554h = null;
        this.f30552f = null;
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30549b);
        sb2.append('@');
        return b.a.d(this.f30553g, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30549b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30552f = interfaceC0036a;
            try {
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("app_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_APP_ID, \"\")");
                this.f30550d = string;
                this.f30551e = bundle.getInt("app_icon", this.f30551e);
                if (TextUtils.isEmpty(this.f30550d)) {
                    ((a.C0429a) interfaceC0036a).a(applicationContext, new yd.a(str + ":appId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":appId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30553g = str2;
                    String str3 = b.f30540a;
                    b.a(activity, this.f30550d, this.f30551e, new a(activity, (a.C0429a) interfaceC0036a, applicationContext));
                    return;
                }
                kotlin.jvm.internal.g.i("adConfig");
                throw null;
            } catch (Throwable th2) {
                fe.a.a().c(th2);
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                ((a.C0429a) interfaceC0036a).a(applicationContext, new yd.a(g10.toString(), 0));
            }
        } else if (interfaceC0036a != null) {
            ((a.C0429a) interfaceC0036a).a(applicationContext, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.b
    public final void j() {
    }

    @Override // be.b
    public final void k() {
