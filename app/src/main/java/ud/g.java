package ud;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* compiled from: AdManagerInterstitial.kt */
/* loaded from: classes2.dex */
public final class g extends AdManagerInterstitialAdLoadCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f30303a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30304b;

    public g(h hVar, Context context) {
        this.f30303a = hVar;
        this.f30304b = context;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        kotlin.jvm.internal.g.e(loadAdError, "loadAdError");
        super.onAdFailedToLoad(loadAdError);
        h hVar = this.f30303a;
        a.InterfaceC0036a interfaceC0036a = hVar.c;
        if (interfaceC0036a != null) {
            StringBuilder sb2 = new StringBuilder();
            String str = hVar.f30305b;
            sb2.append(str);
            sb2.append(":onAdFailedToLoad errorCode:");
            sb2.append(loadAdError.f10005a);
            sb2.append(" -> ");
            sb2.append(loadAdError.f10006b);
            interfaceC0036a.a(this.f30304b, new yd.a(sb2.toString(), 0));
            fe.a a10 = fe.a.a();
            a10.b(str + ":onAdFailedToLoad");
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        AdManagerInterstitialAd interstitialAd = adManagerInterstitialAd;
        kotlin.jvm.internal.g.e(interstitialAd, "interstitialAd");
        super.onAdLoaded(interstitialAd);
        h hVar = this.f30303a;
        hVar.f30307e = interstitialAd;
        a.InterfaceC0036a interfaceC0036a = hVar.c;
        if (interfaceC0036a != null) {
            yd.d dVar = new yd.d("AM", "I", hVar.f30311i);
            Context context = this.f30304b;
            interfaceC0036a.e(context, null, dVar);
            InterstitialAd interstitialAd2 = hVar.f30307e;
            if (interstitialAd2 != null) {
                interstitialAd2.setOnPaidEventListener(new androidx.fragment.app.h(4, context, hVar));
            }
            a6.h.k(new StringBuilder(), hVar.f30305b, ":onAdLoaded", fe.a.a());
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }
}
