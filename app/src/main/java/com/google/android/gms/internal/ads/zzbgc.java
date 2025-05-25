package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbgc extends zzaxm implements zzbge {
    public zzbgc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zze(zzbfu zzbfuVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbfuVar);
        zzdc(1, zza);
    }
}
