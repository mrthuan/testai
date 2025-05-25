package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevl implements zzevo {
    private final zzgcu zza;
    private final Context zzb;

    public zzevl(zzgcu zzgcuVar, Context context) {
        this.zza = zzgcuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevl.this.zzc();
            }
        });
    }

    public final zzevn zzc() {
        zzbbn zzbbnVar = zzbbw.zzfx;
        final Bundle a10 = com.google.android.gms.ads.internal.util.zzad.a(this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar));
        if (a10.isEmpty()) {
            return null;
        }
        return new zzevn() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", a10);
            }
        };
    }
}
