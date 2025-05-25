package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* loaded from: assets/audience_network.dex */
public final class MX extends AdNativeComponentView {
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final RelativeLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final JW A06;
    public final V8 A07;
    public static String[] A08 = {"cqqrkZtRQb88kyLB6Q2uvm01R0QnuoNK", "Nq3CfSfg25oVaXc5kCSSNTYEBmLkWVpQ", "Ug05W3SKca0ZbWrt9dtmEm51Q", "w8D7pTd1AENWsOJ7Gbtv6zmPYShcD12", "Jz7rkQN0I2l0GA78AAlVWxdn72", "N7yF5pKoWcUwU52GLomX8fL4MB9AuJQz", "7uQymxnuKPwGh5iPF3bNh6uz1YyZJI6b", "PV6rNOTmS7sV6l09QwDyTUKdw7Zl10tb"};
    public static final int A09 = ((int) LP.A02) * OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
    public static final int A0H = (int) (LP.A02 * 500.0f);
    public static final int A0D = (int) (LP.A02 * 4.0f);
    public static final int A0B = (int) (LP.A02 * 8.0f);
    public static final int A0G = (int) (LP.A02 * 8.0f);
    public static final int A0E = (int) (LP.A02 * 4.0f);
    public static final int A0C = (int) LP.A02;
    public static final int A0F = (int) (LP.A02 * 4.0f);
    public static final int A0A = (int) (LP.A02 * 0.5d);

    public MX(C1314Zs c1314Zs, JW jw) {
        super(c1314Zs);
        this.A06 = jw;
        this.A05 = new TextView(c1314Zs);
        this.A04 = new TextView(c1314Zs);
        this.A03 = new TextView(c1314Zs);
        this.A02 = new RelativeLayout(c1314Zs);
        this.A00 = new LinearLayout(c1314Zs);
        this.A01 = new RelativeLayout(c1314Zs);
        this.A07 = new V8(c1314Zs);
        A09();
        A0D();
        A05();
        A0A();
        A00();
        A0B();
        A03();
        A0A();
        A08();
        A0C();
    }

    private void A00() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 1;
        this.A00.addView(this.A01, layoutParams);
    }

    private void A01() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A04.getId());
        M3.A0J(this.A03);
        this.A02.addView(this.A03, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        this.A02.setBackgroundDrawable(null);
        this.A02.setPadding(A0G, A0G, A0G, A0G);
        M3.A0J(this.A02);
        this.A00.addView(this.A02, layoutParams2);
    }

    private void A02() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0B, A0D, A0B, A0D);
        M3.A0J(this.A03);
        this.A00.addView(this.A03, layoutParams);
    }

    private void A03() {
        this.A01.addView(this.A07, new LinearLayout.LayoutParams(-2, -1));
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(8, this.A07.getId());
        layoutParams.addRule(5, this.A07.getId());
        layoutParams.addRule(7, this.A07.getId());
        this.A02.setPadding(A0G, 0, A0G, 0);
        GradientDrawable shape = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-872415232, 0});
        this.A02.setBackgroundDrawable(shape);
        M3.A0J(this.A02);
        this.A01.addView(this.A02, layoutParams);
    }

    private void A05() {
        addView(this.A00, new LinearLayout.LayoutParams(-2, -2));
    }

    private void A06() {
        this.A05.setTextColor(-1);
        this.A04.setTextColor(-1);
        this.A03.setTextColor(this.A06.A03());
    }

    private void A07() {
        this.A07.setMaxWidth(A0H);
        this.A05.setTextColor(this.A06.A04(0.2f));
        this.A04.setTextColor(this.A06.A04(0.4f));
        this.A03.setTextColor(this.A06.A03());
        ((LinearLayout.LayoutParams) this.A01.getLayoutParams()).gravity = 1;
    }

    private void A08() {
        this.A03.setPadding(A0C, A0C, A0C, A0C);
        this.A03.setTextSize(14.0f);
        M3.A0K(this.A03);
    }

    private void A09() {
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.A06.A01());
        gradientDrawable.setCornerRadius(A0F);
        gradientDrawable.setStroke(1, this.A06.A02());
        setBackgroundDrawable(gradientDrawable);
        setPadding(A0A, A0A, A0A, A0A);
    }

    private void A0A() {
        M3.A0K(this.A01);
    }

    private void A0B() {
        this.A07.setScaleType(ImageView.ScaleType.FIT_XY);
        this.A07.setRadius(new float[]{A0F, A0F, A0F, A0F, 0.0f, 0.0f, 0.0f, 0.0f});
        this.A07.setAdjustViewBounds(true);
        LU.A04(this.A07, LU.A0B);
        M3.A0K(this.A07);
    }

    private void A0C() {
        M3.A0K(this.A02);
        this.A05.setTextSize(14.0f);
        M3.A0K(this.A05);
        this.A05.setMaxLines(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, A0E);
        this.A02.addView(this.A05, layoutParams);
        this.A04.setTextSize(12.0f);
        M3.A0K(this.A04);
        this.A04.setMaxLines(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, this.A05.getId());
        layoutParams2.setMargins(0, 0, 0, A0E);
        this.A02.addView(this.A04, layoutParams2);
    }

    private void A0D() {
        this.A00.setOrientation(1);
        M3.A0K(this.A00);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A07;
    }

    public ImageView getImageCardView() {
        return this.A07;
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int A0F2 = ((int) LP.A02) * C0877Im.A0F(getContext());
        int heightThreshold = View.MeasureSpec.getSize(i11);
        if (heightThreshold < A0F2) {
            int heightThreshold2 = View.MeasureSpec.getMode(i11);
            if (heightThreshold2 != 0) {
                A02();
                A04();
                A06();
                super.onMeasure(i10, i11);
            }
        }
        A01();
        A07();
        super.onMeasure(i10, i11);
    }

    public void setButtonText(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A03.setVisibility(8);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
        this.A03.setText(spannableString);
    }

    public void setSubtitle(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A04.setVisibility(8);
        }
        this.A04.setText(str);
        String[] strArr = A08;
        if (strArr[0].charAt(31) == strArr[6].charAt(31)) {
            throw new RuntimeException();
        }
        A08[3] = "tjmDQp9WMGCYDxrOu8tbgj2JMnaMPXF";
    }

    public void setTitle(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A05.setVisibility(8);
        }
        this.A05.setText(str);
    }
}
