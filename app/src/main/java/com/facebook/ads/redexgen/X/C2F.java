package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.2F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2F {
    public static byte[] A00;
    public static String[] A01 = {"pY9ZXifxArCVjHBuW1cFi0dQljuE9Tf0", "pWwXLaHMc2CIhW3XIuObF4bvoKv8BfMZ", "mjts0HvkPGtREm0amxRZnnNRJAuUZdvm", "abSMUJDaje8PZVdniKXVA7EheIgEU2Ky", "XlFlgNr5vQZ1tyGpSUziV1wK28nmqCDp", "l72ITgVAaer6oLi3ZuEszNZ4Tz579Dik", "01uixCM2ew1GUtPlkStbY4R3MiHKurQG", "OuIJxNEFpIwLjLPuYqUOL946mVcVFOoz"};
    public static final HashMap<String, CacheFlag> A02;
    public static final HashMap<CacheFlag, String> A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-58, 10, 4, 16, 15, -34, -30, -42, -36, -38, -42, -41, -42, -51, -47, -54, -57, -54, -53, -45, -54, -45, -58, -63, -62, -52};
        if (A01[0].charAt(16) != 'W') {
            throw new RuntimeException();
        }
        A01[5] = "Bq2StgQbD5mLPjUE1dw95ch9p648bptk";
        A00 = bArr;
    }

    static {
        A03();
        A03 = new HashMap<>();
        A02 = new HashMap<>();
        A04(CacheFlag.NONE, A00(10, 4, 13));
        A04(CacheFlag.ICON, A00(1, 4, 70));
        A04(CacheFlag.IMAGE, A00(5, 5, 26));
        A04(CacheFlag.VIDEO, A00(21, 5, 2));
    }

    public static String A01(EnumSet<CacheFlag> cacheFlags) {
        if (cacheFlags == null) {
            if (A01[0].charAt(16) != 'W') {
                throw new RuntimeException();
            }
            A01[2] = "mQm3e3EDrMVtI1xQTgCv9nJkqidgOUz3";
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = cacheFlags.iterator();
        while (it.hasNext()) {
            String str = A03.get((CacheFlag) it.next());
            if (str == null) {
                str = A00(14, 7, 1);
            }
            StringBuilder append = sb2.append(str);
            String mappedValue = A00(0, 1, 63);
            if (A01[2].charAt(21) != 'n') {
                append.append(mappedValue);
            } else {
                A01[5] = "m2WAASCqguA1bRajQOE6ItOClvFsunSk";
                append.append(mappedValue);
            }
        }
        return sb2.toString();
    }

    public static EnumSet<CacheFlag> A02(String str) {
        if (str == null) {
            return null;
        }
        EnumSet<CacheFlag> noneOf = EnumSet.noneOf(CacheFlag.class);
        for (String str2 : str.split(A00(0, 1, 63))) {
            noneOf.add(A02.get(str2));
        }
        return noneOf;
    }

    public static void A04(CacheFlag cacheFlag, String str) {
        A03.put(cacheFlag, str);
        A02.put(str, cacheFlag);
    }
}
