package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Ha  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0839Ha {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{36, Field.IMPORT, Field.DDEAUTO, 30, 43, 36, Field.DDE, -41, -22, -31, -47, -28, -41, -42, -37, -28};
    }

    public static long A00(HZ hz) {
        return hz.A6B(A02(0, 7, ShapeTypes.VERTICAL_SCROLL), -1L);
    }

    public static Uri A01(HZ hz) {
        String A6D = hz.A6D(A02(7, 9, 50), null);
        if (A6D == null) {
            return null;
        }
        return Uri.parse(A6D);
    }

    public static void A04(C0840Hb c0840Hb) {
        c0840Hb.A01(A02(7, 9, 50));
    }

    public static void A05(C0840Hb c0840Hb, long j10) {
        c0840Hb.A02(A02(0, 7, ShapeTypes.VERTICAL_SCROLL), j10);
    }

    public static void A06(C0840Hb c0840Hb, Uri uri) {
        c0840Hb.A03(A02(7, 9, 50), uri.toString());
    }
}
