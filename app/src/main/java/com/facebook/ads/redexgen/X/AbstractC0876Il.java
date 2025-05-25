package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Il  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0876Il {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Field.USERADDRESS, 59, Field.EQ, Field.DATA, 0, 60, 48, Field.EQ, Field.SYMBOL, Field.AUTONUM, 56, 0, 44, 58, Field.EQ, 59, 0, Field.SYMBOL, 61, Field.MACROBUTTON, 48, 56, Field.AUTONUM, Field.EQ, 0, Field.USERADDRESS, 44, Field.AUTONUM, 59, Byte.MAX_VALUE, 122, 112, 105, Field.SECTION, 119, 122, 120, Byte.MAX_VALUE, Field.SECTION, 108, 123, 120, 108, 123, 109, 118, Field.SECTION, 106, 119, 115, 123, Field.SECTION, 115, 109, Field.GREETINGLINE, Field.HTMLCONTROL, Field.ADDIN, Field.NOTEREF, 96, 76, Field.CONTROL, 80, 74, Field.FORMDROPDOWN, Field.HTMLCONTROL, 96, 76, Field.LISTNUM, Field.ADDIN, Field.HTMLCONTROL, 96, Field.GREETINGLINE, Field.AUTOTEXT, Field.AUTOTEXT, 96, 86, Field.ADDIN, Field.AUTOTEXTLIST, 80, 96, 86, Field.ADDIN, 96, 74, 76, Field.LISTNUM, 77, 96, Field.GREETINGLINE, Field.HYPERLINK, Field.LISTNUM, Field.ADDIN, Field.MERGESEQ, 1, 4, 14, 23, Field.BARCODE, 21, 19, 5, Field.BARCODE, 6, 2, Field.ADVANCE, 1, Field.BARCODE, 9, 4, 122, Byte.MAX_VALUE, 117, 108, Field.INCLUDETEXT, 110, 104, 126, Field.INCLUDETEXT, 125, 121, Field.GLOSSARY, 122, Field.INCLUDETEXT, 114, Byte.MAX_VALUE, Field.INCLUDETEXT, 125, 114, 105, 104, 111, 64, Field.FILESIZE, Field.AUTOTEXT, 86, 126, Field.ADVANCE, 82, Field.INCLUDETEXT, Field.FORMDROPDOWN, 126, 64, Field.FORMTEXT, Field.INCLUDETEXT, Field.AUTOTEXT, Field.DOCPROPERTY, 126, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.FORMCHECKBOX, Field.FORMDROPDOWN, Field.INCLUDETEXT, 82, Field.TOA, 126, Field.DOCPROPERTY, Field.NOTEREF, 76, Field.INCLUDETEXT, 126, 76, 82};
    }

    public static long A00(Context context) {
        return C0877Im.A0T(context).A2q(A02(29, 25, 32), -1L);
    }

    public static long A01(Context context) {
        return C0877Im.A0T(context).A2q(A02(ShapeTypes.PLUS, 31, 31), -1L);
    }

    public static boolean A04(Context context) {
        return C0877Im.A0T(context).A2v(A02(54, 39, 1), true);
    }

    public static boolean A05(Context context) {
        return C0877Im.A0T(context).A2v(A02(0, 29, 97), false);
    }

    public static boolean A06(Context context) {
        return C0877Im.A0T(context).A2v(A02(93, 16, 94), false);
    }

    public static boolean A07(Context context) {
        return C0877Im.A0T(context).A2v(A02(109, 22, 37), false);
    }
}
