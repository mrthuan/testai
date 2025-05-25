package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdge implements zzhfc {
    private final zzhfu zza;

    public zzdge(zzdfs zzdfsVar, zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdei((zzcvn) this.zza.zzb(), zzbzo.zzf));
        zzhfk.zzb(singleton);
        return singleton;
    }
}
