package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Nn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1001Nn {
    public static byte[] A08;
    public static String[] A09 = {"RCnn6pCzuGmx3q71pxhPkiVufEZFhrue", "mpaFRgKOI8I", "wGcy8NSqCuh8w4Qd8eleXwL5PKL6kLu0", "yBtS5H9nBGCF", "BJontwmfcei8Ydfnpbrw2OUV", "oZ3BMmDZvmusmOT443VgfsBrmXcMhGXT", "1c3rWqDgJYn0reBhn", "avQkykMwqnpIevrWTEzEvMtO"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{104, 99, 97, Field.FORMDROPDOWN, 111, 99, 98, 120, 105, 98, 120, Field.FORMDROPDOWN, 96, 99, 109, 104, 105, 104, Field.FORMDROPDOWN, 97, Byte.MAX_VALUE, 112, 121, 118, 124, 116, 125, 106, Field.FORMCHECKBOX, 108, 113, 117, 125, Field.FORMCHECKBOX, 117, 107, Field.DDEAUTO, 41, Field.DDEAUTO, Field.MACROBUTTON, Field.DDEAUTO, Field.ASK, 43, 24, Field.GOTOBUTTON, Field.AUTONUMLGL, 43, Field.ADDIN, 82, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, 98, Field.HTMLCONTROL, Field.ADVANCE, Field.FORMDROPDOWN, Field.ADVANCE, 78, Field.DOCPROPERTY, 98, 80, 78, Field.AUTOTEXTLIST, Field.LISTNUM, Field.ADVANCE, Field.ADDIN, 106, Field.FORMTEXT, Field.SECTION, Field.ADVANCE, Field.FORMCHECKBOX, Field.SECTION, 106, Field.HYPERLINK, Field.FORMTEXT, 34, Field.AUTONUMLGL, Field.QUOTE, 32, Field.BARCODE, Field.USERADDRESS, Field.QUOTE, Field.AUTONUMLGL, 15, Field.AUTONUMLGL, Field.USERADDRESS, Field.AUTONUMOUT, 15, 61, Field.QUOTE, Field.BIDIOUTLINE, 76, Field.ADDRESSBLOCK, 64, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, 112, Field.ADDRESSBLOCK, 74, 78, Field.MERGESEQ, 86, 112, Field.SECTIONPAGES, Field.BIDIOUTLINE, Field.INCLUDETEXT, 82, Field.INCLUDETEXT, Field.INCLUDETEXT, Field.GREETINGLINE, Field.HYPERLINK, Field.AUTOTEXTLIST, 104, Field.ADDIN, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.INCLUDETEXT, Field.SHAPE, 104, Field.LISTNUM, Field.INCLUDETEXT};
        String[] strArr = A09;
        if (strArr[2].charAt(30) != strArr[0].charAt(30)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[4] = "471Kmxz1Me6vVyXXwzQpeRmH";
        strArr2[7] = "yPKApIkQtN13Op8uOOE76YlC";
    }

    static {
        A01();
    }

    public C1001Nn(String str, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.A07 = str;
        this.A01 = j10;
        this.A03 = j11;
        this.A04 = j12;
        this.A00 = j13;
        this.A05 = j14;
        this.A02 = j15;
        this.A06 = j16;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap(7);
        hashMap.put(A00(36, 11, 25), this.A07);
        hashMap.put(A00(21, 15, 70), String.valueOf(this.A01));
        hashMap.put(A00(61, 13, 107), String.valueOf(this.A03));
        hashMap.put(A00(74, 15, 14), String.valueOf(this.A04));
        hashMap.put(A00(0, 21, 82), String.valueOf(this.A00));
        hashMap.put(A00(89, 15, 113), String.valueOf(this.A05));
        hashMap.put(A00(47, 14, 99), String.valueOf(this.A02));
        hashMap.put(A00(104, 17, 105), String.valueOf(this.A06));
        return hashMap;
    }
}
