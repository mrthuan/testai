package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgkh implements zzgdo {
    private final zzgdo zza;
    private final byte[] zzb;

    private zzgkh(zzgdo zzgdoVar, byte[] bArr) {
        this.zza = zzgdoVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgdo zzb(zzglj zzgljVar) {
        byte[] zzc;
        zzgnl zza = zzgljVar.zza(zzgdx.zza());
        zzgst zza2 = zzgsv.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzgdo zzgdoVar = (zzgdo) zzgeq.zzb((zzgsv) zza2.zzbr(), zzgdo.class);
        zzgtz zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc2)));
                    }
                } else {
                    zzc = zzgml.zza.zzc();
                }
            }
            zzc = zzgml.zza(zzgljVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgml.zzb(zzgljVar.zzb().intValue()).zzc();
        }
        return new zzgkh(zzgdoVar, zzc);
    }

    public static zzgdo zzc(zzgdo zzgdoVar, zzgvr zzgvrVar) {
        return new zzgkh(zzgdoVar, zzgvrVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgoa.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
