package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgkq implements zzgdo {
    private static final byte[] zza = zzgvi.zza("7a806c");
    private static final byte[] zzb = zzgvi.zza("46bb91c3c5");
    private static final byte[] zzc = zzgvi.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzgvi.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzgvi.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final ThreadLocal zzf = new zzgkp();
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzgkq(byte[] bArr, byte[] bArr2) {
        this.zzh = bArr2;
        zzgvp.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
    }

    public static zzgdo zzb(zzggs zzggsVar) {
        return new zzgkq(zzggsVar.zzd().zzd(zzgdx.zza()), zzggsVar.zzc().zzc());
    }

    private static AlgorithmParameterSpec zzd(byte[] bArr, int i10, int i11) {
        return new GCMParameterSpec(128, bArr, 0, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), zzd(bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] zzf(byte[] bArr, byte[] bArr2) {
        Cipher cipher = (Cipher) zzf.get();
        if (cipher != null) {
            int length = bArr.length;
            if (length >= 28) {
                cipher.init(2, this.zzg, zzd(bArr, 0, 12));
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, 12, length - 12);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzh;
        if (bArr3.length == 0) {
            return zzf(bArr, bArr2);
        }
        if (zzgoa.zzc(bArr3, bArr)) {
            byte[] bArr4 = this.zzh;
            return zzf(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
