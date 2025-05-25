package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgok {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgol zzc = zzgol.zzd;

    private zzgok() {
    }

    public final zzgok zza(int i10) {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgok zzb(int i10) {
        if (i10 >= 10 && i10 <= 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(b.a.c("Invalid tag size for AesCmacParameters: ", i10));
    }

    public final zzgok zzc(zzgol zzgolVar) {
        this.zzc = zzgolVar;
        return this;
    }

    public final zzgon zzd() {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzgon(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public /* synthetic */ zzgok(zzgoj zzgojVar) {
    }
}
