package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class NativeAdsManager {
    private final NativeAdsManagerApi mNativeAdsManagerApi;

    @Keep
    /* loaded from: classes.dex */
    public interface Listener {
        void onAdError(AdError adError);

        void onAdsLoaded();
    }

    public NativeAdsManager(Context context, String str, int i10) {
        boolean z10;
        Preconditions.checkNotNull(context, "Context can not be null");
        if (i10 > -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkIsTrue(z10, "Number of requested ads should be not be negative");
        this.mNativeAdsManagerApi = DynamicLoaderFactory.makeLoader(context).createNativeAdsManagerApi(context, str, i10);
    }

    public void disableAutoRefresh() {
        this.mNativeAdsManagerApi.disableAutoRefresh();
    }

    public int getUniqueNativeAdCount() {
        return this.mNativeAdsManagerApi.getUniqueNativeAdCount();
    }

    public boolean isLoaded() {
        return this.mNativeAdsManagerApi.isLoaded();
    }

    public void loadAds() {
        this.mNativeAdsManagerApi.loadAds();
    }

    public NativeAd nextNativeAd() {
        return this.mNativeAdsManagerApi.nextNativeAd();
    }

    public void setExtraHints(String str) {
        this.mNativeAdsManagerApi.setExtraHints(str);
    }

    public void setListener(Listener listener) {
        this.mNativeAdsManagerApi.setListener(listener);
    }

    public void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.mNativeAdsManagerApi.loadAds(mediaCacheFlag);
    }

    public NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        return this.mNativeAdsManagerApi.nextNativeAd(nativeAdListener);
    }
}
