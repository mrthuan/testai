package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Yt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1289Yt implements C6 {
    public static byte[] A06;
    public static String[] A07 = {"VPsJYR6nwnKl3GGsBKT9FowhdWGAXZgf", "t9hnQybDG6g7LPOKqAGiDP2", "Gb301YYJpOgpSDcybjg8W8RhsXLlFC2", "K51ciyg1bfmePwJiFReGXIVxb", "s2EXwZrfzgHoO4PfEfdPmYAG5v8xH9jH", "U3dudkeTlUyTG47", "CeJtzK2mqLvn7YYYi0VUzVQJpJ4l9CMm", "xs5QEvE"};
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[3].length() != 25) {
                throw new RuntimeException();
            }
            A07[6] = "J2GrNKZ7b522JA972PPYRjQW9OTYafkr";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
            i13++;
        }
    }

    public static void A02() {
        byte[] bArr = {-6, -98, -110, -42, -25, -28, -45, -26, -37, -31, -32, -27, -57, -27, -81, -80, -92, -13, -22, -22, -9, -23, -8, -9, -63, -31, -43, Field.DATA, 30, Field.GLOSSARY, 26, Field.DATA, -14, -77, -89, -5, -16, -12, -20, -36, -6, -60, -19, 18, 31, 24, 21, -13, 24, 14, 15, 34, -46, 22, 15, 24, 17, 30, 18, -25};
        if (A07[6].charAt(22) != 'Q') {
            throw new RuntimeException();
        }
        A07[0] = "mCtn7rBTOervmGdInElAArjuggAxpBXf";
        A06 = bArr;
    }

    static {
        A02();
    }

    public C1289Yt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j10) {
        return IK.A0B(this.A04, j10, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        int A00 = A00(j10);
        C7 c72 = new C7(this.A04[A00], this.A03[A00]);
        int chunkIndex = (c72.A01 > j10 ? 1 : (c72.A01 == j10 ? 0 : -1));
        if (chunkIndex < 0) {
            int i10 = this.A00;
            String[] strArr = A07;
            String str = strArr[2];
            String str2 = strArr[1];
            int length = str.length();
            int chunkIndex2 = str2.length();
            if (length == chunkIndex2) {
                throw new RuntimeException();
            }
            A07[6] = "5dqNVttcMNtWdKoHzKCRCPQ2iaXgPTKU";
            int chunkIndex3 = i10 - 1;
            if (A00 != chunkIndex3) {
                int chunkIndex4 = A00 + 1;
                long j11 = this.A04[chunkIndex4];
                int chunkIndex5 = A00 + 1;
                C7 seekPoint = new C7(j11, this.A03[chunkIndex5]);
                return new C5(c72, seekPoint);
            }
        }
        return new C5(c72);
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 69) + this.A00 + A01(25, 8, 80) + Arrays.toString(this.A01) + A01(15, 10, 31) + Arrays.toString(this.A03) + A01(33, 9, 34) + Arrays.toString(this.A04) + A01(1, 14, 13) + Arrays.toString(this.A02) + A01(0, 1, 108);
    }
}
