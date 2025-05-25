package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class GN {
    public static byte[] A02;
    public static String[] A03 = {"dzuBgE9s0LFJQmHWqmsbDjHZoDONF0gP", "J6iOrW1", "90R0Iw1LOyQi3zvTIzvnIWu931qBE2zm", "4GptalUYKF4Tciga7NCIJ92BgFvhnZhd", "G6plhQrIB9CQIGPBrjH5j9IMBbkUgwP1", "Y7lPZ", "v9PXbz", "A"};
    public static final Pattern A04;
    public final I4 A00 = new I4();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{30, Field.BARCODE, 20, Field.GREETINGLINE, Field.GREETINGLINE, 7, 17, 1, 78, 112, 2, Field.FILESIZE, Field.SECTIONPAGES, 111, 118, 112, 122, 124, 36, 59, Field.EQ, Field.SECTIONPAGES, Field.FORMCHECKBOX, 59, Field.INCLUDETEXT, Field.MACROBUTTON, 48, 59, Field.FILESIZE, Field.INCLUDETEXT, Field.SHAPE, Field.BIDIOUTLINE, Field.GREETINGLINE, 86, Field.LISTNUM, Field.AUTOTEXT, 82, Field.NOTEREF, Field.FORMDROPDOWN, Field.AUTOTEXTLIST, 16, Field.GREETINGLINE, 82, Field.ADDIN, 82, Field.AUTOTEXT, 5, 8, 11, 3, Field.PAGEREF, 41, 42, 41, Field.AUTONUMOUT, Field.AUTONUMOUT, 61, 60, Field.ASK, Byte.MAX_VALUE, Field.AUTONUMOUT, Field.MACROBUTTON, Field.BARCODE, 59, Field.USERADDRESS, 43, 41, 32, 33, 59, 98, 60, 59, Field.AUTONUM, Field.QUOTE, 42, 4, 13, 12, 22, Field.AUTOTEXT, 21, 7, 11, 5, 10, 22, Field.DOCPROPERTY, Field.NOTEREF, Field.ADDRESSBLOCK, 80, Field.DOCPROPERTY, Field.SHAPE, 99, 114, 111, 99, 58, 115, 114, 116, 120, 101, 118, 99, 126, 120, 121, Field.BIDIOUTLINE, Field.FORMCHECKBOX, 77, 76, Field.HTMLCONTROL, Field.FILESIZE, 64, Field.FORMCHECKBOX, 76, Field.AUTONUMLGL, 125};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 83));
    }

    public static char A00(I4 i42, int i10) {
        return (char) i42.A00[i10];
    }

    public static String A02(I4 i42) {
        int limit = i42.A06();
        int A07 = i42.A07();
        char c = 0;
        while (limit < A07 && c == 0) {
            int i10 = limit + 1;
            int position = i42.A00[limit];
            int limit2 = (char) position;
            c = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i10;
        }
        int position2 = i42.A06();
        return i42.A0S((limit - 1) - position2).trim();
    }

    public static String A03(I4 i42, StringBuilder sb2) {
        sb2.setLength(0);
        int A06 = i42.A06();
        int A07 = i42.A07();
        boolean z10 = false;
        while (A06 < A07 && !z10) {
            int position = i42.A00[A06];
            char c = (char) position;
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                A06++;
                sb2.append(c);
            } else {
                z10 = true;
            }
        }
        int position2 = i42.A06();
        i42.A0Z(A06 - position2);
        return sb2.toString();
    }

    public static String A04(I4 i42, StringBuilder sb2) {
        A0A(i42);
        if (i42.A04() == 0) {
            if (A03[1].length() != 5) {
                A03[1] = "";
                return null;
            }
            throw new RuntimeException();
        }
        String A032 = A03(i42, sb2);
        String A01 = A01(0, 0, 30);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) i42.A0E());
        return identifier;
    }

    public static String A05(I4 i42, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int A06 = i42.A06();
            String token = A04(i42, sb2);
            if (token == null) {
                return null;
            }
            if (A01(118, 1, 74).equals(token) || A01(8, 1, 63).equals(token)) {
                i42.A0Y(A06);
                z10 = true;
            } else {
                sb3.append(token);
            }
        }
        return sb3.toString();
    }

    public static String A06(I4 i42, StringBuilder sb2) {
        A0A(i42);
        if (i42.A04() < 5) {
            return null;
        }
        String A0S = i42.A0S(5);
        String cueSelector = A01(3, 5, 46);
        if (cueSelector.equals(A0S)) {
            int A06 = i42.A06();
            String token = A04(i42, sb2);
            if (token == null) {
                return null;
            }
            String cueSelector2 = A01(117, 1, 4);
            if (cueSelector2.equals(token)) {
                i42.A0Y(A06);
                String cueSelector3 = A01(0, 0, 30);
                return cueSelector3;
            }
            String target = null;
            String cueSelector4 = A01(0, 1, 124);
            if (cueSelector4.equals(token)) {
                target = A02(i42);
            }
            String token2 = A04(i42, sb2);
            String cueSelector5 = A01(1, 1, 92);
            if (!cueSelector5.equals(token2) || token2 == null) {
                return null;
            }
            return target;
        }
        return null;
    }

    private void A08(GR gr, String str) {
        if (A01(0, 0, 30).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = A04.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                gr.A0K(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] A0l = IK.A0l(str, A01(9, 2, 102));
        String str2 = A0l[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            gr.A0J(str2.substring(0, indexOf2));
            int voiceStartIndex = indexOf2 + 1;
            gr.A0I(str2.substring(voiceStartIndex));
        } else {
            gr.A0J(str2);
        }
        int voiceStartIndex2 = A0l.length;
        if (voiceStartIndex2 > 1) {
            int voiceStartIndex3 = A0l.length;
            gr.A0L((String[]) Arrays.copyOfRange(A0l, 1, voiceStartIndex3));
        }
    }

    public static void A09(I4 i42) {
        String line;
        do {
            line = i42.A0P();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(I4 i42) {
        boolean skipping = true;
        while (i42.A04() > 0 && skipping) {
            boolean skipping2 = A0D(i42);
            if (!skipping2) {
                boolean skipping3 = A0C(i42);
                if (!skipping3) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0B(I4 i42, GR gr, StringBuilder sb2) {
        A0A(i42);
        String A032 = A03(i42, sb2);
        String A01 = A01(0, 0, 30);
        if (A01.equals(A032)) {
            return;
        }
        String A012 = A01(2, 1, 100);
        String property = A04(i42, sb2);
        if (!A012.equals(property)) {
            return;
        }
        A0A(i42);
        String token = A05(i42, sb2);
        if (token == null || A01.equals(token)) {
            return;
        }
        int A06 = i42.A06();
        String A042 = A04(i42, sb2);
        String property2 = A01(8, 1, 63);
        if (!property2.equals(A042)) {
            String property3 = A01(118, 1, 74);
            if (property3.equals(A042)) {
                i42.A0Y(A06);
            } else {
                return;
            }
        }
        String property4 = A01(50, 5, 12);
        if (property4.equals(A032)) {
            gr.A0C(AbstractC0849Hk.A02(token));
            return;
        }
        String property5 = A01(30, 16, 119);
        if (property5.equals(A032)) {
            gr.A0B(AbstractC0849Hk.A02(token));
            return;
        }
        String property6 = A01(93, 15, 93);
        if (property6.equals(A032)) {
            String property7 = A01(108, 9, 99);
            if (!property7.equals(token)) {
                return;
            }
            gr.A0G(true);
            return;
        }
        String property8 = A01(55, 11, 24);
        if (property8.equals(A032)) {
            gr.A0D(token);
            return;
        }
        String property9 = A01(76, 11, 40);
        if (property9.equals(A032)) {
            String property10 = A01(46, 4, 45);
            if (!property10.equals(token)) {
                return;
            }
            gr.A0E(true);
            return;
        }
        String property11 = A01(66, 10, 5);
        if (!property11.equals(A032)) {
            return;
        }
        String property12 = A01(87, 6, 118);
        if (!property12.equals(token)) {
            return;
        }
        gr.A0F(true);
    }

    public static boolean A0C(I4 i42) {
        int A06 = i42.A06();
        int position = i42.A07();
        byte[] bArr = i42.A00;
        if (A06 + 2 > position) {
            return false;
        }
        int limit = A06 + 1;
        if (bArr[A06] != 47) {
            return false;
        }
        int i10 = limit + 1;
        if (bArr[limit] != 42) {
            return false;
        }
        while (true) {
            int i11 = i10 + 1;
            if (A03[1].length() == 5) {
                throw new RuntimeException();
            }
            A03[3] = "qxUn1ZvzITFnnAGK8xWAc6HMiAJqKZWm";
            if (i11 < position) {
                int limit2 = i10 + 1;
                char skippedChar = (char) bArr[i10];
                if (skippedChar == '*') {
                    char skippedChar2 = (char) bArr[limit2];
                    if (skippedChar2 == '/') {
                        position = limit2 + 1;
                        i10 = position;
                    }
                }
                i10 = limit2;
            } else {
                int position2 = position - i42.A06();
                if (A03[0].charAt(24) != 83) {
                    A03[1] = "Yz7L54LolwLHSdc7Qqu";
                    i42.A0Z(position2);
                    return true;
                }
                throw new RuntimeException();
            }
        }
    }

    public static boolean A0D(I4 i42) {
        switch (A00(i42, i42.A06())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                i42.A0Z(1);
                return true;
            default:
                return false;
        }
    }

    public final GR A0E(I4 i42) {
        String A01;
        this.A01.setLength(0);
        int A06 = i42.A06();
        A09(i42);
        I4 i43 = this.A00;
        byte[] bArr = i42.A00;
        int initialInputPosition = i42.A06();
        i43.A0b(bArr, initialInputPosition);
        this.A00.A0Y(A06);
        String A062 = A06(this.A00, this.A01);
        if (A062 != null) {
            if (A01(117, 1, 4).equals(A04(this.A00, this.A01))) {
                GR gr = new GR();
                A08(gr, A062);
                String str = null;
                boolean z10 = false;
                while (true) {
                    A01 = A01(118, 1, 74);
                    if (z10) {
                        break;
                    }
                    int A063 = this.A00.A06();
                    str = A04(this.A00, this.A01);
                    z10 = str == null || A01.equals(str);
                    if (!z10) {
                        this.A00.A0Y(A063);
                        A0B(this.A00, gr, this.A01);
                    }
                }
                if (A01.equals(str)) {
                    return gr;
                }
                return null;
            }
        }
        return null;
    }
}
