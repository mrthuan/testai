package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbpd implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback {
    private final zzbos zza;

    public zzbpd(zzbos zzbosVar) {
        this.zza = zzbosVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(AdError adError) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdFailedToShow.");
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("Mediation ad failed to show: Error Code = ", adError.a(), ". Error Message = ");
        e10.append(adError.f10006b);
        e10.append(" Error Domain = ");
        e10.append(adError.c);
        com.google.android.gms.ads.internal.util.client.zzm.e(e10.toString());
        try {
            this.zza.zzk(adError.b());
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoPause() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onVideoPause.");
        try {
            this.zza.zzw();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoPlay() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onVideoPlay.");
        try {
            this.zza.zzx();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoUnmute() {
    }

    public final void onAdFailedToShow(String str) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzm.e("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }
}
