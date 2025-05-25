package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ar  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1374ar extends C4Y {
    public C1374ar(AbstractC05484o abstractC05484o) {
        super(abstractC05484o, null);
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C05494p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0D(View view) {
        C05494p c05494p = (C05494p) view.getLayoutParams();
        return this.A02.A0m(view) + c05494p.leftMargin + c05494p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0E(View view) {
        C05494p c05494p = (C05494p) view.getLayoutParams();
        return this.A02.A0l(view) + c05494p.topMargin + c05494p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C05494p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final void A0J(int i10) {
        this.A02.A0z(i10);
    }
}
