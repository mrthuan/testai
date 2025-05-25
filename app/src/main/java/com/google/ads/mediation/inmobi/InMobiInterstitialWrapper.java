package com.google.ads.mediation.inmobi;

import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import java.util.Map;

/* loaded from: classes.dex */
public class InMobiInterstitialWrapper {
    private final InMobiInterstitial inMobiInterstitial;

    public InMobiInterstitialWrapper(InMobiInterstitial inMobiInterstitial) {
        this.inMobiInterstitial = inMobiInterstitial;
    }

    public InMobiInterstitial getInMobiInterstitial() {
        return this.inMobiInterstitial;
    }

    public Boolean isReady() {
        return Boolean.valueOf(this.inMobiInterstitial.isReady());
    }

    public void load() {
        this.inMobiInterstitial.load();
    }

    public void setExtras(Map<String, String> map) {
        this.inMobiInterstitial.setExtras(map);
    }

    public void setKeywords(String str) {
        this.inMobiInterstitial.setKeywords(str);
    }

    public void setWatermarkData(WatermarkData watermarkData) {
        this.inMobiInterstitial.setWatermarkData(watermarkData);
    }

    public void show() {
        this.inMobiInterstitial.show();
    }

    public void load(byte[] bArr) {
        this.inMobiInterstitial.load(bArr);
    }
}
