package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzegw implements zzeet {
    private final Context zza;
    private final zzdpl zzb;
    private final zzdgp zzc;
    private final zzffg zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbja zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhZ)).booleanValue();
    private final zzeds zzi;

    public zzegw(Context context, VersionInfoParcel versionInfoParcel, zzffg zzffgVar, Executor executor, zzdgp zzdgpVar, zzdpl zzdplVar, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zza = context;
        this.zzd = zzffgVar;
        this.zzc = zzdgpVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdplVar;
        this.zzg = zzbjaVar;
        this.zzi = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        final zzdpp zzdppVar = new zzdpp();
        y9.a zzn = zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzegw.this.zzc(zzfelVar, zzfexVar, zzdppVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
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
        zzcsk zzcskVar = new zzcsk(zzfexVar, zzfelVar, null);
        zzffg zzffgVar = this.zzd;
        boolean z10 = this.zzh;
        final zzdfp zze = this.zzc.zze(zzcskVar, new zzdfs(new zzegv(this.zza, this.zzf, zzbztVar, zzfelVar, zza, zzffgVar, z10, this.zzg, this.zzi), zza));
        zzbztVar.zzc(zze);
        zze.zzc().zzo(new zzcxk() { // from class: com.google.android.gms.internal.ads.zzegr
            @Override // com.google.android.gms.internal.ads.zzcxk
            public final void zzr() {
                zzcej zzcejVar = zzcej.this;
                if (zzcejVar.zzN() != null) {
                    zzcejVar.zzN().zzr();
                }
            }
        }, zzbzo.zzf);
        String str = zzfelVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeC)).booleanValue() && zze.zzl().zze(true)) {
            str = zzcfu.zzb(str, zzcfu.zza(zzfelVar));
        }
        zzdpk zzi = zze.zzi();
        if (this.zzh) {
            zzbjaVar = this.zzg;
        } else {
            zzbjaVar = null;
        }
        zzi.zzi(zza, true, zzbjaVar);
        zze.zzi();
        return zzgcj.zzm(zzdpk.zzj(zza, zzfelVar.zzs.zzb, str), new zzful(this) { // from class: com.google.android.gms.internal.ads.zzegs
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj2) {
                zzcej zzcejVar = zza;
                if (zzfelVar.zzM) {
                    zzcejVar.zzah();
                }
                zzdfp zzdfpVar = zze;
                zzcejVar.zzab();
                zzcejVar.onPause();
                return zzdfpVar.zzg();
            }
        }, this.zze);
    }
}
