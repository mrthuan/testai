package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwh extends zzaxm implements zzbwj {
    public zzbwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zze() {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzf() {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzg() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzh(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzj() {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzk(zzbwd zzbwdVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbwdVar);
        zzdc(3, zza);
    }
}
