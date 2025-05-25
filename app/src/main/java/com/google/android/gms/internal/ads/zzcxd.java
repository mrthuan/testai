package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcxd extends zzdch implements zzcwu {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcxd(zzcxc zzcxcVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcxcVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzcwv
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((zzcwu) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzb() {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzcww
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((zzcwu) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzc(final zzdgw zzdgwVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzcwy
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((zzcwu) obj).zzc(zzdgw.this);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Timeout waiting for show call succeed to be called.");
            zzc(new zzdgw("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjO)).intValue();
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwx
            @Override // java.lang.Runnable
            public final void run() {
                zzcxd.this.zzd();
            }
        }, intValue, TimeUnit.MILLISECONDS);
    }
}
