package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeij extends zzeic {
    private final zzcgj zza;
    private final zzcvy zzb;
    private final zzdck zzc;
    private final zzein zzd;
    private final zzfey zze;
    private final zzeey zzf;

    public zzeij(zzcgj zzcgjVar, zzcvy zzcvyVar, zzdck zzdckVar, zzfey zzfeyVar, zzein zzeinVar, zzeey zzeeyVar) {
        this.zza = zzcgjVar;
        this.zzb = zzcvyVar;
        this.zzc = zzdckVar;
        this.zze = zzfeyVar;
        this.zzd = zzeinVar;
        this.zzf = zzeeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeic
    public final y9.a zzc(zzffg zzffgVar, Bundle bundle, zzfel zzfelVar, zzfex zzfexVar) {
        zzfey zzfeyVar;
        zzcvy zzcvyVar = this.zzb;
        zzcvyVar.zzi(zzffgVar);
        zzcvyVar.zzf(bundle);
        zzcvyVar.zzg(new zzcvs(zzfexVar, zzfelVar, this.zzd));
        zzbbn zzbbnVar = zzbbw.zzdh;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && (zzfeyVar = this.zze) != null) {
            this.zzb.zzh(zzfeyVar);
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzdi)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcgj zzcgjVar = this.zza;
        zzcvy zzcvyVar2 = this.zzb;
        zzdot zzi = zzcgjVar.zzi();
        zzi.zzd(zzcvyVar2.zzj());
        zzi.zzc(this.zzc);
        zzctc zzb = zzi.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
