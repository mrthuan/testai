package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeht implements zzeez {
    private final Context zza;
    private final zzdhl zzb;
    private zzbpb zzc;
    private final VersionInfoParcel zzd;

    public zzeht(Context context, zzdhl zzdhlVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdhlVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        if (zzfexVar.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdjb zzt = zzdjb.zzt(this.zzc);
            zzffg zzffgVar = zzfexVar.zza.zza;
            if (zzffgVar.zzg.contains(Integer.toString(zzt.zzc()))) {
                zzdjd zze = this.zzb.zze(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdjn(zzt), new zzdle(null, null, this.zzc));
                ((zzegp) zzeewVar.zzc).zzc(zze.zzj());
                return zze.zza();
            }
            throw new zzeir(1, "No corresponding native ad listener");
        }
        throw new zzeir(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        try {
            ((zzbql) zzeewVar.zzb).zzq(zzfelVar.zzZ);
            if (this.zzd.c < ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbx)).intValue()) {
                ((zzbql) zzeewVar.zzb).zzm(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzehs(this, zzeewVar, null), (zzbos) zzeewVar.zzc);
            } else {
                ((zzbql) zzeewVar.zzb).zzn(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzehs(this, zzeewVar, null), (zzbos) zzeewVar.zzc, zzfexVar.zza.zza.zzi);
            }
        } catch (RemoteException e10) {
            throw new zzffn(e10);
        }
    }
}
