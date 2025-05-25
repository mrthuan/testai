package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeje implements zzeez {
    private final Context zza;
    private final zzdou zzb;

    public zzeje(Context context, zzdou zzdouVar) {
        this.zza = context;
        this.zzb = zzdouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        zzegy zzegyVar = new zzegy(zzfelVar, (zzbql) zzeewVar.zzb, AdFormat.REWARDED);
        zzdoq zze = this.zzb.zze(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdor(zzegyVar));
        zzegyVar.zzb(zze.zzc());
        ((zzegp) zzeewVar.zzc).zzc(zze.zzo());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        try {
            ((zzbql) zzeewVar.zzb).zzq(zzfelVar.zzZ);
            if (zzfexVar.zza.zza.zzo.zza == 3) {
                ((zzbql) zzeewVar.zzb).zzo(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzejd(this, zzeewVar, null), (zzbos) zzeewVar.zzc);
            } else {
                ((zzbql) zzeewVar.zzb).zzp(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzejd(this, zzeewVar, null), (zzbos) zzeewVar.zzc);
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }
}
