package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgcg implements Runnable {
    final Future zza;
    final zzgcf zzb;

    public zzgcg(Future future, zzgcf zzgcfVar) {
        this.zza = future;
        this.zzb = zzgcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzgdm) && (zza = zzgdn.zza((zzgdm) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgcj.zzp(this.zza));
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzfup zza = zzfuq.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
