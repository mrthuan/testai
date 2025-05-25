package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevu implements zzevo {
    private final Context zza;
    private final zzgcu zzb;

    public zzevu(Context context, zzgcu zzgcuVar) {
        this.zza = context;
        this.zzb = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        if (((Boolean) zzbdk.zzb.zze()).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzevu.this.zzc();
                }
            });
        }
        return zzgcj.zzh(null);
    }

    public final /* synthetic */ zzevv zzc() {
        Context context = this.zza;
        return new zzevv(zzbbg.zzb(context), zzbbg.zza(context));
    }
}
