package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzcg extends zzaxm implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        zzdc(2, zza());
    }
}
