package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class BA extends AbstractC1127Sj {
    public static byte[] A01;
    public final /* synthetic */ PT A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 103, 101, 120, 100, 109, 124, 109, 108};
    }

    public BA(PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A02 */
    public final void A03(C9R c9r) {
        PS ps;
        T7 t72;
        JSONObject A04;
        this.A00.A07();
        ps = this.A00.A0B;
        PT pt = this.A00;
        t72 = this.A00.A0D;
        A04 = pt.A04(t72.getDuration());
        ps.AE1(A00(0, 9, 87), A04);
    }
}
