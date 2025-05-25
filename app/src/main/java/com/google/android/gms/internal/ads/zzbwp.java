package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import kotlinx.coroutines.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwp extends RewardedAd {
    private final String zza;
    private final zzbwg zzb;
    private final Context zzc;
    private final zzbwy zzd;
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;
    private final long zzh = System.currentTimeMillis();

    public zzbwp(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        com.google.android.gms.ads.internal.client.zzaw zzawVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10109b;
        zzboi zzboiVar = new zzboi();
        zzawVar.getClass();
        this.zzb = (zzbwg) new k7.m(context, str, zzboiVar).d(context, false);
        this.zzd = new zzbwy();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbwg zzbwgVar = this.zzb;
            if (zzbwgVar != null) {
                return zzbwgVar.zzb();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        zzbwg zzbwgVar;
        try {
            zzbwgVar = this.zzb;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
        if (zzbwgVar != null) {
            zzdnVar = zzbwgVar.zzc();
            return new ResponseInfo(zzdnVar);
        }
        zzdnVar = null;
        return new ResponseInfo(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        zzbwd zzbwdVar;
        y yVar = RewardItem.R0;
        try {
            zzbwg zzbwgVar = this.zzb;
            if (zzbwgVar != null) {
                zzbwdVar = zzbwgVar.zzd();
            } else {
                zzbwdVar = null;
            }
            if (zzbwdVar != null) {
                return new zzbwq(zzbwdVar);
            }
            return yVar;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
            return yVar;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z10) {
        try {
            zzbwg zzbwgVar = this.zzb;
            if (zzbwgVar != null) {
                zzbwgVar.zzh(z10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbwg zzbwgVar = this.zzb;
            if (zzbwgVar != null) {
                zzbwgVar.zzi(new com.google.android.gms.ads.internal.client.zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbwg zzbwgVar = this.zzb;
            if (zzbwgVar != null) {
                zzbwgVar.zzj(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbwg zzbwgVar = this.zzb;
                if (zzbwgVar != null) {
                    zzbwgVar.zzl(new zzbwu(serverSideVerificationOptions));
                }
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbwg zzbwgVar = this.zzb;
            if (zzbwgVar != null) {
                zzbwgVar.zzk(this.zzd);
                this.zzb.zzm(new ObjectWrapper(activity));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbwg zzbwgVar = this.zzb;
            if (zzbwgVar != null) {
                zzdxVar.f10143k = this.zzh;
                com.google.android.gms.ads.internal.client.zzp zzpVar = com.google.android.gms.ads.internal.client.zzp.f10237a;
                Context context = this.zzc;
                zzpVar.getClass();
                zzbwgVar.zzf(com.google.android.gms.ads.internal.client.zzp.a(context, zzdxVar), new zzbwt(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }
}
