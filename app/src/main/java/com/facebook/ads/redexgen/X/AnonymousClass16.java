package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.16  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass16 {
    public static byte[] A00;
    public static String[] A01 = {"rumqJp0zjtXTj7VCZC", "TMr6rmpz3eFeqFi1AyEescympmX4mKYs", "yKc30ML1ifcOIqfiQ1Y0n8yeP8tTgKvd", "ifxbXcWS1dksd5gxUX3XXpeR8fGAW9", "ARavVsGpFp1prhlT9X", "AJCuKBIGe5nliswM6BoL4M7qaWNzDabC", "wiV5dRZ8vBgNvrirj4IbquLjXKvqAP", "mqXFYOGhIorfWow0I7OGPDKbQEIe0IwJ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 62 out of bounds for length 62
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1461cI A01(C1314Zs c1314Zs, JSONObject jSONObject, String str, boolean z10, int i10, int i11) {
        boolean optBoolean;
        int optInt;
        ArrayList arrayList;
        if (jSONObject == null) {
            return new C1461cI();
        }
        LC.A04(c1314Zs, A02(0, 23, 112));
        String optString = jSONObject.optString(A02(371, 10, 72));
        int optInt2 = jSONObject.optInt(A02(116, 12, 106), 0);
        String optString2 = jSONObject.optString(A02(253, 13, 18));
        String A02 = LV.A02(jSONObject, A02(266, 12, 52));
        Uri A002 = TextUtils.isEmpty(A02) ? null : L5.A00(A02);
        String A022 = LV.A02(jSONObject, A02(128, 4, 54));
        String A012 = AbstractC0949Ln.A01(A022);
        String A023 = LV.A02(jSONObject, A02(101, 15, 34));
        String A024 = LV.A02(jSONObject, A02(485, 5, 32));
        String A025 = LV.A02(jSONObject, A02(477, 8, 43));
        String A026 = LV.A02(jSONObject, A02(278, 8, 99));
        String A027 = LV.A02(jSONObject, A02(431, 14, 94));
        String A028 = LV.A02(jSONObject, A02(295, 16, 122));
        String A029 = LV.A02(jSONObject, A02(445, 21, 1));
        String A0210 = LV.A02(jSONObject, A02(87, 14, 99));
        String A0211 = LV.A02(jSONObject, A02(UnknownRecord.LABELRANGES_015F, 20, 125));
        String A0212 = LV.A02(jSONObject, A02(335, 16, 114));
        String A0213 = LV.A02(jSONObject, A02(318, 17, 38));
        String A0214 = LV.A02(jSONObject, A02(ShapeTypes.FLOW_CHART_PROCESS, 14, 16));
        C0802Fl A0215 = C0802Fl.A02(jSONObject, c1314Zs);
        JU A003 = JU.A00(jSONObject.optJSONObject(A02(286, 4, 38)));
        JU A004 = JU.A00(jSONObject.optJSONObject(A02(290, 5, 12)));
        JV A005 = JV.A00(jSONObject.optJSONObject(A02(466, 11, 29)));
        String A0216 = LV.A02(jSONObject, A02(490, 15, 41));
        boolean optBoolean2 = jSONObject.optBoolean(A02(238, 15, 64));
        boolean optBoolean3 = jSONObject.optBoolean(A02(219, 19, 54));
        int optInt3 = jSONObject.optInt(A02(TTAdConstant.LANDING_PAGE_TYPE_CODE, 25, 123), 4);
        int optInt4 = jSONObject.optInt(A02(381, 25, 38), 0);
        int optInt5 = jSONObject.optInt(A02(569, 31, 83), 0);
        int optInt6 = jSONObject.optInt(A02(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, 26, 76), 1000);
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(53, 15, 30));
        JU A006 = optJSONObject != null ? JU.A00(optJSONObject) : null;
        String A0217 = LV.A02(jSONObject, A02(68, 19, 95));
        EnumC04410j A007 = AbstractC04430l.A00(jSONObject);
        Collection<String> A03 = AbstractC04430l.A03(c1314Zs, jSONObject);
        String A0218 = LV.A02(jSONObject, A02(560, 9, 10));
        long optLong = jSONObject.optLong(A02(536, 24, 82), -1L);
        if (A01[2].charAt(6) != 'o') {
            String[] strArr = A01;
            strArr[1] = "3DgIwYJYxCZHaga7jdAdEfDBKsaQLEaY";
            strArr[0] = "PJjdxes2PDM40JhdCx";
            String A0219 = LV.A02(jSONObject, A02(527, 9, 123));
            String A0220 = A02(PglCryptUtils.ENCRYPT_FAILED, 22, 124);
            JZ jz = !jSONObject.has(A0220) ? JZ.A03 : jSONObject.optBoolean(A0220) ? JZ.A05 : JZ.A04;
            String A0221 = A02(190, 29, 111);
            if (A01[2].charAt(6) != 'o') {
                A01[5] = "EiaN2GrSxKmld9dBg6rLOOlJPXBJhn44";
                optBoolean = jSONObject.optBoolean(A0221);
                optInt = jSONObject.optInt(A02(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 36, 107), 100);
                arrayList = null;
            } else {
                optBoolean = jSONObject.optBoolean(A0221);
                optInt = jSONObject.optInt(A02(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 36, 107), 100);
                arrayList = null;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(A02(ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, 8, 26));
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    ArrayList arrayList2 = new ArrayList(length);
                    for (int i12 = 0; i12 < length; i12++) {
                        try {
                            arrayList2.add(A01(c1314Zs, optJSONArray.getJSONObject(i12), str, true, i12, length));
                        } catch (JSONException e10) {
                            e = e10;
                            arrayList = arrayList2;
                            c1314Zs.A07().AA0(A02(311, 7, 111), C8E.A2A, new C8F(e));
                            Log.e(C1473cU.A0E, A02(23, 30, 97), e);
                            return new C1461cI(A0217, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A006, A0215, A003, A004, A005, A0218, A0219, optLong, jz, z10, i10, i11, arrayList, str, optString, optInt2, optString2, A002, A0216, optBoolean2, optBoolean3, optInt4, optInt3, optInt5, optInt6, A007, A03, optInt, optBoolean);
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (JSONException e11) {
                e = e11;
            }
            return new C1461cI(A0217, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A006, A0215, A003, A004, A005, A0218, A0219, optLong, jz, z10, i10, i11, arrayList, str, optString, optInt2, optString2, A002, A0216, optBoolean2, optBoolean3, optInt4, optInt3, optInt5, optInt6, A007, A03, optInt, optBoolean);
        }
        throw new RuntimeException();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{26, 78, 61, Field.SECTIONPAGES, Field.USERADDRESS, Field.FORMCHECKBOX, 60, Field.USERADDRESS, -7, Field.FILLIN, Field.USERADDRESS, 77, 80, Field.NOTEREF, Field.MERGESEQ, Field.INCLUDETEXT, -7, Field.PAGEREF, Field.NOTEREF, 58, 61, Field.USERADDRESS, 61, 31, 56, 43, 44, Field.AUTONUM, Field.GLOSSARY, -22, Field.USERADDRESS, Field.SYMBOL, -22, 58, 43, 60, 61, Field.GLOSSARY, -22, Field.DDE, 43, 60, Field.SYMBOL, Field.BARCODE, 61, Field.GLOSSARY, Field.AUTONUM, -22, Field.DDEAUTO, 43, Field.USERADDRESS, 43, -8, -24, -21, -26, -22, -17, -10, -16, -22, -20, -6, -26, -16, -22, -10, -11, 41, 44, Field.FILLIN, 43, 48, Field.IMPORT, Field.EQ, 43, Field.DDE, 59, Field.FILLIN, Field.AUTONUMOUT, Field.EQ, Field.AUTONUM, Field.MACROBUTTON, Field.FILLIN, 61, 58, Field.AUTONUMOUT, Field.DDE, 48, 43, 64, Field.USERADDRESS, Field.DDE, 58, Field.BARCODE, 56, Field.DDE, 64, Field.AUTONUMLGL, 59, 58, -20, -17, 1, -16, -3, -1, -12, -2, -16, -3, -22, -7, -20, -8, -16, Field.AUTONUMOUT, Field.SECTION, Field.GOTOBUTTON, Field.BARCODE, Field.SECTIONPAGES, 58, Field.SECTIONPAGES, Field.GOTOBUTTON, Field.FORMCHECKBOX, 76, Field.INCLUDEPICTURE, 56, 1, 14, 3, 24, -36, -38, -27, -27, -40, -19, -24, -40, -38, -36, -19, -30, -24, -25, -26, -28, -11, -14, -8, -10, -24, -17, Field.IMPORT, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.NOTEREF, Field.AUTONUMLGL, 61, Field.SECTIONPAGES, Field.SYMBOL, Field.FORMTEXT, Field.MACROBUTTON, 74, 61, Field.SYMBOL, Field.MERGESEQ, Field.AUTONUMLGL, Field.AUTONUM, 61, 64, 61, Field.NOTEREF, 77, Field.MACROBUTTON, Field.IMPORT, 60, Field.SYMBOL, Field.IMPORT, Field.BARCODE, Field.MACROBUTTON, 61, Field.SECTIONPAGES, Field.NOTEREF, Field.SYMBOL, Field.FORMTEXT, 74, Field.AUTONUMLGL, 64, 59, Field.FORMCHECKBOX, Field.FORMTEXT, 76, Field.SYMBOL, Field.SECTION, Field.FORMTEXT, 61, 74, Field.IMPORT, 78, Field.SECTION, 61, Field.AUTOTEXT, Field.SYMBOL, 58, Field.SECTION, Field.INCLUDETEXT, Field.SECTION, 76, Field.ADDIN, Field.IMPORT, 61, Field.FORMTEXT, Field.SYMBOL, 58, Field.INCLUDETEXT, 61, 60, 4, 13, 0, 1, 11, 4, -2, 18, 13, 0, 15, 18, 7, 14, 19, -2, 11, 14, 6, 14, 23, 10, 11, 21, 14, 8, 31, 18, 14, 32, 8, 21, 24, 16, -32, -23, -34, -19, -12, -21, -17, -32, -33, -38, -34, -21, -24, 3, -1, -2, 1, -4, 0, 12, 10, 10, -2, 11, 1, Field.AUTONUMOUT, Field.EQ, Field.DDE, 48, 56, Field.AUTONUMLGL, 58, Field.EQ, -8, -14, -2, -3, -34, -30, -42, -36, -38, Field.AUTOTEXT, 76, Field.ADDIN, 78, Field.SECTIONPAGES, Field.FORMCHECKBOX, Field.NOTEREF, 86, Field.FORMTEXT, Field.DOCPROPERTY, 76, Field.FORMDROPDOWN, Field.CONTROL, 76, 82, Field.ADDIN, Field.NOTEREF, Field.SYMBOL, 74, Field.MERGESEQ, Field.SECTION, Field.FORMTEXT, Field.BARCODE, -1, -16, 4, 2, -12, -18, 3, 1, -16, -3, 2, -5, -16, 3, -8, -2, -3, Field.MERGESEQ, Field.FORMCHECKBOX, 60, Field.ADVANCE, 58, Field.AUTOTEXT, 77, 60, Field.TOA, 78, Field.FORMCHECKBOX, 60, Field.AUTOTEXT, Field.INCLUDETEXT, 74, Field.TOA, 86, Field.HYPERLINK, Field.DOCPROPERTY, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.LISTNUM, Field.MERGESEQ, 74, Field.FILESIZE, Field.LISTNUM, Field.HYPERLINK, Field.FORMCHECKBOX, Field.ADVANCE, Field.AUTOTEXTLIST, 82, Field.FORMCHECKBOX, Field.LISTNUM, Field.AUTOTEXT, Field.DOCPROPERTY, Field.ADVANCE, Field.QUOTE, 22, 34, Field.ASK, 22, 36, Field.PAGEREF, 16, 26, 21, 2, -3, -16, -1, 2, -9, -2, 3, -18, -14, -2, -4, -1, 1, -12, 2, 2, -18, 0, 4, -16, -5, -8, 3, 8, Field.CONTROL, 82, Field.FILESIZE, Field.ADVANCE, Field.CONTROL, 76, Field.FORMDROPDOWN, Field.HYPERLINK, Field.INCLUDEPICTURE, 80, Field.FORMDROPDOWN, Field.MERGESEQ, Field.INCLUDEPICTURE, Field.NOTEREF, Field.TOA, 80, Field.FILESIZE, Field.ADDRESSBLOCK, Field.INCLUDEPICTURE, Field.CONTROL, Field.TOA, Field.FORMCHECKBOX, Field.FORMDROPDOWN, 82, Field.NOTEREF, 58, Field.AUTONUM, 42, 48, Field.DATA, Field.MACROBUTTON, Field.ASK, 42, Field.AUTONUM, Field.AUTONUMLGL, 59, 44, Field.BARCODE, 59, -35, -38, -39, -40, -35, -39, -36, -49, -50, -55, -34, -36, -53, -40, -35, -42, -53, -34, -45, -39, -40, -7, -6, -25, -8, -27, -8, -25, -6, -17, -12, -19, 7, 9, -10, 8, -3, 8, 0, -7, -3, -14, -3, -11, -18, 7, 5, -9, -10, -15, 4, -9, 2, 1, 4, 6, -15, 7, 4, -2, Field.HTMLCONTROL, 78, Field.TOA, 74, Field.ADVANCE, Field.INCLUDETEXT, Field.FORMTEXT, Field.LISTNUM, Field.AUTOTEXTLIST, Field.ADVANCE, Field.DOCPROPERTY, Field.ADDIN, Field.FORMTEXT, Field.GREETINGLINE, Field.INCLUDETEXT, 74, Field.FORMDROPDOWN, Field.FORMTEXT, Field.FORMCHECKBOX, Field.ADDIN, 74, Field.TOA, Field.LISTNUM, 77, Field.NOTEREF, Field.TOA, Field.FORMDROPDOWN, Field.INCLUDEPICTURE, Field.ADDIN, Field.ADVANCE, Field.NOTEREF, Field.EQ, 36, 31, 32, 42, 26, 43, Field.DDE, 32, Field.FILLIN, 42, Field.NUMCHARS, 31, 26, Field.DDEAUTO, 36, Field.AUTONUMLGL, 32, 26, 29, Field.AUTONUMOUT, Field.GLOSSARY, 32, Field.DDEAUTO, -23, -36, -41, -40, -30, -46, -24, -27, -33, Field.GOTOBUTTON, Field.PAGEREF, 33, Field.MACROBUTTON, 29, 30, Field.PAGEREF, Field.DATA, Field.PAGEREF, 48, Field.AUTONUMLGL, Field.NUMWORDS, 31, 36, 33, 31, Field.FILLIN, Field.NUMWORDS, Field.PAGEREF, 42, Field.PAGEREF, 48, Field.PAGEREF, 29, Field.DATA, Field.NUMWORDS, 32, 33, Field.DATA, 29, Field.AUTONUMLGL, 43, 30, 26, 44, 22, 23, 30, 33, 30, 41, Field.DDEAUTO, 20, 24, 29, 26, 24, 32, 20, 30, Field.QUOTE, 41, 26, Field.FILLIN, 43, 22, 33};
    }

    static {
        A03();
    }

    public static C1461cI A00(C1314Zs c1314Zs, JSONObject jSONObject, String str) {
        return A01(c1314Zs, jSONObject, str, false, -1, 0);
    }
}
