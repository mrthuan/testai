package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzenq implements zzevo {
    private final Clock zza;
    private final zzffg zzb;

    public zzenq(Clock clock, zzffg zzffgVar) {
        this.zza = clock;
        this.zzb = zzffgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return zzgcj.zzh(new zzenr(this.zzb, this.zza.a()));
    }
}
