package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzpn {
    private final zzpm zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpn(AudioTrack audioTrack) {
        this.zza = new zzpm(audioTrack);
        zzh(0);
    }

    private final void zzh(int i10) {
        this.zzb = i10;
        long j10 = 10000;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    j10 = 500000;
                } else {
                    j10 = 10000000;
                }
            } else {
                this.zzd = 10000L;
                return;
            }
        } else {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        }
        this.zzd = j10;
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        if (this.zzb == 2) {
            return true;
        }
        return false;
    }

    public final boolean zzg(long j10) {
        if (j10 - this.zze < this.zzd) {
            return false;
        }
        this.zze = j10;
        boolean zzc = this.zza.zzc();
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return zzc;
                    }
                    if (!zzc) {
                        return false;
                    }
                    zzh(0);
                    return true;
                } else if (!zzc) {
                    zzh(0);
                    return false;
                }
            } else if (zzc) {
                if (this.zza.zza() > this.zzf) {
                    zzh(2);
                    return true;
                }
            } else {
                zzh(0);
                return false;
            }
            return true;
        } else if (zzc) {
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        } else if (j10 - this.zzc <= 500000) {
            return false;
        } else {
            zzh(3);
            return false;
        }
    }
}
