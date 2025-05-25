package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class InterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        if (context != null) {
            if (str != null) {
                if (adRequest != null) {
                    if (interstitialAdLoadCallback != null) {
                        Preconditions.e("#008 Must be called on the main UI thread.");
                        zzbbw.zza(context);
                        if (((Boolean) zzbdq.zzi.zze()).booleanValue()) {
                            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                                zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Context context2 = context;
                                        String str2 = str;
                                        AdRequest adRequest2 = adRequest;
                                        try {
                                            new zzblr(context2, str2).zza(adRequest2.f10013a, interstitialAdLoadCallback);
                                        } catch (IllegalStateException e10) {
                                            zzbtq.zza(context2).zzh(e10, "InterstitialAd.load");
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        new zzblr(context, str).zza(adRequest.f10013a, interstitialAdLoadCallback);
                        return;
                    }
                    throw new NullPointerException("LoadCallback cannot be null.");
                }
                throw new NullPointerException("AdRequest cannot be null.");
            }
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        throw new NullPointerException("Context cannot be null.");
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
