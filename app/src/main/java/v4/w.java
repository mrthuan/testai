package v4;

import android.app.Activity;
import android.content.Context;
import be.a;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;

/* compiled from: PangleOpenAd.kt */
/* loaded from: classes.dex */
public final class w implements PAGAppOpenAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f30639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30640b;
    public final /* synthetic */ Activity c;

    public w(t tVar, Context context, Activity activity) {
        this.f30639a = tVar;
        this.f30640b = context;
        this.c = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        PAGAppOpenAd appOpenAd = pAGAppOpenAd;
        kotlin.jvm.internal.g.e(appOpenAd, "appOpenAd");
        t tVar = this.f30639a;
        tVar.f30629i = appOpenAd;
        Context context = this.f30640b;
        appOpenAd.setAdInteractionListener(new v(context, tVar));
        a6.h.k(new StringBuilder(), tVar.f30623b, ":onAdLoaded", fe.a.a());
        a.InterfaceC0036a interfaceC0036a = tVar.f30627g;
        if (interfaceC0036a != null) {
            interfaceC0036a.e(context, null, new yd.d("PG", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, tVar.f30628h));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public final void onError(int i10, String message) {
        kotlin.jvm.internal.g.e(message, "message");
        this.c.runOnUiThread(new u(this.f30639a, this.f30640b, i10, message));
    }
}
