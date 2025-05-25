package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcqx implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzcqx(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzcqw zzb() {
        return new zzcqw(((zzcqg) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
