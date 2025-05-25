package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzese implements zzevo {
    private final zzgcu zza;

    public zzese(zzgcu zzgcuVar) {
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                com.google.android.gms.ads.internal.util.zzay zzayVar = zzuVar.f10563m;
                synchronized (zzayVar.f10410a) {
                    str = zzayVar.c;
                }
                return new zzesf(str, zzuVar.f10563m.h());
            }
        });
    }
}
