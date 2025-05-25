package u4;

import android.content.Context;
import be.a;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* compiled from: InmobiInterstitial.kt */
/* loaded from: classes.dex */
public final class f extends InterstitialAdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30184a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f30185b;

    public f(Context context, e eVar) {
        this.f30184a = context;
        this.f30185b = eVar;
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        InMobiInterstitial ad2 = inMobiInterstitial;
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f30185b;
        a6.h.k(sb2, eVar.f30176b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30184a, new yd.d("IM", "I", eVar.f30179f));
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDismissed(InMobiInterstitial ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f30185b;
        a6.h.k(sb2, eVar.f30176b, ":onAdDismissed", a10);
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        if (interfaceC0036a != null) {
            interfaceC0036a.f(this.f30184a);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayFailed(InMobiInterstitial ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f30185b;
        a6.h.k(sb2, eVar.f30176b, ":onAdDisplayFailed", a10);
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        if (interfaceC0036a != null) {
            interfaceC0036a.f(this.f30184a);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayed(InMobiInterstitial ad2, AdMetaInfo p12) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(p12, "p1");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f30185b;
        a6.h.k(sb2, eVar.f30176b, ":onAdDisplayed", a10);
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30184a);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdFetchFailed(InMobiInterstitial ad2, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(status, "status");
        e eVar = this.f30185b;
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        String str = eVar.f30176b;
        if (interfaceC0036a != null) {
            interfaceC0036a.a(this.f30184a, new yd.a(str + ":onAdFetchFailed, errorCode: " + status.getStatusCode() + ' ' + status.getMessage(), 0));
        }
        fe.a a10 = fe.a.a();
        a10.b(str + ":onAdFetchFailed, errorCode: " + status.getStatusCode() + ' ' + status.getMessage());
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo p12) {
        InMobiInterstitial p02 = inMobiInterstitial;
        kotlin.jvm.internal.g.e(p02, "p0");
        kotlin.jvm.internal.g.e(p12, "p1");
        a6.h.k(new StringBuilder(), this.f30185b.f30176b, ":onAdFetchSuccessful", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus status) {
        InMobiInterstitial ad2 = inMobiInterstitial;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(status, "status");
        e eVar = this.f30185b;
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        String str = eVar.f30176b;
        if (interfaceC0036a != null) {
            StringBuilder g10 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
            g10.append(status.getStatusCode());
            g10.append(' ');
            g10.append(status.getMessage());
            interfaceC0036a.a(this.f30184a, new yd.a(g10.toString(), 0));
        }
        fe.a a10 = fe.a.a();
        StringBuilder g11 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
        g11.append(status.getStatusCode());
        g11.append(' ');
        g11.append(status.getMessage());
        a10.b(g11.toString());
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo p12) {
        InMobiInterstitial ad2 = inMobiInterstitial;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(p12, "p1");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f30185b;
        a6.h.k(sb2, eVar.f30176b, ":onAdLoadSucceeded", a10);
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        if (interfaceC0036a != null) {
            interfaceC0036a.e(this.f30184a, null, new yd.d("IM", "I", eVar.f30179f));
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdWillDisplay(InMobiInterstitial ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30185b.f30176b, ":onAdWillDisplay", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onRewardsUnlocked(InMobiInterstitial ad2, Map<Object, Object> map) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f30185b;
        a6.h.k(sb2, eVar.f30176b, ":onRewardsUnlocked", a10);
        a.InterfaceC0036a interfaceC0036a = eVar.f30178e;
        if (interfaceC0036a != null) {
            interfaceC0036a.c();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onUserLeftApplication(InMobiInterstitial ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30185b.f30176b, ":onUserLeftApplication", fe.a.a());
    }
}
