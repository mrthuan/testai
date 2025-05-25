package com.google.ads.mediation.inmobi;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class InMobiAdViewHolder {
    private final FrameLayout frameLayout;

    public InMobiAdViewHolder(FrameLayout frameLayout) {
        this.frameLayout = frameLayout;
    }

    public void addView(InMobiBannerWrapper inMobiBannerWrapper) {
        this.frameLayout.addView(inMobiBannerWrapper.getInMobiBanner());
    }

    public FrameLayout getFrameLayout() {
        return this.frameLayout;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.frameLayout.setLayoutParams(layoutParams);
    }
}
