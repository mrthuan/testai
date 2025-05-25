package v4;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import be.a;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;

/* compiled from: PangleBanner.kt */
/* loaded from: classes.dex */
public final class f implements PAGBannerAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f30563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f30564b;
    public final /* synthetic */ Context c;

    public f(c cVar, Activity activity, Context context) {
        this.f30563a = cVar;
        this.f30564b = activity;
        this.c = context;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
        View view;
        PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        c cVar = this.f30563a;
        cVar.f30554h = pAGBannerAd2;
        Context context = this.c;
        if (pAGBannerAd2 != null) {
            pAGBannerAd2.setAdInteractionListener(new e(context, cVar));
        }
        if (pAGBannerAd2 != null && pAGBannerAd2.getBannerView() != null) {
            a.InterfaceC0036a interfaceC0036a = cVar.f30552f;
            if (interfaceC0036a != null) {
                PAGBannerAd pAGBannerAd3 = cVar.f30554h;
                if (pAGBannerAd3 != null) {
                    view = pAGBannerAd3.getBannerView();
                } else {
                    view = null;
                }
                interfaceC0036a.e(this.f30564b, view, new yd.d("PG", "B", cVar.f30553g));
                return;
            }
            return;
        }
        a.InterfaceC0036a interfaceC0036a2 = cVar.f30552f;
        if (interfaceC0036a2 != null) {
            interfaceC0036a2.a(context, new yd.a(androidx.activity.r.g(new StringBuilder(), cVar.f30549b, ":bannerView == null"), 0));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public final void onError(final int i10, final String message) {
        kotlin.jvm.internal.g.e(message, "message");
        final c cVar = this.f30563a;
        final Context context = this.c;
        this.f30564b.runOnUiThread(new Runnable() { // from class: v4.d
            @Override // java.lang.Runnable
            public final void run() {
                c this$0 = c.this;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                String message2 = message;
                kotlin.jvm.internal.g.e(message2, "$message");
                a.InterfaceC0036a interfaceC0036a = this$0.f30552f;
                int i11 = i10;
                String str = this$0.f30549b;
                if (interfaceC0036a != null) {
                    interfaceC0036a.a(context, new yd.a(str + ":onError, errorCode: " + i11 + ' ' + message2, 0));
                }
                fe.a a10 = fe.a.a();
                a10.b(str + ":onError, errorCode: " + i11 + ' ' + message2);
            }
        });
    }
}
