package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzggb extends zzgex {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgfz zzd;

    public /* synthetic */ zzggb(int i10, int i11, int i12, zzgfz zzgfzVar, zzgga zzggaVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzgfzVar;
    }

    public static zzgfy zzd() {
        return new zzgfy(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggb)) {
            return false;
        }
        zzggb zzggbVar = (zzggb) obj;
        if (zzggbVar.zza != this.zza || zzggbVar.zzb != this.zzb || zzggbVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzggb.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder g10 = b.a.g("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        g10.append(this.zzb);
        g10.append("-byte IV, 16-byte tag, and ");
        return a6.h.g(g10, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zzd != zzgfz.zzc) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgfz zze() {
        return this.zzd;
    }
}
