package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbvo extends zzaxm {
    public zzbvo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvn zzbvnVar, String str, String str2) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbvnVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(2, zza);
    }
}
