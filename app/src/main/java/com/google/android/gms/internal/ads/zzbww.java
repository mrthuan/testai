package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbww implements MediationRewardedAdCallback {
    private final zzbos zza;

    public zzbww(zzbos zzbosVar) {
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzt(new zzbwx(rewardItem));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.b("Adapter called onVideoStart.");
        try {
            this.zza.zzy();
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
