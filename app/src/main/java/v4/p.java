package v4;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;

/* compiled from: PangleNativeBanner.kt */
/* loaded from: classes.dex */
public final class p implements PAGNativeAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f30600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30601b;
    public final /* synthetic */ Activity c;

    public p(n nVar, Context context, Activity activity) {
        this.f30600a = nVar;
        this.f30601b = context;
        this.c = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAdLoaded(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.p.onAdLoaded(java.lang.Object):void");
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public final void onError(int i10, String message) {
        kotlin.jvm.internal.g.e(message, "message");
        this.c.runOnUiThread(new o(this.f30600a, this.f30601b, i10, message, 0));
    }
}
