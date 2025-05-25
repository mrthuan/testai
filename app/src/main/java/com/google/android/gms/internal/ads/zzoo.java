package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzoo {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzoo zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzoo zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzoo zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzoq zzd() {
        if (!this.zza && (this.zzb || this.zzc)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new zzoq(this, null);
    }
}
