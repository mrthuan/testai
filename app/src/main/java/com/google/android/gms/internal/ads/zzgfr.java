package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfr {
    private zzggb zza = null;
    private zzgvs zzb = null;
    private Integer zzc = null;

    private zzgfr() {
    }

    public final zzgfr zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfr zzb(zzgvs zzgvsVar) {
        this.zzb = zzgvsVar;
        return this;
    }

    public final zzgfr zzc(zzggb zzggbVar) {
        this.zza = zzggbVar;
        return this;
    }

    public final zzgft zzd() {
        zzgvs zzgvsVar;
        zzgvr zzb;
        zzggb zzggbVar = this.zza;
        if (zzggbVar != null && (zzgvsVar = this.zzb) != null) {
            if (zzggbVar.zzc() == zzgvsVar.zza()) {
                if (zzggbVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zze() == zzgfz.zzc) {
                    zzb = zzgml.zza;
                } else if (this.zza.zze() == zzgfz.zzb) {
                    zzb = zzgml.zza(this.zzc.intValue());
                } else if (this.zza.zze() == zzgfz.zza) {
                    zzb = zzgml.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                }
                return new zzgft(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgfr(zzgfq zzgfqVar) {
    }
}
