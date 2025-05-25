package wd;

import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: AdmobInterstitial.java */
/* loaded from: classes.dex */
public final class f implements OnPaidEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f31115a;

    public f(g gVar) {
        this.f31115a = gVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void a(AdValue adValue) {
        String str;
        g gVar = this.f31115a;
        Context context = gVar.f31116a;
        e eVar = gVar.f31117b;
        String str2 = eVar.f31104i;
        if (eVar.f31098b.getResponseInfo() != null) {
            str = eVar.f31098b.getResponseInfo().a();
        } else {
            str = "";
        }
        a.d(context, adValue, str2, str, "AdmobInterstitial", eVar.f31102g);
    }
}
