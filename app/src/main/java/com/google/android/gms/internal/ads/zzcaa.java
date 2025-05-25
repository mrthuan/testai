package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzcaa {
    private final zzbzt zza;
    private final AtomicInteger zzb;

    public zzcaa() {
        zzbzt zzbztVar = new zzbzt();
        this.zza = zzbztVar;
        this.zzb = new AtomicInteger(0);
        zzgcj.zzr(zzbztVar, new zzbzy(this), zzbzo.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th2, String str) {
        this.zza.zzd(th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgS)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzbzx zzbzxVar, zzbzv zzbzvVar) {
        zzgcj.zzr(this.zza, new zzbzz(this, zzbzxVar, zzbzvVar), zzbzo.zzf);
    }
}
