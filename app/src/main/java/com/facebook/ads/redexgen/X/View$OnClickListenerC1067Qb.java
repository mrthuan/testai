package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Qb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1067Qb implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TJ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, Field.MACROBUTTON, Field.SYMBOL, Field.USERADDRESS, 60, Field.GLOSSARY, Field.SYMBOL, Field.DDEAUTO};
    }

    public View$OnClickListenerC1067Qb(TJ tj2) {
        this.A00 = tj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui;
        View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            view$OnClickListenerC1178Ui = this.A00.A02;
            if (view$OnClickListenerC1178Ui == null) {
                return;
            }
            view$OnClickListenerC1178Ui2 = this.A00.A02;
            view$OnClickListenerC1178Ui2.A09(A00(0, 8, 103));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
