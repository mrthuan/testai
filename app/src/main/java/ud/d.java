package ud;

import android.app.Activity;
import android.content.Context;
import be.a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;

/* compiled from: AdManagerBanner.kt */
/* loaded from: classes2.dex */
public final class d extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f30291a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f30292b;
    public final /* synthetic */ Context c;

    public d(e eVar, Activity activity, Context context) {
        this.f30291a = eVar;
        this.f30292b = activity;
        this.c = context;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        super.onAdClicked();
        a6.h.k(new StringBuilder(), this.f30291a.f30293b, ":onAdClicked", fe.a.a());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
        a6.h.k(new StringBuilder(), this.f30291a.f30293b, ":onAdClosed", fe.a.a());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        kotlin.jvm.internal.g.e(loadAdError, "loadAdError");
        super.onAdFailedToLoad(loadAdError);
        e eVar = this.f30291a;
        a.InterfaceC0036a interfaceC0036a = eVar.c;
        if (interfaceC0036a != null) {
            StringBuilder sb2 = new StringBuilder();
            String str = eVar.f30293b;
            sb2.append(str);
            sb2.append(":onAdFailedToLoad, errorCode : ");
            int i10 = loadAdError.f10005a;
            sb2.append(i10);
            sb2.append(" -> ");
            String str2 = loadAdError.f10006b;
            sb2.append(str2);
            interfaceC0036a.a(this.c, new yd.a(sb2.toString(), 0));
            fe.a a10 = fe.a.a();
            a10.b(str + ":onAdFailedToLoad errorCode:" + i10 + " -> " + str2);
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        e eVar = this.f30291a;
        a.InterfaceC0036a interfaceC0036a = eVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.c);
            a6.h.k(new StringBuilder(), eVar.f30293b, ":onAdImpression", fe.a.a());
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        e eVar = this.f30291a;
        a.InterfaceC0036a interfaceC0036a = eVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.e(this.f30292b, eVar.f30295e, new yd.d("AM", "B", eVar.f30299i));
            AdManagerAdView adManagerAdView = eVar.f30295e;
            if (adManagerAdView != null) {
                adManagerAdView.setOnPaidEventListener(new h5.i(this.c, eVar));
            }
            a6.h.k(new StringBuilder(), eVar.f30293b, ":onAdLoaded", fe.a.a());
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f30291a;
        a6.h.k(sb2, eVar.f30293b, ":onAdOpened", a10);
        a.InterfaceC0036a interfaceC0036a = eVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.c, new yd.d("AM", "B", eVar.f30299i));
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }
}
