// Auto-fixed: added missing class declaration
public class JX {
package com.facebook.ads.redexgen.X;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Arrays;
import javax.annotation.Nullable;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum JX {
    A06(-1, 100, 1, 0),
    A07(-1, 120, 2, 1),
    A08(-1, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 3, 2),
    A09(-1, 400, 4, 3),
    A0A(-1, 50, 5, 4),
    A0B(-1, -1, 6, 5);
    
    public static byte[] A04;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{16, 29, 17, 31, 16, 12, 7, 105, 104, 104, Field.SHAPE, 82, Field.GREETINGLINE, 80, Field.SHAPE, Field.INCLUDEPICTURE, Field.NOTEREF, Field.ASK, Field.PAGEREF, Field.FILLIN, Field.HTMLCONTROL, 86, Field.LISTNUM, Field.ADVANCE, Field.HTMLCONTROL, Field.FORMCHECKBOX, 76, 32, Field.QUOTE, Field.QUOTE, 115, 126, 114, 124, 115, 111, 100, 15, 11, 11, Field.HTMLCONTROL, 86, Field.LISTNUM, Field.ADVANCE, Field.HTMLCONTROL, Field.FORMCHECKBOX, 76, Field.ASK, Field.QUOTE, 82, Field.FILESIZE, Field.INCLUDEPICTURE, Field.ADVANCE, Field.SHAPE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, 78, Field.SECTION, 77, Field.TOA, Field.INCLUDEPICTURE};
    }

    static {
        A02();
    }

    JX(int i10, int i11, int i12, int i13) {
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = i13;
    }

    @Nullable
    public static JX A00(int i10) {
        JX[] values;
        for (JX jx : values()) {
            if (jx.A00 == i10) {
                return jx;
            }
        }
        return null;
    }

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return this.A02;
    }

    public final int A06() {
        return this.A03;
    }
}

}
