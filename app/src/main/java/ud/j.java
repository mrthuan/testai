package ud;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: AdManagerNativeBanner.kt */
/* loaded from: classes2.dex */
public final class j extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f30320b;

    public j(Context context, k kVar) {
        this.f30319a = context;
        this.f30320b = kVar;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        super.onAdClicked();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f30320b;
        a6.h.k(sb2, kVar.f30321b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = kVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30319a, new yd.d("AM", "NB", kVar.f30328j));
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
        a6.h.k(new StringBuilder(), this.f30320b.f30321b, ":onAdClosed", fe.a.a());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        kotlin.jvm.internal.g.e(loadAdError, "loadAdError");
        super.onAdFailedToLoad(loadAdError);
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f30320b;
        sb2.append(kVar.f30321b);
        sb2.append(":onAdFailedToLoad errorCode:");
        int i10 = loadAdError.f10005a;
        sb2.append(i10);
        sb2.append(" -> ");
        String str = loadAdError.f10006b;
        sb2.append(str);
        a10.b(sb2.toString());
        a.InterfaceC0036a interfaceC0036a = kVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.a(this.f30319a, new yd.a(kVar.f30321b + ":onAdFailedToLoad errorCode:" + i10 + " -> " + str, 0));
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        a.InterfaceC0036a interfaceC0036a = this.f30320b.c;
        if (interfaceC0036a != null) {
            if (interfaceC0036a != null) {
                interfaceC0036a.g(this.f30319a);
                return;
            } else {
                kotlin.jvm.internal.g.i("listener");
                throw null;
            }
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        a6.h.k(new StringBuilder(), this.f30320b.f30321b, ":onAdLoaded", fe.a.a());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        a6.h.k(new StringBuilder(), this.f30320b.f30321b, ":onAdOpened", fe.a.a());
    }
}
