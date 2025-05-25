package com.facebook.ads.redexgen.X;

import android.text.Layout;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class GR {
    public static byte[] A0G;
    public static String[] A0H = {"NUzGMnL", "YQomcxwQ93PK4ynsoGLiAyy456b0aprk", "uNrGKGnRv4o3g0hSFh353yXiGCuuTbcl", "SgzJpbJtXWAVdbgrbfLOIM48XHAMhxWL", "3zAyiaC", "pHYNglNqhBNsg9S2eahg7hU7OyTCBGVk", "Ro2GB40CJjXXy4HKltQfUSJDg2onAoKh", "NsNQiUOCEqaWjU1BLVqBIrSW7n245ODK"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Layout.Alignment A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List<String> A0D;
    public boolean A0E;
    public boolean A0F;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0H;
            if (strArr[1].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "FheFC1U";
            strArr2[0] = "PUes7im";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
            i13++;
        }
    }

    public static void A02() {
        A0G = new byte[]{-73, -42, -40, -32, -36, -25, -28, -22, -29, -39, -107, -40, -28, -31, -28, -25, -107, -29, -28, -23, -107, -39, -38, -37, -34, -29, -38, -39, -93, -34, 7, 6, 12, -72, -5, 7, 4, 7, 10, -72, 6, 7, 12, -72, -4, -3, -2, 1, 6, -3, -4};
    }

    static {
        A02();
    }

    public GR() {
        A03();
    }

    public static int A00(int i10, String str, String str2, int i11) {
        if (!str.isEmpty()) {
            String[] strArr = A0H;
            if (strArr[1].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[1] = "7EvIURBQpECqxG5jGjLOa9HKn8wbzJkS";
            strArr2[3] = "UbOohqAT6hcG0r1X4DLnHOjV5CTu4rQu";
            if (i10 != -1) {
                if (str.equals(str2)) {
                    return i10 + i11;
                }
                return -1;
            }
        }
        return i10;
    }

    private final void A03() {
        String A01 = A01(0, 0, 7);
        this.A0A = A01;
        this.A0B = A01;
        this.A0D = Collections.emptyList();
        this.A0C = A01;
        this.A09 = null;
        this.A0F = false;
        this.A0E = false;
        this.A06 = -1;
        this.A07 = -1;
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A08 = null;
    }

    public final float A04() {
        return this.A00;
    }

    public final int A05() {
        if (this.A0E) {
            return this.A01;
        }
        throw new IllegalStateException(A01(0, 29, 22));
    }

    public final int A06() {
        if (this.A0F) {
            return this.A03;
        }
        throw new IllegalStateException(A01(29, 22, 57));
    }

    public final int A07() {
        return this.A04;
    }

    public final int A08() {
        if (this.A02 == -1 && this.A05 == -1) {
            return -1;
        }
        int i10 = this.A02 == 1 ? 1 : 0;
        int i11 = this.A05;
        String[] strArr = A0H;
        if (strArr[1].charAt(18) != strArr[3].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[4] = "3eGvBoe";
        strArr2[0] = "z8byPBs";
        return i10 | (i11 == 1 ? 2 : 0);
    }

    public final int A09(String str, String str2, String[] strArr, String str3) {
        if (this.A0A.isEmpty() && this.A0B.isEmpty() && this.A0D.isEmpty() && this.A0C.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int A00 = A00(A00(A00(0, this.A0A, str, 1073741824), this.A0B, str2, 2), this.A0C, str3, 4);
        if (A00 == -1 || !Arrays.asList(strArr).containsAll(this.A0D)) {
            return 0;
        }
        int score = this.A0D.size();
        return A00 + (score * 4);
    }

    public final Layout.Alignment A0A() {
        return this.A08;
    }

    public final GR A0B(int i10) {
        this.A01 = i10;
        this.A0E = true;
        return this;
    }

    public final GR A0C(int i10) {
        this.A03 = i10;
        this.A0F = true;
        return this;
    }

    public final GR A0D(String str) {
        this.A09 = IK.A0M(str);
        return this;
    }

    public final GR A0E(boolean z10) {
        this.A02 = z10 ? 1 : 0;
        return this;
    }

    public final GR A0F(boolean z10) {
        this.A05 = z10 ? 1 : 0;
        return this;
    }

    public final GR A0G(boolean z10) {
        this.A07 = z10 ? 1 : 0;
        return this;
    }

    public final String A0H() {
        return this.A09;
    }

    public final void A0I(String str) {
        this.A0A = str;
    }

    public final void A0J(String str) {
        this.A0B = str;
    }

    public final void A0K(String str) {
        this.A0C = str;
    }

    public final void A0L(String[] strArr) {
        this.A0D = Arrays.asList(strArr);
    }

    public final boolean A0M() {
        return this.A0E;
    }

    public final boolean A0N() {
        return this.A0F;
    }

    public final boolean A0O() {
        return this.A06 == 1;
    }

    public final boolean A0P() {
        return this.A07 == 1;
    }
}
