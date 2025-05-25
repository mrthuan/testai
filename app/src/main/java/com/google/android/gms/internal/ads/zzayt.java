package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzayt implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzayl zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzayv zze;

    public zzayt(zzayv zzayvVar, final zzayl zzaylVar, final WebView webView, final boolean z10) {
        this.zzb = zzaylVar;
        this.zzc = webView;
        this.zzd = z10;
        this.zze = zzayvVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzays
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzayt.this.zze.zzd(zzaylVar, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
