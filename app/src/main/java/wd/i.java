package wd;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: AdmobNativeBanner.java */
/* loaded from: classes.dex */
public final class i extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f31132b;

    public i(h hVar, Context context) {
        this.f31132b = hVar;
        this.f31131a = context;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        super.onAdClicked();
        fe.a.a().b("AdmobNativeBanner:onAdClicked");
        h hVar = this.f31132b;
        a.InterfaceC0036a interfaceC0036a = hVar.f31122g;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f31131a, new yd.d("A", "NB", hVar.f31126k));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
        fe.a.a().b("AdmobNativeBanner:onAdClosed");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder("AdmobNativeBanner:onAdFailedToLoad errorCode:");
        sb2.append(loadAdError.f10005a);
        sb2.append(" -> ");
        String str = loadAdError.f10006b;
        sb2.append(str);
        a10.b(sb2.toString());
        a.InterfaceC0036a interfaceC0036a = this.f31132b.f31122g;
        if (interfaceC0036a != null) {
            interfaceC0036a.a(this.f31131a, new yd.a("AdmobNativeBanner:onAdFailedToLoad errorCode:" + loadAdError.f10005a + " -> " + str, 0));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        a.InterfaceC0036a interfaceC0036a = this.f31132b.f31122g;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f31131a);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        fe.a.a().b("AdmobNativeBanner:onAdLoaded");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        fe.a.a().b("AdmobNativeBanner:onAdOpened");
    }
}
