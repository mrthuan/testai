package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbla extends zzaxm implements zzblc {
    public zzbla(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzb(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzdc(1, zza);
    }
}
