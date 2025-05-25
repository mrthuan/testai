package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.6J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6J {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, Field.AUTONUMLGL, 56, Field.AUTOTEXT, 64, 74, Field.BIDIOUTLINE, Field.SECTION, Field.FORMCHECKBOX, 74, Field.FORMCHECKBOX, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, Field.ASK, Field.MACROBUTTON, Field.MACROBUTTON, Byte.MAX_VALUE, 115, 113, Field.GOTOBUTTON, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, Field.GOTOBUTTON, 119, 125, 104, 125, 114, 125, Field.GOTOBUTTON, 108, 110, 115, 106, 117, 120, 121, 110, Field.GOTOBUTTON, Field.ADDRESSBLOCK, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, Field.DOCPROPERTY, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C6I A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, 113);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c = null;
        try {
            c = contentResolver.query(L5.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c == null || !c.moveToFirst()) {
                return new C6I(null, null, false);
            }
            String string = c.getString(c.getColumnIndex(A013));
            String attributionId = c.getString(c.getColumnIndex(A012));
            C6I c6i = new C6I(string, attributionId, Boolean.valueOf(c.getString(c.getColumnIndex(A01))).booleanValue());
            if (c != null) {
                c.close();
            }
            return c6i;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
