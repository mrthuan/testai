package v4;

import android.app.Activity;
import android.content.Context;
import be.a;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;

/* compiled from: PangleInterstitial.kt */
/* loaded from: classes.dex */
public final class k implements PAGInterstitialAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f30579a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30580b;
    public final /* synthetic */ Activity c;

    public k(h hVar, Context context, Activity activity) {
        this.f30579a = hVar;
        this.f30580b = context;
        this.c = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        PAGInterstitialAd interstitialAd = pAGInterstitialAd;
        kotlin.jvm.internal.g.e(interstitialAd, "interstitialAd");
        h hVar = this.f30579a;
        hVar.f30570h = interstitialAd;
        Context context = this.f30580b;
        interstitialAd.setAdInteractionListener(new j(context, hVar));
        a6.h.k(new StringBuilder(), hVar.f30565b, ":onAdLoaded", fe.a.a());
        a.InterfaceC0036a interfaceC0036a = hVar.f30568f;
        if (interfaceC0036a != null) {
            interfaceC0036a.e(context, null, new yd.d("PG", "I", hVar.f30569g));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public final void onError(final int i10, final String message) {
        kotlin.jvm.internal.g.e(message, "message");
        final h hVar = this.f30579a;
        final Context context = this.f30580b;
        this.c.runOnUiThread(new Runnable() { // from class: v4.i
            @Override // java.lang.Runnable
            public final void run() {
                h this$0 = h.this;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                String message2 = message;
                kotlin.jvm.internal.g.e(message2, "$message");
                a.InterfaceC0036a interfaceC0036a = this$0.f30568f;
                int i11 = i10;
                String str = this$0.f30565b;
                if (interfaceC0036a != null) {
                    interfaceC0036a.a(context, new yd.a(str + ":onError, errorCode: " + i11 + ' ' + message2, 0));
                }
                fe.a a10 = fe.a.a();
                a10.b(str + ":onError, errorCode: " + i11 + ' ' + message2);
            }
        });
    }
}
