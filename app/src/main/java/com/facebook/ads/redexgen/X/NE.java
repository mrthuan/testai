package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;

/* loaded from: assets/audience_network.dex */
public abstract class NE extends FrameLayout {
    public static String[] A0C = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public C2U A01;
    public C2V A02;
    public C2W A03;
    public final C2S A04;
    public final C1314Zs A05;
    public final J7 A06;
    public final MR A07;
    public final MS A08;
    public final String A09;
    public final C1Z A0A;
    public final NG A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2W c2w, C2U c2u);

    public abstract void A0O(C2W c2w, C2U c2u);

    public abstract boolean A0P();

    public NE(C1314Zs c1314Zs, J7 j72, String str) {
        this(c1314Zs, j72, str, null, null, null);
    }

    public NE(C1314Zs c1314Zs, J7 j72, String str, C1Z c1z, MS ms, MR mr) {
        super(c1314Zs);
        this.A00 = 0;
        this.A01 = C2U.A05;
        this.A03 = null;
        this.A0B = new V4(this);
        this.A05 = c1314Zs;
        this.A06 = j72;
        this.A08 = ms;
        this.A07 = mr;
        this.A09 = str;
        this.A0A = c1z;
        this.A04 = C2T.A00(this.A05.A01());
    }

    public static /* synthetic */ int A00(NE ne2) {
        int i10 = ne2.A00;
        ne2.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A01(NE ne2) {
        int i10 = ne2.A00;
        ne2.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A9t(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2W c2w) {
        this.A02.A08(this.A01);
        A0N(c2w, this.A01);
        C04530w.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2W c2w) {
        this.A03 = c2w;
        this.A02.A09(this.A01, this.A00);
        A0O(c2w, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2V(new JF(this.A09, this.A06));
        if (this.A08 != null) {
            MS ms = this.A08;
            if (A0C[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0C[7] = "FLAi4P2";
            ms.ACz(true);
        }
        A0C();
    }
}
