package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbmq implements zzbzv {
    final /* synthetic */ zzbmz zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ zzbna zzc;

    public zzbmq(zzbna zzbnaVar, zzbmz zzbmzVar, zzfju zzfjuVar) {
        this.zza = zzbmzVar;
        this.zzb = zzfjuVar;
        this.zzc = zzbnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzv
    public final void zza() {
        Object obj;
        zzfki zzfkiVar;
        zzfki zzfkiVar2;
        com.google.android.gms.ads.internal.util.zze.h("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.zzc.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.h("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.h("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbdl.zzd.zze()).booleanValue()) {
                zzbna zzbnaVar = this.zzc;
                zzfkiVar = zzbnaVar.zze;
                if (zzfkiVar != null) {
                    zzfkiVar2 = zzbnaVar.zze;
                    zzfju zzfjuVar = this.zzb;
                    zzfjuVar.zzc("Failed loading new engine");
                    zzfjuVar.zzg(false);
                    zzfkiVar2.zzb(zzfjuVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.h("loadNewJavascriptEngine (failure): Lock released");
    }
}
