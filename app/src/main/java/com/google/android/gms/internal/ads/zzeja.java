package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeja implements zzeez {
    private final Context zza;
    private final Executor zzb;
    private final zzdou zzc;

    public zzeja(Context context, Executor executor, zzdou zzdouVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, final zzeew zzeewVar) {
        zzdoq zze = this.zzc.zze(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdor(new zzdgx() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzdgx
            public final void zza(boolean z10, Context context, zzcxd zzcxdVar) {
                zzeew zzeewVar2 = zzeew.this;
                try {
                    ((zzfge) zzeewVar2.zzb).zzv(z10);
                    ((zzfge) zzeewVar2.zzb).zzz(context);
                } catch (zzffn e10) {
                    throw new zzdgw(e10.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcmy((zzfge) zzeewVar.zzb), this.zzb);
        ((zzegp) zzeewVar.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        try {
            zzffg zzffgVar = zzfexVar.zza.zza;
            if (zzffgVar.zzo.zza == 3) {
                ((zzfge) zzeewVar.zzb).zzr(this.zza, zzffgVar.zzd, zzfelVar.zzv.toString(), (zzbos) zzeewVar.zzc);
            } else {
                ((zzfge) zzeewVar.zzb).zzq(this.zza, zzffgVar.zzd, zzfelVar.zzv.toString(), (zzbos) zzeewVar.zzc);
            }
        } catch (Exception unused) {
            "Fail to load ad from adapter ".concat(String.valueOf(zzeewVar.zza));
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }
}
