package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzefe implements zzeet {
    private final zzcoy zza;
    private final Context zzb;
    private final zzdpl zzc;
    private final zzffg zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbja zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhZ)).booleanValue();
    private final zzeds zzi;

    public zzefe(zzcoy zzcoyVar, Context context, Executor executor, zzdpl zzdplVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zzb = context;
        this.zza = zzcoyVar;
        this.zze = executor;
        this.zzc = zzdplVar;
        this.zzd = zzffgVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjaVar;
        this.zzi = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        final zzdpp zzdppVar = new zzdpp();
        y9.a zzn = zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzefe.this.zzc(zzfelVar, zzfexVar, zzdppVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefb
            @Override // java.lang.Runnable
            public final void run() {
                zzdpp.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        zzfeq zzfeqVar = zzfelVar.zzs;
        if (zzfeqVar != null && zzfeqVar.zza != null) {
            return true;
        }
        return false;
    }

    public final y9.a zzc(final zzfel zzfelVar, zzfex zzfexVar, zzdpp zzdppVar, Object obj) {
        zzbja zzbjaVar;
        final zzcej zza = this.zzc.zza(this.zzd.zze, zzfelVar, zzfexVar.zzb.zzb);
        zza.zzac(zzfelVar.zzW);
        zzdppVar.zza(this.zzb, (View) zza);
        zzbzt zzbztVar = new zzbzt();
        final zzcov zza2 = this.zza.zza(new zzcsk(zzfexVar, zzfelVar, null), new zzdfs(new zzefg(this.zzf, zzbztVar, zzfelVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcow(zzfelVar.zzaa));
        zzdpk zzh = zza2.zzh();
        if (this.zzh) {
            zzbjaVar = this.zzg;
        } else {
            zzbjaVar = null;
        }
        zzh.zzi(zza, false, zzbjaVar);
        zzbztVar.zzc(zza2);
        zza2.zzc().zzo(new zzcxk() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // com.google.android.gms.internal.ads.zzcxk
            public final void zzr() {
                zzcej zzcejVar = zzcej.this;
                if (zzcejVar.zzN() != null) {
                    zzcejVar.zzN().zzr();
                }
            }
        }, zzbzo.zzf);
        String str = zzfelVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeC)).booleanValue() && zza2.zzi().zze(true)) {
            str = zzcfu.zzb(str, zzcfu.zza(zzfelVar));
        }
        zza2.zzh();
        return zzgcj.zzm(zzdpk.zzj(zza, zzfelVar.zzs.zzb, str), new zzful(this) { // from class: com.google.android.gms.internal.ads.zzefd
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj2) {
                zzcej zzcejVar = zza;
                if (zzfelVar.zzM) {
                    zzcejVar.zzah();
                }
                zzcov zzcovVar = zza2;
                zzcejVar.zzab();
                zzcejVar.onPause();
                return zzcovVar.zza();
            }
        }, this.zze);
    }
}
