package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzecd {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();
    private final Object zzi = new Object();
    private final Object zzj = new Object();

    public final int zza() {
        int i10;
        synchronized (this.zzg) {
            i10 = this.zzb;
        }
        return i10;
    }

    public final synchronized long zzb() {
        long j10;
        synchronized (this.zzj) {
            j10 = this.zze;
        }
        return j10;
    }

    public final synchronized long zzc() {
        long j10;
        synchronized (this.zzi) {
            j10 = this.zzd;
        }
        return j10;
    }

    public final synchronized long zzd() {
        long j10;
        synchronized (this.zzf) {
            j10 = this.zza;
        }
        return j10;
    }

    public final long zze() {
        long j10;
        synchronized (this.zzh) {
            j10 = this.zzc;
        }
        return j10;
    }

    public final synchronized void zzf(long j10) {
        synchronized (this.zzj) {
            this.zze = j10;
        }
    }

    public final synchronized void zzg(long j10) {
        synchronized (this.zzi) {
            this.zzd = j10;
        }
    }

    public final synchronized void zzh(long j10) {
        synchronized (this.zzf) {
            this.zza = j10;
        }
    }

    public final void zzi(int i10) {
        synchronized (this.zzg) {
            this.zzb = i10;
        }
    }

    public final void zzj(long j10) {
        synchronized (this.zzh) {
            this.zzc = j10;
        }
    }
}
