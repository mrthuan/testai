package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.2S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2S {
    public static byte[] A01;
    public static String[] A02 = {"pVDJwwImNDAzAU7MVHYB7KJyYkXB8ng6", "xCCCN", "WmAvu667o4AOfXv58a4lhsk2v5Ms6Skb", "l5AJTkPNjTtBLXifXwK6kFeEJ0fMsOcr", "3rlSEGUZnv4yJ13AM8B6pi", "FEUqx4", "USh9ikhtS0UWG5H8nhVral6z3PYi0bQO", "dZN"};
    public static final String[] A03;
    public final C2Y A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{106, 7, 43, 56, 33, 106, 43, Field.DDEAUTO, 106, 43, Field.SYMBOL, 106, Field.PAGEREF, 44, 44, Field.GLOSSARY, 36, Field.SYMBOL, Field.QUOTE, 60, Field.GLOSSARY, 106, Field.PAGEREF, 56, 106, Field.QUOTE, 36, 43, 58, 58, 56, Field.PAGEREF, 58, 56, Field.QUOTE, 43, Field.USERADDRESS, Field.GLOSSARY, 104, 77, 9, Field.SECTION, 64, 77, 77, 76, Field.FORMCHECKBOX, 7, 106, Field.AUTOTEXT, 11, Field.AUTOTEXTLIST, 78, Field.HTMLCONTROL, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.SHAPE, 78, Field.AUTOTEXT, 5, 18, Field.BARCODE, Field.AUTONUM, 42, 122, Field.GLOSSARY, 41, 122, Field.GLOSSARY, Field.AUTONUMOUT, Field.USERADDRESS, Field.BARCODE, Field.DATA, 41, Field.DDEAUTO, 59, Field.AUTONUMOUT, Field.USERADDRESS, 122, Field.DDE, Field.GOTOBUTTON, 59, Field.DDEAUTO, 122, Field.MACROBUTTON, 41, 122, Field.GOTOBUTTON, 59, 42, 42, Field.BARCODE, Field.AUTONUMOUT, Field.MACROBUTTON, Field.AUTONUMOUT, 61, 116, 122, 13, Field.GOTOBUTTON, Field.QUOTE, 122, Field.USERADDRESS, Field.AUTONUMLGL, Field.AUTONUMOUT, 125, Field.DDEAUTO, 122, Field.QUOTE, Field.AUTONUMLGL, Field.GLOSSARY, 122, Field.DDE, 59, Field.AUTONUMOUT, Field.DDEAUTO, 122, Field.DDEAUTO, Field.AUTONUMLGL, 122, 41, Field.BARCODE, Field.BARCODE, 122, Field.DDEAUTO, Field.GOTOBUTTON, Field.MACROBUTTON, 41, 101, Field.FILLIN, 10, 3, 31, Field.AUTOTEXT, 26, Field.NUMCHARS, Field.AUTOTEXT, 26, 1, 11, 10, 29, Field.NUMCHARS, Field.NUMWORDS, 14, 1, 11, Field.AUTOTEXT, 24, 7, 14, Field.NUMWORDS, Field.AUTOTEXT, 6, Field.NUMCHARS, Field.AUTOTEXT, 7, 14, 31, 31, 10, 1, 6, 1, 8, Field.SECTION, Field.AUTOTEXT, 56, 7, 22, Field.AUTOTEXT, 6, Field.NUMCHARS, Field.AUTOTEXT, Field.NUMWORDS, 7, 6, Field.NUMCHARS, Field.AUTOTEXT, 6, 1, 14, 31, 31, 29, 0, 31, 29, 6, 14, Field.NUMWORDS, 10, 80, 77, 108, 97, 96, Field.PAGEREF, Field.INCLUDETEXT, 97, 118, Field.LISTNUM, Field.DOCPROPERTY, Field.LISTNUM, Field.BIDIOUTLINE, Field.GREETINGLINE, Field.NUMWORDS, Field.LISTNUM, Field.SHAPE, Field.NUMWORDS, Field.MERGESEQ, Field.TOA, Field.GREETINGLINE, Field.ADDRESSBLOCK, Field.GREETINGLINE, Field.TOA, Field.GREETINGLINE, Field.DOCPROPERTY, Field.HYPERLINK, Field.GREETINGLINE, Field.NOTEREF, Field.AUTOTEXTLIST, 120, Field.IMPORT, Byte.MAX_VALUE, 126, 115, 114, Field.IMPORT, 118, 115, Field.IMPORT, 120, 103, 99, 126, 120, 121, 100, 31, Field.USERADDRESS, 113, Field.QUOTE, Field.AUTONUMOUT, 33, Field.USERADDRESS, Field.QUOTE, Field.PAGEREF, 113, 48, Field.AUTONUMLGL, 113, Field.USERADDRESS, 33, Field.PAGEREF, 56, Field.USERADDRESS, Field.BARCODE, 34, 77, 122, 111, 112, 109, 107, Field.BARCODE, Field.GREETINGLINE, 123, Field.TOA, Byte.MAX_VALUE, Byte.MAX_VALUE, 58, 124, Byte.MAX_VALUE, 109, Byte.MAX_VALUE, 104, 58, 123, 126, 105, 58, 118, 115, 113, Byte.MAX_VALUE, 58, 110, 114, 115, 105, 110, Field.ADDIN, 64, 25, Field.HYPERLINK, Field.ADVANCE, 25, 112, 25, 74, Field.BIDIOUTLINE, Field.BIDIOUTLINE, 80, Field.CONTROL, Field.GREETINGLINE, 25, 77, Field.ADDIN, 80, 74, 6, 60, 10, 16, 23, Field.FILESIZE, 22, 16, 7, 8, 12, 22, 22, 12, 10, 11, Field.FILESIZE, 12, 22, Field.FILESIZE, 11, 10, 18, Field.FILESIZE, 7, 0, 12, 11, 2, Field.FILESIZE, 23, 0, 19, 12, 0, 18, 0, 1, Field.MERGESEQ, 76, 74, 125, 120, Field.INCLUDEPICTURE, Byte.MAX_VALUE, 116, 115, 117, Byte.MAX_VALUE, 121, 111, Field.INCLUDEPICTURE, 105, 110, 117, 102, 109, 108, 105, 97, 119, 96, 107, Field.LISTNUM, 109, 96, 100, 97, 108, 107, 98, Field.ASK, Field.DDE, 44, 41, 33, Field.IMPORT, 32, 43, 26, 42, Field.AUTONUMLGL, Field.EQ, 44, 42, 43, Field.AUTONUM, 117, 122, 125, 122, 96, 123, 118, 119, 76, 119, 118, 96, 112, 97, 122, 99, 103, 122, 124, 125, 74, Field.FILESIZE, Field.SECTIONPAGES, Field.FILESIZE, Field.SHAPE, Field.INCLUDETEXT, Field.TOA, Field.NOTEREF, 115, Field.INCLUDETEXT, Field.FILESIZE, Field.NOTEREF, Field.TOA, 115, 77, Field.NOTEREF, Field.LISTNUM, Field.DOCPROPERTY, 82, Field.DOCPROPERTY, Field.AUTOTEXT, Field.ADVANCE, Field.AUTOTEXTLIST, Field.HYPERLINK, 99, 78, Field.AUTOTEXTLIST, 76, Field.FORMDROPDOWN, 78, Field.NOTEREF, 99, Field.ADDRESSBLOCK, Field.HYPERLINK, 59, 58, Field.IMPORT, Field.AUTONUM, 12, Field.GOTOBUTTON, Field.IMPORT, Field.EQ, 48, 61, 60, 6, 56, 61, 6, 61, 60, 42, 58, 43, 48, 41, Field.DDE, 48, Field.AUTONUM, Field.IMPORT, 61, 60, Field.EQ, 48, 10, Field.AUTONUMOUT, Field.EQ, 10, Field.MACROBUTTON, 58, Field.SYMBOL, Field.SYMBOL, 58, 34, 10, 32, Field.PAGEREF, 10, 61, 48, Field.AUTONUMOUT, Field.EQ, 60, 59, Field.GOTOBUTTON, Field.LISTNUM, Field.HTMLCONTROL, 86, Field.CONTROL, 109, Field.FORMDROPDOWN, 86, 109, Field.ADDRESSBLOCK, Field.SECTIONPAGES, Field.FORMTEXT, Field.HTMLCONTROL, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, Field.SECTION, Field.AUTOTEXTLIST, Field.ADVANCE, Field.FORMTEXT, Field.SECTION, 106, 64, Field.FILESIZE, Field.ADDIN, Field.ADVANCE, Field.SECTION, 80, Field.ADDIN, 106, Field.SECTION, Field.BIDIOUTLINE, Field.HYPERLINK, 80, Field.FORMTEXT, Field.SECTION, Field.ADVANCE, Field.HYPERLINK, Field.FILESIZE, Field.DATA, 36, 43, 36, 34, 32, 26, 36, 33, 26, Field.AUTONUMLGL, Field.IMPORT, 32, Field.QUOTE, 32, Field.IMPORT, 32, 43, Field.ASK, 32, Field.AUTONUM, Field.DOCPROPERTY, Field.AUTOTEXTLIST, 86, Field.AUTOTEXTLIST, Field.SHAPE, Field.ADDRESSBLOCK, 103, Field.AUTOTEXTLIST, Field.BIDIOUTLINE, 103, Field.NOTEREF, 74, Field.ADDRESSBLOCK, Field.GREETINGLINE, Field.ADDRESSBLOCK, 74, Field.ADDRESSBLOCK, 86, Field.HTMLCONTROL, Field.ADDRESSBLOCK, Field.MERGESEQ, 103, 77, 74, Field.ADDIN, 117, 110, 119, 119, 98, 125, 121, 100, 98, 99, 82, 121, 104, 117, 121, 33, Field.USERADDRESS, 58, Field.FILLIN, 33, 32, 17, 56, Field.GLOSSARY, 34, 59, 43, 8, 31, 10, 21, 8, 14, Field.PAGEREF, Field.NUMWORDS, 30, Field.FILLIN, 48, Field.PAGEREF, 58, Field.FILLIN, 33, 10, Field.AUTONUMOUT, Field.EQ, 10, Field.EQ, 48, Field.ASK, Field.AUTONUM, Field.FILLIN, 60, Field.PAGEREF, 33, 60, 58, 59, 13, 26, 15, 16, 13, 11, 32, 30, Field.NUMWORDS, 32, 25, 16, 19, 19, 16, 8, 32, 10, 15, 32, 23, 26, 30, Field.NUMWORDS, 22, 17, 24, Field.SECTIONPAGES, Field.DOCPROPERTY, 64, Field.SHAPE, Field.SECTIONPAGES, Field.INCLUDETEXT, 111, Field.ADDIN, Field.ADVANCE, 111, Field.SHAPE, 64, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.SHAPE, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.HTMLCONTROL, 76, Field.AUTOTEXTLIST, Field.FORMTEXT, Field.HTMLCONTROL, Field.ADDRESSBLOCK, 64, Field.FORMCHECKBOX, 78, 16, 15, 30, 56, 6, 10, 56, 14, 56, 20, 2, 2, 14, 9, 0, 56, 19, 15, 14, 20};
    }

    static {
        A06();
        A03 = new String[]{A02(452, 7, 105), A02(459, 19, 99), A02(478, 25, 111), A02(PglCryptUtils.COMPRESS_FAILED, 15, 8), A02(613, 9, 64), A02(622, 21, 111), A02(643, 27, 69), A02(670, 17, 10), A02(540, 21, ShapeTypes.VERTICAL_SCROLL), A02(418, 16, 22), A02(434, 18, 6), A02(398, 20, 41), A02(696, 20, 93), A02(352, 14, 38), A02(561, 25, 2)};
    }

    public C2S(C2Y c2y) {
        this.A00 = c2y;
    }

    private String A00() {
        return A03(A02(478, 25, 111), A02(60, 69, 96));
    }

    private String A01() {
        return A03(A02(643, 27, 69), A02(129, 64, 85));
    }

    private String A03(String str, String str2) {
        String A8T = this.A00.A8T(str, str2);
        if (A8T != null) {
            String value = A02(586, 4, 33);
            return A8T.equals(value) ? str2 : A8T;
        }
        return str2;
    }

    public static List<C2W> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(586, 4, 33))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            C2W c2w = new C2W(jSONObject.getInt(A02(601, 12, 116)), jSONObject.getString(A02(590, 11, 55)), jSONObject.optString(A02(366, 16, 63)));
            for (C2W c2w2 : A04(jSONObject.optString(A02(382, 16, ShapeTypes.VERTICAL_SCROLL)))) {
                c2w.A06(c2w2);
            }
            arrayList.add(c2w);
        }
        return arrayList;
    }

    public static Map<String, String> A05(String str) {
        String[] strArr;
        if (str != null && !str.isEmpty()) {
            if (A02[0].charAt(31) == '2') {
                throw new RuntimeException();
            }
            A02[0] = "A8tiJT5v19tpxSVqHJBkbDhH2RRDdRkC";
            if (!str.equals(A02(350, 2, 45))) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    for (String str2 : A03) {
                        if (!jSONObject.has(str2)) {
                            return null;
                        }
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                    if (A04(jSONObject.getString(A02(670, 17, 10))).size() == 0) {
                        A08(C8E.A28, new C8F(A02(UnknownRecord.PHONETICPR_00EF, 20, 107)));
                        return null;
                    } else if (A04(jSONObject.getString(A02(PglCryptUtils.COMPRESS_FAILED, 15, 8))).size() == 0) {
                        A08(C8E.A25, new C8F(A02(221, 18, 45)));
                        return null;
                    } else {
                        return hashMap;
                    }
                } catch (JSONException e10) {
                    A08(C8E.A27, new C8F(e10));
                    return null;
                }
            }
        }
        return null;
    }

    private final void A07() {
        C1399bI A5o = this.A00.A5o();
        A5o.A00(A02(518, 22, 15), 0L);
        A5o.A02();
    }

    public static void A08(int i10, C8F c8f) {
        C1313Zr sdkContext = AbstractC06137i.A00();
        if (sdkContext != null) {
            sdkContext.A07().AA0(A02(687, 9, 19), i10, c8f);
        }
    }

    public final long A09() {
        return this.A00.A7i(A02(518, 22, 15), 0L);
    }

    public final C2W A0A() {
        C2W c2w = new C2W(A00());
        try {
            for (C2W hideAdParent : A04(A03(A02(PglCryptUtils.COMPRESS_FAILED, 15, 8), A02(0, 0, 48)))) {
                c2w.A06(hideAdParent);
            }
        } catch (JSONException e10) {
            A07();
            A08(C8E.A26, new C8F(e10));
        }
        return c2w;
    }

    public final C2W A0B() {
        C2W c2w = new C2W(A01());
        try {
            for (C2W reportAdParent : A04(A03(A02(670, 17, 10), A02(0, 0, 48)))) {
                c2w.A06(reportAdParent);
            }
        } catch (JSONException e10) {
            A07();
            A08(C8E.A29, new C8F(e10));
        }
        return c2w;
    }

    public final String A0C() {
        return A03(A02(352, 14, 38), A02(0, 0, 48));
    }

    public final String A0D() {
        return A03(A02(398, 20, 41), A02(312, 38, 95));
    }

    public final String A0E() {
        return A03(A02(418, 16, 22), A02(38, 10, 19));
    }

    public final String A0F() {
        return A03(A02(434, 18, 6), A02(48, 12, 17));
    }

    public final String A0G() {
        return A03(A02(459, 19, 99), A02(268, 23, 32));
    }

    public final String A0H() {
        return A03(A02(452, 7, 105), A02(193, 7, 63));
    }

    public final String A0I() {
        return A03(A02(561, 25, 2), A02(0, 0, 48));
    }

    public final String A0J() {
        return A03(A02(540, 21, ShapeTypes.VERTICAL_SCROLL), A02(200, 21, 1));
    }

    public final String A0K() {
        return A03(A02(622, 21, 111), A02(0, 38, 112));
    }

    public final String A0L() {
        return A03(A02(613, 9, 64), A02(259, 9, 37));
    }

    public final String A0M() {
        return A03(A02(696, 20, 93), A02(291, 21, 3));
    }

    public final void A0N(String str) {
        String[] strArr;
        Map<String, String> A05 = A05(str);
        if (A05 == null || A05.size() != A03.length) {
            return;
        }
        C1399bI A5o = this.A00.A5o();
        for (String str2 : A03) {
            A5o.A01(str2, A05.get(str2));
        }
        if (A02[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "MCE7RaiUtGHbfQd9DpKX6Z";
        strArr2[5] = "LB7njF";
        A5o.A00(A02(518, 22, 15), System.currentTimeMillis());
        A5o.A02();
    }

    public final boolean A0O(Context context, boolean z10) {
        return (z10 || C0877Im.A2U(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
