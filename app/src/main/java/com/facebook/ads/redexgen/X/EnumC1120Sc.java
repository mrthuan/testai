// Auto-fixed: added missing class declaration
public class EnumC1120Sc {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Sc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1120Sc {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, Field.INCLUDETEXT, Field.BIDIOUTLINE, Field.MERGESEQ, Field.FORMTEXT, Field.INCLUDEPICTURE, 78, 10, Field.AUTOTEXTLIST, Field.AUTOTEXT, Field.HYPERLINK, Field.BIDIOUTLINE, Field.AUTOTEXT, Field.HYPERLINK, 10, Field.HYPERLINK, Field.AUTOTEXT, Field.AUTOTEXTLIST, Field.LISTNUM, Field.FILESIZE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.AUTOTEXT, 16, 10, 15, Field.AUTOTEXTLIST, Field.DATA, Field.ASK, Field.ASK, Field.MACROBUTTON, 110, 125, 100, 100, Field.LISTNUM, Field.ADVANCE, Field.ADVANCE, Field.SECTION};
    }

    static {
        A02();
    }

    EnumC1120Sc(String str) {
        this.A00 = str;
    }

    public static EnumC1120Sc A00(String str) {
        EnumC1120Sc[] values;
        for (EnumC1120Sc enumC1120Sc : values()) {
            if (enumC1120Sc.A00.equals(str)) {
                return enumC1120Sc;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}

}
