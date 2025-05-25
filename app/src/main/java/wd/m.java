package wd;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: AdmobNativeCard.java */
/* loaded from: classes.dex */
public final class m extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f31154b;

    public m(l lVar, Context context) {
        this.f31154b = lVar;
        this.f31153a = context;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        super.onAdClicked();
        fe.a.a().b("AdmobNativeCard:onAdClicked");
        l lVar = this.f31154b;
        a.InterfaceC0036a interfaceC0036a = lVar.f31142h;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f31153a, new yd.d("A", "NC", lVar.f31145k));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
        fe.a.a().b("AdmobNativeCard:onAdClosed");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder("AdmobNativeCard:onAdFailedToLoad errorCode:");
        sb2.append(loadAdError.f10005a);
        sb2.append(" -> ");
        String str = loadAdError.f10006b;
        sb2.append(str);
        a10.b(sb2.toString());
        a.InterfaceC0036a interfaceC0036a = this.f31154b.f31142h;
        if (interfaceC0036a != null) {
            interfaceC0036a.a(this.f31153a, new yd.a("AdmobNativeCard:onAdFailedToLoad errorCode:" + loadAdError.f10005a + " -> " + str, 0));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        fe.a.a().b("AdmobNativeCard:onAdImpression");
        a.InterfaceC0036a interfaceC0036a = this.f31154b.f31142h;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f31153a);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        fe.a.a().b("AdmobNativeCard:onAdLoaded");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        fe.a.a().b("AdmobNativeCard:onAdOpened");
    }
}
