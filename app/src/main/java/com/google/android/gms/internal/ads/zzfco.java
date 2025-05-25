package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfco implements zzena {
    private final Context zza;
    private final Executor zzb;
    private final zzcgj zzc;
    private final zzemk zzd;
    private final zzfdo zze;
    private zzbcr zzf;
    private final zzfki zzg;
    private final zzffe zzh;
    private y9.a zzi;

    public zzfco(Context context, Executor executor, zzcgj zzcgjVar, zzemk zzemkVar, zzfdo zzfdoVar, zzffe zzffeVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgjVar;
        this.zzd = zzemkVar;
        this.zzh = zzffeVar;
        this.zze = zzfdoVar;
        this.zzg = zzcgjVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        y9.a aVar = this.zzi;
        if (aVar != null && !aVar.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) {
        zzdgp zzf;
        zzfkf zzfkfVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfci
                @Override // java.lang.Runnable
                public final void run() {
                    zzfco.this.zzh();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            zzbbn zzbbnVar = zzbbw.zzia;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && zzlVar.f10204f) {
                this.zzc.zzl().zzo(true);
            }
            com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfch) zzemyVar).zza;
            String zza = zzdrt.DYNAMITE_ENTER.zza();
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            Bundle zza2 = zzdrv.zza(new Pair(zzdrt.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.f10224z)), new Pair(zza, Long.valueOf(System.currentTimeMillis())));
            zzffe zzffeVar = this.zzh;
            zzffeVar.zzt(str);
            zzffeVar.zzs(zzqVar);
            zzffeVar.zzH(zzlVar);
            zzffeVar.zzA(zza2);
            Context context = this.zza;
            zzffg zzJ = zzffeVar.zzJ();
            zzfju zzb = zzfjt.zzb(context, zzfke.zzf(zzJ), 4, zzlVar);
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzhr)).booleanValue()) {
                zzdgo zzg = this.zzc.zzg();
                zzcvy zzcvyVar = new zzcvy();
                zzcvyVar.zze(this.zza);
                zzcvyVar.zzi(zzJ);
                zzg.zze(zzcvyVar.zzj());
                zzdci zzdciVar = new zzdci();
                zzdciVar.zzj(this.zzd, this.zzb);
                zzdciVar.zzk(this.zzd, this.zzb);
                zzg.zzd(zzdciVar.zzn());
                zzg.zzc(new zzekt(this.zzf));
                zzf = zzg.zzf();
            } else {
                zzdci zzdciVar2 = new zzdci();
                zzfdo zzfdoVar = this.zze;
                if (zzfdoVar != null) {
                    zzdciVar2.zze(zzfdoVar, this.zzb);
                    zzdciVar2.zzf(this.zze, this.zzb);
                    zzdciVar2.zzb(this.zze, this.zzb);
                }
                zzdgo zzg2 = this.zzc.zzg();
                zzcvy zzcvyVar2 = new zzcvy();
                zzcvyVar2.zze(this.zza);
                zzcvyVar2.zzi(zzJ);
                zzg2.zze(zzcvyVar2.zzj());
                zzdciVar2.zzj(this.zzd, this.zzb);
                zzdciVar2.zze(this.zzd, this.zzb);
                zzdciVar2.zzf(this.zzd, this.zzb);
                zzdciVar2.zzb(this.zzd, this.zzb);
                zzdciVar2.zza(this.zzd, this.zzb);
                zzdciVar2.zzl(this.zzd, this.zzb);
                zzdciVar2.zzk(this.zzd, this.zzb);
                zzdciVar2.zzi(this.zzd, this.zzb);
                zzdciVar2.zzc(this.zzd, this.zzb);
                zzg2.zzd(zzdciVar2.zzn());
                zzg2.zzc(new zzekt(this.zzf));
                zzf = zzg2.zzf();
            }
            zzdgp zzdgpVar = zzf;
            if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
                zzfkf zzf2 = zzdgpVar.zzf();
                zzf2.zzi(4);
                zzf2.zzb(zzlVar.f10214p);
                zzf2.zzf(zzlVar.f10211m);
                zzfkfVar = zzf2;
            } else {
                zzfkfVar = null;
            }
            zzctc zza3 = zzdgpVar.zza();
            y9.a zzi = zza3.zzi(zza3.zzj());
            this.zzi = zzi;
            zzgcj.zzr(zzi, new zzfcn(this, zzemzVar, zzfkfVar, zzb, zzdgpVar), this.zzb);
            return true;
        }
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfgi.zzd(6, null, null));
    }

    public final void zzi(zzbcr zzbcrVar) {
        this.zzf = zzbcrVar;
    }
}
