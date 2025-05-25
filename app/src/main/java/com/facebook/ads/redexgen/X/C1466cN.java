package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1466cN implements InterfaceC04420k {
    public static byte[] A08;
    public final EnumC04410j A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1466cN A00(C0783Ei c0783Ei, JSONObject jSONObject) {
        String optString = jSONObject.optString(A01(33, 6, 120));
        String optString2 = jSONObject.optString(A01(0, 18, 118));
        String optString3 = jSONObject.optString(A01(47, 10, 52));
        String A02 = LV.A02(jSONObject, A01(18, 2, 83));
        EnumC04410j A00 = AbstractC04430l.A00(jSONObject);
        Collection<String> A03 = AbstractC04430l.A03(c0783Ei, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(39, 8, 66));
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return new C1466cN(optString, optString2, A00, A03, hashMap, optString3, A02, LV.A02(jSONObject, A01(20, 13, 89)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{78, 80, 97, 86, 99, 78, 97, 86, Field.BIDIOUTLINE, Field.HTMLCONTROL, 76, 80, Field.BIDIOUTLINE, Field.LISTNUM, Field.LISTNUM, 78, Field.HTMLCONTROL, Field.ADDIN, Field.DDE, Field.USERADDRESS, Field.AUTONUMLGL, Field.USERADDRESS, Field.MACROBUTTON, Field.SECTIONPAGES, Field.TOA, 64, Field.INCLUDETEXT, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.GLOSSARY, Field.MACROBUTTON, 64, 61, Field.BIDIOUTLINE, 80, 97, Field.LISTNUM, 100, Field.SHAPE, Field.ASK, 30, Field.DDE, 26, 29, 26, Field.DDE, 26, 29, 16, Field.NUMCHARS, 32, 16, 30, 31, 10, 20, 15};
    }

    public C1466cN(String str, String str2, EnumC04410j enumC04410j, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = enumC04410j;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04420k
    public final String A6r() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04420k
    public final Collection<String> A7B() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04420k
    public final EnumC04410j A7c() {
        return this.A00;
    }
}
