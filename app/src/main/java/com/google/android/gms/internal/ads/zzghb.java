package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghb extends zzgex {
    private final int zza;
    private final zzggz zzb;

    public /* synthetic */ zzghb(int i10, zzggz zzggzVar, zzgha zzghaVar) {
        this.zza = i10;
        this.zzb = zzggzVar;
    }

    public static zzggy zzc() {
        return new zzggy(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghb)) {
            return false;
        }
        zzghb zzghbVar = (zzghb) obj;
        if (zzghbVar.zza != this.zza || zzghbVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzghb.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return a6.h.g(b.a.g("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zzb != zzggz.zzc) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggz zzd() {
        return this.zzb;
    }
}
