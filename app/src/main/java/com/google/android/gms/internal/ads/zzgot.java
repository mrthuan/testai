package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgot {
    private zzgpg zza = null;
    private zzgvs zzb = null;
    private Integer zzc = null;

    private zzgot() {
    }

    public final zzgot zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgot zzb(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzgot zzc(zzgpg zzgpgVar) {
        this.zza = zzgpgVar;
        return this;
    }

    public final zzgov zzd() {
        zzgvs zzgvsVar;
        zzgvr zza;
        zzgpg zzgpgVar = this.zza;
        if (zzgpgVar != null && (zzgvsVar = this.zzb) != null) {
            if (zzgpgVar.zzc() == zzgvsVar.zza()) {
                if (zzgpgVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzg() == zzgpe.zzd) {
                    zza = zzgml.zza;
                } else if (this.zza.zzg() != zzgpe.zzc && this.zza.zzg() != zzgpe.zzb) {
                    if (this.zza.zzg() == zzgpe.zza) {
                        zza = zzgml.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
                    }
                } else {
                    zza = zzgml.zza(this.zzc.intValue());
                }
                return new zzgov(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgot(zzgos zzgosVar) {
    }
}
