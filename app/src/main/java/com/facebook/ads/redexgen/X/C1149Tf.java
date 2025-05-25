package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Tf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1149Tf extends KY {
    public static byte[] A02;
    public static String[] A03 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C06519a A00;
    public final /* synthetic */ C9O A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 14);
            if (A03[5].length() != 5) {
                throw new RuntimeException();
            }
            A03[2] = "VyWbJGKy3Ebs7lO";
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{42, 29, 14, 14, 13, 26, 1, 6, 15, Field.NOTEREF, 1, 6, 12, 13, 14, 1, 6, 1, Field.NUMCHARS, 13, 4, 17};
    }

    static {
        A02();
    }

    public C1149Tf(C06519a c06519a, C9O c9o) {
        this.A00 = c06519a;
        this.A01 = c9o;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        T7 t72;
        T7 t73;
        t72 = this.A00.A0J;
        if (t72.getState() == EnumC1099Rh.A02) {
            t73 = this.A00.A0J;
            if (t73.getCurrentPositionInMillis() == A00()) {
                this.A00.A0M(A00(0, 22, 102));
            }
        }
    }
}
