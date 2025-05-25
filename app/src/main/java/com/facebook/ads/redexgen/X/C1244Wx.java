package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1244Wx extends H9 {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 34, Field.AUTONUMOUT, Field.IMPORT, Field.DATA, 41, Field.AUTONUMOUT, 34, 103, 36, Field.DATA, Field.QUOTE, 34, 125, 103};
    }

    public C1244Wx(int i10, Map<String, List<String>> map, H3 h32) {
        super(A00(0, 15, 77) + i10, h32, 1);
        this.A00 = i10;
        this.A01 = map;
    }
}
