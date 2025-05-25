package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.As  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0694As extends Exception {
    public static byte[] A01;
    public static String[] A02 = {"9pRqtqi3B", "JLdBJvINcDpXAJRy2UXokirsyAm3AHdF", "frFBuXumqsQze9gDO0obsB6cGwssnn2k", "1OAjkxxII3AJpjsq4Owj5COwKU2yEoCn", "nSdrqNcbm", "RxwVmVtKL", "mcWlkz1DsHXHGDaAhVJHp1I", "BOAhRTYtJ"};
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {Field.ADDIN, 101, 116, 121, Byte.MAX_VALUE, Field.INCLUDETEXT, 98, 113, 115, 123, 48, 103, 98, 121, 100, 117, 48, 118, 113, 121, 124, 117, 116, 42, 48};
        String[] strArr = A02;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "fnY9AWebU";
        strArr2[5] = "pcBma8CYl";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C0694As(int i10) {
        super(A00(0, 25, 119) + i10);
        this.A00 = i10;
    }
}
