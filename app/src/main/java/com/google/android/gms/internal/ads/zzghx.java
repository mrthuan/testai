package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghx extends zzgew {
    private final zzgid zza;
    private final zzgvr zzb;
    private final Integer zzc;

    private zzghx(zzgid zzgidVar, zzgvr zzgvrVar, Integer num) {
        this.zza = zzgidVar;
        this.zzb = zzgvrVar;
        this.zzc = num;
    }

    public static zzghx zza(zzgid zzgidVar, Integer num) {
        zzgvr zzb;
        if (zzgidVar.zzc() == zzgib.zzb) {
            if (num == null) {
                zzb = zzgml.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzgidVar.zzc() == zzgib.zza) {
            if (num != null) {
                zzb = zzgml.zzb(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgidVar.zzc())));
        }
        return new zzghx(zzgidVar, zzb, num);
    }

    public final zzgid zzb() {
        return this.zza;
    }

    public final zzgvr zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
