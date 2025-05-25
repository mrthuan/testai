package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzesm implements zzevo {
    private final zzgcu zza;
    private final zzffg zzb;

    public zzesm(zzgcu zzgcuVar, zzffg zzffgVar) {
        this.zza = zzgcuVar;
        this.zzb = zzffgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesm.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzesn zzc() {
        return new zzesn("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzq.c(this.zzb.zzd)));
    }
}
