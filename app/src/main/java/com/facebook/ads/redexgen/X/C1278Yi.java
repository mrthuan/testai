package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Yi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1278Yi extends CB {
    public static byte[] A01;
    public static String[] A02 = {"swRCXzzYsYoP8OECiDxTO54f3LG38", "4mMxchX9eTKWcUMbEzzbeTKtMtPaQOs", "Xh7ZpLnI5g0AvtHLdYA6RWKofXnumxIG", "5RXJ", "Vqtapz8Iv", "pVwTkokalGpdr", "NZeIzFT7NtL3BMGbT6cfoawDteogj", "Nl9nBczWjc"};
    public long A00;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{Field.AUTOTEXTLIST, 106, 103, 86, 105, Field.GREETINGLINE, 100, 99, Field.MACROBUTTON, Field.GOTOBUTTON, 17, 41, 56, Field.PAGEREF, 8, Field.PAGEREF, 56, Field.PAGEREF};
    }

    static {
        A0A();
    }

    public C1278Yi() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(I4 i42) {
        return i42.A0E();
    }

    public static Boolean A01(I4 i42) {
        return Boolean.valueOf(i42.A0E() == 1);
    }

    public static Double A02(I4 i42) {
        return Double.valueOf(Double.longBitsToDouble(i42.A0L()));
    }

    public static Object A03(I4 i42, int i10) {
        switch (i10) {
            case 0:
                return A02(i42);
            case 1:
                return A01(i42);
            case 2:
                return A05(i42);
            case 3:
                return A09(i42);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                return null;
            case 8:
                HashMap<String, Object> A08 = A08(i42);
                if (A02[2].charAt(22) != 'K') {
                    throw new RuntimeException();
                }
                A02[2] = "Sxm2Bc4tXHoV7tL5LxeqP9KUDfvbsTCx";
                return A08;
            case 10:
                return A06(i42);
            case 11:
                return A07(i42);
        }
    }

    public static String A05(I4 i42) {
        int A0I = i42.A0I();
        int A06 = i42.A06();
        i42.A0Z(A0I);
        return new String(i42.A00, A06, A0I);
    }

    public static ArrayList<Object> A06(I4 i42) {
        int A0H = i42.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int i10 = 0; i10 < A0H; i10++) {
            int count = A00(i42);
            arrayList.add(A03(i42, count));
        }
        return arrayList;
    }

    public static Date A07(I4 i42) {
        Date date = new Date((long) A02(i42).doubleValue());
        i42.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(I4 i42) {
        int A0H = i42.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int type = 0; type < A0H; type++) {
            String key = A05(i42);
            if (A02[5].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "s6CWgTXMjjwS89lYbS7BwJEShue9hkZ";
            strArr[3] = "FaY1";
            int count = A00(i42);
            hashMap.put(key, A03(i42, count));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(I4 i42) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(i42);
            int A00 = A00(i42);
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(i42, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.CB
    public final void A0B(I4 i42, long j10) throws A0 {
        if (A00(i42) == 2) {
            if (!A04(8, 10, 73).equals(A05(i42)) || A00(i42) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(i42);
            String name = A04(0, 8, 122);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((Double) metadata.get(name)).doubleValue();
                int nameType = (durationSeconds > 0.0d ? 1 : (durationSeconds == 0.0d ? 0 : -1));
                if (nameType > 0) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new A0();
    }

    @Override // com.facebook.ads.redexgen.X.CB
    public final boolean A0C(I4 i42) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
