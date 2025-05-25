package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccs implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzccv zzd;

    public zzccs(zzccv zzccvVar, String str, String str2, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap h10 = a6.h.h("event", "precacheComplete");
        h10.put("src", this.zza);
        h10.put("cachedSrc", this.zzb);
        h10.put("totalBytes", Integer.toString(this.zzc));
        zzccv.zze(this.zzd, "onPrecacheEvent", h10);
    }
}
