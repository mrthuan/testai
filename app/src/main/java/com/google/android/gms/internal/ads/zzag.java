package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzag {
    private final zzo zza;
    private final int zzb;
    private final int zzc;
    private float zzd = 1.0f;

    public zzag(zzo zzoVar, int i10, int i11) {
        this.zza = zzoVar;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final zzag zza(float f10) {
        this.zzd = f10;
        return this;
    }

    public final zzai zzb() {
        return new zzai(this.zza, this.zzb, this.zzc, this.zzd, 0L, null);
    }
}
