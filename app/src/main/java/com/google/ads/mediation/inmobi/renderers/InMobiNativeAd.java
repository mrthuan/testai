package com.google.ads.mediation.inmobi.renderers;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiConstants;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNativeWrapper;
import com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbes;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;

/* loaded from: classes.dex */
public abstract class InMobiNativeAd extends NativeAdEventListener {
    public InMobiAdFactory inMobiAdFactory;
    public InMobiInitializer inMobiInitializer;
    private InMobiNativeWrapper inMobiNativeWrapper;
    public InMobiUnifiedNativeAdMapper inMobiUnifiedNativeAdMapper;
    protected final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback;
    public MediationNativeAdCallback mediationNativeAdCallback;
    protected final MediationNativeAdConfiguration mediationNativeAdConfiguration;

    public InMobiNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        this.mediationNativeAdConfiguration = mediationNativeAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadNativeAd(Context context, long j10) {
        InMobiNativeWrapper createInMobiNativeWrapper = this.inMobiAdFactory.createInMobiNativeWrapper(context, Long.valueOf(j10), this);
        this.inMobiNativeWrapper = createInMobiNativeWrapper;
        createInMobiNativeWrapper.setVideoEventListener(new VideoEventListener() { // from class: com.google.ads.mediation.inmobi.renderers.InMobiNativeAd.2
            @Override // com.inmobi.ads.listeners.VideoEventListener
            public void onVideoCompleted(InMobiNative inMobiNative) {
                super.onVideoCompleted(inMobiNative);
                String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
                MediationNativeAdCallback mediationNativeAdCallback = InMobiNativeAd.this.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.onVideoComplete();
                }
            }

            @Override // com.inmobi.ads.listeners.VideoEventListener
            public void onVideoSkipped(InMobiNative inMobiNative) {
                super.onVideoSkipped(inMobiNative);
                String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            }
        });
        InMobiAdapterUtils.setIsAgeRestricted();
        InMobiAdapterUtils.configureGlobalTargeting(this.mediationNativeAdConfiguration.c);
        internalLoadAd(this.inMobiNativeWrapper);
    }

    public abstract void internalLoadAd(InMobiNativeWrapper inMobiNativeWrapper);

    public void loadAd() {
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.mediationNativeAdConfiguration;
        final Context context = mediationNativeAdConfiguration.f10582d;
        Bundle bundle = mediationNativeAdConfiguration.f10581b;
        String string = bundle.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
        final long placementId = InMobiAdapterUtils.getPlacementId(bundle);
        AdError validateInMobiAdLoadParams = InMobiAdapterUtils.validateInMobiAdLoadParams(string, placementId);
        if (validateInMobiAdLoadParams != null) {
            this.mediationAdLoadCallback.onFailure(validateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.renderers.InMobiNativeAd.1
                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeError(AdError adError) {
                    adError.toString();
                    MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = InMobiNativeAd.this.mediationAdLoadCallback;
                    if (mediationAdLoadCallback != null) {
                        mediationAdLoadCallback.onFailure(adError);
                    }
                }

                @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
                public void onInitializeSuccess() {
                    InMobiNativeAd.this.createAndLoadNativeAd(context, placementId);
                }
            });
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdClicked(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(InMobiNative inMobiNative) {
        String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
        MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError createSdkError = InMobiConstants.createSdkError(InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        createSdkError.toString();
        this.mediationAdLoadCallback.onFailure(createSdkError);
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        NativeAdOptions zza = zzbes.zza(this.mediationNativeAdConfiguration.f10587g);
        InMobiUnifiedNativeAdMapper inMobiUnifiedNativeAdMapper = new InMobiUnifiedNativeAdMapper(this.inMobiAdFactory.createInMobiNativeWrapper(inMobiNative), Boolean.valueOf(zza != null ? zza.f10599a : false), this.mediationAdLoadCallback, this);
        this.inMobiUnifiedNativeAdMapper = inMobiUnifiedNativeAdMapper;
        inMobiUnifiedNativeAdMapper.mapUnifiedNativeAd(this.mediationNativeAdConfiguration.f10582d);
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenWillDisplay(InMobiNative inMobiNative) {
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdStatusChanged(InMobiNative inMobiNative) {
    }
}
