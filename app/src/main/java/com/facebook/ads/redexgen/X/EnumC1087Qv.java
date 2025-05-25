// Auto-fixed: added missing class declaration
public class EnumC1087Qv {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Qv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1087Qv {
    A06(A00(425, 41, 32)),
    A07(A00(466, 56, 45)),
    A08(A00(522, 44, 8)),
    A09(A00(566, 37, 46)),
    A04(A00(302, 40, 20)),
    A0A(A00(342, 45, 95)),
    A05(A00(387, 38, 88)),
    A0C(A00(655, 53, 88)),
    A0B(A00(603, 52, 29)),
    A03(A00(252, 50, 121));
    
    public static byte[] A01;
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{123, 102, 113, 99, 117, 102, 112, 113, 112, 107, 98, 125, 112, 113, 123, 107, 117, 119, 96, 125, 98, 125, 96, 109, 107, 112, 113, 103, 96, 102, 123, 109, 113, 112, Field.DDE, 58, Field.DATA, Field.USERADDRESS, Field.DDE, 59, 58, 59, 32, 41, Field.AUTONUM, 59, 58, 48, 32, Field.USERADDRESS, 59, 32, 60, Field.MACROBUTTON, Field.AUTONUM, 60, Field.AUTONUMOUT, 78, Field.AUTOTEXTLIST, Field.MERGESEQ, Field.ADDRESSBLOCK, 78, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.INCLUDEPICTURE, 74, Field.DOCPROPERTY, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.FORMDROPDOWN, Field.INCLUDEPICTURE, Field.SHAPE, 80, Field.FORMDROPDOWN, Field.AUTOTEXT, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.MACROBUTTON, 36, Field.AUTONUM, 32, Field.MACROBUTTON, Field.PAGEREF, 36, Field.PAGEREF, Field.USERADDRESS, Field.IMPORT, Field.DATA, Field.PAGEREF, 36, Field.DDEAUTO, Field.USERADDRESS, 34, Field.DDEAUTO, 44, Field.EQ, Field.DDE, 36, Field.AUTONUMLGL, 36, 15, 24, 10, Field.NUMCHARS, 15, 25, 24, 25, 2, 11, 20, 25, 24, 18, 2, 30, 18, 16, 13, 17, 24, 9, 24, 2, 10, 20, 9, 21, 18, 8, 9, 2, 15, 24, 10, Field.NUMCHARS, 15, 25, 3, 20, 6, 16, 3, 21, 20, 21, 14, 7, 24, 21, 20, 30, 14, 20, 31, 21, 14, 16, 18, 5, 24, 7, 24, 5, 8, 86, Field.SECTION, Field.FORMDROPDOWN, Field.FILESIZE, 86, 64, Field.SECTION, 64, Field.HTMLCONTROL, 82, 77, 64, Field.SECTION, Field.MERGESEQ, Field.HTMLCONTROL, Field.SECTION, 86, 86, Field.MERGESEQ, 86, Field.CONTROL, 64, 82, Field.INCLUDETEXT, Field.CONTROL, Field.SECTION, 64, Field.SECTION, Field.LISTNUM, Field.FORMDROPDOWN, 76, Field.SECTION, 64, 74, Field.LISTNUM, 76, Field.NOTEREF, Field.DOCPROPERTY, Field.CONTROL, 64, 86, 86, 76, 74, Field.MERGESEQ, Field.NOTEREF, Field.SHAPE, 77, Field.HTMLCONTROL, Field.NOTEREF, Field.GREETINGLINE, Field.FILESIZE, Field.TOA, Field.SHAPE, Field.NOTEREF, 76, Field.SHAPE, Field.NOTEREF, Field.FILESIZE, Field.BIDIOUTLINE, Field.HTMLCONTROL, Field.FORMDROPDOWN, 86, Field.SHAPE, Field.GREETINGLINE, 99, 116, 102, 112, 99, 117, 110, 98, 116, 99, 103, 116, 99, 110, 98, 100, 114, 114, 116, 98, 98, 97, 109, 111, 44, 100, 99, 97, 103, 96, 109, 109, 105, 44, 99, 102, 113, 44, 112, 103, 117, 99, 112, 102, 103, 102, Field.ADDRESSBLOCK, 116, 107, 102, 103, 109, 44, 99, 97, 118, 107, 116, 107, 118, 123, Field.ADDRESSBLOCK, 102, 103, 113, 118, 112, 109, 123, 103, 102, 12, 0, 2, Field.SECTION, 9, 14, 12, 10, 13, 0, 0, 4, Field.SECTION, 14, 11, Field.NUMCHARS, Field.SECTION, 29, 10, 24, 14, 29, 11, 10, 11, 48, 25, 6, 11, 10, 0, Field.SECTION, 14, 11, 48, 12, 3, 6, 12, 4, Field.FORMCHECKBOX, Field.MERGESEQ, Field.TOA, 10, Field.SECTIONPAGES, Field.FILESIZE, Field.FORMCHECKBOX, Field.SECTION, Field.FORMTEXT, Field.MERGESEQ, Field.MERGESEQ, Field.AUTOTEXT, 10, Field.FILESIZE, 64, Field.CONTROL, 10, 86, Field.SECTION, Field.FORMDROPDOWN, Field.FILESIZE, 86, 64, Field.SECTION, 64, 123, 82, 77, 64, Field.SECTION, Field.MERGESEQ, 10, Field.FILESIZE, 64, 123, 77, Field.TOA, Field.ADVANCE, 86, Field.SECTION, Field.CONTROL, Field.CONTROL, 77, Field.MERGESEQ, 74, 64, 76, 78, 13, Field.FILESIZE, Field.SECTIONPAGES, 64, Field.FORMTEXT, Field.SECTION, 76, 76, Field.NOTEREF, 13, Field.SECTIONPAGES, Field.FORMCHECKBOX, 80, 13, Field.ADDIN, Field.FORMTEXT, Field.ADVANCE, Field.SECTIONPAGES, Field.ADDIN, Field.FORMCHECKBOX, Field.FORMTEXT, Field.FORMCHECKBOX, 124, Field.DOCPROPERTY, 74, Field.FORMCHECKBOX, Field.FORMTEXT, 76, 13, 64, Field.AUTOTEXT, 76, 80, Field.FORMTEXT, Field.FORMCHECKBOX, 56, Field.AUTONUMOUT, Field.AUTONUM, 117, 61, 58, 56, Field.USERADDRESS, Field.SYMBOL, Field.AUTONUMOUT, Field.AUTONUMOUT, 48, 117, 58, Field.BARCODE, Field.DATA, 117, 41, Field.USERADDRESS, 44, 58, 41, Field.BARCODE, Field.USERADDRESS, Field.BARCODE, 4, Field.DDE, Field.GOTOBUTTON, Field.BARCODE, Field.USERADDRESS, Field.AUTONUMOUT, 117, 56, Field.AUTONUMOUT, Field.AUTONUM, 43, Field.IMPORT, Field.USERADDRESS, Field.GLOSSARY, Field.USERADDRESS, Field.BARCODE, Field.AUTONUMLGL, Field.SYMBOL, 59, 120, 48, Field.IMPORT, Field.AUTONUMLGL, Field.MACROBUTTON, Field.AUTONUMOUT, Field.SYMBOL, Field.SYMBOL, 61, 120, Field.IMPORT, Field.GOTOBUTTON, Field.PAGEREF, 120, 36, Field.MACROBUTTON, 33, Field.IMPORT, 36, Field.GOTOBUTTON, Field.MACROBUTTON, Field.GOTOBUTTON, 9, 32, Field.BARCODE, Field.GOTOBUTTON, Field.MACROBUTTON, Field.SYMBOL, 120, Field.AUTONUMLGL, Field.SYMBOL, 59, Field.ASK, 58, Field.MACROBUTTON, 34, Field.MACROBUTTON, Field.GOTOBUTTON, 120, 33, Field.BARCODE, 34, Field.USERADDRESS, Field.SYMBOL, Field.QUOTE, 34, 120, 36, Field.MACROBUTTON, 33, Field.IMPORT, 36, Field.GOTOBUTTON, 16, Field.NUMCHARS, 30, Field.ADDRESSBLOCK, 21, 18, 16, 22, 17, Field.NUMCHARS, Field.NUMCHARS, 24, Field.ADDRESSBLOCK, 18, 23, 0, Field.ADDRESSBLOCK, 1, 22, 4, 18, 1, 23, 22, 23, 44, 5, 26, 23, 22, Field.NUMCHARS, Field.ADDRESSBLOCK, 22, 29, 23, 44, 18, 16, 7, 26, 5, 26, 7, 10, Field.AUTONUM, 58, 56, 123, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUM, 48, Field.IMPORT, 58, 58, Field.USERADDRESS, 123, Field.AUTONUMOUT, Field.EQ, Field.ASK, 123, Field.FILLIN, 48, 34, Field.AUTONUMOUT, Field.FILLIN, Field.EQ, 48, Field.EQ, 10, Field.QUOTE, 60, Field.EQ, 48, 58, 123, 48, Field.FILLIN, Field.FILLIN, 58, Field.FILLIN, 5, 9, 11, Field.NOTEREF, 0, 7, 5, 3, 4, 9, 9, 13, Field.NOTEREF, 7, 2, 21, Field.NOTEREF, 20, 3, 17, 7, 20, 2, 3, 2, Field.SYMBOL, 16, 15, 2, 3, 9, Field.NOTEREF, 21, 3, 20, 16, 3, 20, Field.SYMBOL, 20, 3, 17, 7, 20, 2, Field.SYMBOL, 0, 7, 15, 10, 3, 2, 64, 76, 78, 13, Field.FILESIZE, Field.SECTIONPAGES, 64, Field.FORMTEXT, Field.SECTION, 76, 76, Field.NOTEREF, 13, Field.SECTIONPAGES, Field.FORMCHECKBOX, 80, 13, Field.ADDIN, Field.FORMTEXT, Field.ADVANCE, Field.SECTIONPAGES, Field.ADDIN, Field.FORMCHECKBOX, Field.FORMTEXT, Field.FORMCHECKBOX, 124, Field.DOCPROPERTY, 74, Field.FORMCHECKBOX, Field.FORMTEXT, 76, 13, 80, Field.FORMTEXT, Field.ADDIN, Field.DOCPROPERTY, Field.FORMTEXT, Field.ADDIN, 124, Field.ADDIN, Field.FORMTEXT, Field.ADVANCE, Field.SECTIONPAGES, Field.ADDIN, Field.FORMCHECKBOX, 124, 80, 86, 64, 64, Field.FORMTEXT, 80, 80};
    }

    static {
        A01();
    }

    EnumC1087Qv(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04(String str) {
        return this.A00 + A00(0, 1, 58) + str;
    }
}

}
