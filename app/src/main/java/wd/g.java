package wd;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: AdmobInterstitial.java */
/* loaded from: classes.dex */
public final class g extends InterstitialAdLoadCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31116a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f31117b;

    public g(e eVar, Context context) {
        this.f31117b = eVar;
        this.f31116a = context;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        a.InterfaceC0036a interfaceC0036a = this.f31117b.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.a(this.f31116a, new yd.a("AdmobInterstitial:onAdFailedToLoad errorCode:" + loadAdError.f10005a + " -> " + loadAdError.f10006b, 0));
        }
        fe.a.a().b("AdmobInterstitial:onAdFailedToLoad");
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        super.onAdLoaded(interstitialAd2);
        e eVar = this.f31117b;
        eVar.f31098b = interstitialAd2;
        a.InterfaceC0036a interfaceC0036a = eVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.e(this.f31116a, null, new yd.d("A", "I", eVar.f31104i));
            InterstitialAd interstitialAd3 = eVar.f31098b;
            if (interstitialAd3 != null) {
                interstitialAd3.setOnPaidEventListener(new f(this));
            }
        }
        fe.a.a().b("AdmobInterstitial:onAdLoaded");
    }
}
