package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1074Qi {
    public static byte[] A07;
    public final T7 A02;
    public final T4 A04;
    public final String A05;
    public final Map<String, String> A06;
    public final AbstractC1124Sg A03 = new AbstractC1124Sg() { // from class: com.facebook.ads.redexgen.X.9X
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC06488x
        /* renamed from: A00 */
        public final void A03(C9Q c9q) {
            String str;
            T4 t4;
            str = C1074Qi.this.A05;
            T5 t52 = new T5(str, c9q.A03(), c9q.A01(), c9q.A02());
            if (c9q.A00() >= 0.05d) {
                t52.A06(c9q.A01());
            }
            C1074Qi.A00(C1074Qi.this);
            t4 = C1074Qi.this.A04;
            t4.A0C(t52);
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C1074Qi(T7 t72, String str, Map<String, String> extraParams) {
        this.A05 = str;
        this.A02 = t72;
        this.A06 = extraParams;
        this.A04 = new T4(this.A05);
        this.A02.getEventBus().A05(this.A03);
    }

    public static /* synthetic */ int A00(C1074Qi c1074Qi) {
        int i10 = c1074Qi.A01;
        c1074Qi.A01 = i10 + 1;
        return i10;
    }

    public final Map<String, String> A05() {
        String A04 = T4.A04(this.A04.A0B());
        HashMap hashMap = new HashMap();
        if (this.A06 != null) {
            hashMap.putAll(this.A06);
        }
        if (A04 == null) {
            A04 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A04);
        hashMap.put(A02(11, 11, 126), String.valueOf(this.A01));
        int i10 = this.A00 + 1;
        this.A00 = i10;
        hashMap.put(A02(0, 11, 8), String.valueOf(i10));
        return hashMap;
    }

    public final void A06() {
        this.A02.getEventBus().A06(this.A03);
    }
}
