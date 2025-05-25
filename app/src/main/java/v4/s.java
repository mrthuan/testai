package v4;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import be.a;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;

/* compiled from: PangleNativeCard.kt */
/* loaded from: classes.dex */
public final class s implements PAGNativeAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f30621a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30622b;
    public final /* synthetic */ Activity c;

    public s(q qVar, Context context, Activity activity) {
        this.f30621a = qVar;
        this.f30622b = context;
        this.c = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pagNativeAd = pAGNativeAd;
        kotlin.jvm.internal.g.e(pagNativeAd, "pagNativeAd");
        q qVar = this.f30621a;
        qVar.f30609j = pagNativeAd;
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = qVar.f30602b;
        a6.h.k(sb2, str, ":onAdLoaded", a10);
        a.InterfaceC0036a interfaceC0036a = qVar.f30605f;
        if (interfaceC0036a != null) {
            boolean d10 = interfaceC0036a.d();
            Context context = this.f30622b;
            if (d10) {
                View j10 = qVar.j(this.c, qVar.f30607h, -1);
                if (j10 != null) {
                    interfaceC0036a.e(context, j10, new yd.d("PG", "NC", qVar.f30606g));
                    return;
                } else {
                    interfaceC0036a.a(context, new yd.a(a6.h.c(str, ":getAdView return null"), 0));
                    return;
                }
            }
            interfaceC0036a.e(context, null, new yd.d("PG", "NC", qVar.f30606g));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public final void onError(int i10, String message) {
        kotlin.jvm.internal.g.e(message, "message");
        this.c.runOnUiThread(new r(this.f30621a, this.f30622b, i10, message, 0));
    }
}
