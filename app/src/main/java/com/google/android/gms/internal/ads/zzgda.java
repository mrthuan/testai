package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgda {
    public static zzgcu zza(ExecutorService executorService) {
        zzgcu zzgcwVar;
        if (executorService instanceof zzgcu) {
            return (zzgcu) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgcwVar = new zzgcz((ScheduledExecutorService) executorService);
        } else {
            zzgcwVar = new zzgcw(executorService);
        }
        return zzgcwVar;
    }

    public static Executor zzb() {
        return zzgbx.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzgax zzgaxVar) {
        executor.getClass();
        if (executor == zzgbx.INSTANCE) {
            return executor;
        }
        return new zzgcv(executor, zzgaxVar);
    }
}
