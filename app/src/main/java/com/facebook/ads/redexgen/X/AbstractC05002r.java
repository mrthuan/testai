package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.2r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05002r {
    public static String[] A00 = {"nDiC2V", "xvPzB4voGkHgvzabNn8fejRwCVSwo6Ah", "OJIGMHO1ySc0mzACRtkWxwocBaSnW5m2", "JbsfTTx", "hwYl", "U04BYM1NuctRYg5sssH2", "d2TQ", "mxYxJu"};
    public static final int[] A01 = new int[0];
    public static final long[] A02 = new long[0];
    public static final Object[] A03 = new Object[0];

    public static int A00(int i10) {
        return A01(i10 * 8) / 8;
    }

    public static int A01(int i10) {
        int i11 = 4;
        while (A00[5].length() == 20) {
            A00[5] = "sf2HjvEbKVwFe9jamb5q";
            if (i11 < 32) {
                int i12 = 1 << i11;
                if (i10 <= i12 - 12) {
                    int i13 = (1 << i11) - 12;
                    return i13;
                }
                i11++;
            } else {
                return i10;
            }
        }
        throw new RuntimeException();
    }

    public static int A02(int[] iArr, int i10, int i11) {
        int midVal = 0;
        int i12 = i10 - 1;
        while (midVal <= i12) {
            int i13 = midVal + i12;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[2];
            int hi2 = str.charAt(26);
            int lo2 = str2.charAt(26);
            if (hi2 != lo2) {
                throw new RuntimeException();
            }
            A00[3] = "GyF3CdngjgIBS8WP";
            int hi3 = i13 >>> 1;
            int lo3 = iArr[hi3];
            if (lo3 < i11) {
                midVal = hi3 + 1;
            } else if (lo3 > i11) {
                i12 = hi3 - 1;
            } else {
                return hi3;
            }
        }
        int lo4 = midVal ^ (-1);
        return lo4;
    }

    public static int A03(long[] jArr, int i10, long j10) {
        int i11 = 0;
        int i12 = i10 - 1;
        while (i11 <= i12) {
            int lo2 = i11 + i12;
            int i13 = lo2 >>> 1;
            long j11 = jArr[i13];
            int lo3 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            if (lo3 < 0) {
                i11 = i13 + 1;
            } else {
                int i14 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                String[] strArr = A00;
                String str = strArr[4];
                String str2 = strArr[6];
                int hi2 = str.length();
                int lo4 = str2.length();
                if (hi2 != lo4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[4] = "jlrm";
                strArr2[6] = "MXd0";
                if (i14 > 0) {
                    i12 = i13 - 1;
                } else {
                    return i13;
                }
            }
        }
        int lo5 = i11 ^ (-1);
        return lo5;
    }

    public static boolean A04(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
