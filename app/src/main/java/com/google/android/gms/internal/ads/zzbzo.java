package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbzo {
    public static final zzgcu zza;
    public static final zzgcu zzb;
    public static final zzgcu zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgcu zze;
    public static final zzgcu zzf;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        zzbbn zzbbnVar = zzbbw.zzkr;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (zzbaVar.c.zzb(zzbbnVar) != null && ((Boolean) zzbaVar.c.zzb(zzbbnVar)).booleanValue()) {
            zzbbn zzbbnVar2 = zzbbw.zzks;
            if (zzbaVar.c.zzb(zzbbnVar2) != null) {
                zzbbn zzbbnVar3 = zzbbw.zzkt;
                if (zzbaVar.c.zzb(zzbbnVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzbaVar.c.zzb(zzbbnVar2)).intValue(), ((Integer) zzbaVar.c.zzb(zzbbnVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzk("Default"));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) zzbaVar.c.zzb(zzbbnVar3)).booleanValue());
                    zza = new zzbzn(threadPoolExecutor, null);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new zzbzk("Loader"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    zzb = new zzbzn(threadPoolExecutor2, null);
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new zzbzk("Activeview"));
                    threadPoolExecutor3.allowCoreThreadTimeOut(true);
                    zzc = new zzbzn(threadPoolExecutor3, null);
                    zzd = new zzbzj(3, new zzbzk("Schedule"));
                    zze = new zzbzn(new zzbzl(), null);
                    zzf = new zzbzn(zzgda.zzb(), null);
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzk("Default"));
        zza = new zzbzn(threadPoolExecutor, null);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, new LinkedBlockingQueue(), new zzbzk("Loader"));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        zzb = new zzbzn(threadPoolExecutor22, null);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new zzbzk("Activeview"));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        zzc = new zzbzn(threadPoolExecutor32, null);
        zzd = new zzbzj(3, new zzbzk("Schedule"));
        zze = new zzbzn(new zzbzl(), null);
        zzf = new zzbzn(zzgda.zzb(), null);
    }
}
