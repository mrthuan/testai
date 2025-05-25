package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzejq implements zzeet {
    private final Context zza;
    private final zzdpl zzb;
    private final zzdou zzc;
    private final zzffg zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbja zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhZ)).booleanValue();
    private final zzeds zzi;

    public zzejq(Context context, VersionInfoParcel versionInfoParcel, zzffg zzffgVar, Executor executor, zzdou zzdouVar, zzdpl zzdplVar, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zza = context;
        this.zzd = zzffgVar;
        this.zzc = zzdouVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdplVar;
        this.zzg = zzbjaVar;
        this.zzi = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        final zzdpp zzdppVar = new zzdpp();
        y9.a zzn = zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzejj
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzejq.this.zzc(zzfelVar, zzfexVar, zzdppVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejk
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
        final zzcej zza = this.zzb.zza(this.zzd.zze, zzfelVar, zzfexVar.zzb.zzb);
        zza.zzac(zzfelVar.zzW);
        zzdppVar.zza(this.zza, (View) zza);
        zzbzt zzbztVar = new zzbzt();
        final zzdoq zze = this.zzc.zze(new zzcsk(zzfexVar, zzfelVar, null), new zzdor(new zzejp(this.zza, this.zzb, this.zzd, this.zzf, zzfelVar, zzbztVar, zza, this.zzg, this.zzh, this.zzi), zza));
        zzbztVar.zzc(zze);
        zzbjp.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzcxk() { // from class: com.google.android.gms.internal.ads.zzejl
            @Override // com.google.android.gms.internal.ads.zzcxk
            public final void zzr() {
                zzcej zzcejVar = zzcej.this;
                if (zzcejVar.zzN() != null) {
                    zzcejVar.zzN().zzr();
                }
            }
        }, zzbzo.zzf);
        zzdpk zzl = zze.zzl();
        if (this.zzh) {
            zzbjaVar = this.zzg;
        } else {
            zzbjaVar = null;
        }
        zzl.zzi(zza, true, zzbjaVar);
        String str = zzfelVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeC)).booleanValue() && zze.zzm().zze(true)) {
            str = zzcfu.zzb(str, zzcfu.zza(zzfelVar));
        }
        zze.zzl();
        return zzgcj.zzm(zzdpk.zzj(zza, zzfelVar.zzs.zzb, str), new zzful(this) { // from class: com.google.android.gms.internal.ads.zzejm
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj2) {
                zzcej zzcejVar = zza;
                if (zzfelVar.zzM) {
                    zzcejVar.zzah();
                }
                zzdoq zzdoqVar = zze;
                zzcejVar.zzab();
                zzcejVar.onPause();
                return zzdoqVar.zzi();
            }
        }, this.zze);
    }
}
