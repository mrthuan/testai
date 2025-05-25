package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.view.View;

/* loaded from: classes.dex */
public interface PAGNativeAdData {

    /* loaded from: classes.dex */
    public enum PAGNativeMediaType {
        PAGNativeMediaTypeImage,
        PAGNativeMediaTypeVideo
    }

    View getAdChoicesView();

    View getAdLogoView();

    String getButtonText();

    String getDescription();

    PAGImageItem getIcon();

    PAGNativeMediaType getMediaType();

    PAGMediaView getMediaView();

    String getTitle();
}
