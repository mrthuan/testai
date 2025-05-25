package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazb {
    public static int zza(String str) {
        byte[] bytes;
        int i10;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = (length & (-4)) + 0;
            if (i12 >= i10) {
                break;
            }
            int i14 = ((bytes[i12] & 255) | ((bytes[i12 + 1] & 255) << 8) | ((bytes[i12 + 2] & 255) << 16) | (bytes[i12 + 3] << 24)) * (-862048943);
            int i15 = i13 ^ (((i14 >>> 17) | (i14 << 15)) * 461845907);
            i13 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
            i12 += 4;
        }
        int i16 = length & 3;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    i11 = (bytes[i10 + 2] & 255) << 16;
                }
                int i17 = i13 ^ length;
                int i18 = (i17 ^ (i17 >>> 16)) * (-2048144789);
                int i19 = (i18 ^ (i18 >>> 13)) * (-1028477387);
                return i19 ^ (i19 >>> 16);
            }
            i11 |= (bytes[i10 + 1] & 255) << 8;
        }
        int i20 = ((bytes[i10] & 255) | i11) * (-862048943);
        i13 ^= ((i20 >>> 17) | (i20 << 15)) * 461845907;
        int i172 = i13 ^ length;
        int i182 = (i172 ^ (i172 >>> 16)) * (-2048144789);
        int i192 = (i182 ^ (i182 >>> 13)) * (-1028477387);
        return i192 ^ (i192 >>> 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0101, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] zzb(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazb.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
