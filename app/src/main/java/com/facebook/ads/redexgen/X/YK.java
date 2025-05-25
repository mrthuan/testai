package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class YK implements InterfaceC0723Bx {
    public static byte[] A03;
    public static String[] A04 = {"U7C58G8YSmV9vlVhCcgTL8gvWtK2nUh7", "rchD6g8gaCdJrKaT6cY", "XSKvYVg8u7cslMcARjuzdYWWNQWy1OI3", "RniILupZEOVdpheiJaCIVa", "W6VJBDMDl8t52bAYcLBFhi9ZJeZzY86g", "3lPq75HsPjCWcJf7cN2seevogiCFywP7", "CoUyLte", "KsfhoqpqLoVK0Wmt0M"};
    public static final C0 A05;
    public InterfaceC0725Bz A00;
    public AbstractC0745Ct A01;
    public boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{11, 44, 36, 33, Field.DATA, 41, 109, Field.SYMBOL, 34, 109, 41, Field.DATA, Field.SYMBOL, Field.DATA, Field.BARCODE, 32, 36, Field.QUOTE, Field.DATA, 109, Field.GLOSSARY, 36, Field.SYMBOL, Field.USERADDRESS, Field.SYMBOL, Field.BARCODE, Field.DATA, 44, 32, 109, Field.SYMBOL, Field.AUTONUMOUT, 61, Field.DATA};
    }

    static {
        A02();
        A05 = new YL();
    }

    public static I4 A00(I4 i42) {
        i42.A0Y(0);
        return i42;
    }

    private boolean A03(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        C0741Cp c0741Cp = new C0741Cp();
        if (c0741Cp.A03(interfaceC0724By, true) && (c0741Cp.A04 & 2) == 2) {
            int length = Math.min(c0741Cp.A00, 8);
            I4 i42 = new I4(length);
            interfaceC0724By.AEO(i42.A00, 0, length);
            if (YM.A04(A00(i42))) {
                this.A01 = new YM();
            } else if (YH.A06(A00(i42))) {
                this.A01 = new YH();
            } else if (!YJ.A04(A00(i42))) {
                return false;
            } else {
                this.A01 = new YJ();
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A00 = interfaceC0725Bz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        if (this.A01 == null) {
            boolean A032 = A03(interfaceC0724By);
            if (A04[3].length() == 2) {
                throw new RuntimeException();
            }
            A04[7] = "Jcv8zuJPcQsh";
            if (A032) {
                interfaceC0724By.AFq();
            } else {
                throw new A0(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            C9 AHA = this.A00.AHA(0, 1);
            this.A00.A5u();
            this.A01.A06(this.A00, AHA);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0724By, c42);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void AG7(long j10, long j11) {
        if (this.A01 != null) {
            AbstractC0745Ct abstractC0745Ct = this.A01;
            if (A04[6].length() == 29) {
                throw new RuntimeException();
            }
            A04[3] = "HMcRS9JjfDSABRlFypQFz8UIf";
            abstractC0745Ct.A05(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0724By);
        } catch (A0 unused) {
            if (A04[6].length() != 29) {
                A04[7] = "Et";
                return false;
            }
            throw new RuntimeException();
        }
    }
}
