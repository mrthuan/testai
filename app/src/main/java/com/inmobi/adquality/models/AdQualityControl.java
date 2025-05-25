package com.inmobi.adquality.models;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public final class AdQualityControl {
    private String beacon;
    private boolean enableSdkAdQuality;
    private float screenshotDelayInSeconds;
    private boolean takeScreenshot;

    public final String getBeacon() {
        return this.beacon;
    }

    public final boolean getEnableSdkAdQuality() {
        return this.enableSdkAdQuality;
    }

    public final float getScreenshotDelayInSeconds() {
        return this.screenshotDelayInSeconds;
    }

    public final boolean getTakeScreenshot() {
        return this.takeScreenshot;
    }

    public final void setBeacon(String str) {
        this.beacon = str;
    }

    public final void setEnableSdkAdQuality(boolean z10) {
        this.enableSdkAdQuality = z10;
    }

    public final void setScreenshotDelayInSeconds(float f10) {
        this.screenshotDelayInSeconds = f10;
    }

    public final void setTakeScreenshot(boolean z10) {
        this.takeScreenshot = z10;
    }
}
