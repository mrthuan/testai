package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfnc implements Runnable {
    final /* synthetic */ zzfnd zza;
    private final WebView zzb;

    public zzfnc(zzfnd zzfndVar) {
        WebView webView;
        this.zza = zzfndVar;
        webView = zzfndVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
