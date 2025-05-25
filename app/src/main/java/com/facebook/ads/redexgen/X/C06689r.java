package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.9r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06689r {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"gkHagg9sB8IUWYb6q3ocrT0TxYi", "NE", "N4zCa1GX5E9Yds1VMUAQrLvLq", "D9fgVqZwbnP", "LHpQuNx1GJF6WPrWOoNErW9GY702stdw", "3mmz6UaJaVm", "sG6vVHTX86CLemYFR6gPDfec7Yfwaj3D", "wWX707RKIRhLC7xjkiZFtTlentMuS3W"};
    public static final HashSet<String> A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {14, 6, 6, 14, Field.FORMCHECKBOX, 12, 17, 6, Field.FORMCHECKBOX, 10, 6, Field.NUMWORDS, 12};
        String[] strArr = A02;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "Xe2ipOaSu2pdxha9i6ixeBp4cevx6W9z";
        strArr2[6] = "Zf8B64fxNGGr2bfcs4J5hE6jajhXIkez";
        A01 = bArr;
    }

    static {
        A02();
        A03 = new HashSet<>();
        A00 = A01(0, 13, 33);
    }

    public static synchronized String A00() {
        String str;
        synchronized (C06689r.class) {
            str = A00;
        }
        return str;
    }
}
