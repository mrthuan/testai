package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgvl implements zzgqi {
    private static final ThreadLocal zza = new zzgvk();
    private final SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public zzgvl(byte[] bArr) {
        zzgvp.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza2 = zzgpz.zza(zzb.doFinal(new byte[16]));
        this.zzc = zza2;
        this.zzd = zzgpz.zza(zza2);
    }

    private static Cipher zzb() {
        if (zzgkr.zza(1)) {
            return (Cipher) zza.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final byte[] zza(byte[] bArr, int i10) {
        byte[] zzc;
        if (i10 <= 16) {
            SecretKey secretKey = this.zzb;
            Cipher zzb = zzb();
            zzb.init(1, secretKey);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            int i11 = max - 1;
            int i12 = i11 * 16;
            if (max * 16 == length) {
                zzc = zzgup.zzd(bArr, i12, this.zzc, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i12, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    zzc = zzgup.zzc(copyOf, this.zzd);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i13 = 0; i13 < i11; i13++) {
                bArr2 = zzb.doFinal(zzgup.zzd(bArr2, 0, bArr, i13 * 16, 16));
            }
            return Arrays.copyOf(zzb.doFinal(zzgup.zzc(zzc, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
