package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class Q7 extends LinearLayout {
    public LinearLayout A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final C1314Zs A04;
    public final OU A05;
    public final C1014Oa A06;
    public static String[] A07 = {"mO6OCzz183u1Bigulq5KeRnnu3UhUErY", "M8wuVwCqg47swjluxOTBwYkXCALJOS1f", "isO3a6yeUrEqJHaKmCFaV", "J8y0fQZRtVpgz1Itec1cmA3ue79eN13N", "z6IigVxY2j2waSprQRCf4749VcxJv5uz", "GG3OTiE6t7MwpY", "UBA0QA1YjTXejDlGkh9vREu7YbW4o1hK", "iNB15eFG13fee2"};
    public static final int A0A = (int) (LP.A02 * 16.0f);
    public static final int A0B = (int) (LP.A02 * 32.0f);
    public static final int A0C = (int) (LP.A02 * 16.0f);
    public static final int A09 = (int) (LP.A02 * 4.0f);
    public static final int A08 = (int) (LP.A02 * 72.0f);

    public Q7(Q5 q5) {
        super(Q5.A04(q5));
        this.A02 = false;
        this.A01 = "";
        this.A04 = Q5.A04(q5);
        this.A05 = new OU(this.A04);
        this.A06 = new C1014Oa(this.A04, Q5.A02(q5), true, false, true);
        this.A03 = Q5.A00(q5);
        this.A02 = Q5.A08(q5);
        this.A01 = Q5.A05(q5);
        A03(q5);
    }

    public /* synthetic */ Q7(Q5 q5, C1151Th c1151Th) {
        this(q5);
    }

    private void A00() {
        A01(this.A05, ShapeTypes.FLOW_CHART_EXTRACT);
        A01(this.A06, ShapeTypes.ACTION_BUTTON_DOCUMENT);
        if (this.A00 != null) {
            A01(this.A00, 190);
        }
    }

    private void A01(View view, int i10) {
        view.setTranslationY(i10);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i10).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(Q5 q5) {
        if (!TextUtils.isEmpty(Q5.A06(q5))) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            int i10 = A0C / 2;
            if (this.A02) {
                i10 = 0;
            }
            LinearLayout linearLayout = this.A00;
            int i11 = A0C;
            int i12 = A0C;
            int marginTop = A0C;
            linearLayout.setPadding(i11, i10, i12, marginTop / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, i10, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            M3.A0Y(textView, false, 16);
            textView.setText(Q5.A06(q5));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC1183Un(imageView, this.A04).A04().A07(Q5.A07(q5));
            int i13 = A0A;
            int marginTop2 = A0A;
            LinearLayout.LayoutParams informativeContainerParams = new LinearLayout.LayoutParams(i13, marginTop2);
            int marginTop3 = A0C;
            informativeContainerParams.setMargins(0, 0, marginTop3 / 2, 0);
            if (this.A02) {
                OO oo2 = new OO(getContext(), 0, -1, MB.PLAYABLE_ICON);
                oo2.setLayoutParams(new LinearLayout.LayoutParams(A0B, A0B));
                this.A00.addView(oo2);
            } else {
                this.A00.addView(imageView, informativeContainerParams);
                this.A00.addView(textView, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(100.0f);
                gradientDrawable.setColor(469762047);
                M3.A0S(this.A00, gradientDrawable);
            }
            View view = this.A00;
            String[] strArr = A07;
            String str = strArr[5];
            String str2 = strArr[7];
            int length = str.length();
            int marginTop4 = str2.length();
            if (length != marginTop4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "6JdK2pyeEPUWkfGuYxPy07w26kgdYt9J";
            strArr2[1] = "5VEwQONd4c8VI19uC0Ib5tVL9YvIxUH6";
            addView(view, layoutParams);
        }
    }

    private void A03(Q5 q5) {
        M3.A0M(this.A05, 0);
        this.A05.setRadius(50);
        if (this.A02) {
            this.A05.setRadius(A09);
        } else if (Q5.A01(q5).A00() == C1K.A05) {
            this.A05.setFullCircleCorners(true);
        } else {
            OU ou = this.A05;
            int i10 = A09;
            String[] strArr = A07;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[2] = "avcxrBXnTsgV2I5Ie1k2l";
            ou.setRadius(i10);
        }
        new AsyncTaskC1183Un(this.A05, this.A04).A04().A07(Q5.A03(q5).A01());
        this.A06.A03(Q5.A01(q5).A08(), Q5.A03(q5).A03(), null, false, true);
        if (!this.A02) {
            this.A06.getDescriptionTextView().setAlpha(0.8f);
        } else {
            this.A06.getDescriptionTextView().setText(this.A01);
        }
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A0C, 0, A0C / 2);
        View view = this.A05;
        LinearLayout.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(A08, A08);
        addView(view, titleAndDescriptionParams);
        addView(this.A06, layoutParams);
        A02(q5);
        M3.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(Q6 q6) {
        A00();
        postDelayed(new C1151Th(this, q6), this.A03);
    }
}
