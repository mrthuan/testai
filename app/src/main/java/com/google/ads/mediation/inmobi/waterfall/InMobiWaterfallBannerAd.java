package com.google.ads.mediation.inmobi.waterfall;

import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiBannerWrapper;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.renderers.InMobiBannerAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public class InMobiWaterfallBannerAd extends InMobiBannerAd {
    public InMobiWaterfallBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationBannerAdConfiguration, mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void internalLoadAd(InMobiBannerWrapper inMobiBannerWrapper) {
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.mediationBannerAdConfiguration;
        InMobiExtras build = InMobiExtrasBuilder.build(mediationBannerAdConfiguration.f10582d, mediationBannerAdConfiguration.c, InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiBannerWrapper.setExtras(build.getParameterMap());
        inMobiBannerWrapper.setKeywords(build.getKeywords());
        inMobiBannerWrapper.load();
    }
}
