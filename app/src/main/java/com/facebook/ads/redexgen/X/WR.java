package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class WR extends KY {
    public static byte[] A07;
    public final /* synthetic */ long A00;
    public final /* synthetic */ WQ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{21, 33, 31, -32, 24, 19, 21, 23, 20, 33, 33, 29, -32, 29, 19, Field.ASK, 19, 32, 19, -32, 34, 36, 33, Field.DATA, Field.NUMWORDS, 22, 23, 36, -32, -5, 32, Field.PAGEREF, Field.ASK, 19, 30, 30, 4, 23, 24, 23, 36, 36, 23, 36, 2, 36, 33, Field.DATA, Field.NUMWORDS, 22, 23, 36, -74, -62, -64, -127, -68, -63, -58, -57, -76, -70, -59, -76, -64, -127, -74, -62, -63, -57, -72, -63, -57, -61, -59, -62, -55, -68, -73, -72, -59, -127, -100, -63, -58, -57, -76, -65, -65, -91, -72, -71, -72, -59, -59, -72, -59, -93, -59, -62, -55, -68, -73, -72, -59};
    }

    public WR(WQ wq, boolean z10, String str, String str2, String str3, long j10, boolean z11) {
        this.A01 = wq;
        this.A06 = z10;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = j10;
        this.A05 = z11;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean fb4aResult;
        fb4aResult = this.A01.A03(A00(0, 52, 96), this.A06, this.A02, this.A04, this.A03, this.A00);
        if (fb4aResult) {
            return;
        }
        boolean fb4aResult2 = this.A05;
        if (fb4aResult2) {
            this.A01.A03(A00(52, 53, 1), this.A06, this.A02, this.A04, this.A03, this.A00);
        }
    }
}
