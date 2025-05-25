package com.google.ads.mediation.inmobi;

import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* loaded from: classes.dex */
public class InMobiBannerWrapper {
    private final InMobiBanner inMobiBanner;

    public InMobiBannerWrapper(InMobiBanner inMobiBanner) {
        this.inMobiBanner = inMobiBanner;
    }

    public InMobiBanner getInMobiBanner() {
        return this.inMobiBanner;
    }

    public void load() {
        this.inMobiBanner.load();
    }

    public void setAnimationType(InMobiBanner.AnimationType animationType) {
        this.inMobiBanner.setAnimationType(animationType);
    }

    public void setEnableAutoRefresh(Boolean bool) {
        this.inMobiBanner.setEnableAutoRefresh(bool.booleanValue());
    }

    public void setExtras(Map<String, String> map) {
        this.inMobiBanner.setExtras(map);
    }

    public void setKeywords(String str) {
        this.inMobiBanner.setKeywords(str);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.inMobiBanner.setLayoutParams(layoutParams);
    }

    public void setListener(BannerAdEventListener bannerAdEventListener) {
        this.inMobiBanner.setListener(bannerAdEventListener);
    }

    public void setWatermarkData(WatermarkData watermarkData) {
        this.inMobiBanner.setWatermarkData(watermarkData);
    }

    public void load(byte[] bArr) {
        this.inMobiBanner.load(bArr);
    }
}
