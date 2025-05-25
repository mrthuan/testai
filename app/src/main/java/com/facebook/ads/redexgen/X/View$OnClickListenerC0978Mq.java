package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0978Mq implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"JgnztxPB1ZV2mLM4m5Ycre18QBHHAk68", "CqsGK2dWtG2Q1DXDtFIDYNZ7LNeefiOg", "ReCIjC0Dk67HsAjJsB8iXJFEf", "PfgM7dkBWjhvKpVZ4i4n1U6unvdzg33Y", "kMFA3e10HFnOKZH1eaTne45N5cSMFKSk", "5KU3gv1KQuWrXHx7nmrwofFdJow3SSmj", "5WlCrnbha1GubMPeTb3kZmJbp07Xs3gb", "slx8IL4rEGsN"};
    public final /* synthetic */ VA A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{122, 124, 106, 125, 108, 99, 102, 108, 100};
    }

    static {
        A01();
    }

    public View$OnClickListenerC0978Mq(VA va2) {
        this.A00 = va2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0U(false, A00(0, 9, 62));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            if (A02[0].charAt(6) != 'P') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "xlN8Ec18ebAkjRgfSypG9cj38q3wwfUZ";
            strArr[4] = "6rpL9N1SajG3bsAtkGH0kzQNranKOLWT";
        }
    }
}
