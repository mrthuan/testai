package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.7x  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06247x {
    public static Pattern A04;
    public static byte[] A05;
    public static String[] A06 = {"USoK2cfxb51ZJPCyGLsl1oEqVq4F5A", "B1ix", "MKuQHzHoWScniLIuJtRpdi1IJiBszR7E", "m0RxAiB9UHr66yFH4", "lCsnFXMtzGCTFRX1SzzVAUWLGsHIck98", "YGB3OCwtMa2btxklJ7dtSCpn0L9PAA", "mK9fNeoXOGHAzqgN16GdwH9jtGNP", "UNrKSlTWuiH4lc0MNDNSZyV"};
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-27, -70, -48, -102, -24, -94, -102, -39, -94, -102, -39, -46, 11, -43, Field.QUOTE, 13, -12, -13, -64, -13, -10, -59, -12, -11, -11, -61, -63, -64, -41, -46, -59, -64, -12, -4, -61, -63, -59, -64, -12, -4, -61, -63, -63, -41, -11, -73};
        if (A06[4].charAt(7) != 't') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "QwSmp19ijd8ERy9gz24h9M2";
        strArr[3] = "mhynLWVjgi3uuGun3";
    }

    static {
        A04();
    }

    public C06247x(Set<String> options, Integer num, Integer num2, String str) {
        this.A03 = options;
        this.A03.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }

    public C06247x(String[] strArr, Integer num, Integer num2) {
        strArr = strArr == null ? new String[0] : strArr;
        this.A03 = new LinkedHashSet();
        this.A03.addAll(Arrays.asList(strArr));
        this.A03.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = A01();
    }

    public static C06247x A00(String str) {
        if (str == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer num = null;
        Integer num2 = null;
        Matcher matcher = A03().matcher(str);
        while (true) {
            boolean find = matcher.find();
            if (A06[1].length() != 4) {
                throw new RuntimeException();
            }
            A06[6] = "sKn9BxXmA7RSSQCmWRu2pi7wmb7A";
            if (find) {
                linkedHashSet.add(matcher.group(1));
                String group = matcher.group(2);
                String group2 = matcher.group(3);
                if (group != null && group2 != null) {
                    num = Integer.valueOf(Integer.parseInt(group));
                    num2 = Integer.valueOf(Integer.parseInt(group2));
                }
            } else {
                return new C06247x(linkedHashSet, num, num2, str);
            }
        }
    }

    private String A01() {
        String A02;
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.A03) {
            Locale locale = Locale.US;
            if (this.A00 != null && this.A01 != null) {
                A02 = A02(2, 10, 56);
            } else {
                String[] strArr = A06;
                if (strArr[7].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[0] = "nnUUoBTpU2YPqXP8sfrJzmkBvRy05q";
                strArr2[5] = "LOR0jcP8uyvbiYDNETVTqINk0FH7KZ";
                A02 = A02(12, 4, 115);
            }
            sb2.append(String.format(locale, A02, str.toUpperCase(), this.A00, this.A01));
        }
        return sb2.toString();
    }

    public static Pattern A03() {
        Pattern pattern = A04;
        String[] strArr = A06;
        if (strArr[7].length() != strArr[3].length()) {
            A06[6] = "PeUiXyVqTpDx";
            if (pattern == null) {
                A04 = Pattern.compile(A02(16, 29, 91));
            }
            return A04;
        }
        throw new RuntimeException();
    }

    public final Integer A05() {
        return this.A00;
    }

    public final Integer A06() {
        return this.A01;
    }

    public final String A07() {
        return this.A02;
    }

    public final String A08() {
        Iterator<String> it = this.A03.iterator();
        StringBuilder append = new StringBuilder().append(A02(1, 1, 34));
        while (it.hasNext()) {
            append.append(it.next());
            if (it.hasNext()) {
                append.append(A02(0, 1, 124));
            }
        }
        append.append(A02(45, 1, 29));
        return append.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C06247x) {
            C06247x c06247x = (C06247x) obj;
            if (this.A00 == c06247x.A00 || (this.A00 != null && this.A00.equals(c06247x.A00))) {
                return (this.A01 == c06247x.A01 || (this.A01 != null && this.A01.equals(c06247x.A01))) && this.A03.equals(c06247x.A03);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A03.hashCode() * ShapeTypes.PLUS) + ((this.A00 == null ? -1 : this.A00.intValue()) * ShapeTypes.FLOW_CHART_DOCUMENT) + ((this.A01 != null ? this.A01.intValue() : -1) * ShapeTypes.FLOW_CHART_TERMINATOR);
    }
}
