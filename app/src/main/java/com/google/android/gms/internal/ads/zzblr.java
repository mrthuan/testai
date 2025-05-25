package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzblr extends AdManagerInterstitialAd {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzp zzb;
    private final com.google.android.gms.ads.internal.client.zzbu zzc;
    private final String zzd;
    private final zzboi zze;
    private final long zzf;
    private AppEventListener zzg;
    private FullScreenContentCallback zzh;
    private OnPaidEventListener zzi;

    public zzblr(Context context, String str) {
        zzboi zzboiVar = new zzboi();
        this.zze = zzboiVar;
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzp.f10237a;
        com.google.android.gms.ads.internal.client.zzaw zzawVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10109b;
        com.google.android.gms.ads.internal.client.zzq zzqVar = new com.google.android.gms.ads.internal.client.zzq();
        zzawVar.getClass();
        this.zzc = (com.google.android.gms.ads.internal.client.zzbu) new k7.i(zzawVar, context, zzqVar, str, zzboiVar).d(context, false);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        com.google.android.gms.ads.internal.client.zzbu zzbuVar;
        try {
            zzbuVar = this.zzc;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
        if (zzbuVar != null) {
            zzdnVar = zzbuVar.zzk();
            return new ResponseInfo(zzdnVar);
        }
        zzdnVar = null;
        return new ResponseInfo(zzdnVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        zzayk zzaykVar;
        try {
            this.zzg = appEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                if (appEventListener != null) {
                    zzaykVar = new zzayk(appEventListener);
                } else {
                    zzaykVar = null;
                }
                zzbuVar.zzG(zzaykVar);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzh = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzJ(new com.google.android.gms.ads.internal.client.zzbb(fullScreenContentCallback));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzL(z10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzi = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzP(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzW(new ObjectWrapper(activity));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdx zzdxVar, AdLoadCallback adLoadCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzdxVar.f10143k = this.zzf;
                com.google.android.gms.ads.internal.client.zzp zzpVar = this.zzb;
                Context context = this.zza;
                zzpVar.getClass();
                zzbuVar.zzy(com.google.android.gms.ads.internal.client.zzp.a(context, zzdxVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
