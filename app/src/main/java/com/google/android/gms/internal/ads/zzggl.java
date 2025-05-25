package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzggl {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzggm zzd = zzggm.zzc;

    private zzggl() {
    }

    public final zzggl zza(int i10) {
        this.zzb = 12;
        return this;
    }

    public final zzggl zzb(int i10) {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzggl zzc(int i10) {
        this.zzc = 16;
        return this;
    }

    public final zzggl zzd(zzggm zzggmVar) {
        this.zzd = zzggmVar;
        return this;
    }

    public final zzggo zze() {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzggo(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzggl(zzggk zzggkVar) {
    }
}
