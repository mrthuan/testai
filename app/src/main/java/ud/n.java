package ud;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: AdManagerNativeCard.kt */
/* loaded from: classes2.dex */
public final class n extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30345a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f30346b;

    public n(Context context, m mVar) {
        this.f30345a = context;
        this.f30346b = mVar;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        super.onAdClicked();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        m mVar = this.f30346b;
        a6.h.k(sb2, mVar.f30333b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = mVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30345a, new yd.d("AM", "NC", mVar.f30341k));
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
        a6.h.k(new StringBuilder(), this.f30346b.f30333b, ":onAdClosed", fe.a.a());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        kotlin.jvm.internal.g.e(loadAdError, "loadAdError");
        super.onAdFailedToLoad(loadAdError);
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        m mVar = this.f30346b;
        sb2.append(mVar.f30333b);
        sb2.append(":onAdFailedToLoad errorCode:");
        int i10 = loadAdError.f10005a;
        sb2.append(i10);
        sb2.append(" -> ");
        String str = loadAdError.f10006b;
        sb2.append(str);
        a10.b(sb2.toString());
        a.InterfaceC0036a interfaceC0036a = mVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.a(this.f30345a, new yd.a(mVar.f30333b + ":onAdFailedToLoad errorCode:" + i10 + " -> " + str, 0));
            return;
        }
        kotlin.jvm.internal.g.i("listener");
        throw null;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        m mVar = this.f30346b;
        a6.h.k(sb2, mVar.f30333b, ":onAdImpression", a10);
        a.InterfaceC0036a interfaceC0036a = mVar.c;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30345a);
        } else {
            kotlin.jvm.internal.g.i("listener");
            throw null;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        a6.h.k(new StringBuilder(), this.f30346b.f30333b, ":onAdLoaded", fe.a.a());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        a6.h.k(new StringBuilder(), this.f30346b.f30333b, ":onAdOpened", fe.a.a());
    }
}
