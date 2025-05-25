package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C5 {
    public static byte[] A02;
    public final C7 A00;
    public final C7 A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-106, -118, 101, -72};
    }

    public C5(C7 c72) {
        this(c72, c72);
    }

    public C5(C7 c72, C7 c73) {
        this.A00 = (C7) AbstractC0844Hf.A01(c72);
        this.A01 = (C7) AbstractC0844Hf.A01(c73);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5 c52 = (C5) obj;
        return this.A00.equals(c52.A00) && this.A01.equals(c52.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(2, 1, 0) + this.A00 + (this.A00.equals(this.A01) ? A00(0, 0, 17) : A00(0, 2, 96) + this.A01) + A00(3, 1, 81);
    }
}
