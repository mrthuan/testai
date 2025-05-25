package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.In  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0878In {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, Field.BARCODE, Field.AUTONUMLGL, 44, 4, 58, Field.AUTONUMLGL, Field.BARCODE, 41, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.BARCODE, 4, 58, Field.IMPORT, Field.IMPORT, Field.AUTONUMOUT, 44, 4, Field.GOTOBUTTON, 58, Field.SYMBOL, 4, 56, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.GLOSSARY, Field.USERADDRESS, Field.QUOTE, Field.GLOSSARY, 4, 44, 41, 58, 43, 43, Field.USERADDRESS, 41, 4, 56, 41, Field.USERADDRESS, 58, Field.GLOSSARY, Field.GOTOBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, 32, Field.PAGEREF, Field.GLOSSARY, Field.AUTONUM, 30, 32, Field.GLOSSARY, Field.PAGEREF, Field.MACROBUTTON, Field.DDEAUTO, Field.DATA, Field.PAGEREF, 30, 36, Field.GLOSSARY, 32, Field.QUOTE, Field.DDE, 36, 30, Field.DATA, Field.GLOSSARY, 30, 32, Field.EQ, Field.EQ, 30, Field.QUOTE, Field.MACROBUTTON, Field.DDEAUTO, Field.AUTONUM, Field.GOTOBUTTON, 36, Field.MACROBUTTON, 30, Field.FILLIN, Field.DATA, Field.DDE, 36, 30, 34, 41, Field.DDEAUTO, Field.DDEAUTO, Field.GOTOBUTTON, 36, Field.MACROBUTTON, 11, 14, 4, 29, Field.AUTONUMLGL, 11, 4, 14, 24, 5, 3, 14, Field.AUTONUMLGL, 15, 4, 11, 8, 6, 15, Field.AUTONUMLGL, 3, 4, Field.AUTONUMLGL, 11, 26, 26, Field.AUTONUMLGL, 8, 24, 5, 29, 25, 15, 24, Field.AUTONUMLGL, 4, 11, Field.NUMCHARS, 3, 13, 11, 30, 3, 5, 4, 106, 111, 101, 124, Field.ADVANCE, 106, 101, 111, 121, 100, 98, 111, Field.ADVANCE, 98, 106, 105, Field.ADVANCE, 98, 102, 123, 121, 100, 125, 110, Field.ADVANCE, 105, 121, 100, 124, 120, 98, 101, 108, Field.ADVANCE, 104, 106, 123, 106, 105, 98, 103, 98, Byte.MAX_VALUE, 98, 110, 120, Field.ADDRESSBLOCK, Field.HYPERLINK, 82, Field.MERGESEQ, 99, Field.AUTOTEXTLIST, 82, Field.ADDRESSBLOCK, Field.GREETINGLINE, 80, Field.AUTOTEXTLIST, 99, Field.DOCPROPERTY, Field.ADDRESSBLOCK, Field.GREETINGLINE};
    }

    public static boolean A02(Context context) {
        return C0877Im.A0T(context).A2v(A00(0, 47, 121), true);
    }

    public static boolean A03(Context context) {
        return C0877Im.A0T(context).A2v(A00(47, 47, 99), false);
    }

    public static boolean A04(Context context) {
        return C0877Im.A0T(context).A2v(A00(ShapeTypes.FLOW_CHART_TERMINATOR, 46, 41), false);
    }

    public static boolean A05(Context context) {
        return Build.VERSION.SDK_INT >= 19 && C0877Im.A0T(context).A2v(A00(ShapeTypes.CHART_X, 15, 30), false);
    }

    public static boolean A06(Context context) {
        return C0877Im.A0T(context).A2v(A00(94, 45, 72), false);
    }
}
