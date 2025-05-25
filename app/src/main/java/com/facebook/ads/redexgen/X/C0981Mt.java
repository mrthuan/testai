package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Mt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0981Mt extends LinearLayout {
    public static final int A03 = (int) (LP.A02 * 10.0f);
    public static final int A04 = (int) (LP.A02 * 24.0f);
    public final ImageView A00;
    public final C2S A01;
    public final C1314Zs A02;

    public C0981Mt(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A02 = c1314Zs;
        this.A01 = C2T.A00(c1314Zs.A01());
        this.A00 = new ImageView(c1314Zs);
        A02();
    }

    private void A02() {
        A03(this.A00, MB.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, MB mb2) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(MC.A01(mb2));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1Z c1z, String str, JF jf2, MR mr) {
        setOnClickListener(new View$OnClickListenerC0980Ms(this, jf2, mr, str, c1z));
    }

    public void setIconColors(int i10) {
        this.A00.setColorFilter(i10);
    }
}
