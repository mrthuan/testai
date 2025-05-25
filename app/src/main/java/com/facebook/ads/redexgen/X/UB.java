package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UB extends KY {
    public static byte[] A02;
    public final /* synthetic */ PT A00;
    public final /* synthetic */ C9O A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public UB(PT pt, C9O c9o) {
        this.A00 = pt;
        this.A01 = c9o;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        T7 t72;
        T7 t73;
        t72 = this.A00.A0D;
        if (t72.getState() == EnumC1099Rh.A02) {
            t73 = this.A00.A0D;
            if (t73.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 47));
            }
        }
    }
}
