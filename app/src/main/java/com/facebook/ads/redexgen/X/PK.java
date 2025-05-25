package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class PK implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ BP A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.FORMCHECKBOX, Field.FILESIZE, 86, Field.MERGESEQ, Field.ADDIN, Field.CONTROL, Field.SECTION, Field.NOTEREF, 123, Field.FORMCHECKBOX, Field.FILESIZE, 86, 64};
    }

    public PK(BP bp2) {
        this.A00 = bp2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC1178Ui ctaButton;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 13, 120));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
