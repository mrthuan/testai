package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.12  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass12 {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, 126)),
    A04(A00(16, 6, 26));
    
    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, -68, -55, -48, -68, -57, 61, Field.USERADDRESS, 61, Field.AUTONUMOUT, 58, Field.FILESIZE, Field.FILESIZE, -8, -20, -7, 0, -20, -9, Field.ADDRESSBLOCK, Field.GREETINGLINE, Field.ADDRESSBLOCK, Field.ADVANCE};
    }

    static {
        A01();
    }

    AnonymousClass12(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
