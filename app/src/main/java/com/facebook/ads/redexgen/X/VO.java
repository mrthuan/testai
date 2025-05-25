package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class VO extends OE {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (LP.A02 * 36.0f);
    public static final int A05 = (int) (LP.A02 * 4.0f);
    public static final int A03 = (int) (LP.A02 * 8.0f);
    public static final int A04 = (int) (LP.A02 * 4.0f);

    public VO(C1314Zs c1314Zs, int i10, C1O c1o, boolean z10, String str, J7 j72, MR mr, C1102Rk c1102Rk, C0957Lv c0957Lv, C1T c1t) {
        super(c1314Zs, i10, c1o, z10, str, j72, mr, c1102Rk, c0957Lv, c1t, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A02(-16448251, 13, true);
        this.A00 = A02(-10131605, 12, false);
        this.A06.addView(A01(i10), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A01(int i10) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, OE.A0B);
        linearLayout.addView(this.A00, OE.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A02(int i10, int i11, boolean z10) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i10);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        M3.A0Y(textView, z10, i11);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public final void A0C() {
        super.A0C();
        this.A01.setOnClickListener(this.A05);
        this.A00.setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public final void A0D(int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public void setInfo(C1M c1m, C1P c1p, String str, String str2, LZ lz, OG og2) {
        super.setInfo(c1m, c1p, str, str2, lz, og2);
        this.A01.setText(c1m.A08());
        this.A00.setText(c1m.A07());
        if (TextUtils.isEmpty(c1p.A04())) {
            M3.A0H(this.A08);
        }
    }
}
