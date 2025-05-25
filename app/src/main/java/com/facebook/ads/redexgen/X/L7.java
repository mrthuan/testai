package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class L7 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, -62, -11, -66, -76, -80, 124, -64, -61, -68, -68, -73, -68, -75, -83, -77, Byte.MIN_VALUE, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        synchronized (L7.class) {
            if (A04()) {
                return System.getProperty(A00(0, 7, 115) + str);
            }
            return null;
        }
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        boolean z10;
        synchronized (L7.class) {
            if (!A00) {
                A01 = A00(21, 4, 27).equals(System.getProperty(A00(7, 14, 49)));
                A00 = true;
            }
            z10 = A01;
        }
        return z10;
    }

    public static synchronized boolean A05(String str) {
        boolean z10;
        synchronized (L7.class) {
            z10 = !TextUtils.isEmpty(A01(str));
        }
        return z10;
    }
}
