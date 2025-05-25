package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdqv implements zzhfc {
    private final zzhfu zza;

    public zzdqv(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        Set emptySet;
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        zzdrn zzb = ((zzdro) this.zza).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzet)).booleanValue()) {
            emptySet = Collections.singleton(new zzdei(zzb, zzgcuVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhfk.zzb(emptySet);
        return emptySet;
    }
}
