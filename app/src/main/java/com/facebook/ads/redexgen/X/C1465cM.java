package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1465cM extends KY {
    public static byte[] A01;
    public final /* synthetic */ C1464cL A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C1465cM(C1464cL c1464cL) {
        this.A00 = c1464cL;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1314Zs c1314Zs;
        AbstractC1012Ny abstractC1012Ny;
        C1466cN c1466cN;
        c1314Zs = this.A00.A03;
        c1314Zs.A0E().AHX();
        abstractC1012Ny = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c1466cN = this.A00.A00;
        abstractC1012Ny.loadUrl(append.append(c1466cN.A03()).toString());
    }
}
