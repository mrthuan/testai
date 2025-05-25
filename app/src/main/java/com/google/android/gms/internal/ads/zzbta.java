package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbta extends zzaxm implements zzbtc {
    public zzbta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzf(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzdc(1, zza);
    }
}
