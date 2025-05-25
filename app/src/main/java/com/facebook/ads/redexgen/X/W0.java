package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class W0 extends KY {
    public static byte[] A01;
    public final /* synthetic */ K9 A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-81, -78, -90, -92, -81, -94, -73, -85, -75, -78, -73, -73, -81, -88};
    }

    public W0(K9 k92) {
        this.A00 = k92;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1314Zs c1314Zs;
        c1314Zs = this.A00.A04;
        c1314Zs.A07().A9A(A00(0, 14, 26));
    }
}
