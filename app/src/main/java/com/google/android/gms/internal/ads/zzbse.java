package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbse extends zzaxm implements zzbsg {
    public zzbse(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zze(Intent intent) {
        Parcel zza = zza();
        zzaxo.zzd(zza, intent);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzh() {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzaVar);
        zzdc(6, zza);
    }
}
