package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.text.NumberFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ue  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1174Ue extends OE {
    public static byte[] A0I;
    public static String[] A0J = {"U1MfpI1C6bH5E6SUUi1isARh9jp", PDBorderStyleDictionary.STYLE_UNDERLINE, "Ubu5RVHkDHh3GnMyAX4EkYenDqWvQs6J", "Crj7vvGLMnYJtX1VpNFn8xcnVkyg9fPV", "3oNG9AhO9bk5LTGV0GcEQxoD", "h", "kfjfnNCZtD", "orAcnrCTNYiJWv2aZLW"};
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C1M A06;
    public C1O A07;
    public C1P A08;
    public OW A09;
    public boolean A0A;
    public boolean A0B;
    public final LinearLayout A0C;
    public final RelativeLayout A0D;
    public final RelativeLayout A0E;
    public final TextView A0F;
    public final C1314Zs A0G;
    public final boolean A0H;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A05() {
        this.A0D.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0N;
        this.A0D.setLayoutParams(layoutParams);
        M3.A0K(this.A0D);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(super.A04, super.A04);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0D.addView(super.A09, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = A0O;
        layoutParams3.addRule(1, super.A09.getId());
        layoutParams3.addRule(15);
        this.A0D.addView(this.A0E, layoutParams3);
        this.A0E.removeAllViews();
        M3.A0K(this.A05);
        this.A05.setLayoutParams(OE.A0B);
        this.A05.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        M3.A0Y(this.A05, true, 18);
        this.A0E.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0P);
        layoutParams4.topMargin = A0O / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0E.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        M3.A0Y(this.A04, false, 14);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams5.leftMargin = A0O;
        this.A02.addView(this.A04, layoutParams5);
    }

    public static void A0B() {
        A0I = new byte[]{-80, -64};
    }

    static {
        A0B();
        A0T = AbstractC04982p.A01(-1, 77);
        A0N = (int) (LP.A02 * 12.0f);
        A0O = (int) (LP.A02 * 8.0f);
        A0K = (int) (LP.A02 * 26.0f);
        A0M = (int) (LP.A02 * 144.0f);
        A0L = (int) (LP.A02 * 48.0f);
        A0P = (int) (LP.A02 * 16.0f);
        A0U = (int) (LP.A02 * 14.0f);
        A0Q = (int) (AbstractC04872e.A08 * 21.0f);
        A0R = (int) (AbstractC04872e.A08 * 12.0f);
        A0S = (int) (AbstractC04872e.A08 * 10.0f);
    }

    public C1174Ue(C1314Zs c1314Zs, int i10, boolean z10, C1O c1o, boolean z11, String str, J7 j72, MR mr, C1102Rk c1102Rk, C0957Lv c0957Lv, C1T c1t, boolean z12, String str2, boolean z13) {
        super(c1314Zs, i10, c1o, z11, str, j72, mr, c1102Rk, c0957Lv, c1t, z12, str2);
        this.A0B = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0G = c1314Zs;
        super.A09.setFullCircleCorners(z10);
        setPadding(A0N, A0N, A0N, A0K);
        this.A0D = new RelativeLayout(getContext());
        this.A05 = new TextView(getContext());
        this.A02 = new LinearLayout(getContext());
        this.A09 = new OW(this.A0G, A0U, 5, A0T, -1);
        this.A0E = new RelativeLayout(getContext());
        this.A0C = new LinearLayout(getContext());
        this.A04 = new TextView(getContext());
        this.A03 = new TextView(getContext());
        super.A06.addView(this.A0D);
        super.A06.addView(this.A0C);
        this.A0F = new TextView(getContext());
        this.A07 = c1o;
        this.A0H = C0877Im.A12(c1314Zs);
        M3.A0R(this, c1314Zs);
        this.A0A = C0877Im.A2P(this.A0G);
        A09();
        if (z13) {
            this.A03.setVisibility(8);
            this.A0C.setVisibility(8);
        }
    }

    public C1174Ue(C1314Zs c1314Zs, int i10, boolean z10, C1O c1o, boolean z11, String str, J7 j72, MR mr, C1102Rk c1102Rk, C0957Lv c0957Lv, AbstractC1456cD abstractC1456cD) {
        this(c1314Zs, i10, z10, c1o, false, str, j72, mr, c1102Rk, c0957Lv, abstractC1456cD.A1Q(), abstractC1456cD.A1A(), abstractC1456cD.A0e(), abstractC1456cD.A1E());
    }

    private GradientDrawable A01(int i10, float f10) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(f10);
        drawable.setColor(i10);
        return drawable;
    }

    private void A03() {
        super.A08.setPadding(0, 0, 0, 0);
        super.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, A0L));
    }

    private void A04() {
        LinearLayout.LayoutParams layoutParams;
        this.A0C.setOrientation(1);
        this.A0C.setPadding(0, 0, 0, A0N);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0D.getId());
        this.A0C.setLayoutParams(layoutParams2);
        this.A0C.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0A ? this.A07.A05(true) : -1);
        M3.A0Y(this.A03, false, 16);
        if (this.A0H) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        this.A0C.addView(this.A03, layoutParams);
    }

    private void A06() {
        if (super.A01 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            super.A01.setPadding(0, 0, 0, A0R);
            super.A01.setText(super.A02);
            super.A01.setTextColor(-1);
            M3.A0Y(super.A01, false, 15);
            super.A01.setLayoutParams(layoutParams);
        }
    }

    private void A07() {
        if (super.A00 != null) {
            super.A00.removeAllViews();
            super.A00.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.setMargins(0, A0Q, 0, A0Q);
            super.A00.setGravity(17);
            super.A00.setPadding(A0R, A0R, A0R, A0R);
            super.A00.setLayoutParams(layoutParams);
            M3.A0S(super.A00, A01(-1121112787, A0S));
            A06();
            A03();
            if (super.A01 != null) {
                super.A00.addView(super.A01);
            }
            super.A00.addView(super.A08);
        }
    }

    private void A08() {
        LinearLayout.LayoutParams layoutParams;
        this.A0F.setMaxLines(1);
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A0F.setAllCaps(true);
        M3.A0Y(this.A0F, false, 12);
        new LinearLayout.LayoutParams(-1, -2);
        if (this.A0H) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = A0N;
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A09() {
        removeAllViews();
        super.A06.setLayoutParams(OE.A0B);
        A05();
        A04();
        if (!super.A03) {
            A03();
        } else {
            A07();
        }
        A08();
        A0A();
        M3.A0J(super.A06);
        if (!super.A03) {
            M3.A0J(super.A08);
        }
        M3.A0J(this.A0F);
        addView(super.A06);
        if (!super.A03) {
            addView(super.A08);
        } else if (super.A00 != null) {
            addView(super.A00);
        }
        addView(this.A0F);
    }

    private void A0A() {
        if (this.A06 == null) {
            return;
        }
        TextView textView = this.A05;
        C1M c1m = this.A06;
        if (A0J[2].charAt(28) == 'n') {
            throw new RuntimeException();
        }
        A0J[2] = "SIvKbfulzllrpdkfdrym2tho7PogZ3oV";
        textView.setText(c1m.A08());
        this.A03.setText(this.A06.A02());
        this.A0F.setText(this.A06.A06());
        if (TextUtils.isEmpty(this.A08.A04())) {
            M3.A0H(super.A08);
        }
        if (TextUtils.isEmpty(this.A06.A06())) {
            M3.A0H(this.A0F);
        }
        if (TextUtils.isEmpty(this.A06.A05())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        this.A09.setRating(Float.parseFloat(this.A06.A05()));
        if (this.A06.A04() == null) {
            return;
        }
        this.A04.setText(A02(0, 1, 41) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A06.A04())) + A02(1, 1, 56));
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public final void A0C() {
        super.A0C();
        this.A09.setOnClickListener(super.A05);
        this.A0F.setOnClickListener(super.A05);
        this.A04.setOnClickListener(super.A05);
        this.A03.setOnClickListener(super.A05);
        this.A05.setOnClickListener(super.A05);
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public final void A0D(int i10) {
        boolean z10 = i10 == 1;
        setOrientation(z10 ? 1 : 0);
        if (!z10) {
            setWeightSum(5.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = !super.A03 ? 4.0f : 3.0f;
            layoutParams.bottomMargin = A0K - A0N;
            super.A06.setLayoutParams(layoutParams);
            if (!super.A03) {
                LinearLayout.LayoutParams auxContainerParams = new LinearLayout.LayoutParams(0, A0L);
                auxContainerParams.bottomMargin = A0K / 2;
                auxContainerParams.weight = 1.0f;
                auxContainerParams.gravity = 80;
                super.A08.setLayoutParams(auxContainerParams);
                super.A08.setMinWidth(A0M);
            } else if (super.A00 != null) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
                layoutParams2.weight = 2.0f;
                super.A00.setLayoutParams(layoutParams2);
                super.A00.requestLayout();
            }
            M3.A0J(this.A0F);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = A0O;
            this.A0C.addView(this.A0F, layoutParams3);
            this.A0C.setPadding(0, 0, 0, 0);
            this.A0F.setGravity(3);
        } else {
            A09();
        }
        bringToFront();
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public final View getExpandableLayout() {
        return this.A0C;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0F.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public void setInfo(C1M c1m, C1P c1p, String str, String str2, LZ lz, OG og2) {
        super.setInfo(c1m, c1p, str, str2, lz, og2);
        this.A06 = c1m;
        this.A08 = c1p;
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.OE
    public void setTitleMaxLines(int i10) {
        this.A05.setMaxLines(i10);
        this.A05.setEllipsize(TextUtils.TruncateAt.END);
    }
}
