package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Arrays;
import java.util.HashMap;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public abstract class Io {
    public static byte[] A00;
    public static String[] A01 = {"Z5CDeKIRbdSSRSQIrVuvkRGSoBqaj2vD", "vAYmZT8ASJMB3FzzuSGq4ydCUrxXwpoH", "w5gGutYUngeqRFsCKcvWOvxRavdUOOsS", "yOEODZsyHWLZAvoEgSYJGhZTBHDJn", "rt7Bq94iIT4vcXtoKSYLP1d4W6MwPUTJ", "NG6XHFEJ7LlyPEQHkLbosD3XyF7yGiUv", "J0QPPK8CgABCN6AkZrLHMYAzYl1dWHal", "XBXEBoD0FueyJiRlgHiLQagWcf9HuHXl"};

    public static String A0L(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A00 = new byte[]{80, Field.NUMCHARS, Field.USERADDRESS, Field.EQ, 120, 43, Byte.MAX_VALUE, Field.GLOSSARY, Field.USERADDRESS, Field.DDE, 44, 58, Byte.MAX_VALUE, 44, Field.USERADDRESS, Field.GOTOBUTTON, Field.GLOSSARY, Field.MACROBUTTON, Field.AUTONUM, Field.EQ, 56, 113, Field.AUTONUMOUT, Field.GOTOBUTTON, 23, 18, 18, 31, 2, 31, 25, 24, 23, 26, 41, 18, 19, 20, 3, 17, 41, 26, 25, 17, 17, 31, 24, 17, 41, 20, 26, 23, 21, 29, 41, 26, 31, 5, 2, 10, 15, 15, 2, 31, 2, 4, 5, 10, 7, Field.AUTONUMOUT, 15, 14, 9, 30, 12, Field.AUTONUMOUT, 7, 4, 12, 12, 2, 5, 12, Field.AUTONUMOUT, 9, 7, 10, 8, 0, Field.AUTONUMOUT, 7, 2, 24, 31, Field.AUTONUMOUT, Field.NUMWORDS, 14, 25, 8, 14, 5, 31, 10, 12, 14, Field.FILLIN, 34, 34, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, 41, Field.DATA, Field.FILLIN, 42, 25, 34, Field.QUOTE, 36, Field.MACROBUTTON, 33, 25, 42, 41, 33, 33, Field.GLOSSARY, Field.DATA, 33, 25, Field.AUTONUMLGL, Field.FILLIN, 43, Field.AUTONUM, 42, Field.GLOSSARY, Field.DATA, 33, 25, Field.AUTONUM, Field.QUOTE, Field.AUTONUMOUT, Field.PAGEREF, Field.QUOTE, Field.DATA, Field.GOTOBUTTON, Field.FILLIN, 33, Field.QUOTE, Field.ADVANCE, Field.ADDIN, Field.HTMLCONTROL, Field.SECTIONPAGES, 106, Field.ADVANCE, Field.ADDIN, Field.ADDIN, Field.BIDIOUTLINE, Field.SECTION, Field.BIDIOUTLINE, Field.LISTNUM, Field.HTMLCONTROL, Field.ADVANCE, Field.AUTOTEXTLIST, 106, Field.AUTOTEXTLIST, Field.LISTNUM, 82, 82, Field.BIDIOUTLINE, Field.HTMLCONTROL, 82, 106, Field.FORMCHECKBOX, 80, Field.SECTION, Field.FORMCHECKBOX, 76, 106, Field.AUTOTEXTLIST, Field.BIDIOUTLINE, Field.HYPERLINK, Field.BIDIOUTLINE, Field.SECTION, 12, 9, 3, 26, Field.GOTOBUTTON, 12, 9, 9, 4, 25, 4, 2, 3, 12, 1, Field.GOTOBUTTON, 1, 2, 10, 10, 4, 3, 10, Field.GOTOBUTTON, 24, 30, 8, Field.GOTOBUTTON, 25, 8, 0, 29, Field.GOTOBUTTON, 11, 4, 1, 8, Field.GOTOBUTTON, 11, 2, 31, Field.GOTOBUTTON, 31, 8, 26, 31, 4, 25, 8, 112, 117, Byte.MAX_VALUE, 102, 78, 112, Byte.MAX_VALUE, 117, 99, 126, 120, 117, 78, 112, 125, 102, 112, 104, 98, 78, 125, 126, 118, 78, 114, 126, 99, 116, 78, 119, 100, Byte.MAX_VALUE, Byte.MAX_VALUE, 116, 125, 78, 116, 103, 116, Byte.MAX_VALUE, 101, 98, Field.FORMTEXT, Field.INCLUDEPICTURE, Field.TOA, 80, 120, Field.FORMTEXT, Field.TOA, Field.INCLUDEPICTURE, Field.DOCPROPERTY, Field.NOTEREF, 78, Field.INCLUDEPICTURE, 120, Field.INCLUDETEXT, Field.FORMTEXT, Field.INCLUDETEXT, Field.AUTOTEXT, Field.SECTIONPAGES, 120, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.FILESIZE, 82, 64, 120, Field.SECTIONPAGES, Field.ADDIN, Field.SECTIONPAGES, Field.TOA, Field.FORMDROPDOWN, Field.ADVANCE, 120, Field.ADVANCE, Field.FORMTEXT, 74, Field.CONTROL, Field.MERGESEQ, 78, Field.TOA, 64, 120, Field.DOCPROPERTY, Field.FORMTEXT, Field.FORMDROPDOWN, Field.SECTIONPAGES, 12, 9, 3, 26, Field.GOTOBUTTON, 12, 3, 9, 31, 2, 4, 9, Field.GOTOBUTTON, 9, 4, 30, 29, 12, 25, 14, 5, 8, 31, Field.GOTOBUTTON, 4, 3, 4, 25, 4, 12, 1, Field.GOTOBUTTON, 31, 8, 25, 31, 20, Field.GOTOBUTTON, 9, 8, 1, 12, 20, Field.GOTOBUTTON, 0, 30, Field.FORMDROPDOWN, 86, Field.BIDIOUTLINE, Field.FILESIZE, 109, Field.FORMDROPDOWN, Field.BIDIOUTLINE, 86, 64, Field.ADDRESSBLOCK, Field.HTMLCONTROL, 86, 109, 86, Field.HTMLCONTROL, Field.SECTION, Field.SECTIONPAGES, Field.FORMDROPDOWN, Field.FORMTEXT, Field.ADDIN, Field.LISTNUM, Field.CONTROL, 64, 109, Field.SHAPE, Field.FORMDROPDOWN, 74, 109, 64, Field.CONTROL, Field.FORMTEXT, 64, Field.MERGESEQ, 109, Field.ADDIN, Field.ADDRESSBLOCK, Field.FORMCHECKBOX, Field.BIDIOUTLINE, Field.FORMTEXT, 48, Field.AUTONUMLGL, Field.BARCODE, Field.ASK, 14, 48, Field.BARCODE, Field.AUTONUMLGL, Field.QUOTE, Field.USERADDRESS, 56, Field.AUTONUMLGL, 14, Field.IMPORT, 36, Field.BARCODE, Field.BARCODE, Field.AUTONUMOUT, 61, 14, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.MACROBUTTON, 36, Field.AUTONUM, 14, Field.AUTONUMOUT, Field.FILLIN, Field.AUTONUMOUT, Field.BARCODE, Field.PAGEREF, 34, 14, 34, 48, 60, 33, 61, 56, Field.BARCODE, Field.AUTONUM, 14, Field.QUOTE, 48, Field.PAGEREF, Field.AUTONUMOUT, Field.INCLUDETEXT, Field.SECTION, Field.MERGESEQ, 82, 122, Field.INCLUDETEXT, Field.MERGESEQ, Field.SECTION, Field.CONTROL, 74, 76, Field.SECTION, 122, 76, Field.DOCPROPERTY, Field.FORMTEXT, 122, Field.SECTION, 64, Field.FORMCHECKBOX, 80, Field.SECTIONPAGES, 122, 64, Field.FORMDROPDOWN, 64, Field.MERGESEQ, Field.ADDIN, 86, 122, 86, Field.INCLUDETEXT, Field.NOTEREF, Field.DOCPROPERTY, Field.TOA, 76, Field.MERGESEQ, Field.SECTIONPAGES, 122, Field.CONTROL, Field.INCLUDETEXT, Field.ADDIN, 64, Field.AUTONUM, Field.MACROBUTTON, Field.SYMBOL, 32, 8, Field.AUTONUM, Field.SYMBOL, Field.MACROBUTTON, Field.PAGEREF, 56, Field.USERADDRESS, Field.MACROBUTTON, 8, 59, 56, Field.AUTONUMOUT, Field.AUTONUM, 59, 8, Field.AUTONUMOUT, 56, 34, Field.SYMBOL, Field.QUOTE, Field.GOTOBUTTON, Field.PAGEREF, 36, 8, 36, Field.AUTONUM, 58, Field.FILLIN, 59, Field.USERADDRESS, Field.SYMBOL, 48, 8, Field.PAGEREF, Field.AUTONUM, Field.QUOTE, Field.GOTOBUTTON, 77, Field.NOTEREF, Field.SECTIONPAGES, Field.HTMLCONTROL, 115, 77, Field.SECTIONPAGES, Field.NOTEREF, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.FILESIZE, Field.NOTEREF, 115, Field.SECTIONPAGES, 77, Field.HYPERLINK, Field.FILESIZE, Field.LISTNUM, Field.TOA, 115, Field.LISTNUM, Field.FILESIZE, Field.TOA, Field.HTMLCONTROL, 77, 78, Field.FILESIZE, 64, Field.FILESIZE, Field.HYPERLINK, Field.DOCPROPERTY, 115, Field.INCLUDETEXT, Field.FILESIZE, Field.SHAPE, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.DOCPROPERTY, 115, Field.SHAPE, 77, Field.SECTION, Field.BIDIOUTLINE, 64, Field.FILESIZE, Field.SECTIONPAGES, Field.MERGESEQ, 115, Field.GREETINGLINE, 77, Field.HYPERLINK, Field.TOA, Field.HTMLCONTROL, Field.GREETINGLINE, Field.ADVANCE, 77, 101, Field.HTMLCONTROL, Field.ADVANCE, Field.GREETINGLINE, Field.NOTEREF, Field.DOCPROPERTY, Field.FORMDROPDOWN, Field.GREETINGLINE, 101, Field.ADVANCE, Field.SHAPE, 78, 77, Field.DOCPROPERTY, Field.NOTEREF, Field.ADDIN, 101, Field.GREETINGLINE, Field.SHAPE, Field.HYPERLINK, Field.AUTOTEXT, Field.ADDRESSBLOCK, 101, Field.SHAPE, 76, Field.SHAPE, Field.ADVANCE, 78, Field.TOA, 101, Field.TOA, Field.HTMLCONTROL, Field.CONTROL, 74, 86, Field.FORMDROPDOWN, Field.ADVANCE, Field.ADDRESSBLOCK, 101, Field.NOTEREF, Field.HTMLCONTROL, 78, Field.SHAPE, 76, Field.TOA, Field.INCLUDEPICTURE, Field.LISTNUM, 114, 76, Field.INCLUDEPICTURE, Field.TOA, Field.SHAPE, Field.SECTIONPAGES, Field.INCLUDETEXT, Field.TOA, 114, Field.HYPERLINK, Field.GREETINGLINE, Field.NOTEREF, 114, Field.SECTION, Field.SECTIONPAGES, 78, 76, Field.SECTION, 114, 78, Field.SECTIONPAGES, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.AUTOTEXTLIST, Field.NOTEREF, Field.SHAPE, Field.GREETINGLINE, 123, 126, 116, 109, Field.FILESIZE, 126, Byte.MAX_VALUE, 120, 111, 125, Field.FILESIZE, 118, 117, 125, Field.FILESIZE, 124, 115, 118, Byte.MAX_VALUE, Field.FILESIZE, 105, 115, 96, Byte.MAX_VALUE, Field.FILESIZE, 118, 115, 119, 115, 110, Field.FILESIZE, 120, 99, 110, Byte.MAX_VALUE, 105, Field.TOA, 76, Field.FORMTEXT, Field.SHAPE, 119, 76, 77, 74, Field.ADDRESSBLOCK, Field.AUTOTEXT, 119, Field.INCLUDETEXT, Field.FORMCHECKBOX, Field.AUTOTEXT, Field.AUTOTEXT, Field.SECTION, Field.FORMTEXT, Field.AUTOTEXT, 120, 125, 119, 110, Field.FORMTEXT, 125, 124, 123, 108, 126, Field.FORMTEXT, 117, 118, 126, 126, 112, 119, 126, Field.FORMTEXT, 124, 111, 124, 119, 109, Field.FORMTEXT, 117, 112, 116, 112, 109, 19, 22, Field.NUMCHARS, 5, Field.DDE, 30, 29, 21, Field.DDE, 19, 22, 22, Field.NUMWORDS, 6, Field.NUMWORDS, 29, Field.NUMCHARS, 19, 30, Field.DDE, 30, 29, 21, 21, Field.NUMWORDS, Field.NUMCHARS, 21, Field.DDE, 23, 4, 23, Field.NUMCHARS, 6, 1, Field.DDE, 30, Field.NUMWORDS, 31, Field.NUMWORDS, 6, Field.AUTONUMLGL, 48, 58, Field.QUOTE, 11, 56, 59, Field.MACROBUTTON, 11, Field.AUTONUMLGL, 48, 48, 61, 32, 61, 59, 58, Field.AUTONUMLGL, 56, 11, 56, 59, Field.MACROBUTTON, Field.MACROBUTTON, 61, 58, Field.MACROBUTTON, 11, 61, 58, 11, Field.SYMBOL, Field.EQ, Field.SYMBOL, 59, Field.ASK, Field.DDE, 11, Field.EQ, 34, Field.EQ, 58, 32, Field.FILLIN, 11, 56, 61, Field.SYMBOL, 61, 32, Field.TOA, 76, Field.FORMTEXT, Field.SHAPE, 119, Field.INCLUDETEXT, Field.FORMCHECKBOX, Field.AUTOTEXT, 119, Field.TOA, 76, 76, Field.SECTION, Field.BIDIOUTLINE, Field.SECTION, Field.FORMCHECKBOX, Field.FORMTEXT, Field.TOA, Field.INCLUDETEXT, 119, Field.INCLUDETEXT, Field.FORMCHECKBOX, Field.AUTOTEXT, Field.AUTOTEXT, Field.SECTION, Field.FORMTEXT, Field.AUTOTEXT, 119, Field.HTMLCONTROL, 77, Field.HTMLCONTROL, Field.HTMLCONTROL, Field.SECTION, Field.FORMCHECKBOX, Field.FORMTEXT, 119, 77, Field.GREETINGLINE, 77, Field.FORMTEXT, Field.BIDIOUTLINE, Field.HTMLCONTROL, 119, Field.TOA, Field.INCLUDETEXT, Field.SHAPE, Field.TOA, Field.ADDIN, Field.HTMLCONTROL, 48, Field.AUTONUMLGL, Field.BARCODE, Field.ASK, 14, 34, Field.AUTONUMOUT, Field.BARCODE, Field.AUTONUMLGL, 14, 48, Field.AUTONUMLGL, Field.AUTONUMLGL, 56, Field.PAGEREF, 56, Field.USERADDRESS, Field.BARCODE, 48, 61, 14, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.MACROBUTTON, 36, Field.AUTONUM, 14, 61, Field.USERADDRESS, Field.AUTONUM, Field.AUTONUM, 56, Field.BARCODE, Field.AUTONUM, 14, 34, Field.PAGEREF, 48, Field.GOTOBUTTON, 58, Field.PAGEREF, Field.QUOTE, 48, Field.GOTOBUTTON, Field.AUTONUMOUT, 122, Byte.MAX_VALUE, 117, 108, Field.INCLUDETEXT, 104, 115, 116, 110, 119, Byte.MAX_VALUE, Field.INCLUDETEXT, 110, 104, 126, Field.INCLUDETEXT, 125, 114, 119, 126, Field.INCLUDETEXT, 121, 122, 104, 126, Byte.MAX_VALUE, Field.INCLUDETEXT, 105, 126, 120, 116, 105, Byte.MAX_VALUE, Field.INCLUDETEXT, Byte.MAX_VALUE, 122, 111, 122, 121, 122, 104, 126, 32, Field.PAGEREF, Field.GLOSSARY, Field.AUTONUM, 30, Field.AUTONUMOUT, Field.GOTOBUTTON, 36, 30, Field.GOTOBUTTON, 41, Field.DDEAUTO, Field.MACROBUTTON, Field.AUTONUMLGL, 30, 36, Field.GLOSSARY, Field.IMPORT, 30, Field.PAGEREF, 32, Field.AUTONUMLGL, 32, 30, 
        Field.FILLIN, Field.DDEAUTO, Field.MACROBUTTON, 30, 32, Field.PAGEREF, Field.PAGEREF, Field.DATA, Field.AUTONUMLGL, Field.DATA, Field.DDEAUTO, Field.GLOSSARY, 32, Field.DDE, 30, Field.DDE, Field.DDEAUTO, Field.ASK, Field.ASK, Field.DATA, Field.GLOSSARY, Field.ASK, 122, 124, Field.FORMCHECKBOX, 124, 121, 108, 121, Field.FORMCHECKBOX, 116, 119, Byte.MAX_VALUE, Byte.MAX_VALUE, 113, 118, Byte.MAX_VALUE, Field.FORMCHECKBOX, 116, 113, 117, 113, 108, 11, 16, 23, 24, 23, Field.NUMWORDS, 26, 33, 18, 17, 25, 25, 23, 16, 25, 33, 26, 23, 13, 14, 31, 10, 29, 22, 33, 23, 16, 10, Field.NUMWORDS, 12, 8, 31, 18, 33, 13, Field.NUMWORDS, 29, 17, 16, 26, 13, Field.SECTIONPAGES, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.ADDIN, Field.GREETINGLINE, 82, Field.FORMDROPDOWN, 104, Field.HTMLCONTROL, Field.HYPERLINK, 80, 80, Field.GREETINGLINE, Field.AUTOTEXTLIST, 80, 104, 82, Field.SECTION, 82, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, 104, Field.HTMLCONTROL, Field.GREETINGLINE, Field.LISTNUM, Field.GREETINGLINE, Field.INCLUDEPICTURE, 3, 24, 31, 16, 31, 19, 18, 41, 26, 25, 17, 17, 31, 24, 17, 41, 31, Field.NUMWORDS, Field.NUMWORDS, 19, 18, 31, 23, 2, 19, 41, 18, 19, 26, 23, 15, 41, Field.NUMWORDS, 5, 102, 125, 122, 117, 122, 118, 119, 76, Byte.MAX_VALUE, 124, 116, 116, 122, 125, 116, 76, 97, 118, 103, 97, 106, 76, Byte.MAX_VALUE, 122, 126, 122, 103};
    }

    static {
        A0N();
    }

    public static int A00(Context context) {
        return C0877Im.A0T(context).A2p(A0L(750, 40, 73), 10);
    }

    public static int A01(Context context) {
        return C0877Im.A0T(context).A2p(A0L(790, 50, 111), 50);
    }

    public static int A02(Context context) {
        return C0877Im.A0T(context).A2p(A0L(ShapeTypes.FLOW_CHART_SORT, 35, 14), 1);
    }

    public static int A03(Context context) {
        return A0H(context, A0L(59, 46, 80), 0);
    }

    public static int A04(Context context) {
        return A0H(context, A0L(105, 44, 125), 0);
    }

    public static int A05(Context context) {
        return C0877Im.A0T(context).A2p(A0L(1022, 21, 35), 10);
    }

    public static int A06(Context context) {
        return C0877Im.A0T(context).A2p(A0L(275, 45, 28), 0);
    }

    public static int A07(Context context) {
        return C0877Im.A0T(context).A2p(A0L(TTAdConstant.STYLE_SIZE_RADIO_2_3, 36, 33), 10485760);
    }

    public static int A08(Context context) {
        return C0877Im.A0T(context).A2p(A0L(720, 30, 34), 30);
    }

    public static int A09(Context context) {
        return C0877Im.A0T(context).A2p(A0L(366, 39, 9), 5);
    }

    public static int A0A(Context context) {
        return C0877Im.A0T(context).A2p(A0L(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE, 46, 106), 0);
    }

    public static int A0B(Context context) {
        return C0877Im.A0T(context).A2p(A0L(451, 43, 30), 0);
    }

    public static int A0C(Context context) {
        return C0877Im.A0T(context).A2p(A0L(494, 41, 108), 0);
    }

    public static int A0D(Context context) {
        return C0877Im.A0T(context).A2p(A0L(535, 53, 23), 0);
    }

    public static int A0E(Context context) {
        return C0877Im.A0T(context).A2p(A0L(588, 47, 1), 0);
    }

    public static int A0F(Context context) {
        return C0877Im.A0T(context).A2p(A0L(1084, 27, 12), 30);
    }

    public static int A0G(Context context) {
        return C0877Im.A0T(context).A2p(A0L(1145, 27, 40), 20);
    }

    public static int A0H(Context context, String str, int i10) {
        int A2p = C0877Im.A0T(context).A2p(str, i10);
        if (A2p >= 0 && A2p < 101) {
            return A2p;
        }
        return i10;
    }

    public static long A0I(Context context) {
        return C0877Im.A0T(context).A2q(A0L(320, 46, 86), 2000L);
    }

    public static long A0J(Context context) {
        return C0877Im.A0T(context).A2p(A0L(1043, 41, 69), OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT) * 1000;
    }

    public static long A0K(Context context) {
        return C0877Im.A0T(context).A2q(A0L(1111, 34, 77), 500L);
    }

    public static HashMap<String, Integer> A0M(Context context) throws JSONException {
        String blackListString = C0877Im.A0T(context).A2r(A0L(24, 35, 77), A0L(22, 2, 84));
        HashMap<String, Integer> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray(blackListString);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String optString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(optString)) {
                String A0L = A0L(0, 1, 85);
                if (optString.contains(A0L)) {
                    String[] split = optString.split(A0L);
                    String blackListString2 = split[1];
                    try {
                        int parseInt = Integer.parseInt(blackListString2);
                        String str = split[0];
                        Integer valueOf = Integer.valueOf(parseInt);
                        String[] strArr = A01;
                        if (strArr[1].charAt(19) == strArr[6].charAt(19)) {
                            throw new RuntimeException();
                        }
                        A01[2] = "wzhVBTrm4NHLde2dsMQb3id1wgsCAtfS";
                        hashMap.put(str, valueOf);
                    } catch (NumberFormatException unused) {
                        throw new JSONException(A0L(1, 21, 100));
                    }
                } else {
                    String[] strArr2 = A01;
                    if (strArr2[1].charAt(19) != strArr2[6].charAt(19)) {
                        String[] strArr3 = A01;
                        strArr3[5] = "lVwzbqekYbQANiPk50jGeH7RXXU9rAeI";
                        strArr3[7] = "4HLNgzBPZBjDavwa2VUT1a0cI7AwYTVO";
                        hashMap.put(optString, -1);
                    } else {
                        hashMap.put(optString, -1);
                    }
                }
            }
        }
        return hashMap;
    }

    public static boolean A0O(Context context) {
        return C0877Im.A0T(context).A2v(A0L(ShapeTypes.PLAQUE_TABS, 49, 86), true);
    }

    public static boolean A0P(Context context) {
        return C0877Im.A0T(context).A2v(A0L(702, 18, 19), false);
    }

    public static boolean A0Q(Context context) {
        return C0877Im.A0T(context).A2v(A0L(840, 49, 19), true);
    }

    public static boolean A0R(Context context) {
        return C0877Im.A0T(context).A2v(A0L(889, 45, 106), false);
    }

    public static boolean A0S(Context context) {
        return C0877Im.A0T(context).A2v(A0L(UnknownRecord.BITMAP_00E9, 42, 42), true);
    }

    public static boolean A0T(Context context) {
        return C0877Im.A0T(context).A2v(A0L(934, 42, 32), false);
    }

    public static boolean A0U(Context context) {
        return C0877Im.A0T(context).A2v(A0L(635, 31, 22), false);
    }

    public static boolean A0V(Context context) {
        return C0877Im.A0T(context).A2v(A0L(976, 46, 122), true);
    }
}
