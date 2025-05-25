package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghp extends zzgew {
    private final zzghr zza;
    private final zzgvr zzb;
    private final Integer zzc;

    private zzghp(zzghr zzghrVar, zzgvr zzgvrVar, Integer num) {
        this.zza = zzghrVar;
        this.zzb = zzgvrVar;
        this.zzc = num;
    }

    public static zzghp zza(zzghr zzghrVar, Integer num) {
        zzgvr zzb;
        if (zzghrVar.zzb() == zzghq.zza) {
            if (num != null) {
                zzb = zzgvr.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzghrVar.zzb() == zzghq.zzb) {
            if (num == null) {
                zzb = zzgvr.zzb(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzghrVar.zzb().toString()));
        }
        return new zzghp(zzghrVar, zzb, num);
    }

    public final zzghr zzb() {
        return this.zza;
    }

    public final zzgvr zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
