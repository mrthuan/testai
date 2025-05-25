package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeyz {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzevo zza(zzeyd zzeydVar, zzeto zzetoVar, ScheduledExecutorService scheduledExecutorService, int i10) {
        if (i10 == 0) {
            zzeydVar = zzetoVar;
        }
        return new zzetw(zzeydVar, 0L, scheduledExecutorService);
    }

    public static zzevo zzb(zzeyn zzeynVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzetw(zzeynVar, ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdK)).longValue(), scheduledExecutorService);
    }

    public static zzevo zzc(zzezi zzeziVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzetw(zzeziVar, 0L, scheduledExecutorService);
    }
}
