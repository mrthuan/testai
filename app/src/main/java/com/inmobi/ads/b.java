package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C0;
import com.inmobi.media.D0;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f10, float f11) {
        g.e(animationType, "animationType");
        int i10 = a.f14084a[animationType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                D0 d02 = new D0(f10 / 2.0f, f11 / 2.0f);
                d02.setDuration(500L);
                d02.setFillAfter(false);
                d02.setInterpolator(new AccelerateInterpolator());
                return d02;
            }
            C0 c02 = new C0(f10 / 2.0f, f11 / 2.0f);
            c02.setDuration(500L);
            c02.setFillAfter(false);
            c02.setInterpolator(new AccelerateInterpolator());
            return c02;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        return alphaAnimation;
    }
}
