package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdww implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzdww(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        Context context = (Context) this.zzb.zzb();
        final CookieManager i10 = com.google.android.gms.ads.internal.zzu.B.f10555e.i();
        zzfjf zzfjfVar = zzfjf.WEBVIEW_COOKIE;
        zzfjc zzi = zzfiv.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = i10;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaF));
            }
        }, zzfjfVar, (zzfjl) this.zza.zzb()).zzi(1L, TimeUnit.SECONDS);
        final zzfio zzfioVar = new zzfio() { // from class: com.google.android.gms.internal.ads.zzdwu
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzgbq(zzfioVar) { // from class: com.google.android.gms.internal.ads.zzfiw
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzgcj.zzh("");
            }
        }).zza();
    }
}
