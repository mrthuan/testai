package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzenu implements zzevo {
    private final zzgcu zza;
    private final zzffg zzb;

    public zzenu(zzgcu zzgcuVar, zzffg zzffgVar, zzffv zzffvVar) {
        this.zza = zzgcuVar;
        this.zzb = zzffgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenu.this.zzc();
            }
        });
    }

    public final zzenv zzc() {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgv)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzq.c(this.zzb.zzd))) {
            str = zzffv.zza();
        }
        return new zzenv(str);
    }
}
