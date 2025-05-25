package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzefn implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzefn(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzefm zzb() {
        return new zzefm((Context) this.zza.zzb(), (zzcoy) this.zzb.zzb());
    }
}
