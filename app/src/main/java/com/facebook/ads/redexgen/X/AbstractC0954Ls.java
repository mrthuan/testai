package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ls  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0954Ls {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -6, -16, -2, -5, -11, -16, -70, -4, -15, -2, -7, -11, -1, -1, -11, -5, -6, -70, -51, -49, -49, -47, -33, -33, -21, -38, -47, -32, -29, -37, -34, -41, -21, -33, -32, -51, -32, -47, 5, 17, 16, 16, 7, 5, 22, 11, 24, 11, 22, Field.NUMWORDS};
    }

    public static EnumC0953Lr A00(Context context) {
        int result = context.checkCallingOrSelfPermission(A01(0, 39, 51));
        if (result != 0) {
            return EnumC0953Lr.A08;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(A01(39, 12, 73))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return EnumC0953Lr.A07;
        }
        int result2 = activeNetworkInfo.getType();
        if (result2 == 0) {
            int result3 = activeNetworkInfo.getSubtype();
            switch (result3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return EnumC0953Lr.A03;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return EnumC0953Lr.A04;
                case 13:
                    return EnumC0953Lr.A05;
                default:
                    return EnumC0953Lr.A08;
            }
        }
        return EnumC0953Lr.A06;
    }
}
