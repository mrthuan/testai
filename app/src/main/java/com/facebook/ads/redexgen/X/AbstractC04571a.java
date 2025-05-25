package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04571a {
    public static byte[] A00;

    static {
        A0C();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{-8, 33, 36, Field.DATA, 26, -43, -10, 25, 15, 59, 58, 64, Field.AUTONUMLGL, 58, Field.SECTION, Field.EQ, -20, Field.QUOTE, Field.DDE, 64, Field.GLOSSARY, Field.AUTONUMOUT, Field.AUTONUMLGL, 58, Field.MACROBUTTON, Field.SYMBOL, 101, 100, 106, Field.SHAPE, 100, 107, Field.HTMLCONTROL, 22, 109, Field.CONTROL, 106, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.SHAPE, 100, Field.ADDRESSBLOCK, 22, 106, 101, 22, 104, Field.HTMLCONTROL, Field.AUTOTEXTLIST, Field.HTMLCONTROL, Field.SHAPE, 108, Field.HTMLCONTROL, 22, Field.CONTROL, 100, 22, Field.SHAPE, 100, Field.QUOTE, Field.ADDRESSBLOCK, Field.CONTROL, 99, Field.HTMLCONTROL, 22, 104, Field.HTMLCONTROL, 109, Field.CONTROL, 104, Field.LISTNUM, 1, Field.DDE, 44, Field.GOTOBUTTON, Field.FILLIN, 44, Field.MACROBUTTON, Field.QUOTE, -34, Field.AUTONUMLGL, 31, Field.GOTOBUTTON, 33, Field.ASK, Field.FILLIN, 44, Field.PAGEREF, -34, Field.GOTOBUTTON, Field.DDE, -34, 48, Field.QUOTE, 33, Field.QUOTE, Field.FILLIN, Field.AUTONUMOUT, Field.QUOTE, -34, Field.SYMBOL, Field.GLOSSARY, Field.MACROBUTTON, 31, 44, Field.GOTOBUTTON, Field.FILLIN, Field.GOTOBUTTON, Field.IMPORT, 59, Field.SYMBOL, 33, Field.MACROBUTTON, 48, 48, Field.QUOTE, 44, 33, Field.IMPORT, 59, 12, Field.DDE, 34, 43, Field.ASK, 43, 36, -35, Field.ASK, 43, -35, 24, 48, 34, 32, 48, 26, 48, -28, 5, -6, 3, -2, 3, -4, -75, -2, 3, -61, -61, -61, -50, -31, -13, -35, -18, -32, -100, -27, -22, -100, -41, -17, -31, -33, -17, -39, -17, -38, -14, -16, -9, 44, Field.TOA, Field.NOTEREF, Field.FORMCHECKBOX, 76, Field.NOTEREF, Field.MERGESEQ, Field.USERADDRESS, 61, -9, 11, 10, 5, -7, 2, -1, -7, 1, -11, -1, 4, -11, 14, Field.DATA, 60, 59, Field.AUTONUM, 42, Field.MACROBUTTON, 48, 42, Field.GOTOBUTTON, Field.ASK, Field.AUTONUM, Field.IMPORT, 44, Field.AUTONUMLGL, 48, Field.AUTONUMLGL, Field.DDEAUTO, Field.ADVANCE, Field.ADDRESSBLOCK, 96, 100, 86, 80, 82, Field.DOCPROPERTY, 31, 43, 42, 48, Field.PAGEREF, 42, Field.EQ, 33, Field.NUMWORDS, Field.MACROBUTTON, 29, 48, 31, 36, Field.PAGEREF, 42, Field.QUOTE, Field.SYMBOL, Field.FILESIZE, Field.INCLUDETEXT, 74, Field.BARCODE, Field.INCLUDETEXT, Field.MERGESEQ, 59, Field.AUTONUMLGL, 77, Field.IMPORT, 74, Field.SYMBOL, Field.USERADDRESS, Field.BARCODE, Field.INCLUDETEXT, 61, Field.AUTONUMLGL, 60, Field.FILESIZE, Field.NOTEREF, Field.AUTONUMLGL, Field.NOTEREF, 59, 77, Field.IMPORT, Field.NOTEREF, 58, Field.MACROBUTTON, Field.EQ, 58, Field.EQ, Field.USERADDRESS, Field.AUTONUMLGL, Field.GLOSSARY, 43, Field.USERADDRESS, Field.EQ, Field.INCLUDEPICTURE, Field.DDE, Field.USERADDRESS, 48, 10, 8, 17, 8, 21, 12, 6, 2, 23, 8, Field.NUMWORDS, 23, 80, Field.INCLUDEPICTURE, Field.DOCPROPERTY, Field.BARCODE, 80, Field.SECTIONPAGES, 61, Field.FORMCHECKBOX, 76, 61, 86, -7, -15, -17, -10, -15, -18, -19, -20, -15, -19, -16, -29, -30};
    }

    public static C1W A00(JSONObject jSONObject) {
        return new C1V().A06(A08(jSONObject)).A07(A07(jSONObject)).A05(A09(jSONObject)).A04(A06(jSONObject)).A08();
    }

    public static C04621f A01(JSONObject jSONObject) {
        return new C04611e().A06(A0A(jSONObject)).A07(A0B(jSONObject)).A05(A05(jSONObject)).A04(A04(jSONObject)).A08();
    }

    public static String A03(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(ShapeTypes.ACTION_BUTTON_MOVIE, 9, 96);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(306, 9, 5), A02);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(120, 18, 68);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(ShapeTypes.MATH_NOT_EQUAL, 14, 29), A02);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 13, 28);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(195, 17, 78), A02);
    }

    public static String A06(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(0, 8, 60);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(212, 8, 120), A02);
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(71, 49, 69);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(237, 28, 93), A02);
    }

    public static String A08(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(25, 46, 125);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(265, 14, 83), A02);
    }

    public static String A09(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(8, 17, 83);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(220, 17, 67), A02);
    }

    public static String A0A(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(ShapeTypes.FLOW_CHART_MERGE, 17, 3);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(291, 11, 101), A02);
    }

    public static String A0B(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(ShapeTypes.ACTION_BUTTON_BEGINNING, 4, 14);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(302, 4, 13), A02);
    }
}
