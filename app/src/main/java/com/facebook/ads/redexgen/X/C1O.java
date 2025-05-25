package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import java.io.Serializable;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1O  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1O implements Serializable {
    public static byte[] A09 = null;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{110, 125, 126, 125, -126, 125, -111, 121, -118, -72, -118, -68, -117, -116, -77, -55, -64, -55, -60, -55, -13, -113, -46, -94, -46, -93, -46, -91, Byte.MIN_VALUE, -61, -61, -111, -115, -107, -115, -61, -61, -64, -62, -62, -60, -51, -45, -66, -62, -50, -53, -50, -47, 24, 29, 21, 25, Field.PAGEREF, 34, Field.PAGEREF, Field.DATA, 22, Field.QUOTE, 24, Field.DDE, 19, 23, Field.QUOTE, 32, Field.QUOTE, Field.ASK, Field.NUMWORDS, 44, 25, 23, Field.NUMWORDS, Field.FILLIN, 36, Field.FILLIN, 42, 14, 31, 12, 10, 14, 26, 23, 26, 29, 10, 26, 33, 16, 29, 10, 24, 16, 15, 20, 12, 17, 34, 15, 13, 34, 19, Field.ASK, 34, 13, 17, 29, 26, 29, 32, -16, 1, -18, -20, 1, -14, 5, 1, -20, -16, -4, -7, -4, -1, -20, -4, 3, -14, -1, -20, -6, -14, -15, -10, -18, 48, Field.GOTOBUTTON, 31, Field.EQ, Field.ASK, Field.EQ, 41, 34, Field.NUMCHARS, 32, 44, 41, 44, Field.GLOSSARY, 29, 18, 29, 21, 14, 8, 12, 24, 21, 24, Field.NUMWORDS};
    }

    static {
        A03();
        A0A = Color.parseColor(A02(14, 7, 76));
        A0B = Color.parseColor(A02(7, 7, 18));
        A0C = Color.parseColor(A02(21, 7, 40));
        String A02 = A02(28, 9, 25);
        A0D = Color.parseColor(A02);
        A0E = Color.parseColor(A02(0, 7, 7));
        A0F = Color.parseColor(A02);
    }

    public C1O(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A03 = i13;
        this.A04 = i14;
        this.A05 = i15;
        this.A06 = i16;
        this.A07 = i17;
        this.A08 = i18;
    }

    public static int A00(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i10;
    }

    public static C1O A01(JSONObject jSONObject) {
        return new C1O(A00(jSONObject, A02(37, 12, 27), A0A), A00(jSONObject, A02(57, 10, 112), A0B), A00(jSONObject, A02(ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, 14, 121), -16777216), A00(jSONObject, A02(49, 8, 114), A0C), A00(jSONObject, A02(67, 9, 116), A0D), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(96, 14, 106), -1), A00(jSONObject, A02(110, 25, 73), A0F), A00(jSONObject, A02(ShapeTypes.FLOW_CHART_SORT, 11, 101), -16777216));
    }

    public final int A04(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A00;
    }

    public final int A05(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A01;
    }

    public final int A06(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A02;
    }

    public final int A07(boolean z10) {
        return z10 ? A0E : this.A03;
    }

    public final int A08(boolean z10) {
        return z10 ? this.A05 : this.A04;
    }

    public final int A09(boolean z10) {
        return z10 ? this.A07 : this.A06;
    }

    public final int A0A(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A08;
    }
}
