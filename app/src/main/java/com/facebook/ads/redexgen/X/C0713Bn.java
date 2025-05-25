package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Bn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0713Bn extends AbstractC1127Sj {
    public static byte[] A01;
    public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};
    public final /* synthetic */ V7 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A02[2].charAt(8) != '5') {
                throw new RuntimeException();
            }
            A02[5] = "7KI0j9KfVtSFY3dF";
            copyOfRange[i13] = (byte) (i14 ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, Field.NUMCHARS, 17, 16, 26, 60, Field.NUMWORDS, 1, 16, 7, 6, 1, Field.NUMCHARS, 1, 20, 25, 48, 3, 16, Field.NUMWORDS, 1};
    }

    static {
        A01();
    }

    public C0713Bn(V7 v72) {
        this.A00 = v72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A02 */
    public final void A03(C9R c9r) {
        MR mr;
        mr = this.A00.A06;
        mr.A4Q(A00(0, 21, 51), c9r);
    }
}
