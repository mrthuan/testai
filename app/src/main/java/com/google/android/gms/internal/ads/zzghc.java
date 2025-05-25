package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghc extends zzgew {
    private final zzghh zza;
    private final zzgvs zzb;
    private final zzgvr zzc;
    private final Integer zzd;

    private zzghc(zzghh zzghhVar, zzgvs zzgvsVar, zzgvr zzgvrVar, Integer num) {
        this.zza = zzghhVar;
        this.zzb = zzgvsVar;
        this.zzc = zzgvrVar;
        this.zzd = num;
    }

    public static zzghc zza(zzghg zzghgVar, zzgvs zzgvsVar, Integer num) {
        zzgvr zzb;
        zzghg zzghgVar2 = zzghg.zzc;
        if (zzghgVar != zzghgVar2 && num == null) {
            throw new GeneralSecurityException(a6.h.d("For given Variant ", zzghgVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzghgVar == zzghgVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvsVar.zza() == 32) {
            zzghh zzc = zzghh.zzc(zzghgVar);
            if (zzc.zzb() == zzghgVar2) {
                zzb = zzgml.zza;
            } else if (zzc.zzb() == zzghg.zzb) {
                zzb = zzgml.zza(num.intValue());
            } else if (zzc.zzb() == zzghg.zza) {
                zzb = zzgml.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            return new zzghc(zzc, zzgvsVar, zzb, num);
        }
        throw new GeneralSecurityException(b.a.c("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgvsVar.zza()));
    }

    public final zzghh zzb() {
        return this.zza;
    }

    public final zzgvr zzc() {
        return this.zzc;
    }

    public final zzgvs zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}
