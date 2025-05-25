package v4;

import android.content.Context;
import be.a;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;

/* compiled from: PangleOpenAd.kt */
/* loaded from: classes.dex */
public final class v implements PAGAppOpenAdInteractionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f30638b;

    public v(Context context, t tVar) {
        this.f30637a = context;
        this.f30638b = tVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        t tVar = this.f30638b;
        a6.h.k(sb2, tVar.f30623b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = tVar.f30627g;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30637a, new yd.d("PG", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, tVar.f30628h));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        t tVar = this.f30638b;
        a6.h.k(sb2, tVar.f30623b, ":onAdDismissed", a10);
        a.InterfaceC0036a interfaceC0036a = tVar.f30627g;
        if (interfaceC0036a != null) {
            interfaceC0036a.f(this.f30637a);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        t tVar = this.f30638b;
        a6.h.k(sb2, tVar.f30623b, ":onAdShowed", a10);
        a.InterfaceC0036a interfaceC0036a = tVar.f30627g;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30637a);
        }
    }
}
