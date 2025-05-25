package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzead implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzead(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzeac zzb() {
        return new zzeac(((zzcgp) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
