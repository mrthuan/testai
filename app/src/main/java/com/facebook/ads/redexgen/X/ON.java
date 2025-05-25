package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class ON implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ BZ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{61, 48, 43, 44, Field.AUTONUM};
    }

    public ON(BZ bz) {
        this.A00 = bz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC1178Ui ctaButton;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 111));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
