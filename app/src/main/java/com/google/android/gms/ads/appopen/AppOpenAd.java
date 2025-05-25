package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public @interface AppOpenAdOrientation {
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdRequest adRequest, @AppOpenAdOrientation final int i10, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adRequest != null) {
            Preconditions.e("#008 Must be called on the main UI thread.");
            zzbbw.zza(context);
            if (((Boolean) zzbdq.zzd.zze()).booleanValue()) {
                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            int i11 = i10;
                            String str2 = str;
                            AdRequest adRequest2 = adRequest;
                            try {
                                new zzazx(context2, str2, adRequest2.f10013a, i11, appOpenAdLoadCallback).zza();
                            } catch (IllegalStateException e10) {
                                zzbtq.zza(context2).zzh(e10, "AppOpenAd.load");
                            }
                        }
                    });
                    return;
                }
            }
            new zzazx(context, str, adRequest.f10013a, i10, appOpenAdLoadCallback).zza();
            return;
        }
        throw new NullPointerException("AdRequest cannot be null.");
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);

    public static void load(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adRequest != null) {
            Preconditions.e("#008 Must be called on the main UI thread.");
            zzbbw.zza(context);
            if (((Boolean) zzbdq.zzd.zze()).booleanValue()) {
                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            String str2 = str;
                            AdRequest adRequest2 = adRequest;
                            try {
                                new zzazx(context2, str2, adRequest2.f10013a, 3, appOpenAdLoadCallback).zza();
                            } catch (IllegalStateException e10) {
                                zzbtq.zza(context2).zzh(e10, "AppOpenAd.load");
                            }
                        }
                    });
                    return;
                }
            }
            new zzazx(context, str, adRequest.f10013a, 3, appOpenAdLoadCallback).zza();
            return;
        }
        throw new NullPointerException("AdRequest cannot be null.");
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i10, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adManagerAdRequest != null) {
            Preconditions.e("#008 Must be called on the main UI thread.");
            zzbbw.zza(context);
            if (((Boolean) zzbdq.zzd.zze()).booleanValue()) {
                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            int i11 = i10;
                            String str2 = str;
                            AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                            try {
                                new zzazx(context2, str2, adManagerAdRequest2.f10013a, i11, appOpenAdLoadCallback).zza();
                            } catch (IllegalStateException e10) {
                                zzbtq.zza(context2).zzh(e10, "AppOpenAdManager.load");
                            }
                        }
                    });
                    return;
                }
            }
            new zzazx(context, str, adManagerAdRequest.f10013a, i10, appOpenAdLoadCallback).zza();
            return;
        }
        throw new NullPointerException("AdManagerAdRequest cannot be null.");
    }
}
