package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public abstract class L5 {
    public static byte[] A00;
    public static String[] A01 = {"h7TbtU4Y3aavuK2RNDrR490o97xA3UQR", "nWlFT6gMh83RN55hOK2s7jkd0", "m7AJmaDY7", "gyeYb9LWXFqsSrKIVSRt0Co29LGYuhaR", "EW8hQNBuni4zfziLp651zBZrhIaSPPe", "twQOenmklhEl", "GklYvNYuNnGVP8xhiRThcatIgfshVE", "s31M0lMjYrtgq4OJcDKBiGgiocxpngd"};

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{12, Byte.MAX_VALUE, Field.FILESIZE, 9, Field.GREETINGLINE, 101, 9, 126, 121, Byte.MAX_VALUE, Field.FILESIZE, 9, Field.GREETINGLINE, 101, 9, 126, 20, 9, 29, 15, 10, 9, 121, 14, 13, Field.NUMWORDS, 112, Field.SECTION, 82, Field.FORMDROPDOWN, Field.TOA, 78, Field.FORMCHECKBOX, 0, Field.DOCPROPERTY, 82, 76, 0, 5, Field.FORMDROPDOWN, 0, Field.INCLUDEPICTURE, Field.SECTION, Field.DOCPROPERTY, Field.FORMDROPDOWN, Field.FILESIZE, Field.INCLUDETEXT, 0, Field.FILESIZE, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.FILESIZE, 80, Field.ADVANCE, Field.TOA, Field.AUTOTEXT, 78, 26, 0, 5, Field.FORMDROPDOWN, 14, Field.IMPORT, Field.NOTEREF, Field.INCLUDEPICTURE, Field.ADVANCE, Field.INCLUDEPICTURE, 2, Field.CONTROL, 80, Field.MERGESEQ, 2, 0, 7, Field.ADDIN, 0, 2, 76, 77, 86, 2, Field.FORMCHECKBOX, Field.FORMDROPDOWN, Field.CONTROL, Field.INCLUDEPICTURE, 78, 2, 86, 77, 2, Field.INCLUDEPICTURE, 76, Field.FORMTEXT, 80, 77, Field.MERGESEQ, Field.FORMTEXT, 2, Field.CONTROL, 80, Field.MERGESEQ, 2, 0, 7, Field.ADDIN, 0, 12, 2, 102, Field.FORMCHECKBOX, 64, Field.CONTROL, Field.FILESIZE, 2, Field.MERGESEQ, 76, Field.INCLUDETEXT, 77, 24, 2, 7, Field.ADDIN, 12, 2, 109, 80, Field.MERGESEQ, Field.FILESIZE, Field.MERGESEQ, 76, Field.INCLUDEPICTURE, 78, 2, Field.CONTROL, 80, Field.MERGESEQ, 24, 2, 7, Field.ADDIN, 116, Byte.MAX_VALUE, 104, Byte.MAX_VALUE, Field.MERGESEQ, 108, 119, Field.USERADDRESS, Byte.MAX_VALUE, 107, 106, 118, 113, 108, 119, 106, 103, 36, Field.USERADDRESS, 60, 59, 109, 60, 48, Field.USERADDRESS, Byte.MAX_VALUE, 112, 122, 108, 113, 119, 122, Field.MERGESEQ, 108, 119, Field.USERADDRESS, Byte.MAX_VALUE, 107, 106, 118, 113, 108, 119, 106, 103, 36, Field.USERADDRESS, 60, 59, 109, 60, 48, Field.MACROBUTTON, 56, Field.GLOSSARY, 56, 12, 43, 48, 121, Field.AUTONUM, 41, 56, Field.DATA, 44, 60, 121, 41, 56, 43, Field.DDE, 99, 121, 123, 124, 42, 123, 119, 121, 56, Field.IMPORT, 61, 43, Field.AUTONUM, 48, 61, 12, 43, 48, 121, Field.AUTONUM, 41, 56, Field.DATA, 44, 60, 121, 41, 56, 43, Field.DDE, 99, 121, 123, 124, 42, 123, 119, Field.QUOTE, Field.DATA, Field.BARCODE, Field.DATA, Field.NUMCHARS, 59, 32, 105, Field.SYMBOL, Field.DATA, 61, 33, 115, 105, 107, 108, 58, 107, 103, 105, Field.DATA, Field.FILLIN, Field.DDE, 59, Field.ASK, 32, Field.DDE, Field.NUMCHARS, 59, 32, 105, Field.SYMBOL, Field.DATA, 61, 33, 115, 105, 107, 108, 58, 107, 103, 5, 14, 25, 14, 58, 29, 6, Field.AUTOTEXT, Field.NUMCHARS, 12, 7, 10, 2, 10, Field.DOCPROPERTY, Field.AUTOTEXT, 77, 74, Field.NUMCHARS, 77, Field.SECTION, Field.AUTOTEXT, 14, 1, 11, 29, 0, 6, 11, 58, 29, 6, Field.AUTOTEXT, Field.NUMCHARS, 12, 7, 10, 2, 10, Field.DOCPROPERTY, Field.AUTOTEXT, 77, 74, Field.NUMCHARS, 77, Field.SECTION};
    }

    static {
        A09();
    }

    public static Uri A00(String str) {
        Uri parse = Uri.parse(str);
        C1313Zr A002 = AbstractC06137i.A00();
        if (A002 != null && !C0877Im.A2k(A002)) {
            return parse;
        }
        if (!A0D(parse)) {
            Uri androidUri = A01(str);
            return androidUri;
        }
        A0A(str, parse);
        return parse;
    }

    public static Uri A01(String str) {
        try {
            URI uri = new URI(str);
            if (uri.isOpaque()) {
                Uri androidUri = A03(uri);
                A0B(str, uri, androidUri);
                return androidUri;
            }
            Uri androidUri2 = A02(uri);
            A0C(str, uri, androidUri2, false);
            return androidUri2;
        } catch (URISyntaxException e10) {
            throw A04(str, e10);
        }
    }

    public static Uri A02(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static Uri A03(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static SecurityException A04(String str, URISyntaxException uRISyntaxException) {
        return new SecurityException(String.format(Locale.US, A05(26, 36, 89), str, uRISyntaxException.getMessage()));
    }

    public static URI A06(Uri uri) {
        try {
            URI javaUri = new URI(uri.toString());
            if (A0F(javaUri, uri)) {
                return javaUri;
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static URI A07(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e10) {
            URI A06 = A06(uri);
            if (A06 != null) {
                return A06;
            }
            throw A04(str, e10);
        }
    }

    public static URI A08(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (URISyntaxException e10) {
            throw A04(str, e10);
        }
    }

    public static void A0A(String str, Uri uri) throws SecurityException {
        if (uri.isOpaque()) {
            URI A08 = A08(str, uri);
            if (A01[6].length() != 30) {
                throw new RuntimeException();
            }
            A01[2] = "XZATJK5ui";
            A0B(str, A08, uri);
            return;
        }
        URI A07 = A07(str, uri);
        A0C(str, A07, uri, A0F(A07, uri));
    }

    public static void A0B(String str, URI uri, Uri uri2) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (A0E && A0E2) {
            return;
        }
        String A05 = A05(0, 0, 3);
        if (!A0E) {
            A05 = A05 + String.format(Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!A0E2) {
            A05 = A05 + String.format(Locale.US, A05(192, 56, 32), uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        }
        Locale locale = Locale.US;
        String debugInfo = uri.toString();
        throw new SecurityException(String.format(locale, A05(63, 77, 91), debugInfo, uri2.toString(), A05, str));
    }

    public static void A0C(String str, URI uri, Uri uri2, boolean z10) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getAuthority(), uri2.getAuthority());
        boolean A0E3 = A0E(uri.getPath(), uri2.getPath());
        String A05 = A05(0, 0, 3);
        if (!A0E) {
            A05 = A05 + String.format(Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!z10 && !A0E2) {
            A05 = A05 + String.format(Locale.US, A05(ShapeTypes.FLOW_CHART_PREPARATION, 52, 103), uri.getAuthority(), uri2.getAuthority());
        }
        if (!A0E3) {
            A05 = A05 + String.format(Locale.US, A05(248, 42, 48), uri.getPath(), uri2.getPath());
        }
        if (A0E && A0E2 && A0E3) {
            return;
        }
        throw new SecurityException(String.format(Locale.US, A05(63, 77, 91), uri.toString(), uri2.toString(), A05, str));
    }

    public static boolean A0D(Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches(A05(0, 26, 93));
    }

    public static boolean A0E(String str, String str2) {
        String A05 = A05(0, 0, 3);
        if (str == null || str.equals(A05)) {
            return str2 == null || str2.equals(A05);
        }
        return str.equals(str2);
    }

    public static boolean A0F(URI uri, Uri uri2) {
        String host = uri2.getHost();
        String androidHost = uri.getHost();
        if (androidHost == null && host != null) {
            String androidHost2 = A05(62, 1, 17);
            if (host.contains(androidHost2)) {
                return true;
            }
        }
        return false;
    }
}
