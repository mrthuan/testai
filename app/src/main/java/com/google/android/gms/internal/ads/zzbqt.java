package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbqt implements MediationAdLoadCallback {
    final /* synthetic */ zzbqf zza;
    final /* synthetic */ zzbos zzb;

    public zzbqt(zzbqy zzbqyVar, zzbqf zzbqfVar, zzbos zzbosVar) {
        this.zza = zzbqfVar;
        this.zzb = zzbosVar;
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
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        if (nativeAdMapper == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return null;
            }
        }
        try {
            this.zza.zzg(new zzbpr(nativeAdMapper));
        } catch (RemoteException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        return new zzbqz(this.zzb);
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined", null));
    }
}
