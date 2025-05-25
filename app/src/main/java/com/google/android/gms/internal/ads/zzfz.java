package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfz implements zzfr {
    private final Context zza;
    private final zzfr zzb;

    public zzfz(Context context) {
        zzgb zzgbVar = new zzgb();
        this.zza = context.getApplicationContext();
        this.zzb = zzgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final /* bridge */ /* synthetic */ zzfs zza() {
        return new zzga(this.zza, ((zzgb) this.zzb).zza());
    }
}
