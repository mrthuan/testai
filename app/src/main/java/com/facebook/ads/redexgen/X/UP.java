package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: assets/audience_network.dex */
public final class UP extends AbstractC1022Oi {
    public RelativeLayout A00;
    public RelativeLayout A01;
    public QB A02;
    public TC A03;
    public T7 A04;
    public C9S A05;
    public final LinearLayout A06;
    public final LinearLayout A07;
    public final LinearLayout A08;
    public final LinearLayout A09;
    public final RelativeLayout A0A;
    public final C1314Zs A0B;
    public final C1026Om A0C;
    public final AbstractC1127Sj A0D;
    public final AbstractC1105Rn A0E;
    public static String[] A0F = {"dHduAtxHUODsuZJhGBZCL", "yuyhTKr6448pVSOhbbO3QanDkg1Btrke", "", "Gtku4tEVnL9u23uc2EIXKUUStEslbjmu", "uz", "Ug", "s4BqeuLW7FPjKDKoSZG73iWJUNxNcWet", "kGKRi0uYqdf74JFz2mP0bKfaoGbNkKkY"};
    public static final int A0V = (int) (LP.A02 * 24.0f);
    public static final int A0U = (int) (LP.A02 * 8.0f);
    public static final int A0N = (int) (LP.A02 * 1.0f);
    public static final int A0O = (int) (LP.A02 * 24.0f);
    public static final int A0T = (int) (LP.A02 * 3.0f);
    public static final int A0I = (int) (LP.A02 * 5.0f);
    public static final int A0W = (int) (LP.A02 * 8.0f);
    public static final int A0J = (int) (LP.A02 * 16.0f);
    public static final int A0L = (int) (LP.A02 * 16.0f);
    public static final int A0K = (int) (LP.A02 * 8.0f);
    public static final int A0M = (int) (LP.A02 * 8.0f);
    public static final int A0P = (int) (LP.A02 * 12.0f);
    public static final int A0H = (int) (LP.A02 * 40.0f);
    public static final int A0S = (int) (LP.A02 * 16.0f);
    public static final int A0R = (int) (LP.A02 * 24.0f);
    public static final int A0Q = (int) (LP.A02 * 16.0f);
    public static final int A0G = (int) (LP.A02 * 6.0f);

    public UP(C1026Om c1026Om) {
        super(c1026Om, false);
        this.A0E = new BW(this);
        this.A0D = new BV(this);
        this.A0B = c1026Om.A05();
        this.A0C = c1026Om;
        this.A06 = new LinearLayout(this.A0B);
        this.A09 = new LinearLayout(this.A0B);
        this.A0A = new RelativeLayout(this.A0B);
        this.A08 = new LinearLayout(this.A0B);
        this.A07 = new LinearLayout(this.A0B);
        A08();
    }

    private LinearLayout A00() {
        LinearLayout linearLayout = new LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        linearLayout.setWeightSum(3.0f);
        linearLayout.setPadding(A0U, A0U, A0U, A0U);
        String A05 = this.A0C.A04().A1P().A0F().A05();
        String A01 = this.A0C.A04().A1P().A0F().A01();
        String A03 = this.A0C.A04().A1P().A0F().A03();
        if (!TextUtils.isEmpty(A05)) {
            MB mb2 = MB.RATINGS;
            AbstractC1456cD A04 = this.A0C.A04();
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "";
            LinearLayout videoMetaDataLayout = A01(mb2, A04.A1P().A0F().A05());
            linearLayout.addView(videoMetaDataLayout);
        }
        if (!TextUtils.isEmpty(A03)) {
            LinearLayout videoMetaDataLayout2 = A01(MB.APP_DOWNLOAD_ICON, this.A0C.A04().A1P().A0F().A03());
            linearLayout.addView(videoMetaDataLayout2);
        }
        if (!TextUtils.isEmpty(A01)) {
            LinearLayout videoMetaDataLayout3 = A01(MB.APP_SIZE_ICON, this.A0C.A04().A1P().A0F().A01());
            linearLayout.addView(videoMetaDataLayout3);
        }
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        return linearLayout;
    }

    private LinearLayout A01(MB mb2, String str) {
        LinearLayout linearLayout = new LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, A0V);
        layoutParams.weight = 1.0f;
        linearLayout.setGravity(17);
        layoutParams.setMargins(A0T, A0T, A0T, A0T);
        linearLayout.setLayoutParams(layoutParams);
        M3.A0S(linearLayout, M3.A06(SlideAtom.USES_MASTER_SLIDE_ID, A0Q));
        OO oo2 = new OO(this.A0C.A05(), 0, -1, mb2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0P, A0P);
        layoutParams2.gravity = 16;
        oo2.setLayoutParams(layoutParams2);
        linearLayout.addView(oo2);
        TextView textView = new TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(-1);
        M3.A0Y(textView, false, 12);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(A0W, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private final RelativeLayout A02(String str, int i10, MB mb2) {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0B);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0H);
        relativeLayout.setPadding(A0J, 0, A0J, 0);
        M3.A0S(relativeLayout, M3.A06(i10, A0G));
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(this.A0B);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        textView.setText(str);
        textView.setTextColor(-1);
        M3.A0Y(textView, true, 15);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        OO iconView = new OO(this.A0C.A05(), 0, -1, mb2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(A0P, A0P);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, A0I, 0, 0);
        iconView.setLayoutParams(layoutParams3);
        relativeLayout.addView(iconView);
        return relativeLayout;
    }

    private TextView A03(String str, boolean z10, int i10, int i11, int i12) {
        TextView textView = new TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(i11);
        M3.A0Y(textView, z10, i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(A0K, 0, A0K, i12);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private T7 A05() {
        T7 t72 = new T7(this.A0C.A05());
        M3.A0S(t72, M3.A06(436207616, A0Q));
        t72.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A05 = new C9S(this.A0B, getAdEventManager(), t72, this.A0C.A04().A1U(), 0, 0, true, null, null);
        if (C0877Im.A1q(this.A0B)) {
            this.A03 = new TC(this.A0B, getAdEventManager(), t72, this.A0C.A04().A1U(), this.A05, null);
        } else {
            this.A03 = null;
        }
        return t72;
    }

    private void A07() {
        this.A00 = A02(this.A0C.A04().A0h(), -14977820, MB.RIGHT_ARROW_ICON);
        this.A01 = A02(this.A0C.A04().A0k(), -13816531, MB.SKIP_ARROW);
        View divider = getDivider();
        LinearLayout linearLayout = this.A09;
        View divider2 = this.A00;
        linearLayout.addView(divider2);
        this.A09.addView(divider);
        LinearLayout linearLayout2 = this.A09;
        View divider3 = this.A01;
        linearLayout2.addView(divider3);
        this.A00.setOnClickListener(new PA(this));
        this.A01.setOnClickListener(new PB(this));
    }

    private void A08() {
        new JF(this.A0C.A04().A1U(), getAdEventManager()).A04(JE.A0d, null);
        AbstractC1015Ob.A00(this.A0C.A05(), this, this.A0C.A04().A1P().A0E().A07());
        int A00 = this.A0C.A00();
        this.A09.setOrientation(1);
        A09();
        A0A(A00);
        addView(this.A06);
        A0B(A00);
        RelativeLayout relativeLayout = this.A0A;
        int orientation = A0Q;
        M3.A0S(relativeLayout, M3.A06(436207616, orientation));
        A0C(A00);
        this.A04 = A05();
        this.A0A.addView(this.A04);
        this.A0A.addView(A00());
        this.A06.addView(this.A0A);
        A07();
        this.A06.addView(this.A09);
        this.A04.setVideoURI(this.A0C.A04().A1P().A0E().A08());
        this.A04.A0b(EnumC1084Qs.A02, 20);
        this.A04.getEventBus().A03(this.A0E, this.A0D);
    }

    private void A09() {
        this.A08.setOrientation(1);
        this.A07.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        this.A08.setLayoutParams(layoutParams);
        layoutParams.weight = 1.0f;
        A0D(this.A08);
        A0D(this.A07);
        this.A06.addView(this.A08);
        this.A09.addView(this.A07);
    }

    private void A0A(int i10) {
        int height;
        int width;
        this.A06.setOrientation(i10 == 1 ? 1 : 0);
        if (this.A0B.A0D() == null || this.A0B.A0D().getWindowManager() == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.A0B.A0D().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int marginHorizontal = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        if (i10 == 1) {
            height = marginHorizontal / 6;
            width = i11 / 8;
            this.A06.setWeightSum(6.0f);
        } else {
            height = marginHorizontal / 8;
            width = i11 / 6;
            this.A06.setWeightSum(2.0f);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(height, width, height, width);
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
        setRewardDescContainerVisibility(i10);
    }

    private void A0B(int i10) {
        LinearLayout.LayoutParams layoutParams;
        if (i10 == 1) {
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.setMargins(0, A0S, 0, 0);
            layoutParams.weight = 2.0f;
            this.A09.setGravity(0);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.setMargins(A0R, 0, 0, 0);
            layoutParams.weight = 1.0f;
            this.A09.setGravity(16);
        }
        this.A09.setLayoutParams(layoutParams);
    }

    private void A0C(int i10) {
        LinearLayout.LayoutParams layoutParams;
        if (i10 == 1) {
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -1);
        }
        layoutParams.weight = i10 == 1 ? 3.0f : 1.0f;
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0D(LinearLayout linearLayout) {
        TextView summaryView = A03(this.A0C.A04().A0j(), true, 24, -657931, A0M);
        TextView titleView = A03(this.A0C.A04().A0i(), false, 15, -1, A0L);
        linearLayout.addView(summaryView);
        linearLayout.addView(titleView);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0v() {
        super.A0v();
        if (this.A03 != null) {
            this.A03.A05();
        }
        if (this.A05 != null) {
            this.A05.A0o();
        }
        this.A04.getEventBus().A04(this.A0E, this.A0D);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A11() {
        return true;
    }

    public final void A13(C9S c9s) {
        if (this.A05 != null) {
            this.A05.A0n(c9s);
        }
    }

    private View getDivider() {
        View view = new View(this.A0B);
        view.setBackgroundColor(-10131605);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0N);
        layoutParams.setMargins(0, A0O, 0, A0O);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0A(configuration.orientation);
        A0B(configuration.orientation);
        A0C(configuration.orientation);
        requestLayout();
    }

    private void setRewardDescContainerVisibility(int i10) {
        if (i10 == 1) {
            this.A08.setVisibility(0);
            this.A07.setVisibility(8);
            return;
        }
        this.A08.setVisibility(8);
        this.A07.setVisibility(0);
    }

    public void setVideoAdViewListener(QB qb2) {
        this.A02 = qb2;
    }
}
