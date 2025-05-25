package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbpp implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzbos zza;
    private UnifiedNativeAdMapper zzb;
    private zzbfy zzc;

    public zzbpp(zzbos zzbosVar) {
        this.zza = zzbosVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdFailedToLoad with error. " + i10);
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzb;
        if (this.zzc == null) {
            if (unifiedNativeAdMapper == null) {
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onVideoEnd.");
        try {
            this.zza.zzv();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final UnifiedNativeAdMapper zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAppEvent.");
        try {
            this.zza.zzq(str, str2);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final zzbfy zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbfy zzbfyVar) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbfyVar.zzb())));
        this.zzc = zzbfyVar;
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter, zzbfy zzbfyVar, String str) {
        try {
            this.zza.zzr(zzbfyVar.zza(), str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("Adapter called onAdFailedToLoad with error. ErrorCode: ", adError.a(), ". ErrorMessage: ");
        e10.append(adError.f10006b);
        e10.append(". ErrorDomain: ");
        e10.append(adError.c);
        com.google.android.gms.ads.internal.util.client.zzm.b(e10.toString());
        try {
            this.zza.zzh(adError.b());
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e11);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzb;
        if (this.zzc == null) {
            if (unifiedNativeAdMapper == null) {
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdLoaded.");
        this.zzb = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.b(new zzbpc());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("Adapter called onAdFailedToLoad with error. ErrorCode: ", adError.a(), ". ErrorMessage: ");
        e10.append(adError.f10006b);
        e10.append(". ErrorDomain: ");
        e10.append(adError.c);
        com.google.android.gms.ads.internal.util.client.zzm.b(e10.toString());
        try {
            this.zza.zzh(adError.b());
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e11);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i10) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("Adapter called onAdFailedToLoad with error. ErrorCode: ", adError.a(), ". ErrorMessage: ");
        e10.append(adError.f10006b);
        e10.append(". ErrorDomain: ");
        e10.append(adError.c);
        com.google.android.gms.ads.internal.util.client.zzm.b(e10.toString());
        try {
            this.zza.zzh(adError.b());
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e11);
        }
    }
}
