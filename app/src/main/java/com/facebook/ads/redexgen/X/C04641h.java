package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1h  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04641h {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C05906f A00;
    public OC A01 = OC.A05;
    public ArrayList<C1041Pb> A02 = new ArrayList<>();
    public final C1E A03;
    public final InterfaceC04631g A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, Field.QUOTE, Field.NUMCHARS, Field.NUMWORDS, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, Field.DATA, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, Field.QUOTE, 16, -15, 36, 29, 19, Field.NUMWORDS, 20, Field.BARCODE, Field.INCLUDETEXT, 74, 59, Field.NOTEREF, Field.TOA, 74, Field.BARCODE, 74, Field.BARCODE, Field.IMPORT, Field.SECTIONPAGES};
    }

    static {
        A06();
    }

    public C04641h(C1314Zs c1314Zs, C04771u c04771u, InterfaceC04631g interfaceC04631g, String str) {
        JSONObject dataObject = c04771u.A03();
        this.A03 = A01(c1314Zs, c04771u, str, dataObject);
        this.A04 = interfaceC04631g;
    }

    private AdError A00(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD) {
        if (abstractC1456cD == null || abstractC1456cD.A1W().isEmpty()) {
            c1314Zs.A07().AA0(A04(62, 3, 33), C8E.A0Z, new C8F(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1E A01(C1314Zs c1314Zs, C04771u c04771u, String str, JSONObject jSONObject) {
        C1E c1e = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                c1e = C1454cB.A03(jSONObject, c1314Zs, true);
                c1e.A0x(true);
                c1e.A0u(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (c1e == null) {
            c1e = C0803Fm.A02(jSONObject, c1314Zs);
        }
        c1e.A0t(str);
        C8X A01 = c04771u.A01();
        if (A01 != null) {
            c1e.A0p(A01.A06());
        }
        return c1e;
    }

    private C05906f A03(C1314Zs c1314Zs) {
        return this.A00 != null ? this.A00 : new C05906f(c1314Zs);
    }

    private void A08(C1314Zs c1314Zs, C0803Fm c0803Fm) {
        C04581b playableData = c0803Fm.A1P().A0E().A06();
        A0B(playableData != null ? playableData.A0B() : OC.A05);
        C1445c2 c1445c2 = new C1445c2(this);
        C05906f c05906f = new C05906f(c1314Zs);
        boolean z10 = C0877Im.A26(c1314Zs) && AnonymousClass65.A0A(c0803Fm.A0o());
        if (z10) {
            AnonymousClass65 unifiedAssetsLoader = new AnonymousClass65(c05906f, c0803Fm.A0o(), c0803Fm.A0c(), c0803Fm.A0l(), z10, new C1444c1(this));
            c05906f.A0d(new JF(c0803Fm.A1U(), c1314Zs.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC04741r.A02(c1314Zs, c0803Fm, true, c1445c2);
    }

    private void A09(C1314Zs c1314Zs, EnumSet<CacheFlag> enumSet, AbstractC1456cD abstractC1456cD, int i10, InterfaceC04631g interfaceC04631g) {
        boolean A19 = abstractC1456cD.A19();
        C05906f A03 = A03(c1314Zs);
        A03.A0d(new JF(abstractC1456cD.A1U(), c1314Zs.A09()));
        boolean z10 = C0877Im.A26(c1314Zs) && AnonymousClass65.A0A(abstractC1456cD.A0o());
        if (z10) {
            new AnonymousClass65(A03, abstractC1456cD.A0o(), abstractC1456cD.A0c(), abstractC1456cD.A0l(), z10, new C1448c5(this, c1314Zs, A19, abstractC1456cD, interfaceC04631g)).A0B();
            return;
        }
        String A04 = A04(96, 12, 117);
        if (A19) {
            C05866b c05866b = new C05866b(abstractC1456cD.A0Z(), abstractC1456cD.A0l(), A04);
            c05866b.A04 = true;
            c05866b.A03 = A04(0, 5, 78);
            A03.A0X(c05866b);
        }
        A03.A0c(new C05886d(abstractC1456cD.A1S().A01(), QJ.A04, QJ.A04, abstractC1456cD.A0l(), A04(96, 12, 117)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i11 = 0;
        boolean A2n = C0877Im.A2n(c1314Zs, RS.A03());
        for (C1F adInfo : abstractC1456cD.A1W()) {
            C05886d c05886d = new C05886d(adInfo.A0E().A07(), AbstractC04701n.A00(adInfo.A0E()), AbstractC04701n.A01(adInfo.A0E()), abstractC1456cD.A0l(), A04(96, 12, 117));
            if (i11 == 0) {
                A03.A0b(c05886d);
            } else {
                A03.A0c(c05886d);
            }
            for (String str : adInfo.A0H().A01()) {
                A03.A0c(new C05886d(str, -1, -1, abstractC1456cD.A0l(), A04(96, 12, 117)));
            }
            if (contains && !TextUtils.isEmpty(adInfo.A0E().A08())) {
                C05866b c05866b2 = new C05866b(adInfo.A0E().A08(), abstractC1456cD.A0l(), A04(96, 12, 117), adInfo.A0E().A05());
                c05866b2.A04 = false;
                if (i11 == 0) {
                    if (A19 && !A2n) {
                        A03.A0X(c05866b2);
                    } else {
                        A03.A0a(c05866b2);
                    }
                } else if (A19 && !A2n) {
                    A03.A0Y(c05866b2);
                } else {
                    A03.A0Z(c05866b2);
                }
            }
            i11++;
        }
        A03.A0W(new C1446c3(this, c1314Zs, A19, abstractC1456cD, interfaceC04631g), new C6Y(abstractC1456cD.A0l(), A04, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1314Zs c1314Zs, EnumSet<CacheFlag> enumSet, C1454cB c1454cB, AbstractC1456cD abstractC1456cD, int i10, InterfaceC04631g interfaceC04631g) {
        A09(c1314Zs, enumSet, abstractC1456cD, i10, new C1450c7(this, c1314Zs, abstractC1456cD, c1454cB, i10, interfaceC04631g, enumSet));
    }

    private void A0B(OC oc2) {
        this.A01 = oc2;
    }

    private boolean A0C(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD) {
        AdError A00 = A00(c1314Zs, abstractC1456cD);
        if (A00 != null) {
            this.A04.AB4(A00);
            return true;
        }
        return false;
    }

    public final C1E A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        return com.facebook.ads.redexgen.X.KG.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        return com.facebook.ads.redexgen.X.KG.A0B;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.KG A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.1E r0 = r5.A03
            boolean r0 = r0.A15()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.X.KG.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.1E r4 = r5.A03
            com.facebook.ads.redexgen.X.cD r4 = (com.facebook.ads.redexgen.X.AbstractC1456cD) r4
            boolean r0 = r4.A19()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.X.KG.A06
            return r0
        L18:
            java.util.List r0 = r4.A1W()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.X.KG.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.1F r0 = r4.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            com.facebook.ads.redexgen.X.1b r3 = r0.A06()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C04641h.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C04641h.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L50
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.X.KG.A0C
            return r0
        L50:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C04641h.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C04641h.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L74
        L6e:
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.X.KG.A0D
            return r0
        L71:
            if (r3 == 0) goto L74
            goto L6e
        L74:
            com.facebook.ads.redexgen.X.KG r0 = com.facebook.ads.redexgen.X.KG.A0B
            return r0
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04641h.A0E():com.facebook.ads.redexgen.X.KG");
    }

    public final OC A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A15()) {
            return ((C1454cB) this.A03).A1Q();
        }
        return ((AbstractC1456cD) this.A03).A1U();
    }

    public final void A0H() {
        this.A04.AHE();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0r(rewardData);
        this.A03.A0v(str);
        if (A0D().A15()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1314Zs c1314Zs, EnumSet<CacheFlag> enumSet) {
        if (A0E() == KG.A04) {
            C1454cB c1454cB = (C1454cB) this.A03;
            AbstractC1456cD A1M = c1454cB.A1M();
            if (A0C(c1314Zs, A1M) || A1M == null) {
                return;
            }
            this.A04.AEv();
            A0A(c1314Zs, enumSet, c1454cB, A1M, 0, this.A04);
            return;
        }
        AbstractC1456cD abstractC1456cD = (AbstractC1456cD) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1314Zs, abstractC1456cD)) {
            return;
        }
        this.A04.AEv();
        if (A0E() == KG.A0C) {
            C0803Fm c0803Fm = (C0803Fm) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1314Zs, c0803Fm);
                return;
            }
            A08(c1314Zs, c0803Fm);
            return;
        }
        A09(c1314Zs, enumSet, (C0803Fm) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A11();
    }

    public final boolean A0L(AbstractC1456cD abstractC1456cD) {
        return !TextUtils.isEmpty(abstractC1456cD.A1P().A0E().A08());
    }
}
