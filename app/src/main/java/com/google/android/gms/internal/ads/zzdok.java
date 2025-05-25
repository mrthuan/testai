package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdok extends VideoController.VideoLifecycleCallbacks {
    private final zzdjb zza;

    public zzdok(zzdjb zzdjbVar) {
        this.zza = zzdjbVar;
    }

    private static com.google.android.gms.ads.internal.client.zzdt zza(zzdjb zzdjbVar) {
        com.google.android.gms.ads.internal.client.zzdq zzj = zzdjbVar.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdt zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdt zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdt zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzi();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }
}
