package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgur implements zzgdo {
    private final zzgvj zza;
    private final zzgem zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgur(zzgvj zzgvjVar, zzgem zzgemVar, int i10, byte[] bArr) {
        this.zza = zzgvjVar;
        this.zzb = zzgemVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzgdo zzb(zzgff zzgffVar) {
        zzguk zzgukVar = new zzguk(zzgffVar.zzd().zzd(zzgdx.zza()), zzgffVar.zzb().zzd());
        String valueOf = String.valueOf(zzgffVar.zzb().zzg());
        return new zzgur(zzgukVar, new zzgvo(new zzgvn("HMAC".concat(valueOf), new SecretKeySpec(zzgffVar.zze().zzd(zzgdx.zza()), "HMAC")), zzgffVar.zzb().zze()), zzgffVar.zzb().zze(), zzgffVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzd;
        int i10 = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 >= i10 + length) {
            if (zzgoa.zzc(bArr3, bArr)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                if (MessageDigest.isEqual(((zzgvo) this.zzb).zzc(zzgup.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
                    return this.zza.zza(copyOfRange);
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
