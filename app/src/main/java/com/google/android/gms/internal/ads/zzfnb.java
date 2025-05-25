package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfnb extends WebViewClient {
    final /* synthetic */ zzfnd zza;

    public zzfnb(zzfnd zzfndVar) {
        this.zza = zzfndVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.toString();
        String.valueOf(webView);
        if (this.zza.zza() == webView) {
            this.zza.zzm(null);
        }
        webView.destroy();
        return true;
    }
}
