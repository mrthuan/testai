package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class U2 extends KY {
    public static byte[] A02;
    public static String[] A03 = {"mPUp", "QaVG6HdjpkfaxAZj0g", "f", "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ C0677Ab A00;
    public final /* synthetic */ C9O A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-43, 8, -7, -7, -8, 5, -4, 1, -6, -77, -4, 1, -9, -8, -7, -4, 1, -4, 7, -8, -1, 12};
    }

    static {
        A02();
    }

    public U2(C0677Ab c0677Ab, C9O c9o) {
        this.A00 = c0677Ab;
        this.A01 = c9o;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        T7 t72;
        T7 t73;
        Q4 q42;
        t72 = this.A00.A0I;
        if (t72.getState() == EnumC1099Rh.A02) {
            C0677Ab c0677Ab = this.A00;
            String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[3] = "r7zn";
            t73 = c0677Ab.A0I;
            if (t73.getCurrentPositionInMillis() == A00()) {
                q42 = this.A00.A0F;
                q42.AE0(A00(0, 22, 121));
            }
        }
    }
}
