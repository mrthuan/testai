package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class OY implements InterfaceC1085Qt {
    public View A00;
    public T7 A01;
    public R5 A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC1127Sj A05;
    public final AbstractC1121Sd A06;
    public final AbstractC1105Rn A07;
    public final AbstractC1089Qx A08;
    public final boolean A09;
    public final boolean A0A;

    public OY(View view, R5 r52, boolean z10) {
        this(view, r52, z10, false);
    }

    public OY(View view, R5 r52, boolean z10, boolean z11) {
        this.A06 = new AbstractC1121Sd() { // from class: com.facebook.ads.redexgen.X.8R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9P c9p) {
                OY.this.A06(1, 0);
            }
        };
        this.A07 = new AbstractC1105Rn() { // from class: com.facebook.ads.redexgen.X.8Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(SZ sz) {
                boolean z12;
                R5 r53;
                boolean z13;
                z12 = OY.this.A03;
                if (!z12) {
                    return;
                }
                r53 = OY.this.A02;
                if (r53 != R5.A02) {
                    z13 = OY.this.A09;
                    if (!z13) {
                        OY.this.A06(0, 8);
                        return;
                    }
                }
                OY.this.A02 = null;
                OY.this.A05();
            }
        };
        this.A05 = new AbstractC1127Sj() { // from class: com.facebook.ads.redexgen.X.8P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C9R c9r) {
                R5 r53;
                View view2;
                View view3;
                r53 = OY.this.A02;
                if (r53 == R5.A03) {
                    return;
                }
                view2 = OY.this.A00;
                view2.setAlpha(1.0f);
                view3 = OY.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C8H(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, r52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new R4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i10, int i11) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i10);
        this.A00.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, R5 r52) {
        this.A02 = r52;
        this.A00 = view;
        this.A00.clearAnimation();
        if (r52 == R5.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void A9r(T7 t72) {
        this.A01 = t72;
        t72.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1085Qt
    public final void AHD(T7 t72) {
        A06(1, 0);
        t72.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
