package ud;

import android.content.Context;
import be.a;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;

/* compiled from: AdManagerOpenAd.kt */
/* loaded from: classes2.dex */
public final class p extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f30349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30350b;

    public p(q qVar, Context context) {
        this.f30349a = qVar;
        this.f30350b = context;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        kotlin.jvm.internal.g.e(loadAdError, "loadAdError");
        Object lock = this.f30349a.f5405a;
        kotlin.jvm.internal.g.d(lock, "lock");
        q qVar = this.f30349a;
        Context context = this.f30350b;
        synchronized (lock) {
            qVar.c = null;
            a.InterfaceC0036a interfaceC0036a = qVar.f30352d;
            if (interfaceC0036a != null) {
                interfaceC0036a.a(context, new yd.a(qVar.f30351b + ":onAppOpenAdFailedToLoad:" + loadAdError.f10006b, 0));
                fe.a a10 = fe.a.a();
                a10.b(qVar.f30351b + ":onAppOpenAdFailedToLoad:" + loadAdError.f10006b);
                tf.d dVar = tf.d.f30009a;
            } else {
                kotlin.jvm.internal.g.i("listener");
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        AppOpenAd ad2 = appOpenAd;
        kotlin.jvm.internal.g.e(ad2, "ad");
        Object lock = this.f30349a.f5405a;
        kotlin.jvm.internal.g.d(lock, "lock");
        q qVar = this.f30349a;
        Context context = this.f30350b;
        synchronized (lock) {
            qVar.c = ad2;
            qVar.f30359k = System.currentTimeMillis();
            a.InterfaceC0036a interfaceC0036a = qVar.f30352d;
            if (interfaceC0036a != null) {
                interfaceC0036a.e(context, null, new yd.d("AM", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, qVar.f30358j));
                AppOpenAd appOpenAd2 = qVar.c;
                if (appOpenAd2 != null) {
                    appOpenAd2.setOnPaidEventListener(new c5.b(4, context, qVar));
                }
                fe.a a10 = fe.a.a();
                a10.b(qVar.f30351b + ":onAdLoaded");
                tf.d dVar = tf.d.f30009a;
            } else {
                kotlin.jvm.internal.g.i("listener");
                throw null;
            }
        }
    }
}
