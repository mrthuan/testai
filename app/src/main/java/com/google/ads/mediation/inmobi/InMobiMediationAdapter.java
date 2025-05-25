package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.rtb.InMobiRtbBannerAd;
import com.google.ads.mediation.inmobi.rtb.InMobiRtbInterstitialAd;
import com.google.ads.mediation.inmobi.rtb.InMobiRtbNativeAd;
import com.google.ads.mediation.inmobi.rtb.InMobiRtbRewardedAd;
import com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallBannerAd;
import com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd;
import com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd;
import com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
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
public class InMobiMediationAdapter extends RtbAdapter {
    public static final String ERROR_MESSAGE_FOR_INVALID_ACCOUNTID = "Missing or invalid Account ID, configured for this ad source instance in the AdMob or Ad Manager UI";
    public static final String TAG = "InMobiMediationAdapter";
    private InMobiAdFactory inMobiAdFactory;
    private InMobiInitializer inMobiInitializer;
    private InMobiRtbBannerAd inMobiRtbBannerAd;
    private InMobiRtbInterstitialAd inMobiRtbInterstitialAd;
    private InMobiRtbNativeAd inMobiRtbNativeAd;
    private InMobiRtbRewardedAd inMobiRtbRewardedAd;
    private InMobiSdkWrapper inMobiSdkWrapper;
    private InMobiWaterfallBannerAd inMobiWaterfallBannerAd;
    private InMobiWaterfallInterstitialAd inMobiWaterfallInterstitialAd;
    private InMobiWaterfallNativeAd inMobiWaterfallNativeAd;
    private InMobiWaterfallRewardedAd inMobiWaterfallRewardedAd;

    public InMobiMediationAdapter(InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory, InMobiSdkWrapper inMobiSdkWrapper) {
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
        this.inMobiSdkWrapper = inMobiSdkWrapper;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        InMobiExtras build = InMobiExtrasBuilder.build(rtbSignalData.f10592a, rtbSignalData.c, InMobiAdapterUtils.PROTOCOL_RTB);
        signalCallbacks.onSuccess(this.inMobiSdkWrapper.getToken(build.getParameterMap(), build.getKeywords()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String version = this.inMobiSdkWrapper.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        return getVersionInfo(BuildConfig.ADAPTER_VERSION);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (this.inMobiSdkWrapper.isSDKInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.f10586a.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(InMobiConstants.createAdapterError(100, ERROR_MESSAGE_FOR_INVALID_ACCOUNTID).toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the InMobi SDK", InMobiAdapterUtils.KEY_ACCOUNT_ID, hashSet, str);
        }
        this.inMobiInitializer.init(context, str, new InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.InMobiMediationAdapter.1
            @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
            public void onInitializeError(AdError adError) {
                initializationCompleteCallback.onInitializationFailed(adError.toString());
            }

            @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
            public void onInitializeSuccess() {
                initializationCompleteCallback.onInitializationSucceeded();
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        InMobiWaterfallBannerAd inMobiWaterfallBannerAd = new InMobiWaterfallBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallBannerAd = inMobiWaterfallBannerAd;
        inMobiWaterfallBannerAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        InMobiWaterfallInterstitialAd inMobiWaterfallInterstitialAd = new InMobiWaterfallInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallInterstitialAd = inMobiWaterfallInterstitialAd;
        inMobiWaterfallInterstitialAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        InMobiWaterfallNativeAd inMobiWaterfallNativeAd = new InMobiWaterfallNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallNativeAd = inMobiWaterfallNativeAd;
        inMobiWaterfallNativeAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        InMobiWaterfallRewardedAd inMobiWaterfallRewardedAd = new InMobiWaterfallRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedAd = inMobiWaterfallRewardedAd;
        inMobiWaterfallRewardedAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        InMobiRtbBannerAd inMobiRtbBannerAd = new InMobiRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbBannerAd = inMobiRtbBannerAd;
        inMobiRtbBannerAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        InMobiRtbInterstitialAd inMobiRtbInterstitialAd = new InMobiRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbInterstitialAd = inMobiRtbInterstitialAd;
        inMobiRtbInterstitialAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        InMobiRtbNativeAd inMobiRtbNativeAd = new InMobiRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbNativeAd = inMobiRtbNativeAd;
        inMobiRtbNativeAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        InMobiRtbRewardedAd inMobiRtbRewardedAd = new InMobiRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedAd = inMobiRtbRewardedAd;
        inMobiRtbRewardedAd.loadAd();
    }

    public VersionInfo getVersionInfo(String str) {
        String[] split = str.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str);
        return new VersionInfo(0, 0, 0);
    }

    public InMobiMediationAdapter() {
        this.inMobiInitializer = InMobiInitializer.getInstance();
        this.inMobiAdFactory = new InMobiAdFactory();
        this.inMobiSdkWrapper = new InMobiSdkWrapper();
    }
}
