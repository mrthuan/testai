package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class HG extends AbstractC1494cp<C0Q> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public HG(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1494cp
    /* renamed from: A05 */
    public final C0Y A04(C0Q c0q) {
        return new C0Y(this, c0q == null ? A00(0, 4, 46) : A00(0, 0, 18) + c0q.A03());
    }
}
