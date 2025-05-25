package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1T implements Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1T A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A04(0, 6, 78));
        String optString2 = jSONObject.optString(A04(36, 8, 81));
        String optString3 = jSONObject.optString(A04(24, 12, 84));
        int optInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean optBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || optInt == -1) {
            return null;
        }
        return new C1T(optString, optString2, optString3, optInt, optBoolean);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{Field.DDEAUTO, 61, 61, 44, Field.AUTONUM, Field.EQ, 8, 3, 14, 14, 4, 3, 5, 13, 1, 11, 16, 21, 22, 3, 9, 20, 3, 15, Field.INCLUDEPICTURE, Field.AUTONUMOUT, Field.AUTONUM, Field.USERADDRESS, Field.AUTONUMOUT, 58, 56, Field.GOTOBUTTON, Field.SECTION, Field.AUTONUMOUT, 64, 56, Field.SECTIONPAGES, Field.AUTONUMLGL, Field.AUTONUM, Field.AUTONUMLGL, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.AUTONUMLGL, Field.SECTIONPAGES, -10, -23, -12, -13, -10, -8, -19, -14, -21, -29, -15, -13, -24, -23};
    }

    public C1T(String str, String str2, String str3, int i10, boolean z10) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i10;
        this.A04 = z10;
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(C1T c1t, C1314Zs c1314Zs) {
        if (c1t != null && c1t.A09()) {
            new WQ(c1314Zs).A04(true, c1t.A01(), c1t.A03(), c1t.A02(), System.currentTimeMillis(), c1t.A08());
        }
    }

    public static void A07(C1T c1t, C1314Zs c1314Zs) {
        if (c1t != null && c1t.A0A()) {
            new WQ(c1314Zs).A04(false, c1t.A01(), c1t.A03(), c1t.A02(), System.currentTimeMillis(), c1t.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}
