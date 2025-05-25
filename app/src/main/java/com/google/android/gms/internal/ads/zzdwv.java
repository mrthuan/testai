package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdwv implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzdwv(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzauo zzauoVar = (zzauo) this.zza.zzb();
        final Context zza = ((zzcgp) this.zzb).zza();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        y9.a zzb = zzgcuVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdws
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzauo.this.zzc().zzg(zza);
            }
        });
        zzhfk.zzb(zzb);
        return zzb;
    }
}
