package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeau implements zzgcf {
    final /* synthetic */ zzbuu zza;
    final /* synthetic */ zzbvb zzb;

    public zzeau(zzeay zzeayVar, zzbuu zzbuuVar, zzbvb zzbvbVar) {
        this.zza = zzbuuVar;
        this.zzb = zzbvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzbb.d(th2));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue()) {
                this.zza.zzg(parcelFileDescriptor, this.zzb);
            } else {
                this.zza.zzf(parcelFileDescriptor);
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }
}
