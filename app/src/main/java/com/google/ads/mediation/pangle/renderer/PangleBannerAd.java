package com.google.ads.mediation.pangle.renderer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PangleBannerAd implements MediationBannerAd, PAGBannerAdInteractionListener {
    public static final String ERROR_MESSAGE_BANNER_SIZE_MISMATCH = "Failed to request banner ad from Pangle. Invalid banner size.";
    private final MediationBannerAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> adLoadCallback;
    private MediationBannerAdCallback bannerAdCallback;
    private final PangleFactory pangleFactory;
    private final PangleInitializer pangleInitializer;
    private final PanglePrivacyConfig panglePrivacyConfig;
    private final PangleSdkWrapper pangleSdkWrapper;
    FrameLayout wrappedAdView;

    public PangleBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory, PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.pangleInitializer = pangleInitializer;
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
        this.panglePrivacyConfig = panglePrivacyConfig;
    }

    public static List<AdSize> getSupportedBannerSizes() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 250));
        arrayList.add(new AdSize(728, 90));
        return arrayList;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.wrappedAdView;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public void render() {
        this.panglePrivacyConfig.setCoppa(this.adConfiguration.f10583e);
        Bundle bundle = this.adConfiguration.f10581b;
        final String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError createAdapterError = PangleConstants.createAdapterError(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            createAdapterError.toString();
            this.adLoadCallback.onFailure(createAdapterError);
            return;
        }
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.adConfiguration;
        final String str = mediationBannerAdConfiguration.f10580a;
        final Context context = mediationBannerAdConfiguration.f10582d;
        this.pangleInitializer.initialize(context, bundle.getString(PangleConstants.APP_ID), new PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleBannerAd.1
            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeError(AdError adError) {
                adError.toString();
                PangleBannerAd.this.adLoadCallback.onFailure(adError);
            }

            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeSuccess() {
                AdSize a10 = MediationUtils.a(context, PangleBannerAd.this.adConfiguration.f10585g, PangleBannerAd.getSupportedBannerSizes());
                if (a10 == null) {
                    AdError createAdapterError2 = PangleConstants.createAdapterError(102, PangleBannerAd.ERROR_MESSAGE_BANNER_SIZE_MISMATCH);
                    createAdapterError2.toString();
                    PangleBannerAd.this.adLoadCallback.onFailure(createAdapterError2);
                    return;
                }
                PangleBannerAd.this.wrappedAdView = new FrameLayout(context);
                PAGBannerRequest createPagBannerRequest = PangleBannerAd.this.pangleFactory.createPagBannerRequest(new PAGBannerSize(a10.f10024a, a10.f10025b));
                createPagBannerRequest.setAdString(str);
                PangleRequestHelper.setWatermarkString(createPagBannerRequest, str, PangleBannerAd.this.adConfiguration);
                PangleBannerAd.this.pangleSdkWrapper.loadBannerAd(string, createPagBannerRequest, new PAGBannerAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleBannerAd.1.1
                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
                    public void onError(int i10, String str2) {
                        AdError createSdkError = PangleConstants.createSdkError(i10, str2);
                        createSdkError.toString();
                        PangleBannerAd.this.adLoadCallback.onFailure(createSdkError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                    public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                        pAGBannerAd.setAdInteractionListener(PangleBannerAd.this);
                        PangleBannerAd.this.wrappedAdView.addView(pAGBannerAd.getBannerView());
                        PangleBannerAd pangleBannerAd = PangleBannerAd.this;
                        pangleBannerAd.bannerAdCallback = (MediationBannerAdCallback) pangleBannerAd.adLoadCallback.onSuccess(PangleBannerAd.this);
                    }
                });
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }
}
