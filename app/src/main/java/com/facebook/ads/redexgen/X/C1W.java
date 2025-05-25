package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1W  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1W implements Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 63);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-124, -2, -26, -8, -11, -11, -24, -15, -26, -4, 0, -36, -46, -42, -62, -49, -43, -54, -43, -38, -34};
    }

    public C1W(C1V c1v) {
        String str;
        String str2;
        String str3;
        String str4;
        str = c1v.A02;
        this.A02 = str;
        str2 = c1v.A03;
        this.A03 = str2;
        str3 = c1v.A00;
        this.A00 = str3;
        str4 = c1v.A01;
        this.A01 = str4;
    }

    public static String A01(String str, String str2, int i10) {
        String replace = str.replace(A00(1, 10, 68), str2);
        String A00 = A00(0, 0, 39);
        if (i10 > 0) {
            StringBuilder append = new StringBuilder().append(i10);
            String updatedString = A00(0, 1, 37);
            A00 = append.append(updatedString).toString();
        }
        String updatedString2 = A00(11, 10, 34);
        return replace.replace(updatedString2, A00);
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i10) {
        return A01(this.A03, str, i10);
    }
}
