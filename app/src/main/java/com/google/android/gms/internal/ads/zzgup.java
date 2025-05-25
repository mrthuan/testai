package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgup {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 >= 0 && byteBuffer2.remaining() >= i10 && byteBuffer3.remaining() >= i10 && byteBuffer.remaining() >= i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] zzb(byte[]... bArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < bArr.length) {
                int length = bArr[i10].length;
                if (i11 <= Api.BaseClientBuilder.API_PRIORITY_OTHER - length) {
                    i11 += length;
                    i10++;
                } else {
                    throw new GeneralSecurityException("exceeded size limit");
                }
            } else {
                byte[] bArr2 = new byte[i11];
                int i12 = 0;
                for (byte[] bArr3 : bArr) {
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length2);
                    i12 += length2;
                }
                return bArr2;
            }
        }
    }

    public static final byte[] zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return zzd(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zzd(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr.length - i12 >= i10 && bArr2.length - i12 >= i11) {
            byte[] bArr3 = new byte[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
}
