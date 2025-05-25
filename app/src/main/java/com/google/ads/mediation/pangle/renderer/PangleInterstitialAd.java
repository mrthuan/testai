package com.google.ads.mediation.pangle.renderer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* loaded from: classes.dex */
public class PangleInterstitialAd implements MediationInterstitialAd {
    private final MediationInterstitialAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> adLoadCallback;
    private MediationInterstitialAdCallback interstitialAdCallback;
    private PAGInterstitialAd pagInterstitialAd;
    private final PangleFactory pangleFactory;
    private final PangleInitializer pangleInitializer;
    private final PanglePrivacyConfig panglePrivacyConfig;
    private final PangleSdkWrapper pangleSdkWrapper;

    public PangleInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory, PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationInterstitialAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.pangleInitializer = pangleInitializer;
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
        this.panglePrivacyConfig = panglePrivacyConfig;
    }

    public void render() {
        this.panglePrivacyConfig.setCoppa(this.adConfiguration.f10583e);
        Bundle bundle = this.adConfiguration.f10581b;
        final String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError createAdapterError = PangleConstants.createAdapterError(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            createAdapterError.toString();
            this.adLoadCallback.onFailure(createAdapterError);
            return;
        }
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.adConfiguration;
        final String str = mediationInterstitialAdConfiguration.f10580a;
        this.pangleInitializer.initialize(mediationInterstitialAdConfiguration.f10582d, bundle.getString(PangleConstants.APP_ID), new PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.1
            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeError(AdError adError) {
                adError.toString();
                PangleInterstitialAd.this.adLoadCallback.onFailure(adError);
            }

            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeSuccess() {
                PAGInterstitialRequest createPagInterstitialRequest = PangleInterstitialAd.this.pangleFactory.createPagInterstitialRequest();
                createPagInterstitialRequest.setAdString(str);
                PangleRequestHelper.setWatermarkString(createPagInterstitialRequest, str, PangleInterstitialAd.this.adConfiguration);
                PangleInterstitialAd.this.pangleSdkWrapper.loadInterstitialAd(string, createPagInterstitialRequest, new PAGInterstitialAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.1.1
                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
                    public void onError(int i10, String str2) {
                        AdError createSdkError = PangleConstants.createSdkError(i10, str2);
                        createSdkError.toString();
                        PangleInterstitialAd.this.adLoadCallback.onFailure(createSdkError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                    public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                        PangleInterstitialAd pangleInterstitialAd = PangleInterstitialAd.this;
                        pangleInterstitialAd.interstitialAdCallback = (MediationInterstitialAdCallback) pangleInterstitialAd.adLoadCallback.onSuccess(PangleInterstitialAd.this);
                        PangleInterstitialAd.this.pagInterstitialAd = pAGInterstitialAd;
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.pagInterstitialAd.setAdInteractionListener(new PAGInterstitialAdInteractionListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                if (PangleInterstitialAd.this.interstitialAdCallback != null) {
                    PangleInterstitialAd.this.interstitialAdCallback.reportAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                if (PangleInterstitialAd.this.interstitialAdCallback != null) {
                    PangleInterstitialAd.this.interstitialAdCallback.onAdClosed();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                if (PangleInterstitialAd.this.interstitialAdCallback != null) {
                    PangleInterstitialAd.this.interstitialAdCallback.onAdOpened();
                    PangleInterstitialAd.this.interstitialAdCallback.reportAdImpression();
                }
            }
        });
        if (context instanceof Activity) {
            this.pagInterstitialAd.show((Activity) context);
        } else {
            this.pagInterstitialAd.show(null);
        }
    }
}
