package com.google.ads.mediation.inmobi.waterfall;

import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiInterstitialWrapper;
import com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* loaded from: classes.dex */
public class InMobiWaterfallRewardedAd extends InMobiRewardedAd {
    public InMobiWaterfallRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd
    public void internalLoadAd(InMobiInterstitialWrapper inMobiInterstitialWrapper) {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.mediationRewardedAdConfiguration;
        InMobiExtras build = InMobiExtrasBuilder.build(mediationRewardedAdConfiguration.f10582d, mediationRewardedAdConfiguration.c, InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiInterstitialWrapper.setExtras(build.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(build.getKeywords());
        inMobiInterstitialWrapper.load();
    }
}
