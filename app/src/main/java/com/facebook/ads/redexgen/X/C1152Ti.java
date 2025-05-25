package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Ti  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1152Ti extends M2 {
    public final /* synthetic */ C1151Th A00;

    public C1152Ti(C1151Th c1151Th) {
        this.A00 = c1151Th;
    }

    @Override // com.facebook.ads.redexgen.X.M2, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        M3.A0H(this.A00.A01);
        this.A00.A00.ACL();
    }
}
