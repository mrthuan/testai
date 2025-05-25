package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Yf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1275Yf implements CF {
    public static byte[] A07;
    public static String[] A08 = {"B", "", "BrvSCWdfcuCaq5cVU07ZhXt", "qubJP7lsNWbo", "NFdit9VNslJwWcMc3jsN0gE8Kfr4ZGkz", "XUMceIPS5Pe", "7dzq6MzNvuPcuITQcDTRqTS6G3kR4", "NdQzj"};
    public int A00;
    public int A01;
    public long A02;
    public CH A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<CE> A05 = new ArrayDeque<>();
    public final CM A04 = new CM();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{26, 61, Field.PAGEREF, Field.GOTOBUTTON, Field.BARCODE, 58, Field.IMPORT, 115, Field.AUTONUM, Field.BARCODE, Field.AUTONUM, Field.USERADDRESS, Field.AUTONUM, 61, Field.FILLIN, 115, Field.FILLIN, 42, Field.QUOTE, Field.AUTONUM, 115, Field.CONTROL, 112, 104, Byte.MAX_VALUE, 114, 119, 122, Field.USERADDRESS, 120, 114, 113, Byte.MAX_VALUE, 106, Field.USERADDRESS, 109, 119, 100, 123, 36, Field.USERADDRESS, Field.AUTOTEXT, 104, 112, 103, 106, 111, 98, Field.ASK, 111, 104, 114, 99, 97, 99, 116, Field.ASK, 117, 111, 124, 99, 60, Field.ASK, 74, 109, 107, 112, 119, 126, Field.SYMBOL, 124, 117, 124, 116, 124, 119, 109, Field.SYMBOL, 106, 112, 99, 124, Field.QUOTE, Field.SYMBOL};
    }

    static {
        A05();
    }

    private double A00(InterfaceC0724By interfaceC0724By, int i10) throws IOException, InterruptedException {
        long A02 = A02(interfaceC0724By, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        interfaceC0724By.AFq();
        while (true) {
            interfaceC0724By.AEO(this.A06, 0, 4);
            int A00 = CM.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) CM.A01(this.A06, A00, false);
                if (this.A03.A9V(A01)) {
                    interfaceC0724By.AGq(A00);
                    return A01;
                }
            }
            interfaceC0724By.AGq(1);
        }
    }

    private long A02(InterfaceC0724By interfaceC0724By, int i10) throws IOException, InterruptedException {
        interfaceC0724By.readFully(this.A06, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long value = this.A06[i11] & 255;
            j10 = (j10 << 8) | value;
        }
        return j10;
    }

    private String A04(InterfaceC0724By interfaceC0724By, int i10) throws IOException, InterruptedException {
        if (i10 == 0) {
            return A03(0, 0, 30);
        }
        byte[] bArr = new byte[i10];
        interfaceC0724By.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A9E(CH ch2) {
        this.A03 = ch2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
        throw new java.lang.RuntimeException();
     */
    @Override // com.facebook.ads.redexgen.X.CF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AEm(com.facebook.ads.redexgen.X.InterfaceC0724By r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1275Yf.AEm(com.facebook.ads.redexgen.X.By):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
