package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbgv extends zzaxm implements zzbgx {
    public zzbgv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(1, zza);
    }
}
