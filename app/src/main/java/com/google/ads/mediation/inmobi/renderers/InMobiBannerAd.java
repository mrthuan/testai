package com.google.ads.mediation.inmobi.renderers;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdViewHolder;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiBannerWrapper;
import com.google.ads.mediation.inmobi.InMobiConstants;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class InMobiBannerAd extends BannerAdEventListener implements MediationBannerAd {
    private InMobiAdFactory inMobiAdFactory;
    private InMobiAdViewHolder inMobiAdViewHolder;
    private InMobiInitializer inMobiInitializer;
    protected final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback;
    private MediationBannerAdCallback mediationBannerAdCallback;
    protected final MediationBannerAdConfiguration mediationBannerAdConfiguration;

    public InMobiBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        this.mediationBannerAdConfiguration = mediationBannerAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadBannerAd(Context context, long j10, AdSize adSize) {
        InMobiAdapterUtils.setIsAgeRestricted();
        InMobiAdapterUtils.configureGlobalTargeting(this.mediationBannerAdConfiguration.c);
        InMobiBannerWrapper createInMobiBannerWrapper = this.inMobiAdFactory.createInMobiBannerWrapper(context, Long.valueOf(j10));
        createInMobiBannerWrapper.setEnableAutoRefresh(Boolean.FALSE);
        createInMobiBannerWrapper.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        createInMobiBannerWrapper.setListener(this);
        String str = this.mediationBannerAdConfiguration.f10584f;
        if (!TextUtils.isEmpty(str)) {
            createInMobiBannerWrapper.setWatermarkData(new WatermarkData(str, 0.3f));
        }
        InMobiAdViewHolder createInMobiAdViewHolder = this.inMobiAdFactory.createInMobiAdViewHolder(context);
        this.inMobiAdViewHolder = createInMobiAdViewHolder;
        createInMobiAdViewHolder.setLayoutParams(new FrameLayout.LayoutParams(adSize.d(context), adSize.b(context)));
        createInMobiBannerWrapper.setLayoutParams(new LinearLayout.LayoutParams(adSize.d(context), adSize.b(context)));
        this.inMobiAdViewHolder.addView(createInMobiBannerWrapper);
        internalLoadAd(createInMobiBannerWrapper);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.inMobiAdViewHolder.getFrameLayout();
    }

    public abstract void internalLoadAd(InMobiBannerWrapper inMobiBannerWrapper);

    public void loadAd() {
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.mediationBannerAdConfiguration;
        final Context context = mediationBannerAdConfiguration.f10582d;
        final AdSize findClosestBannerSize = InMobiAdapterUtils.findClosestBannerSize(context, mediationBannerAdConfiguration.f10585g);
        if (findClosestBannerSize == null) {
            AdError createAdapterError = InMobiConstants.createAdapterError(102, String.format("The requested banner size: %s is not supported by InMobi SDK.", this.mediationBannerAdConfiguration.f10585g));
            createAdapterError.toString();
            this.mediationAdLoadCallback.onFailure(createAdapterError);
            return;
        }
        Bundle bundle = this.mediationBannerAdConfiguration.f10581b;
        String string = bundle.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
        final long placementId = InMobiAdapterUtils.getPlacementId(bundle);
        AdError validateInMobiAdLoadParams = InMobiAdapterUtils.validateInMobiAdLoadParams(string, placementId);
        if (validateInMobiAdLoadParams != null) {
            this.mediationAdLoadCallback.onFailure(validateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.renderers.InMobiBannerAd.1
                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeError(AdError adError) {
                    adError.toString();
                    InMobiBannerAd.this.mediationAdLoadCallback.onFailure(adError);
                }

                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeSuccess() {
                    InMobiBannerAd.this.createAndLoadBannerAd(context, placementId, findClosestBannerSize);
                }
            });
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiBanner inMobiBanner, Map map) {
        onAdClicked2(inMobiBanner, (Map<Object, Object>) map);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDismissed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDisplayed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onUserLeftApplication(InMobiBanner inMobiBanner) {
        this.mediationBannerAdCallback.onAdLeftApplication();
    }

    /* renamed from: onAdClicked  reason: avoid collision after fix types in other method */
    public void onAdClicked2(InMobiBanner inMobiBanner, Map<Object, Object> map) {
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError createSdkError = InMobiConstants.createSdkError(InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        createSdkError.toString();
        this.mediationAdLoadCallback.onFailure(createSdkError);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        this.mediationBannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }
}
