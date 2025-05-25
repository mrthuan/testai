package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbi extends zzaxm implements zzbk {
    public zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        zzdc(1, zza());
    }
}
