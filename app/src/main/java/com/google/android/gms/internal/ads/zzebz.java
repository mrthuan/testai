package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzebz {
    private final zzebv zza;
    private final zzgcu zzb;

    public zzebz(zzebv zzebvVar, zzgcu zzgcuVar) {
        this.zza = zzebvVar;
        this.zzb = zzgcuVar;
    }

    public final void zza(zzfio zzfioVar) {
        final zzebv zzebvVar = this.zza;
        Objects.requireNonNull(zzebvVar);
        zzgcj.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzebv.this.getWritableDatabase();
            }
        }), new zzeby(this, zzfioVar), this.zzb);
    }
}
