package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0929Kr implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1314Zs A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -50, -51, -58, -1, -3, 6, -3, 10, 1, -5};
    }

    public RunnableC0929Kr(C1314Zs c1314Zs) {
        this.A00 = c1314Zs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            C8F otsl = new C8F(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A07().AA1(A00(4, 7, 44), C8E.A1Y, otsl);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
