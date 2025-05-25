package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeif extends zzeic {
    private final zzcgj zza;
    private final zzcvy zzb;
    private final zzekt zzc;
    private final zzdck zzd;
    private final zzdhg zze;
    private final zzczj zzf;
    private final ViewGroup zzg;
    private final zzdbp zzh;
    private final zzein zzi;
    private final zzeey zzj;

    public zzeif(zzcgj zzcgjVar, zzcvy zzcvyVar, zzekt zzektVar, zzdck zzdckVar, zzdhg zzdhgVar, zzczj zzczjVar, ViewGroup viewGroup, zzdbp zzdbpVar, zzein zzeinVar, zzeey zzeeyVar) {
        this.zza = zzcgjVar;
        this.zzb = zzcvyVar;
        this.zzc = zzektVar;
        this.zzd = zzdckVar;
        this.zze = zzdhgVar;
        this.zzf = zzczjVar;
        this.zzg = viewGroup;
        this.zzh = zzdbpVar;
        this.zzi = zzeinVar;
        this.zzj = zzeeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeic
    public final y9.a zzc(zzffg zzffgVar, Bundle bundle, zzfel zzfelVar, zzfex zzfexVar) {
        zzcvy zzcvyVar = this.zzb;
        zzcvyVar.zzi(zzffgVar);
        zzcvyVar.zzf(bundle);
        zzcvyVar.zzg(new zzcvs(zzfexVar, zzfelVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdi)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcgj zzcgjVar = this.zza;
        zzcvy zzcvyVar2 = this.zzb;
        zzcqk zze = zzcgjVar.zze();
        zze.zzi(zzcvyVar2.zzj());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcrm(this.zzf, this.zzh));
        zze.zzc(new zzcph(this.zzg));
        zzctc zzd = zze.zzk().zzd();
        return zzd.zzi(zzd.zzj());
    }
}
