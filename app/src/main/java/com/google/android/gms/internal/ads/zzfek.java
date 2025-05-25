package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfek {
    private final Clock zza;
    private final Object zzb = new Object();
    private volatile int zzd = 1;
    private volatile long zzc = 0;

    public zzfek(Clock clock) {
        this.zza = clock;
    }

    private final void zze() {
        long a10 = this.zza.a();
        synchronized (this.zzb) {
            try {
                if (this.zzd == 3) {
                    if (this.zzc + ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfp)).longValue() <= a10) {
                        this.zzd = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzf(int i10, int i11) {
        zze();
        Object obj = this.zzb;
        long a10 = this.zza.a();
        synchronized (obj) {
            if (this.zzd != i10) {
                return;
            }
            this.zzd = i11;
            if (this.zzd == 3) {
                this.zzc = a10;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z10) {
        if (z10) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzb) {
            zze();
            if (this.zzd == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzb) {
            zze();
            if (this.zzd == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
