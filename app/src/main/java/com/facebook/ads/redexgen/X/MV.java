package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MV implements Animation.AnimationListener {
    public final /* synthetic */ CI A00;

    public MV(CI ci2) {
        this.A00 = ci2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i10;
        Handler handler;
        Runnable runnable;
        int i11;
        this.A00.A06();
        i10 = this.A00.A04;
        if (i10 > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i11 = this.A00.A04;
            handler.postDelayed(runnable, i11);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
