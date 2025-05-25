package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzesi implements zzevo {
    private final Context zza;
    private final zzgcu zzb;

    public zzesi(zzgcu zzgcuVar, Context context) {
        this.zzb = zzgcuVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesi.this.zzc();
            }
        });
    }

    public final zzesj zzc() {
        Integer num;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            num = Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        } else {
            num = null;
        }
        return new zzesj(num);
    }
}
