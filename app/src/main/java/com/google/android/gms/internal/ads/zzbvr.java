package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbvr extends zzaxm implements zzbvt {
    public zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zze(zzbvn zzbvnVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbvnVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf() {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzh() {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzi() {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzj() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzk() {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzl() {
        zzdc(3, zza());
    }
}
