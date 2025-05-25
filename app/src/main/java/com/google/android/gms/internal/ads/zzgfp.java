package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfp extends zzgex {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgfn zze;
    private final zzgfm zzf;

    public /* synthetic */ zzgfp(int i10, int i11, int i12, int i13, zzgfn zzgfnVar, zzgfm zzgfmVar, zzgfo zzgfoVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzgfnVar;
        this.zzf = zzgfmVar;
    }

    public static zzgfl zzf() {
        return new zzgfl(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfp)) {
            return false;
        }
        zzgfp zzgfpVar = (zzgfp) obj;
        if (zzgfpVar.zza != this.zza || zzgfpVar.zzb != this.zzb || zzgfpVar.zzc != this.zzc || zzgfpVar.zzd != this.zzd || zzgfpVar.zze != this.zze || zzgfpVar.zzf != this.zzf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgfp.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder f10 = android.support.v4.media.session.h.f("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        f10.append(this.zzc);
        f10.append("-byte IV, and ");
        f10.append(this.zzd);
        f10.append("-byte tags, and ");
        f10.append(this.zza);
        f10.append("-byte AES key, and ");
        return a6.h.g(f10, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zze != zzgfn.zzc) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgfm zzg() {
        return this.zzf;
    }

    public final zzgfn zzh() {
        return this.zze;
    }
}
