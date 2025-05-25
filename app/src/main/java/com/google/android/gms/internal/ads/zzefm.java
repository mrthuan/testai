package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzefm implements zzeez {
    private final Context zza;
    private final zzcoy zzb;

    public zzefm(Context context, zzcoy zzcoyVar) {
        this.zza = context;
        this.zzb = zzcoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        zzegy zzegyVar = new zzegy(zzfelVar, (zzbql) zzeewVar.zzb, AdFormat.APP_OPEN_AD);
        zzcov zza = this.zzb.zza(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdfs(zzegyVar, null), new zzcow(zzfelVar.zzaa));
        zzegyVar.zzb(zza.zzc());
        ((zzegp) zzeewVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        try {
            ((zzbql) zzeewVar.zzb).zzq(zzfelVar.zzZ);
            ((zzbql) zzeewVar.zzb).zzi(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzefl(zzeewVar, null), (zzbos) zzeewVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.i();
            throw new zzffn(e10);
        }
    }
}
