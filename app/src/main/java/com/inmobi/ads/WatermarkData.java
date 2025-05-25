package com.inmobi.ads;

import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class WatermarkData {
    private float alpha;
    private final String watermarkBase64EncodedString;

    public WatermarkData(String watermarkBase64EncodedString, float f10) {
        g.e(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        this.watermarkBase64EncodedString = watermarkBase64EncodedString;
        this.alpha = f10;
    }

    public static /* synthetic */ WatermarkData copy$default(WatermarkData watermarkData, String str, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = watermarkData.watermarkBase64EncodedString;
        }
        if ((i10 & 2) != 0) {
            f10 = watermarkData.alpha;
        }
        return watermarkData.copy(str, f10);
    }

    public final String component1() {
        return this.watermarkBase64EncodedString;
    }

    public final float component2() {
        return this.alpha;
    }

    public final WatermarkData copy(String watermarkBase64EncodedString, float f10) {
        g.e(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        return new WatermarkData(watermarkBase64EncodedString, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatermarkData)) {
            return false;
        }
        WatermarkData watermarkData = (WatermarkData) obj;
        if (g.a(this.watermarkBase64EncodedString, watermarkData.watermarkBase64EncodedString) && Float.compare(this.alpha, watermarkData.alpha) == 0) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final String getWatermarkBase64EncodedString() {
        return this.watermarkBase64EncodedString;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.alpha) + (this.watermarkBase64EncodedString.hashCode() * 31);
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    public String toString() {
        return "WatermarkData(watermarkBase64EncodedString=" + this.watermarkBase64EncodedString + ", alpha=" + this.alpha + ')';
    }

    public /* synthetic */ WatermarkData(String str, float f10, int i10, kotlin.jvm.internal.d dVar) {
        this(str, (i10 & 2) != 0 ? 1.0f : f10);
    }
}
