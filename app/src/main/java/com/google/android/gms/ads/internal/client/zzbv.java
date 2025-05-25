package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbom;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbv extends zzaxm {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder K(ObjectWrapper objectWrapper, zzq zzqVar, String str, zzbom zzbomVar, int i10) {
        Parcel zza = zza();
        zzaxo.zzf(zza, objectWrapper);
        zzaxo.zzd(zza, zzqVar);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        zza.writeInt(i10);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        zzdb.recycle();
        return readStrongBinder;
    }
}
