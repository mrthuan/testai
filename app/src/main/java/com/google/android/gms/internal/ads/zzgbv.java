package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgbv extends zzgcs {
    private final Executor zza;
    final /* synthetic */ zzgbw zzb;

    public zzgbv(zzgbw zzgbwVar, Executor executor) {
        this.zzb = zzgbwVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final void zzd(Throwable th2) {
        this.zzb.zza = null;
        if (th2 instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
