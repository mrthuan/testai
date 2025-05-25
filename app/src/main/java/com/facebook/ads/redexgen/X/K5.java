package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class K5 {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{96, Field.AUTONUM, Byte.MAX_VALUE, 96, Field.AUTONUM, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, 80, Field.ADDIN, Field.FORMDROPDOWN, Field.FORMDROPDOWN, 3, 0, Field.DOCPROPERTY, Field.DOCPROPERTY, 11, Field.DDE, Field.IMPORT, 48, Field.SYMBOL, 126, Field.GOTOBUTTON, Field.BARCODE, Field.DDE, 42, 126, Field.BARCODE, 58, 126, 44, 59, Field.DDE, Field.DDEAUTO, Field.EQ, 48, Field.DDE, 59, Field.SECTION, Field.INCLUDEPICTURE, 82, 106, Field.FORMCHECKBOX, Field.DOCPROPERTY, 82, 116, Field.INCLUDEPICTURE, Field.DOCPROPERTY, 86, Field.TOA, Field.NOTEREF, Field.DOCPROPERTY, Field.INCLUDEPICTURE};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, EnumC0898Jl enumC0898Jl) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (enumC0898Jl) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(K6 k62) {
        AbstractC0907Ju.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(k62));
    }

    public static String A03(K6 k62) {
        return String.format(Locale.US, A01(0, 14, 29), k62.A09(), k62.A07(), Integer.valueOf(k62.A08() == null ? 0 : k62.A08().A00()), Integer.valueOf(k62.A08() == null ? 0 : k62.A08().A01()), Integer.valueOf(k62.A04()));
    }

    public static void A05(long j10, K6 k62) {
        A01.put(A03(k62), Long.valueOf(j10));
    }

    public static void A06(K6 k62) {
        A00.put(A03(k62), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, K6 k62) {
        A02.put(A03(k62), str);
    }

    public static boolean A08(K6 k62) {
        if (A03) {
            return false;
        }
        String A032 = A03(k62);
        if (A00.containsKey(A032)) {
            return System.currentTimeMillis() - A00.get(A032).longValue() < A00(A032, k62.A07());
        }
        return false;
    }
}
