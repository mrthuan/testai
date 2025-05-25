package com.google.ads.mediation.pangle.renderer;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PangleNativeAd extends UnifiedNativeAdMapper {
    static final String ASSET_ID_ADCHOICES_TEXT_VIEW = "3012";
    static final double PANGLE_SDK_IMAGE_SCALE = 1.0d;
    private final MediationNativeAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> adLoadCallback;
    private MediationNativeAdCallback callback;
    private PAGNativeAd pagNativeAd;
    private final PangleFactory pangleFactory;
    private final PangleInitializer pangleInitializer;
    private final PanglePrivacyConfig panglePrivacyConfig;
    private final PangleSdkWrapper pangleSdkWrapper;

    /* loaded from: classes.dex */
    public class PangleNativeMappedImage extends NativeAd.Image {
        private final Drawable drawable;
        private final Uri imageUri;
        private final double scale;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.scale;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.imageUri;
        }

        private PangleNativeMappedImage(Drawable drawable, Uri uri, double d10) {
            this.drawable = drawable;
            this.imageUri = uri;
            this.scale = d10;
        }
    }

    public PangleNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory, PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationNativeAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.pangleInitializer = pangleInitializer;
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
        this.panglePrivacyConfig = panglePrivacyConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mapNativeAd(PAGNativeAd pAGNativeAd) {
        this.pagNativeAd = pAGNativeAd;
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        setHeadline(nativeAdData.getTitle());
        setBody(nativeAdData.getDescription());
        setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            setIcon(new PangleNativeMappedImage(null, Uri.parse(nativeAdData.getIcon().getImageUrl()), 1.0d));
        }
        setOverrideClickHandling(true);
        setMediaView(nativeAdData.getMediaView());
        setAdChoicesContent(nativeAdData.getAdLogoView());
    }

    public void render() {
        this.panglePrivacyConfig.setCoppa(this.adConfiguration.f10583e);
        Bundle bundle = this.adConfiguration.f10581b;
        final String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError createAdapterError = PangleConstants.createAdapterError(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            createAdapterError.toString();
            this.adLoadCallback.onFailure(createAdapterError);
            return;
        }
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.adConfiguration;
        final String str = mediationNativeAdConfiguration.f10580a;
        this.pangleInitializer.initialize(mediationNativeAdConfiguration.f10582d, bundle.getString(PangleConstants.APP_ID), new PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.1
            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeError(AdError adError) {
                adError.toString();
                PangleNativeAd.this.adLoadCallback.onFailure(adError);
            }

            @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
            public void onInitializeSuccess() {
                PAGNativeRequest createPagNativeRequest = PangleNativeAd.this.pangleFactory.createPagNativeRequest();
                createPagNativeRequest.setAdString(str);
                PangleRequestHelper.setWatermarkString(createPagNativeRequest, str, PangleNativeAd.this.adConfiguration);
                PangleNativeAd.this.pangleSdkWrapper.loadNativeAd(string, createPagNativeRequest, new PAGNativeAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.1.1
                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
                    public void onError(int i10, String str2) {
                        AdError createSdkError = PangleConstants.createSdkError(i10, str2);
                        createSdkError.toString();
                        PangleNativeAd.this.adLoadCallback.onFailure(createSdkError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                    public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                        PangleNativeAd.this.mapNativeAd(pAGNativeAd);
                        PangleNativeAd pangleNativeAd = PangleNativeAd.this;
                        pangleNativeAd.callback = (MediationNativeAdCallback) pangleNativeAd.adLoadCallback.onSuccess(PangleNativeAd.this);
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("3011");
        hashMap.remove(ASSET_ID_ADCHOICES_TEXT_VIEW);
        View view2 = (View) hashMap.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.pagNativeAd.registerViewForInteraction((ViewGroup) view, new ArrayList(hashMap.values()), arrayList, (View) null, new PAGNativeAdInteractionListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                if (PangleNativeAd.this.callback != null) {
                    PangleNativeAd.this.callback.reportAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                if (PangleNativeAd.this.callback != null) {
                    PangleNativeAd.this.callback.reportAdImpression();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
            }
        });
        getAdChoicesContent().setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                PangleNativeAd.this.pagNativeAd.showPrivacyActivity();
            }
        });
    }
}
