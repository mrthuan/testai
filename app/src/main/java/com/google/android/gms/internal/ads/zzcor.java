package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcor implements zzayp {
    private final ScheduledExecutorService zza;
    private final Clock zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcor(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = scheduledExecutorService;
        this.zzb = clock;
        com.google.android.gms.ads.internal.zzu.B.f10556f.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayp
    public final void zza(boolean z10) {
        if (z10) {
            zzc();
        } else {
            zzb();
        }
    }

    public final synchronized void zzb() {
        if (!this.zzg) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzc.cancel(true);
                this.zze = this.zzd - this.zzb.b();
            } else {
                this.zze = -1L;
            }
            this.zzg = true;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        if (this.zzg) {
            if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
            }
            this.zzg = false;
        }
    }

    public final synchronized void zzd(int i10, Runnable runnable) {
        this.zzf = runnable;
        long j10 = i10;
        this.zzd = this.zzb.b() + j10;
        this.zzc = this.zza.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}
