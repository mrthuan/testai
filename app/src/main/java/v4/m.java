package v4;

import android.content.Context;
import be.a;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;

/* compiled from: PangleNativeBanner.kt */
/* loaded from: classes.dex */
public final class m implements PAGNativeAdInteractionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f30584b;

    public m(Context context, n nVar) {
        this.f30583a = context;
        this.f30584b = nVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        n nVar = this.f30584b;
        a6.h.k(sb2, nVar.f30585b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = nVar.f30588f;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30583a, new yd.d("PG", "NB", nVar.f30589g));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        n nVar = this.f30584b;
        a6.h.k(sb2, nVar.f30585b, ":onAdDismissed", a10);
        a.InterfaceC0036a interfaceC0036a = nVar.f30588f;
        if (interfaceC0036a != null) {
            interfaceC0036a.f(this.f30583a);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        n nVar = this.f30584b;
        a6.h.k(sb2, nVar.f30585b, ":onAdShowed", a10);
        a.InterfaceC0036a interfaceC0036a = nVar.f30588f;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30583a);
        }
    }
}
