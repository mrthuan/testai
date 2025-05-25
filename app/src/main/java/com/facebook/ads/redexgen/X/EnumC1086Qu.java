// Auto-fixed: added missing class declaration
public class EnumC1086Qu {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Qu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1086Qu {
    A04(A00(ShapeTypes.FLOW_CHART_OR, 33, 22)),
    A05(A00(ShapeTypes.MATH_EQUAL, 36, 110)),
    A06(A00(216, 29, 107)),
    A03(A00(78, 32, 92)),
    A07(A00(110, 37, 90));
    
    public static byte[] A01;
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 7, 26, 15, Field.NUMCHARS, 11, Field.PAGEREF, 7, 10, Field.PAGEREF, 9, 18, 15, 9, 17, -63, -76, -57, -68, -55, -72, -46, -74, -62, -64, -61, -65, -72, -57, -72, -35, -48, -29, -40, -27, -44, -18, -44, -35, -45, -18, -48, -46, -29, -40, -27, -40, -29, -24, -35, -48, -29, -40, -27, -44, -18, -44, -31, -31, -34, -31, -39, -52, -33, -44, -31, -48, -22, -44, -40, -37, -35, -48, -34, -34, -44, -38, -39, 41, Field.AUTONUMLGL, Field.MACROBUTTON, -12, 44, Field.FILLIN, 41, 43, Field.DATA, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.EQ, -12, Field.FILLIN, 42, Field.SYMBOL, -12, Field.AUTONUMOUT, Field.FILLIN, 58, Field.GLOSSARY, 60, 43, -12, Field.FILLIN, 42, Field.PAGEREF, 41, Field.GOTOBUTTON, Field.GLOSSARY, 41, Field.EQ, Field.FILLIN, Field.MACROBUTTON, Field.EQ, -14, 42, Field.PAGEREF, Field.FILLIN, 41, Field.ASK, Field.MACROBUTTON, Field.MACROBUTTON, Field.GLOSSARY, -14, Field.PAGEREF, Field.DATA, Field.IMPORT, -14, Field.GOTOBUTTON, Field.PAGEREF, 56, Field.DDE, 58, 41, -14, Field.PAGEREF, Field.DATA, Field.QUOTE, Field.DDE, Field.EQ, Field.AUTONUMOUT, Field.AUTONUM, 41, Field.IMPORT, Field.IMPORT, Field.DDE, Field.MACROBUTTON, Field.GOTOBUTTON, -29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -18, -31, -12, -23, -10, -27, -82, -29, -17, -19, -16, -20, -27, -12, -27, -28, 59, Field.FORMCHECKBOX, Field.FILESIZE, 6, Field.USERADDRESS, Field.SYMBOL, 59, 61, 58, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.INCLUDEPICTURE, 6, Field.SYMBOL, 60, Field.MERGESEQ, 6, Field.FORMTEXT, Field.SYMBOL, 76, Field.SECTION, 78, 61, 6, 61, Field.FORMTEXT, 60, Field.IMPORT, Field.SYMBOL, 59, 76, Field.SECTION, 78, Field.SECTION, 76, Field.ADDIN, 56, Field.INCLUDETEXT, Field.SECTIONPAGES, 3, 59, Field.AUTONUM, 56, 58, Field.IMPORT, Field.INCLUDETEXT, Field.INCLUDETEXT, 64, 3, Field.AUTONUM, Field.SYMBOL, Field.NOTEREF, 3, Field.INCLUDEPICTURE, Field.AUTONUM, Field.TOA, Field.USERADDRESS, Field.MERGESEQ, 58, 3, 58, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.INCLUDETEXT, Field.FORMCHECKBOX};
    }

    static {
        A01();
    }

    EnumC1086Qu(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}

}
