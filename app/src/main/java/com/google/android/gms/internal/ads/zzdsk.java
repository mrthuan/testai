package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdsk {
    private final zzdsp zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdsk(zzdsp zzdspVar, Executor executor) {
        this.zza = zzdspVar;
        this.zzc = zzdspVar.zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdsp zzb(zzdsk zzdskVar) {
        return zzdskVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzdsk zzdskVar) {
        return zzdskVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzdsk zzdskVar) {
        return zzdskVar.zzb;
    }

    public final zzdsj zza() {
        zzdsj zzdsjVar = new zzdsj(this);
        zzdsj.zza(zzdsjVar);
        return zzdsjVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkK)).booleanValue()) {
            return;
        }
        zzdsj zza = zza();
        zza.zzb("action", "pecr");
        zza.zzf();
    }
}
