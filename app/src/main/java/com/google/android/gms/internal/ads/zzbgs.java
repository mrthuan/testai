package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbgs extends zzaxm implements zzbgu {
    public zzbgs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final boolean zze(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(2, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
