package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgiw extends zzgex {
    private final zzgiv zza;

    private zzgiw(zzgiv zzgivVar) {
        this.zza = zzgivVar;
    }

    public static zzgiw zzc(zzgiv zzgivVar) {
        return new zzgiw(zzgivVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgiw) || ((zzgiw) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgiw.class, this.zza);
    }

    public final String toString() {
        return a6.h.d("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zza != zzgiv.zzc) {
            return true;
        }
        return false;
    }

    public final zzgiv zzb() {
        return this.zza;
    }
}
