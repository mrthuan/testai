package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwl extends zzaxm implements zzbwn {
    public zzbwl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zze(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzg() {
        zzdc(1, zza());
    }
}
