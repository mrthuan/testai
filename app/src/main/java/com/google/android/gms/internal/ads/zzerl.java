package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzerl implements zzhfc {
    private final zzhfu zza;

    public zzerl(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        return new zzetw(zzetd.zza(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlk)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
