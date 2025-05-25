package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class V2 extends NE {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2S A04;
    public final C1314Zs A05;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, Field.GLOSSARY, Field.MACROBUTTON, Field.PAGEREF, 96, 1, 36, 96, 18, Field.PAGEREF, 48, Field.GLOSSARY, Field.GOTOBUTTON, Field.AUTONUMOUT, 41, Field.DDEAUTO, Field.FILLIN};
    }

    static {
        A0C();
        A09 = (int) (LP.A02 * 4.0f);
        A08 = (int) (LP.A02 * 10.0f);
        A07 = (int) (LP.A02 * 44.0f);
    }

    public V2(C1314Zs c1314Zs, J7 j72, String str) {
        super(c1314Zs, j72, str);
        this.A05 = c1314Zs;
        this.A04 = C2T.A00(c1314Zs.A01());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        M3.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0L() {
        this.A01.setImageBitmap(MC.A01(MB.CROSS));
        this.A01.setOnClickListener(new NN(this));
        this.A01.setContentDescription(A0B(4, 18, 84));
        NI ni2 = new NI(this.A05);
        ni2.setData(this.A04.A0H(), MB.HIDE_AD);
        ni2.setOnClickListener(new NO(this, ni2));
        NI ni3 = new NI(this.A05);
        ni3.setData(this.A04.A0L(), MB.REPORT_AD);
        ni3.setOnClickListener(new NP(this, ni3));
        NI ni4 = new NI(this.A05);
        ni4.setData(this.A04.A0M(), MB.AD_CHOICES_ICON);
        ni4.setOnClickListener(new NQ(this, ni4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        M3.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(ni2, layoutParams);
        this.A02.addView(ni3, layoutParams);
        this.A02.addView(ni4, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0M() {
        M3.A0I(this);
        M3.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0N(C2W c2w, C2U c2u) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        M3.A0Y(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        M3.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0O(C2W c2w, C2U c2u) {
        M3.A0T(this.A03);
        this.A01.setImageBitmap(MC.A01(MB.BACK_ARROW));
        this.A01.setOnClickListener(new NR(this));
        this.A01.setContentDescription(A0B(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C2W c2w2 : c2w.A05()) {
            NI ni2 = new NI(this.A05);
            ni2.setData(c2w2.A04(), null);
            ni2.setOnClickListener(new NS(this, ni2, c2w2));
            this.A02.addView(ni2, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final boolean A0P() {
        return true;
    }
}
