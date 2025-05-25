package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdhr implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;
    private final zzhfu zzf;

    public zzdhr(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar4;
        this.zze = zzhfuVar5;
        this.zzf = zzhfuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzcvy zza = ((zzcwi) this.zzb).zza();
        zzdck zza2 = ((zzdde) this.zzc).zza();
        zzdhg zza3 = ((zzdhi) this.zzd).zza();
        zzczj zzb = ((zzcpj) this.zze).zzb();
        zzein zzeinVar = (zzein) this.zzf.zzb();
        zzcqk zze = ((zzcgj) this.zza.zzb()).zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzekt(null));
        zze.zzg(new zzcrm(zzb, null));
        zze.zzc(new zzcph(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdl)).booleanValue()) {
            zze.zzj(zzeiw.zzb(zzeinVar));
        }
        zzcrx zzc = zze.zzk().zzc();
        zzhfk.zzb(zzc);
        return zzc;
    }
}
