package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbum extends zzaxm implements zzbuo {
    public zzbum(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zze(zzbug zzbugVar, zzbur zzburVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbugVar);
        zzaxo.zzf(zza, zzburVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzf(zzbuc zzbucVar, zzbur zzburVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbucVar);
        zzaxo.zzf(zza, zzburVar);
        zzdc(1, zza);
    }
}
