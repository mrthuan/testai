package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TZ extends FrameLayout implements MS {
    public static final RelativeLayout.LayoutParams A0B = new RelativeLayout.LayoutParams(-1, -1);
    public C5Q A00;
    public Intent A01;
    public Bundle A02;
    public MS A03;
    public final AbstractC1456cD A04;
    public final AbstractC1456cD A05;
    public final C5Q A06;
    public final C1314Zs A07;
    public final J7 A08;
    public final View$OnSystemUiVisibilityChangeListenerC0952Lq A09;
    public final MR A0A;

    public TZ(C1314Zs c1314Zs, J7 j72, AbstractC1456cD abstractC1456cD, AbstractC1456cD abstractC1456cD2, MR mr, C5Q c5q) {
        super(c1314Zs);
        this.A07 = c1314Zs;
        this.A08 = j72;
        this.A05 = abstractC1456cD;
        this.A04 = abstractC1456cD2;
        this.A0A = mr;
        this.A06 = c5q;
        this.A09 = new View$OnSystemUiVisibilityChangeListenerC0952Lq(this);
        this.A09.A05(EnumC0951Lp.A02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VA A05() {
        return new VA(this.A07, this.A08, new Ej(this.A06), this.A04, this.A04.A0m(), new V5(), true);
    }

    private C06519a A06() {
        if (this.A04.A1P().A0E().A06() != null) {
            this.A05.A0y(this.A04.A1P().A0E().A06().A0M());
            this.A05.A0z(this.A04.A1P().A0E().A06().A0O());
        }
        C06519a c06519a = new C06519a(this.A07, new V5(), this.A08, this.A05, new C05906f(this.A07), new Ej(this.A06));
        c06519a.setVideoLeadingPlayableAdListener(new C1144Ta(this));
        return c06519a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A03 != null) {
            this.A03.onDestroy();
            if (this.A03 instanceof View) {
                removeView((View) this.A03);
            }
        }
    }

    private final void A08(Intent intent, Bundle bundle, C5Q c5q) {
        this.A03 = A06();
        this.A03.A9q(intent, bundle, c5q);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        this.A01 = intent;
        this.A02 = bundle;
        this.A00 = c5q;
        this.A0A.A3q(this, A0B);
        A08(intent, bundle, c5q);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACz(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ADN(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public String getCurrentClientToken() {
        return this.A05.A1U();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
    }

    public void setListener(MR mr) {
    }
}
