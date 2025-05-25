package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzcfr extends zzcer {
    public zzcfr(zzcej zzcejVar, zzbav zzbavVar, boolean z10, zzeds zzedsVar) {
        super(zzcejVar, zzbavVar, z10, new zzbrp(zzcejVar, zzcejVar.zzE(), new zzbbe(zzcejVar.getContext())), null, zzedsVar);
    }

    public final WebResourceResponse zzS(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcej)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcej zzcejVar = (zzcej) webView;
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            zzbxlVar.zzd(str, map, 1);
        }
        zzfqt.zza();
        int i10 = zzfqy.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcejVar.zzN() != null) {
            zzcejVar.zzN().zzF();
        }
        if (zzcejVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzH);
        } else if (zzcejVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzG);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzF);
        }
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        Context context = zzcejVar.getContext();
        String str3 = zzcejVar.zzn().f10345a;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", zzuVar.c.v(context, str3));
            hashMap.put("Cache-Control", "max-stale=3600");
            new com.google.android.gms.ads.internal.util.zzbo(context);
            String str4 = (String) com.google.android.gms.ads.internal.util.zzbo.a(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str4 == null) {
                return null;
            }
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }
}
