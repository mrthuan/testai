package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.3d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05123d {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{120, 122, 109, 112, 111, 112, 109, 96, Field.FORMTEXT, 118, 123, 115, 124, 122, 109, Field.FORMTEXT, 112, 125, 64, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.NOTEREF, Field.CONTROL, Field.NOTEREF, Field.DOCPROPERTY, Field.HYPERLINK, 126, Field.CONTROL, Field.NOTEREF, Field.INCLUDETEXT, 86, 126, Field.DOCPROPERTY, Field.HYPERLINK, Field.ADDIN, Field.INCLUDETEXT, 112, 117, 78, 125, 120, 98, 101, 116, Byte.MAX_VALUE, 116, 99, 78, 98, 116, 101, Field.MERGESEQ, Field.TOA, Field.INCLUDETEXT, Field.INCLUDETEXT, 119, Field.SECTION, Field.AUTOTEXT, Field.FORMTEXT, Field.FORMCHECKBOX, Field.LISTNUM, 77, 76, Field.ADDIN, Field.LISTNUM, Field.FORMDROPDOWN, Field.HTMLCONTROL, Field.BIDIOUTLINE, Field.CONTROL, 86, 109, Field.FORMDROPDOWN, 86, 109, Field.HTMLCONTROL, Field.BIDIOUTLINE, 86, Field.CONTROL, 74, Field.MERGESEQ, 64, Field.TOA, Field.SECTION, Field.FORMTEXT, 77, 76, 119, Field.HYPERLINK, Field.TOA, Field.LISTNUM, Field.TOA, Field.FILESIZE, Field.HTMLCONTROL, 119, Field.SECTIONPAGES, Field.HTMLCONTROL, Field.FORMCHECKBOX, Field.FORMTEXT, 43, 60, 60, 33, 60, 17, Field.DDE, 33, 42, 43, 25, 14, 14, 19, 14, Field.QUOTE, 17, 25, 15, 15, 29, Field.NUMWORDS, 25, 118, 107, 112, 118, 99, 103, 122, 124, 125, 23, 30, 12, 32, 29, 22, Field.NUMWORDS, 108, 101, 119, Field.HTMLCONTROL, 103, 107, 106, 112, 118, 107, 104, 104, 97, 118, 124, 117, 103, Field.MERGESEQ, 120, 125, 103, 96, 113, 122, 113, 102, 48, Field.SYMBOL, 43, 7, Field.GLOSSARY, 61, 58, Field.DDEAUTO, Field.EQ, 61, Field.GLOSSARY, 31, 23, 20, 41, 18, 31, 5, 23, 20, 26, 19, 18, 41, 20, 15, 41, 17, 29, Field.BIDIOUTLINE, Field.ADDIN, 98, 120, Field.ADVANCE, 98, 101, 125, 106, 103, 98, 111, 106, Byte.MAX_VALUE, 110, 111, 34, 56, 20, Field.FILLIN, Field.DDEAUTO, Field.DDE, Field.BARCODE, 20, Field.BARCODE, 36, 59, 20, Field.QUOTE, 42, Field.FILLIN, Field.DDE, 18, 8, 36, 11, 14, 25, 23, 18, 24, 108, 118, Field.LISTNUM, 118, 117, 105, 108, 113, Field.LISTNUM, 118, 102, 119, 96, 96, 107, Field.LISTNUM, 99, 105, 100, 98, Field.LISTNUM, 100, 97, 97, 96, 97, 9, 19, Field.BARCODE, 19, 21, 16, 16, 15, 18, 20, 5, 4, Field.BARCODE, 9, 14, Field.BARCODE, 1, 16, 16, Field.ASK, Field.PAGEREF, 43, Field.DDEAUTO, 21, Field.USERADDRESS, Field.QUOTE, Field.FILLIN, Field.GLOSSARY, 21, Field.FILLIN, Field.SYMBOL, 61, Field.USERADDRESS, 48, Field.AUTONUMLGL, 56, Field.BARCODE, Field.AUTONUM, 14, 48, Field.AUTONUMLGL, 48, 33, Field.PAGEREF, Field.AUTONUMOUT, Field.QUOTE, 43, Field.FILLIN, Field.DATA, Field.GLOSSARY, 32, Field.QUOTE, Field.AUTONUMLGL, Field.GOTOBUTTON, 25, 43, Field.EQ, 25, Field.AUTONUMLGL, Field.MACROBUTTON, Field.AUTONUM, Field.AUTONUM, 41, Field.AUTONUMOUT, Field.GOTOBUTTON, 60, Field.AUTONUMOUT, Field.AUTONUMLGL, 56, 48, Field.PAGEREF, 56, Field.USERADDRESS, Field.BARCODE, 14, Field.USERADDRESS, Field.FILLIN, Field.AUTONUMOUT, Field.QUOTE, 61, 48, Field.DATA, 14, 34, Field.AUTONUMOUT, Field.PAGEREF, Field.AUTOTEXTLIST, Field.ADDIN, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.DOCPROPERTY, Field.FORMDROPDOWN, Field.ADDIN, Field.ASK, 36, Field.GLOSSARY, Field.DDEAUTO, 12, 22, Field.USERADDRESS, 14, 18, Field.USERADDRESS, 18, 20, 17, 17, 14, 19, 21, Field.AUTONUMLGL, 41, 36, Field.ASK, 32, Field.DATA, 32, 43, Field.EQ, 26, 44, 33, 86, 74, Field.FORMCHECKBOX, Field.FILESIZE, Field.INCLUDEPICTURE, Field.MERGESEQ, Field.INCLUDEPICTURE, Field.NOTEREF, 82, 121, 82, Field.SHAPE, 86, Field.INCLUDEPICTURE, 33, Field.QUOTE, Field.USERADDRESS, Field.FILLIN, 56, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.QUOTE, 15, 24, Field.NUMCHARS, 14, 18, 19, 26, 13, 25, 29, 13, Field.NUMWORDS, Field.NUMCHARS, Field.IMPORT, 1, 12, 23, 12, 11, 19, 59, 22, 1, 23, 17, 8, 16, Field.FORMCHECKBOX, Field.SHAPE, Field.ADDRESSBLOCK, Field.INCLUDETEXT, 107, Field.FORMTEXT, Field.ADDIN, Field.DOCPROPERTY, Field.FORMCHECKBOX, Field.HTMLCONTROL, Field.LISTNUM, 8, 11, 36, 8, 24, 36, 22, 12, 36, 20, 8, 36, 8, 14, 11, 11, 20, 9, 15, Field.NUMCHARS, 17, 24, 13, Field.USERADDRESS, Field.INCLUDEPICTURE, Field.BIDIOUTLINE, 80, Field.SECTIONPAGES, 106, Field.SECTION, 76, Field.FILESIZE, 80, 103, 120, 116, 102, 112, 115, 125, 116, 78, 99, 112, 101, 120, 126, 15, 16, 10, 16, Field.NUMWORDS, 16, 21, 16, 13, 0, Field.LISTNUM, Field.INCLUDEPICTURE, Field.INCLUDETEXT, 114, Field.MERGESEQ, 76, Field.SECTION, Field.GREETINGLINE, Field.NOTEREF, 114, Field.SHAPE, Field.NOTEREF, 76, Field.GREETINGLINE, Field.SECTIONPAGES, Field.INCLUDEPICTURE};
    }
}
