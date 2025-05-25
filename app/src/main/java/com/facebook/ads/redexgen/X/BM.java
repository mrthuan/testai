package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class BM extends R9 {
    public static byte[] A01;
    public final /* synthetic */ PT A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.AUTONUMLGL, Field.IMPORT, 42, Field.AUTONUMLGL, Field.ASK, Field.IMPORT, 42, 41};
    }

    public BM(PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A02 */
    public final void A03(C1098Rg c1098Rg) {
        PS ps;
        JSONObject A03;
        this.A00.A03 = true;
        ps = this.A00.A0B;
        A03 = this.A00.A03();
        ps.AE1(A00(0, 8, 73), A03);
    }
}
