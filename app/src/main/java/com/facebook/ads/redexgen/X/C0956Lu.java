package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Lu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0956Lu {
    public static byte[] A00;
    public static String[] A01 = {"kzsYhm9LKsU0BkYF5GBD4cHOfO5I2S", "FiiX6q", "juV27aOscABEXHLMFQmBucT", "1EXxaj", "f1sOyyKe81qkTfSynlEtElAllv4GRKo", "lzeqJRba", "GXB72S", "F9UQYukVDOEwI1lxcupNtKixpZh4OtVr"};
    public static final InterfaceC0955Lt A02 = null;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{64, Field.MERGESEQ, 86, 3, 23, 8, 20, 21, 18, 16, Field.GOTOBUTTON, 61, 116, Field.FILLIN, 115, Field.AUTONUMLGL, 60, 33, Field.USERADDRESS, Field.GOTOBUTTON, Field.FILLIN, 115, Field.FILLIN, 58, Field.USERADDRESS, Field.AUTONUM, 125};
    }

    static {
        A07();
    }

    public static long A00() {
        if (A02 != null) {
            return A02.A5M();
        }
        return System.currentTimeMillis();
    }

    public static long A01(long j10) {
        if (j10 == -1) {
            return -1L;
        }
        return System.currentTimeMillis() - j10;
    }

    public static String A02(double d10) {
        try {
            return String.format(Locale.US, A03(0, 4, 115), Double.valueOf(d10));
        } catch (Exception e10) {
            String simpleName = C0956Lu.class.getSimpleName();
            if (A01[3].length() == 20) {
                Exception e11 = new RuntimeException();
                throw e11;
            }
            A01[0] = "ylDYykVZ0MQgZWbzvTC4Y0QCoTAruV";
            Log.e(simpleName, A03(9, 18, 69), e10);
            return A03(4, 5, 48);
        }
    }

    public static String A04(long j10) {
        return String.valueOf(A01(j10));
    }

    @Deprecated
    public static String A05(long j10) {
        return A02(j10 / 1000.0d);
    }

    public static String A06(long j10) {
        return Long.toString(j10);
    }
}
