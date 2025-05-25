package wd;

import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: AdmobOpenAd.java */
/* loaded from: classes.dex */
public final class p implements OnPaidEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f31173a;

    public p(q qVar) {
        this.f31173a = qVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void a(AdValue adValue) {
        String str;
        q qVar = this.f31173a;
        Context context = qVar.f31174a;
        o oVar = qVar.f31175b;
        String str2 = oVar.f31164i;
        if (oVar.f31158b.getResponseInfo() != null) {
            str = oVar.f31158b.getResponseInfo().a();
        } else {
            str = "";
        }
        a.d(context, adValue, str2, str, "AdmobOpenAd", oVar.f31161f);
    }
}
