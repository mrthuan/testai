package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class NI extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (LP.A02 * 16.0f);
    public static final int A05 = (int) (LP.A02 * 12.0f);
    public static final int A06 = (int) (LP.A02 * 12.0f);
    public static final int A03 = (int) (LP.A02 * 16.0f);

    public NI(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A00 = false;
        setOrientation(0);
        setPadding(A04, A05, A04, A05);
        this.A01 = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A03, A03);
        layoutParams.gravity = 17;
        this.A02 = new TextView(getContext());
        LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, textViewParams);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        M3.A0S(this, gradientDrawable);
        M3.A0Y(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, MB mb2) {
        this.A02.setText(str);
        if (mb2 != null) {
            this.A01.setImageBitmap(MC.A01(mb2));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.A00 = z10;
        A00();
    }
}
