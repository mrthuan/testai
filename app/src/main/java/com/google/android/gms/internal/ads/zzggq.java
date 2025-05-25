package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzggq {
    private zzghb zza = null;
    private zzgvs zzb = null;
    private Integer zzc = null;

    private zzggq() {
    }

    public final zzggq zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggq zzb(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzggq zzc(zzghb zzghbVar) {
        this.zza = zzghbVar;
        return this;
    }

    public final zzggs zzd() {
        zzgvs zzgvsVar;
        zzgvr zzb;
        zzghb zzghbVar = this.zza;
        if (zzghbVar != null && (zzgvsVar = this.zzb) != null) {
            if (zzghbVar.zzb() == zzgvsVar.zza()) {
                if (zzghbVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzggz.zzc) {
                    zzb = zzgml.zza;
                } else if (this.zza.zzd() == zzggz.zzb) {
                    zzb = zzgml.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzggz.zza) {
                    zzb = zzgml.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzggs(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzggq(zzggp zzggpVar) {
    }
}
