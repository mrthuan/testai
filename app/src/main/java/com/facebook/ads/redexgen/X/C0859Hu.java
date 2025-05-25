package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Hu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0859Hu {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -68, 15, 5, 22, 1, -68, 5, 15, -68, 41, 78, 86, Field.SECTION, 76, Field.TOA, Field.INCLUDETEXT, 0, Field.TOA, 78, Field.INCLUDETEXT, Field.FILESIZE, Field.HYPERLINK, 0};
    }

    public C0859Hu() {
        this(32);
    }

    public C0859Hu(int i10) {
        this.A01 = new long[i10];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i10) {
        if (i10 >= 0 && i10 < this.A00) {
            return this.A01[i10];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 121) + i10 + A00(0, 10, 53) + this.A00);
    }

    public final void A04(long j10) {
        if (this.A00 == this.A01.length) {
            this.A01 = Arrays.copyOf(this.A01, this.A00 * 2);
        }
        long[] jArr = this.A01;
        int i10 = this.A00;
        this.A00 = i10 + 1;
        jArr[i10] = j10;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
