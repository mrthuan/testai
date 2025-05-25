package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzetw implements zzevo {
    private final zzevo zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzetw(zzevo zzevoVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzevoVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        y9.a zzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbX)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j10 = this.zzb;
        if (j10 > 0) {
            zzb = zzgcj.zzo(zzb, j10, timeUnit, this.zzc);
        }
        return zzgcj.zzf(zzb, Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzetv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzetw.this.zzc((Throwable) obj);
            }
        }, zzbzo.zzf);
    }

    public final y9.a zzc(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbW)).booleanValue()) {
            zzevo zzevoVar = this.zza;
            zzbze zzbzeVar = com.google.android.gms.ads.internal.zzu.B.f10557g;
            int zza = zzevoVar.zza();
            zzbzeVar.zzw(th2, "OptionalSignalTimeout:" + zza);
        }
        return zzgcj.zzh(null);
    }
}
