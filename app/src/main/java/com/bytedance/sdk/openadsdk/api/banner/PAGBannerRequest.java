package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize Qhi;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.Qhi = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.Qhi;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.Qhi = pAGBannerSize;
    }
}
