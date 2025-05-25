package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzegf implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzegf(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzege zzb() {
        return new zzege((Context) this.zza.zzb(), (zzcql) this.zzb.zzb());
    }
}
