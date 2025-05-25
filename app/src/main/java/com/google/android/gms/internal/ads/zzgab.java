package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgab {
    static {
        new zzfzz();
    }

    public static InputStream zza(InputStream inputStream, long j10) {
        return new zzgaa(inputStream, j10);
    }

    public static byte[] zzb(InputStream inputStream) {
        int i10;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i11 = 0;
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = inputStream.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return zzc(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            if (min < 4096) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            min = zzgap.zze(min * i10);
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i10) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        int i11 = i10 - length;
        while (i11 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i11, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - i11, min);
            i11 -= min;
        }
        return copyOf;
    }
}
