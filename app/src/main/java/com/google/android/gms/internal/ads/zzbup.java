package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbup extends zzaxm implements zzbur {
    public zzbup(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbbVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel zza = zza();
        zzaxo.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }
}
