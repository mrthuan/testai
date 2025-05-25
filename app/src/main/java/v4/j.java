package v4;

import android.content.Context;
import be.a;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* compiled from: PangleInterstitial.kt */
/* loaded from: classes.dex */
public final class j implements PAGInterstitialAdInteractionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f30578b;

    public j(Context context, h hVar) {
        this.f30577a = context;
        this.f30578b = hVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f30578b;
        a6.h.k(sb2, hVar.f30565b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = hVar.f30568f;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30577a, new yd.d("PG", "I", hVar.f30569g));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f30578b;
        a6.h.k(sb2, hVar.f30565b, ":onAdDismissed", a10);
        a.InterfaceC0036a interfaceC0036a = hVar.f30568f;
        if (interfaceC0036a != null) {
            interfaceC0036a.f(this.f30577a);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f30578b;
        a6.h.k(sb2, hVar.f30565b, ":onAdShowed", a10);
        a.InterfaceC0036a interfaceC0036a = hVar.f30568f;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30577a);
        }
    }
}
