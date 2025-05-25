package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class KE {
    public static byte[] A00;
    public static final AtomicReference<String> A01;
    public static final AtomicReference<String> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{31, 34, 59, Field.AUTONUMOUT, Field.USERADDRESS, Field.AUTONUMOUT, 56, Field.USERADDRESS, Field.AUTONUMOUT, Field.SYMBOL, 61, Field.AUTONUMOUT, Field.AUTONUMOUT, 58, Field.AUTONUMOUT, 61, 60, 34, 111, 120, 106, 126, 11, Field.FILESIZE, 64, 74, Field.FORMDROPDOWN, 123, Field.NOTEREF, Field.MERGESEQ, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, 77, 74, Field.INCLUDEPICTURE, 11, 114, 60, Field.SYMBOL, Field.MACROBUTTON, 42, 2, Field.DDEAUTO, 36, Field.MACROBUTTON, Field.USERADDRESS, 111, 44, 109, 102, 119, 116, 108, 113, 104, Field.BIDIOUTLINE, 98, 103, 112, Field.BIDIOUTLINE, 96, 108, 110, 110, 108, 109, Field.PAGEREF, Field.SYMBOL, Field.SYMBOL, 61, Field.USERADDRESS, 119, 98, 98, 42, Field.BARCODE, 44, 61, Field.PAGEREF, 104, Field.USERADDRESS, 99, 43, 44, Field.DDEAUTO, Field.DATA, Field.GLOSSARY, 34, 34, Field.ASK, 99, Field.DDEAUTO, 34, 32, Field.ADDIN, 77, 77, Field.TOA, 74, 3, 22, 22, 78, 78, 78, Field.NUMCHARS, 74, 23, Field.SHAPE, Field.HYPERLINK, Field.LISTNUM, Field.BIDIOUTLINE, Field.HTMLCONTROL, 86, 86, 82, 23, Field.LISTNUM, 86, Field.ADVANCE, 14, 14, 14};
    }

    static {
        A09();
        A01 = new AtomicReference<>();
        A02 = new AtomicReference<>();
    }

    public static String A01(C7j c7j) {
        return A05(c7j) + A00(47, 19, 53);
    }

    public static String A02(C7j c7j) {
        String loggingEndpointPrefix = C0877Im.A0V(c7j);
        StringBuilder append = new StringBuilder().append(A07(c7j, loggingEndpointPrefix));
        String loggingEndpointPrefix2 = A00(22, 14, 18);
        return append.append(loggingEndpointPrefix2).toString();
    }

    public static String A03(C7j c7j) {
        return A05(c7j) + A00(1, 21, 59);
    }

    public static String A04(C7j c7j) {
        String syncEndpointPrefix = C0877Im.A0W(c7j);
        StringBuilder append = new StringBuilder().append(A07(c7j, syncEndpointPrefix));
        String syncEndpointPrefix2 = A00(36, 11, 107);
        return append.append(syncEndpointPrefix2).toString();
    }

    public static String A05(C7j c7j) {
        String str = A01.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String urlOverride = A00(66, 28, 123);
        return A06(c7j, urlOverride);
    }

    public static String A06(C7j c7j, String str) {
        String sb2;
        String A8d = c7j.A04().A8d();
        Locale locale = Locale.US;
        if (TextUtils.isEmpty(A8d)) {
            sb2 = A00(0, 0, 61);
        } else {
            StringBuilder sb3 = new StringBuilder();
            String prefix = A00(0, 1, 7);
            sb2 = sb3.append(prefix).append(A8d).toString();
        }
        String prefix2 = String.format(locale, str, sb2);
        return prefix2;
    }

    public static String A07(C7j c7j, String str) {
        String str2 = A02.get();
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String urlOverride = A00(94, 26, 15);
        return A08(A06(c7j, urlOverride), str);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 79), str2);
    }
}
