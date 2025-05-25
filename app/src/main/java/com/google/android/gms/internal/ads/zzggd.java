package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzggd {
    private zzggo zza = null;
    private zzgvs zzb = null;
    private Integer zzc = null;

    private zzggd() {
    }

    public final zzggd zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggd zzb(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzggd zzc(zzggo zzggoVar) {
        this.zza = zzggoVar;
        return this;
    }

    public final zzggf zzd() {
        zzgvs zzgvsVar;
        zzgvr zzb;
        zzggo zzggoVar = this.zza;
        if (zzggoVar != null && (zzgvsVar = this.zzb) != null) {
            if (zzggoVar.zzb() == zzgvsVar.zza()) {
                if (zzggoVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzggm.zzc) {
                    zzb = zzgml.zza;
                } else if (this.zza.zzd() == zzggm.zzb) {
                    zzb = zzgml.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzggm.zza) {
                    zzb = zzgml.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzggf(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzggd(zzggc zzggcVar) {
    }
}
