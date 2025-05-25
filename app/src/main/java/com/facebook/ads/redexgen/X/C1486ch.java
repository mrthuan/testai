package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ch  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1486ch extends KY {
    public static byte[] A02;
    public final /* synthetic */ C04530w A00;
    public final /* synthetic */ String A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C1486ch(C04530w c04530w, String str) {
        this.A00 = c04530w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C7j c7j;
        C7j c7j2;
        CountDownLatch countDownLatch;
        C04520v c04520v;
        C04520v c04520v2;
        C04520v c04520v3;
        boolean A0J;
        C04520v c04520v4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c04520v = this.A00.A02;
            synchronized (c04520v) {
                c04520v2 = this.A00.A02;
                Iterator<String> keys = c04520v2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C04530w c04530w = this.A00;
                        c04520v4 = this.A00.A02;
                        c04530w.A0E((C1S) c04520v4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c04520v3 = this.A00.A02;
                c04520v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c7j2 = this.A00.A03;
            C8D A07 = c7j2.A07();
            String encryptedId = A00(0, 17, 22);
            A07.AA0(encryptedId, C8E.A1B, new C8F(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c7j = this.A00.A03;
            C8D A072 = c7j.A07();
            String encryptedId2 = A00(0, 17, 22);
            A072.AA0(encryptedId2, C8E.A1A, new C8F(e11));
        }
    }
}
