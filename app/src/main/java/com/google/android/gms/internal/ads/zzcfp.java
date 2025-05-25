package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcfp {
    private final zzcfq zza;
    private final zzcfo zzb;

    public zzcfp(zzcfq zzcfqVar, zzcfo zzcfoVar) {
        this.zzb = zzcfoVar;
        this.zza = zzcfqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.h("Click string is empty, not proceeding.");
            return "";
        }
        ?? r02 = this.zza;
        zzauo zzI = r02.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.h("Signal utils is empty, ignoring.");
            return "";
        }
        zzauk zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.h("Signals object is empty, ignoring.");
            return "";
        } else if (r02.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.h("Context is null, ignoring.");
            return "";
        } else {
            zzcfq zzcfqVar = this.zza;
            return zzc.zzf(zzcfqVar.getContext(), str, (View) zzcfqVar, zzcfqVar.zzi());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r02 = this.zza;
        zzauo zzI = r02.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.h("Signal utils is empty, ignoring.");
            return "";
        }
        zzauk zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.h("Signals object is empty, ignoring.");
            return "";
        } else if (r02.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.h("Context is null, ignoring.");
            return "";
        } else {
            zzcfq zzcfqVar = this.zza;
            return zzc.zzh(zzcfqVar.getContext(), (View) zzcfqVar, zzcfqVar.zzi());
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfn
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfp.this.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        Uri parse = Uri.parse(str);
        zzcer zzaO = ((zzcfi) this.zzb.zza).zzaO();
        if (zzaO == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaO.zzj(parse);
        }
    }
}
