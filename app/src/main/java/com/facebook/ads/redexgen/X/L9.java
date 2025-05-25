// Auto-fixed: added missing class declaration
public class L9 {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;

/* loaded from: assets/audience_network.dex */
public enum L9 {
    A07(0),
    A0G(1),
    A08(2),
    A0H(3),
    A09(4),
    A06(5),
    A0E(6),
    A0F(7),
    A0K(8),
    A0D(9),
    A0A(10),
    A0I(11),
    A0J(16),
    A0C(17),
    A0B(18);
    
    public static byte[] A01;
    public static String[] A02 = {"GbuBsSM1xhQoS8Y9reObCc9WG4REEdk3", "3inGwPOv", "kEgr1UstPMrvCW01nPyEnw", "sDtxFhHTxnkounG", "sPUJsFRJw3lzzMTWDdjyjiVEH8hW8JO7", "B8rHcVyybdzy0uHTSoedXLBdMJjc3Dyy", "NVuWY3VIAgTMV2CQJlZL2IdcLJ4", "cMObfoRVVv9ZpGW59yOoyGmNv0XOfBEh"};
    public static final L9[] A03;
    public static final String A04;
    public final int A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {Field.HYPERLINK, Field.ADDRESSBLOCK, Field.FORMTEXT, Field.LISTNUM, Field.ADDIN, 86, 80, Field.LISTNUM, Field.BIDIOUTLINE, 74, 122, 107, 107, 100, 122, Byte.MAX_VALUE, 43, 58, 58, Field.AUTONUMLGL, 43, Field.DDEAUTO, Field.AUTONUMLGL, 60, Field.HYPERLINK, 110, Byte.MAX_VALUE, Byte.MAX_VALUE, 112, 106, 97, 104, 110, 104, 106, 98, 106, 97, 123, 112, 110, 107, Field.FORMCHECKBOX, Field.INCLUDETEXT, Field.MERGESEQ, Field.MERGESEQ, 64, Field.CONTROL, Field.LISTNUM, Field.ADDIN, 74, Field.LISTNUM, 76, Field.MERGESEQ, Field.ADDIN, 64, Field.CONTROL, 86, Field.ADDIN, 76, Field.ADDIN, 76, Field.INCLUDETEXT, Field.TOA, Field.AUTONUMOUT, 32, Field.IMPORT, Field.QUOTE, Field.FILLIN, Field.IMPORT, 60, Field.EQ, 43, Field.DDE, Field.EQ, Field.MACROBUTTON, 34, 34, 59, 60, Field.AUTONUMLGL, 43, Field.IMPORT, Field.IMPORT, Field.MACROBUTTON, 60, Field.GLOSSARY, 42, Field.DDE, Field.DATA, 48, 8, 15, 13, 8, 15, 4, 30, 23, 8, 5, 4, 14, 30, 0, 5, Field.ADDRESSBLOCK, Field.INCLUDETEXT, Field.NOTEREF, Field.INCLUDEPICTURE, Field.FILESIZE, Field.GREETINGLINE, 80, 80, 82, Field.FILESIZE, 21, 12, 0, 11, 13, 22, 24, 24, 26, 13, 0, 17, 16, 0, 30, 10, 11, 16, 0, 22, 18, 15, 0, 19, 16, 24, 24, 22, 17, 24, 103, 98, 101, 96, 116, 106, 111, 77, Field.NOTEREF, Field.AUTOTEXT, 74, Field.GREETINGLINE, 64, Field.FILESIZE, Field.GREETINGLINE, Field.CONTROL, Field.MACROBUTTON, 3, 12, 25, 4, Field.NUMWORDS, 8, 18, 14, 1, 2, 30, 8, 18, 15, 24, 25, 25, 2, 3, Field.GLOSSARY, Field.AUTONUMOUT, Field.MACROBUTTON, 60, Field.MACROBUTTON, Field.BARCODE, Field.USERADDRESS, Field.PAGEREF, Field.AUTONUM, Field.AUTONUMLGL, 61, 61, Field.MACROBUTTON, Field.AUTONUMOUT, 61, Field.SYMBOL, Field.ASK, 43, 42, 32, 48, Field.DDEAUTO, 43};
        if (A02[5].charAt(26) != 'j') {
            throw new RuntimeException();
        }
        A02[5] = "gBI5PCJLXGTma8ivl9EUy8DAEVjXdNbR";
        A01 = bArr;
    }

    static {
        L9[] l9Arr;
        A03();
        A03 = new L9[]{A0H, A09, A06, A0F, A0I, A0J, A0C, A0B};
        JSONArray jSONArray = new JSONArray();
        for (L9 supportedCapability : A03) {
            jSONArray.put(supportedCapability.A00());
        }
        A04 = jSONArray.toString();
    }

    L9(int i10) {
        this.A00 = i10;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A04;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}

}
