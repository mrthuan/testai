// Auto-fixed: added missing class declaration
public class AdPlacementType {
package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public enum AdPlacementType {
    BANNER(A00(74, 6, 36)),
    MEDIUM_RECTANGLE(A00(92, 16, 88)),
    INTERSTITIAL(A00(80, 12, 40)),
    NATIVE(A00(108, 6, 13)),
    NATIVE_BANNER(A00(114, 13, 119)),
    REWARDED_VIDEO(A00(ShapeTypes.VERTICAL_SCROLL, 14, 85)),
    UNKNOWN(A00(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 7, 17));
    
    public static byte[] A01;
    public static String[] A02 = {"CWC1iyAzuHCyWu1B0SYAHTA3miIxyRDu", "FO468KlqU7YYiE83Le7T5pQKY2foYhCa", "4lSmmc8pBcjbV0on62ZikVJFYVLsdMQp", "9H0k66zkYNaHG7pLFG5T73JVLywfdj", "IkTzUK68woTPnHHBk", "q5XpLTEZbHtnyzZXCKIvrGbFL2My8Wb0", "rdQ7fJEKRbVHtvxpiCxMwn5qtJ9qGM1n", "xGvuYGSPJhOX4"};
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(3) != '7') {
                throw new RuntimeException();
            }
            A02[7] = "CTk8rnXs6cBCh";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-35, -36, -23, -23, -32, -19, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, 23, 15, 14, 19, 31, 23, 41, Field.NUMCHARS, 15, 13, 30, 11, 24, 17, 22, 15, -33, -46, -27, -38, -25, -42, -13, -26, -7, -18, -5, -22, 4, -25, -26, -13, -13, -22, -9, 44, 31, Field.EQ, Field.NUMWORDS, 44, 30, 31, 30, Field.SYMBOL, 48, Field.QUOTE, 30, 31, 41, 16, 9, 6, 9, 10, 18, 9, 5, 4, 17, 17, 8, 21, 16, 21, Field.NUMWORDS, 12, 25, 26, Field.NUMWORDS, 16, Field.NUMWORDS, 16, 8, 19, Field.INCLUDETEXT, 60, 59, 64, 76, Field.INCLUDETEXT, Field.AUTONUM, Field.TOA, 60, 58, Field.MERGESEQ, 56, Field.FILESIZE, Field.USERADDRESS, Field.INCLUDEPICTURE, 60, -6, -19, 0, -11, 2, -15, 100, Field.CONTROL, 106, Field.SHAPE, 108, Field.HTMLCONTROL, Field.DOCPROPERTY, Field.HYPERLINK, Field.CONTROL, 100, 100, Field.HTMLCONTROL, 104, Field.FORMTEXT, Field.SYMBOL, Field.MERGESEQ, Field.AUTONUMLGL, Field.FORMTEXT, 56, Field.SYMBOL, 56, Field.MACROBUTTON, 74, 61, 56, Field.SYMBOL, Field.INCLUDEPICTURE, 5, -2, -5, -2, -1, 7, -2};
    }

    static {
        A01();
    }

    AdPlacementType(String str) {
        this.A00 = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.A00;
    }
}

}
