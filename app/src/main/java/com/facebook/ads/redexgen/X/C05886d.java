package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05886d {
    public static byte[] A08;
    public C6l A00;
    public String A01 = A00(0, 4, 75);
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{7, 10, -4, -1};
    }

    public C05886d(String str, int i10, int i11, String str2, String str3) {
        this.A07 = str;
        this.A03 = i10;
        this.A04 = i11;
        this.A06 = str2;
        this.A05 = str3;
    }
}
