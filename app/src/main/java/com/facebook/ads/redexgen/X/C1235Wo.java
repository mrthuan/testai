package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1235Wo implements InterfaceC0837Gy {
    public static byte[] A06;
    public static String[] A07 = {"P1QEQSrukY5M5xBERBA96AXfGMpQRJsf", "fyJkILoJ8zO6ExXw4Z", "h2ZhnadmQQVtt", "59wO2YFrHM8LuMJd73h58a1kzdTPZKrY", "SxndWhWbDDrPbMOefSLNszxc26nlxYdY", "LBwvzUorbHEknhZCWQOabtM6HtCL0aoO", "5lhqhPHQff1TfuPnwPh7puTUvGoJGhr7", "0PrGAAoyZelcinCG058YNP9pZpCUk744"};
    public final int A00;
    public final InterfaceC0835Gw A01;
    public final InterfaceC0837Gy A02;
    public final InterfaceC0837Gy A03;
    public final HP A04;
    public final HR A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[0].charAt(6) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "vVmF6SpGATWHz9jZKAi0g6CZ8G1CuqUy";
            strArr[3] = "NGHYjAXI4l3csZ1DR9QZwhsoB2pnzImG";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 61);
            i13++;
        }
    }

    public static void A02() {
        A06 = new byte[]{Field.FORMDROPDOWN, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.ADDIN, Field.INCLUDETEXT, Field.DOCPROPERTY, 116, Field.ADDIN, Field.INCLUDETEXT, Field.ADDIN, 99, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.HTMLCONTROL};
    }

    static {
        A02();
    }

    public C1235Wo(HP hp2, InterfaceC0837Gy interfaceC0837Gy, InterfaceC0837Gy interfaceC0837Gy2, InterfaceC0835Gw interfaceC0835Gw, int i10, HR hr) {
        this.A04 = hp2;
        this.A03 = interfaceC0837Gy;
        this.A02 = interfaceC0837Gy2;
        this.A01 = interfaceC0835Gw;
        this.A00 = i10;
        this.A05 = hr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Gy
    /* renamed from: A00 */
    public final C1236Wp A4t() {
        HP hp2 = this.A04;
        InterfaceC0838Gz A4t = this.A03.A4t();
        InterfaceC0838Gz A4t2 = this.A02.A4t();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 13));
        }
        return new C1236Wp(hp2, A4t, A4t2, null, this.A00, null);
    }
}
