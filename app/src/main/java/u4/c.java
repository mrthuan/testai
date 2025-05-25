package u4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.r;
import be.a;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;
import zd.a;

/* compiled from: InmobiBanner.kt */
/* loaded from: classes.dex */
public final class c extends be.b {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public a.InterfaceC0036a f30167e;

    /* renamed from: g  reason: collision with root package name */
    public InMobiBanner f30169g;

    /* renamed from: b  reason: collision with root package name */
    public final String f30165b = "InmobiBanner";

    /* renamed from: d  reason: collision with root package name */
    public String f30166d = "";

    /* renamed from: f  reason: collision with root package name */
    public String f30168f = "";

    /* compiled from: InmobiBanner.kt */
    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30171b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30172d;

        public a(Activity activity, a.C0429a c0429a, Context context) {
            this.f30171b = activity;
            this.c = c0429a;
            this.f30172d = context;
        }

        @Override // u4.d
        public final void a(boolean z10) {
            c cVar = c.this;
            if (z10) {
                cVar.l(this.f30171b, cVar.f30168f);
                return;
            }
            this.c.a(this.f30172d, new yd.a(r.g(new StringBuilder(), cVar.f30165b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), cVar.f30165b, ": init failed", fe.a.a());
        }
    }

    /* compiled from: InmobiBanner.kt */
    /* loaded from: classes.dex */
    public static final class b extends BannerAdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30173a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f30174b;
        public final /* synthetic */ Activity c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f30175d;

        public b(Context context, c cVar, Activity activity, FrameLayout frameLayout) {
            this.f30173a = context;
            this.f30174b = cVar;
            this.c = activity;
            this.f30175d = frameLayout;
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
        public final void onAdClicked(InMobiBanner inMobiBanner, Map params) {
            InMobiBanner ad2 = inMobiBanner;
            kotlin.jvm.internal.g.e(ad2, "ad");
            kotlin.jvm.internal.g.e(params, "params");
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            c cVar = this.f30174b;
            a6.h.k(sb2, cVar.f30165b, ":onAdClicked", a10);
            a.InterfaceC0036a interfaceC0036a = cVar.f30167e;
            if (interfaceC0036a != null) {
                interfaceC0036a.b(this.f30173a, new yd.d("IM", "B", cVar.f30168f));
            }
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public final void onAdDismissed(InMobiBanner ad2) {
            kotlin.jvm.internal.g.e(ad2, "ad");
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            c cVar = this.f30174b;
            a6.h.k(sb2, cVar.f30165b, ":onAdDismissed", a10);
            a.InterfaceC0036a interfaceC0036a = cVar.f30167e;
            if (interfaceC0036a != null) {
                interfaceC0036a.f(this.f30173a);
            }
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public final void onAdDisplayed(InMobiBanner ad2) {
            kotlin.jvm.internal.g.e(ad2, "ad");
            a6.h.k(new StringBuilder(), this.f30174b.f30165b, ":onAdDisplayed", fe.a.a());
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
        public final void onAdFetchSuccessful(InMobiBanner inMobiBanner, AdMetaInfo info) {
            InMobiBanner ad2 = inMobiBanner;
            kotlin.jvm.internal.g.e(ad2, "ad");
            kotlin.jvm.internal.g.e(info, "info");
            a6.h.k(new StringBuilder(), this.f30174b.f30165b, ":onAdFetchSuccessful", fe.a.a());
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
        public final void onAdImpression(InMobiBanner inMobiBanner) {
            InMobiBanner ad2 = inMobiBanner;
            kotlin.jvm.internal.g.e(ad2, "ad");
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            c cVar = this.f30174b;
            a6.h.k(sb2, cVar.f30165b, ":onAdImpression", a10);
            a.InterfaceC0036a interfaceC0036a = cVar.f30167e;
            if (interfaceC0036a != null) {
                interfaceC0036a.g(this.f30173a);
            }
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus status) {
            InMobiBanner ad2 = inMobiBanner;
            kotlin.jvm.internal.g.e(ad2, "ad");
            kotlin.jvm.internal.g.e(status, "status");
            c cVar = this.f30174b;
            a.InterfaceC0036a interfaceC0036a = cVar.f30167e;
            String str = cVar.f30165b;
            if (interfaceC0036a != null) {
                StringBuilder g10 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
                g10.append(status.getStatusCode());
                g10.append(' ');
                g10.append(status.getMessage());
                interfaceC0036a.a(this.f30173a, new yd.a(g10.toString(), 0));
            }
            fe.a a10 = fe.a.a();
            StringBuilder g11 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
            g11.append(status.getStatusCode());
            g11.append(' ');
            g11.append(status.getMessage());
            a10.b(g11.toString());
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
        public final void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo info) {
            InMobiBanner ad2 = inMobiBanner;
            kotlin.jvm.internal.g.e(ad2, "ad");
            kotlin.jvm.internal.g.e(info, "info");
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            c cVar = this.f30174b;
            a6.h.k(sb2, cVar.f30165b, ":onAdLoadSucceeded", a10);
            a.InterfaceC0036a interfaceC0036a = cVar.f30167e;
            if (interfaceC0036a != null) {
                interfaceC0036a.e(this.c, this.f30175d, new yd.d("IM", "B", cVar.f30168f));
            }
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public final void onRewardsUnlocked(InMobiBanner ad2, Map<Object, ? extends Object> rewards) {
            kotlin.jvm.internal.g.e(ad2, "ad");
            kotlin.jvm.internal.g.e(rewards, "rewards");
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            c cVar = this.f30174b;
            a6.h.k(sb2, cVar.f30165b, ":onRewardsUnlocked", a10);
            a.InterfaceC0036a interfaceC0036a = cVar.f30167e;
            if (interfaceC0036a != null) {
                interfaceC0036a.c();
            }
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public final void onUserLeftApplication(InMobiBanner ad2) {
            kotlin.jvm.internal.g.e(ad2, "ad");
            a6.h.k(new StringBuilder(), this.f30174b.f30165b, ":onUserLeftApplication", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity context) {
        kotlin.jvm.internal.g.e(context, "context");
        InMobiBanner inMobiBanner = this.f30169g;
        if (inMobiBanner != null) {
            inMobiBanner.destroy();
        }
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30165b);
        sb2.append('@');
        return b.a.d(this.f30168f, sb2);
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
        String str = this.f30165b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && (hVar = request.f32118b) != null) {
            this.f30167e = listener;
            try {
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("account_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_ACCOUNT_ID, \"\")");
                this.f30166d = string;
                if (TextUtils.isEmpty(string)) {
                    ((a.C0429a) listener).a(applicationContext, new yd.a(str + ": accountId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":accountId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30168f = str2;
                    String str3 = u4.b.f30157a;
                    u4.b.a(activity, this.f30166d, new a(activity, (a.C0429a) listener, applicationContext));
                    return;
                }
                kotlin.jvm.internal.g.i("adConfig");
                throw null;
            } catch (Throwable th2) {
                fe.a.a().c(th2);
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                ((a.C0429a) listener).a(applicationContext, new yd.a(g10.toString(), 0));
                return;
            }
        }
        ((a.C0429a) listener).a(applicationContext, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
    }

    @Override // be.b
    public final void j() {
        InMobiBanner inMobiBanner = this.f30169g;
        if (inMobiBanner != null) {
            inMobiBanner.pause();
        }
    }

    @Override // be.b
    public final void k() {
        InMobiBanner inMobiBanner = this.f30169g;
        if (inMobiBanner != null) {
            inMobiBanner.resume();
        }
    }

    public final void l(Activity activity, String str) {
        boolean z10;
        int i10;
        int i11;
        Context context = activity.getApplicationContext();
        try {
            kotlin.jvm.internal.g.d(context, "context");
            this.f30169g = new InMobiBanner(context, Long.parseLong(str));
            if ((activity.getResources().getConfiguration().screenLayout & 15) >= 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = 728;
            } else {
                i10 = 320;
            }
            int round = Math.round(i10 * activity.getResources().getDisplayMetrics().density);
            if (z10) {
                i11 = 90;
            } else {
                i11 = 50;
            }
            int round2 = Math.round(i11 * activity.getResources().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(round, round2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(layoutParams);
            InMobiBanner inMobiBanner = this.f30169g;
            if (inMobiBanner != null) {
                inMobiBanner.setLayoutParams(new LinearLayout.LayoutParams(round, round2));
            }
            frameLayout.addView(this.f30169g);
            InMobiBanner inMobiBanner2 = this.f30169g;
            if (inMobiBanner2 != null) {
                inMobiBanner2.setListener(new b(context, this, activity, frameLayout));
            }
            InMobiBanner inMobiBanner3 = this.f30169g;
            if (inMobiBanner3 != null) {
                inMobiBanner3.load();
            }
        } catch (Throwable th2) {
            a.InterfaceC0036a interfaceC0036a = this.f30167e;
            if (interfaceC0036a != null) {
                interfaceC0036a.a(context, new yd.a(this.f30165b + ":loadAd exception: " + th2.getMessage(), 0));
            }
            fe.a.a().c(th2);
        }
    }
