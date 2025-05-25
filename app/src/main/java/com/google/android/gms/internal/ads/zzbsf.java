package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbsf extends zzaxn implements zzbsg {
    public zzbsf() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbsg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof zzbsg) {
            return (zzbsg) queryLocalInterface;
        }
        return new zzbse(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zzaxo.zzc(parcel);
                zze((Intent) zzaxo.zza(parcel, Intent.CREATOR));
                break;
            case 2:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaxo.zzc(parcel);
                zzi(K, readString, readString2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzg(K2);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzf(createStringArray, createIntArray, K3);
                break;
            case 6:
                zzaxo.zzc(parcel);
                zzj(IObjectWrapper.Stub.K(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.offline.buffering.zza) zzaxo.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
