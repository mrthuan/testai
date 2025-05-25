package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class V1 extends NE {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2S A03;
    public final C1314Zs A04;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, Field.DOCPROPERTY, 118, -103, Field.DOCPROPERTY, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A0C();
        A08 = (int) (LP.A02 * 8.0f);
        A07 = (int) (LP.A02 * 10.0f);
        A06 = (int) (LP.A02 * 44.0f);
    }

    public V1(C1314Zs c1314Zs, J7 j72, String str) {
        super(c1314Zs, j72, str);
        this.A04 = c1314Zs;
        this.A03 = C2T.A00(this.A04.A01());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        M3.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0L() {
        this.A00.setImageBitmap(MC.A01(MB.CROSS));
        this.A00.setOnClickListener(new NX(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        NI ni2 = new NI(this.A04);
        ni2.setData(this.A03.A0H(), MB.HIDE_AD);
        ni2.setOnClickListener(new NY(this, ni2));
        NI ni3 = new NI(this.A04);
        ni3.setData(this.A03.A0L(), MB.REPORT_AD);
        ni3.setOnClickListener(new NZ(this, ni3));
        NI ni4 = new NI(this.A04);
        ni4.setData(this.A03.A0M(), MB.AD_CHOICES_ICON);
        ni4.setOnClickListener(new View$OnClickListenerC0988Na(this, ni4));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        M3.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(ni2, menuParams);
        linearLayout.addView(ni3, menuParams);
        linearLayout.addView(ni4, menuParams);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0M() {
        M3.A0I(this);
        M3.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0N(C2W c2w, C2U c2u) {
        String A0H;
        MB mb2;
        int i10;
        this.A00.setOnClickListener(null);
        if (c2u == C2U.A06) {
            A0H = this.A03.A0F();
            mb2 = MB.REPORT_AD;
            i10 = -552389;
        } else {
            A0H = this.A03.A0H();
            mb2 = MB.HIDE_AD;
            i10 = -13272859;
        }
        NC A0I = new NC(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        NC A0H2 = A0I.A0H(title);
        String title2 = c2w.A04();
        ND adHiddenView = A0H2.A0F(title2).A0K(false).A0E(mb2).A0D(i10).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        M3.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0O(C2W c2w, C2U c2u) {
        boolean isReportFlow = c2u == C2U.A06;
        NW nw = new NW(this.A04, c2w, this.A0B, isReportFlow ? MB.REPORT_AD : MB.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(MC.A01(MB.BACK_ARROW));
        this.A00.setOnClickListener(new View$OnClickListenerC0989Nb(this));
        this.A00.setContentDescription(A0B(0, 4, 114));
        M3.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(nw, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final boolean A0P() {
        return true;
    }
}
