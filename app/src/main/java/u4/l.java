package u4;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.activity.r;
import be.a;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;

/* compiled from: InmobiNativeCard.kt */
/* loaded from: classes.dex */
public final class l extends NativeAdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f30217b;
    public final /* synthetic */ Activity c;

    public l(Context context, k kVar, Activity activity) {
        this.f30216a = context;
        this.f30217b = kVar;
        this.c = activity;
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdClicked(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f30217b;
        a6.h.k(sb2, kVar.f30203b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = kVar.f30205e;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30216a, new yd.d("IM", "NC", kVar.f30206f));
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdFetchSuccessful(InMobiNative inMobiNative, AdMetaInfo p12) {
        InMobiNative ad2 = inMobiNative;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(p12, "p1");
        a6.h.k(new StringBuilder(), this.f30217b.f30203b, ":onAdReceived", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenDismissed(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30217b.f30203b, ":onAdFullScreenDismissed", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenDisplayed(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30217b.f30203b, ":onAdFullScreenDisplayed", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenWillDisplay(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30217b.f30203b, ":onAdFullScreenWillDisplay", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdImpressed(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f30217b;
        a6.h.k(sb2, kVar.f30203b, ":onAdImpressed", a10);
        a.InterfaceC0036a interfaceC0036a = kVar.f30205e;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30216a);
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus status) {
        InMobiNative ad2 = inMobiNative;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(status, "status");
        k kVar = this.f30217b;
        a.InterfaceC0036a interfaceC0036a = kVar.f30205e;
        String str = kVar.f30203b;
        if (interfaceC0036a != null) {
            StringBuilder g10 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
            g10.append(status.getStatusCode());
            g10.append(' ');
            g10.append(status.getMessage());
            interfaceC0036a.a(this.f30216a, new yd.a(g10.toString(), 0));
        }
        fe.a a10 = fe.a.a();
        StringBuilder g11 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
        g11.append(status.getStatusCode());
        g11.append(' ');
        g11.append(status.getMessage());
        a10.b(g11.toString());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo p12) {
        InMobiNative ad2 = inMobiNative;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(p12, "p1");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f30217b;
        a6.h.k(sb2, kVar.f30203b, ":onAdLoadSucceeded", a10);
        kVar.f30210j = ad2;
        a.InterfaceC0036a interfaceC0036a = kVar.f30205e;
        if (interfaceC0036a != null) {
            boolean d10 = interfaceC0036a.d();
            Context context = this.f30216a;
            if (d10) {
                View j10 = kVar.j(this.c, kVar.f30207g, -1);
                if (j10 != null) {
                    interfaceC0036a.e(context, j10, new yd.d("IM", "NC", kVar.f30206f));
                    return;
                } else {
                    interfaceC0036a.a(context, new yd.a(r.g(new StringBuilder(), kVar.f30203b, ":onAdLoadFailed view == null"), 0));
                    return;
                }
            }
            interfaceC0036a.e(context, null, new yd.d("IM", "NC", kVar.f30206f));
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdStatusChanged(InMobiNative nativeAd) {
        kotlin.jvm.internal.g.e(nativeAd, "nativeAd");
        a6.h.k(new StringBuilder(), this.f30217b.f30203b, ":onAdStatusChanged", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onUserWillLeaveApplication(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30217b.f30203b, ":onUserWillLeaveApplication", fe.a.a());
    }
}
