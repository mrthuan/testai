package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgcj extends zzgcl {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgci zza(Iterable iterable) {
        return new zzgci(false, zzfxr.zzk(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgci zzb(Iterable iterable) {
        int i10 = zzfxr.zzd;
        iterable.getClass();
        return new zzgci(true, zzfxr.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgci zzc(y9.a... aVarArr) {
        return new zzgci(true, zzfxr.zzl(aVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y9.a zzd(Iterable iterable) {
        return new zzgbr(zzfxr.zzk(iterable), true);
    }

    public static y9.a zze(y9.a aVar, Class cls, zzful zzfulVar, Executor executor) {
        zzgau zzgauVar = new zzgau(aVar, cls, zzfulVar);
        aVar.addListener(zzgauVar, zzgda.zzc(executor, zzgauVar));
        return zzgauVar;
    }

    public static y9.a zzf(y9.a aVar, Class cls, zzgbq zzgbqVar, Executor executor) {
        zzgat zzgatVar = new zzgat(aVar, cls, zzgbqVar);
        aVar.addListener(zzgatVar, zzgda.zzc(executor, zzgatVar));
        return zzgatVar;
    }

    public static y9.a zzg(Throwable th2) {
        th2.getClass();
        return new zzgcm(th2);
    }

    public static y9.a zzh(Object obj) {
        if (obj == null) {
            return zzgcn.zza;
        }
        return new zzgcn(obj);
    }

    public static y9.a zzi() {
        return zzgcn.zza;
    }

    public static y9.a zzj(Callable callable, Executor executor) {
        zzgdj zzgdjVar = new zzgdj(callable);
        executor.execute(zzgdjVar);
        return zzgdjVar;
    }

    public static y9.a zzk(zzgbp zzgbpVar, Executor executor) {
        zzgdj zzgdjVar = new zzgdj(zzgbpVar);
        executor.execute(zzgdjVar);
        return zzgdjVar;
    }

    @SafeVarargs
    public static y9.a zzl(y9.a... aVarArr) {
        return new zzgbr(zzfxr.zzl(aVarArr), false);
    }

    public static y9.a zzm(y9.a aVar, zzful zzfulVar, Executor executor) {
        zzgbe zzgbeVar = new zzgbe(aVar, zzfulVar);
        aVar.addListener(zzgbeVar, zzgda.zzc(executor, zzgbeVar));
        return zzgbeVar;
    }

    public static y9.a zzn(y9.a aVar, zzgbq zzgbqVar, Executor executor) {
        int i10 = zzgbf.zzc;
        executor.getClass();
        zzgbd zzgbdVar = new zzgbd(aVar, zzgbqVar);
        aVar.addListener(zzgbdVar, zzgda.zzc(executor, zzgbdVar));
        return zzgbdVar;
    }

    public static y9.a zzo(y9.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aVar.isDone()) {
            return aVar;
        }
        return zzgdg.zzf(aVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return zzgdl.zza(future);
        }
        throw new IllegalStateException(zzfvj.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgdl.zza(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new zzgby((Error) cause);
            }
            throw new zzgdk(cause);
        }
    }

    public static void zzr(y9.a aVar, zzgcf zzgcfVar, Executor executor) {
        zzgcfVar.getClass();
        aVar.addListener(new zzgcg(aVar, zzgcfVar), executor);
    }
}
