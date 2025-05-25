package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Bo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0714Bo extends AbstractC1121Sd {
    public static byte[] A01;
    public final /* synthetic */ V7 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.ASK, Field.SYMBOL, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.BARCODE, 25, Field.USERADDRESS, 36, Field.AUTONUMLGL, 34, Field.QUOTE, 36, Field.SYMBOL, 36, Field.EQ, 60, 21, Field.ASK, Field.AUTONUMLGL, Field.USERADDRESS, 36};
    }

    public C0714Bo(V7 v72) {
        this.A00 = v72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A02 */
    public final void A03(C9P c9p) {
        MR mr;
        mr = this.A00.A06;
        mr.A4Q(A00(0, 21, 40), c9p);
    }
}
