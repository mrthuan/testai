package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.8i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06338i {
    public static HashMap<String, String> A00;
    public static byte[] A01;
    public static String[] A02 = {"iAmMZEnTjRyKTNBZ", "vq5cthhr", "805H8tMQ6F09oxi1Jl38UficVRLMtQ", "JBRmxZg7", "Cn5UKxgX5LOr", "xwoZ6hhdKgqxJaNY", "yguqyABz11m3k", "UOBi89mTAaMo"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() != 16) {
                throw new RuntimeException();
            }
            A02[0] = "gDribvuqSsGNU0u3";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 70);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-69, -54, -54, -68, -49, -61, -58, -66, -60, -45, -45, -47, -60, -48, -56, 6, 21, 21, Field.NUMWORDS, 10, 23, 24, -15, 4, -3, -13, -5, -12, -38, -36, -47, -46, -39, -34, -30, 0, 4, 7, -10, 3, 4, 8, -7, 0, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -31, -45, -31, -31, -41, -35, -36, -19, -41, -46, -54, -41, -51, -37, -40, -46, -51};
    }

    static {
        A02();
    }

    public static synchronized Map<String, String> A01(C7j c7j) {
        synchronized (C06338i.class) {
            if (A00 != null) {
                return new HashMap(A00);
            }
            A00 = new HashMap<>();
            A00.put(A00(22, 6, 105), c7j.getPackageName());
            A03(c7j, A00, null);
            return new HashMap(A00);
        }
    }

    public static synchronized void A03(C7j c7j, Map<String, String> map, String str) {
        synchronized (C06338i.class) {
            map.put(A00(41, 3, 111), A00(65, 7, 35));
            map.put(A00(44, 11, 52), c7j.A04().A8g());
            map.put(A00(33, 2, 73), c7j.A04().A8f());
            map.put(A00(35, 6, 107), C8O.A04);
            C8O c8o = new C8O(c7j, str);
            map.put(A00(15, 7, ShapeTypes.VERTICAL_SCROLL), c8o.A06());
            map.put(A00(8, 7, 61), c8o.A05());
            map.put(A00(0, 8, 52), String.valueOf(c8o.A04()));
            map.put(A00(28, 5, 71), c8o.A0A());
            map.put(A00(55, 10, 72), c7j.A08().A02());
        }
    }
}
