package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.Arrays;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1F implements Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C1H A00;
    public C1I A01;
    public C1M A02;
    public C1P A03;
    public C1Q A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{103, Field.LISTNUM, 14, Field.AUTOTEXTLIST, Field.FORMCHECKBOX, Field.SECTIONPAGES, Field.SECTIONPAGES, 14, Field.AUTOTEXT, Field.HTMLCONTROL, Field.LISTNUM, Field.SECTION, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.LISTNUM, Field.FORMCHECKBOX, 77, Field.AUTOTEXT, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.CONTROL, 14, Field.SECTION, Field.GREETINGLINE, Field.MERGESEQ, 64, 14, Field.FORMCHECKBOX, 64, 14, 117, Field.ADDRESSBLOCK, Field.MERGESEQ, 77, Field.ADDRESSBLOCK, 115, Field.ADDRESSBLOCK, Field.NUMWORDS, 30, Field.PAGEREF, 25, 8, 31, Field.NUMWORDS, 14, 19, 12, 31, Field.PAGEREF, 14, 3, 10, 31, Field.FORMCHECKBOX, 86, 86, 121, Field.DOCPROPERTY, Field.AUTOTEXT, Field.BIDIOUTLINE, Field.INCLUDEPICTURE, 56, Field.AUTONUMLGL, Field.USERADDRESS, Field.QUOTE, Field.DOCPROPERTY, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, Field.HYPERLINK, Field.AUTOTEXTLIST, 104, Field.GREETINGLINE, Field.ADVANCE, Field.HYPERLINK, Field.AUTOTEXTLIST, 100, 102, 107, 107, Field.HYPERLINK, 115, 104, Field.HYPERLINK, 102, 100, 115, 110, 104, 105, 100, 102, 115, 98, 96, 104, 117, 126, 10, 11, 2, 15, 23, Field.EQ, 13, 2, 7, 13, 5, Field.EQ, 26, 11, 22, 26, Field.AUTONUMLGL, Field.AUTONUMOUT, 34, Field.PAGEREF, 56, Field.BARCODE, 48, Field.PAGEREF, 56, Field.USERADDRESS, Field.BARCODE, 14, Field.PAGEREF, 56, Field.PAGEREF, 61, Field.AUTONUMOUT, Field.FORMTEXT, 77, Field.DOCPROPERTY, 76, 78, 77, Field.INCLUDEPICTURE, Field.FORMTEXT, 125, Field.SECTION, 77, Field.CONTROL, 76, 86, Field.TOA, Field.SECTIONPAGES, Field.NOTEREF, 115, Field.AUTOTEXT, 77, Field.GREETINGLINE, Field.NOTEREF, 115, 74, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.AUTOTEXT, Field.TOA, 115, Field.LISTNUM, Field.FILESIZE, Field.TOA, Field.HTMLCONTROL, 115, Field.HYPERLINK, Field.FILESIZE, Field.SECTION, Field.TOA, 101, 110, 100, Field.SHAPE, 99, 97, 114, 100, Field.SHAPE, 105, 109, 97, 103, 101, 115, 32, 36, Field.FILLIN, 34, 25, Field.PAGEREF, 41, 43, 43, Field.FILLIN, Field.DATA, 34, 114, 112, 123, 112, 103, 124, 118, 74, 97, 112, 109, 97, 109, 96, 108, 98, 109, 113, 19, 23, Field.NUMWORDS, 29, 31, Field.NOTEREF, 82, 126, Field.FORMDROPDOWN, Field.INCLUDETEXT, 86, 64, Field.FORMDROPDOWN, Field.FILESIZE, Field.INCLUDETEXT, Field.FILESIZE, 126, 64, Field.FILESIZE, 120, 98, 78, 103, 120, 117, 116, 126, 78, 112, 100, 117, 120, 126, 78, 124, 100, 101, 116, 117, 31, 5, 41, 1, 23, 2, 21, 30, 41, 23, 24, 18, 41, 20, 4, 25, 1, 5, 19, Field.FILESIZE, Field.ADVANCE, 86, Field.GREETINGLINE, Field.ADVANCE, 82, 80, 82, Field.SECTION, Field.ADVANCE, Field.TOA, 78, Field.FORMCHECKBOX, Byte.MAX_VALUE, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.DOCPROPERTY, 78, Field.ADVANCE, 41, 58, Field.GLOSSARY, Field.GOTOBUTTON, Field.AUTONUMLGL, 60, 4, Field.DDE, 58, Field.IMPORT, Field.DDEAUTO, Field.USERADDRESS, Field.AUTONUMLGL, Field.QUOTE, Field.PAGEREF, 41, Field.DATA, 34, Field.AUTONUMLGL, 25, 32, 41, Field.AUTONUMOUT, 25, Field.AUTONUMOUT, Field.QUOTE, Field.EQ, Field.FILLIN, Field.AUTONUMOUT, 34, 119, 108, 107, 115, Field.HTMLCONTROL, 97, 106, 96, Field.HTMLCONTROL, 103, 101, 118, 96, 118, 109, 106, 114, Field.LISTNUM, 96, 125, 108, 113, Field.LISTNUM, 113, 119, 100, 107, 118, 108, 113, 108, 106, 107, 97, 122, 125, 101, 77, 123, 124, 102, 96, 125, 77, 102, 96, 115, 124, 97, 123, 102, 123, 125, 124, 56, 32, 34, 59, 20, 42, Field.PAGEREF, Field.GLOSSARY, 20, Field.FILLIN, 36, 56, Field.DDEAUTO, 20, Field.SYMBOL, Field.DDEAUTO, 60, 42, Field.SYMBOL, Field.GLOSSARY, 119, 111, 109, 116, 116, 101, 102, 104, 97, Field.HTMLCONTROL, 119, 97, 103, 107, 106, 96, 119, Field.INCLUDETEXT, Field.HYPERLINK, Field.ADVANCE, Field.GREETINGLINE, 86, Field.HTMLCONTROL, 104, Field.ADVANCE, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, 82, Field.AUTOTEXT, Field.INCLUDEPICTURE, Field.PAGEREF, Field.QUOTE, Field.AUTONUMOUT, 34, Field.BARCODE, 34, 58, Field.MACROBUTTON, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.HTMLCONTROL, 82, Field.FILLIN, 60, 33, Field.SYMBOL, 59, 34, 34, Field.MACROBUTTON, 48, Field.USERADDRESS, Field.IMPORT, 13, 33, Field.IMPORT, Field.EQ, 61, 60, Field.AUTONUM, 33, 119, 112, 110, 36, 59, Field.AUTONUM, Field.IMPORT, 61, 13, Field.MACROBUTTON, Field.FILLIN, Field.ASK, 61, 34, Field.USERADDRESS, Field.MACROBUTTON, 43, 13, Field.IMPORT, 60, Field.MACROBUTTON, 48, Field.USERADDRESS, Field.IMPORT, Field.AUTONUM, 100, 123, 118, 119, 125, 77, 118, 103, 96, 115, 102, 123, 125, 124, 77, 97, 119, 113, Field.AUTOTEXTLIST, Field.FORMTEXT, Field.MERGESEQ, 74, 64, 112, Field.SHAPE, Field.ADDRESSBLOCK, 74, Field.INCLUDEPICTURE, 64, 78, Field.MERGESEQ, 112, Field.BIDIOUTLINE, Field.FORMTEXT, Field.DOCPROPERTY, 74, 112, 77, 86, Field.HTMLCONTROL, 74, Field.BIDIOUTLINE, 120, 103, 106, 107, 97, Field.ADDIN, 123, 124, 98, Field.FORMCHECKBOX, Field.AUTOTEXTLIST, Field.ADVANCE, Field.INCLUDETEXT, Field.HYPERLINK};
    }

    public static C1F A00(JSONObject jSONObject) {
        int optInt;
        C1F c1f = new C1F();
        c1f.A06(new C1L().A0L(jSONObject.optString(A01(434, 5, 46))).A0K(jSONObject.optString(A01(426, 8, 79))).A0E(jSONObject.optString(A01(61, 4, 67))).A0J(jSONObject.optString(A01(TTAdConstant.IMAGE_URL_CODE, 14, 46))).A0I(jSONObject.optString(A01(291, 12, 66))).A0H(jSONObject.optString(A01(279, 12, 57))).A0C(jSONObject.optString(A01(53, 8, 63))).A0G(jSONObject.optString(A01(ShapeTypes.PLUS, 14, 59))).A0B(jSONObject.optString(A01(37, 16, 99))).A0D(jSONObject.optString(A01(90, 8, 30))).A0F(jSONObject.optString(A01(114, 17, 72))).A0M());
        c1f.A09(jSONObject.optString(A01(272, 7, 44)));
        c1f.A07(new C1P(jSONObject.optString(A01(ShapeTypes.PLAQUE_TABS, 12, 95)), jSONObject.optString(A01(76, 14, 30)), jSONObject.optJSONObject(A01(65, 11, 46)), jSONObject.optString(A02(jSONObject))));
        String A01 = A01(439, 19, 75);
        if (jSONObject.optInt(A01, -1) == -1) {
            optInt = jSONObject.optInt(A01(395, 17, 29), -1);
        } else {
            optInt = jSONObject.optInt(A01, -1);
        }
        C1H A0I = new C1H().A0J(jSONObject.optString(A01(525, 9, 23))).A0H(jSONObject.optLong(A01(PglCryptUtils.LOAD_SO_FAILED, 24, 54), -1L)).A0D(optInt).A0C(jSONObject.optInt(A01(303, 18, 95), Api.BaseClientBuilder.API_PRIORITY_OTHER)).A0I(C04581b.A01(jSONObject));
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(214, 5, 99));
        if (optJSONObject != null) {
            A0I.A0K(optJSONObject.optString(A01(458, 3, 27))).A0G(optJSONObject.optInt(A01(534, 5, 41))).A0F(optJSONObject.optInt(A01(208, 6, 28)));
        }
        c1f.A04(A0I);
        c1f.A0D(jSONObject.optBoolean(A01(354, 21, 11)));
        c1f.A08(new C1Q(LV.A04(jSONObject.optJSONArray(A01(ShapeTypes.ACTION_BUTTON_RETURN, 15, 25))), jSONObject.optLong(A01(ShapeTypes.FLOW_CHART_PUNCHED_TAPE, 24, 53), 0L)));
        c1f.A0A(jSONObject.optBoolean(A01(253, 19, 111)));
        return c1f;
    }

    public static String A02(JSONObject jSONObject) {
        String A01 = A01(98, 16, 119);
        String A012 = A01(0, 37, 55);
        String optString = jSONObject.optString(A01, A012);
        if (optString.equals(A012)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(196, 12, 12));
            if (optJSONObject != null) {
                A012 = optJSONObject.optString(A01, A012);
            }
            return A012;
        }
        return optString;
    }

    private void A04(C1H c1h) {
        this.A00 = c1h;
    }

    private final void A05(C1I c1i) {
        this.A01 = c1i;
    }

    private final void A06(C1M c1m) {
        this.A02 = c1m;
    }

    private final void A07(C1P c1p) {
        this.A03 = c1p;
    }

    private final void A08(C1Q c1q) {
        this.A04 = c1q;
    }

    private final void A09(String str) {
        this.A05 = str;
    }

    private final void A0A(boolean z10) {
        this.A07 = z10;
    }

    private final void A0B(boolean z10) {
        this.A08 = z10;
    }

    private final void A0C(boolean z10) {
        this.A09 = z10;
    }

    private final void A0D(boolean z10) {
        this.A0A = z10;
    }

    public final C1I A0E() {
        return this.A01;
    }

    public final C1M A0F() {
        return this.A02;
    }

    public final C1P A0G() {
        return this.A03;
    }

    public final C1Q A0H() {
        return this.A04;
    }

    public final String A0I() {
        return this.A05;
    }

    public final void A0J(JSONObject jSONObject) {
        A05(this.A00.A0O());
    }

    public final void A0K(JSONObject jSONObject) {
        this.A00.A0M(jSONObject.optBoolean(A01(461, 22, 75)));
        this.A00.A0L(jSONObject.optBoolean(A01(UnknownRecord.BITMAP_00E9, 20, 8), true));
        A05(this.A00.A0O());
        A0N(jSONObject.optBoolean(A01(219, 14, 56)));
        A0B(jSONObject.optBoolean(A01(321, 13, 29)));
        A0C(jSONObject.optBoolean(A01(334, 20, 28)));
    }

    public final void A0L(JSONObject jSONObject) {
        this.A00.A0L(jSONObject.optBoolean(A01(UnknownRecord.BITMAP_00E9, 20, 8), true));
        A05(this.A00.A0O());
    }

    public final void A0M(JSONObject jSONObject) {
        this.A00.A0E(jSONObject.optInt(A01(483, 18, 11)));
        this.A00.A0L(jSONObject.optBoolean(A01(UnknownRecord.BITMAP_00E9, 20, 8), true));
        this.A00.A0N(jSONObject.optBoolean(A01(375, 20, 82), false));
        A05(this.A00.A0O());
        A0B(jSONObject.optBoolean(A01(321, 13, 29)));
    }

    public final void A0N(boolean z10) {
        this.A06 = z10;
    }

    public final boolean A0O() {
        return this.A06;
    }

    public final boolean A0P() {
        return this.A07;
    }

    public final boolean A0Q() {
        return this.A08;
    }

    public final boolean A0R() {
        return this.A0A;
    }
}
