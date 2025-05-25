package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbun extends zzaxn implements zzbuo {
    public zzbun() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbur zzburVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                zzbug zzbugVar = (zzbug) zzaxo.zza(parcel, zzbug.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface instanceof zzbur) {
                        zzburVar = (zzbur) queryLocalInterface;
                    } else {
                        zzburVar = new zzbup(readStrongBinder);
                    }
                }
                zzaxo.zzc(parcel);
                zze(zzbugVar, zzburVar);
            } else {
                zzbuc zzbucVar = (zzbuc) zzaxo.zza(parcel, zzbuc.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface2 instanceof zzbur) {
                        zzbur zzburVar2 = (zzbur) queryLocalInterface2;
                    }
                }
                zzaxo.zzc(parcel);
            }
        } else {
            zzbuc zzbucVar2 = (zzbuc) zzaxo.zza(parcel, zzbuc.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface3 instanceof zzbur) {
                    zzburVar = (zzbur) queryLocalInterface3;
                } else {
                    zzburVar = new zzbup(readStrongBinder3);
                }
            }
            zzaxo.zzc(parcel);
            zzf(zzbucVar2, zzburVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
