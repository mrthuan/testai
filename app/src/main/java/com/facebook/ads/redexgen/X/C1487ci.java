package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ci  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1487ci extends KY {
    public static byte[] A02;
    public final /* synthetic */ C04530w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C1487ci(C04530w c04530w, JSONObject jSONObject) {
        this.A00 = c04530w;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C7j c7j;
        C7j c7j2;
        CountDownLatch countDownLatch;
        C04520v c04520v;
        C04520v c04520v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c04520v = this.A00.A02;
            synchronized (c04520v) {
                c04520v2 = this.A00.A02;
                c04520v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e10) {
            c7j2 = this.A00.A03;
            c7j2.A07().AA0(A00(0, 17, 25), C8E.A1B, new C8F(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c7j = this.A00.A03;
            c7j.A07().AA0(A00(0, 17, 25), C8E.A1A, new C8F(e11));
        }
    }
}
