package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbkx extends zzaxm implements zzbkz {
    public zzbkx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zzf() {
        zzdc(2, zza());
    }
}
