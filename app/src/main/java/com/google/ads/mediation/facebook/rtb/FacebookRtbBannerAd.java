package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public class FacebookRtbBannerAd implements MediationBannerAd, AdListener {
    private final MediationBannerAdConfiguration adConfiguration;
    private AdView adView;
    private MediationBannerAdCallback bannerAdCallback;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> callback;
    private final MetaFactory metaFactory;
    private FrameLayout wrappedAdView;

    public FacebookRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.callback = mediationAdLoadCallback;
        this.metaFactory = metaFactory;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.wrappedAdView;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.bannerAdCallback.onAdOpened();
            this.bannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.bannerAdCallback = this.callback.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        String str = adError2.f10006b;
        this.callback.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public void render() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.adConfiguration.f10581b);
        if (TextUtils.isEmpty(placementID)) {
            this.callback.onFailure(new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook", null));
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        try {
            MetaFactory metaFactory = this.metaFactory;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = this.adConfiguration;
            this.adView = metaFactory.createMetaAdView(mediationBannerAdConfiguration.f10582d, placementID, mediationBannerAdConfiguration.f10580a);
            if (!TextUtils.isEmpty(this.adConfiguration.f10584f)) {
                this.adView.setExtraHints(new ExtraHints.Builder().mediationData(this.adConfiguration.f10584f).build());
            }
            Context context = this.adConfiguration.f10582d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.adConfiguration.f10585g.d(context), -2);
            this.wrappedAdView = new FrameLayout(context);
            this.adView.setLayoutParams(layoutParams);
            this.wrappedAdView.addView(this.adView);
            AdView adView = this.adView;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(this.adConfiguration.f10580a).build());
        } catch (Exception e10) {
            this.callback.onFailure(new com.google.android.gms.ads.AdError(111, "Failed to create banner ad: " + e10.getMessage(), "com.google.ads.mediation.facebook", null));
        }
    }
}
