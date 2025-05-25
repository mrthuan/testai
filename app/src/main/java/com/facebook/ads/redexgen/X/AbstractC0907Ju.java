package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ju  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0907Ju {
    public static byte[] A00;
    public static final DateFormat A01;
    public static final AtomicBoolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{112, -66, 119, 107, 112, -66, 97, -81, 104, Field.BIDIOUTLINE, -105, 97, -81, -103, Field.BIDIOUTLINE, 97, -81, -41, -38, -28, -19, -11, -38, -37, -40, -21, -35, -11, -30, -27, -35, -35, -37, -24, -98, -98, -112, -61, -61, -112, -55, -55, -124, -87, -87, -87};
    }

    static {
        A03();
        A01 = new SimpleDateFormat(A01(34, 12, 49), Locale.US);
        A02 = new AtomicBoolean();
    }

    public static String A00() {
        return A01.format(Calendar.getInstance().getTime());
    }

    public static void A02() {
        A02.set(true);
    }

    public static void A04(String str, String str2) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(17, 17, 113), String.format(Locale.US, A01(0, 6, 38), A00(), str2));
    }

    public static void A05(String str, String str2, String str3) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(17, 17, 113), String.format(Locale.US, A01(6, 11, 23), A00(), str3, str2));
    }
}
