package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Ip  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0879Ip {
    public static byte[] A00;
    public static String[] A01 = {"QTcAMu2NTOnQYBZmZwc1s5", "djg1XP0D7NXFeZ0NOExGmhJDpZKI4dpr", "ihQhkuhtHB3Nrh2mtKDZtHhTCWsAfOgS", "rKuldGKjFGgUg8", "leLR2vmDgK1cO2", "qW6uohj2RnSHed6NlIulLWXBUQuwa2BT", "fEb7DtRuRt", "Zqv9"};
    public static final AtomicBoolean A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{124, Byte.MAX_VALUE, -119, -110, 122, -115, -115, 122, 124, Byte.MAX_VALUE, 122, -115, Byte.MIN_VALUE, -116, -112, Byte.MIN_VALUE, -114, -113, 122, -113, -124, -120, Byte.MIN_VALUE, -118, -112, -113, -36, -33, -23, -14, -38, -19, -19, -38, -35, -17, -38, -29, -36, -23, -33, -18, -29, -36, -26, -32, -38, -32, -23, -36, -35, -25, -32, -33, 112, 115, 125, -122, 110, -127, -127, 110, 116, 125, 112, 113, 123, 116, 115, -28, -25, -15, -6, -30, -11, -11, -30, -23, -26, -30, -24, -5, -13, -20, -11, -28, -9, -20, -14, -15, -30, -9, -20, -16, -24, -14, -8, -9, -65, -62, -52, -43, -67, -48, -48, -67, -58, -65, -52, -62, -47, -58, -65, -55, -61, -67, -61, -52, -65, -64, -54, -61, -62, -105, -102, -92, -83, -107, -88, -88, -107, -98, -105, -92, -102, -87, -98, -105, -95, -101, -107, -86, -97, -93, -101, -91, -85, -86, -89, -86, -76, -67, -91, -72, -72, -91, -81, -76, -70, -91, -85, -76, -89, -88, -78, -85, -86, -124, -121, -111, -102, -126, -107, -107, -126, -107, -103, -126, -120, -111, -124, -123, -113, -120, -121, -55, -52, -42, -33, -57, -38, -38, -57, -37, -51, -42, -52, -57, -54, -36, -57, -51, -32, -36, -38, -55, -37, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -48, -58, -39, -58, -45, -58, 117, -127, Byte.MAX_VALUE, 64, 120, 115, 117, 119, 116, -127, -127, 125, 64, -119, 115, 125, 123, -116, 115, -123, 122, 123};
    }

    static {
        A05();
        A02 = new AtomicBoolean(false);
    }

    public static int A00(Context context) {
        return C0877Im.A0T(context).A2p(A03(0, 26, 12), Constants.CP_MAC_ROMAN);
    }

    public static int A01(Context context) {
        return C0877Im.A0T(context).A2p(A03(123, 25, 39), 30000);
    }

    public static long A02(Context context) {
        return C0877Im.A0T(context).A2q(A03(69, 29, 116), 86400000L);
    }

    public static String A04(boolean z10) {
        return z10 ? A03(226, 22, 3) : A03(207, 19, 86);
    }

    public static void A06(Context context) {
        C0877Im.A0T(context).A2s(A03(54, 15, 0));
    }

    public static boolean A07(Context context) {
        return A02.get() || A0G(context);
    }

    public static boolean A08(Context context) {
        return C0877Im.A0T(context).A2v(A03(148, 19, 55), true);
    }

    public static boolean A09(Context context) {
        return C0877Im.A0T(context).A2v(A03(ShapeTypes.ACTION_BUTTON_END, 18, 20), true);
    }

    public static boolean A0A(Context context) {
        return C0877Im.A1T(context) || A0D(context);
    }

    public static boolean A0B(Context context) {
        return A02.get() || A0E(context);
    }

    public static boolean A0C(Context context) {
        return C0877Im.A0T(context).A2v(A03(ShapeTypes.CHART_X, 22, 89), false);
    }

    public static boolean A0D(Context context) {
        if (A0G(context)) {
            C0877Im A0T = C0877Im.A0T(context);
            if (A01[5].charAt(3) != 'u') {
                throw new RuntimeException();
            }
            A01[1] = "s8XR5C0JhaykpGlf4kHqosaURTbELCS3";
            return A0T.A2v(A03(98, 25, 79), false);
        }
        return false;
    }

    public static boolean A0E(Context context) {
        return A0G(context) && C0877Im.A0T(context).A2v(A03(26, 28, 108), false);
    }

    public static boolean A0F(Context context) {
        return A09(context) || A08(context);
    }

    public static boolean A0G(Context context) {
        return Build.VERSION.SDK_INT >= 21 && C0877Im.A0T(context).A2v(A03(54, 15, 0), false) && A0F(context) && !A0H(context, A02(context));
    }

    public static boolean A0H(Context context, long j10) {
        long lastUpdateTime = System.currentTimeMillis();
        long currentTime = C0877Im.A0S(context);
        return lastUpdateTime - currentTime > j10;
    }
}
