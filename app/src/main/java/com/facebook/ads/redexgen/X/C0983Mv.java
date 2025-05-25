package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Mv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0983Mv implements RF {
    public ViewPropertyAnimator A00;
    public RE A01 = RE.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public C0983Mv(View view, int i10, boolean z10) {
        this.A02 = i10;
        this.A03 = view;
        this.A04 = z10;
    }

    private void A04(boolean z10) {
        this.A01 = RE.A03;
        if (this.A04) {
            M3.A0L(this.A03);
        }
        if (!z10) {
            this.A03.setAlpha(1.0f);
            this.A01 = RE.A02;
            return;
        }
        this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new RJ(this));
    }

    private void A05(boolean z10) {
        this.A01 = RE.A05;
        if (!z10) {
            this.A03.setAlpha(0.0f);
            this.A01 = RE.A04;
            return;
        }
        this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new RK(this));
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final void A3u(boolean z10, boolean z11) {
        if (z11) {
            A05(z10);
        } else {
            A04(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final RE A8Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
