package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfd {
    private zzgfp zza = null;
    private zzgvs zzb = null;
    private zzgvs zzc = null;
    private Integer zzd = null;

    private zzgfd() {
    }

    public final zzgfd zza(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzgfd zzb(zzgvs zzgvsVar) {
        this.zzc = zzgvsVar;
        return this;
    }

    public final zzgfd zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgfd zzd(zzgfp zzgfpVar) {
        this.zza = zzgfpVar;
        return this;
    }

    public final zzgff zze() {
        zzgvr zzb;
        zzgfp zzgfpVar = this.zza;
        if (zzgfpVar != null) {
            zzgvs zzgvsVar = this.zzb;
            if (zzgvsVar != null && this.zzc != null) {
                if (zzgfpVar.zzb() == zzgvsVar.zza()) {
                    if (zzgfpVar.zzc() == this.zzc.zza()) {
                        if (this.zza.zza() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zza() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzh() == zzgfn.zzc) {
                            zzb = zzgml.zza;
                        } else if (this.zza.zzh() == zzgfn.zzb) {
                            zzb = zzgml.zza(this.zzd.intValue());
                        } else if (this.zza.zzh() == zzgfn.zza) {
                            zzb = zzgml.zzb(this.zzd.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                        }
                        return new zzgff(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    public /* synthetic */ zzgfd(zzgfc zzgfcVar) {
    }
}
