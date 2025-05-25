package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class ZD implements InterfaceC0860Hv {
    public static byte[] A04;
    public static String[] A05 = {"y11dLyPunqUC2SNmL", "uVADpA68M0Cfsn3", "aBlYZw3oCoScJFQ4w", "r0ynqY3CAk0tRf6oRkSRXMHPPhoSUYte", "5IdS6oQ5FkjdCe25TD", "axyuAqOl38qaB", "nwjC1v9mDHKhrzym", "tyB4AmDpHjXl7StHIAOspd43HtyDxVTF"};
    public ZA A00;
    public InterfaceC0860Hv A01;
    public final InterfaceC06559e A02;
    public final C1230Wj A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{20, 60, Field.MACROBUTTON, 59, 48, Field.IMPORT, Field.MACROBUTTON, 44, -25, Field.SYMBOL, 44, Field.AUTONUMLGL, 43, 44, Field.SYMBOL, 44, Field.SYMBOL, -25, Field.AUTONUMOUT, 44, 43, 48, Field.DATA, -25, 42, Field.MACROBUTTON, Field.AUTONUM, 42, Field.GOTOBUTTON, 58, -25, 44, Field.AUTONUMLGL, Field.DATA, 41, Field.MACROBUTTON, 44, 43, -11};
    }

    static {
        A02();
    }

    public ZD(InterfaceC06559e interfaceC06559e, InterfaceC0847Hi interfaceC0847Hi) {
        this.A02 = interfaceC06559e;
        this.A03 = new C1230Wj(interfaceC0847Hi);
    }

    private void A01() {
        this.A03.A02(this.A01.A88());
        A2 A85 = this.A01.A85();
        if (!A85.equals(this.A03.A85())) {
            this.A03.AGa(A85);
            this.A02.AD4(A85);
        }
    }

    private boolean A03() {
        if (this.A00 != null && !this.A00.A9Q()) {
            ZA za2 = this.A00;
            if (A05[3].charAt(15) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "9hoxEIkxVF2NPrHo";
            strArr[1] = "wbudfck4dY7yDqE";
            if (za2.A9b() || !this.A00.A8z()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j10) {
        this.A03.A02(j10);
    }

    public final void A08(ZA za2) {
        if (za2 == this.A00) {
            if (A05[3].charAt(15) != 'o') {
                throw new RuntimeException();
            }
            A05[4] = "7XXmXHxAZf2MfmaOXy";
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(ZA za2) throws C06589h {
        InterfaceC0860Hv A7l = za2.A7l();
        if (A7l != null) {
            InterfaceC0860Hv rendererMediaClock = this.A01;
            if (A7l != rendererMediaClock) {
                InterfaceC0860Hv rendererMediaClock2 = this.A01;
                if (rendererMediaClock2 == null) {
                    this.A01 = A7l;
                    this.A00 = za2;
                    InterfaceC0860Hv interfaceC0860Hv = this.A01;
                    InterfaceC0860Hv rendererMediaClock3 = this.A03;
                    interfaceC0860Hv.AGa(rendererMediaClock3.A85());
                    A01();
                    return;
                }
                throw C06589h.A02(new IllegalStateException(A00(0, 39, 85)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Hv
    public final A2 A85() {
        if (this.A01 != null) {
            return this.A01.A85();
        }
        return this.A03.A85();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Hv
    public final long A88() {
        if (A03()) {
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Hv
    public final A2 AGa(A2 a22) {
        if (this.A01 != null) {
            a22 = this.A01.AGa(a22);
        }
        this.A03.AGa(a22);
        this.A02.AD4(a22);
        return a22;
    }
}
