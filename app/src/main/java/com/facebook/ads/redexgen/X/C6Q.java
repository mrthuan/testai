package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Q {
    public static C6R A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C6Q.class) {
            if (A00 == null) {
                return;
            }
            C8F c8f = new C8F(A00.AFi());
            c8f.A05(1);
            C1313Zr A002 = AbstractC06137i.A00();
            if (A002 != null) {
                A002.A07().AA0(A00(0, 9, 49), 3401, c8f);
            }
            A00.reset();
        }
    }

    public static void A03(final long j10) {
        if (j10 > 0) {
            A00 = new C1323a1();
            new Thread(j10) { // from class: com.facebook.ads.redexgen.X.6S
                public final long A00;

                {
                    this.A00 = j10;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (KQ.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            C6Q.A01();
                        } catch (Throwable th2) {
                            KQ.A00(th2, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}
