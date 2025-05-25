package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class P7 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ UQ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.FILLIN, 34, 34, Field.QUOTE, Field.GOTOBUTTON, Field.FILLIN, Field.GLOSSARY, 42, Field.AUTONUMLGL};
    }

    public P7(UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        PD pd2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (z10) {
                return;
            }
            pd2 = this.A00.A0M;
            pd2.A02(A00(0, 9, 108));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
