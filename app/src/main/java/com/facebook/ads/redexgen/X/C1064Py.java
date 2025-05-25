package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Py  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1064Py extends AnimatorListenerAdapter {
    public final /* synthetic */ A6 A00;
    public final /* synthetic */ boolean A01;

    public C1064Py(A6 a62, boolean z10) {
        this.A00 = a62;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PD pd2;
        C1194Uy c1194Uy;
        C1194Uy c1194Uy2;
        super.onAnimationEnd(animator);
        pd2 = this.A00.A0H;
        pd2.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01) {
            c1194Uy = this.A00.A0G;
            if (c1194Uy != null) {
                c1194Uy2 = this.A00.A0G;
                c1194Uy2.destroy();
            }
        }
    }
}
