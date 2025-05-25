package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.7b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC06077b {
    A08,
    A0B,
    A0G,
    A05,
    A0F,
    A0E,
    A0H,
    A04,
    A0C,
    A06,
    A09,
    A0I,
    A07,
    A0A,
    A0D,
    A03;
    
    public static byte[] A00;
    public static String[] A01 = {"uLbNEHRnnMyyuUlqsIMZHpfsQBJ5TRv2", "skvypruDZiW8BASe24", "rs3R2llKFZwZPVZsKZyGkf2ci7C4s9Pb", "lOPEGaBOukTHor75ISwx4eUskGtuKXTT", "8Yax76Lu2a2dogjn3GzeM1tk0kWHR", "9LerROYgERLC3lU2pQvcy1JolU6pTYA4", "W5HoMz4UVZQaZ2UVOWaoIOdOjYdmd3KA", "VA"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[3] = "z4qR7zhDF91Av9yLGwgiJSRF3kJh9stD";
            copyOfRange[i13] = (byte) (i14 ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.TOA, Field.INCLUDETEXT, Field.INCLUDETEXT, Field.NOTEREF, Field.INCLUDETEXT, Field.FILESIZE, Field.HYPERLINK, Field.SHAPE, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.NOTEREF, Field.SHAPE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.ADVANCE, Field.AUTOTEXTLIST, 78, Field.HYPERLINK, Field.GREETINGLINE, Field.FORMCHECKBOX, Field.SHAPE, 77, 80, Field.MERGESEQ, 77, Field.HYPERLINK, Field.BIDIOUTLINE, Field.SECTION, Field.FORMCHECKBOX, Field.FORMTEXT, Field.CONTROL, Field.HYPERLINK, Field.TOA, Field.LISTNUM, Field.TOA, Field.FILESIZE, 77, Field.BIDIOUTLINE, 77, Field.LISTNUM, 103, 122, 114, 110, 107, 97, 107, 118, 125, 110, 109, 117, 103, 112, 125, 96, 109, 119, 108, 102, Field.NUMCHARS, 1, 9, 21, 16, 26, 16, 13, 6, 12, 9, 9, Field.NUMCHARS, 11, 6, Field.NUMWORDS, 22, 12, 23, 29, 29, 18, 30, 23, 31, 25, 29, 0, Field.NUMCHARS, 25, 19, 25, 4, 15, Field.NUMCHARS, 31, 7, 21, 2, 15, 18, 31, 5, 30, 20, 5, 1, Field.NUMCHARS, 0, 5, 15, 5, 24, 19, 25, Field.NUMCHARS, Field.NUMCHARS, 9, 30, 19, 14, 3, 25, 2, 8, Field.HTMLCONTROL, Field.HYPERLINK, Field.ADVANCE, 86, Field.HTMLCONTROL, Field.NOTEREF, Field.SECTION, 86, Field.FILESIZE, Field.GREETINGLINE, 86, Field.DOCPROPERTY, Field.HTMLCONTROL, 82, 112, 115, 107, 121, 110, 99, 126, 115, 105, 114, 120, 76, Field.CONTROL, Field.MERGESEQ, Field.FORMTEXT, Field.ADDIN, Field.ADVANCE, 74, 80, Field.FORMTEXT, 119, 102, 117, 102, 106, 98, 115, 98, 117, 105, 126, 120, 126, 114, 109, 126, 105, 98, 117, 99, Byte.MAX_VALUE, 101, 98, 115, 117, 111, 102, 113, 98, 121, 113, 114, 124, 117, Field.BARCODE, Field.DATA, Field.SYMBOL, 56, Field.BARCODE, Field.QUOTE, Field.DATA, Field.DDE, Field.DDE, 56, Field.GLOSSARY, 34, Field.BARCODE, Field.GOTOBUTTON, Field.DATA, Field.MACROBUTTON, Field.SYMBOL};
    }

    static {
        A01();
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC06077b[] valuesCustom() {
        EnumC06077b[] valuesCustom = values();
        String[] strArr = A01;
        if (strArr[2].charAt(20) != strArr[0].charAt(20)) {
            A01[7] = "2rcI6";
            return (EnumC06077b[]) valuesCustom.clone();
        }
        throw new RuntimeException();
    }
}
