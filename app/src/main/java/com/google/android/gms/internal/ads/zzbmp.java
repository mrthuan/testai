package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbmp implements zzbzx {
    final /* synthetic */ zzbmz zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ zzbna zzc;

    public zzbmp(zzbna zzbnaVar, zzbmz zzbmzVar, zzfju zzfjuVar) {
        this.zza = zzbmzVar;
        this.zzb = zzfjuVar;
        this.zzc = zzbnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbmz zzbmzVar;
        zzfki zzfkiVar;
        zzfki zzfkiVar2;
        zzbmz zzbmzVar2;
        zzbmz zzbmzVar3;
        zzblv zzblvVar = (zzblv) obj;
        com.google.android.gms.ads.internal.util.zze.h("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.h("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbna zzbnaVar = this.zzc;
            zzbmzVar = zzbnaVar.zzh;
            if (zzbmzVar != null) {
                zzbmz zzbmzVar4 = this.zza;
                zzbmzVar2 = zzbnaVar.zzh;
                if (zzbmzVar4 != zzbmzVar2) {
                    com.google.android.gms.ads.internal.util.zze.h("New JS engine is loaded, marking previous one as destroyable.");
                    zzbmzVar3 = this.zzc.zzh;
                    zzbmzVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbdl.zzd.zze()).booleanValue()) {
                zzbna zzbnaVar2 = this.zzc;
                zzfkiVar = zzbnaVar2.zze;
                if (zzfkiVar != null) {
                    zzfkiVar2 = zzbnaVar2.zze;
                    zzfju zzfjuVar = this.zzb;
                    zzfjuVar.zzg(true);
                    zzfkiVar2.zzb(zzfjuVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.h("loadNewJavascriptEngine (success): Lock released");
    }
}
