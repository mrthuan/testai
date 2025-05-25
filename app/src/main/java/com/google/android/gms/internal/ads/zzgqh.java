package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgqh implements zzgem {
    private zzgqh(zzgem zzgemVar, zzgtz zzgtzVar, byte[] bArr) {
    }

    public static zzgem zza(zzglj zzgljVar) {
        byte[] zzc;
        zzgnl zza = zzgljVar.zza(zzgdx.zza());
        zzgst zza2 = zzgsv.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzgem zzgemVar = (zzgem) zzgeq.zzb((zzgsv) zza2.zzbr(), zzgem.class);
        zzgtz zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                } else {
                    zzc = zzgml.zza.zzc();
                }
            }
            zzc = zzgml.zza(zzgljVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgml.zzb(zzgljVar.zzb().intValue()).zzc();
        }
        return new zzgqh(zzgemVar, zzc2, zzc);
    }
}
