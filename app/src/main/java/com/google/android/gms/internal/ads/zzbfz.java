package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbfz extends zzaxm implements zzbgb {
    public zzbfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zze(zzbfs zzbfsVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbfsVar);
        zzdc(1, zza);
    }
}
