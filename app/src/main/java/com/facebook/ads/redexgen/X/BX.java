package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class BX extends AbstractC1173Ud {
    public static byte[] A0G;
    public static String[] A0H = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public View A00;
    public View A01;
    public C1314Zs A02;
    public LH A03;
    public MQ A04;
    public UP A05;
    public C1066Qa A06;
    public M9 A07;
    public boolean A08;
    public boolean A09;
    public final MR A0A;
    public final OR A0B;
    public final OS A0C;
    public final T7 A0D;
    public final N5 A0E;
    public final AtomicBoolean A0F;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0G = new byte[]{-23, -117, 1, -6, 15, -2, 24, 12, 13, -6, 11, 13, 2, 7, 0, 24, -6, 7, 2, 6, -6, 13, 2, 8, 7, 12, 24, 9, 5, -6, 18, -2, -3, 26, 29, 33, 19, Field.DDE, 32, 19, Field.PAGEREF, 15, 32, 18, Field.DDE, 33, 17, 32, 19, 19, Field.NUMCHARS, Field.DDE, 33, 22, 29, Field.PAGEREF, Field.NUMCHARS, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    static {
        A09();
        A0L = (int) (LP.A02 * 16.0f);
        A0T = (int) (LP.A02 * 12.0f);
        A0I = (int) (LP.A02 * 8.0f);
        A0J = (int) (LP.A02 * 10.0f);
        A0O = (int) (LP.A02 * 20.0f);
        A0P = (int) (LP.A02 * 13.0f);
        A0M = (int) (LP.A02 * 48.0f);
        A0S = (int) (LP.A02 * 14.0f);
        A0Q = (int) (LP.A02 * 12.0f);
        A0K = (int) (LP.A02 * 8.0f);
        A0R = AbstractC04982p.A01(-1, 77);
        A0N = (int) (LP.A02 * 16.0f);
        A0U = (int) (LP.A02 * 12.0f);
    }

    public BX(C1026Om c1026Om) {
        super(c1026Om, false);
        this.A0F = new AtomicBoolean(false);
        this.A09 = false;
        this.A08 = false;
        this.A02 = c1026Om.A05();
        this.A04 = c1026Om.A09();
        this.A01 = new View(this.A02);
        M3.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A06();
        this.A0A = c1026Om.A0A();
        AbstractC1015Ob.A00(c1026Om.A05(), this, getAdInfo().A0E().A07());
        this.A0D = A01(c1026Om);
        getAdDetailsView().bringToFront();
        this.A0E = A02(c1026Om);
        if (getAdDataBundle().A1F()) {
            this.A0E.setVisibility(8);
            getAdDetailsView().setVisibility(8);
            A05();
        }
        A14();
        this.A06 = new C1066Qa(this.A02, c1026Om.A06(), getAdDataBundle());
        this.A0B = new C1171Ub(this);
        this.A0C = new OS(c1026Om, getAdDataBundle(), this.A0D, this.A0E, getAdDetailsView(), this.A0A, this.A0B);
        LK A0A = super.A07.A0A(getAdDataBundle());
        this.A02.A0G().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A07);
        if (A0A.A00) {
            this.A0D.getVideoImplView().setOnClickListener(new View$OnClickListenerC1029Op(this));
        } else if (C0877Im.A1E(getAdContextWrapper())) {
            OB.A00(this.A0D.getVideoImplView(), C0877Im.A1F(getAdContextWrapper()), new View$OnClickListenerC1030Oq(this));
        }
        if (c1026Om.A04().A1C()) {
            this.A05 = new UP(c1026Om);
            View view = this.A05;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private T7 A01(C1026Om c1026Om) {
        T7 t72 = (T7) c1026Om.A02();
        int A13 = A13(c1026Om.A09());
        ImageView imageView = (ImageView) c1026Om.A03();
        int i10 = AbstractC1173Ud.A0F;
        int i11 = AbstractC1173Ud.A0F;
        int toolbarHeight = AbstractC1173Ud.A0F;
        imageView.setPadding(i10, i11, toolbarHeight, AbstractC1173Ud.A0F);
        int toolbarHeight2 = AbstractC1173Ud.A0G;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC1173Ud.A0G);
        int toolbarHeight3 = AbstractC1173Ud.A0E;
        layoutParams.setMargins(0, A13, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1F() && t72 != null) {
            View videoView = t72.getVideoView();
            int paddingLeft = t72.getVideoView().getPaddingLeft();
            int paddingTop = t72.getVideoView().getPaddingTop();
            int paddingRight = t72.getVideoView().getPaddingRight();
            int toolbarHeight4 = t72.getVideoView().getPaddingBottom();
            videoView.setPadding(paddingLeft, paddingTop, paddingRight, toolbarHeight4 + A0U);
        }
        layoutParams2.addRule(13);
        addView(t72, layoutParams2);
        t72.addView(imageView, layoutParams);
        return t72;
    }

    private N5 A02(C1026Om c1026Om) {
        N5 A0B = c1026Om.A0B();
        A0B.A06(-1, AbstractC1173Ud.A0B);
        A0B.setPadding(AbstractC1173Ud.A0J, AbstractC1173Ud.A0J, AbstractC1173Ud.A0J, AbstractC1173Ud.A0J);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1173Ud.A0I);
        progressBarLayoutParams.addRule(12);
        addView(A0B, progressBarLayoutParams);
        return A0B;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0D.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        A0A(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0L, 0);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0L, A0T, A0L, A0T);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        View$OnClickListenerC1178Ui ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A1D()) {
            ctaButton.setPadding(A0J, A0J, A0J, A0J);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            M3.A0S(ctaButton, M3.A06(-16738826, A0I));
            ctaButton.setPadding(A0O, A0P, A0O, A0P);
            if (Build.VERSION.SDK_INT >= 21) {
                ctaButton.setStateListAnimator(null);
            }
            M3.A0X(ctaButton);
        }
        layoutParams.addRule(11);
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A06() {
        if (this.A04 == null) {
            return;
        }
        this.A07 = new M9(this.A04, 400, -this.A04.getToolbarHeight(), 0);
    }

    private void A07() {
        new JF(getAdDataBundle().A1U(), getAdEventManager()).A04(JE.A0x, null);
        if (!getAdInfo().A0Q()) {
            return;
        }
        this.A0F.set(true);
        M3.A0T(this);
        M3.A0H(this.A0D);
        M3.A0b(this.A0D, this.A0E, this.A0C, this.A00);
        M3.A0L(this.A04);
        this.A00 = (View) this.A06.A03(getCtaButton()).second;
        switch ((QZ) r2.first) {
            case A03:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A13(this.A04), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case A02:
                M3.A0b(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC1173Ud.A0H, AbstractC1173Ud.A0H, AbstractC1173Ud.A0H, AbstractC1173Ud.A0H);
                addView(this.A00, layoutParams2);
                break;
        }
        if (getAdInfo().A0H().A00() >= 0) {
            this.A08 = true;
            if (this.A04 != null) {
                MQ mq = this.A04;
                if (A0H[4].charAt(31) != 'A') {
                    String[] strArr = A0H;
                    strArr[7] = "UaTQnuhxewL8mviYe9uecfBlI4rRsh4E";
                    strArr[5] = "UwFrvZ1NGiSQNsqiRCXgjyhu92nLe3Sn";
                    mq.setToolbarActionMode(2);
                    this.A04.setProgressImmediate(0.0f);
                } else {
                    throw new RuntimeException();
                }
            }
            this.A03 = new LH((int) getAdInfo().A0H().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1170Ua(this));
            this.A03.A07();
        }
    }

    private void A08() {
        if (this.A07 != null) {
            this.A07.A3u(true, false);
        }
        if (getAdDataBundle().A1F()) {
            return;
        }
        M9 adDetailsAnimation = getAdDetailsAnimation();
        String[] strArr = A0H;
        if (strArr[7].charAt(16) == strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        A0H[1] = "1INNplzEPPEJhw482VYN3vhqC3uVrete";
        if (adDetailsAnimation != null) {
            getAdDetailsAnimation().A3u(true, false);
        }
    }

    private void A0A(RelativeLayout relativeLayout) {
        int i10;
        String formattingRatingCount;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0M, A0M);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        OU ou = new OU(this.A02);
        M3.A0M(ou, 0);
        M3.A0K(ou);
        new AsyncTaskC1183Un(ou, this.A02).A05(A0M, A0M).A07(getAdDataBundle().A1S().A01());
        TextView textView = new TextView(this.A02);
        M3.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A1O().A01().A06(true));
        textView.setText(getAdDataBundle().A1P().A0F().A08());
        textView.setTextSize(!getAdDataBundle().A1D() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C1314Zs c1314Zs = this.A02;
        if (!getAdDataBundle().A1D()) {
            i10 = A0S;
        } else {
            i10 = A0Q;
        }
        OW ow = new OW(c1314Zs, i10, 5, A0R, -1);
        ow.setGravity(16);
        LinearLayout.LayoutParams ratingCountParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A02);
        textView2.setTextColor(getAdDataBundle().A1O().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1D()) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0K;
        LinearLayout linearLayout = new LinearLayout(this.A02);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, A0N);
        ratingInfoContainerParams.topMargin = A0K / 2;
        ratingInfoContainerParams.addRule(3, textView.getId());
        linearLayout.addView(ow, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams iconParams = new RelativeLayout.LayoutParams(-2, -2);
        iconParams.leftMargin = A0K;
        iconParams.addRule(1, ou.getId());
        iconParams.addRule(15);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, ratingInfoContainerParams);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, iconParams);
        relativeLayout.addView(ou, layoutParams);
        if (TextUtils.isEmpty(getAdDataBundle().A1P().A0F().A05())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ow.setRating(Float.parseFloat(getAdDataBundle().A1P().A0F().A05()));
        if (getAdDataBundle().A1P().A0F().A04() == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A03(0, 1, 108));
        if (!getAdDataBundle().A1D()) {
            formattingRatingCount = NumberFormat.getNumberInstance().format(Integer.parseInt(getAdDataBundle().A1P().A0F().A04()));
        } else {
            formattingRatingCount = LY.A01(Integer.parseInt(getAdDataBundle().A1P().A0F().A04()));
        }
        sb2.append(formattingRatingCount);
        String formattingRatingCount2 = A03(1, 1, 13);
        sb2.append(formattingRatingCount2);
        String formattingRatingCount3 = sb2.toString();
        textView2.setText(formattingRatingCount3);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0D(C9R c9r) {
        super.A0D(c9r);
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0E(C9O c9o) {
        super.A0E(c9o);
        int A00 = c9o.A00();
        int videoLengthMs = this.A0D.getDuration();
        int videoLengthMs2 = videoLengthMs - A00;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0J()) {
            getAnimationPlugin().A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1173Ud, com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0v() {
        super.A0v();
        A04();
        this.A04 = null;
        this.A05 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1173Ud, com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A10(C1F c1f, String str, double d10, Bundle bundle) {
        super.A10(c1f, str, d10, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(2, 31, 100), false)) {
            A08();
        }
        if (bundle.getBoolean(A03(57, 18, 77), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(33, 24, 121), false)) {
            this.A0C.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A11() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A12(boolean z10) {
        if (z10 && !this.A09 && !this.A0F.get()) {
            this.A0C.A07(this);
            return true;
        } else if (getAdInfo().A0Q()) {
            boolean z11 = this.A0F.get();
            if (A0H[4].charAt(31) != 'A') {
                String[] strArr = A0H;
                strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
                strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
                if (!z11) {
                    this.A0D.A0a(EnumC1079Qn.A08);
                    return true;
                }
                return false;
            }
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1173Ud
    public final void A14() {
        super.A14();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A9r(this.A0D);
        }
    }

    public final void A16() {
        getCtaButton().A09(A03(75, 9, 37));
    }

    public final void A17() {
        new JF(((AbstractC1022Oi) this).A06.A04().A1U(), getAdEventManager()).A04(JE.A0f, null);
        if (((AbstractC1022Oi) this).A06.A09() != null) {
            MQ A09 = ((AbstractC1022Oi) this).A06.A09();
            if (A0H[4].charAt(31) == 'A') {
                throw new RuntimeException();
            }
            A0H[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            A09.setVisibility(8);
            removeView(((AbstractC1022Oi) this).A06.A09());
        }
        removeView(this.A05);
        removeView(this.A0D);
        A04();
        removeView(getAdDetailsView());
        removeView(this.A0E);
        A15();
    }

    public final void A18(C9S c9s) {
        if (this.A05 != null) {
            this.A05.A13(c9s);
            this.A05.A0v();
            removeView(this.A05);
            this.A05 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    public final boolean A19() {
        return getAdInfo().A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public int getCloseButtonStyle() {
        if (this.A08) {
            return 2;
        }
        if (A19() && !this.A0F.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1173Ud, com.facebook.ads.redexgen.X.AbstractC1022Oi, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A05 != null) {
            UP up = this.A05;
            if (A0H[0].length() == 5) {
                throw new RuntimeException();
            }
            A0H[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (up.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
            }
        }
    }

    public void setVideoAdViewListener(QB qb2) {
        if (this.A05 != null) {
            this.A05.setVideoAdViewListener(qb2);
        }
    }
}
