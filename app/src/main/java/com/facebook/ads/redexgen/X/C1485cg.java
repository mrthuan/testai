package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.cg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1485cg extends KY {
    public static byte[] A02;
    public final /* synthetic */ C04530w A00;
    public final /* synthetic */ String A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{36, 48, Field.FILLIN, Field.MACROBUTTON, Field.IMPORT, Field.FILLIN, 44, 33, 59, 29, 33, Field.QUOTE, Field.GOTOBUTTON, Field.GOTOBUTTON, 43, 44, Field.PAGEREF};
    }

    public C1485cg(C04530w c04530w, String str) {
        this.A00 = c04530w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C7j c7j;
        C7j c7j2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C04520v c04520v;
        C04520v c04520v2;
        C04520v c04520v3;
        String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c04520v = this.A00.A02;
                ((C1S) c04520v.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c04520v2 = this.A00.A02;
                c04520v2.A07(this.A01);
                c04520v3 = this.A00.A02;
                c04520v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c7j2 = this.A00.A03;
            c7j2.A07().AA0(A00, C8E.A1B, new C8F(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c7j = this.A00.A03;
            c7j.A07().AA0(A00, C8E.A1A, new C8F(e11));
        }
    }
}
