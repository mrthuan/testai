package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.fl;

/* loaded from: classes.dex */
public interface PAGLoadListener<Ad> extends fl {
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.fl
    void onError(int i10, String str);
}
