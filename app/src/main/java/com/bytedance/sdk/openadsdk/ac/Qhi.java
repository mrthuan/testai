package com.bytedance.sdk.openadsdk.ac;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.Dww;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.apiImpl.CJ.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Tgh;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.kYc;
import java.lang.reflect.Method;

/* compiled from: ADNFactory.java */
/* loaded from: classes.dex */
public class Qhi implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: Qhi */
            public void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                }
                final AdSlot build = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi qhi = new com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(new hm("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!HzH.CJ().HzH() && js.tP()) {
                            qhi.onError(-18, "Blind mode does not allow requesting ads");
                        } else if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(qhi)) {
                        } else {
                            AdSlot adSlot = build;
                            if (adSlot == null) {
                                qhi.onError(-4, "adslot is null");
                                return;
                            }
                            adSlot.setNativeAdType(1);
                            build.setDurationSlotType(1);
                            Tgh.Qhi(HzH.Qhi()).Qhi(build, 1, qhi, 5000);
                        }
                    }
                }, qhi, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: Qhi */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot build = codeId.build();
                final com.bytedance.sdk.openadsdk.apiImpl.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.apiImpl.cJ.Qhi(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(new hm("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!HzH.CJ().HzH() && js.tP()) {
                            qhi.onError(-18, "Blind mode does not allow requesting ads");
                        } else if (!kYc.Qhi(kYc.Qhi, "load_interstitial_ad")) {
                            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                            if (pAGInterstitialAdLoadListener2 != null) {
                                pAGInterstitialAdLoadListener2.onError(-17, "Insufficient running memory");
                            }
                        } else if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(qhi)) {
                        } else {
                            if (build == null) {
                                qhi.onError(-4, "adslot is null");
                                return;
                            }
                            try {
                                Method Qhi = Dww.Qhi("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, PAGInterstitialAdLoadListener.class);
                                if (Qhi != null) {
                                    Qhi.invoke(null, HzH.Qhi(), build, qhi);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }, qhi, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: Qhi */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                String str2;
                if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.apiImpl.feed.Tgh tgh = new com.bytedance.sdk.openadsdk.apiImpl.feed.Tgh(pAGNativeAdLoadListener);
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (pAGNativeRequest != null) {
                    str2 = pAGNativeRequest.getAdString();
                } else {
                    str2 = null;
                }
                AdSlot.Builder withBid = codeId.withBid(str2);
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(withBid, pAGNativeRequest);
                final AdSlot build = withBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(new hm("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!HzH.CJ().HzH() && js.tP()) {
                            tgh.onError(-18, "Blind mode does not allow requesting ads");
                        } else if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(tgh)) {
                        } else {
                            if (build == null) {
                                tgh.onError(-4, "adslot is null");
                                return;
                            }
                            try {
                                Method Qhi = Dww.Qhi("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, PAGNativeAdLoadListener.class);
                                if (Qhi != null) {
                                    Qhi.invoke(null, HzH.Qhi(), build, tgh);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }, tgh, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.1
            private int cJ;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: Qhi */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot build = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.cJ = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.apiImpl.ac.Qhi qhi = new com.bytedance.sdk.openadsdk.apiImpl.ac.Qhi(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(new hm("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!HzH.CJ().HzH() && js.tP()) {
                                qhi.onError(-18, "Blind mode does not allow requesting ads");
                            } else if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(qhi)) {
                            } else {
                                if (build == null) {
                                    qhi.onError(-4, "adslot is null");
                                    return;
                                }
                                Method Qhi = Dww.Qhi("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, PAGAppOpenAdLoadListener.class, Integer.TYPE);
                                if (Qhi != null) {
                                    Qhi.invoke(null, HzH.Qhi(), build, qhi, Integer.valueOf(AnonymousClass1.this.cJ));
                                }
                            }
                        } catch (Throwable th2) {
                            ABk.Qhi("ADNFactory", "open component maybe not exist, please check", th2);
                        }
                    }
                }, qhi, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: Qhi */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(codeId, pAGRewardedRequest);
                final AdSlot build = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final fl flVar = new fl(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(new hm("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.ac.Qhi.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!HzH.CJ().HzH() && js.tP()) {
                            flVar.onError(-18, "Blind mode does not allow requesting ads");
                        } else if (!kYc.Qhi(kYc.Qhi, "load_reward_ad")) {
                            PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                            if (pAGRewardedAdLoadListener2 != null) {
                                pAGRewardedAdLoadListener2.onError(-17, "Insufficient running memory");
                            }
                        } else if (com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi(flVar)) {
                        } else {
                            if (build == null) {
                                flVar.onError(-4, "adslot is null");
                                return;
                            }
                            try {
                                Method Qhi = Dww.Qhi("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, PAGRewardedAdLoadListener.class);
                                if (Qhi != null) {
                                    Qhi.invoke(null, HzH.Qhi(), build, flVar);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }, flVar, build);
            }
        };
    }
}
