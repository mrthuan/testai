package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Cg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0732Cg {
    public static byte[] A00;
    public static String[] A01 = {"mMVqpqBVgrnijMcf07ELsDNcJ24OL2nP", "IP6eS0SEp8gBdkX6C7fdNeLrZWtZ", "Csb6WekrqE", "hqLJz7OFCqwyqI3Xl9C5Yk0lZKMX44EB", "EBI4zKNq1U8AXqXtP1Wxz6Xy4vBMW1iS", "UNFwS5L41LHHq5BQuxA2jKAhYKXr1bOi", "a4BPWy1hEZ", "KDcDYO4g5i7d4XPLwMmGmppr610vo4rD"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-17, 18, 18, 7, -32, 19, 14, 12, -12, 19, 8, 11, -47, -22, -17, -15, -20, -20, -21, -18, -16, -31, -32, -100, -20, -17, -17, -28, -100, -14, -31, -18, -17, -27, -21, -22, -74, -100};
    }

    static {
        A03();
    }

    public static C0731Cf A00(byte[] bArr) {
        I4 i42 = new I4(bArr);
        if (i42.A07() < 32) {
            return null;
        }
        i42.A0Y(0);
        int A08 = i42.A08();
        int A04 = i42.A04() + 4;
        if (A01[1].length() == 28) {
            String[] strArr = A01;
            strArr[7] = "8tunoJcFY8sdNkzTV28xZ3mFQC5lH0FH";
            strArr[0] = "RL5PFckm7p773rKwLt1g33yNj7eK7Ab7";
            if (A08 != A04) {
                return null;
            }
            int A082 = i42.A08();
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[2].length()) {
                A01[4] = "I3b4ZRO4hoj0qqQ4bLGuwt50SIh123Br";
                if (A082 != CO.A0r) {
                    return null;
                }
                int A012 = CO.A01(i42.A08());
                if (A012 > 1) {
                    Log.w(A01(0, 12, 70), A01(12, 26, 35) + A012);
                    return null;
                }
                UUID uuid = new UUID(i42.A0L(), i42.A0L());
                if (A012 == 1) {
                    int keyIdCount = i42.A0H();
                    if (A01[4].charAt(17) == 'N') {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A01;
                    strArr3[6] = "srnpLtY0xe";
                    strArr3[2] = "yJ4YGMGdHJ";
                    i42.A0Z(keyIdCount * 16);
                }
                int atomSize = i42.A0H();
                if (atomSize != i42.A04()) {
                    return null;
                }
                byte[] bArr2 = new byte[atomSize];
                i42.A0c(bArr2, 0, atomSize);
                return new C0731Cf(uuid, A012, bArr2);
            }
        }
        throw new RuntimeException();
    }

    public static UUID A02(byte[] bArr) {
        UUID uuid;
        C0731Cf parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}
