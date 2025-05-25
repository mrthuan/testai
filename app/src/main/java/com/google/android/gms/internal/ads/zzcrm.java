package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcrm {
    private final zzczj zza;
    private final zzdbp zzb;

    public zzcrm(zzczj zzczjVar, zzdbp zzdbpVar) {
        this.zza = zzczjVar;
        this.zzb = zzdbpVar;
    }

    public final zzczj zza() {
        return this.zza;
    }

    public final zzdbp zzb() {
        return this.zzb;
    }

    public final zzdei zzc() {
        zzdbp zzdbpVar = this.zzb;
        if (zzdbpVar != null) {
            return new zzdei(zzdbpVar, zzbzo.zzf);
        }
        return new zzdei(new zzcrl(this), zzbzo.zzf);
    }
}
