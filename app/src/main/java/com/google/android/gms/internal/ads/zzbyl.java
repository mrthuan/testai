package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbyl extends zzaxn implements zzbym {
    public zzbyl() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbym zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof zzbym) {
            return (zzbym) queryLocalInterface;
        }
        return new zzbyk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbyj zzbyjVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbyq zzbyqVar = (zzbyq) zzaxo.zza(parcel, zzbyq.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof zzbyj) {
                        zzbyjVar = (zzbyj) queryLocalInterface;
                    } else {
                        zzbyjVar = new zzbyh(readStrongBinder);
                    }
                }
                zzaxo.zzc(parcel);
                zzf(K, zzbyqVar, zzbyjVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzk(K2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbtc zzb = zzbtb.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzm(createTypedArrayList, K3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper K4 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbtc zzb2 = zzbtb.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzl(createTypedArrayList2, K4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaxo.zzc(parcel);
                zzg((zzbtl) zzaxo.zza(parcel, zzbtl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper K5 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzj(K5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper K6 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbtc zzb3 = zzbtb.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzi(createTypedArrayList3, K6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper K7 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzbtc zzb4 = zzbtb.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzh(createTypedArrayList4, K7, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper K8 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                IObjectWrapper K9 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                String readString = parcel.readString();
                IObjectWrapper K10 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                IObjectWrapper zze = zze(K8, K9, readString, K10);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zze);
                return true;
            default:
                return false;
        }
    }
}
