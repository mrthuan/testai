package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeid extends zzeic {
    private final zzcgj zza;
    private final zzcvy zzb;
    private final zzdck zzc;
    private final zzein zzd;
    private final zzeey zze;

    public zzeid(zzcgj zzcgjVar, zzcvy zzcvyVar, zzdck zzdckVar, zzein zzeinVar, zzeey zzeeyVar) {
        this.zza = zzcgjVar;
        this.zzb = zzcvyVar;
        this.zzc = zzdckVar;
        this.zzd = zzeinVar;
        this.zze = zzeeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeic
    public final y9.a zzc(zzffg zzffgVar, Bundle bundle, zzfel zzfelVar, zzfex zzfexVar) {
        zzcvy zzcvyVar = this.zzb;
        zzcvyVar.zzi(zzffgVar);
        zzcvyVar.zzf(bundle);
        zzcvyVar.zzg(new zzcvs(zzfexVar, zzfelVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdi)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcgj zzcgjVar = this.zza;
        zzcvy zzcvyVar2 = this.zzb;
        zzcox zzd = zzcgjVar.zzd();
        zzd.zzd(zzcvyVar2.zzj());
        zzd.zzc(this.zzc);
        zzctc zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
