package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0972Mk implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0974Mm A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 120, 116, 114, 112};
    }

    public View$OnClickListenerC0972Mk(C0974Mm c0974Mm) {
        this.A00 = c0974Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VO vo2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            vo2 = this.A00.A06;
            vo2.getCTAButton().A09(A00(0, 5, 121));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
