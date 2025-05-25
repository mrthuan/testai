package v4;

import android.content.Context;
import be.a;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;

/* compiled from: PangleBanner.kt */
/* loaded from: classes.dex */
public final class e implements PAGBannerAdInteractionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f30562b;

    public e(Context context, c cVar) {
        this.f30561a = context;
        this.f30562b = cVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        c cVar = this.f30562b;
        a6.h.k(sb2, cVar.f30549b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = cVar.f30552f;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30561a, new yd.d("PG", "B", cVar.f30553g));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        c cVar = this.f30562b;
        a6.h.k(sb2, cVar.f30549b, ":onAdDismissed", a10);
        a.InterfaceC0036a interfaceC0036a = cVar.f30552f;
        if (interfaceC0036a != null) {
            interfaceC0036a.f(this.f30561a);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        c cVar = this.f30562b;
        a6.h.k(sb2, cVar.f30549b, ":onAdShowed", a10);
        a.InterfaceC0036a interfaceC0036a = cVar.f30552f;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30561a);
        }
    }
}
