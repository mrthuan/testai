package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgdj extends zzgbz implements RunnableFuture {
    private volatile zzgcs zza;

    public zzgdj(zzgbp zzgbpVar) {
        this.zza = new zzgdh(this, zzgbpVar);
    }

    public static zzgdj zze(Runnable runnable, Object obj) {
        return new zzgdj(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgcs zzgcsVar = this.zza;
        if (zzgcsVar != null) {
            zzgcsVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        zzgcs zzgcsVar = this.zza;
        if (zzgcsVar != null) {
            return a6.h.d("task=[", zzgcsVar.toString(), "]");
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzgcs zzgcsVar;
        if (zzt() && (zzgcsVar = this.zza) != null) {
            zzgcsVar.zzh();
        }
        this.zza = null;
    }

    public zzgdj(Callable callable) {
        this.zza = new zzgdi(this, callable);
    }
}
