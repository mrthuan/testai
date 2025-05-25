package wd;

import android.app.Activity;
import android.content.Context;
import be.a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: AdmobBanner.java */
/* loaded from: classes.dex */
public final class c extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f31095a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f31096b;
    public final /* synthetic */ b c;

    /* compiled from: AdmobBanner.java */
    /* loaded from: classes.dex */
    public class a implements OnPaidEventListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public final void a(AdValue adValue) {
            String str;
            c cVar = c.this;
            Context context = cVar.f31096b;
            b bVar = cVar.c;
            String str2 = bVar.f31089h;
            if (bVar.f31087f.getResponseInfo() != null) {
                str = bVar.f31087f.getResponseInfo().a();
            } else {
                str = "";
            }
            wd.a.d(context, adValue, str2, str, "AdmobBanner", bVar.f31088g);
        }
    }

    public c(b bVar, Activity activity, Context context) {
        this.c = bVar;
        this.f31095a = activity;
        this.f31096b = context;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        super.onAdClicked();
        fe.a.a().b("AdmobBanner:onAdClicked");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
        fe.a.a().b("AdmobBanner:onAdClosed");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        a.InterfaceC0036a interfaceC0036a = this.c.f31084b;
        if (interfaceC0036a != null) {
            interfaceC0036a.a(this.f31096b, new yd.a("AdmobBanner:onAdFailedToLoad, errorCode : " + loadAdError.f10005a + " -> " + loadAdError.f10006b, 0));
        }
        fe.a a10 = fe.a.a();
        a10.b("AdmobBanner:onAdFailedToLoad errorCode:" + loadAdError.f10005a + " -> " + loadAdError.f10006b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        a.InterfaceC0036a interfaceC0036a = this.c.f31084b;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f31096b);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        b bVar = this.c;
        a.InterfaceC0036a interfaceC0036a = bVar.f31084b;
        if (interfaceC0036a != null) {
            interfaceC0036a.e(this.f31095a, bVar.f31087f, new yd.d("A", "B", bVar.f31089h));
            AdView adView = bVar.f31087f;
            if (adView != null) {
                adView.setOnPaidEventListener(new a());
            }
        }
        fe.a.a().b("AdmobBanner:onAdLoaded");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        fe.a.a().b("AdmobBanner:onAdOpened");
        b bVar = this.c;
        a.InterfaceC0036a interfaceC0036a = bVar.f31084b;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f31096b, new yd.d("A", "B", bVar.f31089h));
        }
    }
}
