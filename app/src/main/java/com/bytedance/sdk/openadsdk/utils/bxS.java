package com.bytedance.sdk.openadsdk.utils;

import java.security.SecureRandom;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: PangleUUID.java */
/* loaded from: classes.dex */
public class bxS {
    private static final ThreadLocal<SecureRandom> Qhi = new ThreadLocal<>();

    public static String Qhi() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = Qhi;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & Field.BARCODE);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 = (j11 << 8) | (bArr[i10] & 255);
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return new UUID(j11, j10).toString();
    }
}
