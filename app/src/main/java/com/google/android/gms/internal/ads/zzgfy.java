package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfy {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgfz zzd = zzgfz.zzc;

    private zzgfy() {
    }

    public final zzgfy zza(int i10) {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgfy zzb(int i10) {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgfy zzc(int i10) {
        this.zzc = 16;
        return this;
    }

    public final zzgfy zzd(zzgfz zzgfzVar) {
        this.zzd = zzgfzVar;
        return this;
    }

    public final zzggb zze() {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzd != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        int intValue2 = this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzggb(intValue, intValue2, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzgfy(zzgfx zzgfxVar) {
    }
}
