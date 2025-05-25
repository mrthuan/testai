package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dto.AdCookieData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8X  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8X {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public boolean A0D;
    public List<AdCookieData> A0C = null;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C8X(Map<String, String> map) {
        char c;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = Constants.CP_MAC_ROMAN;
        this.A07 = 200;
        this.A02 = 3600;
        this.A0D = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 37))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -856794442:
                    if (key.equals(A01(199, 26, 14))) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 32))) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 26))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 14))) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (key.equals(A01(ShapeTypes.FLOW_CHART_DOCUMENT, 4, 34))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 71))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 858630459:
                    if (key.equals(A01(225, 24, 119))) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 986744879:
                    if (key.equals(A01(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 27, 79))) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 46))) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1183549815:
                    if (key.equals(A01(ShapeTypes.ACTION_BUTTON_BEGINNING, 31, 41))) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 88))) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 52))) {
                        c = 7;
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
                    this.A0B = AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = Integer.parseInt(entry.getValue());
                    break;
                case '\b':
                    this.A00 = Integer.parseInt(entry.getValue());
                    break;
                case '\t':
                    this.A08 = Integer.parseInt(entry.getValue());
                    break;
                case '\n':
                    this.A09 = Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = Integer.parseInt(entry.getValue());
                    break;
                case '\f':
                    try {
                        this.A07 = Integer.parseInt(entry.getValue());
                        break;
                    } catch (NumberFormatException unused) {
                        this.A07 = 200;
                        break;
                    }
            }
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{Field.INCLUDEPICTURE, Field.SECTION, Field.INCLUDEPICTURE, Field.NOTEREF, Field.FILESIZE, Field.SECTION, Field.SECTIONPAGES, 76, Field.FILESIZE, Field.ADDRESSBLOCK, Field.LISTNUM, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.HYPERLINK, Field.ADDRESSBLOCK, 80, Field.DOCPROPERTY, 64, Field.ADDRESSBLOCK, Field.HTMLCONTROL, Field.LISTNUM, 107, 80, Field.SECTION, Field.FORMTEXT, Field.DOCPROPERTY, 64, Field.ADDRESSBLOCK, Field.HTMLCONTROL, Field.LISTNUM, 107, Field.ADDRESSBLOCK, Field.LISTNUM, 107, Field.FORMCHECKBOX, Field.ADDIN, Field.CONTROL, Field.HTMLCONTROL, Field.LISTNUM, 80, Field.FORMCHECKBOX, 4, 0, 7, Field.AUTONUM, 31, 0, 12, 30, 8, 11, 0, 5, 0, 29, 16, Field.AUTONUM, 25, 12, Field.NUMWORDS, 10, 12, 7, 29, 8, 14, 12, 6, 26, 23, 21, 19, Field.NUMWORDS, 19, 24, 2, 41, 30, 19, 31, 17, 30, 2, 106, 118, 123, 121, Byte.MAX_VALUE, 119, Byte.MAX_VALUE, 116, 110, Field.FILESIZE, 109, 115, 126, 110, 114, 114, 101, 102, 114, 101, 115, 104, 121, 110, 109, 121, 110, 120, 99, Field.ADVANCE, Byte.MAX_VALUE, 99, 121, 110, 120, 99, 100, 103, 111, 124, 107, Byte.MAX_VALUE, 123, 107, 125, 122, Field.ADDIN, 122, 103, 99, 107, 97, 123, 122, 120, 117, 124, 105, 23, 8, 5, 4, 14, Field.USERADDRESS, 21, 8, 12, 4, Field.USERADDRESS, 17, 14, 13, 13, 8, 15, 6, Field.USERADDRESS, 8, 15, 21, 4, 19, 23, 0, 13, 113, 110, 98, 112, 102, 101, 110, 107, 110, 115, 126, Field.HYPERLINK, 100, 111, 98, 100, 108, Field.HYPERLINK, 110, 105, 110, 115, 110, 102, 107, Field.HYPERLINK, 99, 98, 107, 102, 126, 86, Field.TOA, Field.FILESIZE, Field.CONTROL, Field.SECTION, Field.SECTIONPAGES, Field.TOA, 76, Field.TOA, Field.ADVANCE, Field.AUTOTEXTLIST, Byte.MAX_VALUE, Field.INCLUDEPICTURE, Field.NOTEREF, Field.FILESIZE, Field.INCLUDEPICTURE, Field.MERGESEQ, Byte.MAX_VALUE, Field.TOA, 78, Field.ADVANCE, Field.FILESIZE, 82, 86, Field.SECTION, 76, Field.GLOSSARY, 48, 60, Field.DDEAUTO, 56, 59, 48, Field.AUTONUMLGL, 48, Field.DDE, 32, 6, 58, Field.EQ, 60, 58, Field.GOTOBUTTON, 6, Field.DDE, 48, 58, Field.GOTOBUTTON, 60, 43};
    }

    static {
        A02();
        A0H = C8X.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    public static C8X A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C8X(hashMap);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
