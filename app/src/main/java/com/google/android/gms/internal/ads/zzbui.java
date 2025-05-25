package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbui extends zzaxm implements zzbuk {
    public zzbui(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zze(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbvbVar);
        zzaxo.zzf(zza, zzbuuVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzf(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbvbVar);
        zzaxo.zzf(zza, zzbuuVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzg(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbvbVar);
        zzaxo.zzf(zza, zzbuuVar);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzh(String str, zzbuu zzbuuVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxo.zzf(zza, zzbuuVar);
        zzdc(7, zza);
    }
}
