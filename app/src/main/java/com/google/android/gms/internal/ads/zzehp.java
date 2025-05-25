package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzehp implements zzeez {
    private final Context zza;
    private final zzdhl zzb;
    private final Executor zzc;

    public zzehp(Context context, zzdhl zzdhlVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhlVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfex zzfexVar, int i10) {
        return zzfexVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        zzdjb zzah;
        zzbox zzD = ((zzfge) zzeewVar.zzb).zzD();
        zzboy zzE = ((zzfge) zzeewVar.zzb).zzE();
        zzbpb zzd = ((zzfge) zzeewVar.zzb).zzd();
        if (zzd != null && zzc(zzfexVar, 6)) {
            zzah = zzdjb.zzt(zzd);
        } else if (zzD != null && zzc(zzfexVar, 6)) {
            zzah = zzdjb.zzai(zzD);
        } else if (zzD != null && zzc(zzfexVar, 2)) {
            zzah = zzdjb.zzag(zzD);
        } else if (zzE != null && zzc(zzfexVar, 6)) {
            zzah = zzdjb.zzaj(zzE);
        } else if (zzE != null && zzc(zzfexVar, 1)) {
            zzah = zzdjb.zzah(zzE);
        } else {
            throw new zzeir(1, "No native ad mappers");
        }
        zzffg zzffgVar = zzfexVar.zza.zza;
        if (zzffgVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            zzdjd zze = this.zzb.zze(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdjn(zzah), new zzdle(zzE, zzD, zzd));
            ((zzegp) zzeewVar.zzc).zzc(zze.zzk());
            zze.zzd().zzo(new zzcmy((zzfge) zzeewVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeir(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        zzfge zzfgeVar = (zzfge) zzeewVar.zzb;
        zzffg zzffgVar = zzfexVar.zza.zza;
        zzffg zzffgVar2 = zzfexVar.zza.zza;
        zzbes zzbesVar = zzffgVar2.zzi;
        zzfgeVar.zzp(this.zza, zzffgVar.zzd, zzfelVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.j(zzfelVar.zzs), (zzbos) zzeewVar.zzc, zzbesVar, zzffgVar2.zzg);
    }
}
