package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeuv implements zzevo {
    private final String zza;
    private final zzgcu zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzffg zze;
    private final zzcgj zzf;

    public zzeuv(zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzffg zzffgVar, zzcgj zzcgjVar) {
        this.zzb = zzgcuVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzffgVar;
        this.zzf = zzcgjVar;
    }

    public static y9.a zzc(zzeuv zzeuvVar) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzr zzp = zzeuvVar.zzf.zzp();
        zzcvy zzcvyVar = new zzcvy();
        zzcvyVar.zze(zzeuvVar.zzd);
        zzffe zzffeVar = new zzffe();
        zzffeVar.zzt("adUnitId");
        zzffeVar.zzH(zzeuvVar.zze.zzd);
        zzffeVar.zzs(new com.google.android.gms.ads.internal.client.zzq());
        zzffeVar.zzz(true);
        zzcvyVar.zzi(zzffeVar.zzJ());
        zzp.zza(zzcvyVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzan zzanVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzan();
        zzanVar.f10680a = zzeuvVar.zza;
        zzp.zzb(new com.google.android.gms.ads.nonagon.signalgeneration.zzap(zzanVar));
        new zzdci();
        return zzgcj.zze(zzgcj.zzm((zzgca) zzgcj.zzo(zzgca.zzu(zzp.zzc().zzb()), ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgt)).longValue(), TimeUnit.MILLISECONDS, zzeuvVar.zzc), new zzful() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzeuw zzeuwVar;
                com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzay) obj;
                if (zzayVar != null) {
                    zzeuwVar = new zzeuw(zzayVar.f10693a);
                } else {
                    zzeuwVar = new zzeuw(null);
                }
                return zzeuwVar;
            }
        }, zzeuvVar.zzb), Exception.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return new zzeuw(null);
            }
        }, zzeuvVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgs)).booleanValue() && !this.zze.zzr) {
            return zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzeuu
                @Override // com.google.android.gms.internal.ads.zzgbp
                public final y9.a zza() {
                    return zzeuv.zzc(zzeuv.this);
                }
            }, this.zzb);
        }
        return zzgcj.zzh(new zzeuw(null));
    }
}
