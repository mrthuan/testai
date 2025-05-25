package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzg extends zza {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(com.google.android.gms.appset.zza zzaVar, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzaVar);
        zzc.zzc(zza, zzfVar);
        zzb(1, zza);
    }
}
