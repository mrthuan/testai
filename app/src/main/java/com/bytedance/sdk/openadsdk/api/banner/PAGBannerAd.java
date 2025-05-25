package com.bytedance.sdk.openadsdk.api.banner;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.ac;

/* loaded from: classes.dex */
public abstract class PAGBannerAd implements PAGClientBidding, PangleAd {
    public static void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        ISDKTypeFactory Qhi = ac.Qhi(pAGBannerAdLoadListener);
        if (Qhi != null) {
            Qhi.createADTypeLoaderFactory(str).createBannerAdLoader().loadAd(str, pAGBannerRequest, pAGBannerAdLoadListener);
        }
    }

    public abstract void destroy();

    public abstract View getBannerView();

    public abstract void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener);

    public static void loadAd(String str, PAGBannerRequest pAGBannerRequest, final PAGBannerAdLoadCallback pAGBannerAdLoadCallback) {
        loadAd(str, pAGBannerRequest, new PAGBannerAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
            public void onError(int i10, String str2) {
                PAGBannerAdLoadCallback.this.onError(new PAGErrorModel(i10, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                PAGBannerAdLoadCallback.this.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
