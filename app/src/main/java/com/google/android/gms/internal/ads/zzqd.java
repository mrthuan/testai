package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqd {
    private final zzct[] zza;
    private final zzqx zzb;
    private final zzcw zzc;

    public zzqd(zzct... zzctVarArr) {
        zzqx zzqxVar = new zzqx();
        zzcw zzcwVar = new zzcw();
        this.zza = r2;
        System.arraycopy(zzctVarArr, 0, r2, 0, 0);
        this.zzb = zzqxVar;
        this.zzc = zzcwVar;
        zzct[] zzctVarArr2 = {zzqxVar, zzcwVar};
    }

    public final long zza(long j10) {
        if (this.zzc.zzg()) {
            return this.zzc.zzi(j10);
        }
        return j10;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbq zzc(zzbq zzbqVar) {
        this.zzc.zzk(zzbqVar.zzb);
        this.zzc.zzj(zzbqVar.zzc);
        return zzbqVar;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzct[] zze() {
        return this.zza;
    }
}
