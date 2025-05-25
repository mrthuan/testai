package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbxr implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzbxr(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzbxq zzb() {
        return new zzbxq((Clock) this.zza.zzb(), (zzbxo) this.zzb.zzb());
    }
}
