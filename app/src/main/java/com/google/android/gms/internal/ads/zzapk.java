package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzapk {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaor zze;
    private final zzapa zzf;
    private final zzapb[] zzg;
    private zzaot zzh;
    private final List zzi;
    private final List zzj;
    private final zzaoy zzk;

    public zzapk(zzaor zzaorVar, zzapa zzapaVar, int i10) {
        zzaoy zzaoyVar = new zzaoy(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaorVar;
        this.zzf = zzapaVar;
        this.zzg = new zzapb[4];
        this.zzk = zzaoyVar;
    }

    public final zzaph zza(zzaph zzaphVar) {
        zzaphVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzaphVar);
        }
        zzaphVar.zzg(this.zza.incrementAndGet());
        zzaphVar.zzm("add-to-queue");
        zzc(zzaphVar, 0);
        this.zzc.add(zzaphVar);
        return zzaphVar;
    }

    public final void zzb(zzaph zzaphVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzaphVar);
        }
        synchronized (this.zzi) {
            for (zzapj zzapjVar : this.zzi) {
                zzapjVar.zza();
            }
        }
        zzc(zzaphVar, 5);
    }

    public final void zzc(zzaph zzaphVar, int i10) {
        synchronized (this.zzj) {
            for (zzapi zzapiVar : this.zzj) {
                zzapiVar.zza();
            }
        }
    }

    public final void zzd() {
        zzaot zzaotVar = this.zzh;
        if (zzaotVar != null) {
            zzaotVar.zzb();
        }
        zzapb[] zzapbVarArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzapb zzapbVar = zzapbVarArr[i10];
            if (zzapbVar != null) {
                zzapbVar.zza();
            }
        }
        zzaot zzaotVar2 = new zzaot(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaotVar2;
        zzaotVar2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzapb zzapbVar2 = new zzapb(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i11] = zzapbVar2;
            zzapbVar2.start();
        }
    }
}
