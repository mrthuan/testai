package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzcfs extends zzcfr {
    public zzcfs(zzcej zzcejVar, zzbav zzbavVar, boolean z10, zzeds zzedsVar) {
        super(zzcejVar, zzbavVar, z10, zzedsVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            return zzS(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        return null;
    }
}
