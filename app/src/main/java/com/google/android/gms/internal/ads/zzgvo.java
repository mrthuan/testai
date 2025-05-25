package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgvo implements zzgem {
    private static final byte[] zza = {0};
    private final zzgqi zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgvo(zzgoe zzgoeVar) {
        this.zzb = new zzgvl(zzgoeVar.zzd().zzd(zzgdx.zza()));
        this.zzc = zzgoeVar.zzb().zzb();
        this.zzd = zzgoeVar.zzc().zzc();
        if (zzgoeVar.zzb().zzf().equals(zzgol.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgem zza(zzgoe zzgoeVar) {
        return new zzgvo(zzgoeVar);
    }

    public static zzgem zzb(zzgov zzgovVar) {
        return new zzgvo(zzgovVar);
    }

    public final byte[] zzc(byte[] bArr) {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzgup.zzb(this.zzd, this.zzb.zza(zzgup.zzb(bArr, bArr2), this.zzc));
        }
        return zzgup.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgvo(zzgov zzgovVar) {
        String valueOf = String.valueOf(zzgovVar.zzb().zzf());
        this.zzb = new zzgvn("HMAC".concat(valueOf), new SecretKeySpec(zzgovVar.zzd().zzd(zzgdx.zza()), "HMAC"));
        this.zzc = zzgovVar.zzb().zzb();
        this.zzd = zzgovVar.zzc().zzc();
        if (zzgovVar.zzb().zzg().equals(zzgpe.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgvo(zzgqi zzgqiVar, int i10) {
        this.zzb = zzgqiVar;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgqiVar.zza(new byte[0], i10);
    }
}
