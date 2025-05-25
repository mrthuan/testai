package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.1r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04741r {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, Field.ADDIN, Field.NOTEREF, Field.TOA};
    }

    public static void A02(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD, boolean z10, InterfaceC04721p interfaceC04721p) {
        if (!C0877Im.A23(c1314Zs)) {
            C05906f c05906f = new C05906f(c1314Zs);
            C04581b A06 = abstractC1456cD.A1P().A0E().A06();
            c05906f.A0d(new JF(abstractC1456cD.A1U(), c1314Zs.A09()));
            if (A06 == null) {
                interfaceC04721p.AD2(AdError.CACHE_ERROR);
                return;
            } else if (A06.A0N()) {
                interfaceC04721p.AD3();
                return;
            } else {
                C05866b c05866b = new C05866b(A06.A0F(), abstractC1456cD.A0l(), abstractC1456cD.A0c());
                c05866b.A04 = true;
                if (C0877Im.A1s(c1314Zs)) {
                    c05866b.A03 = A00(0, 5, 86);
                }
                switch (C04711o.A00[A06.A0A().ordinal()]) {
                    case 1:
                    case 2:
                        c05906f.A0X(c05866b);
                        break;
                }
                c05906f.A0b(new C05886d(abstractC1456cD.A1S().A01(), -1, -1, abstractC1456cD.A0l(), abstractC1456cD.A0c()));
                c05906f.A0b(new C05886d(A06.A0E(), -1, -1, abstractC1456cD.A0l(), abstractC1456cD.A0c()));
                c05906f.A0W(new C1443c0(c1314Zs, interfaceC04721p, c05906f, A06, z10), new C6Y(abstractC1456cD.A0l(), abstractC1456cD.A0c()));
                return;
            }
        }
        interfaceC04721p.AD3();
    }
}
