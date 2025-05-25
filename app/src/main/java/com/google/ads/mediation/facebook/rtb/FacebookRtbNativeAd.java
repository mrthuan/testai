package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookRtbNativeAd extends UnifiedNativeAdMapper {
    private final MediationNativeAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> callback;
    private MediaView mediaView;
    private final MetaFactory metaFactory;
    private NativeAdBase nativeAdBase;
    private MediationNativeAdCallback nativeAdCallback;

    /* loaded from: classes.dex */
    public class FacebookAdapterNativeAdImage extends NativeAd.Image {
        private Drawable drawable;
        private Uri uri;

        public FacebookAdapterNativeAdImage() {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.uri;
        }

        public FacebookAdapterNativeAdImage(Uri uri) {
            this.uri = uri;
        }

        public FacebookAdapterNativeAdImage(Drawable drawable) {
            this.drawable = drawable;
        }
    }

    /* loaded from: classes.dex */
    public interface NativeAdMapperListener {
        void onMappingFailed(AdError adError);

        void onMappingSuccess();
    }

    public FacebookRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.callback = mediationAdLoadCallback;
        this.adConfiguration = mediationNativeAdConfiguration;
        this.metaFactory = metaFactory;
    }

    private boolean containsRequiredFieldsForUnifiedNativeAd(NativeAdBase nativeAdBase) {
        boolean z10;
        if (nativeAdBase.getAdHeadline() != null && nativeAdBase.getAdBodyText() != null && nativeAdBase.getAdIcon() != null && nativeAdBase.getAdCallToAction() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nativeAdBase instanceof NativeBannerAd) {
            return z10;
        }
        if (z10 && nativeAdBase.getAdCoverImage() != null && this.mediaView != null) {
            return true;
        }
        return false;
    }

    public void mapNativeAd(Context context, NativeAdMapperListener nativeAdMapperListener) {
        if (!containsRequiredFieldsForUnifiedNativeAd(this.nativeAdBase)) {
            nativeAdMapperListener.onMappingFailed(new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", "com.google.ads.mediation.facebook", null));
            return;
        }
        setHeadline(this.nativeAdBase.getAdHeadline());
        if (this.nativeAdBase.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new FacebookAdapterNativeAdImage(Uri.parse(this.nativeAdBase.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.nativeAdBase.getAdBodyText());
        if (this.nativeAdBase.getPreloadedIconViewDrawable() == null) {
            if (this.nativeAdBase.getAdIcon() == null) {
                setIcon(new FacebookAdapterNativeAdImage());
            } else {
                setIcon(new FacebookAdapterNativeAdImage(Uri.parse(this.nativeAdBase.getAdIcon().getUrl())));
            }
        } else {
            setIcon(new FacebookAdapterNativeAdImage(this.nativeAdBase.getPreloadedIconViewDrawable()));
        }
        setCallToAction(this.nativeAdBase.getAdCallToAction());
        setAdvertiser(this.nativeAdBase.getAdvertiserName());
        this.mediaView.setListener(new MediaViewListener() { // from class: com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.1
            @Override // com.facebook.ads.MediaViewListener
            public void onComplete(MediaView mediaView) {
                if (FacebookRtbNativeAd.this.nativeAdCallback != null) {
                    FacebookRtbNativeAd.this.nativeAdCallback.onVideoComplete();
                }
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onEnterFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onExitFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenBackground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenForeground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPause(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPlay(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onVolumeChange(MediaView mediaView, float f10) {
            }
        });
        setHasVideoContent(true);
        setMediaView(this.mediaView);
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, this.nativeAdBase.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.nativeAdBase.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.nativeAdBase, null));
        nativeAdMapperListener.onMappingSuccess();
    }

    public void render() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.adConfiguration.f10581b);
        if (TextUtils.isEmpty(placementID)) {
            this.callback.onFailure(new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook", null));
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        this.mediaView = this.metaFactory.createMediaView(this.adConfiguration.f10582d);
        try {
            MediationNativeAdConfiguration mediationNativeAdConfiguration = this.adConfiguration;
            this.nativeAdBase = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.f10582d, placementID, mediationNativeAdConfiguration.f10580a);
            if (!TextUtils.isEmpty(this.adConfiguration.f10584f)) {
                this.nativeAdBase.setExtraHints(new ExtraHints.Builder().mediationData(this.adConfiguration.f10584f).build());
            }
            NativeAdBase nativeAdBase = this.nativeAdBase;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new NativeListener(this.adConfiguration.f10582d, this.nativeAdBase)).withBid(this.adConfiguration.f10580a).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            this.callback.onFailure(new AdError(109, "Failed to create native ad from bid payload: " + e10.getMessage(), "com.google.ads.mediation.facebook", null));
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.nativeAdBase;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                String str = FacebookMediationAdapter.TAG;
            } else if (!(view2 instanceof ImageView)) {
                String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass());
                String str2 = FacebookMediationAdapter.TAG;
            } else {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            }
        } else if (nativeAdBase instanceof com.facebook.ads.NativeAd) {
            com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.mediaView, (ImageView) view2, arrayList);
                return;
            }
            String str3 = FacebookMediationAdapter.TAG;
            nativeAd.registerViewForInteraction(view, this.mediaView, arrayList);
        } else {
            String str4 = FacebookMediationAdapter.TAG;
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.nativeAdBase;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    /* loaded from: classes.dex */
    public class NativeListener implements AdListener, NativeAdListener {
        private final WeakReference<Context> context;
        private final NativeAdBase nativeAd;

        public NativeListener(Context context, NativeAdBase nativeAdBase) {
            this.nativeAd = nativeAdBase;
            this.context = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookRtbNativeAd.this.nativeAdCallback.reportAdClicked();
            FacebookRtbNativeAd.this.nativeAdCallback.onAdOpened();
            FacebookRtbNativeAd.this.nativeAdCallback.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.nativeAd) {
                FacebookRtbNativeAd.this.callback.onFailure(new AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook", null));
                return;
            }
            Context context = this.context.get();
            if (context == null) {
                FacebookRtbNativeAd.this.callback.onFailure(new AdError(107, "Context is null.", "com.google.ads.mediation.facebook", null));
                return;
            }
            FacebookRtbNativeAd.this.mapNativeAd(context, new NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeListener.1
                @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener
                public void onMappingFailed(AdError adError) {
                    String str = adError.f10006b;
                    FacebookRtbNativeAd.this.callback.onFailure(adError);
                }

                @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener
                public void onMappingSuccess() {
                    FacebookRtbNativeAd facebookRtbNativeAd = FacebookRtbNativeAd.this;
                    facebookRtbNativeAd.nativeAdCallback = (MediationNativeAdCallback) facebookRtbNativeAd.callback.onSuccess(FacebookRtbNativeAd.this);
                }
            });
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            String str = adError2.f10006b;
            FacebookRtbNativeAd.this.callback.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            String str = FacebookMediationAdapter.TAG;
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }
    }
}
