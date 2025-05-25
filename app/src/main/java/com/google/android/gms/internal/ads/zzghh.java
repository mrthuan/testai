package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghh extends zzgex {
    private final zzghg zza;

    private zzghh(zzghg zzghgVar) {
        this.zza = zzghgVar;
    }

    public static zzghh zzc(zzghg zzghgVar) {
        return new zzghh(zzghgVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghh) || ((zzghh) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzghh.class, this.zza);
    }

    public final String toString() {
        return a6.h.d("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zza != zzghg.zzc) {
            return true;
        }
        return false;
    }

    public final zzghg zzb() {
        return this.zza;
    }
}
