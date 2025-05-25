package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class V3 extends NE {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (LP.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2S A01;
    public final C1314Zs A02;

    public V3(C1314Zs c1314Zs, J7 j72, String str, C1Z c1z, MS ms, MR mr) {
        super(c1314Zs, j72, str, c1z, ms, mr);
        this.A02 = c1314Zs;
        this.A01 = C2T.A00(c1314Zs.A01());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        M3.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new NJ(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            M3.A0V(this, transitionSet);
            return;
        }
        M3.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0L() {
        C2W A0A = this.A01.A0A();
        NT nt = new NT(this.A02);
        nt.setInfo(MB.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        nt.setOnClickListener(new NK(this));
        C2W A0B = this.A01.A0B();
        NT nt2 = new NT(this.A02);
        nt2.setInfo(MB.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        nt2.setOnClickListener(new NL(this));
        NT nt3 = new NT(this.A02);
        nt3.setInfo(MB.AD_CHOICES_ICON, this.A01.A0M(), "");
        nt3.setOnClickListener(new NM(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        M3.A0M(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(nt, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(nt2, itemParams);
        }
        linearLayout.addView(nt3, itemParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0M() {
        M3.A0I(this);
        this.A00.removeAllViews();
        M3.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0N(C2W c2w, C2U c2u) {
        String A0E;
        int i10;
        String str;
        if (c2u == C2U.A05) {
            return;
        }
        boolean z10 = c2u == C2U.A06;
        NC nc2 = new NC(this.A02, this.A0B);
        if (z10) {
            C2S c2s = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = c2s.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        NC A0E2 = nc2.A0I(A0E).A0H(this.A01.A0D()).A0F(c2w.A04()).A0E(z10 ? MB.REPORT_AD : MB.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        NC A0D = A0E2.A0D(i10);
        if (this.A0A != null) {
            C1Z c1z = this.A0A;
            if (A03[1].charAt(11) != 'X') {
                str = c1z.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = c1z.A01();
            }
        } else {
            str = "";
        }
        ND adHiddenView = A0D.A0G(str).A0M();
        M3.A0M(adHiddenView, -1);
        M3.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void A0O(C2W c2w, C2U c2u) {
        String A0H;
        boolean z10 = c2u == C2U.A06;
        C1314Zs c1314Zs = this.A02;
        NG ng2 = this.A0B;
        if (z10) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        NW nw = new NW(c1314Zs, c2w, ng2, A0H, z10 ? MB.REPORT_AD : MB.HIDE_AD);
        nw.setClickable(true);
        M3.A0M(nw, -1);
        nw.setPadding(A04 * 2, A04, A04 * 2, A04);
        A0C();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(nw, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final boolean A0P() {
        return false;
    }
}
