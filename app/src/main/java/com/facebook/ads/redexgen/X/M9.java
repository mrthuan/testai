package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class M9 implements RF {
    public ValueAnimator A00;
    public RE A01 = RE.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public M9(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A02 = i10;
        this.A04 = i11;
        this.A03 = i12;
    }

    private ValueAnimator A00(View view, int i10, int i11) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new RO(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        if (z10) {
            this.A01 = RE.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new RN(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        M3.A0H(this.A05);
        this.A01 = RE.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10) {
        M3.A0L(this.A05);
        if (z10) {
            this.A01 = RE.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new RM(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = RE.A02;
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final void A3u(boolean z10, boolean z11) {
        if (z11) {
            A08(z10);
        } else {
            A09(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final RE A8Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
