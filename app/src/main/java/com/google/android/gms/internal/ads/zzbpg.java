package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbpg implements InitializationCompleteCallback {
    final /* synthetic */ zzbkz zza;

    public zzbpg(zzbpn zzbpnVar, zzbkz zzbkzVar) {
        this.zza = zzbkzVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }
}
