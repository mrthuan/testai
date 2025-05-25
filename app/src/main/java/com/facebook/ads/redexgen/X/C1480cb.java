package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.cb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1480cb extends AbstractC1101Rj {
    public static byte[] A01;
    public final /* synthetic */ GL A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.TOA, Field.GREETINGLINE};
    }

    public C1480cb(GL gl2) {
        this.A00 = gl2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1101Rj
    public final void A03() {
        C0957Lv c0957Lv;
        C0957Lv c0957Lv2;
        C0783Ei c0783Ei;
        C1464cL c1464cL;
        C0783Ei c0783Ei2;
        C0804Fn c0804Fn;
        C1102Rk c1102Rk;
        C0957Lv c0957Lv3;
        C0804Fn c0804Fn2;
        J7 j72;
        C0804Fn c0804Fn3;
        C0783Ei c0783Ei3;
        C0804Fn c0804Fn4;
        C0804Fn c0804Fn5;
        C1T A1Q;
        C0783Ei c0783Ei4;
        C1102Rk c1102Rk2;
        C0783Ei c0783Ei5;
        C0804Fn c0804Fn6;
        c0957Lv = this.A00.A07;
        if (!c0957Lv.A07()) {
            c0957Lv2 = this.A00.A07;
            c0957Lv2.A05();
            c0783Ei = this.A00.A04;
            InterfaceC1498ct A0E = c0783Ei.A0E();
            c1464cL = this.A00.A02;
            A0E.A46(c1464cL != null);
            c0783Ei2 = this.A00.A04;
            c0783Ei2.A0E().A36();
            c0804Fn = this.A00.A03;
            C2M.A02(c0804Fn.A0a(), AbstractC0940Le.A00(A00(0, 6, 63)));
            O8 o82 = new O8();
            c1102Rk = this.A00.A0C;
            O8 A03 = o82.A03(c1102Rk);
            c0957Lv3 = this.A00.A07;
            O8 A02 = A03.A02(c0957Lv3);
            c0804Fn2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c0804Fn2.A0b()).A05();
            j72 = this.A00.A05;
            c0804Fn3 = this.A00.A03;
            j72.AA6(c0804Fn3.A1U(), A05);
            c0783Ei3 = this.A00.A04;
            if (C0877Im.A14(c0783Ei3)) {
                c0783Ei5 = this.A00.A04;
                C0920Kh A00 = C0920Kh.A00(c0783Ei5);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c0804Fn6 = this.A00.A03;
                A00.A0E(adPlacementType, c0804Fn6.A1U());
            }
            c0804Fn4 = this.A00.A03;
            if (c0804Fn4 == null) {
                A1Q = null;
            } else {
                c0804Fn5 = this.A00.A03;
                A1Q = c0804Fn5.A1Q();
            }
            c0783Ei4 = this.A00.A04;
            C1T.A07(A1Q, c0783Ei4);
            c1102Rk2 = this.A00.A0C;
            c1102Rk2.A0V();
        }
    }
}
