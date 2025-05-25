package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class GL<NativeViewabilityLogger> implements InterfaceC1484cf {
    public static byte[] A0J;
    public static String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final String A0L;
    public InterfaceC04540x A00;
    public C04550y A01;
    public C1464cL A02;
    public C0804Fn A03;
    public C0783Ei A04;
    public J7 A05;
    public EnumC0896Jj A06;
    public O1 A08;
    public C1185Up A09;
    public BN A0A;
    public AbstractC1101Rj A0B;
    public C1102Rk A0C;
    public String A0E;
    public final String A0I = UUID.randomUUID().toString();
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public C0957Lv A07 = new C0957Lv();
    public Boolean A0D = false;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{Field.NUMCHARS, Field.DATA, Field.ASK, -25, 31, 26, Field.NUMCHARS, 30, Field.NUMWORDS, Field.DATA, Field.DATA, 36, -25, 26, 29, 44, -25, Field.NUMWORDS, 26, Field.FILLIN, Field.FILLIN, 30, 43, -25, Field.NUMCHARS, Field.PAGEREF, 34, Field.NUMCHARS, 36, 30, 29, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = GL.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A0A != null && this.A03 != null && this.A03.A19()) {
            this.A00.ABO(this, this.A0A);
        }
        if (this.A00 != null) {
            boolean z10 = this.A0F;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z10 && (this.A0G || !this.A0H)) {
                InterfaceC04540x interfaceC04540x = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    interfaceC04540x.ABO(this, this.A09);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    interfaceC04540x.ABO(this, this.A09);
                }
            }
        }
        this.A04.A0E().A44(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i10, C8X c8x) {
        C1481cc c1481cc = new C1481cc(this);
        this.A0A = new BN(this.A04, this.A05, c1481cc, this.A03, A08(0, 31, 79), 2, this.A07);
        this.A0B = new C1480cb(this);
        this.A0C = new C1102Rk(this.A0A, c8x.A04(), c8x.A09(), true, new WeakReference(this.A0B), this.A04);
        this.A0C.A0W(this.A03.A0O());
        this.A0C.A0X(this.A03.A0P());
        this.A0A.setVisibility(0);
        this.A04.getResources();
        this.A0A.setLayoutParams(new LinearLayout.LayoutParams(-1, i10));
        this.A0A.AGz();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C8X c8x, JSONObject jSONObject, EnumC0896Jj enumC0896Jj) {
        this.A0G = false;
        C1466cN A00 = C1466cN.A00(this.A04, jSONObject);
        this.A0E = A00.A6r();
        if (AbstractC04430l.A06(this.A04, A00, this.A05)) {
            this.A04.A0E().A4g();
            this.A00.ACN(this, C0894Jg.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A08 = new GO(this, A00);
        this.A09 = new C1185Up(this.A04, new WeakReference(this.A08), c8x.A04(), A6r());
        this.A09.A0G(c8x.A07(), c8x.A08());
        AbstractC04490s impressionHelper = new C1479ca(this);
        this.A02 = new C1464cL(this.A04, this.A05, this.A09, this.A09.getViewabilityChecker(), impressionHelper, enumC0896Jj);
        this.A02.A08(A00);
        this.A09.loadDataWithBaseURL(O4.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0F = true;
        A0A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (com.facebook.ads.redexgen.X.C0877Im.A26(r10.A04) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass65.A0A(r10.A03.A0o()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (com.facebook.ads.redexgen.X.C0877Im.A26(r10.A04) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        r0 = 0;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0G(com.facebook.ads.redexgen.X.EnumC0896Jj r11, com.facebook.ads.redexgen.X.C8X r12) {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.Fn r0 = r10.A03
            if (r0 == 0) goto L23
            com.facebook.ads.redexgen.X.J7 r3 = r10.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.GL.A0K
            r0 = 1
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 73
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GL.A0K
            java.lang.String r1 = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS"
            r0 = 4
            r2[r0] = r1
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r11.A03()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.GL.A0K
            r0 = 3
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 71
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GL.A0K
            java.lang.String r1 = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z"
            r0 = 5
            r2[r0] = r1
            float r1 = (float) r3
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            com.facebook.ads.redexgen.X.Ei r0 = r10.A04
            boolean r0 = com.facebook.ads.redexgen.X.C0877Im.A26(r0)
            if (r0 == 0) goto L7c
        L53:
            com.facebook.ads.redexgen.X.Fn r0 = r10.A03
            org.json.JSONObject r0 = r0.A0o()
            boolean r0 = com.facebook.ads.redexgen.X.AnonymousClass65.A0A(r0)
            if (r0 == 0) goto L7c
            r0 = 1
        L60:
            if (r0 != 0) goto L7e
            r10.A0C(r1, r12)
            return
        L66:
            float r1 = (float) r3
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            com.facebook.ads.redexgen.X.Ei r0 = r10.A04
            boolean r0 = com.facebook.ads.redexgen.X.C0877Im.A26(r0)
            if (r0 == 0) goto L7c
            goto L53
        L7c:
            r0 = 0
            goto L60
        L7e:
            com.facebook.ads.redexgen.X.Ei r0 = r10.A04
            com.facebook.ads.redexgen.X.6f r4 = new com.facebook.ads.redexgen.X.6f
            r4.<init>(r0)
            r2 = r10
            com.facebook.ads.redexgen.X.65 r3 = new com.facebook.ads.redexgen.X.65
            com.facebook.ads.redexgen.X.Fn r0 = r10.A03
            org.json.JSONObject r5 = r0.A0o()
            com.facebook.ads.redexgen.X.Fn r0 = r10.A03
            java.lang.String r6 = r0.A0c()
            com.facebook.ads.redexgen.X.Fn r0 = r10.A03
            java.lang.String r7 = r0.A0l()
            com.facebook.ads.redexgen.X.ce r9 = new com.facebook.ads.redexgen.X.ce
            r9.<init>(r10, r1, r12, r2)
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.A0B()
            return
        La7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GL.A0G(com.facebook.ads.redexgen.X.Jj, com.facebook.ads.redexgen.X.8X):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final String A6r() {
        return this.A0E;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final AdPlacementType A82() {
        if (C0877Im.A14(this.A04)) {
            EnumC0896Jj enumC0896Jj = this.A06;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC0896Jj != null && this.A06 == EnumC0896Jj.A09) {
                return AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1484cf
    public final void A9p(C0783Ei c0783Ei, J7 j72, EnumC0896Jj enumC0896Jj, InterfaceC04540x interfaceC04540x, JSONObject jSONObject, C8X c8x) {
        c0783Ei.A0E().A43();
        this.A04 = c0783Ei;
        this.A05 = j72;
        this.A00 = interfaceC04540x;
        this.A06 = enumC0896Jj;
        this.A0H = C0877Im.A1e(this.A04.getApplicationContext());
        this.A03 = C0804Fn.A02(jSONObject, this.A04);
        if (this.A03.A19()) {
            A0G(enumC0896Jj, c8x);
        } else {
            A0F(c8x, jSONObject, enumC0896Jj);
        }
        this.A01 = new C04550y(this.A04, this.A0I, this, interfaceC04540x);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final boolean AH5() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04460p
    public final void onDestroy() {
        this.A04.A0E().A41(this.A09 != null);
        if (this.A09 != null) {
            this.A09.destroy();
            this.A09 = null;
            this.A08 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
