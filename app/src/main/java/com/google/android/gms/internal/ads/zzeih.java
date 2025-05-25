package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeih extends zzeic {
    private final zzcgj zza;
    private final zzcvy zzb;
    private final zzekt zzc;
    private final zzdck zzd;
    private final zzein zze;
    private final zzeey zzf;

    public zzeih(zzcgj zzcgjVar, zzcvy zzcvyVar, zzekt zzektVar, zzdck zzdckVar, zzein zzeinVar, zzeey zzeeyVar) {
        this.zza = zzcgjVar;
        this.zzb = zzcvyVar;
        this.zzc = zzektVar;
        this.zzd = zzdckVar;
        this.zze = zzeinVar;
        this.zzf = zzeeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeic
    public final y9.a zzc(zzffg zzffgVar, Bundle bundle, zzfel zzfelVar, zzfex zzfexVar) {
        zzcvy zzcvyVar = this.zzb;
        zzcvyVar.zzi(zzffgVar);
        zzcvyVar.zzf(bundle);
        zzcvyVar.zzg(new zzcvs(zzfexVar, zzfelVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdi)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcgj zzcgjVar = this.zza;
        zzcvy zzcvyVar2 = this.zzb;
        zzdgo zzg = zzcgjVar.zzg();
        zzg.zze(zzcvyVar2.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzctc zza = zzg.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
