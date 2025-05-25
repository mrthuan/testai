package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class ND extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C2S A02;
    public final C1314Zs A03;
    public final NG A04;
    public final boolean A05;
    public static final int A09 = (int) (LP.A02 * 16.0f);
    public static final int A0A = (int) (LP.A02 * 8.0f);
    public static final int A0D = (int) (LP.A02 * 44.0f);
    public static final int A08 = (int) (LP.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (LP.A02 * 75.0f);
    public static final int A0B = (int) (LP.A02 * 25.0f);
    public static final int A0F = (int) (LP.A02 * 45.0f);
    public static final int A0C = (int) (LP.A02 * 15.0f);
    public static final int A06 = (int) (LP.A02 * 16.0f);

    public ND(NC nc2) {
        super(NC.A01(nc2));
        this.A03 = NC.A01(nc2);
        this.A02 = C2T.A00(this.A03.A01());
        this.A04 = NC.A03(nc2);
        this.A01 = NC.A09(nc2) ? A0E : A0F;
        this.A00 = NC.A09(nc2) ? A0B : A0C;
        this.A05 = NC.A0A(nc2);
        setFocusable(true);
        View A01 = A01(nc2);
        View A00 = A00(nc2);
        View footerView = getFooterView();
        M3.A0K(A01);
        M3.A0K(A00);
        M3.A0K(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, A01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(A01, contentParams);
        addView(A00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(NC.A0B(nc2) ? 0 : 8);
    }

    public /* synthetic */ ND(NC nc2, NA na2) {
        this(nc2);
    }

    private View A00(NC nc2) {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        imageView.setImageBitmap(MC.A01(NC.A02(nc2)));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(NC.A00(nc2));
        M3.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        M3.A0Y(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        subtitleView.setText(NC.A04(nc2));
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        M3.A0Y(titleView, false, 16);
        titleView.setTextColor(-10459280);
        titleView.setText(NC.A05(nc2));
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        if (NC.A08(nc2)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(NC.A06(nc2))) {
                OU ou = new OU(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                ou.setFullCircleCorners(true);
                new AsyncTaskC1183Un(ou, this.A03).A05(A0F, A0F).A07(NC.A06(nc2));
                linearLayout2.addView(ou, iconParams);
            }
            NI ni2 = new NI(this.A03);
            ni2.setData(NC.A07(nc2), MB.CHECKMARK);
            ni2.setSelected(true);
            linearLayout2.addView(ni2, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(NC nc2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (NC.A0C(nc2)) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(MC.A01(MB.CROSS));
            imageView.setOnClickListener(new NA(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(MC.A01(MB.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        M3.A0Y(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new NB(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
