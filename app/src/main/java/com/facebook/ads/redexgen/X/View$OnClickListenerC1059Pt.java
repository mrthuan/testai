package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Pt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1059Pt implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ A6 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 23, 23, 24, Field.FILLIN, 20, Field.NUMCHARS, 31, Field.ASK};
    }

    public View$OnClickListenerC1059Pt(A6 a62) {
        this.A00 = a62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        PD pd2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (!z10) {
                pd2 = this.A00.A0H;
                pd2.A02(A00(0, 9, 103));
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
