package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.0r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04480r {
    public static byte[] A04;
    public boolean A00;
    public final AbstractC04490s A01;
    public final C1314Zs A02;
    public final C1102Rk A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, Field.PAGEREF, Field.FILLIN, 26, Field.DATA, Field.DATA, 30, 36, Field.QUOTE, -43, 33, 36, Field.NUMCHARS, Field.NUMCHARS, 26, 25};
    }

    public abstract void A06(Map<String, String> map);

    public AbstractC04480r(C1314Zs c1314Zs, AbstractC04490s abstractC04490s, C1102Rk c1102Rk) {
        this.A02 = c1314Zs;
        this.A01 = abstractC04490s;
        this.A03 = c1102Rk;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new O8().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        LC.A04(this.A02, A00(0, 17, 60));
        AbstractC04490s abstractC04490s = this.A01;
    }
}
