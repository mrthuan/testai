package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeqm implements zzevo {
    private final zzgcu zza;
    private final zzdqg zzb;
    private final String zzc;
    private final zzffg zzd;

    public zzeqm(zzgcu zzgcuVar, zzdqg zzdqgVar, zzffg zzffgVar, String str) {
        this.zza = zzgcuVar;
        this.zzb = zzdqgVar;
        this.zzd = zzffgVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqm.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqn zzc() {
        zzffg zzffgVar = this.zzd;
        zzdqg zzdqgVar = this.zzb;
        return new zzeqn(zzdqgVar.zzb(zzffgVar.zzf, this.zzc), zzdqgVar.zza());
    }
}
