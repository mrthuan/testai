package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdjk {
    zzbge zza;
    zzbgb zzb;
    zzbgr zzc;
    zzbgo zzd;
    zzblq zze;
    final y.i zzf = new y.i();
    final y.i zzg = new y.i();

    public final zzdjk zza(zzbgb zzbgbVar) {
        this.zzb = zzbgbVar;
        return this;
    }

    public final zzdjk zzb(zzbge zzbgeVar) {
        this.zza = zzbgeVar;
        return this;
    }

    public final zzdjk zzc(String str, zzbgk zzbgkVar, zzbgh zzbghVar) {
        this.zzf.put(str, zzbgkVar);
        if (zzbghVar != null) {
            this.zzg.put(str, zzbghVar);
        }
        return this;
    }

    public final zzdjk zzd(zzblq zzblqVar) {
        this.zze = zzblqVar;
        return this;
    }

    public final zzdjk zze(zzbgo zzbgoVar) {
        this.zzd = zzbgoVar;
        return this;
    }

    public final zzdjk zzf(zzbgr zzbgrVar) {
        this.zzc = zzbgrVar;
        return this;
    }

    public final zzdjm zzg() {
        return new zzdjm(this);
    }
}
