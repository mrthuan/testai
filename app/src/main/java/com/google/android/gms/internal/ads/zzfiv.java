package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfiv {
    public static final zzfjc zza(Callable callable, Object obj, zzfjd zzfjdVar) {
        zzgcu zzgcuVar;
        zzgcuVar = zzfjdVar.zzb;
        return zzb(callable, zzgcuVar, obj, zzfjdVar);
    }

    public static final zzfjc zzb(Callable callable, zzgcu zzgcuVar, Object obj, zzfjd zzfjdVar) {
        y9.a aVar;
        aVar = zzfjd.zza;
        return new zzfjc(zzfjdVar, obj, aVar, Collections.emptyList(), zzgcuVar.zzb(callable));
    }

    public static final zzfjc zzc(y9.a aVar, Object obj, zzfjd zzfjdVar) {
        y9.a aVar2;
        aVar2 = zzfjd.zza;
        return new zzfjc(zzfjdVar, obj, aVar2, Collections.emptyList(), aVar);
    }

    public static final zzfjc zzd(final zzfip zzfipVar, zzgcu zzgcuVar, Object obj, zzfjd zzfjdVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfiu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfip.this.zza();
                return null;
            }
        }, zzgcuVar, obj, zzfjdVar);
    }
}
