package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class GK implements InterfaceC1484cf {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public InterfaceC04540x A01;
    public C04550y A02;
    public C1463cK A03;
    public C1461cI A04;
    public C0783Ei A05;
    public InterfaceC0973Ml A06;
    public C0974Mm A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(C0783Ei c0783Ei, C1461cI c1461cI, C05906f c05906f, InterfaceC04540x interfaceC04540x, C0974Mm c0974Mm) {
        String A6r = c1461cI.A6r();
        if (!TextUtils.isEmpty(A6r)) {
            c05906f.A0d(new JF(A6r, c0783Ei.A09()));
        }
        JU A0F = c1461cI.A0F();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0F != null) {
            C05886d c05886d = new C05886d(c1461cI.A0F().getUrl(), c1461cI.A0F().getHeight(), c1461cI.A0F().getWidth(), c1461cI.A0Y(), A03(2, 16, 120));
            c05886d.A00 = new C6l(false, -1, -1);
            c05906f.A0V();
            c05906f.A0b(c05886d);
        }
        if (c1461cI.A0E() != null) {
            c05906f.A0b(new C05886d(c1461cI.A0E().getUrl(), c1461cI.A0E().getHeight(), c1461cI.A0E().getWidth(), c1461cI.A0Y(), A03(2, 16, 120)));
        }
        String A0b = c1461cI.A0b();
        if (A0b != null && !TextUtils.isEmpty(A0b)) {
            c05906f.A0a(new C05866b(A0b, c1461cI.A0Y(), A03(2, 16, 120), c1461cI.A0A()));
        }
        C1475cW c1475cW = new C1475cW(this, c0974Mm, interfaceC04540x, c0783Ei);
        String A0Y = c1461cI.A0Y();
        String clientToken2 = A03(2, 16, 120);
        c05906f.A0W(c1475cW, new C6Y(A0Y, clientToken2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final String A6r() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A6r();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final AdPlacementType A82() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1484cf
    public final void A9p(C0783Ei c0783Ei, J7 j72, EnumC0896Jj enumC0896Jj, InterfaceC04540x interfaceC04540x, JSONObject jSONObject, C8X c8x) {
        c0783Ei.A0E().A43();
        this.A05 = c0783Ei;
        this.A01 = interfaceC04540x;
        C05906f c05906f = new C05906f(c0783Ei);
        this.A00 = System.currentTimeMillis();
        C1461cI A00 = AnonymousClass16.A00(c0783Ei, jSONObject, LV.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!AbstractC04430l.A06(c0783Ei, A00, j72)) {
            InterfaceC0973Ml adViewListener = new C1477cY(this, c0783Ei);
            this.A06 = adViewListener;
            C0974Mm c0974Mm = new C0974Mm(c0783Ei, j72, c05906f, new WeakReference(adViewListener), c8x.A04(), c8x.A07(), c8x.A08(), c8x.A09(), A00, this.A08);
            this.A07 = c0974Mm;
            this.A03 = new C1463cK(c0783Ei, new C1476cX(this, c0783Ei, interfaceC04540x), c0974Mm.getViewabilityChecker(), j72, A00);
            A05(c0783Ei, A00, c05906f, interfaceC04540x, c0974Mm);
            this.A02 = new C04550y(c0783Ei, this.A08, this, interfaceC04540x);
            this.A02.A02();
            return;
        }
        c0783Ei.A0E().A4g();
        interfaceC04540x.ACN(this, C0894Jg.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final boolean AH5() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC1498ct A0E = this.A05.A0E();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0E.A41(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        C04550y c04550y = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (c04550y != null) {
            this.A02.A03();
        }
    }
}
