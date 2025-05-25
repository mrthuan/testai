package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfpt extends zzaxm {
    public zzfpt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfpr zze(zzfpp zzfppVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzfppVar);
        Parcel zzdb = zzdb(1, zza);
        zzfpr zzfprVar = (zzfpr) zzaxo.zza(zzdb, zzfpr.CREATOR);
        zzdb.recycle();
        return zzfprVar;
    }

    public final zzfqa zzf(zzfpy zzfpyVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzfpyVar);
        Parcel zzdb = zzdb(3, zza);
        zzfqa zzfqaVar = (zzfqa) zzaxo.zza(zzdb, zzfqa.CREATOR);
        zzdb.recycle();
        return zzfqaVar;
    }

    public final void zzg(zzfpm zzfpmVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzfpmVar);
        zzdc(2, zza);
    }
}
