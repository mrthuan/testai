package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzesx implements zzevo {
    private final zzgcu zza;
    private final zzdvi zzb;

    public zzesx(zzgcu zzgcuVar, zzdvi zzdviVar) {
        this.zza = zzgcuVar;
        this.zzb = zzdviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesx.this.zzc();
            }
        });
    }

    public final zzesy zzc() {
        zzdvi zzdviVar = this.zzb;
        String zzc = zzdviVar.zzc();
        boolean zzr = zzdviVar.zzr();
        boolean g10 = com.google.android.gms.ads.internal.zzu.B.f10563m.g();
        zzdvi zzdviVar2 = this.zzb;
        return new zzesy(zzc, zzr, g10, zzdviVar2.zzp(), zzdviVar2.zzs());
    }
}
