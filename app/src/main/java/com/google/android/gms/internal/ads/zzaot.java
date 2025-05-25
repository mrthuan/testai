package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaot extends Thread {
    private static final boolean zza = zzapt.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaor zzd;
    private volatile boolean zze = false;
    private final zzapu zzf;
    private final zzaoy zzg;

    public zzaot(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaor zzaorVar, zzaoy zzaoyVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaorVar;
        this.zzg = zzaoyVar;
        this.zzf = new zzapu(this, blockingQueue2, zzaoyVar);
    }

    private void zzc() {
        zzaph zzaphVar = (zzaph) this.zzb.take();
        zzaphVar.zzm("cache-queue-take");
        zzaphVar.zzt(1);
        try {
            zzaphVar.zzw();
            zzaoq zza2 = this.zzd.zza(zzaphVar.zzj());
            if (zza2 == null) {
                zzaphVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzaphVar)) {
                    this.zzc.put(zzaphVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzaphVar.zzm("cache-hit-expired");
                    zzaphVar.zze(zza2);
                    if (!this.zzf.zzc(zzaphVar)) {
                        this.zzc.put(zzaphVar);
                    }
                } else {
                    zzaphVar.zzm("cache-hit");
                    zzapn zzh = zzaphVar.zzh(new zzapd(zza2.zza, zza2.zzg));
                    zzaphVar.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzaphVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzaphVar.zzj(), true);
                        zzaphVar.zze(null);
                        if (!this.zzf.zzc(zzaphVar)) {
                            this.zzc.put(zzaphVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzaphVar.zzm("cache-hit-refresh-needed");
                        zzaphVar.zze(zza2);
                        zzh.zzd = true;
                        if (!this.zzf.zzc(zzaphVar)) {
                            this.zzg.zzb(zzaphVar, zzh, new zzaos(this, zzaphVar));
                        } else {
                            this.zzg.zzb(zzaphVar, zzh, null);
                        }
                    } else {
                        this.zzg.zzb(zzaphVar, zzh, null);
                    }
                }
            }
        } finally {
            zzaphVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzapt.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapt.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
