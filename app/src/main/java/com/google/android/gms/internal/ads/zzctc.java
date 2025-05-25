package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzctc {
    private final zzdxu zza;
    private final zzffg zzb;
    private final zzfjl zzc;
    private final zzclw zzd;
    private final zzeiu zze;
    private final zzdby zzf;
    private zzfex zzg;
    private final zzdzc zzh;
    private final zzcvu zzi;
    private final Executor zzj;
    private final zzdym zzk;
    private final zzeey zzl;
    private final zzdzs zzm;
    private final zzdzz zzn;

    public zzctc(zzdxu zzdxuVar, zzffg zzffgVar, zzfjl zzfjlVar, zzclw zzclwVar, zzeiu zzeiuVar, zzdby zzdbyVar, zzfex zzfexVar, zzdzc zzdzcVar, zzcvu zzcvuVar, Executor executor, zzdym zzdymVar, zzeey zzeeyVar, zzdzs zzdzsVar, zzdzz zzdzzVar) {
        this.zza = zzdxuVar;
        this.zzb = zzffgVar;
        this.zzc = zzfjlVar;
        this.zzd = zzclwVar;
        this.zze = zzeiuVar;
        this.zzf = zzdbyVar;
        this.zzg = zzfexVar;
        this.zzh = zzdzcVar;
        this.zzi = zzcvuVar;
        this.zzj = executor;
        this.zzk = zzdymVar;
        this.zzl = zzeeyVar;
        this.zzm = zzdzsVar;
        this.zzn = zzdzzVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th2) {
        return zzfgi.zzb(th2, this.zzl);
    }

    public final zzdby zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfex zzd(zzfex zzfexVar) {
        this.zzd.zza(zzfexVar);
        return zzfexVar;
    }

    public final y9.a zze(final zzfhb zzfhbVar) {
        zzfiq zza = this.zzc.zzb(zzfjf.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsy
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzctc.this.zzf(zzfhbVar, (zzbvb) obj);
            }
        }).zza();
        zzgcj.zzr(zza, new zzcta(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ y9.a zzf(zzfhb zzfhbVar, zzbvb zzbvbVar) {
        zzbvbVar.zzi = zzfhbVar;
        return this.zzh.zza(zzbvbVar);
    }

    public final /* synthetic */ y9.a zzg(y9.a aVar, y9.a aVar2, y9.a aVar3) {
        return this.zzn.zzc((zzbvb) aVar.get(), (JSONObject) aVar2.get(), (zzbvd) aVar3.get());
    }

    public final y9.a zzh(zzbvb zzbvbVar) {
        zzfiq zza = this.zzc.zzb(zzfjf.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbvbVar)).zza();
        zzgcj.zzr(zza, new zzctb(this), this.zzj);
        return zza;
    }

    public final y9.a zzi(y9.a aVar) {
        zzfjc zzf = this.zzc.zzb(zzfjf.RENDERER, aVar).zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzcst
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzfex zzfexVar = (zzfex) obj;
                zzctc.this.zzd(zzfexVar);
                return zzfexVar;
            }
        }).zzf(this.zze);
        zzbbn zzbbnVar = zzbbw.zzeT;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            zzf = zzf.zzi(((Integer) zzbaVar.c.zza(zzbbw.zzeU)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final y9.a zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.f10222x == null && zzlVar.f10217s == null) {
            return zzk(this.zzi.zzc());
        }
        zzfjl zzfjlVar = this.zzc;
        zzdxu zzdxuVar = this.zza;
        return zzfiv.zzc(zzdxuVar.zza(), zzfjf.PRELOADED_LOADER, zzfjlVar).zza();
    }

    public final y9.a zzk(final y9.a aVar) {
        zzfex zzfexVar = this.zzg;
        if (zzfexVar != null) {
            return zzfiv.zzc(zzgcj.zzh(zzfexVar), zzfjf.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzu.B.f10559i.zzj();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkF)).booleanValue() && !((Boolean) zzbdy.zzc.zze()).booleanValue()) {
            final zzdzs zzdzsVar = this.zzm;
            Objects.requireNonNull(zzdzsVar);
            final y9.a zzn = zzgcj.zzn(aVar, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsu
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return zzdzs.this.zza((zzbvb) obj);
                }
            }, this.zzj);
            zzfjc zzb = this.zzc.zzb(zzfjf.BUILD_URL, zzn);
            final zzdzc zzdzcVar = this.zzh;
            Objects.requireNonNull(zzdzcVar);
            final zzfiq zza = zzb.zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsv
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return zzdzc.this.zzb((JSONObject) obj);
                }
            }).zza();
            return this.zzc.zza(zzfjf.SERVER_TRANSACTION, aVar, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcsw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzctc.this.zzg(aVar, zzn, zza);
                }
            }).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsx
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return (y9.a) obj;
                }
            }).zza();
        }
        zzfjc zzb2 = this.zzc.zzb(zzfjf.SERVER_TRANSACTION, aVar);
        final zzdym zzdymVar = this.zzk;
        Objects.requireNonNull(zzdymVar);
        return zzb2.zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsz
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdym.this.zzb((zzbvb) obj);
            }
        }).zza();
    }

    public final void zzl(zzfex zzfexVar) {
        this.zzg = zzfexVar;
    }
}
