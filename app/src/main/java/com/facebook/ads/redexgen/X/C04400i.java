package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.0i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04400i {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{44, 23, 24, Field.NUMWORDS, 21, Field.NUMCHARS, Field.AUTOTEXTLIST, 13, 22, Field.AUTOTEXTLIST, 9, 24, 11, 10, Field.NUMCHARS, Field.AUTOTEXTLIST, 19, 10, 22, 23, Field.AUTOTEXTLIST, 29, 24, 13, 24, Field.AUTOTEXTLIST, 16, 23, Field.AUTOTEXTLIST, 56, 29, 56, 26, 13, 16, 22, 23, Field.BARCODE, 24, 26, 13, 22, 11, 0, Field.CONTROL, 114, 119, 98, 119, Field.MACROBUTTON, Field.GOTOBUTTON, Field.GLOSSARY, Field.AUTONUMLGL, Field.DATA, Field.SYMBOL, 126, 97, 116, Byte.MAX_VALUE, 78, 125, 120, Byte.MAX_VALUE, 122, Field.EQ, 32, Field.MACROBUTTON, Field.GOTOBUTTON, Field.DATA, Field.GLOSSARY, Field.ASK, Field.USERADDRESS, Field.GLOSSARY, 61, 61, 58, Field.ASK, 60, 33, 59, 41, Field.ASK, 42, Field.DDE, Field.AUTONUM, 43, 60, Field.HYPERLINK, Field.SHAPE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, 78, 116, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.FORMCHECKBOX, 116, Field.BIDIOUTLINE, 78, Field.TOA, 116, 77, 74, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.TOA, 74, Field.NOTEREF, 64, Field.GOTOBUTTON, Field.AUTONUMOUT, Field.MACROBUTTON, Field.QUOTE, 76, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.SHAPE, Field.DOCPROPERTY, 101, Field.AUTOTEXT, Field.NOTEREF, 86};
    }

    static {
        A03();
        A01 = C04400i.class.getSimpleName();
    }

    public static AbstractC04390h A00(C1314Zs c1314Zs, J7 j72, String str, Uri uri, Map<String, String> extraData, C1T c1t) {
        return A01(c1314Zs, j72, str, uri, extraData, true, false, c1t);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.AbstractC04390h A01(com.facebook.ads.redexgen.X.C1314Zs r15, com.facebook.ads.redexgen.X.J7 r16, java.lang.String r17, android.net.Uri r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, boolean r21, com.facebook.ads.redexgen.X.C1T r22) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04400i.A01(com.facebook.ads.redexgen.X.Zs, com.facebook.ads.redexgen.X.J7, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean, com.facebook.ads.redexgen.X.1T):com.facebook.ads.redexgen.X.0h");
    }

    public static boolean A04(String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
