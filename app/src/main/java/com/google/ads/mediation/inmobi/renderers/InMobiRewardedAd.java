package com.google.ads.mediation.inmobi.renderers;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiConstants;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiInterstitialWrapper;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class InMobiRewardedAd extends InterstitialAdEventListener implements MediationRewardedAd {
    private InMobiAdFactory inMobiAdFactory;
    private InMobiInitializer inMobiInitializer;
    private InMobiInterstitialWrapper inMobiRewardedAdWrapper;
    protected final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    protected final MediationRewardedAdConfiguration mediationRewardedAdConfiguration;
    private MediationRewardedAdCallback rewardedAdCallback;

    public InMobiRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        this.mediationRewardedAdConfiguration = mediationRewardedAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    public void createAndLoadRewardAd(Context context, long j10, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.inMobiRewardedAdWrapper = this.inMobiAdFactory.createInMobiInterstitialWrapper(context, Long.valueOf(j10), this);
        InMobiAdapterUtils.setIsAgeRestricted();
        InMobiAdapterUtils.configureGlobalTargeting(this.mediationRewardedAdConfiguration.c);
        String str = this.mediationRewardedAdConfiguration.f10584f;
        if (!TextUtils.isEmpty(str)) {
            this.inMobiRewardedAdWrapper.setWatermarkData(new WatermarkData(str, 0.3f));
        }
        internalLoadAd(this.inMobiRewardedAdWrapper);
    }

    public abstract void internalLoadAd(InMobiInterstitialWrapper inMobiInterstitialWrapper);

    public void loadAd() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.mediationRewardedAdConfiguration;
        final Context context = mediationRewardedAdConfiguration.f10582d;
        Bundle bundle = mediationRewardedAdConfiguration.f10581b;
        String string = bundle.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
        final long placementId = InMobiAdapterUtils.getPlacementId(bundle);
        AdError validateInMobiAdLoadParams = InMobiAdapterUtils.validateInMobiAdLoadParams(string, placementId);
        if (validateInMobiAdLoadParams != null) {
            this.mediationAdLoadCallback.onFailure(validateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd.1
                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeError(AdError adError) {
                    adError.toString();
                    MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = InMobiRewardedAd.this.mediationAdLoadCallback;
                    if (mediationAdLoadCallback != null) {
                        mediationAdLoadCallback.onFailure(adError);
                    }
                }

                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeSuccess() {
                    InMobiRewardedAd inMobiRewardedAd = InMobiRewardedAd.this;
                    inMobiRewardedAd.createAndLoadRewardAd(context, placementId, inMobiRewardedAd.mediationAdLoadCallback);
                }
            });
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError createAdapterError = InMobiConstants.createAdapterError(106, "InMobi rewarded ad failed to show.");
        createAdapterError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(createAdapterError);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.rewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        String str;
        int i10;
        String str2 = "";
        if (map == null) {
            str = "";
        } else {
            String str3 = "";
            for (Object obj : map.keySet()) {
                str2 = obj.toString();
                str3 = map.get(str2).toString();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    break;
                }
            }
            str = str2;
            str2 = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                i10 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                String str4 = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
                i10 = 1;
            }
        } else {
            i10 = 0;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            String str5 = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            mediationRewardedAdCallback.onVideoComplete();
            this.rewardedAdCallback.onUserEarnedReward(new InMobiReward(str, i10));
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (!this.inMobiRewardedAdWrapper.isReady().booleanValue()) {
            AdError createAdapterError = InMobiConstants.createAdapterError(105, "InMobi rewarded ad is not yet ready to be shown.");
            createAdapterError.toString();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(createAdapterError);
                return;
            }
            return;
        }
        this.inMobiRewardedAdWrapper.show();
    }

    /* renamed from: onAdClicked  reason: avoid collision after fix types in other method */
    public void onAdClicked2(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError createSdkError = InMobiConstants.createSdkError(InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        createSdkError.toString();
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(createSdkError);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.rewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreated(byte[] bArr) {
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }
}
