package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class Q0 implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ A7 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, Field.NOTEREF, 116, 121, 97, 122, 121, 123, 115, Field.ADDRESSBLOCK, 106, 106, 119, 106};
    }

    public Q0(A7 a72) {
        this.A00 = a72;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q4 q42;
        if (KQ.A02(this)) {
            return;
        }
        try {
            q42 = this.A00.A00.A0X;
            q42.AE0(A00(0, 18, 75));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
