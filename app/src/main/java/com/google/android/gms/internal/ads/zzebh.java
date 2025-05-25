package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzebh implements zzgcf {
    final /* synthetic */ zzbur zza;

    public zzebh(zzebi zzebiVar, zzbur zzburVar) {
        this.zza = zzburVar;
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
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }
}
