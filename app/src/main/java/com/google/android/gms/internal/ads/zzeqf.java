package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzeqf {
    public final y9.a zza;
    private final long zzb;
    private final Clock zzc;

    public zzeqf(y9.a aVar, long j10, Clock clock) {
        this.zza = aVar;
        this.zzc = clock;
        this.zzb = clock.b() + j10;
    }

    public final boolean zza() {
        if (this.zzb < this.zzc.b()) {
            return true;
        }
        return false;
    }
}
