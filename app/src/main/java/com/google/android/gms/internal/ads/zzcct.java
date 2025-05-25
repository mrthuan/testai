package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcct implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzccv zzd;

    public zzcct(zzccv zzccvVar, String str, String str2, long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap h10 = a6.h.h("event", "precacheComplete");
        h10.put("src", this.zza);
        h10.put("cachedSrc", this.zzb);
        h10.put("totalDuration", Long.toString(this.zzc));
        zzccv.zze(this.zzd, "onPrecacheEvent", h10);
    }
}
