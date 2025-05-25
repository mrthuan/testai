package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1456cD extends C1E implements Serializable {
    public static JSONObject A0F = null;
    public static byte[] A0G = null;
    public static String[] A0H = {"MTFiGS2hyLPfirnVlCyKu8FL5ydCU71a", "6CtUdYtPnHS0iwt", "3FBcQYGRSJhXKbj7ODsddhFyR1abGnGF", "UQ7LtGE24TX4QkAlsGDlXXS4Vcev", "JcPJu", "s3C", "M3uL5ar3Pz1QrNsTamNzt8iOeyqnSnZC", "bpoJK"};
    public static final LinkedHashMap<String, String> A0I;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1B A05;
    public C1T A06;
    public C1W A07;
    public C1Z A08;
    public C04621f A09;
    public String A0A;
    public final List<C1F> A0D;
    public boolean A0B = false;
    public boolean A0C = false;
    public final Map<String, String> A0E = new HashMap();

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0G = new byte[]{Field.ADDIN, Field.ADVANCE, 111, Field.FORMDROPDOWN, Field.HYPERLINK, Field.SHAPE, Field.AUTOTEXTLIST, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.INCLUDEPICTURE, 111, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.HTMLCONTROL, 111, Field.FILESIZE, Field.SECTIONPAGES, Field.BIDIOUTLINE, 122, 117, Field.INCLUDETEXT, 119, 116, 124, 116, Field.INCLUDETEXT, 111, 98, 107, 126, 29, 9, 8, 19, 31, 16, 21, 31, 23, Field.QUOTE, 31, 19, 9, 18, 8, 24, 19, 11, 18, Field.QUOTE, 8, 21, 17, 25, Field.AUTONUMLGL, 33, 32, 59, Field.IMPORT, 56, 61, Field.IMPORT, Field.BARCODE, 11, Field.IMPORT, 32, Field.AUTONUMLGL, 11, 32, 61, Field.SYMBOL, Field.EQ, 76, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.SECTIONPAGES, 78, Field.SECTION, Field.INCLUDETEXT, 78, Field.FORMTEXT, 114, Field.MERGESEQ, Field.SECTION, 76, Field.HTMLCONTROL, Field.SECTIONPAGES, Field.SHAPE, Field.DOCPROPERTY, Field.CONTROL, Field.DOCPROPERTY, Field.GREETINGLINE, Field.FORMDROPDOWN, 105, Field.CONTROL, Field.FILESIZE, Field.FILESIZE, Field.FORMDROPDOWN, Field.SECTIONPAGES, Field.FILESIZE, Field.DDE, Field.GLOSSARY, 60, 33, 59, 61, 43, 34, 59, 48, Field.SYMBOL, Field.EQ, Field.AUTONUM, 7, Field.SYMBOL, 60, 43, 7, Field.USERADDRESS, 42, 61, 41, Field.DDE, 61, Field.AUTONUM, 59, 33, 15, 3, 1, Field.SECTIONPAGES, 10, 13, 15, 9, 14, 3, 3, 7, Field.SECTIONPAGES, 13, 8, 31, Field.SECTIONPAGES, 5, 2, 24, 9, 30, 31, 24, 5, 24, 5, 13, 0, Field.SECTIONPAGES, 10, 5, 2, 5, 31, 4, Field.MACROBUTTON, 13, 15, 24, 5, 26, 5, 24, 21, 6, 17, Field.HTMLCONTROL, 76, Field.FORMDROPDOWN, 96, Field.GREETINGLINE, Field.AUTOTEXT, Field.AUTOTEXT, 96, Field.ADDRESSBLOCK, 80, 74, Field.ADDIN, Field.HTMLCONTROL, 96, 74, 77, Field.FORMDROPDOWN, 76, 36, 32, 118, Field.QUOTE, 29, Field.PAGEREF, Field.GOTOBUTTON, 29, Field.DDE, Field.AUTONUMOUT, Field.FILLIN, 48, Field.DDEAUTO, Field.QUOTE, 59, 29, Field.EQ, Field.FILLIN, 33, Field.IMPORT, 48, Field.FILLIN, 29, Field.AUTONUM, Field.DDE, 41, Field.FILLIN, 44, 101, 111, 99, 98, Field.ADVANCE, Field.FORMDROPDOWN, 78, Field.TOA, Field.BIDIOUTLINE, Field.ADDIN, Field.ADDIN, 98, Field.AUTOTEXT, Field.HYPERLINK, Field.HTMLCONTROL, Field.HYPERLINK, Field.AUTOTEXT, Field.AUTOTEXT, Field.HYPERLINK, Field.AUTOTEXT, 120, Byte.MAX_VALUE, 101, 116, 99, 98, 101, 120, 101, 120, 112, 125, Field.INCLUDEPICTURE, 78, Field.SECTION, Field.MERGESEQ, Field.BIDIOUTLINE, 76, 78, Field.SHAPE, 74, 86, Field.HTMLCONTROL, Field.INCLUDEPICTURE, Field.DOCPROPERTY, Field.AUTOTEXT, 78, 82, 77, 80, 86, 80, Field.INCLUDEPICTURE, Field.MERGESEQ, 86, 31, 8, 26, 12, 31, 9, 8, 9, Field.GOTOBUTTON, Field.NUMWORDS, 4, 9, 8, 2, Field.INCLUDETEXT, Field.SHAPE, Field.HYPERLINK, Field.SECTIONPAGES, Field.HTMLCONTROL, Field.FORMDROPDOWN, 104, Field.HTMLCONTROL, Field.HYPERLINK, 80, 104, 86, Field.AUTOTEXTLIST, 78, 104, Field.GREETINGLINE, 86, Field.DOCPROPERTY, 104, Field.ADVANCE, Field.HTMLCONTROL, Field.GREETINGLINE, Field.ADVANCE, Field.BIDIOUTLINE, 104, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.ADVANCE, 82, 126, 99, 126, 102, 111, 13, 10, 20};
    }

    static {
        A09();
        A0I = new LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC1456cD(List<C1F> list) {
        this.A0D = list;
    }

    public static String A06(String str) {
        return A0I.get(str);
    }

    private HashMap<String, String> A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(ShapeTypes.FUNNEL, 18, 79));
        HashMap<String, String> hashMap = new HashMap<>();
        if (optJSONObject == null) {
            return hashMap;
        }
        Iterator<String> nameItr = optJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                hashMap.put(next, optJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static List<C1F> A08(JSONObject jSONObject, C1314Zs c1314Zs, C1R c1r) {
        JSONArray optJSONArray = jSONObject.optJSONArray(A05(101, 8, 62));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            return C1N.A01(optJSONArray, jSONObject, c1314Zs, c1r);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C1F A00 = C1F.A00(jSONObject);
        c1r.A3j(A00, jSONObject);
        adInfoList.add(A00);
        return adInfoList;
    }

    private void A0A(int i10) {
        this.A00 = i10;
    }

    private final void A0B(int i10) {
        this.A04 = i10;
    }

    private void A0C(C1B c1b) {
        this.A05 = c1b;
    }

    private final void A0D(C1T c1t) {
        this.A06 = c1t;
    }

    private void A0E(C1W c1w) {
        this.A07 = c1w;
    }

    private final void A0F(C1Z c1z) {
        this.A08 = c1z;
    }

    private void A0G(C04621f c04621f) {
        this.A09 = c04621f;
    }

    private void A0H(String str) {
        this.A0A = str;
    }

    public final int A1J() {
        return this.A00;
    }

    public final int A1K() {
        return this.A01;
    }

    public final int A1L() {
        return this.A02;
    }

    public final int A1M() {
        return this.A03;
    }

    public final int A1N() {
        return this.A04;
    }

    public final C1B A1O() {
        return this.A05;
    }

    public final C1F A1P() {
        return this.A0D.get(0);
    }

    public final C1T A1Q() {
        return this.A06;
    }

    public final C1W A1R() {
        return this.A07;
    }

    public final C1Z A1S() {
        return this.A08;
    }

    public final C04621f A1T() {
        return this.A09;
    }

    public final String A1U() {
        return this.A0A;
    }

    public final String A1V(String str) {
        return this.A0E.get(str);
    }

    public final List<C1F> A1W() {
        return Collections.unmodifiableList(this.A0D);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A1X(MR mr) {
        char c;
        String A0c = A0c();
        switch (A0c.hashCode()) {
            case -1364000502:
                if (A0c.equals(A05(276, 14, 29))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (A0c.equals(A05(241, 12, 97))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                mr.A4P(A05(128, 45, 28));
                break;
            case 1:
                break;
            default:
                return;
        }
        mr.A4P(EnumC1087Qv.A08.A03());
    }

    public final void A1Y(JSONObject jSONObject) {
        String A05;
        A0D(C1T.A00(jSONObject.optJSONObject(A05(225, 16, 77))));
        A0F = jSONObject.optJSONObject(A05(89, 12, 70));
        C1Y A06 = new C1Y().A06(jSONObject.optString(A05(319, 5, 122)));
        String A052 = A05(221, 4, 124);
        if (jSONObject.optJSONObject(A052) != null) {
            A05 = jSONObject.optJSONObject(A052).optString(A05(324, 3, 8));
        } else {
            A05 = A05(0, 0, 15);
        }
        A0F(A06.A05(A05).A04(jSONObject.optString(A05(0, 19, 64))).A07(AbstractC04571a.A03(jSONObject)).A08());
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(262, 6, 74));
        JSONObject layoutObject = optJSONObject != null ? optJSONObject.optJSONObject(A05(268, 8, 82)) : null;
        C1O A01 = C1O.A01(layoutObject);
        String[] strArr = A0H;
        if (strArr[1].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[2] = "MaJS3iOjDVpkOvzQIu4XnTvkYtI43ENf";
        strArr2[6] = "dcadpZfpRdAwhtf1LK3imqQWfZ9Fu8JJ";
        A0C(new C1B(A01, C1O.A01(optJSONObject != null ? optJSONObject.optJSONObject(A05(253, 9, 95)) : null)));
        A0G(AbstractC04571a.A01(jSONObject));
        A0E(AbstractC04571a.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 107), 0));
        A0B(jSONObject.optInt(A05(109, 19, 40), -1));
        this.A0E.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(55, 18, 36), 0);
        this.A01 = jSONObject.optInt(A05(73, 16, 93), 1);
        this.A0C = jSONObject.optBoolean(A05(290, 29, 71), false);
        this.A02 = jSONObject.optInt(A05(31, 24, 12), this.A03);
        String optString = jSONObject.optString(A05(ShapeTypes.GEAR_6, 2, 21));
        A0H(optString);
        A0I.put(optString, jSONObject.optString(A05(193, 28, 50)));
        A0w(jSONObject);
    }

    public final void A1Z(boolean z10) {
        this.A0B = z10;
    }

    public final boolean A1a() {
        return this.A0B;
    }

    public final boolean A1b() {
        return this.A0C;
    }
}
