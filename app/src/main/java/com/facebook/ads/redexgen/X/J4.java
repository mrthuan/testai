package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class J4 {
    public static byte[] A07;
    public final double A00;
    public final double A01 = System.currentTimeMillis() / 1000.0d;
    public final J9 A02;
    public final JA A03;
    public final String A04;
    public final String A05;
    public final Map<String, String> A06;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Map<String, String> A01(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public static void A02() {
        A07 = new byte[]{36, 43, 36, 41, 42, 34, 107, 118, 109, 99, 109, 106, 101, 104, Field.HTMLCONTROL, 103, 104, 109, 97, 106, 112, Field.HTMLCONTROL, 112, 107, 111, 97, 106, Field.MERGESEQ, 80, Field.CONTROL, 77, Field.ADVANCE, Field.BIDIOUTLINE, 103, Field.ADDIN, 86, Field.HTMLCONTROL, Field.ADVANCE, 77, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 103, Field.ADDIN, 86, 103, Field.GREETINGLINE, 77, 86, 86, Field.ADDRESSBLOCK, Field.ADVANCE};
    }

    public J4(C7j c7j, String str, double d10, String str2, Map<String, String> map, J9 j92, JA ja2, boolean z10) {
        this.A05 = str;
        this.A00 = d10;
        this.A04 = str2;
        this.A02 = j92;
        this.A03 = ja2;
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (z10) {
            hashMap.put(A00(27, 24, 18), String.valueOf(z10));
        }
        String A01 = JH.A01(str);
        if (!TextUtils.isEmpty(A01) && (z10 || ja2 == JA.A0C)) {
            hashMap.put(A00(6, 21, 46), A01);
        }
        if (A0B()) {
            Map<String, String> extraData = c7j.A03().A6P();
            hashMap.put(A00(0, 6, 111), LV.A01(extraData));
        }
        Map<String, String> extraData2 = A01(hashMap);
        this.A06 = extraData2;
    }

    public final double A03() {
        return this.A00;
    }

    public final double A04() {
        return this.A01;
    }

    public final J9 A05() {
        return this.A02;
    }

    public final JA A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A04;
    }

    public final String A08() {
        return this.A05;
    }

    public final Map<String, String> A09() {
        return this.A06;
    }

    public final boolean A0A() {
        return !TextUtils.isEmpty(this.A05);
    }

    public final boolean A0B() {
        return this.A02 == J9.A05;
    }
}
