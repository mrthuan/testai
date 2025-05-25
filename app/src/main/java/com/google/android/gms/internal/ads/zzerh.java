package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzerh implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzerh(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzfxw zzn;
        zzesi zzb = ((zzesk) this.zza).zzb();
        Context zza = ((zzcgp) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkw)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            if (com.google.android.gms.ads.internal.util.zzt.b(zza)) {
                zzn = zzfxw.zzo(zzb);
                zzhfk.zzb(zzn);
                return zzn;
            }
        }
        zzn = zzfxw.zzn();
        zzhfk.zzb(zzn);
        return zzn;
    }
}
