package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfjd {
    private static final y9.a zza = zzgcj.zzh(null);
    private final zzgcu zzb;
    private final ScheduledExecutorService zzc;
    private final zzfje zzd;

    public zzfjd(zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, zzfje zzfjeVar) {
        this.zzb = zzgcuVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfjeVar;
    }

    public final zzfit zza(Object obj, y9.a... aVarArr) {
        return new zzfit(this, obj, Arrays.asList(aVarArr), null);
    }

    public final zzfjc zzb(Object obj, y9.a aVar) {
        return new zzfjc(this, obj, aVar, Collections.singletonList(aVar), aVar);
    }

    public abstract String zzf(Object obj);
}
