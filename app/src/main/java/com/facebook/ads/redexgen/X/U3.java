package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class U3 extends KY {
    public static byte[] A01;
    public final /* synthetic */ C0677Ab A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-56, -37, -42, -41, -31, -110, -23, -45, -27, -110, -32, -41, -24, -41, -28, -110, -30, -28, -41, -30, -45, -28, -41, -42};
    }

    public U3(C0677Ab c0677Ab) {
        this.A00 = c0677Ab;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean z10;
        Q4 q42;
        z10 = this.A00.A07;
        if (!z10) {
            q42 = this.A00.A0F;
            q42.AE0(A00(0, 24, 91));
        }
    }
}
