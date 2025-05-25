package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcvn implements zzcwq, zzddv, zzdbl, zzcxg, zzaxw {
    private final zzcxi zza;
    private final zzfel zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgdc zze = zzgdc.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcvn(zzcxi zzcxiVar, zzfel zzfelVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcxiVar;
        this.zzb = zzfelVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        if (this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
        zzfel zzfelVar = this.zzb;
        if (zzfelVar.zze != 3) {
            int i10 = zzfelVar.zzY;
            if (i10 == 0 || i10 == 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkB)).booleanValue() && zzm()) {
                    return;
                }
                this.zza.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkB)).booleanValue() && zzm() && zzaxvVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.h("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzk() {
        if (this.zzb.zze != 3) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbm)).booleanValue()) {
                zzfel zzfelVar = this.zzb;
                if (zzfelVar.zzY == 2) {
                    if (zzfelVar.zzq == 0) {
                        this.zza.zza();
                        return;
                    }
                    zzgcj.zzr(this.zze, new zzcvm(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcvn.this.zzh();
                        }
                    }, this.zzb.zzq, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(zzbvn zzbvnVar, String str, String str2) {
    }
}
