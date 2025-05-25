package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzejw implements zzeez {
    private final Context zza;
    private final Executor zzb;
    private final zzdou zzc;

    public zzejw(Context context, Executor executor, zzdou zzdouVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdouVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzejw zzejwVar) {
        return zzejwVar.zzb;
    }

    public static final void zze(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        try {
            ((zzfge) zzeewVar.zzb).zzk(zzfexVar.zza.zza.zzd, zzfelVar.zzv.toString());
        } catch (Exception unused) {
            "Fail to load ad from adapter ".concat(String.valueOf(zzeewVar.zza));
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, final zzeew zzeewVar) {
        zzdoq zze = this.zzc.zze(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdor(new zzdgx() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // com.google.android.gms.internal.ads.zzdgx
            public final void zza(boolean z10, Context context, zzcxd zzcxdVar) {
                zzeew zzeewVar2 = zzeew.this;
                try {
                    ((zzfge) zzeewVar2.zzb).zzv(z10);
                    ((zzfge) zzeewVar2.zzb).zzA();
                } catch (zzffn e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                    throw new zzdgw(e10.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcmy((zzfge) zzeewVar.zzb), this.zzb);
        zzcxx zze2 = zze.zze();
        zzcwo zzb = zze.zzb();
        ((zzegq) zzeewVar.zzc).zzc(new zzejv(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        if (!((zzfge) zzeewVar.zzb).zzC()) {
            ((zzegq) zzeewVar.zzc).zzd(new zzeju(this, zzfexVar, zzfelVar, zzeewVar));
            Object obj = zzeewVar.zzb;
            Context context = this.zza;
            zzffg zzffgVar = zzfexVar.zza.zza;
            String jSONObject = zzfelVar.zzv.toString();
            ((zzfge) obj).zzh(context, zzffgVar.zzd, null, (zzbvy) zzeewVar.zzc, jSONObject);
            return;
        }
        zze(zzfexVar, zzfelVar, zzeewVar);
    }
}
