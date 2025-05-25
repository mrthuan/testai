package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzexv implements zzevo {
    final zzgcu zza;

    public zzexv(zzbak zzbakVar, zzgcu zzgcuVar, Context context) {
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzexu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzexw(new JSONObject());
            }
        });
    }
}
