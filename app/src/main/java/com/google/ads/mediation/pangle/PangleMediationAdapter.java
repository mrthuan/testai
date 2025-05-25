package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.renderer.PangleAppOpenAd;
import com.google.ads.mediation.pangle.renderer.PangleBannerAd;
import com.google.ads.mediation.pangle.renderer.PangleInterstitialAd;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.ads.mediation.pangle.renderer.PangleRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class PangleMediationAdapter extends RtbAdapter {
    static final String ERROR_MESSAGE_MISSING_OR_INVALID_APP_ID = "Missing or invalid App ID.";
    public static final String TAG = "PangleMediationAdapter";
    private static int ccpa = -1;
    private static int gdpr = -1;
    private PangleAppOpenAd appOpenAd;
    private PangleBannerAd bannerAd;
    private PangleInterstitialAd interstitialAd;
    private PangleNativeAd nativeAd;
    private final PangleFactory pangleFactory;
    private final PangleInitializer pangleInitializer;
    private final PanglePrivacyConfig panglePrivacyConfig;
    private final PangleSdkWrapper pangleSdkWrapper;
    private PangleRewardedAd rewardedAd;

    public PangleMediationAdapter() {
        this.pangleInitializer = PangleInitializer.getInstance();
        PangleSdkWrapper pangleSdkWrapper = new PangleSdkWrapper();
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = new PangleFactory();
        this.panglePrivacyConfig = new PanglePrivacyConfig(pangleSdkWrapper);
    }

    public static int getDoNotSell() {
        return ccpa;
    }

    public static int getGDPRConsent() {
        return gdpr;
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
        setDoNotSell(i10, new PangleSdkWrapper());
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        setGDPRConsent(i10, new PangleSdkWrapper());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, final SignalCallbacks signalCallbacks) {
        Bundle bundle = rtbSignalData.c;
        if (bundle != null && bundle.containsKey("user_data")) {
            this.pangleSdkWrapper.setUserData(bundle.getString("user_data", ""));
        }
        this.pangleSdkWrapper.getBiddingToken(new BiddingTokenCallback() { // from class: com.google.ads.mediation.pangle.PangleMediationAdapter.1
            @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
            public void onBiddingTokenCollected(String str) {
                signalCallbacks.onSuccess(str);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = this.pangleSdkWrapper.getSdkVersion();
        String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[2]);
            if (split.length >= 4) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[3]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        return getVersionInfo(BuildConfig.ADAPTER_VERSION);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.f10586a.getString(PangleConstants.APP_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            AdError createAdapterError = PangleConstants.createAdapterError(101, ERROR_MESSAGE_MISSING_OR_INVALID_APP_ID);
            createAdapterError.toString();
            initializationCompleteCallback.onInitializationFailed(createAdapterError.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str);
        }
        this.panglePrivacyConfig.setCoppa(zzej.b().f10175h.f10040a);
        this.pangleInitializer.initialize(context, str, new PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.PangleMediationAdapter.2
            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeError(AdError adError) {
                adError.toString();
                initializationCompleteCallback.onInitializationFailed(adError.f10006b);
            }

            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeSuccess() {
                initializationCompleteCallback.onInitializationSucceeded();
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        PangleAppOpenAd createPangleAppOpenAd = this.pangleFactory.createPangleAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.appOpenAd = createPangleAppOpenAd;
        createPangleAppOpenAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        PangleBannerAd createPangleBannerAd = this.pangleFactory.createPangleBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.bannerAd = createPangleBannerAd;
        createPangleBannerAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        PangleInterstitialAd createPangleInterstitialAd = this.pangleFactory.createPangleInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.interstitialAd = createPangleInterstitialAd;
        createPangleInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        PangleNativeAd createPangleNativeAd = this.pangleFactory.createPangleNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.nativeAd = createPangleNativeAd;
        createPangleNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        PangleRewardedAd createPangleRewardedAd = this.pangleFactory.createPangleRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.rewardedAd = createPangleRewardedAd;
        createPangleRewardedAd.render();
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i10, PangleSdkWrapper pangleSdkWrapper) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            if (pangleSdkWrapper.isInitSuccess()) {
                pangleSdkWrapper.setDoNotSell(i10);
            }
            ccpa = i10;
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10, PangleSdkWrapper pangleSdkWrapper) {
        if (i10 == 1 || i10 == 0 || i10 == -1) {
            if (pangleSdkWrapper.isInitSuccess()) {
                pangleSdkWrapper.setGdprConsent(i10);
            }
            gdpr = i10;
        }
    }

    public VersionInfo getVersionInfo(String str) {
        String[] split = str.split("\\.");
        if (split.length >= 4) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100);
            if (split.length >= 5) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[4]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str);
        return new VersionInfo(0, 0, 0);
    }

    public PangleMediationAdapter(PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory, PanglePrivacyConfig panglePrivacyConfig) {
        this.pangleInitializer = pangleInitializer;
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
        this.panglePrivacyConfig = panglePrivacyConfig;
    }
}
