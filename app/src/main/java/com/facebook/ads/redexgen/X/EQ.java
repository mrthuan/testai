package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class EQ {
    public static byte[] A05;
    public final InterfaceC0835Gw A00;
    public final InterfaceC0837Gy A01;
    public final InterfaceC0837Gy A02;
    public final HP A03;
    public final I8 A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{16, 31, 18, 14, 33, 18, -15, 14, 33, 14, 0, 22, Field.NUMWORDS, 24};
    }

    public EQ(HP hp2, InterfaceC0837Gy interfaceC0837Gy) {
        this(hp2, interfaceC0837Gy, null, null, null);
    }

    public EQ(HP hp2, InterfaceC0837Gy interfaceC0837Gy, InterfaceC0837Gy interfaceC0837Gy2, InterfaceC0835Gw interfaceC0835Gw, I8 i82) {
        AbstractC0844Hf.A01(interfaceC0837Gy);
        this.A03 = hp2;
        this.A02 = interfaceC0837Gy;
        this.A01 = interfaceC0837Gy2;
        this.A00 = interfaceC0835Gw;
        this.A04 = i82;
    }

    public final HP A02() {
        return this.A03;
    }

    public final C1236Wp A03(boolean z10) {
        InterfaceC0838Gz x12;
        if (this.A01 != null) {
            x12 = this.A01.A4t();
        } else {
            x12 = new X1();
        }
        if (z10) {
            return new C1236Wp(this.A03, X2.A02, x12, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 113));
        }
        C1237Wq c1237Wq = new C1237Wq(this.A03, 2097152L);
        InterfaceC0838Gz A4t = this.A02.A4t();
        if (this.A04 != null) {
            A4t = new C1241Wu(A4t, this.A04, -1000);
        }
        InterfaceC0838Gz upstream = x12;
        return new C1236Wp(this.A03, A4t, upstream, c1237Wq, 1, null);
    }

    public final I8 A04() {
        return this.A04 != null ? this.A04 : new I8();
    }
}
