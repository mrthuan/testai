package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazu extends zzaxm implements zzazw {
    public zzazu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final void zzb() {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final void zzc() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final void zze() {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final void zzf() {
        zzdc(1, zza());
    }
}
