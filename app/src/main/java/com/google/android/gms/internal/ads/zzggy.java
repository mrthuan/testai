package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzggy {
    private Integer zza = null;
    private zzggz zzb = zzggz.zzc;

    private zzggy() {
    }

    public final zzggy zza(int i10) {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzggy zzb(zzggz zzggzVar) {
        this.zzb = zzggzVar;
        return this;
    }

    public final zzghb zzc() {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzghb(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzggy(zzggx zzggxVar) {
    }
}
