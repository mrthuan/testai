package com.inmobi.ads.banner;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C1850w4;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiBannerAudioManager {
    public static final InMobiBannerAudioManager INSTANCE = new InMobiBannerAudioManager();

    public static InMobiBanner a(ViewGroup viewGroup) {
        InMobiBanner a10;
        if (viewGroup instanceof InMobiBanner) {
            if (viewGroup.getVisibility() == 0 && viewGroup.isShown()) {
                return (InMobiBanner) viewGroup;
            }
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof ViewGroup) && (a10 = a((ViewGroup) childAt)) != null) {
                return a10;
            }
        }
        return null;
    }

    public static final void setAudioEnabled(boolean z10) {
        C1850w4.f15577d.set(z10);
    }

    public static final <T extends ViewGroup> void setAudioListener(T t4, AudioListener audioListener) {
        g.e(t4, "t");
        g.e(audioListener, "audioListener");
        INSTANCE.getClass();
        InMobiBanner a10 = a(t4);
        if (a10 != null && a10.isAudioAd()) {
            a10.setAudioListener(audioListener);
        }
    }
}
