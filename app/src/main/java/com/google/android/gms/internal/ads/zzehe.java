package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzehe implements zzeez {
    private final Context zza;
    private final zzdgp zzb;

    public zzehe(Context context, zzdgp zzdgpVar) {
        this.zza = context;
        this.zzb = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        zzegy zzegyVar = new zzegy(zzfelVar, (zzbql) zzeewVar.zzb, AdFormat.INTERSTITIAL);
        zzdfp zze = this.zzb.zze(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdfs(zzegyVar, null));
        zzegyVar.zzb(zze.zzc());
        ((zzegp) zzeewVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        try {
            ((zzbql) zzeewVar.zzb).zzq(zzfelVar.zzZ);
            ((zzbql) zzeewVar.zzb).zzl(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzehd(this, zzeewVar, null), (zzbos) zzeewVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.i();
            throw new zzffn(e10);
        }
    }
}
