package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05936i {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, Field.NUMWORDS, -42, 26, Field.PAGEREF, Field.DDE, 36, 34, Field.PAGEREF, 23, 26, -42, Field.NUMCHARS, 23, 31, 34, 43, Field.DATA, Field.NUMWORDS, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, 36, 23, 19, Field.ASK, Field.NUMWORDS, Field.DATA, 23, 17, Field.PAGEREF, Field.NUMWORDS, 44, 23, 17, 20, 43, Field.ASK, 23, Field.PAGEREF, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, Field.NUMWORDS, 34, 43, Field.DDEAUTO, 41, 29, 48, Field.NUMWORDS, 48, Field.AUTONUMLGL, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, Field.INCLUDEPICTURE, 86, 86, Field.FORMCHECKBOX, Field.AUTOTEXT, 82, 86, 30, Field.NUMCHARS, 30, Field.QUOTE, 32, Field.BARCODE, 61, Field.BARCODE, Field.INCLUDETEXT, Field.SECTION, 59, Field.BARCODE, Field.MERGESEQ, 74, 80, Field.SECTION, Field.ADVANCE, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, Field.NUMWORDS, 15, 21, 19, Field.NUMCHARS, 31, 17, 20, 15, 36, 25, 29, 21, Field.FORMTEXT, Field.INCLUDEPICTURE, 61};
    }

    static {
        A01();
        A09 = C05936i.class.getSimpleName();
        A05 = C8E.A0o;
        A06 = C8E.A0s;
        A02 = C8E.A0l;
        A01 = C8E.A0k;
        A03 = C8E.A0m;
        A00 = C8E.A0i;
        A04 = C8E.A0n;
        A07 = C8E.A0t;
    }

    public static void A02(C7j c7j, C6Y c6y, int i10, String str, long j10) {
        if (!A06(c7j)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c6y.A01);
            jSONObject.put(A00(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, 13, 46), c6y.A02);
            if (j10 > 0) {
                jSONObject.put(A00(191, 9, 73), C0956Lu.A06(System.currentTimeMillis() - j10));
            }
            C8F c8f = new C8F(str);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 5, 84), i10, c8f);
        } catch (Throwable deLogException) {
            c7j.A07().A3y(deLogException);
        }
    }

    public static void A03(C7j c7j, C05886d c05886d, String str, int i10, String str2, Long l10, Long l11) {
        if (A06(c7j)) {
            A05(c7j, c05886d.A05, c05886d.A06, c05886d.A07, A00(ShapeTypes.CHART_STAR, 5, 71), str, i10, str2, l10, l11, null);
        }
    }

    public static void A04(C7j c7j, C05926h c05926h, boolean z10) {
        if (!A06(c7j)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c05926h.A01);
            jSONObject.put(A00(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, 13, 46), c05926h.A03);
            jSONObject.put(A00(104, 16, 23), c05926h.A02);
            jSONObject.put(A00(ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, 13, 117), c05926h.A00);
            if (C0877Im.A2I(c7j)) {
                jSONObject.put(A00(200, 3, 106), c05926h.A04);
            }
            String A002 = z10 ? A00(61, 10, 6) : A00(71, 11, 23);
            int i10 = z10 ? A05 : A06;
            C8F c8f = new C8F(A002);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 5, 84), i10, c8f);
        } catch (Throwable th2) {
            c7j.A07().A3y(th2);
        }
    }

    public static void A05(C7j c7j, String str, String str2, String str3, String str4, String str5, int i10, String str6, Long l10, Long l11, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(ShapeTypes.ACTION_BUTTON_MOVIE, 14, 16), str6);
            }
            if (l10 != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l10));
            }
            if (l11 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l11));
            }
            if (num != null) {
                jSONObject.put(A00(ShapeTypes.FLOW_CHART_OR, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, 13, 117), str5);
            if (C0877Im.A2I(c7j)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String A002 = A00(19, 19, 14);
            if (i10 == A03) {
                A002 = A00(38, 23, 79);
            } else if (i10 == A01) {
                A002 = A00(0, 19, 39);
            }
            C8F c8f = new C8F(A002);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 5, 84), i10, c8f);
        } catch (Throwable th2) {
            c7j.A07().A3y(th2);
        }
    }

    public static boolean A06(C7j c7j) {
        int A062;
        if (c7j.A04().A9O()) {
            A062 = 1;
        } else {
            A062 = Io.A06(c7j);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || c7j.A08().A00() <= 1.0d / ((double) A062);
    }
}
