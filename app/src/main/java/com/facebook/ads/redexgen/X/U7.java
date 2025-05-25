package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class U7 extends AbstractC1101Rj {
    public static byte[] A01;
    public final /* synthetic */ U6 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public U7(U6 u62) {
        this.A00 = u62;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1101Rj
    public final void A03() {
        int i10;
        boolean z10;
        boolean z11;
        if (!this.A00.A09.A07()) {
            this.A00.A09.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A1U())) {
                Map<String, String> A05 = new O8().A03(this.A00.A0C).A02(this.A00.A09).A04(this.A00.A05.A0b()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 96));
                i10 = this.A00.A01;
                A05.put(A00(0, 16, 42), append.append(i10).toString());
                this.A00.A07.AA6(this.A00.A05.A1U(), A05);
                C0920Kh.A00(this.A00.A06).A0E(this.A00.A0B.A83(), this.A00.A05.A1U());
                C1T.A07(this.A00.A05.A1Q(), this.A00.A06);
                this.A00.A06.A0E().A36();
                z10 = this.A00.A03;
                if (!z10) {
                    C2M.A02(this.A00.A05.A0a(), AbstractC0940Le.A00(this.A00.A05.A0c()));
                }
                z11 = this.A00.A04;
                if (!z11) {
                    this.A00.A0A.A4P(this.A00.A0B.A7Z());
                }
            }
        }
    }
}
