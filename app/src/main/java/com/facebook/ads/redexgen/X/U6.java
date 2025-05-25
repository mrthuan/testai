package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class U6 extends RelativeLayout implements LJ {
    public boolean A00;
    public final int A01;
    public final AbstractC1101Rj A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC1456cD A05;
    public final C1314Zs A06;
    public final J7 A07;
    public final LL A08;
    public final C0957Lv A09;
    public final MR A0A;
    public final N9 A0B;
    public final C1102Rk A0C;

    public abstract void A11();

    public abstract void A12();

    public abstract void A13(boolean z10);

    public abstract void A14(boolean z10);

    public abstract boolean A15();

    public abstract boolean A16();

    public abstract Q3 getFullScreenAdStyle();

    public U6(C1314Zs c1314Zs, N9 n92, J7 j72, AbstractC1456cD abstractC1456cD, int i10, boolean z10, boolean z11, MR mr) {
        super(c1314Zs);
        this.A09 = new C0957Lv();
        this.A00 = false;
        this.A02 = new U7(this);
        this.A01 = i10;
        this.A06 = c1314Zs;
        this.A04 = z10;
        this.A03 = z11;
        this.A0A = mr;
        this.A0B = n92;
        this.A05 = abstractC1456cD;
        this.A07 = j72;
        this.A0C = new C1102Rk(this, 1, new WeakReference(this.A02), c1314Zs);
        this.A0C.A0W(abstractC1456cD.A0O());
        this.A0C.A0X(abstractC1456cD.A0P());
        this.A08 = LL.A01(this.A06, this.A05, this);
    }

    public void A0z() {
        this.A08.A0B();
    }

    public final void A10() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    public void ACa() {
        this.A0A.A4P(this.A05.A0Y());
    }

    public AbstractC1456cD getAdDataBundle() {
        return this.A05;
    }

    public C1102Rk getAdViewabilityChecker() {
        return this.A0C;
    }

    public C0957Lv getTouchDataRecorder() {
        return this.A09;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
