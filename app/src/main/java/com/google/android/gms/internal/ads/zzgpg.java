package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgpg extends zzgpj {
    private final int zza;
    private final int zzb;
    private final zzgpe zzc;
    private final zzgpd zzd;

    public /* synthetic */ zzgpg(int i10, int i11, zzgpe zzgpeVar, zzgpd zzgpdVar, zzgpf zzgpfVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgpeVar;
        this.zzd = zzgpdVar;
    }

    public static zzgpc zze() {
        return new zzgpc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpg)) {
            return false;
        }
        zzgpg zzgpgVar = (zzgpg) obj;
        if (zzgpgVar.zza != this.zza || zzgpgVar.zzd() != zzd() || zzgpgVar.zzc != this.zzc || zzgpgVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgpg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder f10 = android.support.v4.media.session.h.f("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        f10.append(this.zzb);
        f10.append("-byte tags, and ");
        return a6.h.g(f10, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zzc != zzgpe.zzd) {
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

    public final int zzd() {
        zzgpe zzgpeVar = this.zzc;
        if (zzgpeVar == zzgpe.zzd) {
            return this.zzb;
        }
        if (zzgpeVar == zzgpe.zza || zzgpeVar == zzgpe.zzb || zzgpeVar == zzgpe.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgpd zzf() {
        return this.zzd;
    }

    public final zzgpe zzg() {
        return this.zzc;
    }
}
