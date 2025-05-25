package wd;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;

/* compiled from: AdmobOpenAd.java */
/* loaded from: classes.dex */
public final class q extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31174a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f31175b;

    public q(o oVar, Context context) {
        this.f31175b = oVar;
        this.f31174a = context;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.f31175b.f5405a) {
            o oVar = this.f31175b;
            oVar.f31158b = null;
            a.InterfaceC0036a interfaceC0036a = oVar.c;
            if (interfaceC0036a != null) {
                Context context = this.f31174a;
                interfaceC0036a.a(context, new yd.a("AdmobOpenAd:onAppOpenAdFailedToLoad:" + loadAdError.f10006b, 0));
            }
            fe.a a10 = fe.a.a();
            a10.b("AdmobOpenAd:onAppOpenAdFailedToLoad:" + loadAdError.f10006b);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        AppOpenAd appOpenAd2 = appOpenAd;
        synchronized (this.f31175b.f5405a) {
            o oVar = this.f31175b;
            oVar.f31158b = appOpenAd2;
            oVar.f31165j = System.currentTimeMillis();
            o oVar2 = this.f31175b;
            a.InterfaceC0036a interfaceC0036a = oVar2.c;
            if (interfaceC0036a != null) {
                interfaceC0036a.e(this.f31174a, null, new yd.d("A", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, oVar2.f31164i));
                AppOpenAd appOpenAd3 = this.f31175b.f31158b;
                if (appOpenAd3 != null) {
                    appOpenAd3.setOnPaidEventListener(new p(this));
                }
            }
            fe.a.a().b("AdmobOpenAd onAppOpenAdLoaded");
        }
    }
}
