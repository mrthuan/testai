package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        if (context != null) {
            if (str != null) {
                if (adManagerAdRequest != null) {
                    if (adManagerInterstitialAdLoadCallback != null) {
                        Preconditions.e("#008 Must be called on the main UI thread.");
                        zzbbw.zza(context);
                        if (((Boolean) zzbdq.zzi.zze()).booleanValue()) {
                            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Context context2 = context;
                                        String str2 = str;
                                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                                        try {
                                            new zzblr(context2, str2).zza(adManagerAdRequest2.f10013a, adManagerInterstitialAdLoadCallback);
                                        } catch (IllegalStateException e10) {
                                            zzbtq.zza(context2).zzh(e10, "AdManagerInterstitialAd.load");
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        new zzblr(context, str).zza(adManagerAdRequest.f10013a, adManagerInterstitialAdLoadCallback);
                        return;
                    }
                    throw new NullPointerException("LoadCallback cannot be null.");
                }
                throw new NullPointerException("AdManagerAdRequest cannot be null.");
            }
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        throw new NullPointerException("Context cannot be null.");
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
