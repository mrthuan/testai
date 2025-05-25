package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfsh extends zzaxm implements zzfsj {
    public zzfsh(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void zze(Bundle bundle, zzfsl zzfslVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        zzaxo.zzf(zza, zzfslVar);
        zzdd(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void zzf(String str, Bundle bundle, zzfsl zzfslVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxo.zzd(zza, bundle);
        zzaxo.zzf(zza, zzfslVar);
        zzdd(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void zzg(Bundle bundle, zzfsl zzfslVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, bundle);
        zzaxo.zzf(zza, zzfslVar);
        zzdd(3, zza);
    }
}
