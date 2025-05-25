package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbfg extends zzaxn implements zzbfh {
    public zzbfg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbfh zzdA(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (queryLocalInterface instanceof zzbfh) {
            return (zzbfh) queryLocalInterface;
        }
        return new zzbff(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbfa zzbeyVar;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzdv(readString, K);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaxo.zzc(parcel);
                IObjectWrapper zzb = zzb(readString2);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzdz(K2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                parcel.readInt();
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzdw(K3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper K4 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzd(K4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbeyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (queryLocalInterface instanceof zzbfa) {
                        zzbeyVar = (zzbfa) queryLocalInterface;
                    } else {
                        zzbeyVar = new zzbey(readStrongBinder);
                    }
                }
                zzaxo.zzc(parcel);
                zzdx(zzbeyVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper K5 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzdy(K5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
