package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbju extends zzaxm implements zzbjw {
    public zzbju(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(1, zza);
    }
}
