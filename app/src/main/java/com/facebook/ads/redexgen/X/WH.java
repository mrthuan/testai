package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class WH extends AbstractC04470q {
    public static byte[] A01;
    public final /* synthetic */ W7 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.SHAPE, 112, 101, 120, 103, 116, Field.EQ, 112, 117, 98, Field.EQ, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, Field.EQ, 101, 121, 116, 120, 99, Field.EQ, 126, 102, Byte.MAX_VALUE, Field.EQ, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, Field.BARCODE};
    }

    public WH(W7 w7) {
        this.A00 = w7;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0B(C1473cU c1473cU) {
        this.A00.A1V(c1473cU);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0C() {
        W6 w62;
        W6 w63;
        w62 = this.A00.A0G;
        if (w62 != null) {
            w63 = this.A00.A0G;
            w63.AB2();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0F(InterfaceC04460p interfaceC04460p) {
        C0798Fh c0798Fh;
        C0798Fh c0798Fh2;
        c0798Fh = this.A00.A0A;
        if (c0798Fh != null) {
            c0798Fh2 = this.A00.A0A;
            c0798Fh2.A0L();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0G(C0894Jg c0894Jg) {
        long j10;
        W6 w62;
        W6 w63;
        C0S A0E = this.A00.A11().A0E();
        j10 = this.A00.A00;
        A0E.A38(C0956Lu.A01(j10), c0894Jg.A03().getErrorCode(), c0894Jg.A04());
        w62 = this.A00.A0G;
        if (w62 != null) {
            w63 = this.A00.A0G;
            w63.ABs(c0894Jg);
        }
    }
}
