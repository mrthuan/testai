package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzgke {
    private final zzgkc zza;
    private final zzgkc zzb;

    public zzgke(byte[] bArr) {
        if (zzgkr.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract zzgkc zza(byte[] bArr, int i10);

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.zzb.zzc(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i12 = length & 15;
                if (i12 == 0) {
                    i10 = length;
                } else {
                    i10 = (length + 16) - i12;
                }
                int remaining = byteBuffer.remaining();
                int i13 = remaining % 16;
                if (i13 == 0) {
                    i11 = remaining;
                } else {
                    i11 = (remaining + 16) - i13;
                }
                int i14 = i11 + i10;
                ByteBuffer order = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i10);
                order.put(byteBuffer);
                order.position(i14);
                order.putLong(length);
                order.putLong(remaining);
                if (MessageDigest.isEqual(zzgki.zza(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.zza.zzd(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
