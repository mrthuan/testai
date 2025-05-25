package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyh extends zzaxm implements zzbyj {
    public zzbyh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzc(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, bundle);
        zzdc(3, zza);
    }
}
