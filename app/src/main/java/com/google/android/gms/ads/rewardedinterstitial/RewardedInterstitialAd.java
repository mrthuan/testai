package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbxa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class RewardedInterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adRequest == null) {
            throw new NullPointerException("AdRequest cannot be null.");
        }
        if (rewardedInterstitialAdLoadCallback != null) {
            Preconditions.e("#008 Must be called on the main UI thread.");
            zzbbw.zza(context);
            if (((Boolean) zzbdq.zzk.zze()).booleanValue()) {
                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            String str2 = str;
                            AdRequest adRequest2 = adRequest;
                            try {
                                new zzbxa(context2, str2).zza(adRequest2.f10013a, rewardedInterstitialAdLoadCallback);
                            } catch (IllegalStateException e10) {
                                zzbtq.zza(context2).zzh(e10, "RewardedInterstitialAd.load");
                            }
                        }
                    });
                    return;
                }
            }
            new zzbxa(context, str).zza(adRequest.f10013a, rewardedInterstitialAdLoadCallback);
            return;
        }
        throw new NullPointerException("LoadCallback cannot be null.");
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adManagerAdRequest == null) {
            throw new NullPointerException("AdManagerAdRequest cannot be null.");
        }
        if (rewardedInterstitialAdLoadCallback != null) {
            Preconditions.e("#008 Must be called on the main UI thread.");
            zzbbw.zza(context);
            if (((Boolean) zzbdq.zzk.zze()).booleanValue()) {
                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            String str2 = str;
                            AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                            try {
                                new zzbxa(context2, str2).zza(adManagerAdRequest2.f10013a, rewardedInterstitialAdLoadCallback);
                            } catch (IllegalStateException e10) {
                                zzbtq.zza(context2).zzh(e10, "RewardedInterstitialAdManager.load");
                            }
                        }
                    });
                    return;
                }
            }
            new zzbxa(context, str).zza(adManagerAdRequest.f10013a, rewardedInterstitialAdLoadCallback);
            return;
        }
        throw new NullPointerException("LoadCallback cannot be null.");
    }
}
