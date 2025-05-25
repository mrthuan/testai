package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeqi implements zzevo {
    private final zzgcu zza;

    public zzeqi(zzgcu zzgcuVar) {
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeqh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                zzuVar.f10560j.getClass();
                return new zzeqj(Long.valueOf(System.currentTimeMillis() - zzuVar.f10557g.zzi().zzh().zza()).longValue());
            }
        });
    }
}
