package v4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import be.a;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import pdf.pdfreader.viewer.editor.free.R;
import zd.a;

/* compiled from: PangleNativeBanner.kt */
/* loaded from: classes.dex */
public final class n extends be.b {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public int f30587e;

    /* renamed from: f  reason: collision with root package name */
    public a.InterfaceC0036a f30588f;

    /* renamed from: j  reason: collision with root package name */
    public PAGNativeAd f30592j;

    /* renamed from: b  reason: collision with root package name */
    public final String f30585b = "PangleNativeBanner";

    /* renamed from: d  reason: collision with root package name */
    public String f30586d = "";

    /* renamed from: g  reason: collision with root package name */
    public String f30589g = "";

    /* renamed from: h  reason: collision with root package name */
    public int f30590h = R.layout.ad_native_banner;

    /* renamed from: i  reason: collision with root package name */
    public int f30591i = R.layout.ad_native_banner_root;

    /* compiled from: PangleNativeBanner.kt */
    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30594b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30595d;

        public a(Activity activity, a.C0429a c0429a, Context context) {
            this.f30594b = activity;
            this.c = c0429a;
            this.f30595d = context;
        }

        @Override // v4.g
        public final void a(boolean z10) {
            n nVar = n.this;
            if (z10) {
                String str = nVar.f30589g;
                Activity activity = this.f30594b;
                Context applicationContext = activity.getApplicationContext();
                try {
                    PAGNativeAd.loadAd(nVar.f30589g, new PAGNativeRequest(), new p(nVar, applicationContext, activity));
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = nVar.f30588f;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(nVar.f30585b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30595d, new yd.a(androidx.activity.r.g(new StringBuilder(), nVar.f30585b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), nVar.f30585b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        this.f30592j = null;
        this.f30588f = null;
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30585b);
        sb2.append('@');
        return b.a.d(this.f30589g, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30585b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30588f = interfaceC0036a;
            try {
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("app_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_APP_ID, \"\")");
                this.f30586d = string;
                this.f30587e = bundle.getInt("app_icon", this.f30587e);
                this.f30590h = bundle.getInt("layout_id", R.layout.ad_native_banner);
                this.f30591i = bundle.getInt("root_layout_id", R.layout.ad_native_banner_root);
                if (TextUtils.isEmpty(this.f30586d)) {
                    ((a.C0429a) interfaceC0036a).a(applicationContext, new yd.a(str + ":appId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":appId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30589g = str2;
                    String str3 = b.f30540a;
                    b.a(activity, this.f30586d, this.f30587e, new a(activity, (a.C0429a) interfaceC0036a, applicationContext));
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
