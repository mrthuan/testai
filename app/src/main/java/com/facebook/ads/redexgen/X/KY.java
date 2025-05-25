package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class KY implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<KO> A04;
    public final KM A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{44, 11, 16, 16, 31, Field.NUMCHARS, 18, Field.NUMWORDS, Field.GREETINGLINE, 29, 12, Field.NUMWORDS, 31, 10, Field.NUMWORDS, 26, 80, Field.GREETINGLINE, 42, 22, 12, Field.NUMWORDS, 31, 26, Field.INCLUDETEXT, Field.GREETINGLINE};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public KY() {
        if (A03.get()) {
            this.A00 = C0916Kd.A01(new C0915Kc(A01(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z10) {
        A03.set(z10);
    }

    public static void A04(boolean z10, KO ko2) {
        A02.set(z10);
        A04.set(ko2);
    }

    public final KM A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C0916Kd.A03(this);
            }
            A06();
            if (A03.get()) {
                C0916Kd.A04(this);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
