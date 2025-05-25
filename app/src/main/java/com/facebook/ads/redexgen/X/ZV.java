package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class ZV implements C0T {
    public static byte[] A01;
    public final C7j A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70};
    }

    public ZV(C7j c7j) {
        this.A00 = c7j;
    }

    private void A02(int i10, String str, JSONObject jSONObject, boolean z10, int i11) {
        C8F c8f = new C8F(A00(4, 6, 44));
        c8f.A07(jSONObject);
        c8f.A05(1);
        c8f.A09(z10);
        c8f.A04(i11);
        try {
            jSONObject.put(A00(33, 13, 62), AnonymousClass88.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A07().AA1(A00(27, 6, 13), i10 + 4000, c8f);
        if (this.A00.A04().A9O()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i10 + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(C0V c0v) {
        for (C0V c0v2 : ZN.A06) {
            if (c0v2.equals(c0v)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void AA2(C0V c0v, JSONObject jSONObject, int i10) {
        A02(c0v.A03(), c0v.toString(), jSONObject, A03(c0v), i10);
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void AAN(int i10, JSONObject jSONObject) {
        A02(i10, A00(18, 9, 111) + i10, jSONObject, false, 0);
    }
}
