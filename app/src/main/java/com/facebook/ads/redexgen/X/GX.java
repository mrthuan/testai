package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.regex.Pattern;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class GX {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{43, 23, 99, Field.GREETINGLINE, 86, Field.INCLUDEPICTURE, Field.FILESIZE, 82, Field.INCLUDEPICTURE, Field.SECTIONPAGES, 6, 113, 99, 100, 112, 114, 114, 8, 6, 97, Field.TOA, 82, 6, 15, 58, Field.DDE, 60, 58, Field.EQ, 43, Field.USERADDRESS, 56, 58, 44, Byte.MAX_VALUE, Field.GOTOBUTTON, 42, 44, 43, Byte.MAX_VALUE, 58, Field.EQ, 59, Byte.MAX_VALUE, Field.DATA, Field.AUTONUM, 43, Field.IMPORT, Byte.MAX_VALUE, 122, Field.QUOTE, Field.ADDIN, Field.PAGEREF, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.GLOSSARY, Field.USERADDRESS, Field.FORMDROPDOWN, Field.FORMDROPDOWN, Field.HTMLCONTROL, 7, 114, 82, Field.DOCPROPERTY, Field.ADDIN, 82, Field.INCLUDETEXT, Field.SHAPE, 97, -48, -124, Byte.MIN_VALUE, 0, 104, 122, 125, 105, 107, 107, 23, 23, 31, Field.INCLUDEPICTURE, Field.AUTONUM, 22, 17, 21, 22, 0, Field.NUMWORDS};
    }

    static {
        A03();
        A01 = Pattern.compile(A02(52, 16, 42));
        A02 = Pattern.compile(A02(68, 22, 110));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 95))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 14));
    }

    public static long A01(String str) throws NumberFormatException {
        long j10 = 0;
        String[] A0m = IK.A0m(str, A02(50, 2, 46));
        for (String str2 : IK.A0l(A0m[0], A02(1, 1, 124))) {
            long value = Long.parseLong(str2);
            j10 = (60 * j10) + value;
        }
        long j11 = j10 * 1000;
        if (A0m.length == 2) {
            long value2 = Long.parseLong(A0m[1]);
            j11 += value2;
        }
        return 1000 * j11;
    }

    public static void A04(I4 i42) throws C0809Fu {
        String A0P = i42.A0P();
        if (A0P != null && A02.matcher(A0P).matches()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String line = A02(2, 21, 119);
        throw new C0809Fu(sb2.append(line).append(A0P).toString());
    }
}
