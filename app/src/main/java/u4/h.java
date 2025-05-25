package u4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.r;
import be.a;
import com.inmobi.ads.InMobiNative;
import pdf.pdfreader.viewer.editor.free.R;
import zd.a;

/* compiled from: InmobiNativeBanner.kt */
/* loaded from: classes.dex */
public final class h extends be.b {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public a.InterfaceC0036a f30190e;

    /* renamed from: h  reason: collision with root package name */
    public InMobiNative f30193h;

    /* renamed from: b  reason: collision with root package name */
    public final String f30188b = "InmobiNativeBanner";

    /* renamed from: d  reason: collision with root package name */
    public String f30189d = "";

    /* renamed from: f  reason: collision with root package name */
    public String f30191f = "";

    /* renamed from: g  reason: collision with root package name */
    public int f30192g = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f30194i = R.layout.ad_native_banner;

    /* renamed from: j  reason: collision with root package name */
    public int f30195j = R.layout.ad_native_banner_root;

    /* compiled from: InmobiNativeBanner.kt */
    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30197b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30198d;

        public a(Activity activity, a.C0429a c0429a, Context context) {
            this.f30197b = activity;
            this.c = c0429a;
            this.f30198d = context;
        }

        @Override // u4.d
        public final void a(boolean z10) {
            h hVar = h.this;
            if (z10) {
                String str = hVar.f30191f;
                Activity activity = this.f30197b;
                Context applicationContext = activity.getApplicationContext();
                try {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    kotlin.jvm.internal.g.d(applicationContext2, "context.applicationContext");
                    InMobiNative inMobiNative = new InMobiNative(applicationContext2, Long.parseLong(str), new i(applicationContext, hVar, activity));
                    hVar.f30193h = inMobiNative;
                    inMobiNative.load();
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = hVar.f30190e;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(hVar.f30188b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30198d, new yd.a(r.g(new StringBuilder(), hVar.f30188b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), hVar.f30188b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity context) {
        kotlin.jvm.internal.g.e(context, "context");
        InMobiNative inMobiNative = this.f30193h;
        if (inMobiNative != null) {
            inMobiNative.destroy();
        }
        this.f30193h = null;
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30188b);
        sb2.append('@');
        return b.a.d(this.f30191f, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30188b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30190e = interfaceC0036a;
            try {
                this.f30192g = (int) (applicationContext.getResources().getDisplayMetrics().density * 72);
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("account_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_ACCOUNT_ID, \"\")");
                this.f30189d = string;
                this.f30194i = bundle.getInt("layout_id", R.layout.ad_native_banner);
                this.f30195j = bundle.getInt("root_layout_id", R.layout.ad_native_banner_root);
                this.f30192g = bundle.getInt("icon_width_pixel", this.f30192g);
                if (TextUtils.isEmpty(this.f30189d)) {
                    ((a.C0429a) interfaceC0036a).a(applicationContext, new yd.a(str + ": accountId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":accountId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30191f = str2;
                    String str3 = b.f30157a;
                    b.a(activity, this.f30189d, new a(activity, (a.C0429a) interfaceC0036a, applicationContext));
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
        InMobiNative inMobiNative = this.f30193h;
        if (inMobiNative != null) {
            inMobiNative.pause();
        }
    }

    @Override // be.b
    public final void k() {
        InMobiNative inMobiNative = this.f30193h;
        if (inMobiNative != null) {
            inMobiNative.resume();
        }
