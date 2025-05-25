package com.google.android.gms.internal.ads;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzguo implements zzgdo {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzguo(byte[] bArr, zzgvr zzgvrVar) {
        if (zzgkr.zza(2)) {
            zzgvp.zza(bArr.length);
            this.zza = new SecretKeySpec(bArr, "AES");
            this.zzb = zzgvrVar.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzgdo zzb(zzggf zzggfVar) {
        zzggfVar.zzb();
        zzggfVar.zzb();
        return new zzguo(zzggfVar.zzd().zzd(zzgdx.zza()), zzggfVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        Integer valueOf;
        if (bArr != null) {
            byte[] bArr3 = this.zzb;
            int length = bArr.length;
            if (length >= bArr3.length + 28) {
                if (zzgoa.zzc(bArr3, bArr)) {
                    byte[] bArr4 = new byte[12];
                    System.arraycopy(bArr, this.zzb.length, bArr4, 0, 12);
                    int i10 = zzgka.zza;
                    if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                    }
                    if (valueOf != null) {
                        valueOf.intValue();
                    }
                    GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr4, 0, 12);
                    SecretKey secretKey = this.zza;
                    Cipher zza = zzgka.zza();
                    zza.init(2, secretKey, gCMParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        zza.updateAAD(bArr2);
                    }
                    int length2 = this.zzb.length;
                    return zza.doFinal(bArr, length2 + 12, (length - length2) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
