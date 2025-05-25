package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.an  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1370an implements AnonymousClass48 {
    public static byte[] A01;
    public final /* synthetic */ FL A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C1370an(FL fl2) {
        this.A00 = fl2;
    }

    private final void A02(AnonymousClass49 anonymousClass49) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass48
    public final void ABl(AnonymousClass49 anonymousClass49) {
        A02(anonymousClass49);
        throw null;
    }
}
