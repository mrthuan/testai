package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbpl implements MediationAdLoadCallback {
    final /* synthetic */ zzbos zza;
    final /* synthetic */ zzbpn zzb;

    public zzbpl(zzbpn zzbpnVar, zzbos zzbosVar) {
        this.zza = zzbosVar;
        this.zzb = zzbpnVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.zzb.zza;
            String canonicalName = obj.getClass().getCanonicalName();
            int a10 = adError.a();
            String str = adError.f10006b;
            String str2 = adError.c;
            com.google.android.gms.ads.internal.util.client.zzm.b(canonicalName + "failed to load mediation ad: ErrorCode = " + a10 + ". ErrorMessage = " + str + ". ErrorDomain = " + str2);
            this.zza.zzh(adError.b());
            this.zza.zzi(adError.a(), str);
            this.zza.zzg(adError.a());
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        try {
            this.zzb.zzi = (MediationRewardedAd) obj;
            this.zza.zzo();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        return new zzbww(this.zza);
    }

    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzb.zza;
            String canonicalName = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.b(canonicalName + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }
}
