package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1454cB extends C1E implements Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final List<AbstractC1456cD> A0A;
    public final ArrayList<Integer> A09 = new ArrayList<>();
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public String A04 = A04(190, 2, 71);
    public final String A08 = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{Field.ADDRESSBLOCK, Field.HYPERLINK, Field.AUTOTEXT, 117, 126, 119, Byte.MAX_VALUE, 120, Field.TOA, 102, 119, 100, 119, 123, 101, 17, 26, 19, Field.NUMWORDS, Field.NUMCHARS, 23, 22, Field.DDE, 19, 22, 1, Field.DDE, 17, 29, 7, Field.NUMCHARS, 6, Field.AUTONUM, 61, Field.AUTONUMOUT, 60, 59, 48, Field.EQ, 10, Field.AUTONUMOUT, Field.EQ, Field.ASK, 10, 56, Field.AUTONUMOUT, Field.DDE, 10, Field.EQ, 32, Field.FILLIN, Field.AUTONUMOUT, 33, 60, 58, 59, Field.TOA, Field.SECTIONPAGES, Field.MERGESEQ, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.AUTOTEXT, 78, 117, Field.MERGESEQ, 78, Field.AUTOTEXTLIST, 117, Field.BIDIOUTLINE, Field.MERGESEQ, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.INCLUDETEXT, Field.GREETINGLINE, 74, Field.SECTION, Field.NOTEREF, 64, Field.FORMCHECKBOX, 64, Field.FORMCHECKBOX, 78, 118, Field.AUTOTEXT, Field.FORMTEXT, Field.HTMLCONTROL, 74, 76, 118, Field.SHAPE, 64, 76, Field.GREETINGLINE, 118, Field.ADDRESSBLOCK, 64, Field.INCLUDETEXT, 76, Field.LISTNUM, 110, 101, 111, Field.ADVANCE, 104, 106, 121, 111, Field.ADVANCE, 106, 126, Byte.MAX_VALUE, 100, Field.ADVANCE, 104, 103, 100, 120, 110, Field.ADVANCE, Byte.MAX_VALUE, 98, 102, 110, 109, 122, 111, 112, 109, 107, 64, 121, 118, 109, 108, 107, 64, 122, 124, 111, 114, 64, 112, 113, 115, 102, Field.SECTION, 86, Field.INCLUDEPICTURE, Field.BIDIOUTLINE, Field.SECTION, Field.FORMCHECKBOX, 108, Field.DOCPROPERTY, Field.LISTNUM, Field.SECTION, 64, Field.FORMCHECKBOX, 108, Field.LISTNUM, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.SECTION, 86, 64, 64, Field.LISTNUM, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 108, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, Field.SHAPE, 74, 13, 14, 18, 23, 10, 33, 24, 17, 12, 29, Field.NUMWORDS, 33, 8, 23, Field.NUMWORDS, 9, 25, 31};
    }

    public C1454cB(List<AbstractC1456cD> list) {
        this.A0A = list;
    }

    public static C1454cB A02(JSONObject jSONObject, C1314Zs c1314Zs) throws JSONException {
        return A03(jSONObject, c1314Zs, false);
    }

    public static C1454cB A03(JSONObject jSONObject, C1314Zs c1314Zs, boolean z10) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A04(0, 3, 25));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (z10) {
                arrayList.add(C0803Fm.A02(jSONArray.getJSONObject(i10), c1314Zs));
            } else {
                arrayList.add(C0801Fk.A02(jSONArray.getJSONObject(i10), c1314Zs));
            }
        }
        C1454cB c1454cB = new C1454cB(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A04(3, 12, 51));
        c1454cB.A04 = chainingParams.toString();
        c1454cB.A01 = chainingParams.optInt(A04(15, 17, 87), arrayList.size());
        c1454cB.A03 = chainingParams.optInt(A04(32, 24, 112), 0);
        c1454cB.A02 = chainingParams.optInt(A04(100, 24, 46), 0);
        c1454cB.A00 = chainingParams.optInt(A04(56, 19, 15), 2);
        c1454cB.A0w(chainingParams);
        c1454cB.A07 = chainingParams.optBoolean(A04(ShapeTypes.GEAR_9, 16, 91), false);
        c1454cB.A06 = chainingParams.optBoolean(A04(ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, 28, 22), false);
        c1454cB.A05 = chainingParams.optBoolean(A04(124, 22, 58), false);
        JSONArray optJSONArray = chainingParams.optJSONArray(A04(75, 25, 12));
        if (optJSONArray != null) {
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                c1454cB.A09.add(Integer.valueOf(optJSONArray.optInt(i11, 0)));
            }
        }
        return c1454cB;
    }

    @Override // com.facebook.ads.redexgen.X.C1E
    public final int A0R() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.C1E
    public final int A0S() {
        return this.A03 + this.A02;
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

    public final AbstractC1456cD A1M() {
        if (!this.A0A.isEmpty()) {
            return this.A0A.get(0);
        }
        return null;
    }

    public final AbstractC1456cD A1N(int i10) {
        return this.A0A.get(i10);
    }

    public final String A1O() {
        return this.A08;
    }

    public final String A1P() {
        return this.A04;
    }

    public final String A1Q() {
        AbstractC1456cD firstAdDataBundle = A1M();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A1U();
        }
        return null;
    }

    public final ArrayList<Integer> A1R() {
        return this.A09;
    }

    public final void A1S(int i10) {
        this.A0A.remove(i10);
        this.A01--;
    }

    public final boolean A1T() {
        return this.A00 == 0;
    }

    public final boolean A1U() {
        return this.A05;
    }

    public final boolean A1V() {
        return this.A06;
    }

    public final boolean A1W() {
        return this.A07;
    }
}
