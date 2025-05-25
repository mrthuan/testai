package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzapb extends Thread {
    private final BlockingQueue zza;
    private final zzapa zzb;
    private final zzaor zzc;
    private volatile boolean zzd = false;
    private final zzaoy zze;

    public zzapb(BlockingQueue blockingQueue, zzapa zzapaVar, zzaor zzaorVar, zzaoy zzaoyVar) {
        this.zza = blockingQueue;
        this.zzb = zzapaVar;
        this.zzc = zzaorVar;
        this.zze = zzaoyVar;
    }

    private void zzb() {
        zzaph zzaphVar = (zzaph) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaphVar.zzt(3);
        try {
            try {
                zzaphVar.zzm("network-queue-take");
                zzaphVar.zzw();
                TrafficStats.setThreadStatsTag(zzaphVar.zzc());
                zzapd zza = this.zzb.zza(zzaphVar);
                zzaphVar.zzm("network-http-complete");
                if (zza.zze && zzaphVar.zzv()) {
                    zzaphVar.zzp("not-modified");
                    zzaphVar.zzr();
                } else {
                    zzapn zzh = zzaphVar.zzh(zza);
                    zzaphVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzaphVar.zzj(), zzh.zzb);
                        zzaphVar.zzm("network-cache-written");
                    }
                    zzaphVar.zzq();
                    this.zze.zzb(zzaphVar, zzh, null);
                    zzaphVar.zzs(zzh);
                }
            } catch (zzapq e10) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaphVar, e10);
                zzaphVar.zzr();
            } catch (Exception e11) {
                zzapt.zzc(e11, "Unhandled exception %s", e11.toString());
                zzapq zzapqVar = new zzapq(e11);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaphVar, zzapqVar);
                zzaphVar.zzr();
            }
        } finally {
            zzaphVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapt.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
