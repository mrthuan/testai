package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgoc {
    private zzgon zza = null;
    private zzgvs zzb = null;
    private Integer zzc = null;

    private zzgoc() {
    }

    public final zzgoc zza(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzgoc zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgoc zzc(zzgon zzgonVar) {
        this.zza = zzgonVar;
        return this;
    }

    public final zzgoe zzd() {
        zzgvs zzgvsVar;
        zzgvr zza;
        zzgon zzgonVar = this.zza;
        if (zzgonVar != null && (zzgvsVar = this.zzb) != null) {
            if (zzgonVar.zzc() == zzgvsVar.zza()) {
                if (zzgonVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzf() == zzgol.zzd) {
                    zza = zzgml.zza;
                } else if (this.zza.zzf() != zzgol.zzc && this.zza.zzf() != zzgol.zzb) {
                    if (this.zza.zzf() == zzgol.zza) {
                        zza = zzgml.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                } else {
                    zza = zzgml.zza(this.zzc.intValue());
                }
                return new zzgoe(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgoc(zzgob zzgobVar) {
    }
}
