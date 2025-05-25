package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C06539c A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{22, 41, 36, Field.PAGEREF, Field.GLOSSARY, 16, 44, 33, Field.SYMBOL, 34, 33, Field.QUOTE, 43, 5, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.GLOSSARY, Field.GOTOBUTTON};
    }

    public QA(C06539c c06539c) {
        this.A00 = c06539c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0M(A00(0, 18, 81));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
