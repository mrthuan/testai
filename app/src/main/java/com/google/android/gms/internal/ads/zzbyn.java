package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyn extends zzaxm implements zzbyp {
    public zzbyn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final zzbym zze(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i10) {
        zzbym zzbykVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbykVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzbym) {
                zzbykVar = (zzbym) queryLocalInterface;
            } else {
                zzbykVar = new zzbyk(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbykVar;
    }
}
