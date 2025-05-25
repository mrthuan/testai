package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzcgj implements zzclv {
    private static zzcgj zza;

    private static synchronized zzcgj zzD(Context context, zzbom zzbomVar, int i10, boolean z10, int i11, zzchn zzchnVar) {
        synchronized (zzcgj.class) {
            zzcgj zzcgjVar = zza;
            if (zzcgjVar != null) {
                return zzcgjVar;
            }
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzuVar.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzbbw.zza(context);
            if (((Boolean) zzbdk.zze.zze()).booleanValue()) {
                zzbbg.zzd(context);
            }
            zzfgc zzd = zzfgc.zzd(context);
            VersionInfoParcel zzc = zzd.zzc(242402000, false, i11);
            zzd.zzf(zzbomVar);
            zzcjb zzcjbVar = new zzcjb(null);
            zzcgk zzcgkVar = new zzcgk();
            zzcgkVar.zzf(zzc);
            zzcgkVar.zze(context);
            zzcgkVar.zzd(currentTimeMillis);
            zzcjbVar.zzb(new zzcgm(zzcgkVar, null));
            zzcjbVar.zzc(new zzcko(zzchnVar));
            zzcgj zza2 = zzcjbVar.zza();
            zzuVar.f10557g.zzu(context, zzc);
            zzuVar.f10559i.zzi(context);
            zzuVar.c.z(context);
            zzuVar.c.y(context);
            com.google.android.gms.ads.internal.util.zzd.a(context);
            zzuVar.f10556f.zzd(context);
            zzuVar.f10575y.a(context);
            zza2.zza().b();
            zzbyb.zzd(context);
            zzbbn zzbbnVar = zzbbw.zzfB;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                if (!((Boolean) zzbaVar.c.zza(zzbbw.zzap)).booleanValue()) {
                    new zzecu(context, zzc, new zzbav(new zzbbb(context)), new zzebz(new zzebv(context), zza2.zzA())).zzb(zzuVar.f10557g.zzi().zzS());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcgj zzb(Context context, zzbom zzbomVar, int i10) {
        return zzD(context, zzbomVar, 242402000, false, i10, new zzchn());
    }

    public abstract zzgcu zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract com.google.android.gms.ads.internal.util.zzcb zza();

    public abstract zzcky zzc();

    public abstract zzcox zzd();

    public abstract zzcqk zze();

    public abstract zzczj zzf();

    public abstract zzdgo zzg();

    public abstract zzdhk zzh();

    public abstract zzdot zzi();

    public abstract zzdsk zzj();

    public abstract zzdtt zzk();

    public abstract zzdvi zzl();

    public abstract zzdwf zzm();

    public abstract zzeds zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzl zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzr zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzak zzq();

    @Override // com.google.android.gms.internal.ads.zzclv
    public final zzewr zzr(zzbvb zzbvbVar, int i10) {
        return zzs(new zzeyq(zzbvbVar, i10));
    }

    public abstract zzewr zzs(zzeyq zzeyqVar);

    public abstract zzezl zzt();

    public abstract zzfaz zzu();

    public abstract zzfcq zzv();

    public abstract zzfee zzw();

    public abstract zzffv zzx();

    public abstract zzfgf zzy();

    public abstract zzfki zzz();
}
