package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzabq {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzabq(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.zza = j10;
        this.zzb = j11;
        this.zze = j13;
        this.zzf = j14;
        this.zzg = j15;
        this.zzc = j16;
        this.zzh = zzf(j11, 0L, j13, j14, j15, j16);
    }

    public static long zzf(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && 1 + j11 < j12) {
            long j16 = (((float) (j14 - j13)) / ((float) (j12 - j11))) * ((float) (j10 - j11));
            return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
        }
        return j13;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzabq zzabqVar, long j10, long j11) {
        zzabqVar.zze = j10;
        zzabqVar.zzg = j11;
        zzabqVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzabq zzabqVar, long j10, long j11) {
        zzabqVar.zzd = j10;
        zzabqVar.zzf = j11;
        zzabqVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
