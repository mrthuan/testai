package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbvx extends zzaxn implements zzbvy {
    public zzbvx() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbvy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzbvy) {
            return (zzbvy) queryLocalInterface;
        }
        return new zzbvw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzl(K);
                break;
            case 2:
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaxo.zzc(parcel);
                zzk(K2, readInt);
                break;
            case 3:
                IObjectWrapper K3 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzi(K3);
                break;
            case 4:
                IObjectWrapper K4 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzj(K4);
                break;
            case 5:
                IObjectWrapper K5 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzo(K5);
                break;
            case 6:
                IObjectWrapper K6 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzf(K6);
                break;
            case 7:
                zzaxo.zzc(parcel);
                zzm(IObjectWrapper.Stub.K(parcel.readStrongBinder()), (zzbvz) zzaxo.zza(parcel, zzbvz.CREATOR));
                break;
            case 8:
                IObjectWrapper K7 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zze(K7);
                break;
            case 9:
                IObjectWrapper K8 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzg(K8, readInt2);
                break;
            case 10:
                IObjectWrapper K9 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzh(K9);
                break;
            case 11:
                IObjectWrapper K10 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzn(K10);
                break;
            case 12:
                Bundle bundle = (Bundle) zzaxo.zza(parcel, Bundle.CREATOR);
                zzaxo.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
