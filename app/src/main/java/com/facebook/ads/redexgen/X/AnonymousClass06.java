package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.06  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass06 {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public Integer A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{58, Field.MACROBUTTON, 48, Field.MACROBUTTON, Field.AUTONUMOUT, 60, Field.MACROBUTTON};
    }

    public AnonymousClass06(AnonymousClass06 anonymousClass06) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = anonymousClass06.A09;
        this.A08 = anonymousClass06.A08;
        this.A06 = anonymousClass06.A06;
        this.A07 = anonymousClass06.A07;
        this.A02 = anonymousClass06.A02;
        this.A03 = anonymousClass06.A03;
        this.A0A = anonymousClass06.A0A;
    }

    public AnonymousClass06(String str) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        String A00 = A00(0, 7, 100);
        this.A08 = A00;
        this.A06 = A00;
        this.A07 = A00;
        this.A02 = null;
        this.A03 = A00;
        this.A0A = false;
    }

    public AnonymousClass06(String str, String str2, String str3, String str4, String str5, boolean z10) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = null;
        this.A03 = str5;
        this.A0A = z10;
    }
}
