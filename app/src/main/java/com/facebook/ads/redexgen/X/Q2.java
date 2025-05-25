package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class Q2 extends RelativeLayout {
    public View$OnClickListenerC1178Ui A00;
    public final View.OnClickListener A01;
    public final C1M A02;
    public final C1Z A03;
    public final C1314Zs A04;
    public final OU A05;
    public final C1014Oa A06;
    public final String A07;
    public static final int A0B = (int) (LP.A02 * 2.0f);
    public static final int A0F = (int) (LP.A02 * 16.0f);
    public static final int A0D = (int) (LP.A02 * 20.0f);
    public static final int A0E = (int) (LP.A02 * 13.0f);
    public static final int A08 = (int) (LP.A02 * 72.0f);
    public static final int A0C = (int) (LP.A02 * 8.0f);
    public static final int A0A = (int) (LP.A02 * 24.0f);
    public static final int A09 = (int) (LP.A02 * 16.0f);

    public Q2(C1314Zs c1314Zs, C1Z c1z, C1M c1m, View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui, String str, View.OnClickListener onClickListener) {
        super(c1314Zs);
        this.A04 = c1314Zs;
        this.A03 = c1z;
        this.A02 = c1m;
        this.A00 = view$OnClickListenerC1178Ui;
        this.A07 = str;
        this.A01 = onClickListener;
        this.A05 = new OU(this.A04);
        this.A06 = new C1014Oa(this.A04, C1O.A01(null), true, false, true);
        A00();
    }

    private void A00() {
        AbstractC1015Ob.A00(this.A04, this, this.A03.A01());
        ImageView imageView = new ImageView(this.A04);
        imageView.setImageBitmap(MC.A01(MB.REDESIGN_CLOSE_ICON));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0A, A0A);
        imageView.setColorFilter(-1);
        layoutParams.addRule(11);
        layoutParams.setMargins(A09, A09, A09, A09);
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        imageView.setOnClickListener(this.A01);
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        ImageView closeImageView = this.A05;
        M3.A0M(closeImageView, 0);
        this.A05.setRadius(A0B);
        new AsyncTaskC1183Un(this.A05, this.A04).A04().A07(this.A03.A01());
        this.A06.A03(this.A02.A08(), this.A03.A03(), null, false, true);
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, A0F, 0, A0F);
        this.A06.getDescriptionTextView().setText(this.A07);
        linearLayout.addView(this.A05, new LinearLayout.LayoutParams(A08, A08));
        linearLayout.addView(this.A06, layoutParams2);
        if (this.A00 != null) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            this.A00.setPadding(A0D, A0E, A0D, A0E);
            this.A00.setLayoutParams(layoutParams3);
            M3.A0S(this.A00, M3.A06(-16738826, A0C));
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00.setStateListAnimator(null);
            }
            M3.A0X(this.A00);
            linearLayout.addView(this.A00);
        }
        addView(linearLayout);
    }
}
