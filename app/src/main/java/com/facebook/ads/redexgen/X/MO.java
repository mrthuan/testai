package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class MO extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2S A02;
    public final C1314Zs A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, Field.SECTIONPAGES};
    }

    static {
        A03();
        A08 = (int) (LP.A02 * 50.0f);
        A05 = (int) (LP.A02 * 10.0f);
        A06 = (int) (LP.A02 * 20.0f);
        A09 = (int) (LP.A02 * 4.0f);
        A07 = (int) (LP.A02 * 12.0f);
    }

    public MO(C1314Zs c1314Zs, int i10) {
        super(c1314Zs);
        this.A03 = c1314Zs;
        this.A02 = C2T.A00(c1314Zs.A01());
        setOrientation(0);
        this.A00 = new ImageView(c1314Zs);
        this.A01 = new ImageView(c1314Zs);
        A04(i10);
    }

    private void A04(int i10) {
        MB mb2;
        A05(this.A00, MB.AD_CHOICES_ICON);
        if (i10 == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            M3.A0Y(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i10 == 1) {
            mb2 = MB.AN_INFO_ICON;
        } else {
            mb2 = MB.DEFAULT_INFO_ICON;
        }
        A05(this.A01, mb2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, MB mb2) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(MC.A01(mb2));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1Z c1z, String str, JF jf2, MR mr) {
        setOnClickListener(new MN(this, jf2, mr, str, c1z));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i10);
        M3.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i10) {
        this.A00.setColorFilter(i10);
        this.A01.setColorFilter(i10);
    }
}
