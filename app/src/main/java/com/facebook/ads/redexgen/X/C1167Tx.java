package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1167Tx extends KY {
    public static byte[] A01;
    public final /* synthetic */ A6 A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -1, -6, -5, 5, -74, 13, -9, 9, -74, 4, -5, 12, -5, 8, -74, 6, 8, -5, 6, -9, 8, -5, -6};
    }

    public C1167Tx(A6 a62) {
        this.A00 = a62;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean z10;
        Q4 q42;
        z10 = this.A00.A0S;
        if (!z10) {
            q42 = this.A00.A0X;
            q42.AE0(A00(0, 24, 28));
        }
    }
}
