package wd;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import be.a;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: AdmobNativeCard.java */
/* loaded from: classes.dex */
public final class n implements NativeAd.OnNativeAdLoadedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f31156b;
    public final /* synthetic */ l c;

    /* compiled from: AdmobNativeCard.java */
    /* loaded from: classes.dex */
    public class a implements OnPaidEventListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public final void a(AdValue adValue) {
            String str;
            n nVar = n.this;
            Context context = nVar.f31155a;
            l lVar = nVar.c;
            String str2 = lVar.f31145k;
            if (lVar.f31140f.getResponseInfo() != null) {
                str = lVar.f31140f.getResponseInfo().a();
            } else {
                str = "";
            }
            wd.a.d(context, adValue, str2, str, "AdmobNativeCard", lVar.f31143i);
        }
    }

    public n(l lVar, Context context, Activity activity) {
        this.c = lVar;
        this.f31155a = context;
        this.f31156b = activity;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        l lVar = this.c;
        lVar.f31140f = nativeAd;
        fe.a.a().b("AdmobNativeCard:onNativeAdLoaded");
        a.InterfaceC0036a interfaceC0036a = lVar.f31142h;
        if (interfaceC0036a != null) {
            boolean d10 = interfaceC0036a.d();
            Context context = this.f31155a;
            if (d10) {
                View j10 = lVar.j(this.f31156b, lVar.f31141g, -1);
                if (j10 != null) {
                    lVar.f31142h.e(context, j10, new yd.d("A", "NC", lVar.f31145k));
                } else {
                    lVar.f31142h.a(context, new yd.a("AdmobNativeCard:getAdView return null", 0));
                }
            } else {
                lVar.f31142h.e(context, null, new yd.d("A", "NC", lVar.f31145k));
            }
        }
        NativeAd nativeAd2 = lVar.f31140f;
        if (nativeAd2 != null) {
            nativeAd2.setOnPaidEventListener(new a());
        }
    }
}
