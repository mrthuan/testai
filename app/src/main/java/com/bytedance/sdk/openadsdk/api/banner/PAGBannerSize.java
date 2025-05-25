package com.bytedance.sdk.openadsdk.api.banner;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* loaded from: classes.dex */
public final class PAGBannerSize {
    private final int Qhi;
    private final int cJ;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.Qhi = i10;
        this.cJ = i11;
    }

    public int getHeight() {
        return this.cJ;
    }

    public int getWidth() {
        return this.Qhi;
    }
}
