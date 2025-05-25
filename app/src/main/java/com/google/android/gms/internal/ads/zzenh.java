package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzenh implements zzena {
    private final zzffe zza;
    private final zzcgj zzb;
    private final Context zzc;
    private final zzemx zzd;
    private final zzfki zze;
    private zzcsj zzf;

    public zzenh(zzcgj zzcgjVar, Context context, zzemx zzemxVar, zzffe zzffeVar) {
        this.zzb = zzcgjVar;
        this.zzc = context;
        this.zzd = zzemxVar;
        this.zza = zzffeVar;
        this.zze = zzcgjVar.zzz();
        zzffeVar.zzv(zzemxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        zzcsj zzcsjVar = this.zzf;
        if (zzcsjVar != null && zzcsjVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) {
        zzfkf zzfkfVar;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        if (com.google.android.gms.ads.internal.util.zzt.f(this.zzc) && zzlVar.f10217s == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenc
                @Override // java.lang.Runnable
                public final void run() {
                    zzenh.this.zzf();
                }
            });
            return false;
        } else if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzend
                @Override // java.lang.Runnable
                public final void run() {
                    zzenh.this.zzg();
                }
            });
            return false;
        } else {
            zzfgd.zza(this.zzc, zzlVar.f10204f);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzia)).booleanValue() && zzlVar.f10204f) {
                this.zzb.zzl().zzo(true);
            }
            int i10 = ((zzenb) zzemyVar).zza;
            zzuVar.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String zza = zzdrt.PUBLIC_API_CALL.zza();
            Long valueOf = Long.valueOf(currentTimeMillis);
            Bundle zza2 = zzdrv.zza(new Pair(zza, valueOf), new Pair(zzdrt.DYNAMITE_ENTER.zza(), valueOf));
            zzffe zzffeVar = this.zza;
            zzffeVar.zzH(zzlVar);
            zzffeVar.zzA(zza2);
            zzffeVar.zzC(i10);
            Context context = this.zzc;
            zzffg zzJ = zzffeVar.zzJ();
            zzfju zzb = zzfjt.zzb(context, zzfke.zzf(zzJ), 8, zzlVar);
            com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzJ.zzn;
            if (zzcbVar != null) {
                this.zzd.zzd().zzm(zzcbVar);
            }
            zzdhk zzh = this.zzb.zzh();
            zzcvy zzcvyVar = new zzcvy();
            zzcvyVar.zze(this.zzc);
            zzcvyVar.zzi(zzJ);
            zzh.zzf(zzcvyVar.zzj());
            zzdci zzdciVar = new zzdci();
            zzdciVar.zzk(this.zzd.zzd(), this.zzb.zzB());
            zzh.zze(zzdciVar.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcph(null));
            zzdhl zzg = zzh.zzg();
            if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
                zzfkf zzf = zzg.zzf();
                zzf.zzi(8);
                zzf.zzb(zzlVar.f10214p);
                zzf.zzf(zzlVar.f10211m);
                zzfkfVar = zzf;
            } else {
                zzfkfVar = null;
            }
            this.zzb.zzy().zzc(1);
            zzgcu zzgcuVar = zzbzo.zza;
            zzhfk.zzb(zzgcuVar);
            ScheduledExecutorService zzC = this.zzb.zzC();
            zzctc zza3 = zzg.zza();
            zzcsj zzcsjVar = new zzcsj(zzgcuVar, zzC, zza3.zzi(zza3.zzj()));
            this.zzf = zzcsjVar;
            zzcsjVar.zze(new zzeng(this, zzemzVar, zzfkfVar, zzb, zzg));
            return true;
        }
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzdB(zzfgi.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzdB(zzfgi.zzd(6, null, null));
    }
}
