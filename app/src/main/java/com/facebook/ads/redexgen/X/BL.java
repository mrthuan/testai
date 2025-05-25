package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class BL extends AbstractC1105Rn {
    public static byte[] A01;
    public final /* synthetic */ PT A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{112, 108, 97, 121};
    }

    public BL(PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A02 */
    public final void A03(SZ sz) {
        PS ps;
        JSONObject A03;
        this.A00.A04 = true;
        ps = this.A00.A0B;
        A03 = this.A00.A03();
        ps.AE1(A00(0, 4, 106), A03);
    }
}
