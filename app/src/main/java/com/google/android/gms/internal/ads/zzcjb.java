package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcjb {
    private zzcgm zza;
    private zzcko zzb;
    private zzfjp zzc;
    private zzcla zzd;
    private zzfgj zze;

    private zzcjb() {
        throw null;
    }

    public /* synthetic */ zzcjb(zzcja zzcjaVar) {
    }

    public final zzcgj zza() {
        zzhfk.zzc(this.zza, zzcgm.class);
        zzhfk.zzc(this.zzb, zzcko.class);
        if (this.zzc == null) {
            this.zzc = new zzfjp();
        }
        if (this.zzd == null) {
            this.zzd = new zzcla();
        }
        if (this.zze == null) {
            this.zze = new zzfgj();
        }
        return new zzcif(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcjb zzb(zzcgm zzcgmVar) {
        this.zza = zzcgmVar;
        return this;
    }

    public final zzcjb zzc(zzcko zzckoVar) {
        this.zzb = zzckoVar;
        return this;
    }
}
