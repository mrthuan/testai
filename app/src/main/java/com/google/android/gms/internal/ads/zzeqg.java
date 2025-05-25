package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeqg implements zzevo {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzevo zzc;
    private final long zzd;

    public zzeqg(zzevo zzevoVar, long j10, Clock clock) {
        this.zzb = clock;
        this.zzc = zzevoVar;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzeqf zzeqfVar = (zzeqf) this.zza.get();
        if (zzeqfVar == null || zzeqfVar.zza()) {
            zzevo zzevoVar = this.zzc;
            zzeqf zzeqfVar2 = new zzeqf(zzevoVar.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeqfVar2);
            zzeqfVar = zzeqfVar2;
        }
        return zzeqfVar.zza;
    }
}
