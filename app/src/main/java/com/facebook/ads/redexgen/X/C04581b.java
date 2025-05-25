package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04581b implements Serializable {
    public static byte[] A0I = null;
    public static final EnumC04591c A0J;
    public static final OC A0K;
    public static final long serialVersionUID = -5352540123250859603L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final EnumC04591c A08;
    public final OC A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0I = new byte[]{Field.SHAPE, 99, 110, 118, Field.GLOSSARY, Field.BIDIOUTLINE, 123, 96, 125, 106, Field.GLOSSARY, 120, 102, 99, 99, Field.GLOSSARY, 110, 122, 123, 96, 98, 110, 123, 102, 108, 110, 99, 99, 118, Field.GLOSSARY, 96, Byte.MAX_VALUE, 106, 97, Field.GLOSSARY, 102, 97, Field.GLOSSARY, Field.ADVANCE, 124, 106, 108, 124, 82, 124, 34, 30, 19, 11, 19, 16, 30, 23, 82, 19, 22, Field.AUTOTEXTLIST, 110, 124, 106, 121, 111, 110, 111, 43, Field.HTMLCONTROL, 103, 106, 114, Field.EQ, Field.USERADDRESS, 59, Field.IMPORT, 60, Field.ASK, 13, Field.ASK, 61, Field.SYMBOL, Field.IMPORT, 60, Field.NUMCHARS, 11, Field.LISTNUM, Field.HTMLCONTROL, 82, Field.SHAPE, Field.FORMCHECKBOX, 97, Field.ADDRESSBLOCK, 82, Field.CONTROL, Field.ADDRESSBLOCK, Field.DOCPROPERTY, 97, 74, Field.HTMLCONTROL, Field.FORMTEXT, 74, 124, 119, 120, 123, 117, 124, Field.FORMTEXT, 124, 119, 125, Field.FORMTEXT, 122, 120, 107, 125, 20, 31, 16, 19, 29, 20, Field.DDEAUTO, 24, 31, 5, 3, 30, Field.DDEAUTO, 18, 16, 3, 21, 56, 58, Field.EQ, 58, Field.DDE, Field.AUTONUM, 60, 0, 43, 58, Field.FILLIN, 43, 4, 3, 30, 25, 12, 3, 14, 8, Field.GOTOBUTTON, 4, 9, 23, 16, 10, 12, 17, 33, 29, 31, 12, 26, 33, 23, 29, 17, 16, 33, 11, 12, 18, Field.SECTIONPAGES, Field.HYPERLINK, 116, Field.HTMLCONTROL, Field.FORMCHECKBOX, 74, 82, 74, Field.TOA, Field.FORMCHECKBOX, 78, 116, Field.AUTOTEXTLIST, 78, Field.FORMTEXT, Field.INCLUDETEXT, Field.SHAPE, 78, 116, 77, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.FORMTEXT, 74, Field.SHAPE, 109, 112, 107, 103, 108, 118, 99, 118, 107, 109, 108, 99, Byte.MAX_VALUE, 114, 106, 61, 116, 124, 124, 116, Byte.MAX_VALUE, 118, 61, 112, 124, 126, 14, 18, 31, 7, 31, Field.NUMCHARS, 18, Field.NUMWORDS, 33, 26, 31, 10, 31, Field.ADDRESSBLOCK, Field.SECTION, 76, Field.ADVANCE, 76, Field.AUTOTEXT, Field.SECTION, Field.NOTEREF, 114, Field.NOTEREF, Field.INCLUDEPICTURE, Field.TOA, 114, 78, 76, Field.SHAPE, Field.TOA, 114, Field.TOA, Field.NOTEREF, Field.GREETINGLINE, 78, 105, 117, 120, 96, 120, 123, 117, 124, Field.FORMTEXT, 112, 119, 109, 107, 118, Field.FORMTEXT, 122, 120, 107, 125, Field.FORMTEXT, 125, 124, 106, 122, Field.BIDIOUTLINE, 64, 77, Field.DOCPROPERTY, 77, 78, 64, Field.TOA, 115, Field.GREETINGLINE, Field.TOA, Field.NOTEREF, Field.TOA, Field.SHAPE, Field.FILESIZE, Field.MERGESEQ, Field.SECTIONPAGES, 115, Field.TOA, Field.SECTIONPAGES, 77, 78, 64, Field.TOA, Field.NOTEREF, Field.FORMDROPDOWN, Field.ADDIN, Field.FORMTEXT, 64, Field.SECTIONPAGES, 64, Field.MERGESEQ, 74, 77, Field.INCLUDETEXT, 124, 78, Field.FORMTEXT, Field.CONTROL, Field.MERGESEQ, 76, Field.FORMCHECKBOX, 123, 108, 126, 104, 123, 109, 108, 109, 86, 121, 101, 104, 112, 86, 125, 108, 113, 125, 20, 12, 14, 23, 23, 6, 5, 11, 2, 56, 20, 2, 4, 8, 9, 3, 20, Field.AUTONUM, Field.DDE, 48, Field.DATA, 42, Field.MACROBUTTON, Field.MACROBUTTON, 34, 33, Field.GLOSSARY, Field.ASK, Field.NUMCHARS, 48, Field.ASK, 32, 44, Field.DDE, Field.FILLIN, 48, Field.GLOSSARY, Field.DATA, Field.MACROBUTTON, Field.EQ, Field.DDEAUTO, Field.QUOTE, 34, Field.DATA, 24, 43, 34, Field.ASK, Field.QUOTE, Field.DDEAUTO, 41, 32, 24, Field.IMPORT, 43, Field.ASK, Field.USERADDRESS, Field.ASK, Field.PAGEREF, 43, 34, 24, 34, 41, Field.ASK, Field.PAGEREF, 43, 34, Field.QUOTE, 32, Field.BARCODE, Field.GOTOBUTTON, Field.MACROBUTTON, Field.SYMBOL, 9, 58, Field.MACROBUTTON, Field.IMPORT, Field.GOTOBUTTON, Field.BARCODE, 56, Field.EQ, 9, Field.ASK, 58, Field.IMPORT, Field.GLOSSARY, Field.IMPORT, Field.AUTONUMOUT, 58, Field.MACROBUTTON, 9, Field.QUOTE, 56, Field.PAGEREF, 61, Field.BARCODE, Field.ASK, Field.ASK, Field.IMPORT, Field.AUTONUMOUT, 58, Field.MACROBUTTON, 9, 34, Field.BARCODE, 59, Field.MACROBUTTON, Field.ADVANCE, Field.FORMTEXT, Field.SECTION, 124, Field.DOCPROPERTY, 74, Field.FORMTEXT, Field.ADVANCE, 124, Field.CONTROL, 74, 78, Field.FORMTEXT, 76, 86, Field.CONTROL, 124, 74, 77, 124, 78, 74, Field.AUTOTEXT, Field.AUTOTEXT, 74, 80, Field.FORMTEXT, 64, 76, 77, Field.FORMCHECKBOX, 80};
    }

    static {
        A06();
        A0K = OC.A04;
        A0J = EnumC04591c.A03;
    }

    public C04581b(String str, String str2, int i10, String str3, String str4, OC oc2, int i11, boolean z10, boolean z11, EnumC04591c enumC04591c, boolean z12, String str5, boolean z13, boolean z14, int i12, String str6, String str7) {
        if (z12) {
            this.A0D = UUID.randomUUID().toString();
            this.A0C = L5.A00(str).buildUpon().appendQueryParameter(A03(ShapeTypes.FLOW_CHART_CONNECTOR, 11, 90), this.A0D).appendQueryParameter(A03(69, 12, 101), str5).build().toString();
        } else {
            this.A0C = str;
            this.A0D = null;
        }
        this.A0B = str2;
        this.A06 = i10;
        this.A0E = str3;
        this.A0A = str4;
        this.A09 = oc2;
        this.A07 = i11;
        this.A0G = z10;
        this.A0F = z11;
        this.A08 = enumC04591c;
        this.A0H = z12;
        this.A05 = z13;
        this.A04 = z14;
        this.A00 = i12;
        this.A03 = str6;
        this.A02 = str7;
    }

    public static int A00(JSONObject jSONObject) {
        String A03 = A03(343, 17, 80);
        if (jSONObject.has(A03)) {
            return jSONObject.optInt(A03);
        }
        return jSONObject.optInt(A03(360, 19, 116), 0);
    }

    public static C04581b A01(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(224, 13, 73));
        if (optJSONObject == null) {
            return null;
        }
        EnumC04591c A00 = EnumC04591c.A00(optJSONObject.optString(A03(308, 17, 20), A0J.name()));
        String precachingMethodStr = A03(382, 30, 112);
        boolean optBoolean = optJSONObject.optBoolean(precachingMethodStr, false);
        String precachingMethodStr2 = A03(379, 3, 109);
        String optString = optJSONObject.optString(precachingMethodStr2);
        String precachingMethodStr3 = A03(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 19, 73);
        String optString2 = optJSONObject.optString(precachingMethodStr3);
        int A002 = A00(jSONObject);
        String A05 = A05(optJSONObject);
        String A04 = A04(optJSONObject);
        OC A02 = A02(optJSONObject);
        int optInt = optJSONObject.optInt(A03(451, 32, 20), 5000);
        boolean z10 = !optBoolean && optJSONObject.optBoolean(A03(114, 17, 70), true);
        String precachingMethodStr4 = A03(99, 15, 46);
        boolean optBoolean2 = optJSONObject.optBoolean(precachingMethodStr4);
        String precachingMethodStr5 = A03(ShapeTypes.GEAR_6, 25, 28);
        boolean optBoolean3 = optJSONObject.optBoolean(precachingMethodStr5);
        String precachingMethodStr6 = A03(81, 2, 72);
        String optString3 = jSONObject.optString(precachingMethodStr6);
        String precachingMethodStr7 = A03(283, 25, 27);
        boolean optBoolean4 = optJSONObject.optBoolean(precachingMethodStr7, false);
        String precachingMethodStr8 = A03(TTAdConstant.IMAGE_URL_CODE, 39, 97);
        return new C04581b(optString, optString2, A002, A05, A04, A02, optInt, z10, optBoolean2, A00, optBoolean3, optString3, optBoolean, optBoolean4, optJSONObject.optInt(precachingMethodStr8, 5), jSONObject.optString(A03(259, 24, 46), A03(45, 11, 69)), jSONObject.optString(A03(237, 22, 26), A03(209, 15, 36)));
    }

    public static OC A02(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A03(198, 11, 53), A0K.A04());
        return OC.A00(orientation);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(ShapeTypes.PLUS, 12, 104));
        String A03 = A03(0, 45, 56);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(83, 16, 9), A03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(ShapeTypes.PLUS, 12, 104));
        String A03 = A03(56, 13, 60);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(325, 18, 62), A03);
    }

    public final int A07() {
        return this.A06;
    }

    public final int A08() {
        return this.A00;
    }

    public final int A09() {
        return this.A07;
    }

    public final EnumC04591c A0A() {
        return this.A08;
    }

    public final OC A0B() {
        return this.A09;
    }

    public final String A0C() {
        return this.A01;
    }

    public final String A0D() {
        return this.A0A;
    }

    public final String A0E() {
        return this.A0B;
    }

    public final String A0F() {
        return this.A0C;
    }

    public final String A0G() {
        return this.A02;
    }

    public final String A0H() {
        return this.A03;
    }

    public final String A0I() {
        return this.A0D;
    }

    public final String A0J() {
        return this.A0E;
    }

    public final void A0K(String str) {
        this.A01 = str;
    }

    public final boolean A0L() {
        return this.A0G;
    }

    public final boolean A0M() {
        return this.A04;
    }

    public final boolean A0N() {
        return this.A0H;
    }

    public final boolean A0O() {
        return this.A05;
    }
}
