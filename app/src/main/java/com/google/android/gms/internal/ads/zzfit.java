package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfit {
    final /* synthetic */ zzfjd zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfit(zzfjd zzfjdVar, Object obj, List list, zzfis zzfisVar) {
        this.zza = zzfjdVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfjc zza(Callable callable) {
        zzgcu zzgcuVar;
        zzgci zzb = zzgcj.zzb(this.zzc);
        y9.a zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfir
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzbzo.zzf);
        zzgcuVar = this.zza.zzb;
        y9.a zza2 = zzb.zza(callable, zzgcuVar);
        return new zzfjc(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
