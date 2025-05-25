package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: PAGNativeAdDataImpl.java */
/* loaded from: classes.dex */
public class fl implements PAGNativeAdData {
    private final Qhi Qhi;

    public fl(Qhi qhi) {
        this.Qhi = qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        Qhi qhi = this.Qhi;
        if (qhi != null) {
            return qhi.Gm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        Qhi qhi = this.Qhi;
        if (qhi != null) {
            return qhi.WAv();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        Qhi qhi = this.Qhi;
        if (qhi != null) {
            return qhi.Tgh();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        Qhi qhi = this.Qhi;
        if (qhi != null) {
            return qhi.fl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        Qhi qhi = this.Qhi;
        if (qhi != null) {
            return qhi.ac();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (tP.fl(this.Qhi.Qhi)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        Qhi qhi = this.Qhi;
        if (qhi != null) {
            return qhi.ROR();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        Qhi qhi = this.Qhi;
        if (qhi != null) {
            return qhi.CJ();
        }
        return null;
    }
}
