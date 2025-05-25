package com.google.ads.mediation.inmobi.waterfall;

import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiNativeWrapper;
import com.google.ads.mediation.inmobi.renderers.InMobiNativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* loaded from: classes.dex */
public class InMobiWaterfallNativeAd extends InMobiNativeAd {
    public InMobiWaterfallNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void internalLoadAd(InMobiNativeWrapper inMobiNativeWrapper) {
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.mediationNativeAdConfiguration;
        InMobiExtras build = InMobiExtrasBuilder.build(mediationNativeAdConfiguration.f10582d, mediationNativeAdConfiguration.c, InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiNativeWrapper.setExtras(build.getParameterMap());
        inMobiNativeWrapper.setKeywords(build.getKeywords());
        inMobiNativeWrapper.load();
    }
}
