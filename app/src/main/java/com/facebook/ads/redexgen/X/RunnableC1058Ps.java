package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ps  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1058Ps implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"CXh9IgKc", "O7eitgLXwuQabaJwawISN5vHvLm6eCHh", "CD1jo8Ha", "FPDId41ZEfoYhMJr4YCyxsIaRA1sy82M", "v53i6y7e6", "iQAdLEQn", "ZcZ8pescI", "Z1kdPveD"};
    public final /* synthetic */ C0678Ac A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 77, Field.NOTEREF, Field.TOA, Field.FORMDROPDOWN, Field.AUTONUMOUT, 80, Field.FILESIZE, Field.ADDRESSBLOCK, Field.FORMTEXT, Field.FILESIZE, Field.FORMCHECKBOX, Field.AUTOTEXT, 41, 86, 86, Field.FORMDROPDOWN, 86};
    }

    static {
        A01();
    }

    public RunnableC1058Ps(C0678Ac c0678Ac) {
        this.A00 = c0678Ac;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q4 q42;
        if (KQ.A02(this)) {
            return;
        }
        try {
            q42 = this.A00.A00.A0F;
            q42.AE0(A00(0, 18, 126));
        } catch (Throwable th2) {
            String[] strArr = A02;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "CbmYJDHc";
            strArr2[5] = "9BNL1g6R";
            KQ.A00(th2, this);
        }
    }
}
