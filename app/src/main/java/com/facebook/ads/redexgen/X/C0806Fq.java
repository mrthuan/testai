package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Fq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0806Fq extends AbstractC1460cH {
    public static C05906f A0D;
    public static byte[] A0E;
    public static String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public AnonymousClass17 A01;
    public AnonymousClass18 A02;
    public C1E A03;
    public C1314Zs A04;
    public KG A05;
    public C1041Pb A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, 12, 3, 2, -33, 2, -30, -1, 18, -1, -32, 19, 12, 2, 10, 3, 29, 21, 20, 25, 17, 36, 25, 31, 30, -12, 17, 36, 17, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, Field.NUMCHARS, 15, 33, 11, Field.NUMCHARS, 14, 15, 14, 9, 32, 19, 14, 15, 25, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A08();
    }

    private void A06() {
        C04972o.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C04972o.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i10 = super.A00;
        String A04 = A04(77, 24, 25);
        if (i10 != -1 && Settings.System.getInt(this.A04.getContentResolver(), A04(1, 22, 92), 0) != 1) {
            int i11 = super.A00;
            String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(A04, i11);
            return;
        }
        C1314Zs c1314Zs = this.A04;
        String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (C0877Im.A0f(c1314Zs)) {
                return;
            }
        } else if (C0877Im.A0f(c1314Zs)) {
            return;
        }
        intent.putExtra(A04, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B(C1314Zs c1314Zs, C1454cB c1454cB, int i10) {
        if (i10 >= c1454cB.A1K()) {
            return;
        }
        C0801Fk c0801Fk = (C0801Fk) c1454cB.A1N(i10);
        A0D = new C05906f(c1314Zs);
        A0D.A0d(new JF(c0801Fk.A1U(), c1314Zs.A09()));
        AbstractC04751s.A02(c1314Zs, A0D, c0801Fk);
        A0D.A0W(new Fr(this, i10 == 0, c1314Zs, c0801Fk, c1454cB, i10), new C6Y(c0801Fk.A0l(), A04(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, 14, 119), i10));
    }

    private void A0C(boolean z10) {
        if (this.A05 == KG.A0F) {
            A0E(z10);
        } else if (this.A05 == KG.A0H) {
            A0F(z10);
        } else if (this.A05 == KG.A0G) {
            A0D(z10);
        } else {
            A0F(z10);
        }
    }

    private void A0D(boolean z10) {
        C05906f c05906f = new C05906f(this.A04);
        boolean z11 = C0877Im.A26(this.A04) && AnonymousClass65.A0A(this.A03.A0o());
        if (z11) {
            AnonymousClass65 unifiedAssetsLoader = new AnonymousClass65(c05906f, this.A03.A0o(), this.A03.A0c(), this.A03.A0l(), z11, new C1468cP(this));
            c05906f.A0d(new JF(((AbstractC1456cD) this.A03).A1U(), this.A04.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC04741r.A02(this.A04, (AbstractC1456cD) this.A03, z10, new C1467cO(this));
    }

    private void A0E(boolean z10) {
        C05906f c05906f = new C05906f(this.A04);
        c05906f.A0d(new JF(((AbstractC1456cD) this.A03).A1U(), this.A04.A09()));
        AbstractC04751s.A03(this.A04, c05906f, (C0801Fk) this.A03);
        c05906f.A0W(new C1472cT(this), new C6Y(this.A03.A0l(), A04(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, 14, 119)));
    }

    private void A0F(boolean z10) {
        boolean z11 = false;
        if (this.A03.A15()) {
            C1454cB c1454cB = (C1454cB) this.A03;
            for (int i10 = 0; i10 < c1454cB.A1K(); i10++) {
                if (TextUtils.isEmpty(c1454cB.A1N(i10).A1P().A0E().A08())) {
                    this.A01.ADU(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0B(this.A04, c1454cB, 0);
            return;
        }
        C05906f c05906f = new C05906f(this.A04);
        c05906f.A0d(new JF(((AbstractC1456cD) this.A03).A1U(), this.A04.A09()));
        if (C0877Im.A26(this.A04) && AnonymousClass65.A0A(this.A03.A0o())) {
            z11 = true;
        }
        boolean A19 = this.A03.A19();
        if (z11) {
            AnonymousClass65 unifiedAssetsLoader = new AnonymousClass65(c05906f, this.A03.A0o(), this.A03.A0c(), this.A03.A0l(), z11, new C1470cR(this, A19));
            unifiedAssetsLoader.A0B();
            return;
        }
        C0801Fk c0801Fk = (C0801Fk) this.A03;
        if (TextUtils.isEmpty(c0801Fk.A1P().A0E().A08())) {
            this.A01.ADU(this, AdError.INTERNAL_ERROR);
            return;
        }
        AbstractC04751s.A02(this.A04, c05906f, c0801Fk);
        c05906f.A0W(new C0812Fx(this, z10, A19, c0801Fk, this), new C6Y(c0801Fk.A0l(), A04(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, 14, 119)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1460cH
    public final int A0G() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0S();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1460cH
    public final C1E A0H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1460cH
    public final boolean A0I() {
        if (this.A0C.get()) {
            this.A03.A0q(super.A01);
            String A03 = C1068Qc.A03(super.A02, this.A0B, this.A07);
            this.A03.A0r(super.A02);
            this.A03.A0v(A03);
            AdActivityIntent A04 = C0928Kq.A04(this.A04);
            A04.putExtra(A04(ShapeTypes.GEAR_9, 8, 83), this.A05);
            A04.putExtra(A04(ShapeTypes.VERTICAL_SCROLL, 25, 78), this.A03);
            A04.putExtra(A04(34, 19, 107), this.A03);
            String A042 = A04(ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, 8, 27);
            String rewardUrl = this.A0B;
            A04.putExtra(A042, rewardUrl);
            if (A03 != null) {
                String rewardUrl2 = A04(112, 15, 89);
                A04.putExtra(rewardUrl2, A03);
            }
            String A043 = A04(66, 11, 109);
            String rewardUrl3 = this.A0A;
            A04.putExtra(A043, rewardUrl3);
            A04.putExtra(A04(101, 11, 74), this.A00);
            String rewardUrl4 = this.A09;
            if (rewardUrl4 != null) {
                String A044 = A04(53, 13, 125);
                String rewardUrl5 = this.A09;
                A04.putExtra(A044, rewardUrl5);
            }
            A09(A04);
            if (!ProcessUtils.isRemoteRenderingProcess()) {
                A04.setFlags(A04.getFlags() | 268435456);
            }
            ActivityUtils.A03(this.A04);
            try {
                if (ProcessUtils.isRemoteRenderingProcess()) {
                    if (!C0928Kq.A0J(this.A04, A04)) {
                        this.A04.A0E().AFT();
                        if (this.A01 != null) {
                            this.A01.ADU(this, AdError.AD_PRESENTATION_ERROR);
                        }
                        return false;
                    }
                    return true;
                }
                C0928Kq.A0A(this.A04, A04);
                return true;
            } catch (C0926Ko e10) {
                String[] strArr = A0F;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0F;
                strArr2[7] = "zr3";
                strArr2[6] = "zCM";
                Throwable cause = e10.getCause();
                Throwable th2 = e10;
                if (cause != null) {
                    th2 = e10.getCause();
                }
                C8D A07 = this.A04.A07();
                int i10 = C8E.A01;
                C8F c8f = new C8F(th2);
                String rewardUrl6 = A04(23, 11, 50);
                A07.AA0(rewardUrl6, i10, c8f);
                return true;
            }
        }
        return false;
    }

    public final void A0J(C1314Zs c1314Zs, AnonymousClass17 anonymousClass17, C04771u c04771u, boolean z10, String str, String str2) {
        String A04;
        this.A0C.set(false);
        this.A04 = c1314Zs;
        this.A01 = anonymousClass17;
        this.A0A = c04771u.A02();
        this.A00 = c04771u.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            String str3 = this.A0A;
            String A042 = A04(0, 1, 12);
            String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                A04 = str3.split(A042)[0];
            }
            throw new RuntimeException();
        }
        A04 = A04(0, 0, 100);
        this.A07 = A04;
        this.A03 = C1E.A00(c04771u.A03(), this.A04);
        this.A03.A0t(str);
        this.A03.A0p(c04771u.A01().A06());
        if (this.A03.A15()) {
            this.A08 = ((C1454cB) this.A03).A1Q();
        } else {
            this.A08 = ((AbstractC1456cD) this.A03).A1U();
        }
        if (this.A03.A19()) {
            this.A05 = KG.A08;
            if (this.A03.A11()) {
                this.A04.A0E().AGg(EnumC04360e.A08);
            } else {
                this.A04.A0E().AGg(EnumC04360e.A0A);
            }
        } else {
            switch (this.A03.A0R()) {
                case 0:
                    this.A05 = KG.A0H;
                    this.A04.A0E().AGg(EnumC04360e.A0D);
                    break;
                case 1:
                    this.A05 = KG.A0G;
                    this.A04.A0E().AGg(EnumC04360e.A0C);
                    break;
                case 2:
                    this.A05 = KG.A05;
                    this.A04.A0E().AGg(EnumC04360e.A05);
                    break;
                case 3:
                    this.A05 = KG.A0F;
                    this.A04.A0E().AGg(EnumC04360e.A04);
                    break;
                case 4:
                    this.A05 = KG.A0I;
                    this.A04.A0E().AGg(EnumC04360e.A0E);
                    break;
            }
        }
        if (C0877Im.A0s(c1314Zs)) {
            C1E c1e = this.A03;
            String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (c1e.A15()) {
                    C1454cB c1454cB = (C1454cB) this.A03;
                    for (int A1K = c1454cB.A1K() - 1; A1K >= 0; A1K--) {
                        AbstractC1456cD A1N = c1454cB.A1N(A1K);
                        if (AbstractC04430l.A06(this.A04, AbstractC04430l.A01(c1314Zs, A1N.A0o(), A1N.A1U()), c1314Zs.A09())) {
                            this.A04.A0E().A4g();
                            c1454cB.A1S(A1K);
                            return;
                        }
                    }
                    if (c1454cB.A1K() == 0) {
                        this.A01.ADU(this, AdError.NO_FILL);
                        return;
                    }
                } else if (AbstractC04430l.A06(this.A04, AbstractC04430l.A01(c1314Zs, c04771u.A03(), ((AbstractC1456cD) this.A03).A1U()), c1314Zs.A09())) {
                    this.A04.A0E().A4g();
                    this.A01.ADU(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A02 = new AnonymousClass18(this.A0B, this, anonymousClass17);
        A06();
        A0C(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final String A6r() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final boolean AH5() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final void onDestroy() {
        A07();
    }
}
