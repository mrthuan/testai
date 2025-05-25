package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzerc implements zzhfc {
    private final zzhfu zza;

    public zzerc(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzfxw zzn;
        zzeqi zza = zzeqk.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        zzbbn zzbbnVar = zzbbw.zzdG;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            zzn = zzfxw.zzo(new zzetw(zza, ((Integer) zzbaVar.c.zza(zzbbw.zzdH)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzfxw.zzn();
        }
        zzhfk.zzb(zzn);
        return zzn;
    }
}
