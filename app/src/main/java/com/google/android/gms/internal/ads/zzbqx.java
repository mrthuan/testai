package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbqx implements MediationAdLoadCallback {
    final /* synthetic */ zzbqi zza;
    final /* synthetic */ zzbos zzb;
    final /* synthetic */ zzbqy zzc;

    public zzbqx(zzbqy zzbqyVar, zzbqi zzbqiVar, zzbos zzbosVar) {
        this.zza = zzbqiVar;
        this.zzb = zzbosVar;
        this.zzc = zzbqyVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.b());
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                this.zzc.zzc = mediationRewardedAd;
                this.zza.zzg();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
            return new zzbqz(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined", null));
    }
}
