package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.widget.FrameLayout;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;

/* loaded from: classes.dex */
public class InMobiAdFactory {
    public InMobiAdViewHolder createInMobiAdViewHolder(Context context) {
        return new InMobiAdViewHolder(new FrameLayout(context));
    }

    public InMobiBannerWrapper createInMobiBannerWrapper(Context context, Long l10) {
        return new InMobiBannerWrapper(new InMobiBanner(context, l10.longValue()));
    }

    public InMobiInterstitialWrapper createInMobiInterstitialWrapper(Context context, Long l10, InterstitialAdEventListener interstitialAdEventListener) {
        return new InMobiInterstitialWrapper(new InMobiInterstitial(context, l10.longValue(), interstitialAdEventListener));
    }

    public InMobiNativeWrapper createInMobiNativeWrapper(Context context, Long l10, NativeAdEventListener nativeAdEventListener) {
        return new InMobiNativeWrapper(new InMobiNative(context, l10.longValue(), nativeAdEventListener));
    }

    public InMobiNativeWrapper createInMobiNativeWrapper(InMobiNative inMobiNative) {
        return new InMobiNativeWrapper(inMobiNative);
    }
}
